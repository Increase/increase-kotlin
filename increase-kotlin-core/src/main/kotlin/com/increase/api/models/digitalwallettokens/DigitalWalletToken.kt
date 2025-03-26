// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.Enum
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Collections
import java.util.Objects

/**
 * A Digital Wallet Token is created when a user adds a Card to their Apple Pay or Google Pay app.
 * The Digital Wallet Token can be used for purchases just like a Card.
 */
class DigitalWalletToken
private constructor(
    private val id: JsonField<String>,
    private val cardId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val status: JsonField<Status>,
    private val tokenRequestor: JsonField<TokenRequestor>,
    private val type: JsonField<Type>,
    private val updates: JsonField<List<Update>>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("card_id") @ExcludeMissing cardId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("token_requestor")
        @ExcludeMissing
        tokenRequestor: JsonField<TokenRequestor> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        @JsonProperty("updates") @ExcludeMissing updates: JsonField<List<Update>> = JsonMissing.of(),
    ) : this(id, cardId, createdAt, status, tokenRequestor, type, updates, mutableMapOf())

    /**
     * The Digital Wallet Token identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the Card this Digital Wallet Token belongs to.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun cardId(): String = cardId.getRequired("card_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
     * Wallet Token was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * This indicates if payments can be made with the Digital Wallet Token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * The digital wallet app being used.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun tokenRequestor(): TokenRequestor = tokenRequestor.getRequired("token_requestor")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Updates to the Digital Wallet Token.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun updates(): List<Update> = updates.getRequired("updates")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [cardId].
     *
     * Unlike [cardId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("card_id") @ExcludeMissing fun _cardId(): JsonField<String> = cardId

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [tokenRequestor].
     *
     * Unlike [tokenRequestor], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("token_requestor")
    @ExcludeMissing
    fun _tokenRequestor(): JsonField<TokenRequestor> = tokenRequestor

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    /**
     * Returns the raw JSON value of [updates].
     *
     * Unlike [updates], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("updates") @ExcludeMissing fun _updates(): JsonField<List<Update>> = updates

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
         * Returns a mutable builder for constructing an instance of [DigitalWalletToken].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .cardId()
         * .createdAt()
         * .status()
         * .tokenRequestor()
         * .type()
         * .updates()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [DigitalWalletToken]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var cardId: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var status: JsonField<Status>? = null
        private var tokenRequestor: JsonField<TokenRequestor>? = null
        private var type: JsonField<Type>? = null
        private var updates: JsonField<MutableList<Update>>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(digitalWalletToken: DigitalWalletToken) = apply {
            id = digitalWalletToken.id
            cardId = digitalWalletToken.cardId
            createdAt = digitalWalletToken.createdAt
            status = digitalWalletToken.status
            tokenRequestor = digitalWalletToken.tokenRequestor
            type = digitalWalletToken.type
            updates = digitalWalletToken.updates.map { it.toMutableList() }
            additionalProperties = digitalWalletToken.additionalProperties.toMutableMap()
        }

        /** The Digital Wallet Token identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the Card this Digital Wallet Token belongs to. */
        fun cardId(cardId: String) = cardId(JsonField.of(cardId))

        /**
         * Sets [Builder.cardId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cardId] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun cardId(cardId: JsonField<String>) = apply { this.cardId = cardId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Digital
         * Wallet Token was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * Sets [Builder.createdAt] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** This indicates if payments can be made with the Digital Wallet Token. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The digital wallet app being used. */
        fun tokenRequestor(tokenRequestor: TokenRequestor) =
            tokenRequestor(JsonField.of(tokenRequestor))

        /**
         * Sets [Builder.tokenRequestor] to an arbitrary JSON value.
         *
         * You should usually call [Builder.tokenRequestor] with a well-typed [TokenRequestor] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun tokenRequestor(tokenRequestor: JsonField<TokenRequestor>) = apply {
            this.tokenRequestor = tokenRequestor
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `digital_wallet_token`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /** Updates to the Digital Wallet Token. */
        fun updates(updates: List<Update>) = updates(JsonField.of(updates))

        /**
         * Sets [Builder.updates] to an arbitrary JSON value.
         *
         * You should usually call [Builder.updates] with a well-typed `List<Update>` value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun updates(updates: JsonField<List<Update>>) = apply {
            this.updates = updates.map { it.toMutableList() }
        }

        /**
         * Adds a single [Update] to [updates].
         *
         * @throws IllegalStateException if the field was previously set to a non-list.
         */
        fun addUpdate(update: Update) = apply {
            updates =
                (updates ?: JsonField.of(mutableListOf())).also {
                    checkKnown("updates", it).add(update)
                }
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
         * Returns an immutable instance of [DigitalWalletToken].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .cardId()
         * .createdAt()
         * .status()
         * .tokenRequestor()
         * .type()
         * .updates()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): DigitalWalletToken =
            DigitalWalletToken(
                checkRequired("id", id),
                checkRequired("cardId", cardId),
                checkRequired("createdAt", createdAt),
                checkRequired("status", status),
                checkRequired("tokenRequestor", tokenRequestor),
                checkRequired("type", type),
                checkRequired("updates", updates).map { it.toImmutable() },
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): DigitalWalletToken = apply {
        if (validated) {
            return@apply
        }

        id()
        cardId()
        createdAt()
        status()
        tokenRequestor()
        type()
        updates().forEach { it.validate() }
        validated = true
    }

    /** This indicates if payments can be made with the Digital Wallet Token. */
    class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** The digital wallet token is active. */
            val ACTIVE = of("active")

            /**
             * The digital wallet token has been created but not successfully activated via
             * two-factor authentication yet.
             */
            val INACTIVE = of("inactive")

            /** The digital wallet token has been temporarily paused. */
            val SUSPENDED = of("suspended")

            /** The digital wallet token has been permanently canceled. */
            val DEACTIVATED = of("deactivated")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The digital wallet token is active. */
            ACTIVE,
            /**
             * The digital wallet token has been created but not successfully activated via
             * two-factor authentication yet.
             */
            INACTIVE,
            /** The digital wallet token has been temporarily paused. */
            SUSPENDED,
            /** The digital wallet token has been permanently canceled. */
            DEACTIVATED,
        }

        /**
         * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Status] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The digital wallet token is active. */
            ACTIVE,
            /**
             * The digital wallet token has been created but not successfully activated via
             * two-factor authentication yet.
             */
            INACTIVE,
            /** The digital wallet token has been temporarily paused. */
            SUSPENDED,
            /** The digital wallet token has been permanently canceled. */
            DEACTIVATED,
            /** An enum member indicating that [Status] was instantiated with an unknown value. */
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
                ACTIVE -> Value.ACTIVE
                INACTIVE -> Value.INACTIVE
                SUSPENDED -> Value.SUSPENDED
                DEACTIVATED -> Value.DEACTIVATED
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
                ACTIVE -> Known.ACTIVE
                INACTIVE -> Known.INACTIVE
                SUSPENDED -> Known.SUSPENDED
                DEACTIVATED -> Known.DEACTIVATED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The digital wallet app being used. */
    class TokenRequestor @JsonCreator private constructor(private val value: JsonField<String>) :
        Enum {

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

            /** Apple Pay */
            val APPLE_PAY = of("apple_pay")

            /** Google Pay */
            val GOOGLE_PAY = of("google_pay")

            /** Samsung Pay */
            val SAMSUNG_PAY = of("samsung_pay")

            /** Unknown */
            val UNKNOWN = of("unknown")

            fun of(value: String) = TokenRequestor(JsonField.of(value))
        }

        /** An enum containing [TokenRequestor]'s known values. */
        enum class Known {
            /** Apple Pay */
            APPLE_PAY,
            /** Google Pay */
            GOOGLE_PAY,
            /** Samsung Pay */
            SAMSUNG_PAY,
            /** Unknown */
            UNKNOWN,
        }

        /**
         * An enum containing [TokenRequestor]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TokenRequestor] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Apple Pay */
            APPLE_PAY,
            /** Google Pay */
            GOOGLE_PAY,
            /** Samsung Pay */
            SAMSUNG_PAY,
            /** Unknown */
            UNKNOWN,
            /**
             * An enum member indicating that [TokenRequestor] was instantiated with an unknown
             * value.
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
                APPLE_PAY -> Value.APPLE_PAY
                GOOGLE_PAY -> Value.GOOGLE_PAY
                SAMSUNG_PAY -> Value.SAMSUNG_PAY
                UNKNOWN -> Value.UNKNOWN
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
                APPLE_PAY -> Known.APPLE_PAY
                GOOGLE_PAY -> Known.GOOGLE_PAY
                SAMSUNG_PAY -> Known.SAMSUNG_PAY
                UNKNOWN -> Known.UNKNOWN
                else -> throw IncreaseInvalidDataException("Unknown TokenRequestor: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is TokenRequestor && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `digital_wallet_token`.
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

            val DIGITAL_WALLET_TOKEN = of("digital_wallet_token")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            DIGITAL_WALLET_TOKEN
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
            DIGITAL_WALLET_TOKEN,
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
                DIGITAL_WALLET_TOKEN -> Value.DIGITAL_WALLET_TOKEN
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
                DIGITAL_WALLET_TOKEN -> Known.DIGITAL_WALLET_TOKEN
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Type && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Update
    private constructor(
        private val status: JsonField<Status>,
        private val timestamp: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("timestamp")
            @ExcludeMissing
            timestamp: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(status, timestamp, mutableMapOf())

        /**
         * The status the update changed this Digital Wallet Token to.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun status(): Status = status.getRequired("status")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the update
         * happened.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun timestamp(): OffsetDateTime = timestamp.getRequired("timestamp")

        /**
         * Returns the raw JSON value of [status].
         *
         * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

        /**
         * Returns the raw JSON value of [timestamp].
         *
         * Unlike [timestamp], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("timestamp")
        @ExcludeMissing
        fun _timestamp(): JsonField<OffsetDateTime> = timestamp

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
             * Returns a mutable builder for constructing an instance of [Update].
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * .timestamp()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Update]. */
        class Builder internal constructor() {

            private var status: JsonField<Status>? = null
            private var timestamp: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(update: Update) = apply {
                status = update.status
                timestamp = update.timestamp
                additionalProperties = update.additionalProperties.toMutableMap()
            }

            /** The status the update changed this Digital Wallet Token to. */
            fun status(status: Status) = status(JsonField.of(status))

            /**
             * Sets [Builder.status] to an arbitrary JSON value.
             *
             * You should usually call [Builder.status] with a well-typed [Status] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun status(status: JsonField<Status>) = apply { this.status = status }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * update happened.
             */
            fun timestamp(timestamp: OffsetDateTime) = timestamp(JsonField.of(timestamp))

            /**
             * Sets [Builder.timestamp] to an arbitrary JSON value.
             *
             * You should usually call [Builder.timestamp] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun timestamp(timestamp: JsonField<OffsetDateTime>) = apply {
                this.timestamp = timestamp
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
             * Returns an immutable instance of [Update].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .status()
             * .timestamp()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Update =
                Update(
                    checkRequired("status", status),
                    checkRequired("timestamp", timestamp),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Update = apply {
            if (validated) {
                return@apply
            }

            status()
            timestamp()
            validated = true
        }

        /** The status the update changed this Digital Wallet Token to. */
        class Status @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

            /**
             * Returns this class instance's raw value.
             *
             * This is usually only useful if this instance was deserialized from data that doesn't
             * match any known member, and you want to know that value. For example, if the SDK is
             * on an older version than the API, then the API may respond with new members that the
             * SDK is unaware of.
             */
            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                /** The digital wallet token is active. */
                val ACTIVE = of("active")

                /**
                 * The digital wallet token has been created but not successfully activated via
                 * two-factor authentication yet.
                 */
                val INACTIVE = of("inactive")

                /** The digital wallet token has been temporarily paused. */
                val SUSPENDED = of("suspended")

                /** The digital wallet token has been permanently canceled. */
                val DEACTIVATED = of("deactivated")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /** The digital wallet token is active. */
                ACTIVE,
                /**
                 * The digital wallet token has been created but not successfully activated via
                 * two-factor authentication yet.
                 */
                INACTIVE,
                /** The digital wallet token has been temporarily paused. */
                SUSPENDED,
                /** The digital wallet token has been permanently canceled. */
                DEACTIVATED,
            }

            /**
             * An enum containing [Status]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Status] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The digital wallet token is active. */
                ACTIVE,
                /**
                 * The digital wallet token has been created but not successfully activated via
                 * two-factor authentication yet.
                 */
                INACTIVE,
                /** The digital wallet token has been temporarily paused. */
                SUSPENDED,
                /** The digital wallet token has been permanently canceled. */
                DEACTIVATED,
                /**
                 * An enum member indicating that [Status] was instantiated with an unknown value.
                 */
                _UNKNOWN,
            }

            /**
             * Returns an enum member corresponding to this class instance's value, or
             * [Value._UNKNOWN] if the class was instantiated with an unknown value.
             *
             * Use the [known] method instead if you're certain the value is always known or if you
             * want to throw for the unknown case.
             */
            fun value(): Value =
                when (this) {
                    ACTIVE -> Value.ACTIVE
                    INACTIVE -> Value.INACTIVE
                    SUSPENDED -> Value.SUSPENDED
                    DEACTIVATED -> Value.DEACTIVATED
                    else -> Value._UNKNOWN
                }

            /**
             * Returns an enum member corresponding to this class instance's value.
             *
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
             *
             * @throws IncreaseInvalidDataException if this class instance's value is a not a known
             *   member.
             */
            fun known(): Known =
                when (this) {
                    ACTIVE -> Known.ACTIVE
                    INACTIVE -> Known.INACTIVE
                    SUSPENDED -> Known.SUSPENDED
                    DEACTIVATED -> Known.DEACTIVATED
                    else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                }

            /**
             * Returns this class instance's primitive wire representation.
             *
             * This differs from the [toString] method because that method is primarily for
             * debugging and generally doesn't throw.
             *
             * @throws IncreaseInvalidDataException if this class instance's value does not have the
             *   expected primitive type.
             */
            fun asString(): String =
                _value().asString() ?: throw IncreaseInvalidDataException("Value is not a String")

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Status && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Update && status == other.status && timestamp == other.timestamp && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(status, timestamp, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Update{status=$status, timestamp=$timestamp, additionalProperties=$additionalProperties}"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletToken && id == other.id && cardId == other.cardId && createdAt == other.createdAt && status == other.status && tokenRequestor == other.tokenRequestor && type == other.type && updates == other.updates && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, cardId, createdAt, status, tokenRequestor, type, updates, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "DigitalWalletToken{id=$id, cardId=$cardId, createdAt=$createdAt, status=$status, tokenRequestor=$tokenRequestor, type=$type, updates=$updates, additionalProperties=$additionalProperties}"
}
