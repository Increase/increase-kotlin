// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.util.Objects

/**
 * A token that is returned to your application when a user completes the OAuth flow and may be used
 * to authenticate requests. Learn more about OAuth [here](/documentation/oauth).
 */
@NoAutoDetect
class OAuthToken
@JsonCreator
private constructor(
    @JsonProperty("access_token")
    @ExcludeMissing
    private val accessToken: JsonField<String> = JsonMissing.of(),
    @JsonProperty("token_type")
    @ExcludeMissing
    private val tokenType: JsonField<TokenType> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** You may use this token in place of an API key to make OAuth requests on a user's behalf. */
    fun accessToken(): String = accessToken.getRequired("access_token")

    /** The type of OAuth token. */
    fun tokenType(): TokenType = tokenType.getRequired("token_type")

    /**
     * A constant representing the object's type. For this resource it will always be `oauth_token`.
     */
    fun type(): Type = type.getRequired("type")

    /** You may use this token in place of an API key to make OAuth requests on a user's behalf. */
    @JsonProperty("access_token")
    @ExcludeMissing
    fun _accessToken(): JsonField<String> = accessToken

    /** The type of OAuth token. */
    @JsonProperty("token_type") @ExcludeMissing fun _tokenType(): JsonField<TokenType> = tokenType

    /**
     * A constant representing the object's type. For this resource it will always be `oauth_token`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): OAuthToken = apply {
        if (validated) {
            return@apply
        }

        accessToken()
        tokenType()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [OAuthToken]. */
    class Builder internal constructor() {

        private var accessToken: JsonField<String>? = null
        private var tokenType: JsonField<TokenType>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(oauthToken: OAuthToken) = apply {
            accessToken = oauthToken.accessToken
            tokenType = oauthToken.tokenType
            type = oauthToken.type
            additionalProperties = oauthToken.additionalProperties.toMutableMap()
        }

        /**
         * You may use this token in place of an API key to make OAuth requests on a user's behalf.
         */
        fun accessToken(accessToken: String) = accessToken(JsonField.of(accessToken))

        /**
         * You may use this token in place of an API key to make OAuth requests on a user's behalf.
         */
        fun accessToken(accessToken: JsonField<String>) = apply { this.accessToken = accessToken }

        /** The type of OAuth token. */
        fun tokenType(tokenType: TokenType) = tokenType(JsonField.of(tokenType))

        /** The type of OAuth token. */
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
        fun type(type: JsonField<Type>) = apply { this.type = type }

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

        fun build(): OAuthToken =
            OAuthToken(
                checkRequired("accessToken", accessToken),
                checkRequired("tokenType", tokenType),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /** The type of OAuth token. */
    class TokenType @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val BEARER = of("bearer")

            fun of(value: String) = TokenType(JsonField.of(value))
        }

        /** An enum containing [TokenType]'s known values. */
        enum class Known {
            BEARER
        }

        /**
         * An enum containing [TokenType]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenType] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            BEARER,
            /**
             * An enum member indicating that [TokenType] was instantiated with an unknown value.
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
                BEARER -> Value.BEARER
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

    /**
     * A constant representing the object's type. For this resource it will always be `oauth_token`.
     */
    class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val OAUTH_TOKEN = of("oauth_token")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            OAUTH_TOKEN
        }

        /**
         * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Type] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            OAUTH_TOKEN,
            /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                OAUTH_TOKEN -> Value.OAUTH_TOKEN
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
