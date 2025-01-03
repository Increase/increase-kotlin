// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

class OAuthTokenCreateParams
constructor(
    private val body: OAuthTokenCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

    /**
     * The credential you request in exchange for the code. In Production, this is always
     * `authorization_code`. In Sandbox, you can pass either enum value.
     */
    fun grantType(): GrantType = body.grantType()

    /** The public identifier for your application. */
    fun clientId(): String? = body.clientId()

    /**
     * The secret that confirms you own the application. This is redundent given that the request is
     * made with your API key but it's a required component of OAuth 2.0.
     */
    fun clientSecret(): String? = body.clientSecret()

    /** The authorization code generated by the user and given to you as a query parameter. */
    fun code(): String? = body.code()

    /**
     * The production token you want to exchange for a sandbox token. This is only available in
     * Sandbox. Set `grant_type` to `production_token` to use this parameter.
     */
    fun productionToken(): String? = body.productionToken()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): OAuthTokenCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class OAuthTokenCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("grant_type") private val grantType: GrantType,
        @JsonProperty("client_id") private val clientId: String?,
        @JsonProperty("client_secret") private val clientSecret: String?,
        @JsonProperty("code") private val code: String?,
        @JsonProperty("production_token") private val productionToken: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The credential you request in exchange for the code. In Production, this is always
         * `authorization_code`. In Sandbox, you can pass either enum value.
         */
        @JsonProperty("grant_type") fun grantType(): GrantType = grantType

        /** The public identifier for your application. */
        @JsonProperty("client_id") fun clientId(): String? = clientId

        /**
         * The secret that confirms you own the application. This is redundent given that the
         * request is made with your API key but it's a required component of OAuth 2.0.
         */
        @JsonProperty("client_secret") fun clientSecret(): String? = clientSecret

        /** The authorization code generated by the user and given to you as a query parameter. */
        @JsonProperty("code") fun code(): String? = code

        /**
         * The production token you want to exchange for a sandbox token. This is only available in
         * Sandbox. Set `grant_type` to `production_token` to use this parameter.
         */
        @JsonProperty("production_token") fun productionToken(): String? = productionToken

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var grantType: GrantType? = null
            private var clientId: String? = null
            private var clientSecret: String? = null
            private var code: String? = null
            private var productionToken: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(oauthTokenCreateBody: OAuthTokenCreateBody) = apply {
                grantType = oauthTokenCreateBody.grantType
                clientId = oauthTokenCreateBody.clientId
                clientSecret = oauthTokenCreateBody.clientSecret
                code = oauthTokenCreateBody.code
                productionToken = oauthTokenCreateBody.productionToken
                additionalProperties = oauthTokenCreateBody.additionalProperties.toMutableMap()
            }

            /**
             * The credential you request in exchange for the code. In Production, this is always
             * `authorization_code`. In Sandbox, you can pass either enum value.
             */
            fun grantType(grantType: GrantType) = apply { this.grantType = grantType }

            /** The public identifier for your application. */
            fun clientId(clientId: String) = apply { this.clientId = clientId }

            /**
             * The secret that confirms you own the application. This is redundent given that the
             * request is made with your API key but it's a required component of OAuth 2.0.
             */
            fun clientSecret(clientSecret: String) = apply { this.clientSecret = clientSecret }

            /**
             * The authorization code generated by the user and given to you as a query parameter.
             */
            fun code(code: String) = apply { this.code = code }

            /**
             * The production token you want to exchange for a sandbox token. This is only available
             * in Sandbox. Set `grant_type` to `production_token` to use this parameter.
             */
            fun productionToken(productionToken: String) = apply {
                this.productionToken = productionToken
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): OAuthTokenCreateBody =
                OAuthTokenCreateBody(
                    checkNotNull(grantType) { "`grantType` is required but was not set" },
                    clientId,
                    clientSecret,
                    code,
                    productionToken,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is OAuthTokenCreateBody && grantType == other.grantType && clientId == other.clientId && clientSecret == other.clientSecret && code == other.code && productionToken == other.productionToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(grantType, clientId, clientSecret, code, productionToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "OAuthTokenCreateBody{grantType=$grantType, clientId=$clientId, clientSecret=$clientSecret, code=$code, productionToken=$productionToken, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: OAuthTokenCreateBody.Builder = OAuthTokenCreateBody.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(oauthTokenCreateParams: OAuthTokenCreateParams) = apply {
            body = oauthTokenCreateParams.body.toBuilder()
            additionalHeaders = oauthTokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthTokenCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * The credential you request in exchange for the code. In Production, this is always
         * `authorization_code`. In Sandbox, you can pass either enum value.
         */
        fun grantType(grantType: GrantType) = apply { body.grantType(grantType) }

        /** The public identifier for your application. */
        fun clientId(clientId: String) = apply { body.clientId(clientId) }

        /**
         * The secret that confirms you own the application. This is redundent given that the
         * request is made with your API key but it's a required component of OAuth 2.0.
         */
        fun clientSecret(clientSecret: String) = apply { body.clientSecret(clientSecret) }

        /** The authorization code generated by the user and given to you as a query parameter. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * The production token you want to exchange for a sandbox token. This is only available in
         * Sandbox. Set `grant_type` to `production_token` to use this parameter.
         */
        fun productionToken(productionToken: String) = apply {
            body.productionToken(productionToken)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun build(): OAuthTokenCreateParams =
            OAuthTokenCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    class GrantType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val AUTHORIZATION_CODE = of("authorization_code")

            val PRODUCTION_TOKEN = of("production_token")

            fun of(value: String) = GrantType(JsonField.of(value))
        }

        enum class Known {
            AUTHORIZATION_CODE,
            PRODUCTION_TOKEN,
        }

        enum class Value {
            AUTHORIZATION_CODE,
            PRODUCTION_TOKEN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
                PRODUCTION_TOKEN -> Value.PRODUCTION_TOKEN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                PRODUCTION_TOKEN -> Known.PRODUCTION_TOKEN
                else -> throw IncreaseInvalidDataException("Unknown GrantType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is GrantType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthTokenCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "OAuthTokenCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
