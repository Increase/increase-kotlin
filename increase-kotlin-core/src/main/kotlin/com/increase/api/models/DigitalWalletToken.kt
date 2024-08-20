// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.core.ObjectCodec
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.databind.JsonNode
import com.fasterxml.jackson.databind.SerializerProvider
import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Objects
import java.util.Optional
import java.util.UUID
import com.increase.api.core.BaseDeserializer
import com.increase.api.core.BaseSerializer
import com.increase.api.core.getOrThrow
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonField
import com.increase.api.core.Enum
import com.increase.api.core.toUnmodifiable
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException

/**
 * A Digital Wallet Token is created when a user adds a Card to their Apple Pay or
 * Google Pay app. The Digital Wallet Token can be used for purchases just like a
 * Card.
 */
@JsonDeserialize(builder = DigitalWalletToken.Builder::class)
@NoAutoDetect
class DigitalWalletToken private constructor(
  private val cardId: JsonField<String>,
  private val createdAt: JsonField<OffsetDateTime>,
  private val id: JsonField<String>,
  private val status: JsonField<Status>,
  private val tokenRequestor: JsonField<TokenRequestor>,
  private val type: JsonField<Type>,
  private val additionalProperties: Map<String, JsonValue>,

) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the Card this Digital Wallet Token belongs to. */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the Card was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The Digital Wallet Token identifier. */
    fun id(): String = id.getRequired("id")

    /** This indicates if payments can be made with the Digital Wallet Token. */
    fun status(): Status = status.getRequired("status")

    /** The digital wallet app being used. */
    fun tokenRequestor(): TokenRequestor = tokenRequestor.getRequired("token_requestor")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Card this Digital Wallet Token belongs to. */
    @JsonProperty("card_id")
    @ExcludeMissing
    fun _cardId() = cardId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
     * the Card was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt() = createdAt

    /** The Digital Wallet Token identifier. */
    @JsonProperty("id")
    @ExcludeMissing
    fun _id() = id

    /** This indicates if payments can be made with the Digital Wallet Token. */
    @JsonProperty("status")
    @ExcludeMissing
    fun _status() = status

    /** The digital wallet app being used. */
    @JsonProperty("token_requestor")
    @ExcludeMissing
    fun _tokenRequestor() = tokenRequestor

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token`.
     */
    @JsonProperty("type")
    @ExcludeMissing
    fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): DigitalWalletToken = apply {
        if (!validated) {
          cardId()
          createdAt()
          id()
          status()
          tokenRequestor()
          type()
          validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
      if (this === other) {
          return true
      }

      return other is DigitalWalletToken &&
          this.cardId == other.cardId &&
          this.createdAt == other.createdAt &&
          this.id == other.id &&
          this.status == other.status &&
          this.tokenRequestor == other.tokenRequestor &&
          this.type == other.type &&
          this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
      if (hashCode == 0) {
        hashCode = Objects.hash(
            cardId,
            createdAt,
            id,
            status,
            tokenRequestor,
            type,
            additionalProperties,
        )
      }
      return hashCode
    }

    override fun toString() = "DigitalWalletToken{cardId=$cardId, createdAt=$createdAt, id=$id, status=$status, tokenRequestor=$tokenRequestor, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var cardId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var tokenRequestor: JsonField<TokenRequestor> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
            this.cardId = digitalWalletToken.cardId
            this.createdAt = digitalWalletToken.createdAt
            this.id = digitalWalletToken.id
            this.status = digitalWalletToken.status
            this.tokenRequestor = digitalWalletToken.tokenRequestor
            this.type = digitalWalletToken.type
            additionalProperties(digitalWalletToken.additionalProperties)
        }

        /** The identifier for the Card this Digital Wallet Token belongs to. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /** The identifier for the Card this Digital Wallet Token belongs to. */
        @JsonProperty("card_id")
        @ExcludeMissing
        fun cardId(cardId: JsonField<String>) = apply {
            this.cardId = cardId
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Card was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which
         * the Card was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
            this.createdAt = createdAt
        }

        /** The Digital Wallet Token identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Digital Wallet Token identifier. */
        @JsonProperty("id")
        @ExcludeMissing
        fun id(id: JsonField<String>) = apply {
            this.id = id
        }

        /** This indicates if payments can be made with the Digital Wallet Token. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if payments can be made with the Digital Wallet Token. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply {
            this.status = status
        }

        /** The digital wallet app being used. */
        fun tokenRequestor(tokenRequestor: TokenRequestor) = tokenRequestor(JsonField.of(tokenRequestor))

        /** The digital wallet app being used. */
        @JsonProperty("token_requestor")
        @ExcludeMissing
        fun tokenRequestor(tokenRequestor: JsonField<TokenRequestor>) = apply {
            this.tokenRequestor = tokenRequestor
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_wallet_token`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_wallet_token`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply {
            this.type = type
        }

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

        fun build(): DigitalWalletToken = DigitalWalletToken(
            cardId,
            createdAt,
            id,
            status,
            tokenRequestor,
            type,
            additionalProperties.toUnmodifiable(),
        )
    }

    class Status @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Status &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val INACTIVE = Status(JsonField.of("inactive"))

            val SUSPENDED = Status(JsonField.of("suspended"))

            val DEACTIVATED = Status(JsonField.of("deactivated"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            INACTIVE,
            SUSPENDED,
            DEACTIVATED,
        }

        enum class Value {
            ACTIVE,
            INACTIVE,
            SUSPENDED,
            DEACTIVATED,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            ACTIVE -> Value.ACTIVE
            INACTIVE -> Value.INACTIVE
            SUSPENDED -> Value.SUSPENDED
            DEACTIVATED -> Value.DEACTIVATED
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            ACTIVE -> Known.ACTIVE
            INACTIVE -> Known.INACTIVE
            SUSPENDED -> Known.SUSPENDED
            DEACTIVATED -> Known.DEACTIVATED
            else -> throw IncreaseInvalidDataException("Unknown Status: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class TokenRequestor @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is TokenRequestor &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val APPLE_PAY = TokenRequestor(JsonField.of("apple_pay"))

            val GOOGLE_PAY = TokenRequestor(JsonField.of("google_pay"))

            val SAMSUNG_PAY = TokenRequestor(JsonField.of("samsung_pay"))

            val UNKNOWN = TokenRequestor(JsonField.of("unknown"))

            fun of(value: String) = TokenRequestor(JsonField.of(value))
        }

        enum class Known {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            UNKNOWN,
        }

        enum class Value {
            APPLE_PAY,
            GOOGLE_PAY,
            SAMSUNG_PAY,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            APPLE_PAY -> Value.APPLE_PAY
            GOOGLE_PAY -> Value.GOOGLE_PAY
            SAMSUNG_PAY -> Value.SAMSUNG_PAY
            UNKNOWN -> Value.UNKNOWN
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            APPLE_PAY -> Known.APPLE_PAY
            GOOGLE_PAY -> Known.GOOGLE_PAY
            SAMSUNG_PAY -> Known.SAMSUNG_PAY
            UNKNOWN -> Known.UNKNOWN
            else -> throw IncreaseInvalidDataException("Unknown TokenRequestor: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type @JsonCreator private constructor(private val value: JsonField<String>, ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue
        fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
          if (this === other) {
              return true
          }

          return other is Type &&
              this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val DIGITAL_WALLET_TOKEN = Type(JsonField.of("digital_wallet_token"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            DIGITAL_WALLET_TOKEN,
        }

        enum class Value {
            DIGITAL_WALLET_TOKEN,
            _UNKNOWN,
        }

        fun value(): Value = when (this) {
            DIGITAL_WALLET_TOKEN -> Value.DIGITAL_WALLET_TOKEN
            else -> Value._UNKNOWN
        }

        fun known(): Known = when (this) {
            DIGITAL_WALLET_TOKEN -> Known.DIGITAL_WALLET_TOKEN
            else -> throw IncreaseInvalidDataException("Unknown Type: $value")
        }

        fun asString(): String = _value().asStringOrThrow()
    }
}
