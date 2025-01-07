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
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Pending Transactions are potential future additions and removals of money from your bank account.
 */
@NoAutoDetect
class PendingTransaction
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("completed_at")
    @ExcludeMissing
    private val completedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("description")
    @ExcludeMissing
    private val description: JsonField<String> = JsonMissing.of(),
    @JsonProperty("route_id")
    @ExcludeMissing
    private val routeId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("route_type")
    @ExcludeMissing
    private val routeType: JsonField<RouteType> = JsonMissing.of(),
    @JsonProperty("source")
    @ExcludeMissing
    private val source: JsonField<Source> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The Pending Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /** The identifier for the account this Pending Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Pending Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * was completed.
     */
    fun completedAt(): OffsetDateTime? = completedAt.getNullable("completed_at")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * occurred.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * For a Pending Transaction related to a transfer, this is the description you provide. For a
     * Pending Transaction related to a payment, this is the description the vendor provides.
     */
    fun description(): String = description.getRequired("description")

    /**
     * The identifier for the route this Pending Transaction came through. Routes are things like
     * cards and ACH details.
     */
    fun routeId(): String? = routeId.getNullable("route_id")

    /** The type of the route this Pending Transaction came through. */
    fun routeType(): RouteType? = routeType.getNullable("route_type")

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    fun source(): Source = source.getRequired("source")

    /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
    fun status(): Status = status.getRequired("status")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The Pending Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The identifier for the account this Pending Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * The Pending Transaction amount in the minor unit of its currency. For dollars, for example,
     * this is cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * was completed.
     */
    @JsonProperty("completed_at")
    @ExcludeMissing
    fun _completedAt(): JsonField<OffsetDateTime> = completedAt

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending Transaction
     * occurred.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
     * currency. This will match the currency on the Pending Transaction's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * For a Pending Transaction related to a transfer, this is the description you provide. For a
     * Pending Transaction related to a payment, this is the description the vendor provides.
     */
    @JsonProperty("description") @ExcludeMissing fun _description(): JsonField<String> = description

    /**
     * The identifier for the route this Pending Transaction came through. Routes are things like
     * cards and ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId(): JsonField<String> = routeId

    /** The type of the route this Pending Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType(): JsonField<RouteType> = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    @JsonProperty("source") @ExcludeMissing fun _source(): JsonField<Source> = source

    /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * A constant representing the object's type. For this resource it will always be
     * `pending_transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): PendingTransaction = apply {
        if (!validated) {
            id()
            accountId()
            amount()
            completedAt()
            createdAt()
            currency()
            description()
            routeId()
            routeType()
            source().validate()
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

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var completedAt: JsonField<OffsetDateTime>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var currency: JsonField<Currency>? = null
        private var description: JsonField<String>? = null
        private var routeId: JsonField<String>? = null
        private var routeType: JsonField<RouteType>? = null
        private var source: JsonField<Source>? = null
        private var status: JsonField<Status>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(pendingTransaction: PendingTransaction) = apply {
            id = pendingTransaction.id
            accountId = pendingTransaction.accountId
            amount = pendingTransaction.amount
            completedAt = pendingTransaction.completedAt
            createdAt = pendingTransaction.createdAt
            currency = pendingTransaction.currency
            description = pendingTransaction.description
            routeId = pendingTransaction.routeId
            routeType = pendingTransaction.routeType
            source = pendingTransaction.source
            status = pendingTransaction.status
            type = pendingTransaction.type
            additionalProperties = pendingTransaction.additionalProperties.toMutableMap()
        }

        /** The Pending Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Pending Transaction identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier for the account this Pending Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the account this Pending Transaction belongs to. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Pending Transaction amount in the minor unit of its currency. For dollars, for
         * example, this is cents.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(completedAt: OffsetDateTime?) =
            completedAt(JsonField.ofNullable(completedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction was completed.
         */
        fun completedAt(completedAt: JsonField<OffsetDateTime>) = apply {
            this.completedAt = completedAt
        }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Pending
         * Transaction occurred.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Pending Transaction's
         * currency. This will match the currency on the Pending Transaction's Account.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * For a Pending Transaction related to a transfer, this is the description you provide. For
         * a Pending Transaction related to a payment, this is the description the vendor provides.
         */
        fun description(description: JsonField<String>) = apply { this.description = description }

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: String?) = routeId(JsonField.ofNullable(routeId))

        /**
         * The identifier for the route this Pending Transaction came through. Routes are things
         * like cards and ACH details.
         */
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Pending Transaction came through. */
        fun routeType(routeType: RouteType?) = routeType(JsonField.ofNullable(routeType))

        /** The type of the route this Pending Transaction came through. */
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * This is an object giving more details on the network-level event that caused the Pending
         * Transaction. For example, for a card transaction this lists the merchant's industry and
         * location.
         */
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        fun status(status: Status) = status(JsonField.of(status))

        /** Whether the Pending Transaction has been confirmed and has an associated Transaction. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `pending_transaction`.
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

        fun build(): PendingTransaction =
            PendingTransaction(
                checkNotNull(id) { "`id` is required but was not set" },
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                checkNotNull(completedAt) { "`completedAt` is required but was not set" },
                checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                checkNotNull(currency) { "`currency` is required but was not set" },
                checkNotNull(description) { "`description` is required but was not set" },
                checkNotNull(routeId) { "`routeId` is required but was not set" },
                checkNotNull(routeType) { "`routeType` is required but was not set" },
                checkNotNull(source) { "`source` is required but was not set" },
                checkNotNull(status) { "`status` is required but was not set" },
                checkNotNull(type) { "`type` is required but was not set" },
                additionalProperties.toImmutable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CAD = of("CAD")

            val CHF = of("CHF")

            val EUR = of("EUR")

            val GBP = of("GBP")

            val JPY = of("JPY")

            val USD = of("USD")

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class RouteType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACCOUNT_NUMBER = of("account_number")

            val CARD = of("card")

            val LOCKBOX = of("lockbox")

            fun of(value: String) = RouteType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_NUMBER,
            CARD,
            LOCKBOX,
        }

        enum class Value {
            ACCOUNT_NUMBER,
            CARD,
            LOCKBOX,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                CARD -> Value.CARD
                LOCKBOX -> Value.LOCKBOX
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                CARD -> Known.CARD
                LOCKBOX -> Known.LOCKBOX
                else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is RouteType && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Pending
     * Transaction. For example, for a card transaction this lists the merchant's industry and
     * location.
     */
    @NoAutoDetect
    class Source
    @JsonCreator
    private constructor(
        @JsonProperty("account_transfer_instruction")
        @ExcludeMissing
        private val accountTransferInstruction: JsonField<AccountTransferInstruction> =
            JsonMissing.of(),
        @JsonProperty("ach_transfer_instruction")
        @ExcludeMissing
        private val achTransferInstruction: JsonField<AchTransferInstruction> = JsonMissing.of(),
        @JsonProperty("card_authorization")
        @ExcludeMissing
        private val cardAuthorization: JsonField<CardAuthorization> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("check_deposit_instruction")
        @ExcludeMissing
        private val checkDepositInstruction: JsonField<CheckDepositInstruction> = JsonMissing.of(),
        @JsonProperty("check_transfer_instruction")
        @ExcludeMissing
        private val checkTransferInstruction: JsonField<CheckTransferInstruction> =
            JsonMissing.of(),
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        private val inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of(),
        @JsonProperty("other") @ExcludeMissing private val other: JsonValue = JsonMissing.of(),
        @JsonProperty("real_time_payments_transfer_instruction")
        @ExcludeMissing
        private val realTimePaymentsTransferInstruction:
            JsonField<RealTimePaymentsTransferInstruction> =
            JsonMissing.of(),
        @JsonProperty("wire_transfer_instruction")
        @ExcludeMissing
        private val wireTransferInstruction: JsonField<WireTransferInstruction> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        fun accountTransferInstruction(): AccountTransferInstruction? =
            accountTransferInstruction.getNullable("account_transfer_instruction")

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        fun achTransferInstruction(): AchTransferInstruction? =
            achTransferInstruction.getNullable("ach_transfer_instruction")

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        fun cardAuthorization(): CardAuthorization? =
            cardAuthorization.getNullable("card_authorization")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        fun checkDepositInstruction(): CheckDepositInstruction? =
            checkDepositInstruction.getNullable("check_deposit_instruction")

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        fun checkTransferInstruction(): CheckTransferInstruction? =
            checkTransferInstruction.getNullable("check_transfer_instruction")

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        fun inboundFundsHold(): InboundFundsHold? =
            inboundFundsHold.getNullable("inbound_funds_hold")

        /**
         * If the category of this Transaction source is equal to `other`, this field will contain
         * an empty object, otherwise it will contain null.
         */
        @JsonProperty("other") @ExcludeMissing fun _other(): JsonValue = other

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        fun realTimePaymentsTransferInstruction(): RealTimePaymentsTransferInstruction? =
            realTimePaymentsTransferInstruction.getNullable(
                "real_time_payments_transfer_instruction"
            )

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        fun wireTransferInstruction(): WireTransferInstruction? =
            wireTransferInstruction.getNullable("wire_transfer_instruction")

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        @JsonProperty("account_transfer_instruction")
        @ExcludeMissing
        fun _accountTransferInstruction(): JsonField<AccountTransferInstruction> =
            accountTransferInstruction

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        @JsonProperty("ach_transfer_instruction")
        @ExcludeMissing
        fun _achTransferInstruction(): JsonField<AchTransferInstruction> = achTransferInstruction

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @JsonProperty("card_authorization")
        @ExcludeMissing
        fun _cardAuthorization(): JsonField<CardAuthorization> = cardAuthorization

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        @JsonProperty("check_deposit_instruction")
        @ExcludeMissing
        fun _checkDepositInstruction(): JsonField<CheckDepositInstruction> = checkDepositInstruction

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        @JsonProperty("check_transfer_instruction")
        @ExcludeMissing
        fun _checkTransferInstruction(): JsonField<CheckTransferInstruction> =
            checkTransferInstruction

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun _inboundFundsHold(): JsonField<InboundFundsHold> = inboundFundsHold

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        @JsonProperty("real_time_payments_transfer_instruction")
        @ExcludeMissing
        fun _realTimePaymentsTransferInstruction(): JsonField<RealTimePaymentsTransferInstruction> =
            realTimePaymentsTransferInstruction

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        @JsonProperty("wire_transfer_instruction")
        @ExcludeMissing
        fun _wireTransferInstruction(): JsonField<WireTransferInstruction> = wireTransferInstruction

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Source = apply {
            if (!validated) {
                accountTransferInstruction()?.validate()
                achTransferInstruction()?.validate()
                cardAuthorization()?.validate()
                category()
                checkDepositInstruction()?.validate()
                checkTransferInstruction()?.validate()
                inboundFundsHold()?.validate()
                realTimePaymentsTransferInstruction()?.validate()
                wireTransferInstruction()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountTransferInstruction: JsonField<AccountTransferInstruction>? = null
            private var achTransferInstruction: JsonField<AchTransferInstruction>? = null
            private var cardAuthorization: JsonField<CardAuthorization>? = null
            private var category: JsonField<Category>? = null
            private var checkDepositInstruction: JsonField<CheckDepositInstruction>? = null
            private var checkTransferInstruction: JsonField<CheckTransferInstruction>? = null
            private var inboundFundsHold: JsonField<InboundFundsHold>? = null
            private var other: JsonValue? = null
            private var realTimePaymentsTransferInstruction:
                JsonField<RealTimePaymentsTransferInstruction>? =
                null
            private var wireTransferInstruction: JsonField<WireTransferInstruction>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(source: Source) = apply {
                accountTransferInstruction = source.accountTransferInstruction
                achTransferInstruction = source.achTransferInstruction
                cardAuthorization = source.cardAuthorization
                category = source.category
                checkDepositInstruction = source.checkDepositInstruction
                checkTransferInstruction = source.checkTransferInstruction
                inboundFundsHold = source.inboundFundsHold
                other = source.other
                realTimePaymentsTransferInstruction = source.realTimePaymentsTransferInstruction
                wireTransferInstruction = source.wireTransferInstruction
                additionalProperties = source.additionalProperties.toMutableMap()
            }

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(
                accountTransferInstruction: AccountTransferInstruction?
            ) = accountTransferInstruction(JsonField.ofNullable(accountTransferInstruction))

            /**
             * An Account Transfer Instruction object. This field will be present in the JSON
             * response if and only if `category` is equal to `account_transfer_instruction`.
             */
            fun accountTransferInstruction(
                accountTransferInstruction: JsonField<AccountTransferInstruction>
            ) = apply { this.accountTransferInstruction = accountTransferInstruction }

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(achTransferInstruction: AchTransferInstruction?) =
                achTransferInstruction(JsonField.ofNullable(achTransferInstruction))

            /**
             * An ACH Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `ach_transfer_instruction`.
             */
            fun achTransferInstruction(achTransferInstruction: JsonField<AchTransferInstruction>) =
                apply {
                    this.achTransferInstruction = achTransferInstruction
                }

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(cardAuthorization: CardAuthorization?) =
                cardAuthorization(JsonField.ofNullable(cardAuthorization))

            /**
             * A Card Authorization object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_authorization`.
             */
            fun cardAuthorization(cardAuthorization: JsonField<CardAuthorization>) = apply {
                this.cardAuthorization = cardAuthorization
            }

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * The type of the resource. We may add additional possible values for this enum over
             * time; your application should be able to handle such additions gracefully.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(checkDepositInstruction: CheckDepositInstruction?) =
                checkDepositInstruction(JsonField.ofNullable(checkDepositInstruction))

            /**
             * A Check Deposit Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_deposit_instruction`.
             */
            fun checkDepositInstruction(
                checkDepositInstruction: JsonField<CheckDepositInstruction>
            ) = apply { this.checkDepositInstruction = checkDepositInstruction }

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(checkTransferInstruction: CheckTransferInstruction?) =
                checkTransferInstruction(JsonField.ofNullable(checkTransferInstruction))

            /**
             * A Check Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `check_transfer_instruction`.
             */
            fun checkTransferInstruction(
                checkTransferInstruction: JsonField<CheckTransferInstruction>
            ) = apply { this.checkTransferInstruction = checkTransferInstruction }

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            fun inboundFundsHold(inboundFundsHold: InboundFundsHold?) =
                inboundFundsHold(JsonField.ofNullable(inboundFundsHold))

            /**
             * An Inbound Funds Hold object. This field will be present in the JSON response if and
             * only if `category` is equal to `inbound_funds_hold`.
             */
            fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
                this.inboundFundsHold = inboundFundsHold
            }

            /**
             * If the category of this Transaction source is equal to `other`, this field will
             * contain an empty object, otherwise it will contain null.
             */
            fun other(other: JsonValue) = apply { this.other = other }

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction?
            ) =
                realTimePaymentsTransferInstruction(
                    JsonField.ofNullable(realTimePaymentsTransferInstruction)
                )

            /**
             * A Real-Time Payments Transfer Instruction object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_instruction`.
             */
            fun realTimePaymentsTransferInstruction(
                realTimePaymentsTransferInstruction: JsonField<RealTimePaymentsTransferInstruction>
            ) = apply {
                this.realTimePaymentsTransferInstruction = realTimePaymentsTransferInstruction
            }

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(wireTransferInstruction: WireTransferInstruction?) =
                wireTransferInstruction(JsonField.ofNullable(wireTransferInstruction))

            /**
             * A Wire Transfer Instruction object. This field will be present in the JSON response
             * if and only if `category` is equal to `wire_transfer_instruction`.
             */
            fun wireTransferInstruction(
                wireTransferInstruction: JsonField<WireTransferInstruction>
            ) = apply { this.wireTransferInstruction = wireTransferInstruction }

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

            fun build(): Source =
                Source(
                    checkNotNull(accountTransferInstruction) {
                        "`accountTransferInstruction` is required but was not set"
                    },
                    checkNotNull(achTransferInstruction) {
                        "`achTransferInstruction` is required but was not set"
                    },
                    checkNotNull(cardAuthorization) {
                        "`cardAuthorization` is required but was not set"
                    },
                    checkNotNull(category) { "`category` is required but was not set" },
                    checkNotNull(checkDepositInstruction) {
                        "`checkDepositInstruction` is required but was not set"
                    },
                    checkNotNull(checkTransferInstruction) {
                        "`checkTransferInstruction` is required but was not set"
                    },
                    checkNotNull(inboundFundsHold) {
                        "`inboundFundsHold` is required but was not set"
                    },
                    checkNotNull(other) { "`other` is required but was not set" },
                    checkNotNull(realTimePaymentsTransferInstruction) {
                        "`realTimePaymentsTransferInstruction` is required but was not set"
                    },
                    checkNotNull(wireTransferInstruction) {
                        "`wireTransferInstruction` is required but was not set"
                    },
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * An Account Transfer Instruction object. This field will be present in the JSON response
         * if and only if `category` is equal to `account_transfer_instruction`.
         */
        @NoAutoDetect
        class AccountTransferInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AccountTransferInstruction = apply {
                if (!validated) {
                    amount()
                    currency()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountTransferInstruction: AccountTransferInstruction) = apply {
                    amount = accountTransferInstruction.amount
                    currency = accountTransferInstruction.currency
                    transferId = accountTransferInstruction.transferId
                    additionalProperties =
                        accountTransferInstruction.additionalProperties.toMutableMap()
                }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
                 * account currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AccountTransferInstruction =
                    AccountTransferInstruction(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(transferId) { "`transferId` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val EUR = of("EUR")

                    val GBP = of("GBP")

                    val JPY = of("JPY")

                    val USD = of("USD")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AccountTransferInstruction && amount == other.amount && currency == other.currency && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AccountTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An ACH Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `ach_transfer_instruction`.
         */
        @NoAutoDetect
        class AchTransferInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The pending amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The identifier of the ACH Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The pending amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The identifier of the ACH Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): AchTransferInstruction = apply {
                if (!validated) {
                    amount()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(achTransferInstruction: AchTransferInstruction) = apply {
                    amount = achTransferInstruction.amount
                    transferId = achTransferInstruction.transferId
                    additionalProperties =
                        achTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The pending amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Pending Transaction. */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): AchTransferInstruction =
                    AchTransferInstruction(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(transferId) { "`transferId` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is AchTransferInstruction && amount == other.amount && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "AchTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Card Authorization object. This field will be present in the JSON response if and only
         * if `category` is equal to `card_authorization`.
         */
        @NoAutoDetect
        class CardAuthorization
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("actioner")
            @ExcludeMissing
            private val actioner: JsonField<Actioner> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            private val cardPaymentId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            private val digitalWalletTokenId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("direction")
            @ExcludeMissing
            private val direction: JsonField<Direction> = JsonMissing.of(),
            @JsonProperty("expires_at")
            @ExcludeMissing
            private val expiresAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            private val merchantAcceptorId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            private val merchantCategoryCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_city")
            @ExcludeMissing
            private val merchantCity: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_country")
            @ExcludeMissing
            private val merchantCountry: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            private val merchantDescriptor: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            private val merchantPostalCode: JsonField<String> = JsonMissing.of(),
            @JsonProperty("merchant_state")
            @ExcludeMissing
            private val merchantState: JsonField<String> = JsonMissing.of(),
            @JsonProperty("network_details")
            @ExcludeMissing
            private val networkDetails: JsonField<NetworkDetails> = JsonMissing.of(),
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            private val networkIdentifiers: JsonField<NetworkIdentifiers> = JsonMissing.of(),
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            private val networkRiskScore: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            private val physicalCardId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            private val presentmentAmount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            private val presentmentCurrency: JsonField<String> = JsonMissing.of(),
            @JsonProperty("processing_category")
            @ExcludeMissing
            private val processingCategory: JsonField<ProcessingCategory> = JsonMissing.of(),
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            private val realTimeDecisionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("terminal_id")
            @ExcludeMissing
            private val terminalId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonProperty("verification")
            @ExcludeMissing
            private val verification: JsonField<Verification> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The Card Authorization identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            fun actioner(): Actioner = actioner.getRequired("actioner")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /** The ID of the Card Payment this transaction belongs to. */
            fun cardPaymentId(): String = cardPaymentId.getRequired("card_payment_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            fun digitalWalletTokenId(): String? =
                digitalWalletTokenId.getNullable("digital_wallet_token_id")

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            fun direction(): Direction = direction.getRequired("direction")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            fun expiresAt(): OffsetDateTime = expiresAt.getRequired("expires_at")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String =
                merchantAcceptorId.getRequired("merchant_acceptor_id")

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The merchant descriptor of the merchant the card is transacting with. */
            fun merchantDescriptor(): String = merchantDescriptor.getRequired("merchant_descriptor")

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            fun merchantPostalCode(): String? =
                merchantPostalCode.getNullable("merchant_postal_code")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** Fields specific to the `network`. */
            fun networkDetails(): NetworkDetails = networkDetails.getRequired("network_details")

            /** Network-specific identifiers for a specific request or transaction. */
            fun networkIdentifiers(): NetworkIdentifiers =
                networkIdentifiers.getRequired("network_identifiers")

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            fun networkRiskScore(): Long? = networkRiskScore.getNullable("network_risk_score")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            fun physicalCardId(): String? = physicalCardId.getNullable("physical_card_id")

            /** The pending amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            fun processingCategory(): ProcessingCategory =
                processingCategory.getRequired("processing_category")

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            fun realTimeDecisionId(): String? =
                realTimeDecisionId.getNullable("real_time_decision_id")

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            fun terminalId(): String? = terminalId.getNullable("terminal_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            fun type(): Type = type.getRequired("type")

            /** Fields related to verification of cardholder-provided values. */
            fun verification(): Verification = verification.getRequired("verification")

            /** The Card Authorization identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * Whether this authorization was approved by Increase, the card network through
             * stand-in processing, or the user through a real-time decision.
             */
            @JsonProperty("actioner")
            @ExcludeMissing
            fun _actioner(): JsonField<Actioner> = actioner

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The ID of the Card Payment this transaction belongs to. */
            @JsonProperty("card_payment_id")
            @ExcludeMissing
            fun _cardPaymentId(): JsonField<String> = cardPaymentId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
             * purchase), the identifier of the token that was used.
             */
            @JsonProperty("digital_wallet_token_id")
            @ExcludeMissing
            fun _digitalWalletTokenId(): JsonField<String> = digitalWalletTokenId

            /**
             * The direction describes the direction the funds will move, either from the cardholder
             * to the merchant or from the merchant to the cardholder.
             */
            @JsonProperty("direction")
            @ExcludeMissing
            fun _direction(): JsonField<Direction> = direction

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization will
             * expire and the pending transaction will be released.
             */
            @JsonProperty("expires_at")
            @ExcludeMissing
            fun _expiresAt(): JsonField<OffsetDateTime> = expiresAt

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId(): JsonField<String> = merchantAcceptorId

            /**
             * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode(): JsonField<String> = merchantCategoryCode

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city")
            @ExcludeMissing
            fun _merchantCity(): JsonField<String> = merchantCity

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry(): JsonField<String> = merchantCountry

            /** The merchant descriptor of the merchant the card is transacting with. */
            @JsonProperty("merchant_descriptor")
            @ExcludeMissing
            fun _merchantDescriptor(): JsonField<String> = merchantDescriptor

            /**
             * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit ZIP
             * code, where the first 5 and last 4 are separated by a dash.
             */
            @JsonProperty("merchant_postal_code")
            @ExcludeMissing
            fun _merchantPostalCode(): JsonField<String> = merchantPostalCode

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state")
            @ExcludeMissing
            fun _merchantState(): JsonField<String> = merchantState

            /** Fields specific to the `network`. */
            @JsonProperty("network_details")
            @ExcludeMissing
            fun _networkDetails(): JsonField<NetworkDetails> = networkDetails

            /** Network-specific identifiers for a specific request or transaction. */
            @JsonProperty("network_identifiers")
            @ExcludeMissing
            fun _networkIdentifiers(): JsonField<NetworkIdentifiers> = networkIdentifiers

            /**
             * The risk score generated by the card network. For Visa this is the Visa Advanced
             * Authorization risk score, from 0 to 99, where 99 is the riskiest.
             */
            @JsonProperty("network_risk_score")
            @ExcludeMissing
            fun _networkRiskScore(): JsonField<Long> = networkRiskScore

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

            /**
             * If the authorization was made in-person with a physical card, the Physical Card that
             * was used.
             */
            @JsonProperty("physical_card_id")
            @ExcludeMissing
            fun _physicalCardId(): JsonField<String> = physicalCardId

            /** The pending amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount(): JsonField<Long> = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency(): JsonField<String> = presentmentCurrency

            /**
             * The processing category describes the intent behind the authorization, such as
             * whether it was used for bill payments or an automatic fuel dispenser.
             */
            @JsonProperty("processing_category")
            @ExcludeMissing
            fun _processingCategory(): JsonField<ProcessingCategory> = processingCategory

            /**
             * The identifier of the Real-Time Decision sent to approve or decline this transaction.
             */
            @JsonProperty("real_time_decision_id")
            @ExcludeMissing
            fun _realTimeDecisionId(): JsonField<String> = realTimeDecisionId

            /**
             * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
             * transacting with.
             */
            @JsonProperty("terminal_id")
            @ExcludeMissing
            fun _terminalId(): JsonField<String> = terminalId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_authorization`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            /** Fields related to verification of cardholder-provided values. */
            @JsonProperty("verification")
            @ExcludeMissing
            fun _verification(): JsonField<Verification> = verification

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CardAuthorization = apply {
                if (!validated) {
                    id()
                    actioner()
                    amount()
                    cardPaymentId()
                    currency()
                    digitalWalletTokenId()
                    direction()
                    expiresAt()
                    merchantAcceptorId()
                    merchantCategoryCode()
                    merchantCity()
                    merchantCountry()
                    merchantDescriptor()
                    merchantPostalCode()
                    merchantState()
                    networkDetails().validate()
                    networkIdentifiers().validate()
                    networkRiskScore()
                    pendingTransactionId()
                    physicalCardId()
                    presentmentAmount()
                    presentmentCurrency()
                    processingCategory()
                    realTimeDecisionId()
                    terminalId()
                    type()
                    verification().validate()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String>? = null
                private var actioner: JsonField<Actioner>? = null
                private var amount: JsonField<Long>? = null
                private var cardPaymentId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var digitalWalletTokenId: JsonField<String>? = null
                private var direction: JsonField<Direction>? = null
                private var expiresAt: JsonField<OffsetDateTime>? = null
                private var merchantAcceptorId: JsonField<String>? = null
                private var merchantCategoryCode: JsonField<String>? = null
                private var merchantCity: JsonField<String>? = null
                private var merchantCountry: JsonField<String>? = null
                private var merchantDescriptor: JsonField<String>? = null
                private var merchantPostalCode: JsonField<String>? = null
                private var merchantState: JsonField<String>? = null
                private var networkDetails: JsonField<NetworkDetails>? = null
                private var networkIdentifiers: JsonField<NetworkIdentifiers>? = null
                private var networkRiskScore: JsonField<Long>? = null
                private var pendingTransactionId: JsonField<String>? = null
                private var physicalCardId: JsonField<String>? = null
                private var presentmentAmount: JsonField<Long>? = null
                private var presentmentCurrency: JsonField<String>? = null
                private var processingCategory: JsonField<ProcessingCategory>? = null
                private var realTimeDecisionId: JsonField<String>? = null
                private var terminalId: JsonField<String>? = null
                private var type: JsonField<Type>? = null
                private var verification: JsonField<Verification>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardAuthorization: CardAuthorization) = apply {
                    id = cardAuthorization.id
                    actioner = cardAuthorization.actioner
                    amount = cardAuthorization.amount
                    cardPaymentId = cardAuthorization.cardPaymentId
                    currency = cardAuthorization.currency
                    digitalWalletTokenId = cardAuthorization.digitalWalletTokenId
                    direction = cardAuthorization.direction
                    expiresAt = cardAuthorization.expiresAt
                    merchantAcceptorId = cardAuthorization.merchantAcceptorId
                    merchantCategoryCode = cardAuthorization.merchantCategoryCode
                    merchantCity = cardAuthorization.merchantCity
                    merchantCountry = cardAuthorization.merchantCountry
                    merchantDescriptor = cardAuthorization.merchantDescriptor
                    merchantPostalCode = cardAuthorization.merchantPostalCode
                    merchantState = cardAuthorization.merchantState
                    networkDetails = cardAuthorization.networkDetails
                    networkIdentifiers = cardAuthorization.networkIdentifiers
                    networkRiskScore = cardAuthorization.networkRiskScore
                    pendingTransactionId = cardAuthorization.pendingTransactionId
                    physicalCardId = cardAuthorization.physicalCardId
                    presentmentAmount = cardAuthorization.presentmentAmount
                    presentmentCurrency = cardAuthorization.presentmentCurrency
                    processingCategory = cardAuthorization.processingCategory
                    realTimeDecisionId = cardAuthorization.realTimeDecisionId
                    terminalId = cardAuthorization.terminalId
                    type = cardAuthorization.type
                    verification = cardAuthorization.verification
                    additionalProperties = cardAuthorization.additionalProperties.toMutableMap()
                }

                /** The Card Authorization identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Authorization identifier. */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: Actioner) = actioner(JsonField.of(actioner))

                /**
                 * Whether this authorization was approved by Increase, the card network through
                 * stand-in processing, or the user through a real-time decision.
                 */
                fun actioner(actioner: JsonField<Actioner>) = apply { this.actioner = actioner }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: String) =
                    cardPaymentId(JsonField.of(cardPaymentId))

                /** The ID of the Card Payment this transaction belongs to. */
                fun cardPaymentId(cardPaymentId: JsonField<String>) = apply {
                    this.cardPaymentId = cardPaymentId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: String?) =
                    digitalWalletTokenId(JsonField.ofNullable(digitalWalletTokenId))

                /**
                 * If the authorization was made via a Digital Wallet Token (such as an Apple Pay
                 * purchase), the identifier of the token that was used.
                 */
                fun digitalWalletTokenId(digitalWalletTokenId: JsonField<String>) = apply {
                    this.digitalWalletTokenId = digitalWalletTokenId
                }

                /**
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: Direction) = direction(JsonField.of(direction))

                /**
                 * The direction describes the direction the funds will move, either from the
                 * cardholder to the merchant or from the merchant to the cardholder.
                 */
                fun direction(direction: JsonField<Direction>) = apply {
                    this.direction = direction
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(expiresAt: OffsetDateTime) = expiresAt(JsonField.of(expiresAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) when this authorization
                 * will expire and the pending transaction will be released.
                 */
                fun expiresAt(expiresAt: JsonField<OffsetDateTime>) = apply {
                    this.expiresAt = expiresAt
                }

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(merchantAcceptorId: String) =
                    merchantAcceptorId(JsonField.of(merchantAcceptorId))

                /**
                 * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
                 * transacting with.
                 */
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /**
                 * The Merchant Category Code (commonly abbreviated as MCC) of the merchant the card
                 * is transacting with.
                 */
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String?) =
                    merchantCity(JsonField.ofNullable(merchantCity))

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: String) =
                    merchantDescriptor(JsonField.of(merchantDescriptor))

                /** The merchant descriptor of the merchant the card is transacting with. */
                fun merchantDescriptor(merchantDescriptor: JsonField<String>) = apply {
                    this.merchantDescriptor = merchantDescriptor
                }

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: String?) =
                    merchantPostalCode(JsonField.ofNullable(merchantPostalCode))

                /**
                 * The merchant's postal code. For US merchants this is either a 5-digit or 9-digit
                 * ZIP code, where the first 5 and last 4 are separated by a dash.
                 */
                fun merchantPostalCode(merchantPostalCode: JsonField<String>) = apply {
                    this.merchantPostalCode = merchantPostalCode
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String?) =
                    merchantState(JsonField.ofNullable(merchantState))

                /** The state the merchant resides in. */
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: NetworkDetails) =
                    networkDetails(JsonField.of(networkDetails))

                /** Fields specific to the `network`. */
                fun networkDetails(networkDetails: JsonField<NetworkDetails>) = apply {
                    this.networkDetails = networkDetails
                }

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: NetworkIdentifiers) =
                    networkIdentifiers(JsonField.of(networkIdentifiers))

                /** Network-specific identifiers for a specific request or transaction. */
                fun networkIdentifiers(networkIdentifiers: JsonField<NetworkIdentifiers>) = apply {
                    this.networkIdentifiers = networkIdentifiers
                }

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long?) =
                    networkRiskScore(JsonField.ofNullable(networkRiskScore))

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: Long) =
                    networkRiskScore(networkRiskScore as Long?)

                /**
                 * The risk score generated by the card network. For Visa this is the Visa Advanced
                 * Authorization risk score, from 0 to 99, where 99 is the riskiest.
                 */
                fun networkRiskScore(networkRiskScore: JsonField<Long>) = apply {
                    this.networkRiskScore = networkRiskScore
                }

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String?) =
                    pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: String?) =
                    physicalCardId(JsonField.ofNullable(physicalCardId))

                /**
                 * If the authorization was made in-person with a physical card, the Physical Card
                 * that was used.
                 */
                fun physicalCardId(physicalCardId: JsonField<String>) = apply {
                    this.physicalCardId = physicalCardId
                }

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /**
                 * The pending amount in the minor unit of the transaction's presentment currency.
                 */
                fun presentmentAmount(presentmentAmount: JsonField<Long>) = apply {
                    this.presentmentAmount = presentmentAmount
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: String) =
                    presentmentCurrency(JsonField.of(presentmentCurrency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * presentment currency.
                 */
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
                }

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                fun processingCategory(processingCategory: ProcessingCategory) =
                    processingCategory(JsonField.of(processingCategory))

                /**
                 * The processing category describes the intent behind the authorization, such as
                 * whether it was used for bill payments or an automatic fuel dispenser.
                 */
                fun processingCategory(processingCategory: JsonField<ProcessingCategory>) = apply {
                    this.processingCategory = processingCategory
                }

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: String?) =
                    realTimeDecisionId(JsonField.ofNullable(realTimeDecisionId))

                /**
                 * The identifier of the Real-Time Decision sent to approve or decline this
                 * transaction.
                 */
                fun realTimeDecisionId(realTimeDecisionId: JsonField<String>) = apply {
                    this.realTimeDecisionId = realTimeDecisionId
                }

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: String?) = terminalId(JsonField.ofNullable(terminalId))

                /**
                 * The terminal identifier (commonly abbreviated as TID) of the terminal the card is
                 * transacting with.
                 */
                fun terminalId(terminalId: JsonField<String>) = apply {
                    this.terminalId = terminalId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_authorization`.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: Verification) =
                    verification(JsonField.of(verification))

                /** Fields related to verification of cardholder-provided values. */
                fun verification(verification: JsonField<Verification>) = apply {
                    this.verification = verification
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CardAuthorization =
                    CardAuthorization(
                        checkNotNull(id) { "`id` is required but was not set" },
                        checkNotNull(actioner) { "`actioner` is required but was not set" },
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(cardPaymentId) {
                            "`cardPaymentId` is required but was not set"
                        },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(digitalWalletTokenId) {
                            "`digitalWalletTokenId` is required but was not set"
                        },
                        checkNotNull(direction) { "`direction` is required but was not set" },
                        checkNotNull(expiresAt) { "`expiresAt` is required but was not set" },
                        checkNotNull(merchantAcceptorId) {
                            "`merchantAcceptorId` is required but was not set"
                        },
                        checkNotNull(merchantCategoryCode) {
                            "`merchantCategoryCode` is required but was not set"
                        },
                        checkNotNull(merchantCity) { "`merchantCity` is required but was not set" },
                        checkNotNull(merchantCountry) {
                            "`merchantCountry` is required but was not set"
                        },
                        checkNotNull(merchantDescriptor) {
                            "`merchantDescriptor` is required but was not set"
                        },
                        checkNotNull(merchantPostalCode) {
                            "`merchantPostalCode` is required but was not set"
                        },
                        checkNotNull(merchantState) {
                            "`merchantState` is required but was not set"
                        },
                        checkNotNull(networkDetails) {
                            "`networkDetails` is required but was not set"
                        },
                        checkNotNull(networkIdentifiers) {
                            "`networkIdentifiers` is required but was not set"
                        },
                        checkNotNull(networkRiskScore) {
                            "`networkRiskScore` is required but was not set"
                        },
                        checkNotNull(pendingTransactionId) {
                            "`pendingTransactionId` is required but was not set"
                        },
                        checkNotNull(physicalCardId) {
                            "`physicalCardId` is required but was not set"
                        },
                        checkNotNull(presentmentAmount) {
                            "`presentmentAmount` is required but was not set"
                        },
                        checkNotNull(presentmentCurrency) {
                            "`presentmentCurrency` is required but was not set"
                        },
                        checkNotNull(processingCategory) {
                            "`processingCategory` is required but was not set"
                        },
                        checkNotNull(realTimeDecisionId) {
                            "`realTimeDecisionId` is required but was not set"
                        },
                        checkNotNull(terminalId) { "`terminalId` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        checkNotNull(verification) { "`verification` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Actioner
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val USER = of("user")

                    val INCREASE = of("increase")

                    val NETWORK = of("network")

                    fun of(value: String) = Actioner(JsonField.of(value))
                }

                enum class Known {
                    USER,
                    INCREASE,
                    NETWORK,
                }

                enum class Value {
                    USER,
                    INCREASE,
                    NETWORK,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        USER -> Value.USER
                        INCREASE -> Value.INCREASE
                        NETWORK -> Value.NETWORK
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        USER -> Known.USER
                        INCREASE -> Known.INCREASE
                        NETWORK -> Known.NETWORK
                        else -> throw IncreaseInvalidDataException("Unknown Actioner: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Actioner && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val EUR = of("EUR")

                    val GBP = of("GBP")

                    val JPY = of("JPY")

                    val USD = of("USD")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Direction
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val SETTLEMENT = of("settlement")

                    val REFUND = of("refund")

                    fun of(value: String) = Direction(JsonField.of(value))
                }

                enum class Known {
                    SETTLEMENT,
                    REFUND,
                }

                enum class Value {
                    SETTLEMENT,
                    REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        SETTLEMENT -> Value.SETTLEMENT
                        REFUND -> Value.REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        SETTLEMENT -> Known.SETTLEMENT
                        REFUND -> Known.REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Direction: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Direction && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            /** Fields specific to the `network`. */
            @NoAutoDetect
            class NetworkDetails
            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                private val category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("visa")
                @ExcludeMissing
                private val visa: JsonField<Visa> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The payment network used to process this card authorization. */
                fun category(): Category = category.getRequired("category")

                /** Fields specific to the `visa` network. */
                fun visa(): Visa? = visa.getNullable("visa")

                /** The payment network used to process this card authorization. */
                @JsonProperty("category")
                @ExcludeMissing
                fun _category(): JsonField<Category> = category

                /** Fields specific to the `visa` network. */
                @JsonProperty("visa") @ExcludeMissing fun _visa(): JsonField<Visa> = visa

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): NetworkDetails = apply {
                    if (!validated) {
                        category()
                        visa()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var category: JsonField<Category>? = null
                    private var visa: JsonField<Visa>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkDetails: NetworkDetails) = apply {
                        category = networkDetails.category
                        visa = networkDetails.visa
                        additionalProperties = networkDetails.additionalProperties.toMutableMap()
                    }

                    /** The payment network used to process this card authorization. */
                    fun category(category: Category) = category(JsonField.of(category))

                    /** The payment network used to process this card authorization. */
                    fun category(category: JsonField<Category>) = apply { this.category = category }

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: Visa?) = visa(JsonField.ofNullable(visa))

                    /** Fields specific to the `visa` network. */
                    fun visa(visa: JsonField<Visa>) = apply { this.visa = visa }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): NetworkDetails =
                        NetworkDetails(
                            checkNotNull(category) { "`category` is required but was not set" },
                            checkNotNull(visa) { "`visa` is required but was not set" },
                            additionalProperties.toImmutable(),
                        )
                }

                class Category
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) : Enum {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    companion object {

                        val VISA = of("visa")

                        fun of(value: String) = Category(JsonField.of(value))
                    }

                    enum class Known {
                        VISA,
                    }

                    enum class Value {
                        VISA,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            VISA -> Value.VISA
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            VISA -> Known.VISA
                            else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                        }

                    fun asString(): String = _value().asStringOrThrow()

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Category && value == other.value /* spotless:on */
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()
                }

                /** Fields specific to the `visa` network. */
                @NoAutoDetect
                class Visa
                @JsonCreator
                private constructor(
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    private val electronicCommerceIndicator:
                        JsonField<ElectronicCommerceIndicator> =
                        JsonMissing.of(),
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    private val pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode> =
                        JsonMissing.of(),
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    private val standInProcessingReason: JsonField<StandInProcessingReason> =
                        JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    fun electronicCommerceIndicator(): ElectronicCommerceIndicator? =
                        electronicCommerceIndicator.getNullable("electronic_commerce_indicator")

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    fun pointOfServiceEntryMode(): PointOfServiceEntryMode? =
                        pointOfServiceEntryMode.getNullable("point_of_service_entry_mode")

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    fun standInProcessingReason(): StandInProcessingReason? =
                        standInProcessingReason.getNullable("stand_in_processing_reason")

                    /**
                     * For electronic commerce transactions, this identifies the level of security
                     * used in obtaining the customer's payment credential. For mail or telephone
                     * order transactions, identifies the type of mail or telephone order.
                     */
                    @JsonProperty("electronic_commerce_indicator")
                    @ExcludeMissing
                    fun _electronicCommerceIndicator(): JsonField<ElectronicCommerceIndicator> =
                        electronicCommerceIndicator

                    /**
                     * The method used to enter the cardholder's primary account number and card
                     * expiration date.
                     */
                    @JsonProperty("point_of_service_entry_mode")
                    @ExcludeMissing
                    fun _pointOfServiceEntryMode(): JsonField<PointOfServiceEntryMode> =
                        pointOfServiceEntryMode

                    /**
                     * Only present when `actioner: network`. Describes why a card authorization was
                     * approved or declined by Visa through stand-in processing.
                     */
                    @JsonProperty("stand_in_processing_reason")
                    @ExcludeMissing
                    fun _standInProcessingReason(): JsonField<StandInProcessingReason> =
                        standInProcessingReason

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): Visa = apply {
                        if (!validated) {
                            electronicCommerceIndicator()
                            pointOfServiceEntryMode()
                            standInProcessingReason()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var electronicCommerceIndicator:
                            JsonField<ElectronicCommerceIndicator>? =
                            null
                        private var pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>? =
                            null
                        private var standInProcessingReason: JsonField<StandInProcessingReason>? =
                            null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(visa: Visa) = apply {
                            electronicCommerceIndicator = visa.electronicCommerceIndicator
                            pointOfServiceEntryMode = visa.pointOfServiceEntryMode
                            standInProcessingReason = visa.standInProcessingReason
                            additionalProperties = visa.additionalProperties.toMutableMap()
                        }

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: ElectronicCommerceIndicator?
                        ) =
                            electronicCommerceIndicator(
                                JsonField.ofNullable(electronicCommerceIndicator)
                            )

                        /**
                         * For electronic commerce transactions, this identifies the level of
                         * security used in obtaining the customer's payment credential. For mail or
                         * telephone order transactions, identifies the type of mail or telephone
                         * order.
                         */
                        fun electronicCommerceIndicator(
                            electronicCommerceIndicator: JsonField<ElectronicCommerceIndicator>
                        ) = apply { this.electronicCommerceIndicator = electronicCommerceIndicator }

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: PointOfServiceEntryMode?
                        ) = pointOfServiceEntryMode(JsonField.ofNullable(pointOfServiceEntryMode))

                        /**
                         * The method used to enter the cardholder's primary account number and card
                         * expiration date.
                         */
                        fun pointOfServiceEntryMode(
                            pointOfServiceEntryMode: JsonField<PointOfServiceEntryMode>
                        ) = apply { this.pointOfServiceEntryMode = pointOfServiceEntryMode }

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: StandInProcessingReason?
                        ) = standInProcessingReason(JsonField.ofNullable(standInProcessingReason))

                        /**
                         * Only present when `actioner: network`. Describes why a card authorization
                         * was approved or declined by Visa through stand-in processing.
                         */
                        fun standInProcessingReason(
                            standInProcessingReason: JsonField<StandInProcessingReason>
                        ) = apply { this.standInProcessingReason = standInProcessingReason }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): Visa =
                            Visa(
                                checkNotNull(electronicCommerceIndicator) {
                                    "`electronicCommerceIndicator` is required but was not set"
                                },
                                checkNotNull(pointOfServiceEntryMode) {
                                    "`pointOfServiceEntryMode` is required but was not set"
                                },
                                checkNotNull(standInProcessingReason) {
                                    "`standInProcessingReason` is required but was not set"
                                },
                                additionalProperties.toImmutable(),
                            )
                    }

                    class ElectronicCommerceIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val MAIL_PHONE_ORDER = of("mail_phone_order")

                            val RECURRING = of("recurring")

                            val INSTALLMENT = of("installment")

                            val UNKNOWN_MAIL_PHONE_ORDER = of("unknown_mail_phone_order")

                            val SECURE_ELECTRONIC_COMMERCE = of("secure_electronic_commerce")

                            val NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT =
                                of("non_authenticated_security_transaction_at_3ds_capable_merchant")

                            val NON_AUTHENTICATED_SECURITY_TRANSACTION =
                                of("non_authenticated_security_transaction")

                            val NON_SECURE_TRANSACTION = of("non_secure_transaction")

                            fun of(value: String) = ElectronicCommerceIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                        }

                        enum class Value {
                            MAIL_PHONE_ORDER,
                            RECURRING,
                            INSTALLMENT,
                            UNKNOWN_MAIL_PHONE_ORDER,
                            SECURE_ELECTRONIC_COMMERCE,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT,
                            NON_AUTHENTICATED_SECURITY_TRANSACTION,
                            NON_SECURE_TRANSACTION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                MAIL_PHONE_ORDER -> Value.MAIL_PHONE_ORDER
                                RECURRING -> Value.RECURRING
                                INSTALLMENT -> Value.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Value.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Value.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Value
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Value.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Value.NON_SECURE_TRANSACTION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                MAIL_PHONE_ORDER -> Known.MAIL_PHONE_ORDER
                                RECURRING -> Known.RECURRING
                                INSTALLMENT -> Known.INSTALLMENT
                                UNKNOWN_MAIL_PHONE_ORDER -> Known.UNKNOWN_MAIL_PHONE_ORDER
                                SECURE_ELECTRONIC_COMMERCE -> Known.SECURE_ELECTRONIC_COMMERCE
                                NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT ->
                                    Known
                                        .NON_AUTHENTICATED_SECURITY_TRANSACTION_AT_3DS_CAPABLE_MERCHANT
                                NON_AUTHENTICATED_SECURITY_TRANSACTION ->
                                    Known.NON_AUTHENTICATED_SECURITY_TRANSACTION
                                NON_SECURE_TRANSACTION -> Known.NON_SECURE_TRANSACTION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ElectronicCommerceIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is ElectronicCommerceIndicator && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class PointOfServiceEntryMode
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val UNKNOWN = of("unknown")

                            val MANUAL = of("manual")

                            val MAGNETIC_STRIPE_NO_CVV = of("magnetic_stripe_no_cvv")

                            val OPTICAL_CODE = of("optical_code")

                            val INTEGRATED_CIRCUIT_CARD = of("integrated_circuit_card")

                            val CONTACTLESS = of("contactless")

                            val CREDENTIAL_ON_FILE = of("credential_on_file")

                            val MAGNETIC_STRIPE = of("magnetic_stripe")

                            val CONTACTLESS_MAGNETIC_STRIPE = of("contactless_magnetic_stripe")

                            val INTEGRATED_CIRCUIT_CARD_NO_CVV =
                                of("integrated_circuit_card_no_cvv")

                            fun of(value: String) = PointOfServiceEntryMode(JsonField.of(value))
                        }

                        enum class Known {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                        }

                        enum class Value {
                            UNKNOWN,
                            MANUAL,
                            MAGNETIC_STRIPE_NO_CVV,
                            OPTICAL_CODE,
                            INTEGRATED_CIRCUIT_CARD,
                            CONTACTLESS,
                            CREDENTIAL_ON_FILE,
                            MAGNETIC_STRIPE,
                            CONTACTLESS_MAGNETIC_STRIPE,
                            INTEGRATED_CIRCUIT_CARD_NO_CVV,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                UNKNOWN -> Value.UNKNOWN
                                MANUAL -> Value.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Value.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Value.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Value.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Value.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Value.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Value.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Value.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Value.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                UNKNOWN -> Known.UNKNOWN
                                MANUAL -> Known.MANUAL
                                MAGNETIC_STRIPE_NO_CVV -> Known.MAGNETIC_STRIPE_NO_CVV
                                OPTICAL_CODE -> Known.OPTICAL_CODE
                                INTEGRATED_CIRCUIT_CARD -> Known.INTEGRATED_CIRCUIT_CARD
                                CONTACTLESS -> Known.CONTACTLESS
                                CREDENTIAL_ON_FILE -> Known.CREDENTIAL_ON_FILE
                                MAGNETIC_STRIPE -> Known.MAGNETIC_STRIPE
                                CONTACTLESS_MAGNETIC_STRIPE -> Known.CONTACTLESS_MAGNETIC_STRIPE
                                INTEGRATED_CIRCUIT_CARD_NO_CVV ->
                                    Known.INTEGRATED_CIRCUIT_CARD_NO_CVV
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown PointOfServiceEntryMode: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is PointOfServiceEntryMode && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    class StandInProcessingReason
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val ISSUER_ERROR = of("issuer_error")

                            val INVALID_PHYSICAL_CARD = of("invalid_physical_card")

                            val INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE =
                                of("invalid_cardholder_authentication_verification_value")

                            val INTERNAL_VISA_ERROR = of("internal_visa_error")

                            val MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED =
                                of("merchant_transaction_advisory_service_authentication_required")

                            val OTHER = of("other")

                            fun of(value: String) = StandInProcessingReason(JsonField.of(value))
                        }

                        enum class Known {
                            ISSUER_ERROR,
                            INVALID_PHYSICAL_CARD,
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            INTERNAL_VISA_ERROR,
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            OTHER,
                        }

                        enum class Value {
                            ISSUER_ERROR,
                            INVALID_PHYSICAL_CARD,
                            INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE,
                            INTERNAL_VISA_ERROR,
                            MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED,
                            OTHER,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                ISSUER_ERROR -> Value.ISSUER_ERROR
                                INVALID_PHYSICAL_CARD -> Value.INVALID_PHYSICAL_CARD
                                INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                    Value.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                                INTERNAL_VISA_ERROR -> Value.INTERNAL_VISA_ERROR
                                MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                    Value
                                        .MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                                OTHER -> Value.OTHER
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                ISSUER_ERROR -> Known.ISSUER_ERROR
                                INVALID_PHYSICAL_CARD -> Known.INVALID_PHYSICAL_CARD
                                INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE ->
                                    Known.INVALID_CARDHOLDER_AUTHENTICATION_VERIFICATION_VALUE
                                INTERNAL_VISA_ERROR -> Known.INTERNAL_VISA_ERROR
                                MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED ->
                                    Known
                                        .MERCHANT_TRANSACTION_ADVISORY_SERVICE_AUTHENTICATION_REQUIRED
                                OTHER -> Known.OTHER
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown StandInProcessingReason: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is StandInProcessingReason && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is Visa && electronicCommerceIndicator == other.electronicCommerceIndicator && pointOfServiceEntryMode == other.pointOfServiceEntryMode && standInProcessingReason == other.standInProcessingReason && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(electronicCommerceIndicator, pointOfServiceEntryMode, standInProcessingReason, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "Visa{electronicCommerceIndicator=$electronicCommerceIndicator, pointOfServiceEntryMode=$pointOfServiceEntryMode, standInProcessingReason=$standInProcessingReason, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkDetails && category == other.category && visa == other.visa && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(category, visa, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkDetails{category=$category, visa=$visa, additionalProperties=$additionalProperties}"
            }

            /** Network-specific identifiers for a specific request or transaction. */
            @NoAutoDetect
            class NetworkIdentifiers
            @JsonCreator
            private constructor(
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                private val retrievalReferenceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("trace_number")
                @ExcludeMissing
                private val traceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("transaction_id")
                @ExcludeMissing
                private val transactionId: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                fun retrievalReferenceNumber(): String? =
                    retrievalReferenceNumber.getNullable("retrieval_reference_number")

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                fun traceNumber(): String? = traceNumber.getNullable("trace_number")

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                fun transactionId(): String? = transactionId.getNullable("transaction_id")

                /**
                 * A life-cycle identifier used across e.g., an authorization and a reversal.
                 * Expected to be unique per acquirer within a window of time. For some card
                 * networks the retrieval reference number includes the trace counter.
                 */
                @JsonProperty("retrieval_reference_number")
                @ExcludeMissing
                fun _retrievalReferenceNumber(): JsonField<String> = retrievalReferenceNumber

                /**
                 * A counter used to verify an individual authorization. Expected to be unique per
                 * acquirer within a window of time.
                 */
                @JsonProperty("trace_number")
                @ExcludeMissing
                fun _traceNumber(): JsonField<String> = traceNumber

                /**
                 * A globally unique transaction identifier provided by the card network, used
                 * across multiple life-cycle requests.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun _transactionId(): JsonField<String> = transactionId

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): NetworkIdentifiers = apply {
                    if (!validated) {
                        retrievalReferenceNumber()
                        traceNumber()
                        transactionId()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var retrievalReferenceNumber: JsonField<String>? = null
                    private var traceNumber: JsonField<String>? = null
                    private var transactionId: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(networkIdentifiers: NetworkIdentifiers) = apply {
                        retrievalReferenceNumber = networkIdentifiers.retrievalReferenceNumber
                        traceNumber = networkIdentifiers.traceNumber
                        transactionId = networkIdentifiers.transactionId
                        additionalProperties =
                            networkIdentifiers.additionalProperties.toMutableMap()
                    }

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: String?) =
                        retrievalReferenceNumber(JsonField.ofNullable(retrievalReferenceNumber))

                    /**
                     * A life-cycle identifier used across e.g., an authorization and a reversal.
                     * Expected to be unique per acquirer within a window of time. For some card
                     * networks the retrieval reference number includes the trace counter.
                     */
                    fun retrievalReferenceNumber(retrievalReferenceNumber: JsonField<String>) =
                        apply {
                            this.retrievalReferenceNumber = retrievalReferenceNumber
                        }

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: String?) =
                        traceNumber(JsonField.ofNullable(traceNumber))

                    /**
                     * A counter used to verify an individual authorization. Expected to be unique
                     * per acquirer within a window of time.
                     */
                    fun traceNumber(traceNumber: JsonField<String>) = apply {
                        this.traceNumber = traceNumber
                    }

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(transactionId: String?) =
                        transactionId(JsonField.ofNullable(transactionId))

                    /**
                     * A globally unique transaction identifier provided by the card network, used
                     * across multiple life-cycle requests.
                     */
                    fun transactionId(transactionId: JsonField<String>) = apply {
                        this.transactionId = transactionId
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): NetworkIdentifiers =
                        NetworkIdentifiers(
                            checkNotNull(retrievalReferenceNumber) {
                                "`retrievalReferenceNumber` is required but was not set"
                            },
                            checkNotNull(traceNumber) {
                                "`traceNumber` is required but was not set"
                            },
                            checkNotNull(transactionId) {
                                "`transactionId` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is NetworkIdentifiers && retrievalReferenceNumber == other.retrievalReferenceNumber && traceNumber == other.traceNumber && transactionId == other.transactionId && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(retrievalReferenceNumber, traceNumber, transactionId, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "NetworkIdentifiers{retrievalReferenceNumber=$retrievalReferenceNumber, traceNumber=$traceNumber, transactionId=$transactionId, additionalProperties=$additionalProperties}"
            }

            class ProcessingCategory
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val ACCOUNT_FUNDING = of("account_funding")

                    val AUTOMATIC_FUEL_DISPENSER = of("automatic_fuel_dispenser")

                    val BILL_PAYMENT = of("bill_payment")

                    val PURCHASE = of("purchase")

                    val QUASI_CASH = of("quasi_cash")

                    val REFUND = of("refund")

                    fun of(value: String) = ProcessingCategory(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_FUNDING,
                    AUTOMATIC_FUEL_DISPENSER,
                    BILL_PAYMENT,
                    PURCHASE,
                    QUASI_CASH,
                    REFUND,
                }

                enum class Value {
                    ACCOUNT_FUNDING,
                    AUTOMATIC_FUEL_DISPENSER,
                    BILL_PAYMENT,
                    PURCHASE,
                    QUASI_CASH,
                    REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_FUNDING -> Value.ACCOUNT_FUNDING
                        AUTOMATIC_FUEL_DISPENSER -> Value.AUTOMATIC_FUEL_DISPENSER
                        BILL_PAYMENT -> Value.BILL_PAYMENT
                        PURCHASE -> Value.PURCHASE
                        QUASI_CASH -> Value.QUASI_CASH
                        REFUND -> Value.REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_FUNDING -> Known.ACCOUNT_FUNDING
                        AUTOMATIC_FUEL_DISPENSER -> Known.AUTOMATIC_FUEL_DISPENSER
                        BILL_PAYMENT -> Known.BILL_PAYMENT
                        PURCHASE -> Known.PURCHASE
                        QUASI_CASH -> Known.QUASI_CASH
                        REFUND -> Known.REFUND
                        else ->
                            throw IncreaseInvalidDataException("Unknown ProcessingCategory: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is ProcessingCategory && value == other.value /* spotless:on */
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

                    val CARD_AUTHORIZATION = of("card_authorization")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_AUTHORIZATION,
                }

                enum class Value {
                    CARD_AUTHORIZATION,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
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

            /** Fields related to verification of cardholder-provided values. */
            @NoAutoDetect
            class Verification
            @JsonCreator
            private constructor(
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                private val cardVerificationCode: JsonField<CardVerificationCode> =
                    JsonMissing.of(),
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                private val cardholderAddress: JsonField<CardholderAddress> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                fun cardVerificationCode(): CardVerificationCode =
                    cardVerificationCode.getRequired("card_verification_code")

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                fun cardholderAddress(): CardholderAddress =
                    cardholderAddress.getRequired("cardholder_address")

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @JsonProperty("card_verification_code")
                @ExcludeMissing
                fun _cardVerificationCode(): JsonField<CardVerificationCode> = cardVerificationCode

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @JsonProperty("cardholder_address")
                @ExcludeMissing
                fun _cardholderAddress(): JsonField<CardholderAddress> = cardholderAddress

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Verification = apply {
                    if (!validated) {
                        cardVerificationCode().validate()
                        cardholderAddress().validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var cardVerificationCode: JsonField<CardVerificationCode>? = null
                    private var cardholderAddress: JsonField<CardholderAddress>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(verification: Verification) = apply {
                        cardVerificationCode = verification.cardVerificationCode
                        cardholderAddress = verification.cardholderAddress
                        additionalProperties = verification.additionalProperties.toMutableMap()
                    }

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(cardVerificationCode: CardVerificationCode) =
                        cardVerificationCode(JsonField.of(cardVerificationCode))

                    /**
                     * Fields related to verification of the Card Verification Code, a 3-digit code
                     * on the back of the card.
                     */
                    fun cardVerificationCode(
                        cardVerificationCode: JsonField<CardVerificationCode>
                    ) = apply { this.cardVerificationCode = cardVerificationCode }

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: CardholderAddress) =
                        cardholderAddress(JsonField.of(cardholderAddress))

                    /**
                     * Cardholder address provided in the authorization request and the address on
                     * file we verified it against.
                     */
                    fun cardholderAddress(cardholderAddress: JsonField<CardholderAddress>) = apply {
                        this.cardholderAddress = cardholderAddress
                    }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        putAllAdditionalProperties(additionalProperties)
                    }

                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun removeAdditionalProperty(key: String) = apply {
                        additionalProperties.remove(key)
                    }

                    fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                        keys.forEach(::removeAdditionalProperty)
                    }

                    fun build(): Verification =
                        Verification(
                            checkNotNull(cardVerificationCode) {
                                "`cardVerificationCode` is required but was not set"
                            },
                            checkNotNull(cardholderAddress) {
                                "`cardholderAddress` is required but was not set"
                            },
                            additionalProperties.toImmutable(),
                        )
                }

                /**
                 * Fields related to verification of the Card Verification Code, a 3-digit code on
                 * the back of the card.
                 */
                @NoAutoDetect
                class CardVerificationCode
                @JsonCreator
                private constructor(
                    @JsonProperty("result")
                    @ExcludeMissing
                    private val result: JsonField<Result> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** The result of verifying the Card Verification Code. */
                    fun result(): Result = result.getRequired("result")

                    /** The result of verifying the Card Verification Code. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): CardVerificationCode = apply {
                        if (!validated) {
                            result()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var result: JsonField<Result>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(cardVerificationCode: CardVerificationCode) = apply {
                            result = cardVerificationCode.result
                            additionalProperties =
                                cardVerificationCode.additionalProperties.toMutableMap()
                        }

                        /** The result of verifying the Card Verification Code. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The result of verifying the Card Verification Code. */
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): CardVerificationCode =
                            CardVerificationCode(
                                checkNotNull(result) { "`result` is required but was not set" },
                                additionalProperties.toImmutable()
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val NOT_CHECKED = of("not_checked")

                            val MATCH = of("match")

                            val NO_MATCH = of("no_match")

                            fun of(value: String) = Result(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_CHECKED,
                            MATCH,
                            NO_MATCH,
                        }

                        enum class Value {
                            NOT_CHECKED,
                            MATCH,
                            NO_MATCH,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_CHECKED -> Value.NOT_CHECKED
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_CHECKED -> Known.NOT_CHECKED
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardVerificationCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(result, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardVerificationCode{result=$result, additionalProperties=$additionalProperties}"
                }

                /**
                 * Cardholder address provided in the authorization request and the address on file
                 * we verified it against.
                 */
                @NoAutoDetect
                class CardholderAddress
                @JsonCreator
                private constructor(
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    private val actualLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    private val actualPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    private val providedLine1: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    private val providedPostalCode: JsonField<String> = JsonMissing.of(),
                    @JsonProperty("result")
                    @ExcludeMissing
                    private val result: JsonField<Result> = JsonMissing.of(),
                    @JsonAnySetter
                    private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
                ) {

                    /** Line 1 of the address on file for the cardholder. */
                    fun actualLine1(): String? = actualLine1.getNullable("actual_line1")

                    /** The postal code of the address on file for the cardholder. */
                    fun actualPostalCode(): String? =
                        actualPostalCode.getNullable("actual_postal_code")

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    fun providedLine1(): String? = providedLine1.getNullable("provided_line1")

                    /** The postal code provided for verification in the authorization request. */
                    fun providedPostalCode(): String? =
                        providedPostalCode.getNullable("provided_postal_code")

                    /** The address verification result returned to the card network. */
                    fun result(): Result = result.getRequired("result")

                    /** Line 1 of the address on file for the cardholder. */
                    @JsonProperty("actual_line1")
                    @ExcludeMissing
                    fun _actualLine1(): JsonField<String> = actualLine1

                    /** The postal code of the address on file for the cardholder. */
                    @JsonProperty("actual_postal_code")
                    @ExcludeMissing
                    fun _actualPostalCode(): JsonField<String> = actualPostalCode

                    /**
                     * The cardholder address line 1 provided for verification in the authorization
                     * request.
                     */
                    @JsonProperty("provided_line1")
                    @ExcludeMissing
                    fun _providedLine1(): JsonField<String> = providedLine1

                    /** The postal code provided for verification in the authorization request. */
                    @JsonProperty("provided_postal_code")
                    @ExcludeMissing
                    fun _providedPostalCode(): JsonField<String> = providedPostalCode

                    /** The address verification result returned to the card network. */
                    @JsonProperty("result")
                    @ExcludeMissing
                    fun _result(): JsonField<Result> = result

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    private var validated: Boolean = false

                    fun validate(): CardholderAddress = apply {
                        if (!validated) {
                            actualLine1()
                            actualPostalCode()
                            providedLine1()
                            providedPostalCode()
                            result()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var actualLine1: JsonField<String>? = null
                        private var actualPostalCode: JsonField<String>? = null
                        private var providedLine1: JsonField<String>? = null
                        private var providedPostalCode: JsonField<String>? = null
                        private var result: JsonField<Result>? = null
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(cardholderAddress: CardholderAddress) = apply {
                            actualLine1 = cardholderAddress.actualLine1
                            actualPostalCode = cardholderAddress.actualPostalCode
                            providedLine1 = cardholderAddress.providedLine1
                            providedPostalCode = cardholderAddress.providedPostalCode
                            result = cardholderAddress.result
                            additionalProperties =
                                cardholderAddress.additionalProperties.toMutableMap()
                        }

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: String?) =
                            actualLine1(JsonField.ofNullable(actualLine1))

                        /** Line 1 of the address on file for the cardholder. */
                        fun actualLine1(actualLine1: JsonField<String>) = apply {
                            this.actualLine1 = actualLine1
                        }

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: String?) =
                            actualPostalCode(JsonField.ofNullable(actualPostalCode))

                        /** The postal code of the address on file for the cardholder. */
                        fun actualPostalCode(actualPostalCode: JsonField<String>) = apply {
                            this.actualPostalCode = actualPostalCode
                        }

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: String?) =
                            providedLine1(JsonField.ofNullable(providedLine1))

                        /**
                         * The cardholder address line 1 provided for verification in the
                         * authorization request.
                         */
                        fun providedLine1(providedLine1: JsonField<String>) = apply {
                            this.providedLine1 = providedLine1
                        }

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: String?) =
                            providedPostalCode(JsonField.ofNullable(providedPostalCode))

                        /**
                         * The postal code provided for verification in the authorization request.
                         */
                        fun providedPostalCode(providedPostalCode: JsonField<String>) = apply {
                            this.providedPostalCode = providedPostalCode
                        }

                        /** The address verification result returned to the card network. */
                        fun result(result: Result) = result(JsonField.of(result))

                        /** The address verification result returned to the card network. */
                        fun result(result: JsonField<Result>) = apply { this.result = result }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                putAllAdditionalProperties(additionalProperties)
                            }

                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun removeAdditionalProperty(key: String) = apply {
                            additionalProperties.remove(key)
                        }

                        fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                            keys.forEach(::removeAdditionalProperty)
                        }

                        fun build(): CardholderAddress =
                            CardholderAddress(
                                checkNotNull(actualLine1) {
                                    "`actualLine1` is required but was not set"
                                },
                                checkNotNull(actualPostalCode) {
                                    "`actualPostalCode` is required but was not set"
                                },
                                checkNotNull(providedLine1) {
                                    "`providedLine1` is required but was not set"
                                },
                                checkNotNull(providedPostalCode) {
                                    "`providedPostalCode` is required but was not set"
                                },
                                checkNotNull(result) { "`result` is required but was not set" },
                                additionalProperties.toImmutable(),
                            )
                    }

                    class Result
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) : Enum {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        companion object {

                            val NOT_CHECKED = of("not_checked")

                            val POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED =
                                of("postal_code_match_address_not_checked")

                            val POSTAL_CODE_MATCH_ADDRESS_NO_MATCH =
                                of("postal_code_match_address_no_match")

                            val POSTAL_CODE_NO_MATCH_ADDRESS_MATCH =
                                of("postal_code_no_match_address_match")

                            val MATCH = of("match")

                            val NO_MATCH = of("no_match")

                            fun of(value: String) = Result(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            MATCH,
                            NO_MATCH,
                        }

                        enum class Value {
                            NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED,
                            POSTAL_CODE_MATCH_ADDRESS_NO_MATCH,
                            POSTAL_CODE_NO_MATCH_ADDRESS_MATCH,
                            MATCH,
                            NO_MATCH,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_CHECKED -> Value.NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Value.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Value.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Value.MATCH
                                NO_MATCH -> Value.NO_MATCH
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_CHECKED -> Known.NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NOT_CHECKED
                                POSTAL_CODE_MATCH_ADDRESS_NO_MATCH ->
                                    Known.POSTAL_CODE_MATCH_ADDRESS_NO_MATCH
                                POSTAL_CODE_NO_MATCH_ADDRESS_MATCH ->
                                    Known.POSTAL_CODE_NO_MATCH_ADDRESS_MATCH
                                MATCH -> Known.MATCH
                                NO_MATCH -> Known.NO_MATCH
                                else -> throw IncreaseInvalidDataException("Unknown Result: $value")
                            }

                        fun asString(): String = _value().asStringOrThrow()

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return /* spotless:off */ other is Result && value == other.value /* spotless:on */
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()
                    }

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return /* spotless:off */ other is CardholderAddress && actualLine1 == other.actualLine1 && actualPostalCode == other.actualPostalCode && providedLine1 == other.providedLine1 && providedPostalCode == other.providedPostalCode && result == other.result && additionalProperties == other.additionalProperties /* spotless:on */
                    }

                    /* spotless:off */
                    private val hashCode: Int by lazy { Objects.hash(actualLine1, actualPostalCode, providedLine1, providedPostalCode, result, additionalProperties) }
                    /* spotless:on */

                    override fun hashCode(): Int = hashCode

                    override fun toString() =
                        "CardholderAddress{actualLine1=$actualLine1, actualPostalCode=$actualPostalCode, providedLine1=$providedLine1, providedPostalCode=$providedPostalCode, result=$result, additionalProperties=$additionalProperties}"
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Verification && cardVerificationCode == other.cardVerificationCode && cardholderAddress == other.cardholderAddress && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(cardVerificationCode, cardholderAddress, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Verification{cardVerificationCode=$cardVerificationCode, cardholderAddress=$cardholderAddress, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CardAuthorization && id == other.id && actioner == other.actioner && amount == other.amount && cardPaymentId == other.cardPaymentId && currency == other.currency && digitalWalletTokenId == other.digitalWalletTokenId && direction == other.direction && expiresAt == other.expiresAt && merchantAcceptorId == other.merchantAcceptorId && merchantCategoryCode == other.merchantCategoryCode && merchantCity == other.merchantCity && merchantCountry == other.merchantCountry && merchantDescriptor == other.merchantDescriptor && merchantPostalCode == other.merchantPostalCode && merchantState == other.merchantState && networkDetails == other.networkDetails && networkIdentifiers == other.networkIdentifiers && networkRiskScore == other.networkRiskScore && pendingTransactionId == other.pendingTransactionId && physicalCardId == other.physicalCardId && presentmentAmount == other.presentmentAmount && presentmentCurrency == other.presentmentCurrency && processingCategory == other.processingCategory && realTimeDecisionId == other.realTimeDecisionId && terminalId == other.terminalId && type == other.type && verification == other.verification && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, actioner, amount, cardPaymentId, currency, digitalWalletTokenId, direction, expiresAt, merchantAcceptorId, merchantCategoryCode, merchantCity, merchantCountry, merchantDescriptor, merchantPostalCode, merchantState, networkDetails, networkIdentifiers, networkRiskScore, pendingTransactionId, physicalCardId, presentmentAmount, presentmentCurrency, processingCategory, realTimeDecisionId, terminalId, type, verification, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CardAuthorization{id=$id, actioner=$actioner, amount=$amount, cardPaymentId=$cardPaymentId, currency=$currency, digitalWalletTokenId=$digitalWalletTokenId, direction=$direction, expiresAt=$expiresAt, merchantAcceptorId=$merchantAcceptorId, merchantCategoryCode=$merchantCategoryCode, merchantCity=$merchantCity, merchantCountry=$merchantCountry, merchantDescriptor=$merchantDescriptor, merchantPostalCode=$merchantPostalCode, merchantState=$merchantState, networkDetails=$networkDetails, networkIdentifiers=$networkIdentifiers, networkRiskScore=$networkRiskScore, pendingTransactionId=$pendingTransactionId, physicalCardId=$physicalCardId, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, processingCategory=$processingCategory, realTimeDecisionId=$realTimeDecisionId, terminalId=$terminalId, type=$type, verification=$verification, additionalProperties=$additionalProperties}"
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT_TRANSFER_INSTRUCTION = of("account_transfer_instruction")

                val ACH_TRANSFER_INSTRUCTION = of("ach_transfer_instruction")

                val CARD_AUTHORIZATION = of("card_authorization")

                val CHECK_DEPOSIT_INSTRUCTION = of("check_deposit_instruction")

                val CHECK_TRANSFER_INSTRUCTION = of("check_transfer_instruction")

                val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                val REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION =
                    of("real_time_payments_transfer_instruction")

                val WIRE_TRANSFER_INSTRUCTION = of("wire_transfer_instruction")

                val INBOUND_WIRE_TRANSFER_REVERSAL = of("inbound_wire_transfer_reversal")

                val OTHER = of("other")

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INSTRUCTION,
                ACH_TRANSFER_INSTRUCTION,
                CARD_AUTHORIZATION,
                CHECK_DEPOSIT_INSTRUCTION,
                CHECK_TRANSFER_INSTRUCTION,
                INBOUND_FUNDS_HOLD,
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                WIRE_TRANSFER_INSTRUCTION,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INSTRUCTION,
                ACH_TRANSFER_INSTRUCTION,
                CARD_AUTHORIZATION,
                CHECK_DEPOSIT_INSTRUCTION,
                CHECK_TRANSFER_INSTRUCTION,
                INBOUND_FUNDS_HOLD,
                REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION,
                WIRE_TRANSFER_INSTRUCTION,
                INBOUND_WIRE_TRANSFER_REVERSAL,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INSTRUCTION -> Value.ACCOUNT_TRANSFER_INSTRUCTION
                    ACH_TRANSFER_INSTRUCTION -> Value.ACH_TRANSFER_INSTRUCTION
                    CARD_AUTHORIZATION -> Value.CARD_AUTHORIZATION
                    CHECK_DEPOSIT_INSTRUCTION -> Value.CHECK_DEPOSIT_INSTRUCTION
                    CHECK_TRANSFER_INSTRUCTION -> Value.CHECK_TRANSFER_INSTRUCTION
                    INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                    WIRE_TRANSFER_INSTRUCTION -> Value.WIRE_TRANSFER_INSTRUCTION
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Value.INBOUND_WIRE_TRANSFER_REVERSAL
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INSTRUCTION -> Known.ACCOUNT_TRANSFER_INSTRUCTION
                    ACH_TRANSFER_INSTRUCTION -> Known.ACH_TRANSFER_INSTRUCTION
                    CARD_AUTHORIZATION -> Known.CARD_AUTHORIZATION
                    CHECK_DEPOSIT_INSTRUCTION -> Known.CHECK_DEPOSIT_INSTRUCTION
                    CHECK_TRANSFER_INSTRUCTION -> Known.CHECK_TRANSFER_INSTRUCTION
                    INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
                    REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_INSTRUCTION
                    WIRE_TRANSFER_INSTRUCTION -> Known.WIRE_TRANSFER_INSTRUCTION
                    INBOUND_WIRE_TRANSFER_REVERSAL -> Known.INBOUND_WIRE_TRANSFER_REVERSAL
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * A Check Deposit Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_deposit_instruction`.
         */
        @NoAutoDetect
        class CheckDepositInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            private val backImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            private val checkDepositId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            private val frontImageFileId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The pending amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the File containing the image of the back of the check that was
             * deposited.
             */
            fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

            /** The identifier of the Check Deposit. */
            fun checkDepositId(): String? = checkDepositId.getNullable("check_deposit_id")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The identifier of the File containing the image of the front of the check that was
             * deposited.
             */
            fun frontImageFileId(): String = frontImageFileId.getRequired("front_image_file_id")

            /** The pending amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The identifier of the File containing the image of the back of the check that was
             * deposited.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId(): JsonField<String> = backImageFileId

            /** The identifier of the Check Deposit. */
            @JsonProperty("check_deposit_id")
            @ExcludeMissing
            fun _checkDepositId(): JsonField<String> = checkDepositId

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /**
             * The identifier of the File containing the image of the front of the check that was
             * deposited.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId(): JsonField<String> = frontImageFileId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CheckDepositInstruction = apply {
                if (!validated) {
                    amount()
                    backImageFileId()
                    checkDepositId()
                    currency()
                    frontImageFileId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long>? = null
                private var backImageFileId: JsonField<String>? = null
                private var checkDepositId: JsonField<String>? = null
                private var currency: JsonField<Currency>? = null
                private var frontImageFileId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkDepositInstruction: CheckDepositInstruction) = apply {
                    amount = checkDepositInstruction.amount
                    backImageFileId = checkDepositInstruction.backImageFileId
                    checkDepositId = checkDepositInstruction.checkDepositId
                    currency = checkDepositInstruction.currency
                    frontImageFileId = checkDepositInstruction.frontImageFileId
                    additionalProperties =
                        checkDepositInstruction.additionalProperties.toMutableMap()
                }

                /** The pending amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The pending amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                fun backImageFileId(backImageFileId: String?) =
                    backImageFileId(JsonField.ofNullable(backImageFileId))

                /**
                 * The identifier of the File containing the image of the back of the check that was
                 * deposited.
                 */
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /** The identifier of the Check Deposit. */
                fun checkDepositId(checkDepositId: String?) =
                    checkDepositId(JsonField.ofNullable(checkDepositId))

                /** The identifier of the Check Deposit. */
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * The identifier of the File containing the image of the front of the check that
                 * was deposited.
                 */
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CheckDepositInstruction =
                    CheckDepositInstruction(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(backImageFileId) {
                            "`backImageFileId` is required but was not set"
                        },
                        checkNotNull(checkDepositId) {
                            "`checkDepositId` is required but was not set"
                        },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(frontImageFileId) {
                            "`frontImageFileId` is required but was not set"
                        },
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val EUR = of("EUR")

                    val GBP = of("GBP")

                    val JPY = of("JPY")

                    val USD = of("USD")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckDepositInstruction && amount == other.amount && backImageFileId == other.backImageFileId && checkDepositId == other.checkDepositId && currency == other.currency && frontImageFileId == other.frontImageFileId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, backImageFileId, checkDepositId, currency, frontImageFileId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckDepositInstruction{amount=$amount, backImageFileId=$backImageFileId, checkDepositId=$checkDepositId, currency=$currency, frontImageFileId=$frontImageFileId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Check Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `check_transfer_instruction`.
         */
        @NoAutoDetect
        class CheckTransferInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the Check Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The identifier of the Check Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): CheckTransferInstruction = apply {
                if (!validated) {
                    amount()
                    currency()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long>? = null
                private var currency: JsonField<Currency>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkTransferInstruction: CheckTransferInstruction) = apply {
                    amount = checkTransferInstruction.amount
                    currency = checkTransferInstruction.currency
                    transferId = checkTransferInstruction.transferId
                    additionalProperties =
                        checkTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's
                 * currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Check Transfer that led to this Pending Transaction. */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): CheckTransferInstruction =
                    CheckTransferInstruction(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(transferId) { "`transferId` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val EUR = of("EUR")

                    val GBP = of("GBP")

                    val JPY = of("JPY")

                    val USD = of("USD")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is CheckTransferInstruction && amount == other.amount && currency == other.currency && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, currency, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "CheckTransferInstruction{amount=$amount, currency=$currency, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * An Inbound Funds Hold object. This field will be present in the JSON response if and only
         * if `category` is equal to `inbound_funds_hold`.
         */
        @NoAutoDetect
        class InboundFundsHold
        @JsonCreator
        private constructor(
            @JsonProperty("id")
            @ExcludeMissing
            private val id: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            private val automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("created_at")
            @ExcludeMissing
            private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("currency")
            @ExcludeMissing
            private val currency: JsonField<Currency> = JsonMissing.of(),
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            private val heldTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("released_at")
            @ExcludeMissing
            private val releasedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("status")
            @ExcludeMissing
            private val status: JsonField<Status> = JsonMissing.of(),
            @JsonProperty("type")
            @ExcludeMissing
            private val type: JsonField<Type> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The Inbound Funds Hold identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(): OffsetDateTime =
                automaticallyReleasesAt.getRequired("automatically_releases_at")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(): String? = heldTransactionId.getNullable("held_transaction_id")

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /** When the hold was released (if it has been released). */
            fun releasedAt(): OffsetDateTime? = releasedAt.getNullable("released_at")

            /** The status of the hold. */
            fun status(): Status = status.getRequired("status")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Inbound Funds Hold identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
            fun _automaticallyReleasesAt(): JsonField<OffsetDateTime> = automaticallyReleasesAt

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
             * created.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            @JsonProperty("currency")
            @ExcludeMissing
            fun _currency(): JsonField<Currency> = currency

            /** The ID of the Transaction for which funds were held. */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun _heldTransactionId(): JsonField<String> = heldTransactionId

            /** The ID of the Pending Transaction representing the held funds. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

            /** When the hold was released (if it has been released). */
            @JsonProperty("released_at")
            @ExcludeMissing
            fun _releasedAt(): JsonField<OffsetDateTime> = releasedAt

            /** The status of the hold. */
            @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

            /**
             * A constant representing the object's type. For this resource it will always be
             * `inbound_funds_hold`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): InboundFundsHold = apply {
                if (!validated) {
                    id()
                    amount()
                    automaticallyReleasesAt()
                    createdAt()
                    currency()
                    heldTransactionId()
                    pendingTransactionId()
                    releasedAt()
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

                private var id: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var automaticallyReleasesAt: JsonField<OffsetDateTime>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var currency: JsonField<Currency>? = null
                private var heldTransactionId: JsonField<String>? = null
                private var pendingTransactionId: JsonField<String>? = null
                private var releasedAt: JsonField<OffsetDateTime>? = null
                private var status: JsonField<Status>? = null
                private var type: JsonField<Type>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                    id = inboundFundsHold.id
                    amount = inboundFundsHold.amount
                    automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                    createdAt = inboundFundsHold.createdAt
                    currency = inboundFundsHold.currency
                    heldTransactionId = inboundFundsHold.heldTransactionId
                    pendingTransactionId = inboundFundsHold.pendingTransactionId
                    releasedAt = inboundFundsHold.releasedAt
                    status = inboundFundsHold.status
                    type = inboundFundsHold.type
                    additionalProperties = inboundFundsHold.additionalProperties.toMutableMap()
                }

                /** The Inbound Funds Hold identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Inbound Funds Hold identifier. */
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The held amount in the minor unit of the account's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                    automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

                /**
                 * When the hold will be released automatically. Certain conditions may cause it to
                 * be released before this time.
                 */
                fun automaticallyReleasesAt(automaticallyReleasesAt: JsonField<OffsetDateTime>) =
                    apply {
                        this.automaticallyReleasesAt = automaticallyReleasesAt
                    }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
                 * created.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's
                 * currency.
                 */
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(heldTransactionId: String?) =
                    heldTransactionId(JsonField.ofNullable(heldTransactionId))

                /** The ID of the Transaction for which funds were held. */
                fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                    this.heldTransactionId = heldTransactionId
                }

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(pendingTransactionId: String?) =
                    pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

                /** The ID of the Pending Transaction representing the held funds. */
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /** When the hold was released (if it has been released). */
                fun releasedAt(releasedAt: OffsetDateTime?) =
                    releasedAt(JsonField.ofNullable(releasedAt))

                /** When the hold was released (if it has been released). */
                fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                    this.releasedAt = releasedAt
                }

                /** The status of the hold. */
                fun status(status: Status) = status(JsonField.of(status))

                /** The status of the hold. */
                fun status(status: JsonField<Status>) = apply { this.status = status }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `inbound_funds_hold`.
                 */
                fun type(type: JsonField<Type>) = apply { this.type = type }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): InboundFundsHold =
                    InboundFundsHold(
                        checkNotNull(id) { "`id` is required but was not set" },
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(automaticallyReleasesAt) {
                            "`automaticallyReleasesAt` is required but was not set"
                        },
                        checkNotNull(createdAt) { "`createdAt` is required but was not set" },
                        checkNotNull(currency) { "`currency` is required but was not set" },
                        checkNotNull(heldTransactionId) {
                            "`heldTransactionId` is required but was not set"
                        },
                        checkNotNull(pendingTransactionId) {
                            "`pendingTransactionId` is required but was not set"
                        },
                        checkNotNull(releasedAt) { "`releasedAt` is required but was not set" },
                        checkNotNull(status) { "`status` is required but was not set" },
                        checkNotNull(type) { "`type` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val CAD = of("CAD")

                    val CHF = of("CHF")

                    val EUR = of("EUR")

                    val GBP = of("GBP")

                    val JPY = of("JPY")

                    val USD = of("USD")

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

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            class Status
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) : Enum {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    val HELD = of("held")

                    val COMPLETE = of("complete")

                    fun of(value: String) = Status(JsonField.of(value))
                }

                enum class Known {
                    HELD,
                    COMPLETE,
                }

                enum class Value {
                    HELD,
                    COMPLETE,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        HELD -> Value.HELD
                        COMPLETE -> Value.COMPLETE
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        HELD -> Known.HELD
                        COMPLETE -> Known.COMPLETE
                        else -> throw IncreaseInvalidDataException("Unknown Status: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

                    val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    INBOUND_FUNDS_HOLD,
                }

                enum class Value {
                    INBOUND_FUNDS_HOLD,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
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

                return /* spotless:off */ other is InboundFundsHold && id == other.id && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(id, amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, pendingTransactionId, releasedAt, status, type, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "InboundFundsHold{id=$id, amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
        }

        /**
         * A Real-Time Payments Transfer Instruction object. This field will be present in the JSON
         * response if and only if `category` is equal to `real_time_payments_transfer_instruction`.
         */
        @NoAutoDetect
        class RealTimePaymentsTransferInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Pending
             * Transaction.
             */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /**
             * The identifier of the Real-Time Payments Transfer that led to this Pending
             * Transaction.
             */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): RealTimePaymentsTransferInstruction = apply {
                if (!validated) {
                    amount()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    realTimePaymentsTransferInstruction: RealTimePaymentsTransferInstruction
                ) = apply {
                    amount = realTimePaymentsTransferInstruction.amount
                    transferId = realTimePaymentsTransferInstruction.transferId
                    additionalProperties =
                        realTimePaymentsTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * The identifier of the Real-Time Payments Transfer that led to this Pending
                 * Transaction.
                 */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): RealTimePaymentsTransferInstruction =
                    RealTimePaymentsTransferInstruction(
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(transferId) { "`transferId` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RealTimePaymentsTransferInstruction && amount == other.amount && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(amount, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "RealTimePaymentsTransferInstruction{amount=$amount, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        /**
         * A Wire Transfer Instruction object. This field will be present in the JSON response if
         * and only if `category` is equal to `wire_transfer_instruction`.
         */
        @NoAutoDetect
        class WireTransferInstruction
        @JsonCreator
        private constructor(
            @JsonProperty("account_number")
            @ExcludeMissing
            private val accountNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("amount")
            @ExcludeMissing
            private val amount: JsonField<Long> = JsonMissing.of(),
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            private val messageToRecipient: JsonField<String> = JsonMissing.of(),
            @JsonProperty("routing_number")
            @ExcludeMissing
            private val routingNumber: JsonField<String> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            private val transferId: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The account number for the destination account. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(): String =
                messageToRecipient.getRequired("message_to_recipient")

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /** The identifier of the Wire Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            @ExcludeMissing
            fun _accountNumber(): JsonField<String> = accountNumber

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

            /** The message that will show on the recipient's bank statement. */
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            fun _messageToRecipient(): JsonField<String> = messageToRecipient

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            @ExcludeMissing
            fun _routingNumber(): JsonField<String> = routingNumber

            /** The identifier of the Wire Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun _transferId(): JsonField<String> = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): WireTransferInstruction = apply {
                if (!validated) {
                    accountNumber()
                    amount()
                    messageToRecipient()
                    routingNumber()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var accountNumber: JsonField<String>? = null
                private var amount: JsonField<Long>? = null
                private var messageToRecipient: JsonField<String>? = null
                private var routingNumber: JsonField<String>? = null
                private var transferId: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(wireTransferInstruction: WireTransferInstruction) = apply {
                    accountNumber = wireTransferInstruction.accountNumber
                    amount = wireTransferInstruction.amount
                    messageToRecipient = wireTransferInstruction.messageToRecipient
                    routingNumber = wireTransferInstruction.routingNumber
                    transferId = wireTransferInstruction.transferId
                    additionalProperties =
                        wireTransferInstruction.additionalProperties.toMutableMap()
                }

                /** The account number for the destination account. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The account number for the destination account. */
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(messageToRecipient: String) =
                    messageToRecipient(JsonField.of(messageToRecipient))

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                    this.messageToRecipient = messageToRecipient
                }

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /**
                 * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
                 * destination account.
                 */
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Wire Transfer that led to this Pending Transaction. */
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun removeAdditionalProperty(key: String) = apply {
                    additionalProperties.remove(key)
                }

                fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                    keys.forEach(::removeAdditionalProperty)
                }

                fun build(): WireTransferInstruction =
                    WireTransferInstruction(
                        checkNotNull(accountNumber) {
                            "`accountNumber` is required but was not set"
                        },
                        checkNotNull(amount) { "`amount` is required but was not set" },
                        checkNotNull(messageToRecipient) {
                            "`messageToRecipient` is required but was not set"
                        },
                        checkNotNull(routingNumber) {
                            "`routingNumber` is required but was not set"
                        },
                        checkNotNull(transferId) { "`transferId` is required but was not set" },
                        additionalProperties.toImmutable(),
                    )
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is WireTransferInstruction && accountNumber == other.accountNumber && amount == other.amount && messageToRecipient == other.messageToRecipient && routingNumber == other.routingNumber && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(accountNumber, amount, messageToRecipient, routingNumber, transferId, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "WireTransferInstruction{accountNumber=$accountNumber, amount=$amount, messageToRecipient=$messageToRecipient, routingNumber=$routingNumber, transferId=$transferId, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Source && accountTransferInstruction == other.accountTransferInstruction && achTransferInstruction == other.achTransferInstruction && cardAuthorization == other.cardAuthorization && category == other.category && checkDepositInstruction == other.checkDepositInstruction && checkTransferInstruction == other.checkTransferInstruction && inboundFundsHold == other.inboundFundsHold && this.other == other.other && realTimePaymentsTransferInstruction == other.realTimePaymentsTransferInstruction && wireTransferInstruction == other.wireTransferInstruction && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountTransferInstruction, achTransferInstruction, cardAuthorization, category, checkDepositInstruction, checkTransferInstruction, inboundFundsHold, other, realTimePaymentsTransferInstruction, wireTransferInstruction, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Source{accountTransferInstruction=$accountTransferInstruction, achTransferInstruction=$achTransferInstruction, cardAuthorization=$cardAuthorization, category=$category, checkDepositInstruction=$checkDepositInstruction, checkTransferInstruction=$checkTransferInstruction, inboundFundsHold=$inboundFundsHold, other=$other, realTimePaymentsTransferInstruction=$realTimePaymentsTransferInstruction, wireTransferInstruction=$wireTransferInstruction, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING = of("pending")

            val COMPLETE = of("complete")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING,
            COMPLETE,
        }

        enum class Value {
            PENDING,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING -> Value.PENDING
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING -> Known.PENDING
                COMPLETE -> Known.COMPLETE
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Status && value == other.value /* spotless:on */
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

            val PENDING_TRANSACTION = of("pending_transaction")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            PENDING_TRANSACTION,
        }

        enum class Value {
            PENDING_TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_TRANSACTION -> Value.PENDING_TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_TRANSACTION -> Known.PENDING_TRANSACTION
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

        return /* spotless:off */ other is PendingTransaction && id == other.id && accountId == other.accountId && amount == other.amount && completedAt == other.completedAt && createdAt == other.createdAt && currency == other.currency && description == other.description && routeId == other.routeId && routeType == other.routeType && source == other.source && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, amount, completedAt, createdAt, currency, description, routeId, routeType, source, status, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "PendingTransaction{id=$id, accountId=$accountId, amount=$amount, completedAt=$completedAt, createdAt=$createdAt, currency=$currency, description=$description, routeId=$routeId, routeType=$routeType, source=$source, status=$status, type=$type, additionalProperties=$additionalProperties}"
}
