# Increase Kotlin API Library

The Increase Kotlin SDK provides convenient access to the Increase REST API from applications written in Kotlin. It includes helper classes with helpful types and documentation for every request and response property.

This package is currently in beta (pre-v1.0.0). We expect some breaking changes to rarely-used areas of the SDK, and appreciate your [feedback](https://www.github.com/increase/increase-kotlin/issues).

The Increase Kotlin SDK is similar to the Increase Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

## Documentation

The API documentation can be found [here](https://increase.com/documentation).

---

## Getting started

### Install dependencies

#### Gradle

<!-- x-release-please-start-version -->

```kotlin
implementation("com.increase.api:increase-kotlin:0.5.0")
```

#### Maven

```xml
<dependency>
    <groupId>com.increase.api</groupId>
    <artifactId>increase-kotlin</artifactId>
    <version>0.5.0</version>
</dependency>
```

<!-- x-release-please-end -->

### Configure the client

Use `IncreaseOkHttpClient.builder()` to configure the client. At a minimum you need to set `.apiKey()`:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client = IncreaseOkHttpClient.builder()
    .apiKey("<your API Key>")
    .build()
```

Alternately, set the environment variable `INCREASE_API_KEY` and use `IncreaseOkHttpClient.fromEnv()`:

```kotlin
val client = IncreaseOkHttpClient.fromEnv()
```

Read the documentation for more configuration options.

---

### Example: creating a resource

To create a new account, first use the `AccountCreateParams` builder to specify attributes,
then pass that to the `create` method of the `accounts` service.

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

val params = AccountCreateParams.builder()
    .name("My First Increase Account")
    .build()
val account = client.accounts().create(params)
```

### Example: listing resources

The Increase API provides a `list` method to get a paginated list of accounts.
You can retrieve the first page by:

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.Page

val page = client.accounts().list()
for (account: Account in page.data()) {
    print(account)
}
```

See [Pagination](#pagination) below for more information on transparently working with lists of objects without worrying about fetching each page.

---

## Requests

### Parameters and bodies

To make a request to the Increase API, you generally build an instance of the appropriate `Params` class.

In [Example: creating a resource](#example-creating-a-resource) above, we used the `AccountCreateParams.builder()` to pass to
the `create` method of the `accounts` service.

Sometimes, the API may support other properties that are not yet supported in the Kotlin SDK types. In that case,
you can attach them using the `putAdditionalProperty` method.

```kotlin
val params = AccountCreateParams.builder()
    // ... normal properties
    .putAdditionalProperty("secret_param", "4242")
    .build()
```

## Responses

### Response validation

When receiving a response, the Increase Kotlin SDK will deserialize it into instances of the typed model classes. In rare cases, the API may return a response property that doesn't match the expected Kotlin type. If you directly access the mistaken property, the SDK will throw an unchecked `IncreaseInvalidDataException` at runtime. If you would prefer to check in advance that that response is completely well-typed, call `.validate()` on the returned model.

```kotlin
val account = client.accounts().create().validate()
```

### Response properties as JSON

In rare cases, you may want to access the underlying JSON value for a response property rather than using the typed version provided by
this SDK. Each model property has a corresponding JSON version, with an underscore before the method name, which returns a `JsonField` value.

```kotlin
val field = responseObj._field

if (field.isMissing()) {
  // Value was not specified in the JSON response
} else if (field.isNull()) {
  // Value was provided as a literal null
} else {
  // See if value was provided as a string
  val jsonString: String? = field.asString();

  // If the value given by the API did not match the shape that the SDK expects
  // you can deserialise into a custom type
  val myObj = responseObj._field.asUnknown()?.convert(MyClass.class)
}
```

### Additional model properties

Sometimes, the server response may include additional properties that are not yet available in this library's types. You can access them using the model's `_additionalProperties` method:

```kotlin
val secret = account._additionalProperties().get("secret_field")
```

---

## Pagination

For methods that return a paginated list of results, this library provides convenient ways access
the results either one page at a time, or item-by-item across all pages.

### Auto-pagination

To iterate through all results across all pages, you can use `autoPager`,
which automatically handles fetching more pages for you:

### Synchronous

```kotlin
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

If none of the above helpers meet your needs, you can also manually request pages one-by-one.
A page of results has a `data()` method to fetch the list of objects, as well as top-level
`response` and other methods to fetch top-level data about the page. It also has methods
`hasNextPage`, `getNextPage`, and `getNextPageParams` methods to help with pagination.

```kotlin
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

Requests that experience certain errors are automatically retried 2 times by default, with a short exponential backoff. Connection errors (for example, due to a network connectivity problem), 409 Conflict, 429 Rate Limit, and >=500 Internal errors will all be retried by default.
You can provide a `maxRetries` on the client builder to configure this:

```kotlin
val client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 60 seconds by default. You can configure this on the client builder:

```kotlin
val client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .timeout(Duration.ofSeconds(30))
    .build()
```

### Proxies

Requests can be routed through a proxy. You can configure this on the client builder:

```kotlin
val client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .proxy(new Proxy(
        Type.HTTP,
        new InetSocketAddress("proxy.com", 8080)
    ))
    .build()
```

### Environments

Requests are made to the production environment by default. You can connect to other environments, like `sandbox`, via the client builder:

```kotlin
val client = IncreaseOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build()
```
