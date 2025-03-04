# Increase Kotlin API Library

<!-- x-release-please-start-version -->

[![Maven Central](https://img.shields.io/maven-central/v/com.increase.api/increase-kotlin)](https://central.sonatype.com/artifact/com.increase.api/increase-kotlin/0.188.0)

<!-- x-release-please-end -->

The Increase Kotlin SDK provides convenient access to the Increase REST API from applications written in Kotlin.

The Increase Kotlin SDK is similar to the Increase Java SDK but with minor differences that make it more ergonomic for use in Kotlin, such as nullable values instead of `Optional`, `Sequence` instead of `Stream`, and suspend functions instead of `CompletableFuture`.

The REST API documentation can be found on [increase.com](https://increase.com/documentation).

## Installation

<!-- x-release-please-start-version -->

### Gradle

```kotlin
implementation("com.increase.api:increase-kotlin:0.188.0")
```

### Maven

```xml
<dependency>
    <groupId>com.increase.api</groupId>
    <artifactId>increase-kotlin</artifactId>
    <version>0.188.0</version>
</dependency>
```

<!-- x-release-please-end -->

## Requirements

This library requires Java 8 or later.

## Usage

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
val client: IncreaseClient = IncreaseOkHttpClient.fromEnv()

val params: AccountCreateParams = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build()
val account: Account = client.accounts().create(params)
```

## Client configuration

Configure the client using environment variables:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
val client: IncreaseClient = IncreaseOkHttpClient.fromEnv()
```

Or manually:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .apiKey("My API Key")
    .build()
```

Or using a combination of the two approaches:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    // Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
    .fromEnv()
    .apiKey("My API Key")
    .build()
```

See this table for the available options:

| Setter          | Environment variable      | Required | Default value |
| --------------- | ------------------------- | -------- | ------------- |
| `apiKey`        | `INCREASE_API_KEY`        | true     | -             |
| `webhookSecret` | `INCREASE_WEBHOOK_SECRET` | false    | -             |

> [!TIP]
> Don't create more than one client in the same application. Each client has a connection pool and
> thread pools, which are more efficient to share between requests.

## Requests and responses

To send a request to the Increase API, build an instance of some `Params` class and pass it to the corresponding client method. When the response is received, it will be deserialized into an instance of a Kotlin class.

For example, `client.accounts().create(...)` should be called with an instance of `AccountCreateParams`, and it will return an instance of `Account`.

## Immutability

Each class in the SDK has an associated [builder](https://blogs.oracle.com/javamagazine/post/exploring-joshua-blochs-builder-design-pattern-in-java) or factory method for constructing it.

Each class is [immutable](https://docs.oracle.com/javase/tutorial/essential/concurrency/immutable.html) once constructed. If the class has an associated builder, then it has a `toBuilder()` method, which can be used to convert it back to a builder for making a modified copy.

Because each class is immutable, builder modification will _never_ affect already built class instances.

## Asynchronous execution

The default client is synchronous. To switch to asynchronous execution, call the `async()` method:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
val client: IncreaseClient = IncreaseOkHttpClient.fromEnv()

val params: AccountCreateParams = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build()
val account: Account = client.async().accounts().create(params)
```

Or create an asynchronous client from the beginning:

```kotlin
import com.increase.api.client.IncreaseClientAsync
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

// Configures using the `INCREASE_API_KEY` and `INCREASE_WEBHOOK_SECRET` environment variables
val client: IncreaseClientAsync = IncreaseOkHttpClientAsync.fromEnv()

val params: AccountCreateParams = AccountCreateParams.builder()
    .name("New Account!")
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build()
val account: Account = client.accounts().create(params)
```

The asynchronous client supports the same options as the synchronous one, except most methods are [suspending](https://kotlinlang.org/docs/coroutines-guide.html).

## Error handling

The SDK throws custom unchecked exception types:

- [`IncreaseServiceException`](increase-kotlin-core/src/main/kotlin/com/increase/api/errors/IncreaseServiceException.kt): Base class for HTTP errors. See this table for which exception subclass is thrown for each HTTP status code:

  | Status | Exception                       |
  | ------ | ------------------------------- |
  | 400    | `BadRequestException`           |
  | 401    | `AuthenticationException`       |
  | 403    | `PermissionDeniedException`     |
  | 404    | `NotFoundException`             |
  | 422    | `UnprocessableEntityException`  |
  | 429    | `RateLimitException`            |
  | 5xx    | `InternalServerException`       |
  | others | `UnexpectedStatusCodeException` |

- [`IncreaseIoException`](increase-kotlin-core/src/main/kotlin/com/increase/api/errors/IncreaseIoException.kt): I/O networking errors.

- [`IncreaseInvalidDataException`](increase-kotlin-core/src/main/kotlin/com/increase/api/errors/IncreaseInvalidDataException.kt): Failure to interpret successfully parsed data. For example, when accessing a property that's supposed to be required, but the API unexpectedly omitted it from the response.

- [`IncreaseException`](increase-kotlin-core/src/main/kotlin/com/increase/api/errors/IncreaseException.kt): Base class for all exceptions. Most errors will result in one of the previously mentioned ones, but completely generic errors may be thrown using the base class.

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

## Logging

The SDK uses the standard [OkHttp logging interceptor](https://github.com/square/okhttp/tree/master/okhttp-logging-interceptor).

Enable logging by setting the `INCREASE_LOG` environment variable to `info`:

```sh
$ export INCREASE_LOG=info
```

Or to `debug` for more verbose logging:

```sh
$ export INCREASE_LOG=debug
```

## Webhook Verification

We provide helper methods for verifying that a webhook request came from Increase, and not a malicious third party.

You can use `increase.webhooks().verifySignature(body, headers, secret?)` or `increase.webhooks().unwrap(body, headers, secret?)`,
both of which will raise an error if the signature is invalid. If secret is omitted, the body will be unwrapped without any validation.

Note that the "body" parameter must be the raw JSON string sent from the server (do not parse it first).
The `.unwrap()` method can parse this JSON for you.

## Network options

### Retries

The SDK automatically retries 2 times by default, with a short exponential backoff.

Only the following error types are retried:

- Connection errors (for example, due to a network connectivity problem)
- 408 Request Timeout
- 409 Conflict
- 429 Rate Limit
- 5xx Internal

The API may also explicitly instruct the SDK to retry or not retry a response.

To set a custom number of retries, configure the client using the `maxRetries` method:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .maxRetries(4)
    .build()
```

### Timeouts

Requests time out after 1 minute by default.

To set a custom timeout, configure the method call using the `timeout` method:

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

val account: Account = client.accounts().create(
  params, RequestOptions.builder().timeout(Duration.ofSeconds(30)).build()
)
```

Or configure the default for all method calls at the client level:

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

To route requests through a proxy, configure the client using the `proxy` method:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import java.net.InetSocketAddress
import java.net.Proxy

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .proxy(Proxy(
      Proxy.Type.HTTP, InetSocketAddress(
        "https://example.com", 8080
      )
    ))
    .build()
```

### Environments

The SDK sends requests to the production by default. To send requests to a different environment, configure the client like so:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .sandbox()
    .build()
```

## Undocumented API functionality

The SDK is typed for convenient usage of the documented API. However, it also supports working with undocumented or not yet supported parts of the API.

### Parameters

To set undocumented parameters, call the `putAdditionalHeader`, `putAdditionalQueryParam`, or `putAdditionalBodyProperty` methods on any `Params` class:

```kotlin
import com.increase.api.core.JsonValue
import com.increase.api.models.AccountCreateParams

val params: AccountCreateParams = AccountCreateParams.builder()
    .putAdditionalHeader("Secret-Header", "42")
    .putAdditionalQueryParam("secret_query_param", "42")
    .putAdditionalBodyProperty("secretProperty", JsonValue.from("42"))
    .build()
```

These can be accessed on the built object later using the `_additionalHeaders()`, `_additionalQueryParams()`, and `_additionalBodyProperties()` methods. You can also set undocumented parameters on nested headers, query params, or body classes using the `putAdditionalProperty` method. These properties can be accessed on the built object later using the `_additionalProperties()` method.

To set a documented parameter or property to an undocumented or not yet supported _value_, pass a [`JsonValue`](increase-kotlin-core/src/main/kotlin/com/increase/api/core/JsonValue.kt) object to its setter:

```kotlin
import com.increase.api.core.JsonValue
import com.increase.api.models.AccountCreateParams

val params: AccountCreateParams = AccountCreateParams.builder()
    .name(JsonValue.from(42))
    .entityId("entity_n8y8tnk2p9339ti393yi")
    .programId("program_i2v2os4mwza1oetokh9i")
    .build()
```

### Response properties

To access undocumented response properties, call the `_additionalProperties()` method:

```kotlin
import com.increase.api.core.JsonBoolean
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonNumber
import com.increase.api.core.JsonValue

val additionalProperties: Map<String, JsonValue> = client.accounts().create(params)._additionalProperties()
val secretPropertyValue: JsonValue = additionalProperties.get("secretProperty")

val result = when (secretPropertyValue) {
    is JsonNull -> "It's null!"
    is JsonBoolean -> "It's a boolean!"
    is JsonNumber -> "It's a number!"
    // Other types include `JsonMissing`, `JsonString`, `JsonArray`, and `JsonObject`
    else -> "It's something else!"
}
```

To access a property's raw JSON value, which may be undocumented, call its `_` prefixed method:

```kotlin
import com.increase.api.core.JsonField

val name: JsonField<String> = client.accounts().create(params)._name()

if (name.isMissing()) {
  // The property is absent from the JSON response
} else if (name.isNull()) {
  // The property was set to literal null
} else {
  // Check if value was provided as a string
  // Other methods include `asNumber()`, `asBoolean()`, etc.
  val jsonString: String? = name.asString();

  // Try to deserialize into a custom type
  val myObject: MyClass = name.asUnknown()!!.convert(MyClass::class.java)
}
```

### Response validation

In rare cases, the API may return a response that doesn't match the expected type. For example, the SDK may expect a property to contain a `String`, but the API could return something else.

By default, the SDK will not throw an exception in this case. It will throw [`IncreaseInvalidDataException`](increase-kotlin-core/src/main/kotlin/com/increase/api/errors/IncreaseInvalidDataException.kt) only if you directly access the property.

If you would prefer to check that the response is completely well-typed upfront, then either call `validate()`:

```kotlin
import com.increase.api.models.Account

val account: Account = client.accounts().create(params).validate()
```

Or configure the method call to validate the response using the `responseValidation` method:

```kotlin
import com.increase.api.models.Account
import com.increase.api.models.AccountCreateParams

val account: Account = client.accounts().create(
  params, RequestOptions.builder().responseValidation(true).build()
)
```

Or configure the default for all method calls at the client level:

```kotlin
import com.increase.api.client.IncreaseClient
import com.increase.api.client.okhttp.IncreaseOkHttpClient

val client: IncreaseClient = IncreaseOkHttpClient.builder()
    .fromEnv()
    .responseValidation(true)
    .build()
```

## FAQ

### Why don't you use plain `enum` classes?

Kotlin `enum` classes are not trivially [forwards compatible](https://www.stainless.com/blog/making-java-enums-forwards-compatible). Using them in the SDK could cause runtime exceptions if the API is updated to respond with a new enum value.

### Why do you represent fields using `JsonField<T>` instead of just plain `T`?

Using `JsonField<T>` enables a few features:

- Allowing usage of [undocumented API functionality](#undocumented-api-functionality)
- Lazily [validating the API response against the expected shape](#response-validation)
- Representing absent vs explicitly null values

### Why don't you use [`data` classes](https://kotlinlang.org/docs/data-classes.html)?

It is not [backwards compatible to add new fields to a data class](https://kotlinlang.org/docs/api-guidelines-backward-compatibility.html#avoid-using-data-classes-in-your-api) and we don't want to introduce a breaking change every time we add a field to a class.

### Why don't you use checked exceptions?

Checked exceptions are widely considered a mistake in the Java programming language. In fact, they were omitted from Kotlin for this reason.

Checked exceptions:

- Are verbose to handle
- Encourage error handling at the wrong level of abstraction, where nothing can be done about the error
- Are tedious to propagate due to the [function coloring problem](https://journal.stuffwithstuff.com/2015/02/01/what-color-is-your-function)
- Don't play well with lambdas (also due to the function coloring problem)

## Semantic versioning

This package generally follows [SemVer](https://semver.org/spec/v2.0.0.html) conventions, though certain backwards-incompatible changes may be released as minor versions:

1. Changes to library internals which are technically public but not intended or documented for external use. _(Please open a GitHub issue to let us know if you are relying on such internals.)_
2. Changes that we do not expect to impact the vast majority of users in practice.

We take backwards-compatibility seriously and work hard to ensure you can rely on a smooth upgrade experience.

We are keen for your feedback; please open an [issue](https://www.github.com/Increase/increase-kotlin/issues) with questions, bugs, or suggestions.
