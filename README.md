# Increase Kotlin API Library

The Increase Kotlin SDK provides convenient access to the Increase REST API from applications written in Kotlin. It includes helper classes with helpful types and documentation for every request and response property.

The Increase Kotlin SDK is similar to the Increase Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

## Documentation

The REST API documentation can be found on [increase.com](https://increase.com/documentation).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.increase.api:increase-kotlin:0.156.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.increase.api</groupId>
    <artifactId>increase-kotlin</artifactId>
    <version>0.156.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `IncreaseOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Alternately, set the environment with `INCREASE_API_KEY` or `INCREASE_WEBHOOK_SECRET`, and use `IncreaseOkHttpClient.fromEnv()` to read from the environment.

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.fromEnv()

// Note: you can also call fromEnv() from the client builder, for example if you need to set additional properties
val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    // ... set properties on the builder
    .build()
```

| Property      | Environment variable      | Required | Default value |
| ------------- | ------------------------- | -------- | ------------- |
| apiKey        | `INCREASE_API_KEY`        | true     | —             |
| webhookSecret | `INCREASE_WEBHOOK_SECRET` | false    | —             |

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new account, first use the `AccountCreateParams` builder to specify attributes, then pass that to the `create` method of the `accounts` service.

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

val params: AccountCreateParams = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build()
val account: Account = client.accounts().create(params)
```

### Example: listing resources

The Increase API provides a `list` method to get a paginated list of accounts. You can retrieve the first page by:

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountListPage

val page: AccountListPage = client.accounts().list()
for (account: Account in page.data()) {
    print(account)
}
```

Use the `AccountListParams` builder to set parameters:

```kotlin
import com.increase.api.models.AccountListPage
import com.increase.api.models.AccountListParams
import java.time.OffsetDateTime

val params: AccountListParams = AccountListParams.builder()
    .createdAt(AccountListParams.CreatedAt.builder()
        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        .build())
    .cursor("cursor")
    .entityId("entity_id")
    .idempotencyKey("x")
    .informationalEntityId("informational_entity_id")
    .limit(1L)
    .programId("program_id")
    .status(AccountListParams.Status.CLOSED)
    .build()
val page1: AccountListPage = client.accounts().list(params)

// Using the `from` method of the builder you can reuse previous params values:
val page2: AccountListPage = client.accounts().list(AccountListParams.builder()
    .from(params)
    .nextCursor("abc123...")
    .build())

// Or easily get params for the next page by using the helper `getNextPageParams`:
val page3: AccountListPage = client.accounts().list(params.getNextPageParams(page2))
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Increase API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `AccountCreateParams.builder()` to pass to the `create` method of the `accounts` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case, you can attach them using the `putAdditionalProperty` method.

```kotlin
import com.increase.api.core.JsonValue
import com.increase.api.models.AccountCreateParams

val params: AccountCreateParams = AccountCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", JsonValue.from("4242"))
    .build()
```

## Responses

### Response validation

When receiving a response, the Increase Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `IncreaseInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
import com.increase.api.models.Account

val account: Account = client.accounts().create().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
import com.increase.api.core.JsonField
import java.util.Optional

val field: JsonField = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj: MyClass = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
import com.increase.api.core.JsonValue

val secret: JsonValue = account._additionalProperties().get("secret_field")
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`, which automatically handles fetching more pages for you:

### Synchronous

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountListPage

// As a Sequence:
client.accounts().list(params).autoPager()
    .take(50)
    .forEach { account -> print(account) }
```

### Asynchronous

```kotlin
// As a Flow:
asyncClient.accounts().list(params).autoPager()
    .take(50)
    .collect { account -> print(account) }
```

### Manual pagination

If none of the above helpers meet your needs, you can also manually request pages one-by-one. A page of results has a `data()` method to fetch the list of objects, as well as top-level `response` and other methods to fetch top-level data about the page. It also has methods `hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountListPage

val page = client.accounts().list(params)
while (page != null) {
    for (account in page.data) {
        print(account)
    }

    page = page.getNextPage()
}
```

---

## Error handling

This library throws exceptions in a single hierarchy for easy handling:

- **`IncreaseException`** - Base exception for all exceptions

- **`IncreaseServiceException`** - HTTP errors with a well-formed response body we were able to parse. The exception message and the `.debuggingRequestId()` will be set by the server.

  | 400    | BadRequestException           |
  | ------ | ----------------------------- |
  | 401    | AuthenticationException       |
  | 403    | PermissionDeniedException     |
  | 404    | NotFoundException             |
  | 422    | UnprocessableEntityException  |
  | 429    | RateLimitException            |
  | 5xx    | InternalServerException       |
  | others | UnexpectedStatusCodeException |

- **`IncreaseIoException`** - I/O networking errors
- **`IncreaseInvalidDataException`** - any other exceptions on the client side, e.g.:
  - We failed to serialize the request body
  - We failed to parse the response body (has access to response code and body)

## Network options

### Retries

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 408 Request Timeout, 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default. You can provide a `maxRetries` on the client builder to configure this:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default. You can configure this on the client builder:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import java.time.Duration

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(Proxy.Type.HTTP, InetSocketAddress("example.com", 8080)))
    .build()
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build()
```

## Logging

We use the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

You can enable logging by setting the environment variable `INCREASE_LOG` to `info`.

```sh
$ export INCREASE_LOG=info
```

Or to `debug` for more verbose logging.

```sh
$ export INCREASE_LOG=debug
```

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Increase/increase-kotlin/issues) with questions, bugs, or suggestions.

## Requirements

This library requires Java 8 or later.
