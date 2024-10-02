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
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Accounts are your bank accounts with Increase. They store money, receive transfers, and send
 * payments. They earn interest and have depository insurance.
 */
@JsonDeserialize(builder = Account.Builder::class)
@NoAutoDetect
class Account
private constructor(
    private val bank: JsonField<Bank>,
    private val closedAt: JsonField<OffsetDateTime>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val entityId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val informationalEntityId: JsonField<String>,
    private val interestAccrued: JsonField<String>,
    private val interestAccruedAt: JsonField<LocalDate>,
    private val interestRate: JsonField<String>,
    private val name: JsonField<String>,
    private val programId: JsonField<String>,
    private val status: JsonField<Status>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    /** The bank the Account is with. */
    fun bank(): Bank = bank.getRequired("bank")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was closed.
     */
    fun closedAt(): OffsetDateTime? = closedAt.getNullable("closed_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
    fun currency(): Currency = currency.getRequired("currency")

    /** The identifier for the Entity the Account belongs to. */
    fun entityId(): String? = entityId.getNullable("entity_id")

    /** The Account identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity.
     */
    fun informationalEntityId(): String? =
        informationalEntityId.getNullable("informational_entity_id")

    /**
     * The interest accrued but not yet paid, expressed as a string containing a floating-point
     * value.
     */
    fun interestAccrued(): String = interestAccrued.getRequired("interest_accrued")

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
     * accrued.
     */
    fun interestAccruedAt(): LocalDate? = interestAccruedAt.getNullable("interest_accrued_at")

    /**
     * The Interest Rate currently being earned on the account, as a string containing a decimal
     * number. For example, a 1% interest rate would be represented as "0.01".
     */
    fun interestRate(): String = interestRate.getRequired("interest_rate")

    /** The name you choose for the Account. */
    fun name(): String = name.getRequired("name")

    /**
     * The identifier of the Program determining the compliance and commercial terms of this
     * Account.
     */
    fun programId(): String = programId.getRequired("program_id")

    /** The status of the Account. */
    fun status(): Status = status.getRequired("status")

    /** A constant representing the object's type. For this resource it will always be `account`. */
    fun type(): Type = type.getRequired("type")

    /** The bank the Account is with. */
    @JsonProperty("bank") @ExcludeMissing fun _bank() = bank

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was closed.
     */
    @JsonProperty("closed_at") @ExcludeMissing fun _closedAt() = closedAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The identifier for the Entity the Account belongs to. */
    @JsonProperty("entity_id") @ExcludeMissing fun _entityId() = entityId

    /** The Account identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * The identifier of an Entity that, while not owning the Account, is associated with its
     * activity.
     */
    @JsonProperty("informational_entity_id")
    @ExcludeMissing
    fun _informationalEntityId() = informationalEntityId

    /**
     * The interest accrued but not yet paid, expressed as a string containing a floating-point
     * value.
     */
    @JsonProperty("interest_accrued") @ExcludeMissing fun _interestAccrued() = interestAccrued

    /**
     * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
     * accrued.
     */
    @JsonProperty("interest_accrued_at")
    @ExcludeMissing
    fun _interestAccruedAt() = interestAccruedAt

    /**
     * The Interest Rate currently being earned on the account, as a string containing a decimal
     * number. For example, a 1% interest rate would be represented as "0.01".
     */
    @JsonProperty("interest_rate") @ExcludeMissing fun _interestRate() = interestRate

    /** The name you choose for the Account. */
    @JsonProperty("name") @ExcludeMissing fun _name() = name

    /**
     * The identifier of the Program determining the compliance and commercial terms of this
     * Account.
     */
    @JsonProperty("program_id") @ExcludeMissing fun _programId() = programId

    /** The status of the Account. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /** A constant representing the object's type. For this resource it will always be `account`. */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Account = apply {
        if (!validated) {
            bank()
            closedAt()
            createdAt()
            currency()
            entityId()
            id()
            idempotencyKey()
            informationalEntityId()
            interestAccrued()
            interestAccruedAt()
            interestRate()
            name()
            programId()
            status()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var bank: JsonField<Bank> = JsonMissing.of()
        private var closedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var entityId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var informationalEntityId: JsonField<String> = JsonMissing.of()
        private var interestAccrued: JsonField<String> = JsonMissing.of()
        private var interestAccruedAt: JsonField<LocalDate> = JsonMissing.of()
        private var interestRate: JsonField<String> = JsonMissing.of()
        private var name: JsonField<String> = JsonMissing.of()
        private var programId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(account: Account) = apply {
            this.bank = account.bank
            this.closedAt = account.closedAt
            this.createdAt = account.createdAt
            this.currency = account.currency
            this.entityId = account.entityId
            this.id = account.id
            this.idempotencyKey = account.idempotencyKey
            this.informationalEntityId = account.informationalEntityId
            this.interestAccrued = account.interestAccrued
            this.interestAccruedAt = account.interestAccruedAt
            this.interestRate = account.interestRate
            this.name = account.name
            this.programId = account.programId
            this.status = account.status
            this.type = account.type
            additionalProperties(account.additionalProperties)
        }

        /** The bank the Account is with. */
        fun bank(bank: Bank) = bank(JsonField.of(bank))

        /** The bank the Account is with. */
        @JsonProperty("bank")
        @ExcludeMissing
        fun bank(bank: JsonField<Bank>) = apply { this.bank = bank }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        fun closedAt(closedAt: OffsetDateTime) = closedAt(JsonField.of(closedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * closed.
         */
        @JsonProperty("closed_at")
        @ExcludeMissing
        fun closedAt(closedAt: JsonField<OffsetDateTime>) = apply { this.closedAt = closedAt }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the Account was
         * created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Account currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The identifier for the Entity the Account belongs to. */
        fun entityId(entityId: String) = entityId(JsonField.of(entityId))

        /** The identifier for the Entity the Account belongs to. */
        @JsonProperty("entity_id")
        @ExcludeMissing
        fun entityId(entityId: JsonField<String>) = apply { this.entityId = entityId }

        /** The Account identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Account identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String) = idempotencyKey(JsonField.of(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        fun informationalEntityId(informationalEntityId: String) =
            informationalEntityId(JsonField.of(informationalEntityId))

        /**
         * The identifier of an Entity that, while not owning the Account, is associated with its
         * activity.
         */
        @JsonProperty("informational_entity_id")
        @ExcludeMissing
        fun informationalEntityId(informationalEntityId: JsonField<String>) = apply {
            this.informationalEntityId = informationalEntityId
        }

        /**
         * The interest accrued but not yet paid, expressed as a string containing a floating-point
         * value.
         */
        fun interestAccrued(interestAccrued: String) =
            interestAccrued(JsonField.of(interestAccrued))

        /**
         * The interest accrued but not yet paid, expressed as a string containing a floating-point
         * value.
         */
        @JsonProperty("interest_accrued")
        @ExcludeMissing
        fun interestAccrued(interestAccrued: JsonField<String>) = apply {
            this.interestAccrued = interestAccrued
        }

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        fun interestAccruedAt(interestAccruedAt: LocalDate) =
            interestAccruedAt(JsonField.of(interestAccruedAt))

        /**
         * The latest [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which interest was
         * accrued.
         */
        @JsonProperty("interest_accrued_at")
        @ExcludeMissing
        fun interestAccruedAt(interestAccruedAt: JsonField<LocalDate>) = apply {
            this.interestAccruedAt = interestAccruedAt
        }

        /**
         * The Interest Rate currently being earned on the account, as a string containing a decimal
         * number. For example, a 1% interest rate would be represented as "0.01".
         */
        fun interestRate(interestRate: String) = interestRate(JsonField.of(interestRate))

        /**
         * The Interest Rate currently being earned on the account, as a string containing a decimal
         * number. For example, a 1% interest rate would be represented as "0.01".
         */
        @JsonProperty("interest_rate")
        @ExcludeMissing
        fun interestRate(interestRate: JsonField<String>) = apply {
            this.interestRate = interestRate
        }

        /** The name you choose for the Account. */
        fun name(name: String) = name(JsonField.of(name))

        /** The name you choose for the Account. */
        @JsonProperty("name")
        @ExcludeMissing
        fun name(name: JsonField<String>) = apply { this.name = name }

        /**
         * The identifier of the Program determining the compliance and commercial terms of this
         * Account.
         */
        fun programId(programId: String) = programId(JsonField.of(programId))

        /**
         * The identifier of the Program determining the compliance and commercial terms of this
         * Account.
         */
        @JsonProperty("program_id")
        @ExcludeMissing
        fun programId(programId: JsonField<String>) = apply { this.programId = programId }

        /** The status of the Account. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The status of the Account. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be `account`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be `account`.
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

        fun build(): Account =
            Account(
                bank,
                closedAt,
                createdAt,
                currency,
                entityId,
                id,
                idempotencyKey,
                informationalEntityId,
                interestAccrued,
                interestAccruedAt,
                interestRate,
                name,
                programId,
                status,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Bank
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Bank && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val BLUE_RIDGE_BANK = Bank(JsonField.of("blue_ridge_bank"))

            val FIRST_INTERNET_BANK = Bank(JsonField.of("first_internet_bank"))

            val GRASSHOPPER_BANK = Bank(JsonField.of("grasshopper_bank"))

            fun of(value: String) = Bank(JsonField.of(value))
        }

        enum class Known {
            BLUE_RIDGE_BANK,
            FIRST_INTERNET_BANK,
            GRASSHOPPER_BANK,
        }

        enum class Value {
            BLUE_RIDGE_BANK,
            FIRST_INTERNET_BANK,
            GRASSHOPPER_BANK,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BLUE_RIDGE_BANK -> Value.BLUE_RIDGE_BANK
                FIRST_INTERNET_BANK -> Value.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Value.GRASSHOPPER_BANK
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BLUE_RIDGE_BANK -> Known.BLUE_RIDGE_BANK
                FIRST_INTERNET_BANK -> Known.FIRST_INTERNET_BANK
                GRASSHOPPER_BANK -> Known.GRASSHOPPER_BANK
                else -> throw IncreaseInvalidDataException("Unknown Bank: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CAD = Currency(JsonField.of("CAD"))

            val CHF = Currency(JsonField.of("CHF"))

            val EUR = Currency(JsonField.of("EUR"))

            val GBP = Currency(JsonField.of("GBP"))

            val JPY = Currency(JsonField.of("JPY"))

            val USD = Currency(JsonField.of("USD"))

            fun of(value: String) = Currency(JsonField.of(value))
        }

        enum class Known {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
        }

        enum class Value {
            CAD,
            CHF,
            EUR,
            GBP,
            JPY,
            USD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val OPEN = Status(JsonField.of("open"))

            val CLOSED = Status(JsonField.of("closed"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            OPEN,
            CLOSED,
        }

        enum class Value {
            OPEN,
            CLOSED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                OPEN -> Value.OPEN
                CLOSED -> Value.CLOSED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                OPEN -> Known.OPEN
                CLOSED -> Known.CLOSED
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

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

            val ACCOUNT = Type(JsonField.of("account"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT,
        }

        enum class Value {
            ACCOUNT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT -> Value.ACCOUNT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT -> Known.ACCOUNT
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Account &&
            this.bank == other.bank &&
            this.closedAt == other.closedAt &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.entityId == other.entityId &&
            this.id == other.id &&
            this.idempotencyKey == other.idempotencyKey &&
            this.informationalEntityId == other.informationalEntityId &&
            this.interestAccrued == other.interestAccrued &&
            this.interestAccruedAt == other.interestAccruedAt &&
            this.interestRate == other.interestRate &&
            this.name == other.name &&
            this.programId == other.programId &&
            this.status == other.status &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    private var hashCode: Int = 0

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    bank,
                    closedAt,
                    createdAt,
                    currency,
                    entityId,
                    id,
                    idempotencyKey,
                    informationalEntityId,
                    interestAccrued,
                    interestAccruedAt,
                    interestRate,
                    name,
                    programId,
                    status,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Account{bank=$bank, closedAt=$closedAt, createdAt=$createdAt, currency=$currency, entityId=$entityId, id=$id, idempotencyKey=$idempotencyKey, informationalEntityId=$informationalEntityId, interestAccrued=$interestAccrued, interestAccruedAt=$interestAccruedAt, interestRate=$interestRate, name=$name, programId=$programId, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
