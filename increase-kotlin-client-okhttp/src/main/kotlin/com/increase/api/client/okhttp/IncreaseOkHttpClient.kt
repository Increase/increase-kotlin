package com.increase.api.client.okhttp

import com.fasterxml.jackson.databind.json.JsonMapper
import com.increase.api.client.IncreaseClient
import com.increase.api.client.IncreaseClientImpl
import com.increase.api.core.ClientOptions
import java.time.Clock
import java.time.Duration

class IncreaseOkHttpClient private constructor() {

    companion object {

        fun builder() = Builder()

        fun fromEnv(): IncreaseClient = builder().fromEnv().build()
    }

    class Builder {

        private var clientOptions: ClientOptions.Builder = ClientOptions.builder()
        private var baseUrl: String = ClientOptions.PRODUCTION_URL
        private var timeout: Duration = Duration.ofSeconds(60)
        private var maxRetries: Int = 2

        fun sandbox() = apply { baseUrl(ClientOptions.SANDBOX_URL) }

        fun baseUrl(baseUrl: String) = apply { this.baseUrl = baseUrl }

        fun jsonMapper(jsonMapper: JsonMapper) = apply { clientOptions.jsonMapper(jsonMapper) }

        fun clock(clock: Clock) = apply { clientOptions.clock(clock) }

        fun apiKey(apiKey: String) = apply { clientOptions.apiKey(apiKey) }

        fun headers(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.headers(headers)
        }

        fun putHeader(name: String, value: String) = apply { clientOptions.putHeader(name, value) }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            clientOptions.putHeaders(name, values)
        }

        fun putAllHeaders(headers: Map<String, Iterable<String>>) = apply {
            clientOptions.putAllHeaders(headers)
        }

        fun removeHeader(name: String) = apply { clientOptions.removeHeader(name) }

        fun timeout(timeout: Duration) = apply { this.timeout = timeout }

        fun maxRetries(maxRetries: Int) = apply { clientOptions.maxRetries(maxRetries) }

        fun responseValidation(responseValidation: Boolean) = apply {
            clientOptions.responseValidation(responseValidation)
        }

        fun fromEnv() = apply { clientOptions.fromEnv() }

        fun build(): IncreaseClient {
            return IncreaseClientImpl(
                clientOptions
                    .httpClient(OkHttpClient.builder().baseUrl(baseUrl).timeout(timeout).build())
                    .build()
            )
        }
    }
}
