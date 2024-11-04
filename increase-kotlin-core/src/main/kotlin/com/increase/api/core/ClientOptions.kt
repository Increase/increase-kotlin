// File generated from our OpenAPI spec by Stainless.

package com.increase.api.core

import com.fasterxml.jackson.databind.json.JsonMapper
import com.google.common.collect.ArrayListMultimap
import com.google.common.collect.ListMultimap
import com.increase.api.core.http.HttpClient
import com.increase.api.core.http.PhantomReachableClosingHttpClient
import com.increase.api.core.http.RetryingHttpClient
import java.time.Clock

class ClientOptions
private constructor(
    private val originalHttpClient: HttpClient,
    val httpClient: HttpClient,
    val jsonMapper: JsonMapper,
    val clock: Clock,
    val baseUrl: String,
    val headers: ListMultimap<String, String>,
    val queryParams: ListMultimap<String, String>,
    val responseValidation: Boolean,
    val maxRetries: Int,
    val apiKey: String,
    val webhookSecret: String?,
) {

    fun toBuilder() = Builder().from(this)

    companion object {

        const val PRODUCTION_URL = "https://api.increase.com"

        const val SANDBOX_URL = "https://sandbox.increase.com"

        fun builder() = Builder()

        fun fromEnv(): ClientOptions = builder().fromEnv().build()
    }

    class Builder {

        private var httpClient: HttpClient? = null
        private var jsonMapper: JsonMapper = jsonMapper()
        private var clock: Clock = Clock.systemUTC()
        private var baseUrl: String = PRODUCTION_URL
        private var headers: ListMultimap<String, String> = ArrayListMultimap.create()
        private var queryParams: ListMultimap<String, String> = ArrayListMultimap.create()
        private var responseValidation: Boolean = false
        private var maxRetries: Int = 2
        private var apiKey: String? = null
        private var webhookSecret: String? = null

        internal fun from(clientOptions: ClientOptions) = apply {
            httpClient = clientOptions.originalHttpClient
            jsonMapper = clientOptions.jsonMapper
            clock = clientOptions.clock
            baseUrl = clientOptions.baseUrl
            headers = ArrayListMultimap.create(clientOptions.headers)
            queryParams = ArrayListMultimap.create(clientOptions.queryParams)
            responseValidation = clientOptions.responseValidation
            maxRetries = clientOptions.maxRetries
            apiKey = clientOptions.apiKey
            webhookSecret = clientOptions.webhookSecret
        }

        fun httpClient(httpClient: HttpClient) = apply { this.httpClient = httpClient }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { this.jsonMapper = jsonMapper }

        fun clock(clock: Clock) = apply { this.clock = clock }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            this.headers.clear()
            putAllHeaders(headers)
        }

        fun putHeader(name: String, value: String) = apply { headers.put(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            headers.putAll(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            headers.forEach(::putHeaders)
        }

        fun removeHeader(name: String) = apply { headers.removeAll(name) }

        fun queryParams(queryParams: Map<String, Iterable<String>>) = apply {
            this.queryParams.clear()
            putAllQueryParams(queryParams)
        }

        fun putQueryParam(key: String, value: String) = apply { queryParams.put(key, value) }

        fun putQueryParams(key: String, values: Iterable<String>) = apply {
            queryParams.putAll(key, values)
        }

        fun putAllQueryParams(queryParams: Map<String, Iterable<String>>) = apply {
            queryParams.forEach(::putQueryParams)
        }

        fun removeQueryParam(key: String) = apply { queryParams.removeAll(key) }

        fun responseValidation(responseValidation: Boolean) = apply {
            this.responseValidation = responseValidation
        }

        fun maxRetries(maxRetries: Int) = apply { this.maxRetries = maxRetries }

        fun apiKey(apiKey: String) = apply { this.apiKey = apiKey }

        fun webhookSecret(webhookSecret: String?) = apply { this.webhookSecret = webhookSecret }

        fun fromEnv() = apply {
            System.getenv("INCREASE_API_KEY")?.let { apiKey(it) }
            System.getenv("INCREASE_WEBHOOK_SECRET")?.let { webhookSecret(it) }
        }

        fun build(): ClientOptions {
            checkNotNull(httpClient) { "`httpClient` is required but was not set" }
            checkNotNull(apiKey) { "`apiKey` is required but was not set" }

            val headers = ArrayListMultimap.create<String, String>()
            val queryParams = ArrayListMultimap.create<String, String>()
            headers.put("X-Stainless-Lang", "kotlin")
            headers.put("X-Stainless-Arch", getOsArch())
            headers.put("X-Stainless-OS", getOsName())
            headers.put("X-Stainless-OS-Version", getOsVersion())
            headers.put("X-Stainless-Package-Version", getPackageVersion())
            headers.put("X-Stainless-Runtime", "JRE")
            headers.put("X-Stainless-Runtime-Version", getJavaVersion())
            if (!apiKey.isNullOrEmpty()) {
                headers.put("Authorization", "Bearer ${apiKey}")
            }
            this.headers.asMap().forEach(headers::replaceValues)
            this.queryParams.asMap().forEach(queryParams::replaceValues)

            return ClientOptions(
                httpClient!!,
                PhantomReachableClosingHttpClient(
                    RetryingHttpClient.builder()
                        .httpClient(httpClient!!)
                        .clock(clock)
                        .maxRetries(maxRetries)
                        .idempotencyHeader("Idempotency-Key")
                        .build()
                ),
                jsonMapper,
                clock,
                baseUrl,
                headers.toImmutable(),
                queryParams.toImmutable(),
                responseValidation,
                maxRetries,
                apiKey!!,
                webhookSecret,
            )
        }
    }
}
