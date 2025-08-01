// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthtokens

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Collections
import java.util.Objects

/** Create an OAuth Token */
class OAuthTokenCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /**
     * The credential you request in exchange for the code. In Production, this is always
     * `authorization_code`. In Sandbox, you can pass either enum value.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun grantType(): GrantType = body.grantType()

    /**
     * The public identifier for your application.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientId(): String? = body.clientId()

    /**
     * The secret that confirms you own the application. This is redundent given that the request is
     * made with your API key but it's a required component of OAuth 2.0.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun clientSecret(): String? = body.clientSecret()

    /**
     * The authorization code generated by the user and given to you as a query parameter.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun code(): String? = body.code()

    /**
     * The production token you want to exchange for a sandbox token. This is only available in
     * Sandbox. Set `grant_type` to `production_token` to use this parameter.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun productionToken(): String? = body.productionToken()

    /**
     * Returns the raw JSON value of [grantType].
     *
     * Unlike [grantType], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _grantType(): JsonField<GrantType> = body._grantType()

    /**
     * Returns the raw JSON value of [clientId].
     *
     * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientId(): JsonField<String> = body._clientId()

    /**
     * Returns the raw JSON value of [clientSecret].
     *
     * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _clientSecret(): JsonField<String> = body._clientSecret()

    /**
     * Returns the raw JSON value of [code].
     *
     * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _code(): JsonField<String> = body._code()

    /**
     * Returns the raw JSON value of [productionToken].
     *
     * Unlike [productionToken], this method doesn't throw if the JSON field has an unexpected type.
     */
    fun _productionToken(): JsonField<String> = body._productionToken()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    /** Additional headers to send with the request. */
    fun _additionalHeaders(): Headers = additionalHeaders

    /** Additional query param to send with the request. */
    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthTokenCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .grantType()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OAuthTokenCreateParams]. */
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(oauthTokenCreateParams: OAuthTokenCreateParams) = apply {
            body = oauthTokenCreateParams.body.toBuilder()
            additionalHeaders = oauthTokenCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = oauthTokenCreateParams.additionalQueryParams.toBuilder()
        }

        /**
         * Sets the entire request body.
         *
         * This is generally only useful if you are already constructing the body separately.
         * Otherwise, it's more convenient to use the top-level setters instead:
         * - [grantType]
         * - [clientId]
         * - [clientSecret]
         * - [code]
         * - [productionToken]
         * - etc.
         */
        fun body(body: Body) = apply { this.body = body.toBuilder() }

        /**
         * The credential you request in exchange for the code. In Production, this is always
         * `authorization_code`. In Sandbox, you can pass either enum value.
         */
        fun grantType(grantType: GrantType) = apply { body.grantType(grantType) }

        /**
         * Sets [Builder.grantType] to an arbitrary JSON value.
         *
         * You should usually call [Builder.grantType] with a well-typed [GrantType] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun grantType(grantType: JsonField<GrantType>) = apply { body.grantType(grantType) }

        /** The public identifier for your application. */
        fun clientId(clientId: String) = apply { body.clientId(clientId) }

        /**
         * Sets [Builder.clientId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun clientId(clientId: JsonField<String>) = apply { body.clientId(clientId) }

        /**
         * The secret that confirms you own the application. This is redundent given that the
         * request is made with your API key but it's a required component of OAuth 2.0.
         */
        fun clientSecret(clientSecret: String) = apply { body.clientSecret(clientSecret) }

        /**
         * Sets [Builder.clientSecret] to an arbitrary JSON value.
         *
         * You should usually call [Builder.clientSecret] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun clientSecret(clientSecret: JsonField<String>) = apply {
            body.clientSecret(clientSecret)
        }

        /** The authorization code generated by the user and given to you as a query parameter. */
        fun code(code: String) = apply { body.code(code) }

        /**
         * Sets [Builder.code] to an arbitrary JSON value.
         *
         * You should usually call [Builder.code] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun code(code: JsonField<String>) = apply { body.code(code) }

        /**
         * The production token you want to exchange for a sandbox token. This is only available in
         * Sandbox. Set `grant_type` to `production_token` to use this parameter.
         */
        fun productionToken(productionToken: String) = apply {
            body.productionToken(productionToken)
        }

        /**
         * Sets [Builder.productionToken] to an arbitrary JSON value.
         *
         * You should usually call [Builder.productionToken] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun productionToken(productionToken: JsonField<String>) = apply {
            body.productionToken(productionToken)
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

        /**
         * Returns an immutable instance of [OAuthTokenCreateParams].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .grantType()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthTokenCreateParams =
            OAuthTokenCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    class Body
    private constructor(
        private val grantType: JsonField<GrantType>,
        private val clientId: JsonField<String>,
        private val clientSecret: JsonField<String>,
        private val code: JsonField<String>,
        private val productionToken: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("grant_type")
            @ExcludeMissing
            grantType: JsonField<GrantType> = JsonMissing.of(),
            @JsonProperty("client_id")
            @ExcludeMissing
            clientId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("client_secret")
            @ExcludeMissing
            clientSecret: JsonField<String> = JsonMissing.of(),
            @JsonProperty("code") @ExcludeMissing code: JsonField<String> = JsonMissing.of(),
            @JsonProperty("production_token")
            @ExcludeMissing
            productionToken: JsonField<String> = JsonMissing.of(),
        ) : this(grantType, clientId, clientSecret, code, productionToken, mutableMapOf())

        /**
         * The credential you request in exchange for the code. In Production, this is always
         * `authorization_code`. In Sandbox, you can pass either enum value.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun grantType(): GrantType = grantType.getRequired("grant_type")

        /**
         * The public identifier for your application.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clientId(): String? = clientId.getNullable("client_id")

        /**
         * The secret that confirms you own the application. This is redundent given that the
         * request is made with your API key but it's a required component of OAuth 2.0.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun clientSecret(): String? = clientSecret.getNullable("client_secret")

        /**
         * The authorization code generated by the user and given to you as a query parameter.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun code(): String? = code.getNullable("code")

        /**
         * The production token you want to exchange for a sandbox token. This is only available in
         * Sandbox. Set `grant_type` to `production_token` to use this parameter.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun productionToken(): String? = productionToken.getNullable("production_token")

        /**
         * Returns the raw JSON value of [grantType].
         *
         * Unlike [grantType], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("grant_type")
        @ExcludeMissing
        fun _grantType(): JsonField<GrantType> = grantType

        /**
         * Returns the raw JSON value of [clientId].
         *
         * Unlike [clientId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("client_id") @ExcludeMissing fun _clientId(): JsonField<String> = clientId

        /**
         * Returns the raw JSON value of [clientSecret].
         *
         * Unlike [clientSecret], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("client_secret")
        @ExcludeMissing
        fun _clientSecret(): JsonField<String> = clientSecret

        /**
         * Returns the raw JSON value of [code].
         *
         * Unlike [code], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("code") @ExcludeMissing fun _code(): JsonField<String> = code

        /**
         * Returns the raw JSON value of [productionToken].
         *
         * Unlike [productionToken], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("production_token")
        @ExcludeMissing
        fun _productionToken(): JsonField<String> = productionToken

        @JsonAnySetter
        private fun putAdditionalProperty(key: String, value: JsonValue) {
            additionalProperties.put(key, value)
        }

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> =
            Collections.unmodifiableMap(additionalProperties)

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .grantType()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var grantType: JsonField<GrantType>? = null
            private var clientId: JsonField<String> = JsonMissing.of()
            private var clientSecret: JsonField<String> = JsonMissing.of()
            private var code: JsonField<String> = JsonMissing.of()
            private var productionToken: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                grantType = body.grantType
                clientId = body.clientId
                clientSecret = body.clientSecret
                code = body.code
                productionToken = body.productionToken
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The credential you request in exchange for the code. In Production, this is always
             * `authorization_code`. In Sandbox, you can pass either enum value.
             */
            fun grantType(grantType: GrantType) = grantType(JsonField.of(grantType))

            /**
             * Sets [Builder.grantType] to an arbitrary JSON value.
             *
             * You should usually call [Builder.grantType] with a well-typed [GrantType] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun grantType(grantType: JsonField<GrantType>) = apply { this.grantType = grantType }

            /** The public identifier for your application. */
            fun clientId(clientId: String) = clientId(JsonField.of(clientId))

            /**
             * Sets [Builder.clientId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientId(clientId: JsonField<String>) = apply { this.clientId = clientId }

            /**
             * The secret that confirms you own the application. This is redundent given that the
             * request is made with your API key but it's a required component of OAuth 2.0.
             */
            fun clientSecret(clientSecret: String) = clientSecret(JsonField.of(clientSecret))

            /**
             * Sets [Builder.clientSecret] to an arbitrary JSON value.
             *
             * You should usually call [Builder.clientSecret] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun clientSecret(clientSecret: JsonField<String>) = apply {
                this.clientSecret = clientSecret
            }

            /**
             * The authorization code generated by the user and given to you as a query parameter.
             */
            fun code(code: String) = code(JsonField.of(code))

            /**
             * Sets [Builder.code] to an arbitrary JSON value.
             *
             * You should usually call [Builder.code] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun code(code: JsonField<String>) = apply { this.code = code }

            /**
             * The production token you want to exchange for a sandbox token. This is only available
             * in Sandbox. Set `grant_type` to `production_token` to use this parameter.
             */
            fun productionToken(productionToken: String) =
                productionToken(JsonField.of(productionToken))

            /**
             * Sets [Builder.productionToken] to an arbitrary JSON value.
             *
             * You should usually call [Builder.productionToken] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun productionToken(productionToken: JsonField<String>) = apply {
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

            /**
             * Returns an immutable instance of [Body].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .grantType()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Body =
                Body(
                    checkRequired("grantType", grantType),
                    clientId,
                    clientSecret,
                    code,
                    productionToken,
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            grantType().validate()
            clientId()
            clientSecret()
            code()
            productionToken()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (grantType.asKnown()?.validity() ?: 0) +
                (if (clientId.asKnown() == null) 0 else 1) +
                (if (clientSecret.asKnown() == null) 0 else 1) +
                (if (code.asKnown() == null) 0 else 1) +
                (if (productionToken.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && grantType == other.grantType && clientId == other.clientId && clientSecret == other.clientSecret && code == other.code && productionToken == other.productionToken && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(grantType, clientId, clientSecret, code, productionToken, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{grantType=$grantType, clientId=$clientId, clientSecret=$clientSecret, code=$code, productionToken=$productionToken, additionalProperties=$additionalProperties}"
    }

    /**
     * The credential you request in exchange for the code. In Production, this is always
     * `authorization_code`. In Sandbox, you can pass either enum value.
     */
    class GrantType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

        /**
         * Returns this class instance's raw value.
         *
         * This is usually only useful if this instance was deserialized from data that doesn't
         * match any known member, and you want to know that value. For example, if the SDK is on an
         * older version than the API, then the API may respond with new members that the SDK is
         * unaware of.
         */
        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            /** An OAuth authorization code. */
            val AUTHORIZATION_CODE = of("authorization_code")

            /** An OAuth production token. */
            val PRODUCTION_TOKEN = of("production_token")

            fun of(value: String) = GrantType(JsonField.of(value))
        }

        /** An enum containing [GrantType]'s known values. */
        enum class Known {
            /** An OAuth authorization code. */
            AUTHORIZATION_CODE,
            /** An OAuth production token. */
            PRODUCTION_TOKEN,
        }

        /**
         * An enum containing [GrantType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [GrantType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** An OAuth authorization code. */
            AUTHORIZATION_CODE,
            /** An OAuth production token. */
            PRODUCTION_TOKEN,
            /**
             * An enum member indicating that [GrantType] was instantiated with an unknown value.
             */
            _UNKNOWN,
        }

        /**
         * Returns an enum member corresponding to this class instance's value, or [Value._UNKNOWN]
         * if the class was instantiated with an unknown value.
         *
         * Use the [known] method instead if you're certain the value is always known or if you want
         * to throw for the unknown case.
         */
        fun value(): Value =
            when (this) {
                AUTHORIZATION_CODE -> Value.AUTHORIZATION_CODE
                PRODUCTION_TOKEN -> Value.PRODUCTION_TOKEN
                else -> Value._UNKNOWN
            }

        /**
         * Returns an enum member corresponding to this class instance's value.
         *
         * Use the [value] method instead if you're uncertain the value is always known and don't
         * want to throw for the unknown case.
         *
         * @throws IncreaseInvalidDataException if this class instance's value is a not a known
         *   member.
         */
        fun known(): Known =
            when (this) {
                AUTHORIZATION_CODE -> Known.AUTHORIZATION_CODE
                PRODUCTION_TOKEN -> Known.PRODUCTION_TOKEN
                else -> throw IncreaseInvalidDataException("Unknown GrantType: $value")
            }

        /**
         * Returns this class instance's primitive wire representation.
         *
         * This differs from the [toString] method because that method is primarily for debugging
         * and generally doesn't throw.
         *
         * @throws IncreaseInvalidDataException if this class instance's value does not have the
         *   expected primitive type.
         */
        fun asString(): String =
            _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

        private var validated: Boolean = false

        fun validate(): GrantType = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

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
