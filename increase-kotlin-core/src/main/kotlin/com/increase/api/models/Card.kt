package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Cards are commercial credit cards. They'll immediately work for online purchases after you create
 * them. All cards maintain a credit limit of 100% of the Account’s available balance at the time of
 * transaction. Funds are deducted from the Account upon transaction settlement.
 */
@JsonDeserialize(builder = Card.Builder::class)
@NoAutoDetect
class Card
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val last4: JsonField<String>,
    private val expirationMonth: JsonField<Long>,
    private val expirationYear: JsonField<Long>,
    private val status: JsonField<Status>,
    private val billingAddress: JsonField<BillingAddress>,
    private val digitalWallet: JsonField<DigitalWallet>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The card identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the account this card belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card was
     * created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The card's description for display purposes. */
    fun description(): String? = description.getNullable("description")

    /** The last 4 digits of the Card's Primary Account Number. */
    fun last4(): String = last4.getRequired("last4")

    /** The month the card expires in M format (e.g., August is 8). */
    fun expirationMonth(): Long = expirationMonth.getRequired("expiration_month")

    /** The year the card expires in YYYY format (e.g., 2025). */
    fun expirationYear(): Long = expirationYear.getRequired("expiration_year")

    /** This indicates if payments can be made with the card. */
    fun status(): Status = status.getRequired("status")

    /** The Card's billing address. */
    fun billingAddress(): BillingAddress = billingAddress.getRequired("billing_address")

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    fun digitalWallet(): DigitalWallet? = digitalWallet.getNullable("digital_wallet")

    /** A constant representing the object's type. For this resource it will always be `card`. */
    fun type(): Type = type.getRequired("type")

    /** The card identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /** The identifier for the account this card belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card was
     * created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The card's description for display purposes. */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The last 4 digits of the Card's Primary Account Number. */
    @JsonProperty("last4") @ExcludeMissing fun _last4() = last4

    /** The month the card expires in M format (e.g., August is 8). */
    @JsonProperty("expiration_month") @ExcludeMissing fun _expirationMonth() = expirationMonth

    /** The year the card expires in YYYY format (e.g., 2025). */
    @JsonProperty("expiration_year") @ExcludeMissing fun _expirationYear() = expirationYear

    /** This indicates if payments can be made with the card. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** The Card's billing address. */
    @JsonProperty("billing_address") @ExcludeMissing fun _billingAddress() = billingAddress

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonProperty("digital_wallet") @ExcludeMissing fun _digitalWallet() = digitalWallet

    /** A constant representing the object's type. For this resource it will always be `card`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Card = apply {
        if (!validated) {
            id()
            accountId()
            createdAt()
            description()
            last4()
            expirationMonth()
            expirationYear()
            status()
            billingAddress().validate()
            digitalWallet()?.validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Card &&
            this.id == other.id &&
            this.accountId == other.accountId &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.last4 == other.last4 &&
            this.expirationMonth == other.expirationMonth &&
            this.expirationYear == other.expirationYear &&
            this.status == other.status &&
            this.billingAddress == other.billingAddress &&
            this.digitalWallet == other.digitalWallet &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    id,
                    accountId,
                    createdAt,
                    description,
                    last4,
                    expirationMonth,
                    expirationYear,
                    status,
                    billingAddress,
                    digitalWallet,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Card{id=$id, accountId=$accountId, createdAt=$createdAt, description=$description, last4=$last4, expirationMonth=$expirationMonth, expirationYear=$expirationYear, status=$status, billingAddress=$billingAddress, digitalWallet=$digitalWallet, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var id: JsonField<String> = JsonMissing.of()
        private var accountId: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var last4: JsonField<String> = JsonMissing.of()
        private var expirationMonth: JsonField<Long> = JsonMissing.of()
        private var expirationYear: JsonField<Long> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var billingAddress: JsonField<BillingAddress> = JsonMissing.of()
        private var digitalWallet: JsonField<DigitalWallet> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(card: Card) = apply {
            this.id = card.id
            this.accountId = card.accountId
            this.createdAt = card.createdAt
            this.description = card.description
            this.last4 = card.last4
            this.expirationMonth = card.expirationMonth
            this.expirationYear = card.expirationYear
            this.status = card.status
            this.billingAddress = card.billingAddress
            this.digitalWallet = card.digitalWallet
            this.type = card.type
            additionalProperties(card.additionalProperties)
        }

        /** The card identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The card identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the account this card belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this card belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the Card
         * was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The card's description for display purposes. */
        fun description(description: String) = description(JsonField.of(description))

        /** The card's description for display purposes. */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The last 4 digits of the Card's Primary Account Number. */
        fun last4(last4: String) = last4(JsonField.of(last4))

        /** The last 4 digits of the Card's Primary Account Number. */
        @JsonProperty("last4")
        @ExcludeMissing
        fun last4(last4: JsonField<String>) = apply { this.last4 = last4 }

        /** The month the card expires in M format (e.g., August is 8). */
        fun expirationMonth(expirationMonth: Long) = expirationMonth(JsonField.of(expirationMonth))

        /** The month the card expires in M format (e.g., August is 8). */
        @JsonProperty("expiration_month")
        @ExcludeMissing
        fun expirationMonth(expirationMonth: JsonField<Long>) = apply {
            this.expirationMonth = expirationMonth
        }

        /** The year the card expires in YYYY format (e.g., 2025). */
        fun expirationYear(expirationYear: Long) = expirationYear(JsonField.of(expirationYear))

        /** The year the card expires in YYYY format (e.g., 2025). */
        @JsonProperty("expiration_year")
        @ExcludeMissing
        fun expirationYear(expirationYear: JsonField<Long>) = apply {
            this.expirationYear = expirationYear
        }

        /** This indicates if payments can be made with the card. */
        fun status(status: Status) = status(JsonField.of(status))

        /** This indicates if payments can be made with the card. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /** The Card's billing address. */
        fun billingAddress(billingAddress: BillingAddress) =
            billingAddress(JsonField.of(billingAddress))

        /** The Card's billing address. */
        @JsonProperty("billing_address")
        @ExcludeMissing
        fun billingAddress(billingAddress: JsonField<BillingAddress>) = apply {
            this.billingAddress = billingAddress
        }

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        fun digitalWallet(digitalWallet: DigitalWallet) = digitalWallet(JsonField.of(digitalWallet))

        /**
         * The contact information used in the two-factor steps for digital wallet card creation. At
         * least one field must be present to complete the digital wallet steps.
         */
        @JsonProperty("digital_wallet")
        @ExcludeMissing
        fun digitalWallet(digitalWallet: JsonField<DigitalWallet>) = apply {
            this.digitalWallet = digitalWallet
        }

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `card`.
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

        fun build(): Card =
            Card(
                id,
                accountId,
                createdAt,
                description,
                last4,
                expirationMonth,
                expirationYear,
                status,
                billingAddress,
                digitalWallet,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The Card's billing address. */
    @JsonDeserialize(builder = BillingAddress.Builder::class)
    @NoAutoDetect
    class BillingAddress
    private constructor(
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val postalCode: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The first line of the billing address. */
        fun line1(): String? = line1.getNullable("line1")

        /** The second line of the billing address. */
        fun line2(): String? = line2.getNullable("line2")

        /** The city of the billing address. */
        fun city(): String? = city.getNullable("city")

        /** The US state of the billing address. */
        fun state(): String? = state.getNullable("state")

        /** The postal code of the billing address. */
        fun postalCode(): String? = postalCode.getNullable("postal_code")

        /** The first line of the billing address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        /** The second line of the billing address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** The city of the billing address. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** The US state of the billing address. */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /** The postal code of the billing address. */
        @JsonProperty("postal_code") @ExcludeMissing fun _postalCode() = postalCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): BillingAddress = apply {
            if (!validated) {
                line1()
                line2()
                city()
                state()
                postalCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BillingAddress &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.postalCode == other.postalCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        line1,
                        line2,
                        city,
                        state,
                        postalCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "BillingAddress{line1=$line1, line2=$line2, city=$city, state=$state, postalCode=$postalCode, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var postalCode: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(billingAddress: BillingAddress) = apply {
                this.line1 = billingAddress.line1
                this.line2 = billingAddress.line2
                this.city = billingAddress.city
                this.state = billingAddress.state
                this.postalCode = billingAddress.postalCode
                additionalProperties(billingAddress.additionalProperties)
            }

            /** The first line of the billing address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the billing address. */
            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the billing address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the billing address. */
            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The city of the billing address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the billing address. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The US state of the billing address. */
            fun state(state: String) = state(JsonField.of(state))

            /** The US state of the billing address. */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The postal code of the billing address. */
            fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

            /** The postal code of the billing address. */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun postalCode(postalCode: JsonField<String>) = apply { this.postalCode = postalCode }

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

            fun build(): BillingAddress =
                BillingAddress(
                    line1,
                    line2,
                    city,
                    state,
                    postalCode,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /**
     * The contact information used in the two-factor steps for digital wallet card creation. At
     * least one field must be present to complete the digital wallet steps.
     */
    @JsonDeserialize(builder = DigitalWallet.Builder::class)
    @NoAutoDetect
    class DigitalWallet
    private constructor(
        private val email: JsonField<String>,
        private val phone: JsonField<String>,
        private val cardProfileId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        fun email(): String? = email.getNullable("email")

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        fun phone(): String? = phone.getNullable("phone")

        /**
         * The card profile assigned to this digital card. Card profiles may also be assigned at the
         * program level.
         */
        fun cardProfileId(): String? = cardProfileId.getNullable("card_profile_id")

        /**
         * An email address that can be used to verify the cardholder via one-time passcode over
         * email.
         */
        @JsonProperty("email") @ExcludeMissing fun _email() = email

        /**
         * A phone number that can be used to verify the cardholder via one-time passcode over SMS.
         */
        @JsonProperty("phone") @ExcludeMissing fun _phone() = phone

        /**
         * The card profile assigned to this digital card. Card profiles may also be assigned at the
         * program level.
         */
        @JsonProperty("card_profile_id") @ExcludeMissing fun _cardProfileId() = cardProfileId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): DigitalWallet = apply {
            if (!validated) {
                email()
                phone()
                cardProfileId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is DigitalWallet &&
                this.email == other.email &&
                this.phone == other.phone &&
                this.cardProfileId == other.cardProfileId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        email,
                        phone,
                        cardProfileId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "DigitalWallet{email=$email, phone=$phone, cardProfileId=$cardProfileId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var email: JsonField<String> = JsonMissing.of()
            private var phone: JsonField<String> = JsonMissing.of()
            private var cardProfileId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(digitalWallet: DigitalWallet) = apply {
                this.email = digitalWallet.email
                this.phone = digitalWallet.phone
                this.cardProfileId = digitalWallet.cardProfileId
                additionalProperties(digitalWallet.additionalProperties)
            }

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            fun email(email: String) = email(JsonField.of(email))

            /**
             * An email address that can be used to verify the cardholder via one-time passcode over
             * email.
             */
            @JsonProperty("email")
            @ExcludeMissing
            fun email(email: JsonField<String>) = apply { this.email = email }

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            fun phone(phone: String) = phone(JsonField.of(phone))

            /**
             * A phone number that can be used to verify the cardholder via one-time passcode over
             * SMS.
             */
            @JsonProperty("phone")
            @ExcludeMissing
            fun phone(phone: JsonField<String>) = apply { this.phone = phone }

            /**
             * The card profile assigned to this digital card. Card profiles may also be assigned at
             * the program level.
             */
            fun cardProfileId(cardProfileId: String) = cardProfileId(JsonField.of(cardProfileId))

            /**
             * The card profile assigned to this digital card. Card profiles may also be assigned at
             * the program level.
             */
            @JsonProperty("card_profile_id")
            @ExcludeMissing
            fun cardProfileId(cardProfileId: JsonField<String>) = apply {
                this.cardProfileId = cardProfileId
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

            fun build(): DigitalWallet =
                DigitalWallet(
                    email,
                    phone,
                    cardProfileId,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACTIVE = Status(JsonField.of("active"))

            val DISABLED = Status(JsonField.of("disabled"))

            val CANCELED = Status(JsonField.of("canceled"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            ACTIVE,
            DISABLED,
            CANCELED,
        }

        enum class Value {
            ACTIVE,
            DISABLED,
            CANCELED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACTIVE -> Value.ACTIVE
                DISABLED -> Value.DISABLED
                CANCELED -> Value.CANCELED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACTIVE -> Known.ACTIVE
                DISABLED -> Known.DISABLED
                CANCELED -> Known.CANCELED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CARD = Type(JsonField.of("card"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CARD,
        }

        enum class Value {
            CARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CARD -> Value.CARD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CARD -> Known.CARD
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
