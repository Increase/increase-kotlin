// File generated from our OpenAPI spec by Stainless.

package com.increase.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.increase.api.core.http.Headers
import com.increase.api.core.http.HttpClient
import com.increase.api.core.http.PhantomReachableClosingHttpClient
import com.increase.api.core.http.QueryParams
import com.increase.api.core.http.RetryingHttpClient
import java.time.Clock
import java.time.Duration

/** A class representing the SDK client configuration. */
class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    /**
     * The HTTP client to use in the SDK.
     *
     * Use the one published in `increase-kotlin-client-okhttp` or implement your own.
     */
    val httpClient: HttpClient,
    /**
     * Whether to throw an exception if any of the Jackson versions detected at runtime are
     * incompatible with the SDK's minimum supported Jackson version (2.13.4).
     *
     * Defaults to true. Use extreme caution when disabling this option. There is no guarantee that
     * the SDK will work correctly when using an incompatible Jackson version.
     */
    val checkJacksonVersionCompatibility: Boolean,
    /**
     * The Jackson JSON mapper to use for serializing and deserializing JSON.
     *
     * Defaults to [com.increase.api.core.jsonMapper]. The default is usually sufficient and rarely
     * needs to be overridden.
     */
    val jsonMapper: JsonMapper,
    /**
     * The clock to use for operations that require timing, like retries.
     *
     * This is primarily useful for using a fake clock in tests.
     *
     * Defaults to [Clock.systemUTC].
     */
    val clock: Clock,
    private val baseUrl: String?,
    /** Headers to send with the request. */
    val headers: Headers,
    /** Query params to send with the request. */
    val queryParams: QueryParams,
    /**
     * Whether to call `validate` on every response before returning it.
     *
     * Defaults to false, which means the shape of the response will not be validated upfront.
     * Instead, validation will only occur for the parts of the response that are accessed.
     */
    val responseValidation: Boolean,
    /**
     * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
     * retries.
     *
     * Defaults to [Timeout.default].
     */
    val timeout: Timeout,
    /**
     * The maximum number of times to retry failed requests, with a short exponential backoff
     * between requests.
     *
     * Only the following error types are retried:
     * - Connection errors (for example, due to a network connectivity problem)
     * - 408 Request Timeout
     * - 409 Conflict
     * - 429 Rate Limit
     * - 5xx Internal
     *
     * The API may also explicitly instruct the SDK to retry or not retry a request.
     *
     * Defaults to 2.
     */
    val maxRetries: Int,
    val apiKey: String,
    val webhookSecret: String?,
) {

    init {
        if (checkJacksonVersionCompatibility) {
            checkJacksonVersionCompatibility()
        }
    }

    /**
     * The base URL to use for every request.
     *
     * Defaults to the production environment: `https://api.increase.com`.
     *
     * The following other environments, with dedicated builder methods, are available:
     * - sandbox: `https://sandbox.increase.com`
     */
    fun baseUrl(): String = baseUrl ?: PRODUCTION_URL

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.increase.com"

        const val SANDBOX_URL = "https://sandbox.increase.com"

        /**
         * Returns a mutable builder for constructing an instance of [ClientOptions].
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .apiKey()
         * ```
         */
        fun builder() = Builder()

        /**
         * Returns options configured using system properties and environment variables.
         *
         * @see Builder.fromEnv
         */
        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    /** A builder for [ClientOptions]. */
    class Builder internal constructor() {

        private var httpClient: HttpClient? = null
        private var checkJacksonVersionCompatibility: Boolean = true
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String? = null
        private var headers: Headers.Builder = Headers.builder()
        private var queryParams: QueryParams.Builder = QueryParams.builder()
        private var responseValidation: Boolean = false
        private var timeout: Timeout = Timeout.default()
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var webhookSecret: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            checkJacksonVersionCompatibility = clientOptions.checkJacksonVersionCompatibility
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = clientOptions.headers.toBuilder()
            queryParams = clientOptions.queryParams.toBuilder()
            responseValidation = clientOptions.responseValidation
            timeout = clientOptions.timeout
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            webhookSecret = clientOptions.webhookSecret
        }

        /**
         * The HTTP client to use in the SDK.
         *
         * Use the one published in `increase-kotlin-client-okhttp` or implement your own.
         */
        fun httpClient(httpClient: HttpClient) = apply {
            this.httpClient = PhantomReachableClosingHttpClient(httpClient)
        }

        /**
         * Whether to throw an exception if any of the Jackson versions detected at runtime are
         * incompatible with the SDK's minimum supported Jackson version (2.13.4).
         *
         * Defaults to true. Use extreme caution when disabling this option. There is no guarantee
         * that the SDK will work correctly when using an incompatible Jackson version.
         */
        fun checkJacksonVersionCompatibility(checkJacksonVersionCompatibility: Boolean) = apply {
            this.checkJacksonVersionCompatibility = checkJacksonVersionCompatibility
        }

        /**
         * The Jackson JSON mapper to use for serializing and deserializing JSON.
         *
         * Defaults to [com.increase.api.core.jsonMapper]. The default is usually sufficient and
         * rarely needs to be overridden.
         */
        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        /**
         * The clock to use for operations that require timing, like retries.
         *
         * This is primarily useful for using a fake clock in tests.
         *
         * Defaults to [Clock.systemUTC].
         */
        fun clock(clock: Clock) = apply { this.clock = clock }

        /**
         * The base URL to use for every request.
         *
         * Defaults to the production environment: `https://api.increase.com`.
         *
         * The following other environments, with dedicated builder methods, are available:
         * - sandbox: `https://sandbox.increase.com`
         */
        fun baseUrl(baseUrl: String?) = apply { this.baseUrl = baseUrl }

        /** Sets [baseUrl] to `https://sandbox.increase.com`. */
        fun sandbox() = baseUrl(SANDBOX_URL)

        /**
         * Whether to call `validate` on every response before returning it.
         *
         * Defaults to false, which means the shape of the response will not be validated upfront.
         * Instead, validation will only occur for the parts of the response that are accessed.
         */
        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        /**
         * Sets the maximum time allowed for various parts of an HTTP call's lifecycle, excluding
         * retries.
         *
         * Defaults to [Timeout.default].
         */
        fun timeout(timeout: Timeout) = apply { this.timeout = timeout }

        /**
         * Sets the maximum time allowed for a complete HTTP call, not including retries.
         *
         * See [Timeout.request] for more details.
         *
         * For fine-grained control, pass a [Timeout] object.
         */
        fun timeout(timeout: Duration) = timeout(Timeout.builder().request(timeout).build())

        /**
         * The maximum number of times to retry failed requests, with a short exponential backoff
         * between requests.
         *
         * Only the following error types are retried:
         * - Connection errors (for example, due to a network connectivity problem)
         * - 408 Request Timeout
         * - 409 Conflict
         * - 429 Rate Limit
         * - 5xx Internal
         *
         * The API may also explicitly instruct the SDK to retry or not retry a request.
         *
         * Defaults to 2.
         */
        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun headers(headers: Headers) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply { headers.put(name, values) }

        fun putAllHeaders(headers: Headers) = apply { this.headers.putAll(headers) }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.putAll(headers)
        }

        fun replaceHeaders(name: String, value: String) = apply { headers.replace(name, value) }

        fun replaceHeaders(name: String, values: Iterable<String>) = apply {
            headers.replace(name, values)
        }

        fun replaceAllHeaders(headers: Headers) = apply { this.headers.replaceAll(headers) }

        fun replaceAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            this.headers.replaceAll(headers)
        }

        fun removeHeaders(name: String) = apply { headers.remove(name) }

        fun removeAllHeaders(names: Set<String>) = apply { headers.removeAll(names) }

        fun queryParams(queryParams: QueryParams) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.put(key, values)
        }

        fun putAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.putAll(queryParams)
        }

        fun replaceQueryParams(key: String, value: String) = apply {
            queryParams.replace(key, value)
        }

        fun replaceQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.replace(key, values)
        }

        fun replaceAllQueryParams(queryParams: QueryParams) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun replaceAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.replaceAll(queryParams)
        }

        fun removeQueryParams(key: String) = apply { queryParams.remove(key) }

        fun removeAllQueryParams(keys: Set<String>) = apply { queryParams.removeAll(keys) }

        fun timeout(): Timeout = timeout

        /**
         * Updates configuration using system properties and environment variables.
         *
         * See this table for the available options:
         *
         * |Setter         |System property         |Environment variable     |Required|Default value               |
         * |---------------|------------------------|-------------------------|--------|----------------------------|
         * |`apiKey`       |`increase.apiKey`       |`INCREASE_API_KEY`       |true    |-                           |
         * |`webhookSecret`|`increase.webhookSecret`|`INCREASE_WEBHOOK_SECRET`|false   |-                           |
         * |`baseUrl`      |`increase.baseUrl`      |`INCREASE_BASE_URL`      |true    |`"https://api.increase.com"`|
         *
         * System properties take precedence over environment variables.
         */
        fun fromEnv() = apply {
            (System.getProperty("increase.baseUrl") ?: System.getenv("INCREASE_BASE_URL"))?.let {
                baseUrl(it)
            }
            (System.getProperty("increase.apiKey") ?: System.getenv("INCREASE_API_KEY"))?.let {
                apiKey(it)
            }
            (System.getProperty("increase.webhookSecret")
                    ?: System.getenv("INCREASE_WEBHOOK_SECRET"))
                ?.let { webhookSecret(it) }
        }

        /**
         * Returns an immutable instance of [ClientOptions].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .httpClient()
         * .apiKey()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ClientOptions {
            val httpClient = checkRequired("httpClient", httpClient)
            val apiKey = checkRequired("apiKey", apiKey)

            val headers = Headers.builder()
            val queryParams = QueryParams.builder()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            apiKey.let {
                if (!it.isEmpty()) {
                    headers.put("Authorization", "Bearer $it")
                }
            }
            headers.replaceAll(this.headers.build())
            queryParams.replaceAll(this.queryParams.build())

            return ClientOptions(
                httpClient,
                RetryingHttpClient.builder()
                    .httpClient(httpClient)
                    .clock(clock)
                    .maxRetries(maxRetries)
                    .idempotencyHeader("Idempotency-Key")
                    .build(),
                checkJacksonVersionCompatibility,
                jsonMapper,
                clock,
                baseUrl,
                headers.build(),
                queryParams.build(),
                responseValidation,
                timeout,
                maxRetries,
                apiKey,
                webhookSecret,
            )
        }
    }
}
