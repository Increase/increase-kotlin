// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/**
 * A token that is returned to your application when a user completes the OAuth flow and may be used
 * to authenticate requests. Learn more about OAuth [here](/documentation/oauth).
 */
@JsonDeserialize(builder = OAuthToken.Builder::class)
@NoAutoDetect
class OAuthToken
private constructor(
    private val accessToken: JsonField<String>,
    private val tokenType: JsonField<TokenType>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** You may use this token in place of an API key to make OAuth requests on a user's behalf. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** The type of OAuth token. */
    fun tokenType(): TokenType = tokenType.getRequired("token_type")

    /**
     * A constant representing the object's type. For this resource it will always be `oauth_token`.
     */
    fun type(): Type = type.getRequired("type")

    /** You may use this token in place of an API key to make OAuth requests on a user's behalf. */
    @JsonProperty("access_token") @ExcludeMissing fun _accessToken() = accessToken

    /** The type of OAuth token. */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType() = tokenType

    /**
     * A constant representing the object's type. For this resource it will always be `oauth_token`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): OAuthToken = apply {
        if (!validated) {
            accessToken()
            tokenType()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accessToken: JsonField<String> = JsonMissing.of()
        private var tokenType: JsonField<TokenType> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthToken: OAuthToken) = apply {
            this.accessToken = oauthToken.accessToken
            this.tokenType = oauthToken.tokenType
            this.type = oauthToken.type
            additionalProperties(oauthToken.additionalProperties)
        }

        /**
         * You may use this token in place of an API key to make OAuth requests on a user's behalf.
         */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * You may use this token in place of an API key to make OAuth requests on a user's behalf.
         */
        @JsonProperty("access_token")
        @ExcludeMissing
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The type of OAuth token. */
        fun tokenType(tokenType: TokenType) = tokenType(JsonField.of(tokenType))

        /** The type of OAuth token. */
        @JsonProperty("token_type")
        @ExcludeMissing
        fun tokenType(tokenType: JsonField<TokenType>) = apply { this.tokenType = tokenType }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_token`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `oauth_token`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            this.additionalProperties.putAll(additionalProperties)
        }

        @JsonAnySetter
        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
            this.additionalProperties.put(key, value)
        }

        fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.putAll(additionalProperties)
        }

        fun build(): OAuthToken =
            OAuthToken(
                accessToken,
                tokenType,
                type,
                additionalProperties.toImmutable(),
            )
    }

    class TokenType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BEARER = of("bearer")

            fun of(value: String) = TokenType(JsonField.of(value))
        }

        enum class Known {
            BEARER,
        }

        enum class Value {
            BEARER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BEARER -> Value.BEARER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BEARER -> Known.BEARER
                else -> throw IncreaseInvalidDataException("Unknown TokenType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val OAUTH_TOKEN = of("oauth_token")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            OAUTH_TOKEN,
        }

        enum class Value {
            OAUTH_TOKEN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OAUTH_TOKEN -> Value.OAUTH_TOKEN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OAUTH_TOKEN -> Known.OAUTH_TOKEN
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthToken && accessToken == other.accessToken && tokenType == other.tokenType && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accessToken, tokenType, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "OAuthToken{accessToken=$accessToken, tokenType=$tokenType, type=$type, additionalProperties=$additionalProperties}"
}
