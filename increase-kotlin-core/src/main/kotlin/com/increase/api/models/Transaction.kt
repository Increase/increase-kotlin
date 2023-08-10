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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Transactions are the immutable additions and removals of money from your bank account. They're
 * the equivalent of line items on your bank statement.
 */
@JsonDeserialize(builder = Transaction.Builder::class)
@NoAutoDetect
class Transaction
private constructor(
    private val accountId: JsonField<String>,
    private val amount: JsonField<Long>,
    private val currency: JsonField<Currency>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val description: JsonField<String>,
    private val id: JsonField<String>,
    private val routeId: JsonField<String>,
    private val routeType: JsonField<RouteType>,
    private val source: JsonField<Source>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier for the Account the Transaction belongs to. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The Transaction amount in the minor unit of its currency. For dollars, for example, this is
     * cents.
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's currency.
     * This will match the currency on the Transcation's Account.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction occured.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * An informational message describing this transaction. Use the fields in `source` to get more
     * detailed information. This field appears as the line-item on the statement.
     */
    fun description(): String = description.getRequired("description")

    /** The Transaction identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier for the route this Transaction came through. Routes are things like cards and
     * ACH details.
     */
    fun routeId(): String? = routeId.getNullable("route_id")

    /** The type of the route this Transaction came through. */
    fun routeType(): RouteType? = routeType.getNullable("route_type")

    /**
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    fun source(): Source = source.getRequired("source")

    /**
     * A constant representing the object's type. For this resource it will always be `transaction`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier for the Account the Transaction belongs to. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * The Transaction amount in the minor unit of its currency. For dollars, for example, this is
     * cents.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's currency.
     * This will match the currency on the Transcation's Account.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction occured.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * An informational message describing this transaction. Use the fields in `source` to get more
     * detailed information. This field appears as the line-item on the statement.
     */
    @JsonProperty("description") @ExcludeMissing fun _description() = description

    /** The Transaction identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The identifier for the route this Transaction came through. Routes are things like cards and
     * ACH details.
     */
    @JsonProperty("route_id") @ExcludeMissing fun _routeId() = routeId

    /** The type of the route this Transaction came through. */
    @JsonProperty("route_type") @ExcludeMissing fun _routeType() = routeType

    /**
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    @JsonProperty("source") @ExcludeMissing fun _source() = source

    /**
     * A constant representing the object's type. For this resource it will always be `transaction`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): Transaction = apply {
        if (!validated) {
            accountId()
            amount()
            currency()
            createdAt()
            description()
            id()
            routeId()
            routeType()
            source().validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is Transaction &&
            this.accountId == other.accountId &&
            this.amount == other.amount &&
            this.currency == other.currency &&
            this.createdAt == other.createdAt &&
            this.description == other.description &&
            this.id == other.id &&
            this.routeId == other.routeId &&
            this.routeType == other.routeType &&
            this.source == other.source &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    amount,
                    currency,
                    createdAt,
                    description,
                    id,
                    routeId,
                    routeType,
                    source,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "Transaction{accountId=$accountId, amount=$amount, currency=$currency, createdAt=$createdAt, description=$description, id=$id, routeId=$routeId, routeType=$routeType, source=$source, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var description: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var routeId: JsonField<String> = JsonMissing.of()
        private var routeType: JsonField<RouteType> = JsonMissing.of()
        private var source: JsonField<Source> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(transaction: Transaction) = apply {
            this.accountId = transaction.accountId
            this.amount = transaction.amount
            this.currency = transaction.currency
            this.createdAt = transaction.createdAt
            this.description = transaction.description
            this.id = transaction.id
            this.routeId = transaction.routeId
            this.routeType = transaction.routeType
            this.source = transaction.source
            this.type = transaction.type
            additionalProperties(transaction.additionalProperties)
        }

        /** The identifier for the Account the Transaction belongs to. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier for the Account the Transaction belongs to. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The Transaction amount in the minor unit of its currency. For dollars, for example, this
         * is cents.
         */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transcation's Account.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the Transaction's
         * currency. This will match the currency on the Transcation's Account.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date on which the Transaction
         * occured.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * An informational message describing this transaction. Use the fields in `source` to get
         * more detailed information. This field appears as the line-item on the statement.
         */
        fun description(description: String) = description(JsonField.of(description))

        /**
         * An informational message describing this transaction. Use the fields in `source` to get
         * more detailed information. This field appears as the line-item on the statement.
         */
        @JsonProperty("description")
        @ExcludeMissing
        fun description(description: JsonField<String>) = apply { this.description = description }

        /** The Transaction identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Transaction identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        fun routeId(routeId: String) = routeId(JsonField.of(routeId))

        /**
         * The identifier for the route this Transaction came through. Routes are things like cards
         * and ACH details.
         */
        @JsonProperty("route_id")
        @ExcludeMissing
        fun routeId(routeId: JsonField<String>) = apply { this.routeId = routeId }

        /** The type of the route this Transaction came through. */
        fun routeType(routeType: RouteType) = routeType(JsonField.of(routeType))

        /** The type of the route this Transaction came through. */
        @JsonProperty("route_type")
        @ExcludeMissing
        fun routeType(routeType: JsonField<RouteType>) = apply { this.routeType = routeType }

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        fun source(source: Source) = source(JsonField.of(source))

        /**
         * This is an object giving more details on the network-level event that caused the
         * Transaction. Note that for backwards compatibility reasons, additional undocumented keys
         * may appear in this object. These should be treated as deprecated and will be removed in
         * the future.
         */
        @JsonProperty("source")
        @ExcludeMissing
        fun source(source: JsonField<Source>) = apply { this.source = source }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `transaction`.
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

        fun build(): Transaction =
            Transaction(
                accountId,
                amount,
                currency,
                createdAt,
                description,
                id,
                routeId,
                routeType,
                source,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    class Currency
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

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

    class RouteType
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is RouteType && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val ACCOUNT_NUMBER = RouteType(JsonField.of("account_number"))

            val CARD = RouteType(JsonField.of("card"))

            fun of(value: String) = RouteType(JsonField.of(value))
        }

        enum class Known {
            ACCOUNT_NUMBER,
            CARD,
        }

        enum class Value {
            ACCOUNT_NUMBER,
            CARD,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACCOUNT_NUMBER -> Value.ACCOUNT_NUMBER
                CARD -> Value.CARD
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACCOUNT_NUMBER -> Known.ACCOUNT_NUMBER
                CARD -> Known.CARD
                else -> throw IncreaseInvalidDataException("Unknown RouteType: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /**
     * This is an object giving more details on the network-level event that caused the Transaction.
     * Note that for backwards compatibility reasons, additional undocumented keys may appear in
     * this object. These should be treated as deprecated and will be removed in the future.
     */
    @JsonDeserialize(builder = Source.Builder::class)
    @NoAutoDetect
    class Source
    private constructor(
        private val category: JsonField<Category>,
        private val accountTransferIntention: JsonField<AccountTransferIntention>,
        private val achTransferIntention: JsonField<AchTransferIntention>,
        private val achTransferRejection: JsonField<AchTransferRejection>,
        private val achTransferReturn: JsonField<AchTransferReturn>,
        private val cardDisputeAcceptance: JsonField<CardDisputeAcceptance>,
        private val cardRefund: JsonField<CardRefund>,
        private val cardRevenuePayment: JsonField<CardRevenuePayment>,
        private val cardSettlement: JsonField<CardSettlement>,
        private val checkDepositAcceptance: JsonField<CheckDepositAcceptance>,
        private val checkDepositReturn: JsonField<CheckDepositReturn>,
        private val checkTransferDeposit: JsonField<CheckTransferDeposit>,
        private val checkTransferIntention: JsonField<CheckTransferIntention>,
        private val checkTransferStopPaymentRequest: JsonField<CheckTransferStopPaymentRequest>,
        private val feePayment: JsonField<FeePayment>,
        private val inboundAchTransfer: JsonField<InboundAchTransfer>,
        private val inboundCheck: JsonField<InboundCheck>,
        private val inboundInternationalAchTransfer: JsonField<InboundInternationalAchTransfer>,
        private val inboundRealTimePaymentsTransferConfirmation:
            JsonField<InboundRealTimePaymentsTransferConfirmation>,
        private val inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment>,
        private val inboundWireDrawdownPaymentReversal:
            JsonField<InboundWireDrawdownPaymentReversal>,
        private val inboundWireReversal: JsonField<InboundWireReversal>,
        private val inboundWireTransfer: JsonField<InboundWireTransfer>,
        private val interestPayment: JsonField<InterestPayment>,
        private val internalSource: JsonField<InternalSource>,
        private val realTimePaymentsTransferAcknowledgement:
            JsonField<RealTimePaymentsTransferAcknowledgement>,
        private val sampleFunds: JsonField<SampleFunds>,
        private val wireTransferIntention: JsonField<WireTransferIntention>,
        private val wireTransferRejection: JsonField<WireTransferRejection>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        fun accountTransferIntention(): AccountTransferIntention? =
            accountTransferIntention.getNullable("account_transfer_intention")

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        fun achTransferIntention(): AchTransferIntention? =
            achTransferIntention.getNullable("ach_transfer_intention")

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        fun achTransferRejection(): AchTransferRejection? =
            achTransferRejection.getNullable("ach_transfer_rejection")

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        fun achTransferReturn(): AchTransferReturn? =
            achTransferReturn.getNullable("ach_transfer_return")

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        fun cardDisputeAcceptance(): CardDisputeAcceptance? =
            cardDisputeAcceptance.getNullable("card_dispute_acceptance")

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        fun cardRefund(): CardRefund? = cardRefund.getNullable("card_refund")

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        fun cardRevenuePayment(): CardRevenuePayment? =
            cardRevenuePayment.getNullable("card_revenue_payment")

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        fun cardSettlement(): CardSettlement? = cardSettlement.getNullable("card_settlement")

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        fun checkDepositAcceptance(): CheckDepositAcceptance? =
            checkDepositAcceptance.getNullable("check_deposit_acceptance")

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        fun checkDepositReturn(): CheckDepositReturn? =
            checkDepositReturn.getNullable("check_deposit_return")

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        fun checkTransferDeposit(): CheckTransferDeposit? =
            checkTransferDeposit.getNullable("check_transfer_deposit")

        /**
         * A Check Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_intention`.
         */
        fun checkTransferIntention(): CheckTransferIntention? =
            checkTransferIntention.getNullable("check_transfer_intention")

        /**
         * A Check Transfer Stop Payment Request object. This field will be present in the JSON
         * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
         */
        fun checkTransferStopPaymentRequest(): CheckTransferStopPaymentRequest? =
            checkTransferStopPaymentRequest.getNullable("check_transfer_stop_payment_request")

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        fun feePayment(): FeePayment? = feePayment.getNullable("fee_payment")

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        fun inboundAchTransfer(): InboundAchTransfer? =
            inboundAchTransfer.getNullable("inbound_ach_transfer")

        /**
         * An Inbound Check object. This field will be present in the JSON response if and only if
         * `category` is equal to `inbound_check`.
         */
        fun inboundCheck(): InboundCheck? = inboundCheck.getNullable("inbound_check")

        /**
         * An Inbound International ACH Transfer object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_international_ach_transfer`.
         */
        fun inboundInternationalAchTransfer(): InboundInternationalAchTransfer? =
            inboundInternationalAchTransfer.getNullable("inbound_international_ach_transfer")

        /**
         * An Inbound Real Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        fun inboundRealTimePaymentsTransferConfirmation():
            InboundRealTimePaymentsTransferConfirmation? =
            inboundRealTimePaymentsTransferConfirmation.getNullable(
                "inbound_real_time_payments_transfer_confirmation"
            )

        /**
         * An Inbound Wire Drawdown Payment object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_wire_drawdown_payment`.
         */
        fun inboundWireDrawdownPayment(): InboundWireDrawdownPayment? =
            inboundWireDrawdownPayment.getNullable("inbound_wire_drawdown_payment")

        /**
         * An Inbound Wire Drawdown Payment Reversal object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_drawdown_payment_reversal`.
         */
        fun inboundWireDrawdownPaymentReversal(): InboundWireDrawdownPaymentReversal? =
            inboundWireDrawdownPaymentReversal.getNullable("inbound_wire_drawdown_payment_reversal")

        /**
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        fun inboundWireReversal(): InboundWireReversal? =
            inboundWireReversal.getNullable("inbound_wire_reversal")

        /**
         * An Inbound Wire Transfer object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_transfer`.
         */
        fun inboundWireTransfer(): InboundWireTransfer? =
            inboundWireTransfer.getNullable("inbound_wire_transfer")

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        fun interestPayment(): InterestPayment? = interestPayment.getNullable("interest_payment")

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        fun internalSource(): InternalSource? = internalSource.getNullable("internal_source")

        /**
         * A Real Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        fun realTimePaymentsTransferAcknowledgement(): RealTimePaymentsTransferAcknowledgement? =
            realTimePaymentsTransferAcknowledgement.getNullable(
                "real_time_payments_transfer_acknowledgement"
            )

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        fun sampleFunds(): SampleFunds? = sampleFunds.getNullable("sample_funds")

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        fun wireTransferIntention(): WireTransferIntention? =
            wireTransferIntention.getNullable("wire_transfer_intention")

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        fun wireTransferRejection(): WireTransferRejection? =
            wireTransferRejection.getNullable("wire_transfer_rejection")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        @JsonProperty("account_transfer_intention")
        @ExcludeMissing
        fun _accountTransferIntention() = accountTransferIntention

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        @JsonProperty("ach_transfer_intention")
        @ExcludeMissing
        fun _achTransferIntention() = achTransferIntention

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        @JsonProperty("ach_transfer_rejection")
        @ExcludeMissing
        fun _achTransferRejection() = achTransferRejection

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        @JsonProperty("ach_transfer_return")
        @ExcludeMissing
        fun _achTransferReturn() = achTransferReturn

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        @JsonProperty("card_dispute_acceptance")
        @ExcludeMissing
        fun _cardDisputeAcceptance() = cardDisputeAcceptance

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonProperty("card_refund") @ExcludeMissing fun _cardRefund() = cardRefund

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        @JsonProperty("card_revenue_payment")
        @ExcludeMissing
        fun _cardRevenuePayment() = cardRevenuePayment

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonProperty("card_settlement") @ExcludeMissing fun _cardSettlement() = cardSettlement

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        @JsonProperty("check_deposit_acceptance")
        @ExcludeMissing
        fun _checkDepositAcceptance() = checkDepositAcceptance

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        @JsonProperty("check_deposit_return")
        @ExcludeMissing
        fun _checkDepositReturn() = checkDepositReturn

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        @JsonProperty("check_transfer_deposit")
        @ExcludeMissing
        fun _checkTransferDeposit() = checkTransferDeposit

        /**
         * A Check Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_intention`.
         */
        @JsonProperty("check_transfer_intention")
        @ExcludeMissing
        fun _checkTransferIntention() = checkTransferIntention

        /**
         * A Check Transfer Stop Payment Request object. This field will be present in the JSON
         * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
         */
        @JsonProperty("check_transfer_stop_payment_request")
        @ExcludeMissing
        fun _checkTransferStopPaymentRequest() = checkTransferStopPaymentRequest

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        @JsonProperty("fee_payment") @ExcludeMissing fun _feePayment() = feePayment

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        @JsonProperty("inbound_ach_transfer")
        @ExcludeMissing
        fun _inboundAchTransfer() = inboundAchTransfer

        /**
         * An Inbound Check object. This field will be present in the JSON response if and only if
         * `category` is equal to `inbound_check`.
         */
        @JsonProperty("inbound_check") @ExcludeMissing fun _inboundCheck() = inboundCheck

        /**
         * An Inbound International ACH Transfer object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_international_ach_transfer`.
         */
        @JsonProperty("inbound_international_ach_transfer")
        @ExcludeMissing
        fun _inboundInternationalAchTransfer() = inboundInternationalAchTransfer

        /**
         * An Inbound Real Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonProperty("inbound_real_time_payments_transfer_confirmation")
        @ExcludeMissing
        fun _inboundRealTimePaymentsTransferConfirmation() =
            inboundRealTimePaymentsTransferConfirmation

        /**
         * An Inbound Wire Drawdown Payment object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_wire_drawdown_payment`.
         */
        @JsonProperty("inbound_wire_drawdown_payment")
        @ExcludeMissing
        fun _inboundWireDrawdownPayment() = inboundWireDrawdownPayment

        /**
         * An Inbound Wire Drawdown Payment Reversal object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_drawdown_payment_reversal`.
         */
        @JsonProperty("inbound_wire_drawdown_payment_reversal")
        @ExcludeMissing
        fun _inboundWireDrawdownPaymentReversal() = inboundWireDrawdownPaymentReversal

        /**
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        @JsonProperty("inbound_wire_reversal")
        @ExcludeMissing
        fun _inboundWireReversal() = inboundWireReversal

        /**
         * An Inbound Wire Transfer object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_transfer`.
         */
        @JsonProperty("inbound_wire_transfer")
        @ExcludeMissing
        fun _inboundWireTransfer() = inboundWireTransfer

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        @JsonProperty("interest_payment") @ExcludeMissing fun _interestPayment() = interestPayment

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        @JsonProperty("internal_source") @ExcludeMissing fun _internalSource() = internalSource

        /**
         * A Real Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        @JsonProperty("real_time_payments_transfer_acknowledgement")
        @ExcludeMissing
        fun _realTimePaymentsTransferAcknowledgement() = realTimePaymentsTransferAcknowledgement

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        @JsonProperty("sample_funds") @ExcludeMissing fun _sampleFunds() = sampleFunds

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        @JsonProperty("wire_transfer_intention")
        @ExcludeMissing
        fun _wireTransferIntention() = wireTransferIntention

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        @JsonProperty("wire_transfer_rejection")
        @ExcludeMissing
        fun _wireTransferRejection() = wireTransferRejection

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Source = apply {
            if (!validated) {
                category()
                accountTransferIntention()?.validate()
                achTransferIntention()?.validate()
                achTransferRejection()?.validate()
                achTransferReturn()?.validate()
                cardDisputeAcceptance()?.validate()
                cardRefund()?.validate()
                cardRevenuePayment()?.validate()
                cardSettlement()?.validate()
                checkDepositAcceptance()?.validate()
                checkDepositReturn()?.validate()
                checkTransferDeposit()?.validate()
                checkTransferIntention()?.validate()
                checkTransferStopPaymentRequest()?.validate()
                feePayment()?.validate()
                inboundAchTransfer()?.validate()
                inboundCheck()?.validate()
                inboundInternationalAchTransfer()?.validate()
                inboundRealTimePaymentsTransferConfirmation()?.validate()
                inboundWireDrawdownPayment()?.validate()
                inboundWireDrawdownPaymentReversal()?.validate()
                inboundWireReversal()?.validate()
                inboundWireTransfer()?.validate()
                interestPayment()?.validate()
                internalSource()?.validate()
                realTimePaymentsTransferAcknowledgement()?.validate()
                sampleFunds()?.validate()
                wireTransferIntention()?.validate()
                wireTransferRejection()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Source &&
                this.category == other.category &&
                this.accountTransferIntention == other.accountTransferIntention &&
                this.achTransferIntention == other.achTransferIntention &&
                this.achTransferRejection == other.achTransferRejection &&
                this.achTransferReturn == other.achTransferReturn &&
                this.cardDisputeAcceptance == other.cardDisputeAcceptance &&
                this.cardRefund == other.cardRefund &&
                this.cardRevenuePayment == other.cardRevenuePayment &&
                this.cardSettlement == other.cardSettlement &&
                this.checkDepositAcceptance == other.checkDepositAcceptance &&
                this.checkDepositReturn == other.checkDepositReturn &&
                this.checkTransferDeposit == other.checkTransferDeposit &&
                this.checkTransferIntention == other.checkTransferIntention &&
                this.checkTransferStopPaymentRequest == other.checkTransferStopPaymentRequest &&
                this.feePayment == other.feePayment &&
                this.inboundAchTransfer == other.inboundAchTransfer &&
                this.inboundCheck == other.inboundCheck &&
                this.inboundInternationalAchTransfer == other.inboundInternationalAchTransfer &&
                this.inboundRealTimePaymentsTransferConfirmation ==
                    other.inboundRealTimePaymentsTransferConfirmation &&
                this.inboundWireDrawdownPayment == other.inboundWireDrawdownPayment &&
                this.inboundWireDrawdownPaymentReversal ==
                    other.inboundWireDrawdownPaymentReversal &&
                this.inboundWireReversal == other.inboundWireReversal &&
                this.inboundWireTransfer == other.inboundWireTransfer &&
                this.interestPayment == other.interestPayment &&
                this.internalSource == other.internalSource &&
                this.realTimePaymentsTransferAcknowledgement ==
                    other.realTimePaymentsTransferAcknowledgement &&
                this.sampleFunds == other.sampleFunds &&
                this.wireTransferIntention == other.wireTransferIntention &&
                this.wireTransferRejection == other.wireTransferRejection &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        category,
                        accountTransferIntention,
                        achTransferIntention,
                        achTransferRejection,
                        achTransferReturn,
                        cardDisputeAcceptance,
                        cardRefund,
                        cardRevenuePayment,
                        cardSettlement,
                        checkDepositAcceptance,
                        checkDepositReturn,
                        checkTransferDeposit,
                        checkTransferIntention,
                        checkTransferStopPaymentRequest,
                        feePayment,
                        inboundAchTransfer,
                        inboundCheck,
                        inboundInternationalAchTransfer,
                        inboundRealTimePaymentsTransferConfirmation,
                        inboundWireDrawdownPayment,
                        inboundWireDrawdownPaymentReversal,
                        inboundWireReversal,
                        inboundWireTransfer,
                        interestPayment,
                        internalSource,
                        realTimePaymentsTransferAcknowledgement,
                        sampleFunds,
                        wireTransferIntention,
                        wireTransferRejection,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Source{category=$category, accountTransferIntention=$accountTransferIntention, achTransferIntention=$achTransferIntention, achTransferRejection=$achTransferRejection, achTransferReturn=$achTransferReturn, cardDisputeAcceptance=$cardDisputeAcceptance, cardRefund=$cardRefund, cardRevenuePayment=$cardRevenuePayment, cardSettlement=$cardSettlement, checkDepositAcceptance=$checkDepositAcceptance, checkDepositReturn=$checkDepositReturn, checkTransferDeposit=$checkTransferDeposit, checkTransferIntention=$checkTransferIntention, checkTransferStopPaymentRequest=$checkTransferStopPaymentRequest, feePayment=$feePayment, inboundAchTransfer=$inboundAchTransfer, inboundCheck=$inboundCheck, inboundInternationalAchTransfer=$inboundInternationalAchTransfer, inboundRealTimePaymentsTransferConfirmation=$inboundRealTimePaymentsTransferConfirmation, inboundWireDrawdownPayment=$inboundWireDrawdownPayment, inboundWireDrawdownPaymentReversal=$inboundWireDrawdownPaymentReversal, inboundWireReversal=$inboundWireReversal, inboundWireTransfer=$inboundWireTransfer, interestPayment=$interestPayment, internalSource=$internalSource, realTimePaymentsTransferAcknowledgement=$realTimePaymentsTransferAcknowledgement, sampleFunds=$sampleFunds, wireTransferIntention=$wireTransferIntention, wireTransferRejection=$wireTransferRejection, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var accountTransferIntention: JsonField<AccountTransferIntention> =
                JsonMissing.of()
            private var achTransferIntention: JsonField<AchTransferIntention> = JsonMissing.of()
            private var achTransferRejection: JsonField<AchTransferRejection> = JsonMissing.of()
            private var achTransferReturn: JsonField<AchTransferReturn> = JsonMissing.of()
            private var cardDisputeAcceptance: JsonField<CardDisputeAcceptance> = JsonMissing.of()
            private var cardRefund: JsonField<CardRefund> = JsonMissing.of()
            private var cardRevenuePayment: JsonField<CardRevenuePayment> = JsonMissing.of()
            private var cardSettlement: JsonField<CardSettlement> = JsonMissing.of()
            private var checkDepositAcceptance: JsonField<CheckDepositAcceptance> = JsonMissing.of()
            private var checkDepositReturn: JsonField<CheckDepositReturn> = JsonMissing.of()
            private var checkTransferDeposit: JsonField<CheckTransferDeposit> = JsonMissing.of()
            private var checkTransferIntention: JsonField<CheckTransferIntention> = JsonMissing.of()
            private var checkTransferStopPaymentRequest:
                JsonField<CheckTransferStopPaymentRequest> =
                JsonMissing.of()
            private var feePayment: JsonField<FeePayment> = JsonMissing.of()
            private var inboundAchTransfer: JsonField<InboundAchTransfer> = JsonMissing.of()
            private var inboundCheck: JsonField<InboundCheck> = JsonMissing.of()
            private var inboundInternationalAchTransfer:
                JsonField<InboundInternationalAchTransfer> =
                JsonMissing.of()
            private var inboundRealTimePaymentsTransferConfirmation:
                JsonField<InboundRealTimePaymentsTransferConfirmation> =
                JsonMissing.of()
            private var inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment> =
                JsonMissing.of()
            private var inboundWireDrawdownPaymentReversal:
                JsonField<InboundWireDrawdownPaymentReversal> =
                JsonMissing.of()
            private var inboundWireReversal: JsonField<InboundWireReversal> = JsonMissing.of()
            private var inboundWireTransfer: JsonField<InboundWireTransfer> = JsonMissing.of()
            private var interestPayment: JsonField<InterestPayment> = JsonMissing.of()
            private var internalSource: JsonField<InternalSource> = JsonMissing.of()
            private var realTimePaymentsTransferAcknowledgement:
                JsonField<RealTimePaymentsTransferAcknowledgement> =
                JsonMissing.of()
            private var sampleFunds: JsonField<SampleFunds> = JsonMissing.of()
            private var wireTransferIntention: JsonField<WireTransferIntention> = JsonMissing.of()
            private var wireTransferRejection: JsonField<WireTransferRejection> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(source: Source) = apply {
                this.category = source.category
                this.accountTransferIntention = source.accountTransferIntention
                this.achTransferIntention = source.achTransferIntention
                this.achTransferRejection = source.achTransferRejection
                this.achTransferReturn = source.achTransferReturn
                this.cardDisputeAcceptance = source.cardDisputeAcceptance
                this.cardRefund = source.cardRefund
                this.cardRevenuePayment = source.cardRevenuePayment
                this.cardSettlement = source.cardSettlement
                this.checkDepositAcceptance = source.checkDepositAcceptance
                this.checkDepositReturn = source.checkDepositReturn
                this.checkTransferDeposit = source.checkTransferDeposit
                this.checkTransferIntention = source.checkTransferIntention
                this.checkTransferStopPaymentRequest = source.checkTransferStopPaymentRequest
                this.feePayment = source.feePayment
                this.inboundAchTransfer = source.inboundAchTransfer
                this.inboundCheck = source.inboundCheck
                this.inboundInternationalAchTransfer = source.inboundInternationalAchTransfer
                this.inboundRealTimePaymentsTransferConfirmation =
                    source.inboundRealTimePaymentsTransferConfirmation
                this.inboundWireDrawdownPayment = source.inboundWireDrawdownPayment
                this.inboundWireDrawdownPaymentReversal = source.inboundWireDrawdownPaymentReversal
                this.inboundWireReversal = source.inboundWireReversal
                this.inboundWireTransfer = source.inboundWireTransfer
                this.interestPayment = source.interestPayment
                this.internalSource = source.internalSource
                this.realTimePaymentsTransferAcknowledgement =
                    source.realTimePaymentsTransferAcknowledgement
                this.sampleFunds = source.sampleFunds
                this.wireTransferIntention = source.wireTransferIntention
                this.wireTransferRejection = source.wireTransferRejection
                additionalProperties(source.additionalProperties)
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
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /**
             * An Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            fun accountTransferIntention(accountTransferIntention: AccountTransferIntention) =
                accountTransferIntention(JsonField.of(accountTransferIntention))

            /**
             * An Account Transfer Intention object. This field will be present in the JSON response
             * if and only if `category` is equal to `account_transfer_intention`.
             */
            @JsonProperty("account_transfer_intention")
            @ExcludeMissing
            fun accountTransferIntention(
                accountTransferIntention: JsonField<AccountTransferIntention>
            ) = apply { this.accountTransferIntention = accountTransferIntention }

            /**
             * An ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            fun achTransferIntention(achTransferIntention: AchTransferIntention) =
                achTransferIntention(JsonField.of(achTransferIntention))

            /**
             * An ACH Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_intention`.
             */
            @JsonProperty("ach_transfer_intention")
            @ExcludeMissing
            fun achTransferIntention(achTransferIntention: JsonField<AchTransferIntention>) =
                apply {
                    this.achTransferIntention = achTransferIntention
                }

            /**
             * An ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            fun achTransferRejection(achTransferRejection: AchTransferRejection) =
                achTransferRejection(JsonField.of(achTransferRejection))

            /**
             * An ACH Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `ach_transfer_rejection`.
             */
            @JsonProperty("ach_transfer_rejection")
            @ExcludeMissing
            fun achTransferRejection(achTransferRejection: JsonField<AchTransferRejection>) =
                apply {
                    this.achTransferRejection = achTransferRejection
                }

            /**
             * An ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            fun achTransferReturn(achTransferReturn: AchTransferReturn) =
                achTransferReturn(JsonField.of(achTransferReturn))

            /**
             * An ACH Transfer Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `ach_transfer_return`.
             */
            @JsonProperty("ach_transfer_return")
            @ExcludeMissing
            fun achTransferReturn(achTransferReturn: JsonField<AchTransferReturn>) = apply {
                this.achTransferReturn = achTransferReturn
            }

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            fun cardDisputeAcceptance(cardDisputeAcceptance: CardDisputeAcceptance) =
                cardDisputeAcceptance(JsonField.of(cardDisputeAcceptance))

            /**
             * A Card Dispute Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `card_dispute_acceptance`.
             */
            @JsonProperty("card_dispute_acceptance")
            @ExcludeMissing
            fun cardDisputeAcceptance(cardDisputeAcceptance: JsonField<CardDisputeAcceptance>) =
                apply {
                    this.cardDisputeAcceptance = cardDisputeAcceptance
                }

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            fun cardRefund(cardRefund: CardRefund) = cardRefund(JsonField.of(cardRefund))

            /**
             * A Card Refund object. This field will be present in the JSON response if and only if
             * `category` is equal to `card_refund`.
             */
            @JsonProperty("card_refund")
            @ExcludeMissing
            fun cardRefund(cardRefund: JsonField<CardRefund>) = apply {
                this.cardRefund = cardRefund
            }

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            fun cardRevenuePayment(cardRevenuePayment: CardRevenuePayment) =
                cardRevenuePayment(JsonField.of(cardRevenuePayment))

            /**
             * A Card Revenue Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `card_revenue_payment`.
             */
            @JsonProperty("card_revenue_payment")
            @ExcludeMissing
            fun cardRevenuePayment(cardRevenuePayment: JsonField<CardRevenuePayment>) = apply {
                this.cardRevenuePayment = cardRevenuePayment
            }

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            fun cardSettlement(cardSettlement: CardSettlement) =
                cardSettlement(JsonField.of(cardSettlement))

            /**
             * A Card Settlement object. This field will be present in the JSON response if and only
             * if `category` is equal to `card_settlement`.
             */
            @JsonProperty("card_settlement")
            @ExcludeMissing
            fun cardSettlement(cardSettlement: JsonField<CardSettlement>) = apply {
                this.cardSettlement = cardSettlement
            }

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
             */
            fun checkDepositAcceptance(checkDepositAcceptance: CheckDepositAcceptance) =
                checkDepositAcceptance(JsonField.of(checkDepositAcceptance))

            /**
             * A Check Deposit Acceptance object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_deposit_acceptance`.
             */
            @JsonProperty("check_deposit_acceptance")
            @ExcludeMissing
            fun checkDepositAcceptance(checkDepositAcceptance: JsonField<CheckDepositAcceptance>) =
                apply {
                    this.checkDepositAcceptance = checkDepositAcceptance
                }

            /**
             * A Check Deposit Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `check_deposit_return`.
             */
            fun checkDepositReturn(checkDepositReturn: CheckDepositReturn) =
                checkDepositReturn(JsonField.of(checkDepositReturn))

            /**
             * A Check Deposit Return object. This field will be present in the JSON response if and
             * only if `category` is equal to `check_deposit_return`.
             */
            @JsonProperty("check_deposit_return")
            @ExcludeMissing
            fun checkDepositReturn(checkDepositReturn: JsonField<CheckDepositReturn>) = apply {
                this.checkDepositReturn = checkDepositReturn
            }

            /**
             * A Check Transfer Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_deposit`.
             */
            fun checkTransferDeposit(checkTransferDeposit: CheckTransferDeposit) =
                checkTransferDeposit(JsonField.of(checkTransferDeposit))

            /**
             * A Check Transfer Deposit object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_deposit`.
             */
            @JsonProperty("check_transfer_deposit")
            @ExcludeMissing
            fun checkTransferDeposit(checkTransferDeposit: JsonField<CheckTransferDeposit>) =
                apply {
                    this.checkTransferDeposit = checkTransferDeposit
                }

            /**
             * A Check Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_intention`.
             */
            fun checkTransferIntention(checkTransferIntention: CheckTransferIntention) =
                checkTransferIntention(JsonField.of(checkTransferIntention))

            /**
             * A Check Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `check_transfer_intention`.
             */
            @JsonProperty("check_transfer_intention")
            @ExcludeMissing
            fun checkTransferIntention(checkTransferIntention: JsonField<CheckTransferIntention>) =
                apply {
                    this.checkTransferIntention = checkTransferIntention
                }

            /**
             * A Check Transfer Stop Payment Request object. This field will be present in the JSON
             * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
             */
            fun checkTransferStopPaymentRequest(
                checkTransferStopPaymentRequest: CheckTransferStopPaymentRequest
            ) = checkTransferStopPaymentRequest(JsonField.of(checkTransferStopPaymentRequest))

            /**
             * A Check Transfer Stop Payment Request object. This field will be present in the JSON
             * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
             */
            @JsonProperty("check_transfer_stop_payment_request")
            @ExcludeMissing
            fun checkTransferStopPaymentRequest(
                checkTransferStopPaymentRequest: JsonField<CheckTransferStopPaymentRequest>
            ) = apply { this.checkTransferStopPaymentRequest = checkTransferStopPaymentRequest }

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            fun feePayment(feePayment: FeePayment) = feePayment(JsonField.of(feePayment))

            /**
             * A Fee Payment object. This field will be present in the JSON response if and only if
             * `category` is equal to `fee_payment`.
             */
            @JsonProperty("fee_payment")
            @ExcludeMissing
            fun feePayment(feePayment: JsonField<FeePayment>) = apply {
                this.feePayment = feePayment
            }

            /**
             * An Inbound ACH Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_ach_transfer`.
             */
            fun inboundAchTransfer(inboundAchTransfer: InboundAchTransfer) =
                inboundAchTransfer(JsonField.of(inboundAchTransfer))

            /**
             * An Inbound ACH Transfer Intention object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_ach_transfer`.
             */
            @JsonProperty("inbound_ach_transfer")
            @ExcludeMissing
            fun inboundAchTransfer(inboundAchTransfer: JsonField<InboundAchTransfer>) = apply {
                this.inboundAchTransfer = inboundAchTransfer
            }

            /**
             * An Inbound Check object. This field will be present in the JSON response if and only
             * if `category` is equal to `inbound_check`.
             */
            fun inboundCheck(inboundCheck: InboundCheck) = inboundCheck(JsonField.of(inboundCheck))

            /**
             * An Inbound Check object. This field will be present in the JSON response if and only
             * if `category` is equal to `inbound_check`.
             */
            @JsonProperty("inbound_check")
            @ExcludeMissing
            fun inboundCheck(inboundCheck: JsonField<InboundCheck>) = apply {
                this.inboundCheck = inboundCheck
            }

            /**
             * An Inbound International ACH Transfer object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_international_ach_transfer`.
             */
            fun inboundInternationalAchTransfer(
                inboundInternationalAchTransfer: InboundInternationalAchTransfer
            ) = inboundInternationalAchTransfer(JsonField.of(inboundInternationalAchTransfer))

            /**
             * An Inbound International ACH Transfer object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_international_ach_transfer`.
             */
            @JsonProperty("inbound_international_ach_transfer")
            @ExcludeMissing
            fun inboundInternationalAchTransfer(
                inboundInternationalAchTransfer: JsonField<InboundInternationalAchTransfer>
            ) = apply { this.inboundInternationalAchTransfer = inboundInternationalAchTransfer }

            /**
             * An Inbound Real Time Payments Transfer Confirmation object. This field will be
             * present in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            fun inboundRealTimePaymentsTransferConfirmation(
                inboundRealTimePaymentsTransferConfirmation:
                    InboundRealTimePaymentsTransferConfirmation
            ) =
                inboundRealTimePaymentsTransferConfirmation(
                    JsonField.of(inboundRealTimePaymentsTransferConfirmation)
                )

            /**
             * An Inbound Real Time Payments Transfer Confirmation object. This field will be
             * present in the JSON response if and only if `category` is equal to
             * `inbound_real_time_payments_transfer_confirmation`.
             */
            @JsonProperty("inbound_real_time_payments_transfer_confirmation")
            @ExcludeMissing
            fun inboundRealTimePaymentsTransferConfirmation(
                inboundRealTimePaymentsTransferConfirmation:
                    JsonField<InboundRealTimePaymentsTransferConfirmation>
            ) = apply {
                this.inboundRealTimePaymentsTransferConfirmation =
                    inboundRealTimePaymentsTransferConfirmation
            }

            /**
             * An Inbound Wire Drawdown Payment object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
             */
            fun inboundWireDrawdownPayment(inboundWireDrawdownPayment: InboundWireDrawdownPayment) =
                inboundWireDrawdownPayment(JsonField.of(inboundWireDrawdownPayment))

            /**
             * An Inbound Wire Drawdown Payment object. This field will be present in the JSON
             * response if and only if `category` is equal to `inbound_wire_drawdown_payment`.
             */
            @JsonProperty("inbound_wire_drawdown_payment")
            @ExcludeMissing
            fun inboundWireDrawdownPayment(
                inboundWireDrawdownPayment: JsonField<InboundWireDrawdownPayment>
            ) = apply { this.inboundWireDrawdownPayment = inboundWireDrawdownPayment }

            /**
             * An Inbound Wire Drawdown Payment Reversal object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `inbound_wire_drawdown_payment_reversal`.
             */
            fun inboundWireDrawdownPaymentReversal(
                inboundWireDrawdownPaymentReversal: InboundWireDrawdownPaymentReversal
            ) = inboundWireDrawdownPaymentReversal(JsonField.of(inboundWireDrawdownPaymentReversal))

            /**
             * An Inbound Wire Drawdown Payment Reversal object. This field will be present in the
             * JSON response if and only if `category` is equal to
             * `inbound_wire_drawdown_payment_reversal`.
             */
            @JsonProperty("inbound_wire_drawdown_payment_reversal")
            @ExcludeMissing
            fun inboundWireDrawdownPaymentReversal(
                inboundWireDrawdownPaymentReversal: JsonField<InboundWireDrawdownPaymentReversal>
            ) = apply {
                this.inboundWireDrawdownPaymentReversal = inboundWireDrawdownPaymentReversal
            }

            /**
             * An Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            fun inboundWireReversal(inboundWireReversal: InboundWireReversal) =
                inboundWireReversal(JsonField.of(inboundWireReversal))

            /**
             * An Inbound Wire Reversal object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_reversal`.
             */
            @JsonProperty("inbound_wire_reversal")
            @ExcludeMissing
            fun inboundWireReversal(inboundWireReversal: JsonField<InboundWireReversal>) = apply {
                this.inboundWireReversal = inboundWireReversal
            }

            /**
             * An Inbound Wire Transfer object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_transfer`.
             */
            fun inboundWireTransfer(inboundWireTransfer: InboundWireTransfer) =
                inboundWireTransfer(JsonField.of(inboundWireTransfer))

            /**
             * An Inbound Wire Transfer object. This field will be present in the JSON response if
             * and only if `category` is equal to `inbound_wire_transfer`.
             */
            @JsonProperty("inbound_wire_transfer")
            @ExcludeMissing
            fun inboundWireTransfer(inboundWireTransfer: JsonField<InboundWireTransfer>) = apply {
                this.inboundWireTransfer = inboundWireTransfer
            }

            /**
             * An Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            fun interestPayment(interestPayment: InterestPayment) =
                interestPayment(JsonField.of(interestPayment))

            /**
             * An Interest Payment object. This field will be present in the JSON response if and
             * only if `category` is equal to `interest_payment`.
             */
            @JsonProperty("interest_payment")
            @ExcludeMissing
            fun interestPayment(interestPayment: JsonField<InterestPayment>) = apply {
                this.interestPayment = interestPayment
            }

            /**
             * An Internal Source object. This field will be present in the JSON response if and
             * only if `category` is equal to `internal_source`.
             */
            fun internalSource(internalSource: InternalSource) =
                internalSource(JsonField.of(internalSource))

            /**
             * An Internal Source object. This field will be present in the JSON response if and
             * only if `category` is equal to `internal_source`.
             */
            @JsonProperty("internal_source")
            @ExcludeMissing
            fun internalSource(internalSource: JsonField<InternalSource>) = apply {
                this.internalSource = internalSource
            }

            /**
             * A Real Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_acknowledgement`.
             */
            fun realTimePaymentsTransferAcknowledgement(
                realTimePaymentsTransferAcknowledgement: RealTimePaymentsTransferAcknowledgement
            ) =
                realTimePaymentsTransferAcknowledgement(
                    JsonField.of(realTimePaymentsTransferAcknowledgement)
                )

            /**
             * A Real Time Payments Transfer Acknowledgement object. This field will be present in
             * the JSON response if and only if `category` is equal to
             * `real_time_payments_transfer_acknowledgement`.
             */
            @JsonProperty("real_time_payments_transfer_acknowledgement")
            @ExcludeMissing
            fun realTimePaymentsTransferAcknowledgement(
                realTimePaymentsTransferAcknowledgement:
                    JsonField<RealTimePaymentsTransferAcknowledgement>
            ) = apply {
                this.realTimePaymentsTransferAcknowledgement =
                    realTimePaymentsTransferAcknowledgement
            }

            /**
             * A Sample Funds object. This field will be present in the JSON response if and only if
             * `category` is equal to `sample_funds`.
             */
            fun sampleFunds(sampleFunds: SampleFunds) = sampleFunds(JsonField.of(sampleFunds))

            /**
             * A Sample Funds object. This field will be present in the JSON response if and only if
             * `category` is equal to `sample_funds`.
             */
            @JsonProperty("sample_funds")
            @ExcludeMissing
            fun sampleFunds(sampleFunds: JsonField<SampleFunds>) = apply {
                this.sampleFunds = sampleFunds
            }

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            fun wireTransferIntention(wireTransferIntention: WireTransferIntention) =
                wireTransferIntention(JsonField.of(wireTransferIntention))

            /**
             * A Wire Transfer Intention object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_intention`.
             */
            @JsonProperty("wire_transfer_intention")
            @ExcludeMissing
            fun wireTransferIntention(wireTransferIntention: JsonField<WireTransferIntention>) =
                apply {
                    this.wireTransferIntention = wireTransferIntention
                }

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            fun wireTransferRejection(wireTransferRejection: WireTransferRejection) =
                wireTransferRejection(JsonField.of(wireTransferRejection))

            /**
             * A Wire Transfer Rejection object. This field will be present in the JSON response if
             * and only if `category` is equal to `wire_transfer_rejection`.
             */
            @JsonProperty("wire_transfer_rejection")
            @ExcludeMissing
            fun wireTransferRejection(wireTransferRejection: JsonField<WireTransferRejection>) =
                apply {
                    this.wireTransferRejection = wireTransferRejection
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

            fun build(): Source =
                Source(
                    category,
                    accountTransferIntention,
                    achTransferIntention,
                    achTransferRejection,
                    achTransferReturn,
                    cardDisputeAcceptance,
                    cardRefund,
                    cardRevenuePayment,
                    cardSettlement,
                    checkDepositAcceptance,
                    checkDepositReturn,
                    checkTransferDeposit,
                    checkTransferIntention,
                    checkTransferStopPaymentRequest,
                    feePayment,
                    inboundAchTransfer,
                    inboundCheck,
                    inboundInternationalAchTransfer,
                    inboundRealTimePaymentsTransferConfirmation,
                    inboundWireDrawdownPayment,
                    inboundWireDrawdownPaymentReversal,
                    inboundWireReversal,
                    inboundWireTransfer,
                    interestPayment,
                    internalSource,
                    realTimePaymentsTransferAcknowledgement,
                    sampleFunds,
                    wireTransferIntention,
                    wireTransferRejection,
                    additionalProperties.toUnmodifiable(),
                )
        }

        /**
         * An Account Transfer Intention object. This field will be present in the JSON response if
         * and only if `category` is equal to `account_transfer_intention`.
         */
        @JsonDeserialize(builder = AccountTransferIntention.Builder::class)
        @NoAutoDetect
        class AccountTransferIntention
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val description: JsonField<String>,
            private val destinationAccountId: JsonField<String>,
            private val sourceAccountId: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

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

            /** The description you chose to give the transfer. */
            fun description(): String = description.getRequired("description")

            /** The identifier of the Account to where the Account Transfer was sent. */
            fun destinationAccountId(): String =
                destinationAccountId.getRequired("destination_account_id")

            /** The identifier of the Account from where the Account Transfer was sent. */
            fun sourceAccountId(): String = sourceAccountId.getRequired("source_account_id")

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the destination
             * account currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The description you chose to give the transfer. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The identifier of the Account to where the Account Transfer was sent. */
            @JsonProperty("destination_account_id")
            @ExcludeMissing
            fun _destinationAccountId() = destinationAccountId

            /** The identifier of the Account from where the Account Transfer was sent. */
            @JsonProperty("source_account_id")
            @ExcludeMissing
            fun _sourceAccountId() = sourceAccountId

            /** The identifier of the Account Transfer that led to this Pending Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AccountTransferIntention = apply {
                if (!validated) {
                    amount()
                    currency()
                    description()
                    destinationAccountId()
                    sourceAccountId()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AccountTransferIntention &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.description == other.description &&
                    this.destinationAccountId == other.destinationAccountId &&
                    this.sourceAccountId == other.sourceAccountId &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            description,
                            destinationAccountId,
                            sourceAccountId,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AccountTransferIntention{amount=$amount, currency=$currency, description=$description, destinationAccountId=$destinationAccountId, sourceAccountId=$sourceAccountId, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var destinationAccountId: JsonField<String> = JsonMissing.of()
                private var sourceAccountId: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(accountTransferIntention: AccountTransferIntention) = apply {
                    this.amount = accountTransferIntention.amount
                    this.currency = accountTransferIntention.currency
                    this.description = accountTransferIntention.description
                    this.destinationAccountId = accountTransferIntention.destinationAccountId
                    this.sourceAccountId = accountTransferIntention.sourceAccountId
                    this.transferId = accountTransferIntention.transferId
                    additionalProperties(accountTransferIntention.additionalProperties)
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
                @JsonProperty("amount")
                @ExcludeMissing
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The description you chose to give the transfer. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description you chose to give the transfer. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The identifier of the Account to where the Account Transfer was sent. */
                fun destinationAccountId(destinationAccountId: String) =
                    destinationAccountId(JsonField.of(destinationAccountId))

                /** The identifier of the Account to where the Account Transfer was sent. */
                @JsonProperty("destination_account_id")
                @ExcludeMissing
                fun destinationAccountId(destinationAccountId: JsonField<String>) = apply {
                    this.destinationAccountId = destinationAccountId
                }

                /** The identifier of the Account from where the Account Transfer was sent. */
                fun sourceAccountId(sourceAccountId: String) =
                    sourceAccountId(JsonField.of(sourceAccountId))

                /** The identifier of the Account from where the Account Transfer was sent. */
                @JsonProperty("source_account_id")
                @ExcludeMissing
                fun sourceAccountId(sourceAccountId: JsonField<String>) = apply {
                    this.sourceAccountId = sourceAccountId
                }

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Account Transfer that led to this Pending Transaction. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AccountTransferIntention =
                    AccountTransferIntention(
                        amount,
                        currency,
                        description,
                        destinationAccountId,
                        sourceAccountId,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * An ACH Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_intention`.
         */
        @JsonDeserialize(builder = AchTransferIntention.Builder::class)
        @NoAutoDetect
        class AchTransferIntention
        private constructor(
            private val amount: JsonField<Long>,
            private val accountNumber: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val statementDescriptor: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun accountNumber(): String = accountNumber.getRequired("account_number")

            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            fun statementDescriptor(): String =
                statementDescriptor.getRequired("statement_descriptor")

            /** The identifier of the ACH Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            @JsonProperty("statement_descriptor")
            @ExcludeMissing
            fun _statementDescriptor() = statementDescriptor

            /** The identifier of the ACH Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferIntention = apply {
                if (!validated) {
                    amount()
                    accountNumber()
                    routingNumber()
                    statementDescriptor()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferIntention &&
                    this.amount == other.amount &&
                    this.accountNumber == other.accountNumber &&
                    this.routingNumber == other.routingNumber &&
                    this.statementDescriptor == other.statementDescriptor &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            accountNumber,
                            routingNumber,
                            statementDescriptor,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferIntention{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, statementDescriptor=$statementDescriptor, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var statementDescriptor: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(achTransferIntention: AchTransferIntention) = apply {
                    this.amount = achTransferIntention.amount
                    this.accountNumber = achTransferIntention.accountNumber
                    this.routingNumber = achTransferIntention.routingNumber
                    this.statementDescriptor = achTransferIntention.statementDescriptor
                    this.transferId = achTransferIntention.transferId
                    additionalProperties(achTransferIntention.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                @JsonProperty("account_number")
                @ExcludeMissing
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                fun statementDescriptor(statementDescriptor: String) =
                    statementDescriptor(JsonField.of(statementDescriptor))

                @JsonProperty("statement_descriptor")
                @ExcludeMissing
                fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                    this.statementDescriptor = statementDescriptor
                }

                /** The identifier of the ACH Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Transaction. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AchTransferIntention =
                    AchTransferIntention(
                        amount,
                        accountNumber,
                        routingNumber,
                        statementDescriptor,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An ACH Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_rejection`.
         */
        @JsonDeserialize(builder = AchTransferRejection.Builder::class)
        @NoAutoDetect
        class AchTransferRejection
        private constructor(
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The identifier of the ACH Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The identifier of the ACH Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferRejection = apply {
                if (!validated) {
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferRejection &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(transferId, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(achTransferRejection: AchTransferRejection) = apply {
                    this.transferId = achTransferRejection.transferId
                    additionalProperties(achTransferRejection.additionalProperties)
                }

                /** The identifier of the ACH Transfer that led to this Transaction. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer that led to this Transaction. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AchTransferRejection =
                    AchTransferRejection(transferId, additionalProperties.toUnmodifiable())
            }
        }

        /**
         * An ACH Transfer Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `ach_transfer_return`.
         */
        @JsonDeserialize(builder = AchTransferReturn.Builder::class)
        @NoAutoDetect
        class AchTransferReturn
        private constructor(
            private val createdAt: JsonField<OffsetDateTime>,
            private val returnReasonCode: JsonField<ReturnReasonCode>,
            private val rawReturnReasonCode: JsonField<String>,
            private val transferId: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** Why the ACH Transfer was returned. */
            fun returnReasonCode(): ReturnReasonCode =
                returnReasonCode.getRequired("return_reason_code")

            /** The three character ACH return code, in the range R01 to R85. */
            fun rawReturnReasonCode(): String =
                rawReturnReasonCode.getRequired("raw_return_reason_code")

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The identifier of the Tranasaction associated with this return. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was created.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            /** Why the ACH Transfer was returned. */
            @JsonProperty("return_reason_code")
            @ExcludeMissing
            fun _returnReasonCode() = returnReasonCode

            /** The three character ACH return code, in the range R01 to R85. */
            @JsonProperty("raw_return_reason_code")
            @ExcludeMissing
            fun _rawReturnReasonCode() = rawReturnReasonCode

            /** The identifier of the ACH Transfer associated with this return. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            /** The identifier of the Tranasaction associated with this return. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): AchTransferReturn = apply {
                if (!validated) {
                    createdAt()
                    returnReasonCode()
                    rawReturnReasonCode()
                    transferId()
                    transactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AchTransferReturn &&
                    this.createdAt == other.createdAt &&
                    this.returnReasonCode == other.returnReasonCode &&
                    this.rawReturnReasonCode == other.rawReturnReasonCode &&
                    this.transferId == other.transferId &&
                    this.transactionId == other.transactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            createdAt,
                            returnReasonCode,
                            rawReturnReasonCode,
                            transferId,
                            transactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "AchTransferReturn{createdAt=$createdAt, returnReasonCode=$returnReasonCode, rawReturnReasonCode=$rawReturnReasonCode, transferId=$transferId, transactionId=$transactionId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
                private var rawReturnReasonCode: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(achTransferReturn: AchTransferReturn) = apply {
                    this.createdAt = achTransferReturn.createdAt
                    this.returnReasonCode = achTransferReturn.returnReasonCode
                    this.rawReturnReasonCode = achTransferReturn.rawReturnReasonCode
                    this.transferId = achTransferReturn.transferId
                    this.transactionId = achTransferReturn.transactionId
                    additionalProperties(achTransferReturn.additionalProperties)
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * transfer was created.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** Why the ACH Transfer was returned. */
                fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                    returnReasonCode(JsonField.of(returnReasonCode))

                /** Why the ACH Transfer was returned. */
                @JsonProperty("return_reason_code")
                @ExcludeMissing
                fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                    this.returnReasonCode = returnReasonCode
                }

                /** The three character ACH return code, in the range R01 to R85. */
                fun rawReturnReasonCode(rawReturnReasonCode: String) =
                    rawReturnReasonCode(JsonField.of(rawReturnReasonCode))

                /** The three character ACH return code, in the range R01 to R85. */
                @JsonProperty("raw_return_reason_code")
                @ExcludeMissing
                fun rawReturnReasonCode(rawReturnReasonCode: JsonField<String>) = apply {
                    this.rawReturnReasonCode = rawReturnReasonCode
                }

                /** The identifier of the ACH Transfer associated with this return. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the ACH Transfer associated with this return. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                /** The identifier of the Tranasaction associated with this return. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Tranasaction associated with this return. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): AchTransferReturn =
                    AchTransferReturn(
                        createdAt,
                        returnReasonCode,
                        rawReturnReasonCode,
                        transferId,
                        transactionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class ReturnReasonCode
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReturnReasonCode && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val INSUFFICIENT_FUND = ReturnReasonCode(JsonField.of("insufficient_fund"))

                    val NO_ACCOUNT = ReturnReasonCode(JsonField.of("no_account"))

                    val ACCOUNT_CLOSED = ReturnReasonCode(JsonField.of("account_closed"))

                    val INVALID_ACCOUNT_NUMBER_STRUCTURE =
                        ReturnReasonCode(JsonField.of("invalid_account_number_structure"))

                    val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                        ReturnReasonCode(
                            JsonField.of("account_frozen_entry_returned_per_ofac_instruction")
                        )

                    val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                        ReturnReasonCode(JsonField.of("credit_entry_refused_by_receiver"))

                    val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                        ReturnReasonCode(
                            JsonField.of(
                                "unauthorized_debit_to_consumer_account_using_corporate_sec_code"
                            )
                        )

                    val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                        ReturnReasonCode(JsonField.of("corporate_customer_advised_not_authorized"))

                    val PAYMENT_STOPPED = ReturnReasonCode(JsonField.of("payment_stopped"))

                    val NON_TRANSACTION_ACCOUNT =
                        ReturnReasonCode(JsonField.of("non_transaction_account"))

                    val UNCOLLECTED_FUNDS = ReturnReasonCode(JsonField.of("uncollected_funds"))

                    val ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                        ReturnReasonCode(JsonField.of("routing_number_check_digit_error"))

                    val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                        ReturnReasonCode(
                            JsonField.of(
                                "customer_advised_unauthorized_improper_ineligible_or_incomplete"
                            )
                        )

                    val AMOUNT_FIELD_ERROR = ReturnReasonCode(JsonField.of("amount_field_error"))

                    val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                        ReturnReasonCode(JsonField.of("authorization_revoked_by_customer"))

                    val INVALID_ACH_ROUTING_NUMBER =
                        ReturnReasonCode(JsonField.of("invalid_ach_routing_number"))

                    val FILE_RECORD_EDIT_CRITERIA =
                        ReturnReasonCode(JsonField.of("file_record_edit_criteria"))

                    val ENR_INVALID_INDIVIDUAL_NAME =
                        ReturnReasonCode(JsonField.of("enr_invalid_individual_name"))

                    val RETURNED_PER_ODFI_REQUEST =
                        ReturnReasonCode(JsonField.of("returned_per_odfi_request"))

                    val LIMITED_PARTICIPATION_DFI =
                        ReturnReasonCode(JsonField.of("limited_participation_dfi"))

                    val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                        ReturnReasonCode(
                            JsonField.of("incorrectly_coded_outbound_international_payment")
                        )

                    val ACCOUNT_SOLD_TO_ANOTHER_DFI =
                        ReturnReasonCode(JsonField.of("account_sold_to_another_dfi"))

                    val ADDENDA_ERROR = ReturnReasonCode(JsonField.of("addenda_error"))

                    val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                        ReturnReasonCode(JsonField.of("beneficiary_or_account_holder_deceased"))

                    val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                        ReturnReasonCode(
                            JsonField.of("customer_advised_not_within_authorization_terms")
                        )

                    val CORRECTED_RETURN = ReturnReasonCode(JsonField.of("corrected_return"))

                    val DUPLICATE_ENTRY = ReturnReasonCode(JsonField.of("duplicate_entry"))

                    val DUPLICATE_RETURN = ReturnReasonCode(JsonField.of("duplicate_return"))

                    val ENR_DUPLICATE_ENROLLMENT =
                        ReturnReasonCode(JsonField.of("enr_duplicate_enrollment"))

                    val ENR_INVALID_DFI_ACCOUNT_NUMBER =
                        ReturnReasonCode(JsonField.of("enr_invalid_dfi_account_number"))

                    val ENR_INVALID_INDIVIDUAL_ID_NUMBER =
                        ReturnReasonCode(JsonField.of("enr_invalid_individual_id_number"))

                    val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                        ReturnReasonCode(JsonField.of("enr_invalid_representative_payee_indicator"))

                    val ENR_INVALID_TRANSACTION_CODE =
                        ReturnReasonCode(JsonField.of("enr_invalid_transaction_code"))

                    val ENR_RETURN_OF_ENR_ENTRY =
                        ReturnReasonCode(JsonField.of("enr_return_of_enr_entry"))

                    val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                        ReturnReasonCode(JsonField.of("enr_routing_number_check_digit_error"))

                    val ENTRY_NOT_PROCESSED_BY_GATEWAY =
                        ReturnReasonCode(JsonField.of("entry_not_processed_by_gateway"))

                    val FIELD_ERROR = ReturnReasonCode(JsonField.of("field_error"))

                    val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                        ReturnReasonCode(JsonField.of("foreign_receiving_dfi_unable_to_settle"))

                    val IAT_ENTRY_CODING_ERROR =
                        ReturnReasonCode(JsonField.of("iat_entry_coding_error"))

                    val IMPROPER_EFFECTIVE_ENTRY_DATE =
                        ReturnReasonCode(JsonField.of("improper_effective_entry_date"))

                    val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                        ReturnReasonCode(
                            JsonField.of("improper_source_document_source_document_presented")
                        )

                    val INVALID_COMPANY_ID = ReturnReasonCode(JsonField.of("invalid_company_id"))

                    val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                        ReturnReasonCode(
                            JsonField.of("invalid_foreign_receiving_dfi_identification")
                        )

                    val INVALID_INDIVIDUAL_ID_NUMBER =
                        ReturnReasonCode(JsonField.of("invalid_individual_id_number"))

                    val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                        ReturnReasonCode(JsonField.of("item_and_rck_entry_presented_for_payment"))

                    val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                        ReturnReasonCode(JsonField.of("item_related_to_rck_entry_is_ineligible"))

                    val MANDATORY_FIELD_ERROR =
                        ReturnReasonCode(JsonField.of("mandatory_field_error"))

                    val MISROUTED_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("misrouted_dishonored_return"))

                    val MISROUTED_RETURN = ReturnReasonCode(JsonField.of("misrouted_return"))

                    val NO_ERRORS_FOUND = ReturnReasonCode(JsonField.of("no_errors_found"))

                    val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("non_acceptance_of_r62_dishonored_return"))

                    val NON_PARTICIPANT_IN_IAT_PROGRAM =
                        ReturnReasonCode(JsonField.of("non_participant_in_iat_program"))

                    val PERMISSIBLE_RETURN_ENTRY =
                        ReturnReasonCode(JsonField.of("permissible_return_entry"))

                    val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                        ReturnReasonCode(JsonField.of("permissible_return_entry_not_accepted"))

                    val RDFI_NON_SETTLEMENT = ReturnReasonCode(JsonField.of("rdfi_non_settlement"))

                    val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                        ReturnReasonCode(
                            JsonField.of("rdfi_participant_in_check_truncation_program")
                        )

                    val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                        ReturnReasonCode(
                            JsonField.of(
                                "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                            )
                        )

                    val RETURN_NOT_A_DUPLICATE =
                        ReturnReasonCode(JsonField.of("return_not_a_duplicate"))

                    val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                        ReturnReasonCode(JsonField.of("return_of_erroneous_or_reversing_debit"))

                    val RETURN_OF_IMPROPER_CREDIT_ENTRY =
                        ReturnReasonCode(JsonField.of("return_of_improper_credit_entry"))

                    val RETURN_OF_IMPROPER_DEBIT_ENTRY =
                        ReturnReasonCode(JsonField.of("return_of_improper_debit_entry"))

                    val RETURN_OF_XCK_ENTRY = ReturnReasonCode(JsonField.of("return_of_xck_entry"))

                    val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                        ReturnReasonCode(JsonField.of("source_document_presented_for_payment"))

                    val STATE_LAW_AFFECTING_RCK_ACCEPTANCE =
                        ReturnReasonCode(JsonField.of("state_law_affecting_rck_acceptance"))

                    val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                        ReturnReasonCode(JsonField.of("stop_payment_on_item_related_to_rck_entry"))

                    val STOP_PAYMENT_ON_SOURCE_DOCUMENT =
                        ReturnReasonCode(JsonField.of("stop_payment_on_source_document"))

                    val TIMELY_ORIGINAL_RETURN =
                        ReturnReasonCode(JsonField.of("timely_original_return"))

                    val TRACE_NUMBER_ERROR = ReturnReasonCode(JsonField.of("trace_number_error"))

                    val UNTIMELY_DISHONORED_RETURN =
                        ReturnReasonCode(JsonField.of("untimely_dishonored_return"))

                    val UNTIMELY_RETURN = ReturnReasonCode(JsonField.of("untimely_return"))

                    fun of(value: String) = ReturnReasonCode(JsonField.of(value))
                }

                enum class Known {
                    INSUFFICIENT_FUND,
                    NO_ACCOUNT,
                    ACCOUNT_CLOSED,
                    INVALID_ACCOUNT_NUMBER_STRUCTURE,
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    PAYMENT_STOPPED,
                    NON_TRANSACTION_ACCOUNT,
                    UNCOLLECTED_FUNDS,
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    AMOUNT_FIELD_ERROR,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    INVALID_ACH_ROUTING_NUMBER,
                    FILE_RECORD_EDIT_CRITERIA,
                    ENR_INVALID_INDIVIDUAL_NAME,
                    RETURNED_PER_ODFI_REQUEST,
                    LIMITED_PARTICIPATION_DFI,
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                    ACCOUNT_SOLD_TO_ANOTHER_DFI,
                    ADDENDA_ERROR,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                    CORRECTED_RETURN,
                    DUPLICATE_ENTRY,
                    DUPLICATE_RETURN,
                    ENR_DUPLICATE_ENROLLMENT,
                    ENR_INVALID_DFI_ACCOUNT_NUMBER,
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                    ENR_INVALID_TRANSACTION_CODE,
                    ENR_RETURN_OF_ENR_ENTRY,
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    ENTRY_NOT_PROCESSED_BY_GATEWAY,
                    FIELD_ERROR,
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                    IAT_ENTRY_CODING_ERROR,
                    IMPROPER_EFFECTIVE_ENTRY_DATE,
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                    INVALID_COMPANY_ID,
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                    INVALID_INDIVIDUAL_ID_NUMBER,
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                    MANDATORY_FIELD_ERROR,
                    MISROUTED_DISHONORED_RETURN,
                    MISROUTED_RETURN,
                    NO_ERRORS_FOUND,
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                    NON_PARTICIPANT_IN_IAT_PROGRAM,
                    PERMISSIBLE_RETURN_ENTRY,
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                    RDFI_NON_SETTLEMENT,
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    RETURN_NOT_A_DUPLICATE,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    RETURN_OF_IMPROPER_CREDIT_ENTRY,
                    RETURN_OF_IMPROPER_DEBIT_ENTRY,
                    RETURN_OF_XCK_ENTRY,
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                    TIMELY_ORIGINAL_RETURN,
                    TRACE_NUMBER_ERROR,
                    UNTIMELY_DISHONORED_RETURN,
                    UNTIMELY_RETURN,
                }

                enum class Value {
                    INSUFFICIENT_FUND,
                    NO_ACCOUNT,
                    ACCOUNT_CLOSED,
                    INVALID_ACCOUNT_NUMBER_STRUCTURE,
                    ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                    CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                    UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                    CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                    PAYMENT_STOPPED,
                    NON_TRANSACTION_ACCOUNT,
                    UNCOLLECTED_FUNDS,
                    ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                    AMOUNT_FIELD_ERROR,
                    AUTHORIZATION_REVOKED_BY_CUSTOMER,
                    INVALID_ACH_ROUTING_NUMBER,
                    FILE_RECORD_EDIT_CRITERIA,
                    ENR_INVALID_INDIVIDUAL_NAME,
                    RETURNED_PER_ODFI_REQUEST,
                    LIMITED_PARTICIPATION_DFI,
                    INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                    ACCOUNT_SOLD_TO_ANOTHER_DFI,
                    ADDENDA_ERROR,
                    BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                    CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                    CORRECTED_RETURN,
                    DUPLICATE_ENTRY,
                    DUPLICATE_RETURN,
                    ENR_DUPLICATE_ENROLLMENT,
                    ENR_INVALID_DFI_ACCOUNT_NUMBER,
                    ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                    ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                    ENR_INVALID_TRANSACTION_CODE,
                    ENR_RETURN_OF_ENR_ENTRY,
                    ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                    ENTRY_NOT_PROCESSED_BY_GATEWAY,
                    FIELD_ERROR,
                    FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                    IAT_ENTRY_CODING_ERROR,
                    IMPROPER_EFFECTIVE_ENTRY_DATE,
                    IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                    INVALID_COMPANY_ID,
                    INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                    INVALID_INDIVIDUAL_ID_NUMBER,
                    ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                    ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                    MANDATORY_FIELD_ERROR,
                    MISROUTED_DISHONORED_RETURN,
                    MISROUTED_RETURN,
                    NO_ERRORS_FOUND,
                    NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                    NON_PARTICIPANT_IN_IAT_PROGRAM,
                    PERMISSIBLE_RETURN_ENTRY,
                    PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                    RDFI_NON_SETTLEMENT,
                    RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                    REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                    RETURN_NOT_A_DUPLICATE,
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                    RETURN_OF_IMPROPER_CREDIT_ENTRY,
                    RETURN_OF_IMPROPER_DEBIT_ENTRY,
                    RETURN_OF_XCK_ENTRY,
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                    TIMELY_ORIGINAL_RETURN,
                    TRACE_NUMBER_ERROR,
                    UNTIMELY_DISHONORED_RETURN,
                    UNTIMELY_RETURN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        INSUFFICIENT_FUND -> Value.INSUFFICIENT_FUND
                        NO_ACCOUNT -> Value.NO_ACCOUNT
                        ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                        INVALID_ACCOUNT_NUMBER_STRUCTURE -> Value.INVALID_ACCOUNT_NUMBER_STRUCTURE
                        ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                            Value.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Value.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                            Value.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Value.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        PAYMENT_STOPPED -> Value.PAYMENT_STOPPED
                        NON_TRANSACTION_ACCOUNT -> Value.NON_TRANSACTION_ACCOUNT
                        UNCOLLECTED_FUNDS -> Value.UNCOLLECTED_FUNDS
                        ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Value.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        AMOUNT_FIELD_ERROR -> Value.AMOUNT_FIELD_ERROR
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Value.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        INVALID_ACH_ROUTING_NUMBER -> Value.INVALID_ACH_ROUTING_NUMBER
                        FILE_RECORD_EDIT_CRITERIA -> Value.FILE_RECORD_EDIT_CRITERIA
                        ENR_INVALID_INDIVIDUAL_NAME -> Value.ENR_INVALID_INDIVIDUAL_NAME
                        RETURNED_PER_ODFI_REQUEST -> Value.RETURNED_PER_ODFI_REQUEST
                        LIMITED_PARTICIPATION_DFI -> Value.LIMITED_PARTICIPATION_DFI
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                            Value.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                        ACCOUNT_SOLD_TO_ANOTHER_DFI -> Value.ACCOUNT_SOLD_TO_ANOTHER_DFI
                        ADDENDA_ERROR -> Value.ADDENDA_ERROR
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Value.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                            Value.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                        CORRECTED_RETURN -> Value.CORRECTED_RETURN
                        DUPLICATE_ENTRY -> Value.DUPLICATE_ENTRY
                        DUPLICATE_RETURN -> Value.DUPLICATE_RETURN
                        ENR_DUPLICATE_ENROLLMENT -> Value.ENR_DUPLICATE_ENROLLMENT
                        ENR_INVALID_DFI_ACCOUNT_NUMBER -> Value.ENR_INVALID_DFI_ACCOUNT_NUMBER
                        ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Value.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                        ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                            Value.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                        ENR_INVALID_TRANSACTION_CODE -> Value.ENR_INVALID_TRANSACTION_CODE
                        ENR_RETURN_OF_ENR_ENTRY -> Value.ENR_RETURN_OF_ENR_ENTRY
                        ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                            Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        ENTRY_NOT_PROCESSED_BY_GATEWAY -> Value.ENTRY_NOT_PROCESSED_BY_GATEWAY
                        FIELD_ERROR -> Value.FIELD_ERROR
                        FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                            Value.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                        IAT_ENTRY_CODING_ERROR -> Value.IAT_ENTRY_CODING_ERROR
                        IMPROPER_EFFECTIVE_ENTRY_DATE -> Value.IMPROPER_EFFECTIVE_ENTRY_DATE
                        IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                            Value.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                        INVALID_COMPANY_ID -> Value.INVALID_COMPANY_ID
                        INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                            Value.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                        INVALID_INDIVIDUAL_ID_NUMBER -> Value.INVALID_INDIVIDUAL_ID_NUMBER
                        ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                            Value.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                        ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                            Value.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                        MANDATORY_FIELD_ERROR -> Value.MANDATORY_FIELD_ERROR
                        MISROUTED_DISHONORED_RETURN -> Value.MISROUTED_DISHONORED_RETURN
                        MISROUTED_RETURN -> Value.MISROUTED_RETURN
                        NO_ERRORS_FOUND -> Value.NO_ERRORS_FOUND
                        NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                            Value.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                        NON_PARTICIPANT_IN_IAT_PROGRAM -> Value.NON_PARTICIPANT_IN_IAT_PROGRAM
                        PERMISSIBLE_RETURN_ENTRY -> Value.PERMISSIBLE_RETURN_ENTRY
                        PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                            Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                        RDFI_NON_SETTLEMENT -> Value.RDFI_NON_SETTLEMENT
                        RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                            Value.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Value
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        RETURN_NOT_A_DUPLICATE -> Value.RETURN_NOT_A_DUPLICATE
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        RETURN_OF_IMPROPER_CREDIT_ENTRY -> Value.RETURN_OF_IMPROPER_CREDIT_ENTRY
                        RETURN_OF_IMPROPER_DEBIT_ENTRY -> Value.RETURN_OF_IMPROPER_DEBIT_ENTRY
                        RETURN_OF_XCK_ENTRY -> Value.RETURN_OF_XCK_ENTRY
                        SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                            Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                        STATE_LAW_AFFECTING_RCK_ACCEPTANCE ->
                            Value.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                        STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                            Value.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                        STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Value.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                        TIMELY_ORIGINAL_RETURN -> Value.TIMELY_ORIGINAL_RETURN
                        TRACE_NUMBER_ERROR -> Value.TRACE_NUMBER_ERROR
                        UNTIMELY_DISHONORED_RETURN -> Value.UNTIMELY_DISHONORED_RETURN
                        UNTIMELY_RETURN -> Value.UNTIMELY_RETURN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        INSUFFICIENT_FUND -> Known.INSUFFICIENT_FUND
                        NO_ACCOUNT -> Known.NO_ACCOUNT
                        ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                        INVALID_ACCOUNT_NUMBER_STRUCTURE -> Known.INVALID_ACCOUNT_NUMBER_STRUCTURE
                        ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION ->
                            Known.ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION
                        CREDIT_ENTRY_REFUSED_BY_RECEIVER -> Known.CREDIT_ENTRY_REFUSED_BY_RECEIVER
                        UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE ->
                            Known.UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE
                        CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED ->
                            Known.CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED
                        PAYMENT_STOPPED -> Known.PAYMENT_STOPPED
                        NON_TRANSACTION_ACCOUNT -> Known.NON_TRANSACTION_ACCOUNT
                        UNCOLLECTED_FUNDS -> Known.UNCOLLECTED_FUNDS
                        ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE ->
                            Known.CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE
                        AMOUNT_FIELD_ERROR -> Known.AMOUNT_FIELD_ERROR
                        AUTHORIZATION_REVOKED_BY_CUSTOMER -> Known.AUTHORIZATION_REVOKED_BY_CUSTOMER
                        INVALID_ACH_ROUTING_NUMBER -> Known.INVALID_ACH_ROUTING_NUMBER
                        FILE_RECORD_EDIT_CRITERIA -> Known.FILE_RECORD_EDIT_CRITERIA
                        ENR_INVALID_INDIVIDUAL_NAME -> Known.ENR_INVALID_INDIVIDUAL_NAME
                        RETURNED_PER_ODFI_REQUEST -> Known.RETURNED_PER_ODFI_REQUEST
                        LIMITED_PARTICIPATION_DFI -> Known.LIMITED_PARTICIPATION_DFI
                        INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT ->
                            Known.INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT
                        ACCOUNT_SOLD_TO_ANOTHER_DFI -> Known.ACCOUNT_SOLD_TO_ANOTHER_DFI
                        ADDENDA_ERROR -> Known.ADDENDA_ERROR
                        BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED ->
                            Known.BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED
                        CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS ->
                            Known.CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS
                        CORRECTED_RETURN -> Known.CORRECTED_RETURN
                        DUPLICATE_ENTRY -> Known.DUPLICATE_ENTRY
                        DUPLICATE_RETURN -> Known.DUPLICATE_RETURN
                        ENR_DUPLICATE_ENROLLMENT -> Known.ENR_DUPLICATE_ENROLLMENT
                        ENR_INVALID_DFI_ACCOUNT_NUMBER -> Known.ENR_INVALID_DFI_ACCOUNT_NUMBER
                        ENR_INVALID_INDIVIDUAL_ID_NUMBER -> Known.ENR_INVALID_INDIVIDUAL_ID_NUMBER
                        ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR ->
                            Known.ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR
                        ENR_INVALID_TRANSACTION_CODE -> Known.ENR_INVALID_TRANSACTION_CODE
                        ENR_RETURN_OF_ENR_ENTRY -> Known.ENR_RETURN_OF_ENR_ENTRY
                        ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR ->
                            Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
                        ENTRY_NOT_PROCESSED_BY_GATEWAY -> Known.ENTRY_NOT_PROCESSED_BY_GATEWAY
                        FIELD_ERROR -> Known.FIELD_ERROR
                        FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE ->
                            Known.FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE
                        IAT_ENTRY_CODING_ERROR -> Known.IAT_ENTRY_CODING_ERROR
                        IMPROPER_EFFECTIVE_ENTRY_DATE -> Known.IMPROPER_EFFECTIVE_ENTRY_DATE
                        IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED ->
                            Known.IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED
                        INVALID_COMPANY_ID -> Known.INVALID_COMPANY_ID
                        INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION ->
                            Known.INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION
                        INVALID_INDIVIDUAL_ID_NUMBER -> Known.INVALID_INDIVIDUAL_ID_NUMBER
                        ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT ->
                            Known.ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT
                        ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE ->
                            Known.ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE
                        MANDATORY_FIELD_ERROR -> Known.MANDATORY_FIELD_ERROR
                        MISROUTED_DISHONORED_RETURN -> Known.MISROUTED_DISHONORED_RETURN
                        MISROUTED_RETURN -> Known.MISROUTED_RETURN
                        NO_ERRORS_FOUND -> Known.NO_ERRORS_FOUND
                        NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN ->
                            Known.NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN
                        NON_PARTICIPANT_IN_IAT_PROGRAM -> Known.NON_PARTICIPANT_IN_IAT_PROGRAM
                        PERMISSIBLE_RETURN_ENTRY -> Known.PERMISSIBLE_RETURN_ENTRY
                        PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED ->
                            Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
                        RDFI_NON_SETTLEMENT -> Known.RDFI_NON_SETTLEMENT
                        RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM ->
                            Known.RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM
                        REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY ->
                            Known
                                .REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                        RETURN_NOT_A_DUPLICATE -> Known.RETURN_NOT_A_DUPLICATE
                        RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                            Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                        RETURN_OF_IMPROPER_CREDIT_ENTRY -> Known.RETURN_OF_IMPROPER_CREDIT_ENTRY
                        RETURN_OF_IMPROPER_DEBIT_ENTRY -> Known.RETURN_OF_IMPROPER_DEBIT_ENTRY
                        RETURN_OF_XCK_ENTRY -> Known.RETURN_OF_XCK_ENTRY
                        SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                            Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                        STATE_LAW_AFFECTING_RCK_ACCEPTANCE ->
                            Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                        STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                            Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                        STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                        TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                        TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                        UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                        UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                        else ->
                            throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Dispute Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_dispute_acceptance`.
         */
        @JsonDeserialize(builder = CardDisputeAcceptance.Builder::class)
        @NoAutoDetect
        class CardDisputeAcceptance
        private constructor(
            private val acceptedAt: JsonField<OffsetDateTime>,
            private val cardDisputeId: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            fun acceptedAt(): OffsetDateTime = acceptedAt.getRequired("accepted_at")

            /** The identifier of the Card Dispute that was accepted. */
            fun cardDisputeId(): String = cardDisputeId.getRequired("card_dispute_id")

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Card Dispute was accepted.
             */
            @JsonProperty("accepted_at") @ExcludeMissing fun _acceptedAt() = acceptedAt

            /** The identifier of the Card Dispute that was accepted. */
            @JsonProperty("card_dispute_id") @ExcludeMissing fun _cardDisputeId() = cardDisputeId

            /**
             * The identifier of the Transaction that was created to return the disputed funds to
             * your account.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardDisputeAcceptance = apply {
                if (!validated) {
                    acceptedAt()
                    cardDisputeId()
                    transactionId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardDisputeAcceptance &&
                    this.acceptedAt == other.acceptedAt &&
                    this.cardDisputeId == other.cardDisputeId &&
                    this.transactionId == other.transactionId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            acceptedAt,
                            cardDisputeId,
                            transactionId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardDisputeAcceptance{acceptedAt=$acceptedAt, cardDisputeId=$cardDisputeId, transactionId=$transactionId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var acceptedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var cardDisputeId: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardDisputeAcceptance: CardDisputeAcceptance) = apply {
                    this.acceptedAt = cardDisputeAcceptance.acceptedAt
                    this.cardDisputeId = cardDisputeAcceptance.cardDisputeId
                    this.transactionId = cardDisputeAcceptance.transactionId
                    additionalProperties(cardDisputeAcceptance.additionalProperties)
                }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was accepted.
                 */
                fun acceptedAt(acceptedAt: OffsetDateTime) = acceptedAt(JsonField.of(acceptedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * Card Dispute was accepted.
                 */
                @JsonProperty("accepted_at")
                @ExcludeMissing
                fun acceptedAt(acceptedAt: JsonField<OffsetDateTime>) = apply {
                    this.acceptedAt = acceptedAt
                }

                /** The identifier of the Card Dispute that was accepted. */
                fun cardDisputeId(cardDisputeId: String) =
                    cardDisputeId(JsonField.of(cardDisputeId))

                /** The identifier of the Card Dispute that was accepted. */
                @JsonProperty("card_dispute_id")
                @ExcludeMissing
                fun cardDisputeId(cardDisputeId: JsonField<String>) = apply {
                    this.cardDisputeId = cardDisputeId
                }

                /**
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the Transaction that was created to return the disputed funds
                 * to your account.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardDisputeAcceptance =
                    CardDisputeAcceptance(
                        acceptedAt,
                        cardDisputeId,
                        transactionId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Card Refund object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_refund`.
         */
        @JsonDeserialize(builder = CardRefund.Builder::class)
        @NoAutoDetect
        class CardRefund
        private constructor(
            private val id: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val transactionId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Refund identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String? =
                merchantAcceptorId.getNullable("merchant_acceptor_id")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): String? = merchantName.getNullable("merchant_name")

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): PurchaseDetails? =
                purchaseDetails.getNullable("purchase_details")

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Refund identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The pending amount in the minor unit of the transaction's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_refund`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardRefund = apply {
                if (!validated) {
                    id()
                    amount()
                    currency()
                    merchantAcceptorId()
                    merchantCity()
                    merchantState()
                    merchantCountry()
                    merchantName()
                    merchantCategoryCode()
                    purchaseDetails()?.validate()
                    transactionId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardRefund &&
                    this.id == other.id &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantState == other.merchantState &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.transactionId == other.transactionId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            amount,
                            currency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantState,
                            merchantCountry,
                            merchantName,
                            merchantCategoryCode,
                            purchaseDetails,
                            transactionId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRefund{id=$id, amount=$amount, currency=$currency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, purchaseDetails=$purchaseDetails, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardRefund: CardRefund) = apply {
                    this.id = cardRefund.id
                    this.amount = cardRefund.amount
                    this.currency = cardRefund.currency
                    this.merchantAcceptorId = cardRefund.merchantAcceptorId
                    this.merchantCity = cardRefund.merchantCity
                    this.merchantState = cardRefund.merchantState
                    this.merchantCountry = cardRefund.merchantCountry
                    this.merchantName = cardRefund.merchantName
                    this.merchantCategoryCode = cardRefund.merchantCategoryCode
                    this.purchaseDetails = cardRefund.purchaseDetails
                    this.transactionId = cardRefund.transactionId
                    this.type = cardRefund.type
                    additionalProperties(cardRefund.additionalProperties)
                }

                /** The Card Refund identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Refund identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The pending amount in the minor unit of the transaction's currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city")
                @ExcludeMissing
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
                }

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_refund`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardRefund =
                    CardRefund(
                        id,
                        amount,
                        currency,
                        merchantAcceptorId,
                        merchantCity,
                        merchantState,
                        merchantCountry,
                        merchantName,
                        merchantCategoryCode,
                        purchaseDetails,
                        transactionId,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val carRental: JsonField<CarRental>,
                private val lodging: JsonField<Lodging>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): String? =
                    purchaseIdentifier.getNullable("purchase_identifier")

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): PurchaseIdentifierFormat? =
                    purchaseIdentifierFormat.getNullable("purchase_identifier_format")

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): String? =
                    customerReferenceIdentifier.getNullable("customer_reference_identifier")

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Long? = localTaxAmount.getNullable("local_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): String? = localTaxCurrency.getNullable("local_tax_currency")

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Long? =
                    nationalTaxAmount.getNullable("national_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): String? =
                    nationalTaxCurrency.getNullable("national_tax_currency")

                /** Fields specific to car rentals. */
                fun carRental(): CarRental? = carRental.getNullable("car_rental")

                /** Fields specific to lodging. */
                fun lodging(): Lodging? = lodging.getNullable("lodging")

                /** Fields specific to travel. */
                fun travel(): Travel? = travel.getNullable("travel")

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        carRental()?.validate()
                        lodging()?.validate()
                        travel()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.carRental == other.carRental &&
                        this.lodging == other.lodging &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                carRental,
                                lodging,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, carRental=$carRental, lodging=$lodging, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.carRental = purchaseDetails.carRental
                        this.lodging = purchaseDetails.lodging
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            carRental,
                            lodging,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val daysRented: JsonField<Long>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val carClassCode: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Long? = daysRented.getNullable("days_rented")

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): LocalDate? = checkoutDate.getNullable("checkout_date")

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Long? =
                        dailyRentalRateAmount.getNullable("daily_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): String? =
                        dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Long? =
                        weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): String? =
                        weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Long? =
                        insuranceChargesAmount.getNullable("insurance_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): String? =
                        insuranceChargesCurrency.getNullable("insurance_charges_currency")

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Long? =
                        fuelChargesAmount.getNullable("fuel_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): String? =
                        fuelChargesCurrency.getNullable("fuel_charges_currency")

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Long? =
                        oneWayDropOffChargesAmount.getNullable("one_way_drop_off_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): String? =
                        oneWayDropOffChargesCurrency.getNullable(
                            "one_way_drop_off_charges_currency"
                        )

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): String? = carClassCode.getNullable("car_class_code")

                    /** Name of the person renting the vehicle. */
                    fun renterName(): String? = renterName.getNullable("renter_name")

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            extraCharges()
                            daysRented()
                            noShowIndicator()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            carClassCode()
                            renterName()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.extraCharges == other.extraCharges &&
                            this.daysRented == other.daysRented &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.carClassCode == other.carClassCode &&
                            this.renterName == other.renterName &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    extraCharges,
                                    daysRented,
                                    noShowIndicator,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    carClassCode,
                                    renterName,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{extraCharges=$extraCharges, daysRented=$daysRented, noShowIndicator=$noShowIndicator, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, carClassCode=$carClassCode, renterName=$renterName, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(carRental: CarRental) = apply {
                            this.extraCharges = carRental.extraCharges
                            this.daysRented = carRental.daysRented
                            this.noShowIndicator = carRental.noShowIndicator
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.carClassCode = carRental.carClassCode
                            this.renterName = carRental.renterName
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CarRental =
                            CarRental(
                                extraCharges,
                                daysRented,
                                noShowIndicator,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                carClassCode,
                                renterName,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val GAS = ExtraCharges(JsonField.of("gas"))

                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Date the customer checked in. */
                    fun checkInDate(): LocalDate? = checkInDate.getNullable("check_in_date")

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Long? =
                        dailyRoomRateAmount.getNullable("daily_room_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): String? =
                        dailyRoomRateCurrency.getNullable("daily_room_rate_currency")

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Long? = totalTaxAmount.getNullable("total_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): String? =
                        totalTaxCurrency.getNullable("total_tax_currency")

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Long? =
                        prepaidExpensesAmount.getNullable("prepaid_expenses_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): String? =
                        prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Long? =
                        foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): String? =
                        foodBeverageChargesCurrency.getNullable("food_beverage_charges_currency")

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Long? =
                        folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): String? =
                        folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")

                    /** Number of nights the room was rented. */
                    fun roomNights(): Long? = roomNights.getNullable("room_nights")

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Long? =
                        totalRoomTaxAmount.getNullable("total_room_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): String? =
                        totalRoomTaxCurrency.getNullable("total_room_tax_currency")

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            noShowIndicator()
                            extraCharges()
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.extraCharges == other.extraCharges &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    noShowIndicator,
                                    extraCharges,
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{noShowIndicator=$noShowIndicator, extraCharges=$extraCharges, checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lodging: Lodging) = apply {
                            this.noShowIndicator = lodging.noShowIndicator
                            this.extraCharges = lodging.extraCharges
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Lodging =
                            Lodging(
                                noShowIndicator,
                                extraCharges,
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            val OTHER = ExtraCharges(JsonField.of("other"))

                            val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ticketNumber: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val ancillary: JsonField<Ancillary>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ticket number. */
                    fun ticketNumber(): String? = ticketNumber.getNullable("ticket_number")

                    /** Name of the passenger. */
                    fun passengerName(): String? = passengerName.getNullable("passenger_name")

                    /** Date of departure. */
                    fun departureDate(): LocalDate? = departureDate.getNullable("departure_date")

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): String? =
                        originationCityAirportCode.getNullable("origination_city_airport_code")

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): String? =
                        travelAgencyCode.getNullable("travel_agency_code")

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): String? =
                        travelAgencyName.getNullable("travel_agency_name")

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): RestrictedTicketIndicator? =
                        restrictedTicketIndicator.getNullable("restricted_ticket_indicator")

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): String? =
                        computerizedReservationSystem.getNullable("computerized_reservation_system")

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): CreditReasonIndicator? =
                        creditReasonIndicator.getNullable("credit_reason_indicator")

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): TicketChangeIndicator? =
                        ticketChangeIndicator.getNullable("ticket_change_indicator")

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): List<TripLeg>? = tripLegs.getNullable("trip_legs")

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Ancillary? = ancillary.getNullable("ancillary")

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ticketNumber()
                            passengerName()
                            departureDate()
                            originationCityAirportCode()
                            travelAgencyCode()
                            travelAgencyName()
                            restrictedTicketIndicator()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            ticketChangeIndicator()
                            tripLegs()?.forEach { it.validate() }
                            ancillary()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ticketNumber == other.ticketNumber &&
                            this.passengerName == other.passengerName &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.tripLegs == other.tripLegs &&
                            this.ancillary == other.ancillary &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ticketNumber,
                                    passengerName,
                                    departureDate,
                                    originationCityAirportCode,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    restrictedTicketIndicator,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    ticketChangeIndicator,
                                    tripLegs,
                                    ancillary,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ticketNumber=$ticketNumber, passengerName=$passengerName, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, restrictedTicketIndicator=$restrictedTicketIndicator, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, ticketChangeIndicator=$ticketChangeIndicator, tripLegs=$tripLegs, ancillary=$ancillary, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(travel: Travel) = apply {
                            this.ticketNumber = travel.ticketNumber
                            this.passengerName = travel.passengerName
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.tripLegs = travel.tripLegs
                            this.ancillary = travel.ancillary
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Travel =
                            Travel(
                                ticketNumber,
                                passengerName,
                                departureDate,
                                originationCityAirportCode,
                                travelAgencyCode,
                                travelAgencyName,
                                restrictedTicketIndicator,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                ticketChangeIndicator,
                                tripLegs.map { it.toUnmodifiable() },
                                ancillary,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val ticketDocumentNumber: JsonField<String>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val services: JsonField<List<Service>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): String? =
                            ticketDocumentNumber.getNullable("ticket_document_number")

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): String? =
                            passengerNameOrDescription.getNullable("passenger_name_or_description")

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): String? =
                            connectedTicketDocumentNumber.getNullable(
                                "connected_ticket_document_number"
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): CreditReasonIndicator? =
                            creditReasonIndicator.getNullable("credit_reason_indicator")

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                ticketDocumentNumber()
                                passengerNameOrDescription()
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                services().forEach { it.validate() }
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.services == other.services &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        ticketDocumentNumber,
                                        passengerNameOrDescription,
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        services,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{ticketDocumentNumber=$ticketDocumentNumber, passengerNameOrDescription=$passengerNameOrDescription, connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, services=$services, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(ancillary: Ancillary) = apply {
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.services = ancillary.services
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Ancillary =
                                Ancillary(
                                    ticketDocumentNumber,
                                    passengerNameOrDescription,
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    services.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Category? = category.getNullable("category")

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): String? = subCategory.getNullable("sub_category")

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            class Category
                            @JsonCreator
                            private constructor(
                                private val value: JsonField<String>,
                            ) {

                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    val NONE = Category(JsonField.of("none"))

                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    val CARGO = Category(JsonField.of("cargo"))

                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    val LOUNGE = Category(JsonField.of("lounge"))

                                    val MEDICAL = Category(JsonField.of("medical"))

                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    val OTHER = Category(JsonField.of("other"))

                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    val PETS = Category(JsonField.of("pets"))

                                    val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    val STANDBY = Category(JsonField.of("standby"))

                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    val STORE = Category(JsonField.of("store"))

                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    val UPGRADES = Category(JsonField.of("upgrades"))

                                    val WIFI = Category(JsonField.of("wifi"))

                                    fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NONE = TicketChangeIndicator(JsonField.of("none"))

                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val flightNumber: JsonField<String>,
                        private val carrierCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Flight number. */
                        fun flightNumber(): String? = flightNumber.getNullable("flight_number")

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): String? = carrierCode.getNullable("carrier_code")

                        /** Fare basis code. */
                        fun fareBasisCode(): String? = fareBasisCode.getNullable("fare_basis_code")

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): String? = serviceClass.getNullable("service_class")

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): StopOverCode? =
                            stopOverCode.getNullable("stop_over_code")

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): String? =
                            destinationCityAirportCode.getNullable("destination_city_airport_code")

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                flightNumber()
                                carrierCode()
                                fareBasisCode()
                                serviceClass()
                                stopOverCode()
                                destinationCityAirportCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.flightNumber == other.flightNumber &&
                                this.carrierCode == other.carrierCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        flightNumber,
                                        carrierCode,
                                        fareBasisCode,
                                        serviceClass,
                                        stopOverCode,
                                        destinationCityAirportCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{flightNumber=$flightNumber, carrierCode=$carrierCode, fareBasisCode=$fareBasisCode, serviceClass=$serviceClass, stopOverCode=$stopOverCode, destinationCityAirportCode=$destinationCityAirportCode, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tripLeg: TripLeg) = apply {
                                this.flightNumber = tripLeg.flightNumber
                                this.carrierCode = tripLeg.carrierCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): TripLeg =
                                TripLeg(
                                    flightNumber,
                                    carrierCode,
                                    fareBasisCode,
                                    serviceClass,
                                    stopOverCode,
                                    destinationCityAirportCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NONE = StopOverCode(JsonField.of("none"))

                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
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

                    val CARD_REFUND = Type(JsonField.of("card_refund"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_REFUND,
                }

                enum class Value {
                    CARD_REFUND,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_REFUND -> Value.CARD_REFUND
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_REFUND -> Known.CARD_REFUND
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Card Revenue Payment object. This field will be present in the JSON response if and
         * only if `category` is equal to `card_revenue_payment`.
         */
        @JsonDeserialize(builder = CardRevenuePayment.Builder::class)
        @NoAutoDetect
        class CardRevenuePayment
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val transactedOnAccountId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The start of the period for which this transaction paid interest. */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /** The end of the period for which this transaction paid interest. */
            fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

            /** The account the card belonged to. */
            fun transactedOnAccountId(): String? =
                transactedOnAccountId.getNullable("transacted_on_account_id")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The start of the period for which this transaction paid interest. */
            @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

            /** The end of the period for which this transaction paid interest. */
            @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

            /** The account the card belonged to. */
            @JsonProperty("transacted_on_account_id")
            @ExcludeMissing
            fun _transactedOnAccountId() = transactedOnAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardRevenuePayment = apply {
                if (!validated) {
                    amount()
                    currency()
                    periodStart()
                    periodEnd()
                    transactedOnAccountId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardRevenuePayment &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.periodStart == other.periodStart &&
                    this.periodEnd == other.periodEnd &&
                    this.transactedOnAccountId == other.transactedOnAccountId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            periodStart,
                            periodEnd,
                            transactedOnAccountId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardRevenuePayment{amount=$amount, currency=$currency, periodStart=$periodStart, periodEnd=$periodEnd, transactedOnAccountId=$transactedOnAccountId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var transactedOnAccountId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardRevenuePayment: CardRevenuePayment) = apply {
                    this.amount = cardRevenuePayment.amount
                    this.currency = cardRevenuePayment.currency
                    this.periodStart = cardRevenuePayment.periodStart
                    this.periodEnd = cardRevenuePayment.periodEnd
                    this.transactedOnAccountId = cardRevenuePayment.transactedOnAccountId
                    additionalProperties(cardRevenuePayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start")
                @ExcludeMissing
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
                }

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end")
                @ExcludeMissing
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The account the card belonged to. */
                fun transactedOnAccountId(transactedOnAccountId: String) =
                    transactedOnAccountId(JsonField.of(transactedOnAccountId))

                /** The account the card belonged to. */
                @JsonProperty("transacted_on_account_id")
                @ExcludeMissing
                fun transactedOnAccountId(transactedOnAccountId: JsonField<String>) = apply {
                    this.transactedOnAccountId = transactedOnAccountId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardRevenuePayment =
                    CardRevenuePayment(
                        amount,
                        currency,
                        periodStart,
                        periodEnd,
                        transactedOnAccountId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * A Card Settlement object. This field will be present in the JSON response if and only if
         * `category` is equal to `card_settlement`.
         */
        @JsonDeserialize(builder = CardSettlement.Builder::class)
        @NoAutoDetect
        class CardSettlement
        private constructor(
            private val id: JsonField<String>,
            private val cardAuthorization: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val presentmentAmount: JsonField<Long>,
            private val presentmentCurrency: JsonField<String>,
            private val merchantAcceptorId: JsonField<String>,
            private val merchantCity: JsonField<String>,
            private val merchantState: JsonField<String>,
            private val merchantCountry: JsonField<String>,
            private val merchantName: JsonField<String>,
            private val merchantCategoryCode: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val pendingTransactionId: JsonField<String>,
            private val purchaseDetails: JsonField<PurchaseDetails>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The Card Settlement identifier. */
            fun id(): String = id.getRequired("id")

            /**
             * The Card Authorization that was created prior to this Card Settlement, if on exists.
             */
            fun cardAuthorization(): String? = cardAuthorization.getNullable("card_authorization")

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The amount in the minor unit of the transaction's presentment currency. */
            fun presentmentAmount(): Long = presentmentAmount.getRequired("presentment_amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            fun presentmentCurrency(): String =
                presentmentCurrency.getRequired("presentment_currency")

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            fun merchantAcceptorId(): String? =
                merchantAcceptorId.getNullable("merchant_acceptor_id")

            /** The city the merchant resides in. */
            fun merchantCity(): String? = merchantCity.getNullable("merchant_city")

            /** The state the merchant resides in. */
            fun merchantState(): String? = merchantState.getNullable("merchant_state")

            /** The country the merchant resides in. */
            fun merchantCountry(): String = merchantCountry.getRequired("merchant_country")

            /** The name of the merchant. */
            fun merchantName(): String? = merchantName.getNullable("merchant_name")

            /** The 4-digit MCC describing the merchant's business. */
            fun merchantCategoryCode(): String =
                merchantCategoryCode.getRequired("merchant_category_code")

            /** The identifier of the Transaction associated with this Transaction. */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            /** The identifier of the Pending Transaction associated with this Transaction. */
            fun pendingTransactionId(): String? =
                pendingTransactionId.getNullable("pending_transaction_id")

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            fun purchaseDetails(): PurchaseDetails? =
                purchaseDetails.getNullable("purchase_details")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            fun type(): Type = type.getRequired("type")

            /** The Card Settlement identifier. */
            @JsonProperty("id") @ExcludeMissing fun _id() = id

            /**
             * The Card Authorization that was created prior to this Card Settlement, if on exists.
             */
            @JsonProperty("card_authorization")
            @ExcludeMissing
            fun _cardAuthorization() = cardAuthorization

            /**
             * The amount in the minor unit of the transaction's settlement currency. For dollars,
             * for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * settlement currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The amount in the minor unit of the transaction's presentment currency. */
            @JsonProperty("presentment_amount")
            @ExcludeMissing
            fun _presentmentAmount() = presentmentAmount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * presentment currency.
             */
            @JsonProperty("presentment_currency")
            @ExcludeMissing
            fun _presentmentCurrency() = presentmentCurrency

            /**
             * The merchant identifier (commonly abbreviated as MID) of the merchant the card is
             * transacting with.
             */
            @JsonProperty("merchant_acceptor_id")
            @ExcludeMissing
            fun _merchantAcceptorId() = merchantAcceptorId

            /** The city the merchant resides in. */
            @JsonProperty("merchant_city") @ExcludeMissing fun _merchantCity() = merchantCity

            /** The state the merchant resides in. */
            @JsonProperty("merchant_state") @ExcludeMissing fun _merchantState() = merchantState

            /** The country the merchant resides in. */
            @JsonProperty("merchant_country")
            @ExcludeMissing
            fun _merchantCountry() = merchantCountry

            /** The name of the merchant. */
            @JsonProperty("merchant_name") @ExcludeMissing fun _merchantName() = merchantName

            /** The 4-digit MCC describing the merchant's business. */
            @JsonProperty("merchant_category_code")
            @ExcludeMissing
            fun _merchantCategoryCode() = merchantCategoryCode

            /** The identifier of the Transaction associated with this Transaction. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The identifier of the Pending Transaction associated with this Transaction. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun _pendingTransactionId() = pendingTransactionId

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonProperty("purchase_details")
            @ExcludeMissing
            fun _purchaseDetails() = purchaseDetails

            /**
             * A constant representing the object's type. For this resource it will always be
             * `card_settlement`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CardSettlement = apply {
                if (!validated) {
                    id()
                    cardAuthorization()
                    amount()
                    currency()
                    presentmentAmount()
                    presentmentCurrency()
                    merchantAcceptorId()
                    merchantCity()
                    merchantState()
                    merchantCountry()
                    merchantName()
                    merchantCategoryCode()
                    transactionId()
                    pendingTransactionId()
                    purchaseDetails()?.validate()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CardSettlement &&
                    this.id == other.id &&
                    this.cardAuthorization == other.cardAuthorization &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.presentmentAmount == other.presentmentAmount &&
                    this.presentmentCurrency == other.presentmentCurrency &&
                    this.merchantAcceptorId == other.merchantAcceptorId &&
                    this.merchantCity == other.merchantCity &&
                    this.merchantState == other.merchantState &&
                    this.merchantCountry == other.merchantCountry &&
                    this.merchantName == other.merchantName &&
                    this.merchantCategoryCode == other.merchantCategoryCode &&
                    this.transactionId == other.transactionId &&
                    this.pendingTransactionId == other.pendingTransactionId &&
                    this.purchaseDetails == other.purchaseDetails &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            id,
                            cardAuthorization,
                            amount,
                            currency,
                            presentmentAmount,
                            presentmentCurrency,
                            merchantAcceptorId,
                            merchantCity,
                            merchantState,
                            merchantCountry,
                            merchantName,
                            merchantCategoryCode,
                            transactionId,
                            pendingTransactionId,
                            purchaseDetails,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CardSettlement{id=$id, cardAuthorization=$cardAuthorization, amount=$amount, currency=$currency, presentmentAmount=$presentmentAmount, presentmentCurrency=$presentmentCurrency, merchantAcceptorId=$merchantAcceptorId, merchantCity=$merchantCity, merchantState=$merchantState, merchantCountry=$merchantCountry, merchantName=$merchantName, merchantCategoryCode=$merchantCategoryCode, transactionId=$transactionId, pendingTransactionId=$pendingTransactionId, purchaseDetails=$purchaseDetails, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var id: JsonField<String> = JsonMissing.of()
                private var cardAuthorization: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var presentmentAmount: JsonField<Long> = JsonMissing.of()
                private var presentmentCurrency: JsonField<String> = JsonMissing.of()
                private var merchantAcceptorId: JsonField<String> = JsonMissing.of()
                private var merchantCity: JsonField<String> = JsonMissing.of()
                private var merchantState: JsonField<String> = JsonMissing.of()
                private var merchantCountry: JsonField<String> = JsonMissing.of()
                private var merchantName: JsonField<String> = JsonMissing.of()
                private var merchantCategoryCode: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var pendingTransactionId: JsonField<String> = JsonMissing.of()
                private var purchaseDetails: JsonField<PurchaseDetails> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(cardSettlement: CardSettlement) = apply {
                    this.id = cardSettlement.id
                    this.cardAuthorization = cardSettlement.cardAuthorization
                    this.amount = cardSettlement.amount
                    this.currency = cardSettlement.currency
                    this.presentmentAmount = cardSettlement.presentmentAmount
                    this.presentmentCurrency = cardSettlement.presentmentCurrency
                    this.merchantAcceptorId = cardSettlement.merchantAcceptorId
                    this.merchantCity = cardSettlement.merchantCity
                    this.merchantState = cardSettlement.merchantState
                    this.merchantCountry = cardSettlement.merchantCountry
                    this.merchantName = cardSettlement.merchantName
                    this.merchantCategoryCode = cardSettlement.merchantCategoryCode
                    this.transactionId = cardSettlement.transactionId
                    this.pendingTransactionId = cardSettlement.pendingTransactionId
                    this.purchaseDetails = cardSettlement.purchaseDetails
                    this.type = cardSettlement.type
                    additionalProperties(cardSettlement.additionalProperties)
                }

                /** The Card Settlement identifier. */
                fun id(id: String) = id(JsonField.of(id))

                /** The Card Settlement identifier. */
                @JsonProperty("id")
                @ExcludeMissing
                fun id(id: JsonField<String>) = apply { this.id = id }

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if on
                 * exists.
                 */
                fun cardAuthorization(cardAuthorization: String) =
                    cardAuthorization(JsonField.of(cardAuthorization))

                /**
                 * The Card Authorization that was created prior to this Card Settlement, if on
                 * exists.
                 */
                @JsonProperty("card_authorization")
                @ExcludeMissing
                fun cardAuthorization(cardAuthorization: JsonField<String>) = apply {
                    this.cardAuthorization = cardAuthorization
                }

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's settlement currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * settlement currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The amount in the minor unit of the transaction's presentment currency. */
                fun presentmentAmount(presentmentAmount: Long) =
                    presentmentAmount(JsonField.of(presentmentAmount))

                /** The amount in the minor unit of the transaction's presentment currency. */
                @JsonProperty("presentment_amount")
                @ExcludeMissing
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
                @JsonProperty("presentment_currency")
                @ExcludeMissing
                fun presentmentCurrency(presentmentCurrency: JsonField<String>) = apply {
                    this.presentmentCurrency = presentmentCurrency
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
                @JsonProperty("merchant_acceptor_id")
                @ExcludeMissing
                fun merchantAcceptorId(merchantAcceptorId: JsonField<String>) = apply {
                    this.merchantAcceptorId = merchantAcceptorId
                }

                /** The city the merchant resides in. */
                fun merchantCity(merchantCity: String) = merchantCity(JsonField.of(merchantCity))

                /** The city the merchant resides in. */
                @JsonProperty("merchant_city")
                @ExcludeMissing
                fun merchantCity(merchantCity: JsonField<String>) = apply {
                    this.merchantCity = merchantCity
                }

                /** The state the merchant resides in. */
                fun merchantState(merchantState: String) =
                    merchantState(JsonField.of(merchantState))

                /** The state the merchant resides in. */
                @JsonProperty("merchant_state")
                @ExcludeMissing
                fun merchantState(merchantState: JsonField<String>) = apply {
                    this.merchantState = merchantState
                }

                /** The country the merchant resides in. */
                fun merchantCountry(merchantCountry: String) =
                    merchantCountry(JsonField.of(merchantCountry))

                /** The country the merchant resides in. */
                @JsonProperty("merchant_country")
                @ExcludeMissing
                fun merchantCountry(merchantCountry: JsonField<String>) = apply {
                    this.merchantCountry = merchantCountry
                }

                /** The name of the merchant. */
                fun merchantName(merchantName: String) = merchantName(JsonField.of(merchantName))

                /** The name of the merchant. */
                @JsonProperty("merchant_name")
                @ExcludeMissing
                fun merchantName(merchantName: JsonField<String>) = apply {
                    this.merchantName = merchantName
                }

                /** The 4-digit MCC describing the merchant's business. */
                fun merchantCategoryCode(merchantCategoryCode: String) =
                    merchantCategoryCode(JsonField.of(merchantCategoryCode))

                /** The 4-digit MCC describing the merchant's business. */
                @JsonProperty("merchant_category_code")
                @ExcludeMissing
                fun merchantCategoryCode(merchantCategoryCode: JsonField<String>) = apply {
                    this.merchantCategoryCode = merchantCategoryCode
                }

                /** The identifier of the Transaction associated with this Transaction. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The identifier of the Transaction associated with this Transaction. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /** The identifier of the Pending Transaction associated with this Transaction. */
                fun pendingTransactionId(pendingTransactionId: String) =
                    pendingTransactionId(JsonField.of(pendingTransactionId))

                /** The identifier of the Pending Transaction associated with this Transaction. */
                @JsonProperty("pending_transaction_id")
                @ExcludeMissing
                fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                    this.pendingTransactionId = pendingTransactionId
                }

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                fun purchaseDetails(purchaseDetails: PurchaseDetails) =
                    purchaseDetails(JsonField.of(purchaseDetails))

                /**
                 * Additional details about the card purchase, such as tax and industry-specific
                 * fields.
                 */
                @JsonProperty("purchase_details")
                @ExcludeMissing
                fun purchaseDetails(purchaseDetails: JsonField<PurchaseDetails>) = apply {
                    this.purchaseDetails = purchaseDetails
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `card_settlement`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CardSettlement =
                    CardSettlement(
                        id,
                        cardAuthorization,
                        amount,
                        currency,
                        presentmentAmount,
                        presentmentCurrency,
                        merchantAcceptorId,
                        merchantCity,
                        merchantState,
                        merchantCountry,
                        merchantName,
                        merchantCategoryCode,
                        transactionId,
                        pendingTransactionId,
                        purchaseDetails,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            /**
             * Additional details about the card purchase, such as tax and industry-specific fields.
             */
            @JsonDeserialize(builder = PurchaseDetails.Builder::class)
            @NoAutoDetect
            class PurchaseDetails
            private constructor(
                private val purchaseIdentifier: JsonField<String>,
                private val purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>,
                private val customerReferenceIdentifier: JsonField<String>,
                private val localTaxAmount: JsonField<Long>,
                private val localTaxCurrency: JsonField<String>,
                private val nationalTaxAmount: JsonField<Long>,
                private val nationalTaxCurrency: JsonField<String>,
                private val carRental: JsonField<CarRental>,
                private val lodging: JsonField<Lodging>,
                private val travel: JsonField<Travel>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                private var hashCode: Int = 0

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                fun purchaseIdentifier(): String? =
                    purchaseIdentifier.getNullable("purchase_identifier")

                /** The format of the purchase identifier. */
                fun purchaseIdentifierFormat(): PurchaseIdentifierFormat? =
                    purchaseIdentifierFormat.getNullable("purchase_identifier_format")

                /** An identifier from the merchant for the customer or consumer. */
                fun customerReferenceIdentifier(): String? =
                    customerReferenceIdentifier.getNullable("customer_reference_identifier")

                /** The state or provincial tax amount in minor units. */
                fun localTaxAmount(): Long? = localTaxAmount.getNullable("local_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun localTaxCurrency(): String? = localTaxCurrency.getNullable("local_tax_currency")

                /** The national tax amount in minor units. */
                fun nationalTaxAmount(): Long? =
                    nationalTaxAmount.getNullable("national_tax_amount")

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                fun nationalTaxCurrency(): String? =
                    nationalTaxCurrency.getNullable("national_tax_currency")

                /** Fields specific to car rentals. */
                fun carRental(): CarRental? = carRental.getNullable("car_rental")

                /** Fields specific to lodging. */
                fun lodging(): Lodging? = lodging.getNullable("lodging")

                /** Fields specific to travel. */
                fun travel(): Travel? = travel.getNullable("travel")

                /**
                 * An identifier from the merchant for the purchase to the issuer and cardholder.
                 */
                @JsonProperty("purchase_identifier")
                @ExcludeMissing
                fun _purchaseIdentifier() = purchaseIdentifier

                /** The format of the purchase identifier. */
                @JsonProperty("purchase_identifier_format")
                @ExcludeMissing
                fun _purchaseIdentifierFormat() = purchaseIdentifierFormat

                /** An identifier from the merchant for the customer or consumer. */
                @JsonProperty("customer_reference_identifier")
                @ExcludeMissing
                fun _customerReferenceIdentifier() = customerReferenceIdentifier

                /** The state or provincial tax amount in minor units. */
                @JsonProperty("local_tax_amount")
                @ExcludeMissing
                fun _localTaxAmount() = localTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("local_tax_currency")
                @ExcludeMissing
                fun _localTaxCurrency() = localTaxCurrency

                /** The national tax amount in minor units. */
                @JsonProperty("national_tax_amount")
                @ExcludeMissing
                fun _nationalTaxAmount() = nationalTaxAmount

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                 * assessed.
                 */
                @JsonProperty("national_tax_currency")
                @ExcludeMissing
                fun _nationalTaxCurrency() = nationalTaxCurrency

                /** Fields specific to car rentals. */
                @JsonProperty("car_rental") @ExcludeMissing fun _carRental() = carRental

                /** Fields specific to lodging. */
                @JsonProperty("lodging") @ExcludeMissing fun _lodging() = lodging

                /** Fields specific to travel. */
                @JsonProperty("travel") @ExcludeMissing fun _travel() = travel

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): PurchaseDetails = apply {
                    if (!validated) {
                        purchaseIdentifier()
                        purchaseIdentifierFormat()
                        customerReferenceIdentifier()
                        localTaxAmount()
                        localTaxCurrency()
                        nationalTaxAmount()
                        nationalTaxCurrency()
                        carRental()?.validate()
                        lodging()?.validate()
                        travel()?.validate()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is PurchaseDetails &&
                        this.purchaseIdentifier == other.purchaseIdentifier &&
                        this.purchaseIdentifierFormat == other.purchaseIdentifierFormat &&
                        this.customerReferenceIdentifier == other.customerReferenceIdentifier &&
                        this.localTaxAmount == other.localTaxAmount &&
                        this.localTaxCurrency == other.localTaxCurrency &&
                        this.nationalTaxAmount == other.nationalTaxAmount &&
                        this.nationalTaxCurrency == other.nationalTaxCurrency &&
                        this.carRental == other.carRental &&
                        this.lodging == other.lodging &&
                        this.travel == other.travel &&
                        this.additionalProperties == other.additionalProperties
                }

                override fun hashCode(): Int {
                    if (hashCode == 0) {
                        hashCode =
                            Objects.hash(
                                purchaseIdentifier,
                                purchaseIdentifierFormat,
                                customerReferenceIdentifier,
                                localTaxAmount,
                                localTaxCurrency,
                                nationalTaxAmount,
                                nationalTaxCurrency,
                                carRental,
                                lodging,
                                travel,
                                additionalProperties,
                            )
                    }
                    return hashCode
                }

                override fun toString() =
                    "PurchaseDetails{purchaseIdentifier=$purchaseIdentifier, purchaseIdentifierFormat=$purchaseIdentifierFormat, customerReferenceIdentifier=$customerReferenceIdentifier, localTaxAmount=$localTaxAmount, localTaxCurrency=$localTaxCurrency, nationalTaxAmount=$nationalTaxAmount, nationalTaxCurrency=$nationalTaxCurrency, carRental=$carRental, lodging=$lodging, travel=$travel, additionalProperties=$additionalProperties}"

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var purchaseIdentifier: JsonField<String> = JsonMissing.of()
                    private var purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat> =
                        JsonMissing.of()
                    private var customerReferenceIdentifier: JsonField<String> = JsonMissing.of()
                    private var localTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var localTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var nationalTaxAmount: JsonField<Long> = JsonMissing.of()
                    private var nationalTaxCurrency: JsonField<String> = JsonMissing.of()
                    private var carRental: JsonField<CarRental> = JsonMissing.of()
                    private var lodging: JsonField<Lodging> = JsonMissing.of()
                    private var travel: JsonField<Travel> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(purchaseDetails: PurchaseDetails) = apply {
                        this.purchaseIdentifier = purchaseDetails.purchaseIdentifier
                        this.purchaseIdentifierFormat = purchaseDetails.purchaseIdentifierFormat
                        this.customerReferenceIdentifier =
                            purchaseDetails.customerReferenceIdentifier
                        this.localTaxAmount = purchaseDetails.localTaxAmount
                        this.localTaxCurrency = purchaseDetails.localTaxCurrency
                        this.nationalTaxAmount = purchaseDetails.nationalTaxAmount
                        this.nationalTaxCurrency = purchaseDetails.nationalTaxCurrency
                        this.carRental = purchaseDetails.carRental
                        this.lodging = purchaseDetails.lodging
                        this.travel = purchaseDetails.travel
                        additionalProperties(purchaseDetails.additionalProperties)
                    }

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    fun purchaseIdentifier(purchaseIdentifier: String) =
                        purchaseIdentifier(JsonField.of(purchaseIdentifier))

                    /**
                     * An identifier from the merchant for the purchase to the issuer and
                     * cardholder.
                     */
                    @JsonProperty("purchase_identifier")
                    @ExcludeMissing
                    fun purchaseIdentifier(purchaseIdentifier: JsonField<String>) = apply {
                        this.purchaseIdentifier = purchaseIdentifier
                    }

                    /** The format of the purchase identifier. */
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: PurchaseIdentifierFormat
                    ) = purchaseIdentifierFormat(JsonField.of(purchaseIdentifierFormat))

                    /** The format of the purchase identifier. */
                    @JsonProperty("purchase_identifier_format")
                    @ExcludeMissing
                    fun purchaseIdentifierFormat(
                        purchaseIdentifierFormat: JsonField<PurchaseIdentifierFormat>
                    ) = apply { this.purchaseIdentifierFormat = purchaseIdentifierFormat }

                    /** An identifier from the merchant for the customer or consumer. */
                    fun customerReferenceIdentifier(customerReferenceIdentifier: String) =
                        customerReferenceIdentifier(JsonField.of(customerReferenceIdentifier))

                    /** An identifier from the merchant for the customer or consumer. */
                    @JsonProperty("customer_reference_identifier")
                    @ExcludeMissing
                    fun customerReferenceIdentifier(
                        customerReferenceIdentifier: JsonField<String>
                    ) = apply { this.customerReferenceIdentifier = customerReferenceIdentifier }

                    /** The state or provincial tax amount in minor units. */
                    fun localTaxAmount(localTaxAmount: Long) =
                        localTaxAmount(JsonField.of(localTaxAmount))

                    /** The state or provincial tax amount in minor units. */
                    @JsonProperty("local_tax_amount")
                    @ExcludeMissing
                    fun localTaxAmount(localTaxAmount: JsonField<Long>) = apply {
                        this.localTaxAmount = localTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun localTaxCurrency(localTaxCurrency: String) =
                        localTaxCurrency(JsonField.of(localTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("local_tax_currency")
                    @ExcludeMissing
                    fun localTaxCurrency(localTaxCurrency: JsonField<String>) = apply {
                        this.localTaxCurrency = localTaxCurrency
                    }

                    /** The national tax amount in minor units. */
                    fun nationalTaxAmount(nationalTaxAmount: Long) =
                        nationalTaxAmount(JsonField.of(nationalTaxAmount))

                    /** The national tax amount in minor units. */
                    @JsonProperty("national_tax_amount")
                    @ExcludeMissing
                    fun nationalTaxAmount(nationalTaxAmount: JsonField<Long>) = apply {
                        this.nationalTaxAmount = nationalTaxAmount
                    }

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    fun nationalTaxCurrency(nationalTaxCurrency: String) =
                        nationalTaxCurrency(JsonField.of(nationalTaxCurrency))

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the local tax
                     * assessed.
                     */
                    @JsonProperty("national_tax_currency")
                    @ExcludeMissing
                    fun nationalTaxCurrency(nationalTaxCurrency: JsonField<String>) = apply {
                        this.nationalTaxCurrency = nationalTaxCurrency
                    }

                    /** Fields specific to car rentals. */
                    fun carRental(carRental: CarRental) = carRental(JsonField.of(carRental))

                    /** Fields specific to car rentals. */
                    @JsonProperty("car_rental")
                    @ExcludeMissing
                    fun carRental(carRental: JsonField<CarRental>) = apply {
                        this.carRental = carRental
                    }

                    /** Fields specific to lodging. */
                    fun lodging(lodging: Lodging) = lodging(JsonField.of(lodging))

                    /** Fields specific to lodging. */
                    @JsonProperty("lodging")
                    @ExcludeMissing
                    fun lodging(lodging: JsonField<Lodging>) = apply { this.lodging = lodging }

                    /** Fields specific to travel. */
                    fun travel(travel: Travel) = travel(JsonField.of(travel))

                    /** Fields specific to travel. */
                    @JsonProperty("travel")
                    @ExcludeMissing
                    fun travel(travel: JsonField<Travel>) = apply { this.travel = travel }

                    fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                        this.additionalProperties.clear()
                        this.additionalProperties.putAll(additionalProperties)
                    }

                    @JsonAnySetter
                    fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                        this.additionalProperties.put(key, value)
                    }

                    fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                        apply {
                            this.additionalProperties.putAll(additionalProperties)
                        }

                    fun build(): PurchaseDetails =
                        PurchaseDetails(
                            purchaseIdentifier,
                            purchaseIdentifierFormat,
                            customerReferenceIdentifier,
                            localTaxAmount,
                            localTaxCurrency,
                            nationalTaxAmount,
                            nationalTaxCurrency,
                            carRental,
                            lodging,
                            travel,
                            additionalProperties.toUnmodifiable(),
                        )
                }

                /** Fields specific to car rentals. */
                @JsonDeserialize(builder = CarRental.Builder::class)
                @NoAutoDetect
                class CarRental
                private constructor(
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val daysRented: JsonField<Long>,
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val checkoutDate: JsonField<LocalDate>,
                    private val dailyRentalRateAmount: JsonField<Long>,
                    private val dailyRentalRateCurrency: JsonField<String>,
                    private val weeklyRentalRateAmount: JsonField<Long>,
                    private val weeklyRentalRateCurrency: JsonField<String>,
                    private val insuranceChargesAmount: JsonField<Long>,
                    private val insuranceChargesCurrency: JsonField<String>,
                    private val fuelChargesAmount: JsonField<Long>,
                    private val fuelChargesCurrency: JsonField<String>,
                    private val oneWayDropOffChargesAmount: JsonField<Long>,
                    private val oneWayDropOffChargesCurrency: JsonField<String>,
                    private val carClassCode: JsonField<String>,
                    private val renterName: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Number of days the vehicle was rented. */
                    fun daysRented(): Long? = daysRented.getNullable("days_rented")

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    fun checkoutDate(): LocalDate? = checkoutDate.getNullable("checkout_date")

                    /** Daily rate being charged for the vehicle. */
                    fun dailyRentalRateAmount(): Long? =
                        dailyRentalRateAmount.getNullable("daily_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    fun dailyRentalRateCurrency(): String? =
                        dailyRentalRateCurrency.getNullable("daily_rental_rate_currency")

                    /** Weekly rate being charged for the vehicle. */
                    fun weeklyRentalRateAmount(): Long? =
                        weeklyRentalRateAmount.getNullable("weekly_rental_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    fun weeklyRentalRateCurrency(): String? =
                        weeklyRentalRateCurrency.getNullable("weekly_rental_rate_currency")

                    /** Any insurance being charged for the vehicle. */
                    fun insuranceChargesAmount(): Long? =
                        insuranceChargesAmount.getNullable("insurance_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    fun insuranceChargesCurrency(): String? =
                        insuranceChargesCurrency.getNullable("insurance_charges_currency")

                    /** Fuel charges for the vehicle. */
                    fun fuelChargesAmount(): Long? =
                        fuelChargesAmount.getNullable("fuel_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    fun fuelChargesCurrency(): String? =
                        fuelChargesCurrency.getNullable("fuel_charges_currency")

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    fun oneWayDropOffChargesAmount(): Long? =
                        oneWayDropOffChargesAmount.getNullable("one_way_drop_off_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    fun oneWayDropOffChargesCurrency(): String? =
                        oneWayDropOffChargesCurrency.getNullable(
                            "one_way_drop_off_charges_currency"
                        )

                    /** Code indicating the vehicle's class. */
                    fun carClassCode(): String? = carClassCode.getNullable("car_class_code")

                    /** Name of the person renting the vehicle. */
                    fun renterName(): String? = renterName.getNullable("renter_name")

                    /** Additional charges (gas, late fee, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Number of days the vehicle was rented. */
                    @JsonProperty("days_rented") @ExcludeMissing fun _daysRented() = daysRented

                    /**
                     * An indicator that the cardholder is being billed for a reserved vehicle that
                     * was not actually rented (that is, a "no-show" charge).
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /**
                     * Date the customer picked up the car or, in the case of a no-show or pre-pay
                     * transaction, the scheduled pick up date.
                     */
                    @JsonProperty("checkout_date")
                    @ExcludeMissing
                    fun _checkoutDate() = checkoutDate

                    /** Daily rate being charged for the vehicle. */
                    @JsonProperty("daily_rental_rate_amount")
                    @ExcludeMissing
                    fun _dailyRentalRateAmount() = dailyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * rental rate.
                     */
                    @JsonProperty("daily_rental_rate_currency")
                    @ExcludeMissing
                    fun _dailyRentalRateCurrency() = dailyRentalRateCurrency

                    /** Weekly rate being charged for the vehicle. */
                    @JsonProperty("weekly_rental_rate_amount")
                    @ExcludeMissing
                    fun _weeklyRentalRateAmount() = weeklyRentalRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the weekly
                     * rental rate.
                     */
                    @JsonProperty("weekly_rental_rate_currency")
                    @ExcludeMissing
                    fun _weeklyRentalRateCurrency() = weeklyRentalRateCurrency

                    /** Any insurance being charged for the vehicle. */
                    @JsonProperty("insurance_charges_amount")
                    @ExcludeMissing
                    fun _insuranceChargesAmount() = insuranceChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the insurance
                     * charges assessed.
                     */
                    @JsonProperty("insurance_charges_currency")
                    @ExcludeMissing
                    fun _insuranceChargesCurrency() = insuranceChargesCurrency

                    /** Fuel charges for the vehicle. */
                    @JsonProperty("fuel_charges_amount")
                    @ExcludeMissing
                    fun _fuelChargesAmount() = fuelChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                     * charges assessed.
                     */
                    @JsonProperty("fuel_charges_currency")
                    @ExcludeMissing
                    fun _fuelChargesCurrency() = fuelChargesCurrency

                    /**
                     * Charges for returning the vehicle at a different location than where it was
                     * picked up.
                     */
                    @JsonProperty("one_way_drop_off_charges_amount")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesAmount() = oneWayDropOffChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the one-way
                     * drop-off charges assessed.
                     */
                    @JsonProperty("one_way_drop_off_charges_currency")
                    @ExcludeMissing
                    fun _oneWayDropOffChargesCurrency() = oneWayDropOffChargesCurrency

                    /** Code indicating the vehicle's class. */
                    @JsonProperty("car_class_code")
                    @ExcludeMissing
                    fun _carClassCode() = carClassCode

                    /** Name of the person renting the vehicle. */
                    @JsonProperty("renter_name") @ExcludeMissing fun _renterName() = renterName

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): CarRental = apply {
                        if (!validated) {
                            extraCharges()
                            daysRented()
                            noShowIndicator()
                            checkoutDate()
                            dailyRentalRateAmount()
                            dailyRentalRateCurrency()
                            weeklyRentalRateAmount()
                            weeklyRentalRateCurrency()
                            insuranceChargesAmount()
                            insuranceChargesCurrency()
                            fuelChargesAmount()
                            fuelChargesCurrency()
                            oneWayDropOffChargesAmount()
                            oneWayDropOffChargesCurrency()
                            carClassCode()
                            renterName()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is CarRental &&
                            this.extraCharges == other.extraCharges &&
                            this.daysRented == other.daysRented &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.checkoutDate == other.checkoutDate &&
                            this.dailyRentalRateAmount == other.dailyRentalRateAmount &&
                            this.dailyRentalRateCurrency == other.dailyRentalRateCurrency &&
                            this.weeklyRentalRateAmount == other.weeklyRentalRateAmount &&
                            this.weeklyRentalRateCurrency == other.weeklyRentalRateCurrency &&
                            this.insuranceChargesAmount == other.insuranceChargesAmount &&
                            this.insuranceChargesCurrency == other.insuranceChargesCurrency &&
                            this.fuelChargesAmount == other.fuelChargesAmount &&
                            this.fuelChargesCurrency == other.fuelChargesCurrency &&
                            this.oneWayDropOffChargesAmount == other.oneWayDropOffChargesAmount &&
                            this.oneWayDropOffChargesCurrency ==
                                other.oneWayDropOffChargesCurrency &&
                            this.carClassCode == other.carClassCode &&
                            this.renterName == other.renterName &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    extraCharges,
                                    daysRented,
                                    noShowIndicator,
                                    checkoutDate,
                                    dailyRentalRateAmount,
                                    dailyRentalRateCurrency,
                                    weeklyRentalRateAmount,
                                    weeklyRentalRateCurrency,
                                    insuranceChargesAmount,
                                    insuranceChargesCurrency,
                                    fuelChargesAmount,
                                    fuelChargesCurrency,
                                    oneWayDropOffChargesAmount,
                                    oneWayDropOffChargesCurrency,
                                    carClassCode,
                                    renterName,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "CarRental{extraCharges=$extraCharges, daysRented=$daysRented, noShowIndicator=$noShowIndicator, checkoutDate=$checkoutDate, dailyRentalRateAmount=$dailyRentalRateAmount, dailyRentalRateCurrency=$dailyRentalRateCurrency, weeklyRentalRateAmount=$weeklyRentalRateAmount, weeklyRentalRateCurrency=$weeklyRentalRateCurrency, insuranceChargesAmount=$insuranceChargesAmount, insuranceChargesCurrency=$insuranceChargesCurrency, fuelChargesAmount=$fuelChargesAmount, fuelChargesCurrency=$fuelChargesCurrency, oneWayDropOffChargesAmount=$oneWayDropOffChargesAmount, oneWayDropOffChargesCurrency=$oneWayDropOffChargesCurrency, carClassCode=$carClassCode, renterName=$renterName, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var daysRented: JsonField<Long> = JsonMissing.of()
                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var checkoutDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var weeklyRentalRateAmount: JsonField<Long> = JsonMissing.of()
                        private var weeklyRentalRateCurrency: JsonField<String> = JsonMissing.of()
                        private var insuranceChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var insuranceChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var fuelChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var fuelChargesCurrency: JsonField<String> = JsonMissing.of()
                        private var oneWayDropOffChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var oneWayDropOffChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var carClassCode: JsonField<String> = JsonMissing.of()
                        private var renterName: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(carRental: CarRental) = apply {
                            this.extraCharges = carRental.extraCharges
                            this.daysRented = carRental.daysRented
                            this.noShowIndicator = carRental.noShowIndicator
                            this.checkoutDate = carRental.checkoutDate
                            this.dailyRentalRateAmount = carRental.dailyRentalRateAmount
                            this.dailyRentalRateCurrency = carRental.dailyRentalRateCurrency
                            this.weeklyRentalRateAmount = carRental.weeklyRentalRateAmount
                            this.weeklyRentalRateCurrency = carRental.weeklyRentalRateCurrency
                            this.insuranceChargesAmount = carRental.insuranceChargesAmount
                            this.insuranceChargesCurrency = carRental.insuranceChargesCurrency
                            this.fuelChargesAmount = carRental.fuelChargesAmount
                            this.fuelChargesCurrency = carRental.fuelChargesCurrency
                            this.oneWayDropOffChargesAmount = carRental.oneWayDropOffChargesAmount
                            this.oneWayDropOffChargesCurrency =
                                carRental.oneWayDropOffChargesCurrency
                            this.carClassCode = carRental.carClassCode
                            this.renterName = carRental.renterName
                            additionalProperties(carRental.additionalProperties)
                        }

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (gas, late fee, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Number of days the vehicle was rented. */
                        fun daysRented(daysRented: Long) = daysRented(JsonField.of(daysRented))

                        /** Number of days the vehicle was rented. */
                        @JsonProperty("days_rented")
                        @ExcludeMissing
                        fun daysRented(daysRented: JsonField<Long>) = apply {
                            this.daysRented = daysRented
                        }

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * An indicator that the cardholder is being billed for a reserved vehicle
                         * that was not actually rented (that is, a "no-show" charge).
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        fun checkoutDate(checkoutDate: LocalDate) =
                            checkoutDate(JsonField.of(checkoutDate))

                        /**
                         * Date the customer picked up the car or, in the case of a no-show or
                         * pre-pay transaction, the scheduled pick up date.
                         */
                        @JsonProperty("checkout_date")
                        @ExcludeMissing
                        fun checkoutDate(checkoutDate: JsonField<LocalDate>) = apply {
                            this.checkoutDate = checkoutDate
                        }

                        /** Daily rate being charged for the vehicle. */
                        fun dailyRentalRateAmount(dailyRentalRateAmount: Long) =
                            dailyRentalRateAmount(JsonField.of(dailyRentalRateAmount))

                        /** Daily rate being charged for the vehicle. */
                        @JsonProperty("daily_rental_rate_amount")
                        @ExcludeMissing
                        fun dailyRentalRateAmount(dailyRentalRateAmount: JsonField<Long>) = apply {
                            this.dailyRentalRateAmount = dailyRentalRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: String) =
                            dailyRentalRateCurrency(JsonField.of(dailyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * rental rate.
                         */
                        @JsonProperty("daily_rental_rate_currency")
                        @ExcludeMissing
                        fun dailyRentalRateCurrency(dailyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRentalRateCurrency = dailyRentalRateCurrency
                            }

                        /** Weekly rate being charged for the vehicle. */
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: Long) =
                            weeklyRentalRateAmount(JsonField.of(weeklyRentalRateAmount))

                        /** Weekly rate being charged for the vehicle. */
                        @JsonProperty("weekly_rental_rate_amount")
                        @ExcludeMissing
                        fun weeklyRentalRateAmount(weeklyRentalRateAmount: JsonField<Long>) =
                            apply {
                                this.weeklyRentalRateAmount = weeklyRentalRateAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: String) =
                            weeklyRentalRateCurrency(JsonField.of(weeklyRentalRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * weekly rental rate.
                         */
                        @JsonProperty("weekly_rental_rate_currency")
                        @ExcludeMissing
                        fun weeklyRentalRateCurrency(weeklyRentalRateCurrency: JsonField<String>) =
                            apply {
                                this.weeklyRentalRateCurrency = weeklyRentalRateCurrency
                            }

                        /** Any insurance being charged for the vehicle. */
                        fun insuranceChargesAmount(insuranceChargesAmount: Long) =
                            insuranceChargesAmount(JsonField.of(insuranceChargesAmount))

                        /** Any insurance being charged for the vehicle. */
                        @JsonProperty("insurance_charges_amount")
                        @ExcludeMissing
                        fun insuranceChargesAmount(insuranceChargesAmount: JsonField<Long>) =
                            apply {
                                this.insuranceChargesAmount = insuranceChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        fun insuranceChargesCurrency(insuranceChargesCurrency: String) =
                            insuranceChargesCurrency(JsonField.of(insuranceChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * insurance charges assessed.
                         */
                        @JsonProperty("insurance_charges_currency")
                        @ExcludeMissing
                        fun insuranceChargesCurrency(insuranceChargesCurrency: JsonField<String>) =
                            apply {
                                this.insuranceChargesCurrency = insuranceChargesCurrency
                            }

                        /** Fuel charges for the vehicle. */
                        fun fuelChargesAmount(fuelChargesAmount: Long) =
                            fuelChargesAmount(JsonField.of(fuelChargesAmount))

                        /** Fuel charges for the vehicle. */
                        @JsonProperty("fuel_charges_amount")
                        @ExcludeMissing
                        fun fuelChargesAmount(fuelChargesAmount: JsonField<Long>) = apply {
                            this.fuelChargesAmount = fuelChargesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        fun fuelChargesCurrency(fuelChargesCurrency: String) =
                            fuelChargesCurrency(JsonField.of(fuelChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the fuel
                         * charges assessed.
                         */
                        @JsonProperty("fuel_charges_currency")
                        @ExcludeMissing
                        fun fuelChargesCurrency(fuelChargesCurrency: JsonField<String>) = apply {
                            this.fuelChargesCurrency = fuelChargesCurrency
                        }

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        fun oneWayDropOffChargesAmount(oneWayDropOffChargesAmount: Long) =
                            oneWayDropOffChargesAmount(JsonField.of(oneWayDropOffChargesAmount))

                        /**
                         * Charges for returning the vehicle at a different location than where it
                         * was picked up.
                         */
                        @JsonProperty("one_way_drop_off_charges_amount")
                        @ExcludeMissing
                        fun oneWayDropOffChargesAmount(
                            oneWayDropOffChargesAmount: JsonField<Long>
                        ) = apply { this.oneWayDropOffChargesAmount = oneWayDropOffChargesAmount }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        fun oneWayDropOffChargesCurrency(oneWayDropOffChargesCurrency: String) =
                            oneWayDropOffChargesCurrency(JsonField.of(oneWayDropOffChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * one-way drop-off charges assessed.
                         */
                        @JsonProperty("one_way_drop_off_charges_currency")
                        @ExcludeMissing
                        fun oneWayDropOffChargesCurrency(
                            oneWayDropOffChargesCurrency: JsonField<String>
                        ) = apply {
                            this.oneWayDropOffChargesCurrency = oneWayDropOffChargesCurrency
                        }

                        /** Code indicating the vehicle's class. */
                        fun carClassCode(carClassCode: String) =
                            carClassCode(JsonField.of(carClassCode))

                        /** Code indicating the vehicle's class. */
                        @JsonProperty("car_class_code")
                        @ExcludeMissing
                        fun carClassCode(carClassCode: JsonField<String>) = apply {
                            this.carClassCode = carClassCode
                        }

                        /** Name of the person renting the vehicle. */
                        fun renterName(renterName: String) = renterName(JsonField.of(renterName))

                        /** Name of the person renting the vehicle. */
                        @JsonProperty("renter_name")
                        @ExcludeMissing
                        fun renterName(renterName: JsonField<String>) = apply {
                            this.renterName = renterName
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): CarRental =
                            CarRental(
                                extraCharges,
                                daysRented,
                                noShowIndicator,
                                checkoutDate,
                                dailyRentalRateAmount,
                                dailyRentalRateCurrency,
                                weeklyRentalRateAmount,
                                weeklyRentalRateCurrency,
                                insuranceChargesAmount,
                                insuranceChargesCurrency,
                                fuelChargesAmount,
                                fuelChargesCurrency,
                                oneWayDropOffChargesAmount,
                                oneWayDropOffChargesCurrency,
                                carClassCode,
                                renterName,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val GAS = ExtraCharges(JsonField.of("gas"))

                            val EXTRA_MILEAGE = ExtraCharges(JsonField.of("extra_mileage"))

                            val LATE_RETURN = ExtraCharges(JsonField.of("late_return"))

                            val ONE_WAY_SERVICE_FEE =
                                ExtraCharges(JsonField.of("one_way_service_fee"))

                            val PARKING_VIOLATION = ExtraCharges(JsonField.of("parking_violation"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            GAS,
                            EXTRA_MILEAGE,
                            LATE_RETURN,
                            ONE_WAY_SERVICE_FEE,
                            PARKING_VIOLATION,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                GAS -> Value.GAS
                                EXTRA_MILEAGE -> Value.EXTRA_MILEAGE
                                LATE_RETURN -> Value.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Value.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Value.PARKING_VIOLATION
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                GAS -> Known.GAS
                                EXTRA_MILEAGE -> Known.EXTRA_MILEAGE
                                LATE_RETURN -> Known.LATE_RETURN
                                ONE_WAY_SERVICE_FEE -> Known.ONE_WAY_SERVICE_FEE
                                PARKING_VIOLATION -> Known.PARKING_VIOLATION
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW_FOR_SPECIALIZED_VEHICLE =
                                NoShowIndicator(JsonField.of("no_show_for_specialized_vehicle"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW_FOR_SPECIALIZED_VEHICLE,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Value.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW_FOR_SPECIALIZED_VEHICLE ->
                                    Known.NO_SHOW_FOR_SPECIALIZED_VEHICLE
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                /** Fields specific to lodging. */
                @JsonDeserialize(builder = Lodging.Builder::class)
                @NoAutoDetect
                class Lodging
                private constructor(
                    private val noShowIndicator: JsonField<NoShowIndicator>,
                    private val extraCharges: JsonField<ExtraCharges>,
                    private val checkInDate: JsonField<LocalDate>,
                    private val dailyRoomRateAmount: JsonField<Long>,
                    private val dailyRoomRateCurrency: JsonField<String>,
                    private val totalTaxAmount: JsonField<Long>,
                    private val totalTaxCurrency: JsonField<String>,
                    private val prepaidExpensesAmount: JsonField<Long>,
                    private val prepaidExpensesCurrency: JsonField<String>,
                    private val foodBeverageChargesAmount: JsonField<Long>,
                    private val foodBeverageChargesCurrency: JsonField<String>,
                    private val folioCashAdvancesAmount: JsonField<Long>,
                    private val folioCashAdvancesCurrency: JsonField<String>,
                    private val roomNights: JsonField<Long>,
                    private val totalRoomTaxAmount: JsonField<Long>,
                    private val totalRoomTaxCurrency: JsonField<String>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    fun noShowIndicator(): NoShowIndicator? =
                        noShowIndicator.getNullable("no_show_indicator")

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    fun extraCharges(): ExtraCharges? = extraCharges.getNullable("extra_charges")

                    /** Date the customer checked in. */
                    fun checkInDate(): LocalDate? = checkInDate.getNullable("check_in_date")

                    /** Daily rate being charged for the room. */
                    fun dailyRoomRateAmount(): Long? =
                        dailyRoomRateAmount.getNullable("daily_room_rate_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    fun dailyRoomRateCurrency(): String? =
                        dailyRoomRateCurrency.getNullable("daily_room_rate_currency")

                    /** Total tax being charged for the room. */
                    fun totalTaxAmount(): Long? = totalTaxAmount.getNullable("total_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    fun totalTaxCurrency(): String? =
                        totalTaxCurrency.getNullable("total_tax_currency")

                    /** Prepaid expenses being charged for the room. */
                    fun prepaidExpensesAmount(): Long? =
                        prepaidExpensesAmount.getNullable("prepaid_expenses_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    fun prepaidExpensesCurrency(): String? =
                        prepaidExpensesCurrency.getNullable("prepaid_expenses_currency")

                    /** Food and beverage charges for the room. */
                    fun foodBeverageChargesAmount(): Long? =
                        foodBeverageChargesAmount.getNullable("food_beverage_charges_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor and
                     * beverage charges.
                     */
                    fun foodBeverageChargesCurrency(): String? =
                        foodBeverageChargesCurrency.getNullable("food_beverage_charges_currency")

                    /** Folio cash advances for the room. */
                    fun folioCashAdvancesAmount(): Long? =
                        folioCashAdvancesAmount.getNullable("folio_cash_advances_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    fun folioCashAdvancesCurrency(): String? =
                        folioCashAdvancesCurrency.getNullable("folio_cash_advances_currency")

                    /** Number of nights the room was rented. */
                    fun roomNights(): Long? = roomNights.getNullable("room_nights")

                    /** Total room tax being charged. */
                    fun totalRoomTaxAmount(): Long? =
                        totalRoomTaxAmount.getNullable("total_room_tax_amount")

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    fun totalRoomTaxCurrency(): String? =
                        totalRoomTaxCurrency.getNullable("total_room_tax_currency")

                    /**
                     * Indicator that the cardholder is being billed for a reserved room that was
                     * not actually used.
                     */
                    @JsonProperty("no_show_indicator")
                    @ExcludeMissing
                    fun _noShowIndicator() = noShowIndicator

                    /** Additional charges (phone, late check-out, etc.) being billed. */
                    @JsonProperty("extra_charges")
                    @ExcludeMissing
                    fun _extraCharges() = extraCharges

                    /** Date the customer checked in. */
                    @JsonProperty("check_in_date") @ExcludeMissing fun _checkInDate() = checkInDate

                    /** Daily rate being charged for the room. */
                    @JsonProperty("daily_room_rate_amount")
                    @ExcludeMissing
                    fun _dailyRoomRateAmount() = dailyRoomRateAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                     * room rate.
                     */
                    @JsonProperty("daily_room_rate_currency")
                    @ExcludeMissing
                    fun _dailyRoomRateCurrency() = dailyRoomRateCurrency

                    /** Total tax being charged for the room. */
                    @JsonProperty("total_tax_amount")
                    @ExcludeMissing
                    fun _totalTaxAmount() = totalTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total tax
                     * assessed.
                     */
                    @JsonProperty("total_tax_currency")
                    @ExcludeMissing
                    fun _totalTaxCurrency() = totalTaxCurrency

                    /** Prepaid expenses being charged for the room. */
                    @JsonProperty("prepaid_expenses_amount")
                    @ExcludeMissing
                    fun _prepaidExpensesAmount() = prepaidExpensesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the prepaid
                     * expenses.
                     */
                    @JsonProperty("prepaid_expenses_currency")
                    @ExcludeMissing
                    fun _prepaidExpensesCurrency() = prepaidExpensesCurrency

                    /** Food and beverage charges for the room. */
                    @JsonProperty("food_beverage_charges_amount")
                    @ExcludeMissing
                    fun _foodBeverageChargesAmount() = foodBeverageChargesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor and
                     * beverage charges.
                     */
                    @JsonProperty("food_beverage_charges_currency")
                    @ExcludeMissing
                    fun _foodBeverageChargesCurrency() = foodBeverageChargesCurrency

                    /** Folio cash advances for the room. */
                    @JsonProperty("folio_cash_advances_amount")
                    @ExcludeMissing
                    fun _folioCashAdvancesAmount() = folioCashAdvancesAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                     * cash advances.
                     */
                    @JsonProperty("folio_cash_advances_currency")
                    @ExcludeMissing
                    fun _folioCashAdvancesCurrency() = folioCashAdvancesCurrency

                    /** Number of nights the room was rented. */
                    @JsonProperty("room_nights") @ExcludeMissing fun _roomNights() = roomNights

                    /** Total room tax being charged. */
                    @JsonProperty("total_room_tax_amount")
                    @ExcludeMissing
                    fun _totalRoomTaxAmount() = totalRoomTaxAmount

                    /**
                     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                     * room tax.
                     */
                    @JsonProperty("total_room_tax_currency")
                    @ExcludeMissing
                    fun _totalRoomTaxCurrency() = totalRoomTaxCurrency

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Lodging = apply {
                        if (!validated) {
                            noShowIndicator()
                            extraCharges()
                            checkInDate()
                            dailyRoomRateAmount()
                            dailyRoomRateCurrency()
                            totalTaxAmount()
                            totalTaxCurrency()
                            prepaidExpensesAmount()
                            prepaidExpensesCurrency()
                            foodBeverageChargesAmount()
                            foodBeverageChargesCurrency()
                            folioCashAdvancesAmount()
                            folioCashAdvancesCurrency()
                            roomNights()
                            totalRoomTaxAmount()
                            totalRoomTaxCurrency()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Lodging &&
                            this.noShowIndicator == other.noShowIndicator &&
                            this.extraCharges == other.extraCharges &&
                            this.checkInDate == other.checkInDate &&
                            this.dailyRoomRateAmount == other.dailyRoomRateAmount &&
                            this.dailyRoomRateCurrency == other.dailyRoomRateCurrency &&
                            this.totalTaxAmount == other.totalTaxAmount &&
                            this.totalTaxCurrency == other.totalTaxCurrency &&
                            this.prepaidExpensesAmount == other.prepaidExpensesAmount &&
                            this.prepaidExpensesCurrency == other.prepaidExpensesCurrency &&
                            this.foodBeverageChargesAmount == other.foodBeverageChargesAmount &&
                            this.foodBeverageChargesCurrency == other.foodBeverageChargesCurrency &&
                            this.folioCashAdvancesAmount == other.folioCashAdvancesAmount &&
                            this.folioCashAdvancesCurrency == other.folioCashAdvancesCurrency &&
                            this.roomNights == other.roomNights &&
                            this.totalRoomTaxAmount == other.totalRoomTaxAmount &&
                            this.totalRoomTaxCurrency == other.totalRoomTaxCurrency &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    noShowIndicator,
                                    extraCharges,
                                    checkInDate,
                                    dailyRoomRateAmount,
                                    dailyRoomRateCurrency,
                                    totalTaxAmount,
                                    totalTaxCurrency,
                                    prepaidExpensesAmount,
                                    prepaidExpensesCurrency,
                                    foodBeverageChargesAmount,
                                    foodBeverageChargesCurrency,
                                    folioCashAdvancesAmount,
                                    folioCashAdvancesCurrency,
                                    roomNights,
                                    totalRoomTaxAmount,
                                    totalRoomTaxCurrency,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Lodging{noShowIndicator=$noShowIndicator, extraCharges=$extraCharges, checkInDate=$checkInDate, dailyRoomRateAmount=$dailyRoomRateAmount, dailyRoomRateCurrency=$dailyRoomRateCurrency, totalTaxAmount=$totalTaxAmount, totalTaxCurrency=$totalTaxCurrency, prepaidExpensesAmount=$prepaidExpensesAmount, prepaidExpensesCurrency=$prepaidExpensesCurrency, foodBeverageChargesAmount=$foodBeverageChargesAmount, foodBeverageChargesCurrency=$foodBeverageChargesCurrency, folioCashAdvancesAmount=$folioCashAdvancesAmount, folioCashAdvancesCurrency=$folioCashAdvancesCurrency, roomNights=$roomNights, totalRoomTaxAmount=$totalRoomTaxAmount, totalRoomTaxCurrency=$totalRoomTaxCurrency, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var noShowIndicator: JsonField<NoShowIndicator> = JsonMissing.of()
                        private var extraCharges: JsonField<ExtraCharges> = JsonMissing.of()
                        private var checkInDate: JsonField<LocalDate> = JsonMissing.of()
                        private var dailyRoomRateAmount: JsonField<Long> = JsonMissing.of()
                        private var dailyRoomRateCurrency: JsonField<String> = JsonMissing.of()
                        private var totalTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var prepaidExpensesAmount: JsonField<Long> = JsonMissing.of()
                        private var prepaidExpensesCurrency: JsonField<String> = JsonMissing.of()
                        private var foodBeverageChargesAmount: JsonField<Long> = JsonMissing.of()
                        private var foodBeverageChargesCurrency: JsonField<String> =
                            JsonMissing.of()
                        private var folioCashAdvancesAmount: JsonField<Long> = JsonMissing.of()
                        private var folioCashAdvancesCurrency: JsonField<String> = JsonMissing.of()
                        private var roomNights: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxAmount: JsonField<Long> = JsonMissing.of()
                        private var totalRoomTaxCurrency: JsonField<String> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(lodging: Lodging) = apply {
                            this.noShowIndicator = lodging.noShowIndicator
                            this.extraCharges = lodging.extraCharges
                            this.checkInDate = lodging.checkInDate
                            this.dailyRoomRateAmount = lodging.dailyRoomRateAmount
                            this.dailyRoomRateCurrency = lodging.dailyRoomRateCurrency
                            this.totalTaxAmount = lodging.totalTaxAmount
                            this.totalTaxCurrency = lodging.totalTaxCurrency
                            this.prepaidExpensesAmount = lodging.prepaidExpensesAmount
                            this.prepaidExpensesCurrency = lodging.prepaidExpensesCurrency
                            this.foodBeverageChargesAmount = lodging.foodBeverageChargesAmount
                            this.foodBeverageChargesCurrency = lodging.foodBeverageChargesCurrency
                            this.folioCashAdvancesAmount = lodging.folioCashAdvancesAmount
                            this.folioCashAdvancesCurrency = lodging.folioCashAdvancesCurrency
                            this.roomNights = lodging.roomNights
                            this.totalRoomTaxAmount = lodging.totalRoomTaxAmount
                            this.totalRoomTaxCurrency = lodging.totalRoomTaxCurrency
                            additionalProperties(lodging.additionalProperties)
                        }

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        fun noShowIndicator(noShowIndicator: NoShowIndicator) =
                            noShowIndicator(JsonField.of(noShowIndicator))

                        /**
                         * Indicator that the cardholder is being billed for a reserved room that
                         * was not actually used.
                         */
                        @JsonProperty("no_show_indicator")
                        @ExcludeMissing
                        fun noShowIndicator(noShowIndicator: JsonField<NoShowIndicator>) = apply {
                            this.noShowIndicator = noShowIndicator
                        }

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        fun extraCharges(extraCharges: ExtraCharges) =
                            extraCharges(JsonField.of(extraCharges))

                        /** Additional charges (phone, late check-out, etc.) being billed. */
                        @JsonProperty("extra_charges")
                        @ExcludeMissing
                        fun extraCharges(extraCharges: JsonField<ExtraCharges>) = apply {
                            this.extraCharges = extraCharges
                        }

                        /** Date the customer checked in. */
                        fun checkInDate(checkInDate: LocalDate) =
                            checkInDate(JsonField.of(checkInDate))

                        /** Date the customer checked in. */
                        @JsonProperty("check_in_date")
                        @ExcludeMissing
                        fun checkInDate(checkInDate: JsonField<LocalDate>) = apply {
                            this.checkInDate = checkInDate
                        }

                        /** Daily rate being charged for the room. */
                        fun dailyRoomRateAmount(dailyRoomRateAmount: Long) =
                            dailyRoomRateAmount(JsonField.of(dailyRoomRateAmount))

                        /** Daily rate being charged for the room. */
                        @JsonProperty("daily_room_rate_amount")
                        @ExcludeMissing
                        fun dailyRoomRateAmount(dailyRoomRateAmount: JsonField<Long>) = apply {
                            this.dailyRoomRateAmount = dailyRoomRateAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: String) =
                            dailyRoomRateCurrency(JsonField.of(dailyRoomRateCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the daily
                         * room rate.
                         */
                        @JsonProperty("daily_room_rate_currency")
                        @ExcludeMissing
                        fun dailyRoomRateCurrency(dailyRoomRateCurrency: JsonField<String>) =
                            apply {
                                this.dailyRoomRateCurrency = dailyRoomRateCurrency
                            }

                        /** Total tax being charged for the room. */
                        fun totalTaxAmount(totalTaxAmount: Long) =
                            totalTaxAmount(JsonField.of(totalTaxAmount))

                        /** Total tax being charged for the room. */
                        @JsonProperty("total_tax_amount")
                        @ExcludeMissing
                        fun totalTaxAmount(totalTaxAmount: JsonField<Long>) = apply {
                            this.totalTaxAmount = totalTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        fun totalTaxCurrency(totalTaxCurrency: String) =
                            totalTaxCurrency(JsonField.of(totalTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * tax assessed.
                         */
                        @JsonProperty("total_tax_currency")
                        @ExcludeMissing
                        fun totalTaxCurrency(totalTaxCurrency: JsonField<String>) = apply {
                            this.totalTaxCurrency = totalTaxCurrency
                        }

                        /** Prepaid expenses being charged for the room. */
                        fun prepaidExpensesAmount(prepaidExpensesAmount: Long) =
                            prepaidExpensesAmount(JsonField.of(prepaidExpensesAmount))

                        /** Prepaid expenses being charged for the room. */
                        @JsonProperty("prepaid_expenses_amount")
                        @ExcludeMissing
                        fun prepaidExpensesAmount(prepaidExpensesAmount: JsonField<Long>) = apply {
                            this.prepaidExpensesAmount = prepaidExpensesAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: String) =
                            prepaidExpensesCurrency(JsonField.of(prepaidExpensesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the
                         * prepaid expenses.
                         */
                        @JsonProperty("prepaid_expenses_currency")
                        @ExcludeMissing
                        fun prepaidExpensesCurrency(prepaidExpensesCurrency: JsonField<String>) =
                            apply {
                                this.prepaidExpensesCurrency = prepaidExpensesCurrency
                            }

                        /** Food and beverage charges for the room. */
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: Long) =
                            foodBeverageChargesAmount(JsonField.of(foodBeverageChargesAmount))

                        /** Food and beverage charges for the room. */
                        @JsonProperty("food_beverage_charges_amount")
                        @ExcludeMissing
                        fun foodBeverageChargesAmount(foodBeverageChargesAmount: JsonField<Long>) =
                            apply {
                                this.foodBeverageChargesAmount = foodBeverageChargesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor
                         * and beverage charges.
                         */
                        fun foodBeverageChargesCurrency(foodBeverageChargesCurrency: String) =
                            foodBeverageChargesCurrency(JsonField.of(foodBeverageChargesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the foor
                         * and beverage charges.
                         */
                        @JsonProperty("food_beverage_charges_currency")
                        @ExcludeMissing
                        fun foodBeverageChargesCurrency(
                            foodBeverageChargesCurrency: JsonField<String>
                        ) = apply { this.foodBeverageChargesCurrency = foodBeverageChargesCurrency }

                        /** Folio cash advances for the room. */
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: Long) =
                            folioCashAdvancesAmount(JsonField.of(folioCashAdvancesAmount))

                        /** Folio cash advances for the room. */
                        @JsonProperty("folio_cash_advances_amount")
                        @ExcludeMissing
                        fun folioCashAdvancesAmount(folioCashAdvancesAmount: JsonField<Long>) =
                            apply {
                                this.folioCashAdvancesAmount = folioCashAdvancesAmount
                            }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        fun folioCashAdvancesCurrency(folioCashAdvancesCurrency: String) =
                            folioCashAdvancesCurrency(JsonField.of(folioCashAdvancesCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the folio
                         * cash advances.
                         */
                        @JsonProperty("folio_cash_advances_currency")
                        @ExcludeMissing
                        fun folioCashAdvancesCurrency(
                            folioCashAdvancesCurrency: JsonField<String>
                        ) = apply { this.folioCashAdvancesCurrency = folioCashAdvancesCurrency }

                        /** Number of nights the room was rented. */
                        fun roomNights(roomNights: Long) = roomNights(JsonField.of(roomNights))

                        /** Number of nights the room was rented. */
                        @JsonProperty("room_nights")
                        @ExcludeMissing
                        fun roomNights(roomNights: JsonField<Long>) = apply {
                            this.roomNights = roomNights
                        }

                        /** Total room tax being charged. */
                        fun totalRoomTaxAmount(totalRoomTaxAmount: Long) =
                            totalRoomTaxAmount(JsonField.of(totalRoomTaxAmount))

                        /** Total room tax being charged. */
                        @JsonProperty("total_room_tax_amount")
                        @ExcludeMissing
                        fun totalRoomTaxAmount(totalRoomTaxAmount: JsonField<Long>) = apply {
                            this.totalRoomTaxAmount = totalRoomTaxAmount
                        }

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: String) =
                            totalRoomTaxCurrency(JsonField.of(totalRoomTaxCurrency))

                        /**
                         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the total
                         * room tax.
                         */
                        @JsonProperty("total_room_tax_currency")
                        @ExcludeMissing
                        fun totalRoomTaxCurrency(totalRoomTaxCurrency: JsonField<String>) = apply {
                            this.totalRoomTaxCurrency = totalRoomTaxCurrency
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Lodging =
                            Lodging(
                                noShowIndicator,
                                extraCharges,
                                checkInDate,
                                dailyRoomRateAmount,
                                dailyRoomRateCurrency,
                                totalTaxAmount,
                                totalTaxCurrency,
                                prepaidExpensesAmount,
                                prepaidExpensesCurrency,
                                foodBeverageChargesAmount,
                                foodBeverageChargesCurrency,
                                folioCashAdvancesAmount,
                                folioCashAdvancesCurrency,
                                roomNights,
                                totalRoomTaxAmount,
                                totalRoomTaxCurrency,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    class ExtraCharges
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is ExtraCharges && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_EXTRA_CHARGE = ExtraCharges(JsonField.of("no_extra_charge"))

                            val RESTAURANT = ExtraCharges(JsonField.of("restaurant"))

                            val GIFT_SHOP = ExtraCharges(JsonField.of("gift_shop"))

                            val MINI_BAR = ExtraCharges(JsonField.of("mini_bar"))

                            val TELEPHONE = ExtraCharges(JsonField.of("telephone"))

                            val OTHER = ExtraCharges(JsonField.of("other"))

                            val LAUNDRY = ExtraCharges(JsonField.of("laundry"))

                            fun of(value: String) = ExtraCharges(JsonField.of(value))
                        }

                        enum class Known {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                        }

                        enum class Value {
                            NO_EXTRA_CHARGE,
                            RESTAURANT,
                            GIFT_SHOP,
                            MINI_BAR,
                            TELEPHONE,
                            OTHER,
                            LAUNDRY,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_EXTRA_CHARGE -> Value.NO_EXTRA_CHARGE
                                RESTAURANT -> Value.RESTAURANT
                                GIFT_SHOP -> Value.GIFT_SHOP
                                MINI_BAR -> Value.MINI_BAR
                                TELEPHONE -> Value.TELEPHONE
                                OTHER -> Value.OTHER
                                LAUNDRY -> Value.LAUNDRY
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_EXTRA_CHARGE -> Known.NO_EXTRA_CHARGE
                                RESTAURANT -> Known.RESTAURANT
                                GIFT_SHOP -> Known.GIFT_SHOP
                                MINI_BAR -> Known.MINI_BAR
                                TELEPHONE -> Known.TELEPHONE
                                OTHER -> Known.OTHER
                                LAUNDRY -> Known.LAUNDRY
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown ExtraCharges: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class NoShowIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is NoShowIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NOT_APPLICABLE = NoShowIndicator(JsonField.of("not_applicable"))

                            val NO_SHOW = NoShowIndicator(JsonField.of("no_show"))

                            fun of(value: String) = NoShowIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NOT_APPLICABLE,
                            NO_SHOW,
                        }

                        enum class Value {
                            NOT_APPLICABLE,
                            NO_SHOW,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NOT_APPLICABLE -> Value.NOT_APPLICABLE
                                NO_SHOW -> Value.NO_SHOW
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NOT_APPLICABLE -> Known.NOT_APPLICABLE
                                NO_SHOW -> Known.NO_SHOW
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown NoShowIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }
                }

                class PurchaseIdentifierFormat
                @JsonCreator
                private constructor(
                    private val value: JsonField<String>,
                ) {

                    @com.fasterxml.jackson.annotation.JsonValue
                    fun _value(): JsonField<String> = value

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is PurchaseIdentifierFormat && this.value == other.value
                    }

                    override fun hashCode() = value.hashCode()

                    override fun toString() = value.toString()

                    companion object {

                        val FREE_TEXT = PurchaseIdentifierFormat(JsonField.of("free_text"))

                        val ORDER_NUMBER = PurchaseIdentifierFormat(JsonField.of("order_number"))

                        val RENTAL_AGREEMENT_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("rental_agreement_number"))

                        val HOTEL_FOLIO_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("hotel_folio_number"))

                        val INVOICE_NUMBER =
                            PurchaseIdentifierFormat(JsonField.of("invoice_number"))

                        fun of(value: String) = PurchaseIdentifierFormat(JsonField.of(value))
                    }

                    enum class Known {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                    }

                    enum class Value {
                        FREE_TEXT,
                        ORDER_NUMBER,
                        RENTAL_AGREEMENT_NUMBER,
                        HOTEL_FOLIO_NUMBER,
                        INVOICE_NUMBER,
                        _UNKNOWN,
                    }

                    fun value(): Value =
                        when (this) {
                            FREE_TEXT -> Value.FREE_TEXT
                            ORDER_NUMBER -> Value.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Value.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Value.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Value.INVOICE_NUMBER
                            else -> Value._UNKNOWN
                        }

                    fun known(): Known =
                        when (this) {
                            FREE_TEXT -> Known.FREE_TEXT
                            ORDER_NUMBER -> Known.ORDER_NUMBER
                            RENTAL_AGREEMENT_NUMBER -> Known.RENTAL_AGREEMENT_NUMBER
                            HOTEL_FOLIO_NUMBER -> Known.HOTEL_FOLIO_NUMBER
                            INVOICE_NUMBER -> Known.INVOICE_NUMBER
                            else ->
                                throw IncreaseInvalidDataException(
                                    "Unknown PurchaseIdentifierFormat: $value"
                                )
                        }

                    fun asString(): String = _value().asStringOrThrow()
                }

                /** Fields specific to travel. */
                @JsonDeserialize(builder = Travel.Builder::class)
                @NoAutoDetect
                class Travel
                private constructor(
                    private val ticketNumber: JsonField<String>,
                    private val passengerName: JsonField<String>,
                    private val departureDate: JsonField<LocalDate>,
                    private val originationCityAirportCode: JsonField<String>,
                    private val travelAgencyCode: JsonField<String>,
                    private val travelAgencyName: JsonField<String>,
                    private val restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>,
                    private val computerizedReservationSystem: JsonField<String>,
                    private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                    private val ticketChangeIndicator: JsonField<TicketChangeIndicator>,
                    private val tripLegs: JsonField<List<TripLeg>>,
                    private val ancillary: JsonField<Ancillary>,
                    private val additionalProperties: Map<String, JsonValue>,
                ) {

                    private var validated: Boolean = false

                    private var hashCode: Int = 0

                    /** Ticket number. */
                    fun ticketNumber(): String? = ticketNumber.getNullable("ticket_number")

                    /** Name of the passenger. */
                    fun passengerName(): String? = passengerName.getNullable("passenger_name")

                    /** Date of departure. */
                    fun departureDate(): LocalDate? = departureDate.getNullable("departure_date")

                    /** Code for the originating city or airport. */
                    fun originationCityAirportCode(): String? =
                        originationCityAirportCode.getNullable("origination_city_airport_code")

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyCode(): String? =
                        travelAgencyCode.getNullable("travel_agency_code")

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    fun travelAgencyName(): String? =
                        travelAgencyName.getNullable("travel_agency_name")

                    /** Indicates whether this ticket is non-refundable. */
                    fun restrictedTicketIndicator(): RestrictedTicketIndicator? =
                        restrictedTicketIndicator.getNullable("restricted_ticket_indicator")

                    /** Indicates the computerized reservation system used to book the ticket. */
                    fun computerizedReservationSystem(): String? =
                        computerizedReservationSystem.getNullable("computerized_reservation_system")

                    /** Indicates the reason for a credit to the cardholder. */
                    fun creditReasonIndicator(): CreditReasonIndicator? =
                        creditReasonIndicator.getNullable("credit_reason_indicator")

                    /** Indicates why a ticket was changed. */
                    fun ticketChangeIndicator(): TicketChangeIndicator? =
                        ticketChangeIndicator.getNullable("ticket_change_indicator")

                    /** Fields specific to each leg of the journey. */
                    fun tripLegs(): List<TripLeg>? = tripLegs.getNullable("trip_legs")

                    /** Ancillary purchases in addition to the airfare. */
                    fun ancillary(): Ancillary? = ancillary.getNullable("ancillary")

                    /** Ticket number. */
                    @JsonProperty("ticket_number")
                    @ExcludeMissing
                    fun _ticketNumber() = ticketNumber

                    /** Name of the passenger. */
                    @JsonProperty("passenger_name")
                    @ExcludeMissing
                    fun _passengerName() = passengerName

                    /** Date of departure. */
                    @JsonProperty("departure_date")
                    @ExcludeMissing
                    fun _departureDate() = departureDate

                    /** Code for the originating city or airport. */
                    @JsonProperty("origination_city_airport_code")
                    @ExcludeMissing
                    fun _originationCityAirportCode() = originationCityAirportCode

                    /** Code for the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_code")
                    @ExcludeMissing
                    fun _travelAgencyCode() = travelAgencyCode

                    /** Name of the travel agency if the ticket was issued by a travel agency. */
                    @JsonProperty("travel_agency_name")
                    @ExcludeMissing
                    fun _travelAgencyName() = travelAgencyName

                    /** Indicates whether this ticket is non-refundable. */
                    @JsonProperty("restricted_ticket_indicator")
                    @ExcludeMissing
                    fun _restrictedTicketIndicator() = restrictedTicketIndicator

                    /** Indicates the computerized reservation system used to book the ticket. */
                    @JsonProperty("computerized_reservation_system")
                    @ExcludeMissing
                    fun _computerizedReservationSystem() = computerizedReservationSystem

                    /** Indicates the reason for a credit to the cardholder. */
                    @JsonProperty("credit_reason_indicator")
                    @ExcludeMissing
                    fun _creditReasonIndicator() = creditReasonIndicator

                    /** Indicates why a ticket was changed. */
                    @JsonProperty("ticket_change_indicator")
                    @ExcludeMissing
                    fun _ticketChangeIndicator() = ticketChangeIndicator

                    /** Fields specific to each leg of the journey. */
                    @JsonProperty("trip_legs") @ExcludeMissing fun _tripLegs() = tripLegs

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonProperty("ancillary") @ExcludeMissing fun _ancillary() = ancillary

                    @JsonAnyGetter
                    @ExcludeMissing
                    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                    fun validate(): Travel = apply {
                        if (!validated) {
                            ticketNumber()
                            passengerName()
                            departureDate()
                            originationCityAirportCode()
                            travelAgencyCode()
                            travelAgencyName()
                            restrictedTicketIndicator()
                            computerizedReservationSystem()
                            creditReasonIndicator()
                            ticketChangeIndicator()
                            tripLegs()?.forEach { it.validate() }
                            ancillary()?.validate()
                            validated = true
                        }
                    }

                    fun toBuilder() = Builder().from(this)

                    override fun equals(other: Any?): Boolean {
                        if (this === other) {
                            return true
                        }

                        return other is Travel &&
                            this.ticketNumber == other.ticketNumber &&
                            this.passengerName == other.passengerName &&
                            this.departureDate == other.departureDate &&
                            this.originationCityAirportCode == other.originationCityAirportCode &&
                            this.travelAgencyCode == other.travelAgencyCode &&
                            this.travelAgencyName == other.travelAgencyName &&
                            this.restrictedTicketIndicator == other.restrictedTicketIndicator &&
                            this.computerizedReservationSystem ==
                                other.computerizedReservationSystem &&
                            this.creditReasonIndicator == other.creditReasonIndicator &&
                            this.ticketChangeIndicator == other.ticketChangeIndicator &&
                            this.tripLegs == other.tripLegs &&
                            this.ancillary == other.ancillary &&
                            this.additionalProperties == other.additionalProperties
                    }

                    override fun hashCode(): Int {
                        if (hashCode == 0) {
                            hashCode =
                                Objects.hash(
                                    ticketNumber,
                                    passengerName,
                                    departureDate,
                                    originationCityAirportCode,
                                    travelAgencyCode,
                                    travelAgencyName,
                                    restrictedTicketIndicator,
                                    computerizedReservationSystem,
                                    creditReasonIndicator,
                                    ticketChangeIndicator,
                                    tripLegs,
                                    ancillary,
                                    additionalProperties,
                                )
                        }
                        return hashCode
                    }

                    override fun toString() =
                        "Travel{ticketNumber=$ticketNumber, passengerName=$passengerName, departureDate=$departureDate, originationCityAirportCode=$originationCityAirportCode, travelAgencyCode=$travelAgencyCode, travelAgencyName=$travelAgencyName, restrictedTicketIndicator=$restrictedTicketIndicator, computerizedReservationSystem=$computerizedReservationSystem, creditReasonIndicator=$creditReasonIndicator, ticketChangeIndicator=$ticketChangeIndicator, tripLegs=$tripLegs, ancillary=$ancillary, additionalProperties=$additionalProperties}"

                    companion object {

                        fun builder() = Builder()
                    }

                    class Builder {

                        private var ticketNumber: JsonField<String> = JsonMissing.of()
                        private var passengerName: JsonField<String> = JsonMissing.of()
                        private var departureDate: JsonField<LocalDate> = JsonMissing.of()
                        private var originationCityAirportCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyCode: JsonField<String> = JsonMissing.of()
                        private var travelAgencyName: JsonField<String> = JsonMissing.of()
                        private var restrictedTicketIndicator:
                            JsonField<RestrictedTicketIndicator> =
                            JsonMissing.of()
                        private var computerizedReservationSystem: JsonField<String> =
                            JsonMissing.of()
                        private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                            JsonMissing.of()
                        private var ticketChangeIndicator: JsonField<TicketChangeIndicator> =
                            JsonMissing.of()
                        private var tripLegs: JsonField<List<TripLeg>> = JsonMissing.of()
                        private var ancillary: JsonField<Ancillary> = JsonMissing.of()
                        private var additionalProperties: MutableMap<String, JsonValue> =
                            mutableMapOf()

                        internal fun from(travel: Travel) = apply {
                            this.ticketNumber = travel.ticketNumber
                            this.passengerName = travel.passengerName
                            this.departureDate = travel.departureDate
                            this.originationCityAirportCode = travel.originationCityAirportCode
                            this.travelAgencyCode = travel.travelAgencyCode
                            this.travelAgencyName = travel.travelAgencyName
                            this.restrictedTicketIndicator = travel.restrictedTicketIndicator
                            this.computerizedReservationSystem =
                                travel.computerizedReservationSystem
                            this.creditReasonIndicator = travel.creditReasonIndicator
                            this.ticketChangeIndicator = travel.ticketChangeIndicator
                            this.tripLegs = travel.tripLegs
                            this.ancillary = travel.ancillary
                            additionalProperties(travel.additionalProperties)
                        }

                        /** Ticket number. */
                        fun ticketNumber(ticketNumber: String) =
                            ticketNumber(JsonField.of(ticketNumber))

                        /** Ticket number. */
                        @JsonProperty("ticket_number")
                        @ExcludeMissing
                        fun ticketNumber(ticketNumber: JsonField<String>) = apply {
                            this.ticketNumber = ticketNumber
                        }

                        /** Name of the passenger. */
                        fun passengerName(passengerName: String) =
                            passengerName(JsonField.of(passengerName))

                        /** Name of the passenger. */
                        @JsonProperty("passenger_name")
                        @ExcludeMissing
                        fun passengerName(passengerName: JsonField<String>) = apply {
                            this.passengerName = passengerName
                        }

                        /** Date of departure. */
                        fun departureDate(departureDate: LocalDate) =
                            departureDate(JsonField.of(departureDate))

                        /** Date of departure. */
                        @JsonProperty("departure_date")
                        @ExcludeMissing
                        fun departureDate(departureDate: JsonField<LocalDate>) = apply {
                            this.departureDate = departureDate
                        }

                        /** Code for the originating city or airport. */
                        fun originationCityAirportCode(originationCityAirportCode: String) =
                            originationCityAirportCode(JsonField.of(originationCityAirportCode))

                        /** Code for the originating city or airport. */
                        @JsonProperty("origination_city_airport_code")
                        @ExcludeMissing
                        fun originationCityAirportCode(
                            originationCityAirportCode: JsonField<String>
                        ) = apply { this.originationCityAirportCode = originationCityAirportCode }

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyCode(travelAgencyCode: String) =
                            travelAgencyCode(JsonField.of(travelAgencyCode))

                        /**
                         * Code for the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_code")
                        @ExcludeMissing
                        fun travelAgencyCode(travelAgencyCode: JsonField<String>) = apply {
                            this.travelAgencyCode = travelAgencyCode
                        }

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        fun travelAgencyName(travelAgencyName: String) =
                            travelAgencyName(JsonField.of(travelAgencyName))

                        /**
                         * Name of the travel agency if the ticket was issued by a travel agency.
                         */
                        @JsonProperty("travel_agency_name")
                        @ExcludeMissing
                        fun travelAgencyName(travelAgencyName: JsonField<String>) = apply {
                            this.travelAgencyName = travelAgencyName
                        }

                        /** Indicates whether this ticket is non-refundable. */
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: RestrictedTicketIndicator
                        ) = restrictedTicketIndicator(JsonField.of(restrictedTicketIndicator))

                        /** Indicates whether this ticket is non-refundable. */
                        @JsonProperty("restricted_ticket_indicator")
                        @ExcludeMissing
                        fun restrictedTicketIndicator(
                            restrictedTicketIndicator: JsonField<RestrictedTicketIndicator>
                        ) = apply { this.restrictedTicketIndicator = restrictedTicketIndicator }

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        fun computerizedReservationSystem(computerizedReservationSystem: String) =
                            computerizedReservationSystem(
                                JsonField.of(computerizedReservationSystem)
                            )

                        /**
                         * Indicates the computerized reservation system used to book the ticket.
                         */
                        @JsonProperty("computerized_reservation_system")
                        @ExcludeMissing
                        fun computerizedReservationSystem(
                            computerizedReservationSystem: JsonField<String>
                        ) = apply {
                            this.computerizedReservationSystem = computerizedReservationSystem
                        }

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(creditReasonIndicator: CreditReasonIndicator) =
                            creditReasonIndicator(JsonField.of(creditReasonIndicator))

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun creditReasonIndicator(
                            creditReasonIndicator: JsonField<CreditReasonIndicator>
                        ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                        /** Indicates why a ticket was changed. */
                        fun ticketChangeIndicator(ticketChangeIndicator: TicketChangeIndicator) =
                            ticketChangeIndicator(JsonField.of(ticketChangeIndicator))

                        /** Indicates why a ticket was changed. */
                        @JsonProperty("ticket_change_indicator")
                        @ExcludeMissing
                        fun ticketChangeIndicator(
                            ticketChangeIndicator: JsonField<TicketChangeIndicator>
                        ) = apply { this.ticketChangeIndicator = ticketChangeIndicator }

                        /** Fields specific to each leg of the journey. */
                        fun tripLegs(tripLegs: List<TripLeg>) = tripLegs(JsonField.of(tripLegs))

                        /** Fields specific to each leg of the journey. */
                        @JsonProperty("trip_legs")
                        @ExcludeMissing
                        fun tripLegs(tripLegs: JsonField<List<TripLeg>>) = apply {
                            this.tripLegs = tripLegs
                        }

                        /** Ancillary purchases in addition to the airfare. */
                        fun ancillary(ancillary: Ancillary) = ancillary(JsonField.of(ancillary))

                        /** Ancillary purchases in addition to the airfare. */
                        @JsonProperty("ancillary")
                        @ExcludeMissing
                        fun ancillary(ancillary: JsonField<Ancillary>) = apply {
                            this.ancillary = ancillary
                        }

                        fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                            apply {
                                this.additionalProperties.clear()
                                this.additionalProperties.putAll(additionalProperties)
                            }

                        @JsonAnySetter
                        fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                            this.additionalProperties.put(key, value)
                        }

                        fun putAllAdditionalProperties(
                            additionalProperties: Map<String, JsonValue>
                        ) = apply { this.additionalProperties.putAll(additionalProperties) }

                        fun build(): Travel =
                            Travel(
                                ticketNumber,
                                passengerName,
                                departureDate,
                                originationCityAirportCode,
                                travelAgencyCode,
                                travelAgencyName,
                                restrictedTicketIndicator,
                                computerizedReservationSystem,
                                creditReasonIndicator,
                                ticketChangeIndicator,
                                tripLegs.map { it.toUnmodifiable() },
                                ancillary,
                                additionalProperties.toUnmodifiable(),
                            )
                    }

                    /** Ancillary purchases in addition to the airfare. */
                    @JsonDeserialize(builder = Ancillary.Builder::class)
                    @NoAutoDetect
                    class Ancillary
                    private constructor(
                        private val ticketDocumentNumber: JsonField<String>,
                        private val passengerNameOrDescription: JsonField<String>,
                        private val connectedTicketDocumentNumber: JsonField<String>,
                        private val creditReasonIndicator: JsonField<CreditReasonIndicator>,
                        private val services: JsonField<List<Service>>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Ticket document number. */
                        fun ticketDocumentNumber(): String? =
                            ticketDocumentNumber.getNullable("ticket_document_number")

                        /** Name of the passenger or description of the ancillary purchase. */
                        fun passengerNameOrDescription(): String? =
                            passengerNameOrDescription.getNullable("passenger_name_or_description")

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        fun connectedTicketDocumentNumber(): String? =
                            connectedTicketDocumentNumber.getNullable(
                                "connected_ticket_document_number"
                            )

                        /** Indicates the reason for a credit to the cardholder. */
                        fun creditReasonIndicator(): CreditReasonIndicator? =
                            creditReasonIndicator.getNullable("credit_reason_indicator")

                        /** Additional travel charges, such as baggage fees. */
                        fun services(): List<Service> = services.getRequired("services")

                        /** Ticket document number. */
                        @JsonProperty("ticket_document_number")
                        @ExcludeMissing
                        fun _ticketDocumentNumber() = ticketDocumentNumber

                        /** Name of the passenger or description of the ancillary purchase. */
                        @JsonProperty("passenger_name_or_description")
                        @ExcludeMissing
                        fun _passengerNameOrDescription() = passengerNameOrDescription

                        /**
                         * If this purchase has a connection or relationship to another purchase,
                         * such as a baggage fee for a passenger transport ticket, this field should
                         * contain the ticket document number for the other purchase.
                         */
                        @JsonProperty("connected_ticket_document_number")
                        @ExcludeMissing
                        fun _connectedTicketDocumentNumber() = connectedTicketDocumentNumber

                        /** Indicates the reason for a credit to the cardholder. */
                        @JsonProperty("credit_reason_indicator")
                        @ExcludeMissing
                        fun _creditReasonIndicator() = creditReasonIndicator

                        /** Additional travel charges, such as baggage fees. */
                        @JsonProperty("services") @ExcludeMissing fun _services() = services

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): Ancillary = apply {
                            if (!validated) {
                                ticketDocumentNumber()
                                passengerNameOrDescription()
                                connectedTicketDocumentNumber()
                                creditReasonIndicator()
                                services().forEach { it.validate() }
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is Ancillary &&
                                this.ticketDocumentNumber == other.ticketDocumentNumber &&
                                this.passengerNameOrDescription ==
                                    other.passengerNameOrDescription &&
                                this.connectedTicketDocumentNumber ==
                                    other.connectedTicketDocumentNumber &&
                                this.creditReasonIndicator == other.creditReasonIndicator &&
                                this.services == other.services &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        ticketDocumentNumber,
                                        passengerNameOrDescription,
                                        connectedTicketDocumentNumber,
                                        creditReasonIndicator,
                                        services,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "Ancillary{ticketDocumentNumber=$ticketDocumentNumber, passengerNameOrDescription=$passengerNameOrDescription, connectedTicketDocumentNumber=$connectedTicketDocumentNumber, creditReasonIndicator=$creditReasonIndicator, services=$services, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var ticketDocumentNumber: JsonField<String> = JsonMissing.of()
                            private var passengerNameOrDescription: JsonField<String> =
                                JsonMissing.of()
                            private var connectedTicketDocumentNumber: JsonField<String> =
                                JsonMissing.of()
                            private var creditReasonIndicator: JsonField<CreditReasonIndicator> =
                                JsonMissing.of()
                            private var services: JsonField<List<Service>> = JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(ancillary: Ancillary) = apply {
                                this.ticketDocumentNumber = ancillary.ticketDocumentNumber
                                this.passengerNameOrDescription =
                                    ancillary.passengerNameOrDescription
                                this.connectedTicketDocumentNumber =
                                    ancillary.connectedTicketDocumentNumber
                                this.creditReasonIndicator = ancillary.creditReasonIndicator
                                this.services = ancillary.services
                                additionalProperties(ancillary.additionalProperties)
                            }

                            /** Ticket document number. */
                            fun ticketDocumentNumber(ticketDocumentNumber: String) =
                                ticketDocumentNumber(JsonField.of(ticketDocumentNumber))

                            /** Ticket document number. */
                            @JsonProperty("ticket_document_number")
                            @ExcludeMissing
                            fun ticketDocumentNumber(ticketDocumentNumber: JsonField<String>) =
                                apply {
                                    this.ticketDocumentNumber = ticketDocumentNumber
                                }

                            /** Name of the passenger or description of the ancillary purchase. */
                            fun passengerNameOrDescription(passengerNameOrDescription: String) =
                                passengerNameOrDescription(JsonField.of(passengerNameOrDescription))

                            /** Name of the passenger or description of the ancillary purchase. */
                            @JsonProperty("passenger_name_or_description")
                            @ExcludeMissing
                            fun passengerNameOrDescription(
                                passengerNameOrDescription: JsonField<String>
                            ) = apply {
                                this.passengerNameOrDescription = passengerNameOrDescription
                            }

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: String
                            ) =
                                connectedTicketDocumentNumber(
                                    JsonField.of(connectedTicketDocumentNumber)
                                )

                            /**
                             * If this purchase has a connection or relationship to another
                             * purchase, such as a baggage fee for a passenger transport ticket,
                             * this field should contain the ticket document number for the other
                             * purchase.
                             */
                            @JsonProperty("connected_ticket_document_number")
                            @ExcludeMissing
                            fun connectedTicketDocumentNumber(
                                connectedTicketDocumentNumber: JsonField<String>
                            ) = apply {
                                this.connectedTicketDocumentNumber = connectedTicketDocumentNumber
                            }

                            /** Indicates the reason for a credit to the cardholder. */
                            fun creditReasonIndicator(
                                creditReasonIndicator: CreditReasonIndicator
                            ) = creditReasonIndicator(JsonField.of(creditReasonIndicator))

                            /** Indicates the reason for a credit to the cardholder. */
                            @JsonProperty("credit_reason_indicator")
                            @ExcludeMissing
                            fun creditReasonIndicator(
                                creditReasonIndicator: JsonField<CreditReasonIndicator>
                            ) = apply { this.creditReasonIndicator = creditReasonIndicator }

                            /** Additional travel charges, such as baggage fees. */
                            fun services(services: List<Service>) = services(JsonField.of(services))

                            /** Additional travel charges, such as baggage fees. */
                            @JsonProperty("services")
                            @ExcludeMissing
                            fun services(services: JsonField<List<Service>>) = apply {
                                this.services = services
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): Ancillary =
                                Ancillary(
                                    ticketDocumentNumber,
                                    passengerNameOrDescription,
                                    connectedTicketDocumentNumber,
                                    creditReasonIndicator,
                                    services.map { it.toUnmodifiable() },
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class CreditReasonIndicator
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is CreditReasonIndicator && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                                val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                    CreditReasonIndicator(
                                        JsonField.of(
                                            "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                        )
                                    )

                                val OTHER = CreditReasonIndicator(JsonField.of("other"))

                                fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                            }

                            enum class Known {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                            }

                            enum class Value {
                                NO_CREDIT,
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                                OTHER,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NO_CREDIT -> Value.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Value
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Value.OTHER
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NO_CREDIT -> Known.NO_CREDIT
                                    PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                        Known
                                            .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                    OTHER -> Known.OTHER
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown CreditReasonIndicator: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }

                        @JsonDeserialize(builder = Service.Builder::class)
                        @NoAutoDetect
                        class Service
                        private constructor(
                            private val category: JsonField<Category>,
                            private val subCategory: JsonField<String>,
                            private val additionalProperties: Map<String, JsonValue>,
                        ) {

                            private var validated: Boolean = false

                            private var hashCode: Int = 0

                            /** Category of the ancillary service. */
                            fun category(): Category? = category.getNullable("category")

                            /** Sub-category of the ancillary service, free-form. */
                            fun subCategory(): String? = subCategory.getNullable("sub_category")

                            /** Category of the ancillary service. */
                            @JsonProperty("category") @ExcludeMissing fun _category() = category

                            /** Sub-category of the ancillary service, free-form. */
                            @JsonProperty("sub_category")
                            @ExcludeMissing
                            fun _subCategory() = subCategory

                            @JsonAnyGetter
                            @ExcludeMissing
                            fun _additionalProperties(): Map<String, JsonValue> =
                                additionalProperties

                            fun validate(): Service = apply {
                                if (!validated) {
                                    category()
                                    subCategory()
                                    validated = true
                                }
                            }

                            fun toBuilder() = Builder().from(this)

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is Service &&
                                    this.category == other.category &&
                                    this.subCategory == other.subCategory &&
                                    this.additionalProperties == other.additionalProperties
                            }

                            override fun hashCode(): Int {
                                if (hashCode == 0) {
                                    hashCode =
                                        Objects.hash(
                                            category,
                                            subCategory,
                                            additionalProperties,
                                        )
                                }
                                return hashCode
                            }

                            override fun toString() =
                                "Service{category=$category, subCategory=$subCategory, additionalProperties=$additionalProperties}"

                            companion object {

                                fun builder() = Builder()
                            }

                            class Builder {

                                private var category: JsonField<Category> = JsonMissing.of()
                                private var subCategory: JsonField<String> = JsonMissing.of()
                                private var additionalProperties: MutableMap<String, JsonValue> =
                                    mutableMapOf()

                                internal fun from(service: Service) = apply {
                                    this.category = service.category
                                    this.subCategory = service.subCategory
                                    additionalProperties(service.additionalProperties)
                                }

                                /** Category of the ancillary service. */
                                fun category(category: Category) = category(JsonField.of(category))

                                /** Category of the ancillary service. */
                                @JsonProperty("category")
                                @ExcludeMissing
                                fun category(category: JsonField<Category>) = apply {
                                    this.category = category
                                }

                                /** Sub-category of the ancillary service, free-form. */
                                fun subCategory(subCategory: String) =
                                    subCategory(JsonField.of(subCategory))

                                /** Sub-category of the ancillary service, free-form. */
                                @JsonProperty("sub_category")
                                @ExcludeMissing
                                fun subCategory(subCategory: JsonField<String>) = apply {
                                    this.subCategory = subCategory
                                }

                                fun additionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                                @JsonAnySetter
                                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                    this.additionalProperties.put(key, value)
                                }

                                fun putAllAdditionalProperties(
                                    additionalProperties: Map<String, JsonValue>
                                ) = apply { this.additionalProperties.putAll(additionalProperties) }

                                fun build(): Service =
                                    Service(
                                        category,
                                        subCategory,
                                        additionalProperties.toUnmodifiable(),
                                    )
                            }

                            class Category
                            @JsonCreator
                            private constructor(
                                private val value: JsonField<String>,
                            ) {

                                @com.fasterxml.jackson.annotation.JsonValue
                                fun _value(): JsonField<String> = value

                                override fun equals(other: Any?): Boolean {
                                    if (this === other) {
                                        return true
                                    }

                                    return other is Category && this.value == other.value
                                }

                                override fun hashCode() = value.hashCode()

                                override fun toString() = value.toString()

                                companion object {

                                    val NONE = Category(JsonField.of("none"))

                                    val BUNDLED_SERVICE = Category(JsonField.of("bundled_service"))

                                    val BAGGAGE_FEE = Category(JsonField.of("baggage_fee"))

                                    val CHANGE_FEE = Category(JsonField.of("change_fee"))

                                    val CARGO = Category(JsonField.of("cargo"))

                                    val CARBON_OFFSET = Category(JsonField.of("carbon_offset"))

                                    val FREQUENT_FLYER = Category(JsonField.of("frequent_flyer"))

                                    val GIFT_CARD = Category(JsonField.of("gift_card"))

                                    val GROUND_TRANSPORT =
                                        Category(JsonField.of("ground_transport"))

                                    val IN_FLIGHT_ENTERTAINMENT =
                                        Category(JsonField.of("in_flight_entertainment"))

                                    val LOUNGE = Category(JsonField.of("lounge"))

                                    val MEDICAL = Category(JsonField.of("medical"))

                                    val MEAL_BEVERAGE = Category(JsonField.of("meal_beverage"))

                                    val OTHER = Category(JsonField.of("other"))

                                    val PASSENGER_ASSIST_FEE =
                                        Category(JsonField.of("passenger_assist_fee"))

                                    val PETS = Category(JsonField.of("pets"))

                                    val SEAT_FEES = Category(JsonField.of("seat_fees"))

                                    val STANDBY = Category(JsonField.of("standby"))

                                    val SERVICE_FEE = Category(JsonField.of("service_fee"))

                                    val STORE = Category(JsonField.of("store"))

                                    val TRAVEL_SERVICE = Category(JsonField.of("travel_service"))

                                    val UNACCOMPANIED_TRAVEL =
                                        Category(JsonField.of("unaccompanied_travel"))

                                    val UPGRADES = Category(JsonField.of("upgrades"))

                                    val WIFI = Category(JsonField.of("wifi"))

                                    fun of(value: String) = Category(JsonField.of(value))
                                }

                                enum class Known {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                }

                                enum class Value {
                                    NONE,
                                    BUNDLED_SERVICE,
                                    BAGGAGE_FEE,
                                    CHANGE_FEE,
                                    CARGO,
                                    CARBON_OFFSET,
                                    FREQUENT_FLYER,
                                    GIFT_CARD,
                                    GROUND_TRANSPORT,
                                    IN_FLIGHT_ENTERTAINMENT,
                                    LOUNGE,
                                    MEDICAL,
                                    MEAL_BEVERAGE,
                                    OTHER,
                                    PASSENGER_ASSIST_FEE,
                                    PETS,
                                    SEAT_FEES,
                                    STANDBY,
                                    SERVICE_FEE,
                                    STORE,
                                    TRAVEL_SERVICE,
                                    UNACCOMPANIED_TRAVEL,
                                    UPGRADES,
                                    WIFI,
                                    _UNKNOWN,
                                }

                                fun value(): Value =
                                    when (this) {
                                        NONE -> Value.NONE
                                        BUNDLED_SERVICE -> Value.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Value.BAGGAGE_FEE
                                        CHANGE_FEE -> Value.CHANGE_FEE
                                        CARGO -> Value.CARGO
                                        CARBON_OFFSET -> Value.CARBON_OFFSET
                                        FREQUENT_FLYER -> Value.FREQUENT_FLYER
                                        GIFT_CARD -> Value.GIFT_CARD
                                        GROUND_TRANSPORT -> Value.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Value.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Value.LOUNGE
                                        MEDICAL -> Value.MEDICAL
                                        MEAL_BEVERAGE -> Value.MEAL_BEVERAGE
                                        OTHER -> Value.OTHER
                                        PASSENGER_ASSIST_FEE -> Value.PASSENGER_ASSIST_FEE
                                        PETS -> Value.PETS
                                        SEAT_FEES -> Value.SEAT_FEES
                                        STANDBY -> Value.STANDBY
                                        SERVICE_FEE -> Value.SERVICE_FEE
                                        STORE -> Value.STORE
                                        TRAVEL_SERVICE -> Value.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Value.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Value.UPGRADES
                                        WIFI -> Value.WIFI
                                        else -> Value._UNKNOWN
                                    }

                                fun known(): Known =
                                    when (this) {
                                        NONE -> Known.NONE
                                        BUNDLED_SERVICE -> Known.BUNDLED_SERVICE
                                        BAGGAGE_FEE -> Known.BAGGAGE_FEE
                                        CHANGE_FEE -> Known.CHANGE_FEE
                                        CARGO -> Known.CARGO
                                        CARBON_OFFSET -> Known.CARBON_OFFSET
                                        FREQUENT_FLYER -> Known.FREQUENT_FLYER
                                        GIFT_CARD -> Known.GIFT_CARD
                                        GROUND_TRANSPORT -> Known.GROUND_TRANSPORT
                                        IN_FLIGHT_ENTERTAINMENT -> Known.IN_FLIGHT_ENTERTAINMENT
                                        LOUNGE -> Known.LOUNGE
                                        MEDICAL -> Known.MEDICAL
                                        MEAL_BEVERAGE -> Known.MEAL_BEVERAGE
                                        OTHER -> Known.OTHER
                                        PASSENGER_ASSIST_FEE -> Known.PASSENGER_ASSIST_FEE
                                        PETS -> Known.PETS
                                        SEAT_FEES -> Known.SEAT_FEES
                                        STANDBY -> Known.STANDBY
                                        SERVICE_FEE -> Known.SERVICE_FEE
                                        STORE -> Known.STORE
                                        TRAVEL_SERVICE -> Known.TRAVEL_SERVICE
                                        UNACCOMPANIED_TRAVEL -> Known.UNACCOMPANIED_TRAVEL
                                        UPGRADES -> Known.UPGRADES
                                        WIFI -> Known.WIFI
                                        else ->
                                            throw IncreaseInvalidDataException(
                                                "Unknown Category: $value"
                                            )
                                    }

                                fun asString(): String = _value().asStringOrThrow()
                            }
                        }
                    }

                    class CreditReasonIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is CreditReasonIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_CREDIT = CreditReasonIndicator(JsonField.of("no_credit"))

                            val PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION =
                                CreditReasonIndicator(
                                    JsonField.of(
                                        "airline_ticket_and_passenger_transport_ancillary_purchase_cancellation"
                                    )
                                )

                            val AIRLINE_TICKET_CANCELLATION =
                                CreditReasonIndicator(JsonField.of("airline_ticket_cancellation"))

                            val OTHER = CreditReasonIndicator(JsonField.of("other"))

                            val PARTIAL_REFUND_OF_AIRLINE_TICKET =
                                CreditReasonIndicator(
                                    JsonField.of("partial_refund_of_airline_ticket")
                                )

                            fun of(value: String) = CreditReasonIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                        }

                        enum class Value {
                            NO_CREDIT,
                            PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION,
                            AIRLINE_TICKET_CANCELLATION,
                            OTHER,
                            PARTIAL_REFUND_OF_AIRLINE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_CREDIT -> Value.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Value
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Value.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Value.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Value.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_CREDIT -> Known.NO_CREDIT
                                PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known.PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION ->
                                    Known
                                        .AIRLINE_TICKET_AND_PASSENGER_TRANSPORT_ANCILLARY_PURCHASE_CANCELLATION
                                AIRLINE_TICKET_CANCELLATION -> Known.AIRLINE_TICKET_CANCELLATION
                                OTHER -> Known.OTHER
                                PARTIAL_REFUND_OF_AIRLINE_TICKET ->
                                    Known.PARTIAL_REFUND_OF_AIRLINE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown CreditReasonIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class RestrictedTicketIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is RestrictedTicketIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NO_RESTRICTIONS =
                                RestrictedTicketIndicator(JsonField.of("no_restrictions"))

                            val RESTRICTED_NON_REFUNDABLE_TICKET =
                                RestrictedTicketIndicator(
                                    JsonField.of("restricted_non_refundable_ticket")
                                )

                            fun of(value: String) = RestrictedTicketIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                        }

                        enum class Value {
                            NO_RESTRICTIONS,
                            RESTRICTED_NON_REFUNDABLE_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NO_RESTRICTIONS -> Value.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Value.RESTRICTED_NON_REFUNDABLE_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NO_RESTRICTIONS -> Known.NO_RESTRICTIONS
                                RESTRICTED_NON_REFUNDABLE_TICKET ->
                                    Known.RESTRICTED_NON_REFUNDABLE_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown RestrictedTicketIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    class TicketChangeIndicator
                    @JsonCreator
                    private constructor(
                        private val value: JsonField<String>,
                    ) {

                        @com.fasterxml.jackson.annotation.JsonValue
                        fun _value(): JsonField<String> = value

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TicketChangeIndicator && this.value == other.value
                        }

                        override fun hashCode() = value.hashCode()

                        override fun toString() = value.toString()

                        companion object {

                            val NONE = TicketChangeIndicator(JsonField.of("none"))

                            val CHANGE_TO_EXISTING_TICKET =
                                TicketChangeIndicator(JsonField.of("change_to_existing_ticket"))

                            val NEW_TICKET = TicketChangeIndicator(JsonField.of("new_ticket"))

                            fun of(value: String) = TicketChangeIndicator(JsonField.of(value))
                        }

                        enum class Known {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                        }

                        enum class Value {
                            NONE,
                            CHANGE_TO_EXISTING_TICKET,
                            NEW_TICKET,
                            _UNKNOWN,
                        }

                        fun value(): Value =
                            when (this) {
                                NONE -> Value.NONE
                                CHANGE_TO_EXISTING_TICKET -> Value.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Value.NEW_TICKET
                                else -> Value._UNKNOWN
                            }

                        fun known(): Known =
                            when (this) {
                                NONE -> Known.NONE
                                CHANGE_TO_EXISTING_TICKET -> Known.CHANGE_TO_EXISTING_TICKET
                                NEW_TICKET -> Known.NEW_TICKET
                                else ->
                                    throw IncreaseInvalidDataException(
                                        "Unknown TicketChangeIndicator: $value"
                                    )
                            }

                        fun asString(): String = _value().asStringOrThrow()
                    }

                    @JsonDeserialize(builder = TripLeg.Builder::class)
                    @NoAutoDetect
                    class TripLeg
                    private constructor(
                        private val flightNumber: JsonField<String>,
                        private val carrierCode: JsonField<String>,
                        private val fareBasisCode: JsonField<String>,
                        private val serviceClass: JsonField<String>,
                        private val stopOverCode: JsonField<StopOverCode>,
                        private val destinationCityAirportCode: JsonField<String>,
                        private val additionalProperties: Map<String, JsonValue>,
                    ) {

                        private var validated: Boolean = false

                        private var hashCode: Int = 0

                        /** Flight number. */
                        fun flightNumber(): String? = flightNumber.getNullable("flight_number")

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        fun carrierCode(): String? = carrierCode.getNullable("carrier_code")

                        /** Fare basis code. */
                        fun fareBasisCode(): String? = fareBasisCode.getNullable("fare_basis_code")

                        /** Service class (e.g., first class, business class, etc.). */
                        fun serviceClass(): String? = serviceClass.getNullable("service_class")

                        /** Indicates whether a stopover is allowed on this ticket. */
                        fun stopOverCode(): StopOverCode? =
                            stopOverCode.getNullable("stop_over_code")

                        /** Code for the destination city or airport. */
                        fun destinationCityAirportCode(): String? =
                            destinationCityAirportCode.getNullable("destination_city_airport_code")

                        /** Flight number. */
                        @JsonProperty("flight_number")
                        @ExcludeMissing
                        fun _flightNumber() = flightNumber

                        /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                        @JsonProperty("carrier_code")
                        @ExcludeMissing
                        fun _carrierCode() = carrierCode

                        /** Fare basis code. */
                        @JsonProperty("fare_basis_code")
                        @ExcludeMissing
                        fun _fareBasisCode() = fareBasisCode

                        /** Service class (e.g., first class, business class, etc.). */
                        @JsonProperty("service_class")
                        @ExcludeMissing
                        fun _serviceClass() = serviceClass

                        /** Indicates whether a stopover is allowed on this ticket. */
                        @JsonProperty("stop_over_code")
                        @ExcludeMissing
                        fun _stopOverCode() = stopOverCode

                        /** Code for the destination city or airport. */
                        @JsonProperty("destination_city_airport_code")
                        @ExcludeMissing
                        fun _destinationCityAirportCode() = destinationCityAirportCode

                        @JsonAnyGetter
                        @ExcludeMissing
                        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                        fun validate(): TripLeg = apply {
                            if (!validated) {
                                flightNumber()
                                carrierCode()
                                fareBasisCode()
                                serviceClass()
                                stopOverCode()
                                destinationCityAirportCode()
                                validated = true
                            }
                        }

                        fun toBuilder() = Builder().from(this)

                        override fun equals(other: Any?): Boolean {
                            if (this === other) {
                                return true
                            }

                            return other is TripLeg &&
                                this.flightNumber == other.flightNumber &&
                                this.carrierCode == other.carrierCode &&
                                this.fareBasisCode == other.fareBasisCode &&
                                this.serviceClass == other.serviceClass &&
                                this.stopOverCode == other.stopOverCode &&
                                this.destinationCityAirportCode ==
                                    other.destinationCityAirportCode &&
                                this.additionalProperties == other.additionalProperties
                        }

                        override fun hashCode(): Int {
                            if (hashCode == 0) {
                                hashCode =
                                    Objects.hash(
                                        flightNumber,
                                        carrierCode,
                                        fareBasisCode,
                                        serviceClass,
                                        stopOverCode,
                                        destinationCityAirportCode,
                                        additionalProperties,
                                    )
                            }
                            return hashCode
                        }

                        override fun toString() =
                            "TripLeg{flightNumber=$flightNumber, carrierCode=$carrierCode, fareBasisCode=$fareBasisCode, serviceClass=$serviceClass, stopOverCode=$stopOverCode, destinationCityAirportCode=$destinationCityAirportCode, additionalProperties=$additionalProperties}"

                        companion object {

                            fun builder() = Builder()
                        }

                        class Builder {

                            private var flightNumber: JsonField<String> = JsonMissing.of()
                            private var carrierCode: JsonField<String> = JsonMissing.of()
                            private var fareBasisCode: JsonField<String> = JsonMissing.of()
                            private var serviceClass: JsonField<String> = JsonMissing.of()
                            private var stopOverCode: JsonField<StopOverCode> = JsonMissing.of()
                            private var destinationCityAirportCode: JsonField<String> =
                                JsonMissing.of()
                            private var additionalProperties: MutableMap<String, JsonValue> =
                                mutableMapOf()

                            internal fun from(tripLeg: TripLeg) = apply {
                                this.flightNumber = tripLeg.flightNumber
                                this.carrierCode = tripLeg.carrierCode
                                this.fareBasisCode = tripLeg.fareBasisCode
                                this.serviceClass = tripLeg.serviceClass
                                this.stopOverCode = tripLeg.stopOverCode
                                this.destinationCityAirportCode = tripLeg.destinationCityAirportCode
                                additionalProperties(tripLeg.additionalProperties)
                            }

                            /** Flight number. */
                            fun flightNumber(flightNumber: String) =
                                flightNumber(JsonField.of(flightNumber))

                            /** Flight number. */
                            @JsonProperty("flight_number")
                            @ExcludeMissing
                            fun flightNumber(flightNumber: JsonField<String>) = apply {
                                this.flightNumber = flightNumber
                            }

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            fun carrierCode(carrierCode: String) =
                                carrierCode(JsonField.of(carrierCode))

                            /** Carrier code (e.g., United Airlines, Jet Blue, etc.). */
                            @JsonProperty("carrier_code")
                            @ExcludeMissing
                            fun carrierCode(carrierCode: JsonField<String>) = apply {
                                this.carrierCode = carrierCode
                            }

                            /** Fare basis code. */
                            fun fareBasisCode(fareBasisCode: String) =
                                fareBasisCode(JsonField.of(fareBasisCode))

                            /** Fare basis code. */
                            @JsonProperty("fare_basis_code")
                            @ExcludeMissing
                            fun fareBasisCode(fareBasisCode: JsonField<String>) = apply {
                                this.fareBasisCode = fareBasisCode
                            }

                            /** Service class (e.g., first class, business class, etc.). */
                            fun serviceClass(serviceClass: String) =
                                serviceClass(JsonField.of(serviceClass))

                            /** Service class (e.g., first class, business class, etc.). */
                            @JsonProperty("service_class")
                            @ExcludeMissing
                            fun serviceClass(serviceClass: JsonField<String>) = apply {
                                this.serviceClass = serviceClass
                            }

                            /** Indicates whether a stopover is allowed on this ticket. */
                            fun stopOverCode(stopOverCode: StopOverCode) =
                                stopOverCode(JsonField.of(stopOverCode))

                            /** Indicates whether a stopover is allowed on this ticket. */
                            @JsonProperty("stop_over_code")
                            @ExcludeMissing
                            fun stopOverCode(stopOverCode: JsonField<StopOverCode>) = apply {
                                this.stopOverCode = stopOverCode
                            }

                            /** Code for the destination city or airport. */
                            fun destinationCityAirportCode(destinationCityAirportCode: String) =
                                destinationCityAirportCode(JsonField.of(destinationCityAirportCode))

                            /** Code for the destination city or airport. */
                            @JsonProperty("destination_city_airport_code")
                            @ExcludeMissing
                            fun destinationCityAirportCode(
                                destinationCityAirportCode: JsonField<String>
                            ) = apply {
                                this.destinationCityAirportCode = destinationCityAirportCode
                            }

                            fun additionalProperties(additionalProperties: Map<String, JsonValue>) =
                                apply {
                                    this.additionalProperties.clear()
                                    this.additionalProperties.putAll(additionalProperties)
                                }

                            @JsonAnySetter
                            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                                this.additionalProperties.put(key, value)
                            }

                            fun putAllAdditionalProperties(
                                additionalProperties: Map<String, JsonValue>
                            ) = apply { this.additionalProperties.putAll(additionalProperties) }

                            fun build(): TripLeg =
                                TripLeg(
                                    flightNumber,
                                    carrierCode,
                                    fareBasisCode,
                                    serviceClass,
                                    stopOverCode,
                                    destinationCityAirportCode,
                                    additionalProperties.toUnmodifiable(),
                                )
                        }

                        class StopOverCode
                        @JsonCreator
                        private constructor(
                            private val value: JsonField<String>,
                        ) {

                            @com.fasterxml.jackson.annotation.JsonValue
                            fun _value(): JsonField<String> = value

                            override fun equals(other: Any?): Boolean {
                                if (this === other) {
                                    return true
                                }

                                return other is StopOverCode && this.value == other.value
                            }

                            override fun hashCode() = value.hashCode()

                            override fun toString() = value.toString()

                            companion object {

                                val NONE = StopOverCode(JsonField.of("none"))

                                val STOP_OVER_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_allowed"))

                                val STOP_OVER_NOT_ALLOWED =
                                    StopOverCode(JsonField.of("stop_over_not_allowed"))

                                fun of(value: String) = StopOverCode(JsonField.of(value))
                            }

                            enum class Known {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                            }

                            enum class Value {
                                NONE,
                                STOP_OVER_ALLOWED,
                                STOP_OVER_NOT_ALLOWED,
                                _UNKNOWN,
                            }

                            fun value(): Value =
                                when (this) {
                                    NONE -> Value.NONE
                                    STOP_OVER_ALLOWED -> Value.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Value.STOP_OVER_NOT_ALLOWED
                                    else -> Value._UNKNOWN
                                }

                            fun known(): Known =
                                when (this) {
                                    NONE -> Known.NONE
                                    STOP_OVER_ALLOWED -> Known.STOP_OVER_ALLOWED
                                    STOP_OVER_NOT_ALLOWED -> Known.STOP_OVER_NOT_ALLOWED
                                    else ->
                                        throw IncreaseInvalidDataException(
                                            "Unknown StopOverCode: $value"
                                        )
                                }

                            fun asString(): String = _value().asStringOrThrow()
                        }
                    }
                }
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

                    val CARD_SETTLEMENT = Type(JsonField.of("card_settlement"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CARD_SETTLEMENT,
                }

                enum class Value {
                    CARD_SETTLEMENT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && this.value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()

            companion object {

                val ACCOUNT_TRANSFER_INTENTION =
                    Category(JsonField.of("account_transfer_intention"))

                val ACH_TRANSFER_INTENTION = Category(JsonField.of("ach_transfer_intention"))

                val ACH_TRANSFER_REJECTION = Category(JsonField.of("ach_transfer_rejection"))

                val ACH_TRANSFER_RETURN = Category(JsonField.of("ach_transfer_return"))

                val CARD_DISPUTE_ACCEPTANCE = Category(JsonField.of("card_dispute_acceptance"))

                val CARD_REFUND = Category(JsonField.of("card_refund"))

                val CARD_REVENUE_PAYMENT = Category(JsonField.of("card_revenue_payment"))

                val CARD_SETTLEMENT = Category(JsonField.of("card_settlement"))

                val CHECK_DEPOSIT_ACCEPTANCE = Category(JsonField.of("check_deposit_acceptance"))

                val CHECK_DEPOSIT_RETURN = Category(JsonField.of("check_deposit_return"))

                val CHECK_TRANSFER_DEPOSIT = Category(JsonField.of("check_transfer_deposit"))

                val CHECK_TRANSFER_INTENTION = Category(JsonField.of("check_transfer_intention"))

                val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                    Category(JsonField.of("check_transfer_stop_payment_request"))

                val FEE_PAYMENT = Category(JsonField.of("fee_payment"))

                val INBOUND_ACH_TRANSFER = Category(JsonField.of("inbound_ach_transfer"))

                val INBOUND_ACH_TRANSFER_RETURN_INTENTION =
                    Category(JsonField.of("inbound_ach_transfer_return_intention"))

                val INBOUND_CHECK = Category(JsonField.of("inbound_check"))

                val INBOUND_INTERNATIONAL_ACH_TRANSFER =
                    Category(JsonField.of("inbound_international_ach_transfer"))

                val INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION =
                    Category(JsonField.of("inbound_real_time_payments_transfer_confirmation"))

                val INBOUND_WIRE_DRAWDOWN_PAYMENT =
                    Category(JsonField.of("inbound_wire_drawdown_payment"))

                val INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL =
                    Category(JsonField.of("inbound_wire_drawdown_payment_reversal"))

                val INBOUND_WIRE_REVERSAL = Category(JsonField.of("inbound_wire_reversal"))

                val INBOUND_WIRE_TRANSFER = Category(JsonField.of("inbound_wire_transfer"))

                val INTEREST_PAYMENT = Category(JsonField.of("interest_payment"))

                val INTERNAL_SOURCE = Category(JsonField.of("internal_source"))

                val REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT =
                    Category(JsonField.of("real_time_payments_transfer_acknowledgement"))

                val SAMPLE_FUNDS = Category(JsonField.of("sample_funds"))

                val WIRE_TRANSFER_INTENTION = Category(JsonField.of("wire_transfer_intention"))

                val WIRE_TRANSFER_REJECTION = Category(JsonField.of("wire_transfer_rejection"))

                val OTHER = Category(JsonField.of("other"))

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_REFUND,
                CARD_REVENUE_PAYMENT,
                CARD_SETTLEMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                CHECK_TRANSFER_INTENTION,
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK,
                INBOUND_INTERNATIONAL_ACH_TRANSFER,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_WIRE_DRAWDOWN_PAYMENT,
                INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
            }

            enum class Value {
                ACCOUNT_TRANSFER_INTENTION,
                ACH_TRANSFER_INTENTION,
                ACH_TRANSFER_REJECTION,
                ACH_TRANSFER_RETURN,
                CARD_DISPUTE_ACCEPTANCE,
                CARD_REFUND,
                CARD_REVENUE_PAYMENT,
                CARD_SETTLEMENT,
                CHECK_DEPOSIT_ACCEPTANCE,
                CHECK_DEPOSIT_RETURN,
                CHECK_TRANSFER_DEPOSIT,
                CHECK_TRANSFER_INTENTION,
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                FEE_PAYMENT,
                INBOUND_ACH_TRANSFER,
                INBOUND_ACH_TRANSFER_RETURN_INTENTION,
                INBOUND_CHECK,
                INBOUND_INTERNATIONAL_ACH_TRANSFER,
                INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION,
                INBOUND_WIRE_DRAWDOWN_PAYMENT,
                INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL,
                INBOUND_WIRE_REVERSAL,
                INBOUND_WIRE_TRANSFER,
                INTEREST_PAYMENT,
                INTERNAL_SOURCE,
                REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT,
                SAMPLE_FUNDS,
                WIRE_TRANSFER_INTENTION,
                WIRE_TRANSFER_REJECTION,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Value.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Value.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Value.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Value.ACH_TRANSFER_RETURN
                    CARD_DISPUTE_ACCEPTANCE -> Value.CARD_DISPUTE_ACCEPTANCE
                    CARD_REFUND -> Value.CARD_REFUND
                    CARD_REVENUE_PAYMENT -> Value.CARD_REVENUE_PAYMENT
                    CARD_SETTLEMENT -> Value.CARD_SETTLEMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Value.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Value.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                    CHECK_TRANSFER_INTENTION -> Value.CHECK_TRANSFER_INTENTION
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    FEE_PAYMENT -> Value.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Value.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Value.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK -> Value.INBOUND_CHECK
                    INBOUND_INTERNATIONAL_ACH_TRANSFER -> Value.INBOUND_INTERNATIONAL_ACH_TRANSFER
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Value.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_WIRE_DRAWDOWN_PAYMENT -> Value.INBOUND_WIRE_DRAWDOWN_PAYMENT
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                        Value.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                    INBOUND_WIRE_REVERSAL -> Value.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Value.INBOUND_WIRE_TRANSFER
                    INTEREST_PAYMENT -> Value.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Value.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Value.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Value.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Value.WIRE_TRANSFER_REJECTION
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_TRANSFER_INTENTION -> Known.ACCOUNT_TRANSFER_INTENTION
                    ACH_TRANSFER_INTENTION -> Known.ACH_TRANSFER_INTENTION
                    ACH_TRANSFER_REJECTION -> Known.ACH_TRANSFER_REJECTION
                    ACH_TRANSFER_RETURN -> Known.ACH_TRANSFER_RETURN
                    CARD_DISPUTE_ACCEPTANCE -> Known.CARD_DISPUTE_ACCEPTANCE
                    CARD_REFUND -> Known.CARD_REFUND
                    CARD_REVENUE_PAYMENT -> Known.CARD_REVENUE_PAYMENT
                    CARD_SETTLEMENT -> Known.CARD_SETTLEMENT
                    CHECK_DEPOSIT_ACCEPTANCE -> Known.CHECK_DEPOSIT_ACCEPTANCE
                    CHECK_DEPOSIT_RETURN -> Known.CHECK_DEPOSIT_RETURN
                    CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                    CHECK_TRANSFER_INTENTION -> Known.CHECK_TRANSFER_INTENTION
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    FEE_PAYMENT -> Known.FEE_PAYMENT
                    INBOUND_ACH_TRANSFER -> Known.INBOUND_ACH_TRANSFER
                    INBOUND_ACH_TRANSFER_RETURN_INTENTION ->
                        Known.INBOUND_ACH_TRANSFER_RETURN_INTENTION
                    INBOUND_CHECK -> Known.INBOUND_CHECK
                    INBOUND_INTERNATIONAL_ACH_TRANSFER -> Known.INBOUND_INTERNATIONAL_ACH_TRANSFER
                    INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION ->
                        Known.INBOUND_REAL_TIME_PAYMENTS_TRANSFER_CONFIRMATION
                    INBOUND_WIRE_DRAWDOWN_PAYMENT -> Known.INBOUND_WIRE_DRAWDOWN_PAYMENT
                    INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL ->
                        Known.INBOUND_WIRE_DRAWDOWN_PAYMENT_REVERSAL
                    INBOUND_WIRE_REVERSAL -> Known.INBOUND_WIRE_REVERSAL
                    INBOUND_WIRE_TRANSFER -> Known.INBOUND_WIRE_TRANSFER
                    INTEREST_PAYMENT -> Known.INTEREST_PAYMENT
                    INTERNAL_SOURCE -> Known.INTERNAL_SOURCE
                    REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT ->
                        Known.REAL_TIME_PAYMENTS_TRANSFER_ACKNOWLEDGEMENT
                    SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                    WIRE_TRANSFER_INTENTION -> Known.WIRE_TRANSFER_INTENTION
                    WIRE_TRANSFER_REJECTION -> Known.WIRE_TRANSFER_REJECTION
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }

        /**
         * A Check Deposit Acceptance object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_acceptance`.
         */
        @JsonDeserialize(builder = CheckDepositAcceptance.Builder::class)
        @NoAutoDetect
        class CheckDepositAcceptance
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val accountNumber: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val auxiliaryOnUs: JsonField<String>,
            private val serialNumber: JsonField<String>,
            private val checkDepositId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The account number printed on the check. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /** The routing number printed on the check. */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            fun auxiliaryOnUs(): String? = auxiliaryOnUs.getNullable("auxiliary_on_us")

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            fun serialNumber(): String? = serialNumber.getNullable("serial_number")

            /** The ID of the Check Deposit that was accepted. */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The amount to be deposited in the minor unit of the transaction's currency. For
             * dollars, for example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The account number printed on the check. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /** The routing number printed on the check. */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /**
             * An additional line of metadata printed on the check. This typically includes the
             * check number for business checks.
             */
            @JsonProperty("auxiliary_on_us") @ExcludeMissing fun _auxiliaryOnUs() = auxiliaryOnUs

            /**
             * The check serial number, if present, for consumer checks. For business checks, the
             * serial number is usually in the `auxiliary_on_us` field.
             */
            @JsonProperty("serial_number") @ExcludeMissing fun _serialNumber() = serialNumber

            /** The ID of the Check Deposit that was accepted. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositAcceptance = apply {
                if (!validated) {
                    amount()
                    currency()
                    accountNumber()
                    routingNumber()
                    auxiliaryOnUs()
                    serialNumber()
                    checkDepositId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDepositAcceptance &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.accountNumber == other.accountNumber &&
                    this.routingNumber == other.routingNumber &&
                    this.auxiliaryOnUs == other.auxiliaryOnUs &&
                    this.serialNumber == other.serialNumber &&
                    this.checkDepositId == other.checkDepositId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            accountNumber,
                            routingNumber,
                            auxiliaryOnUs,
                            serialNumber,
                            checkDepositId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositAcceptance{amount=$amount, currency=$currency, accountNumber=$accountNumber, routingNumber=$routingNumber, auxiliaryOnUs=$auxiliaryOnUs, serialNumber=$serialNumber, checkDepositId=$checkDepositId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var auxiliaryOnUs: JsonField<String> = JsonMissing.of()
                private var serialNumber: JsonField<String> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkDepositAcceptance: CheckDepositAcceptance) = apply {
                    this.amount = checkDepositAcceptance.amount
                    this.currency = checkDepositAcceptance.currency
                    this.accountNumber = checkDepositAcceptance.accountNumber
                    this.routingNumber = checkDepositAcceptance.routingNumber
                    this.auxiliaryOnUs = checkDepositAcceptance.auxiliaryOnUs
                    this.serialNumber = checkDepositAcceptance.serialNumber
                    this.checkDepositId = checkDepositAcceptance.checkDepositId
                    additionalProperties(checkDepositAcceptance.additionalProperties)
                }

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount to be deposited in the minor unit of the transaction's currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The account number printed on the check. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The account number printed on the check. */
                @JsonProperty("account_number")
                @ExcludeMissing
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The routing number printed on the check. */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /** The routing number printed on the check. */
                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                fun auxiliaryOnUs(auxiliaryOnUs: String) =
                    auxiliaryOnUs(JsonField.of(auxiliaryOnUs))

                /**
                 * An additional line of metadata printed on the check. This typically includes the
                 * check number for business checks.
                 */
                @JsonProperty("auxiliary_on_us")
                @ExcludeMissing
                fun auxiliaryOnUs(auxiliaryOnUs: JsonField<String>) = apply {
                    this.auxiliaryOnUs = auxiliaryOnUs
                }

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                fun serialNumber(serialNumber: String) = serialNumber(JsonField.of(serialNumber))

                /**
                 * The check serial number, if present, for consumer checks. For business checks,
                 * the serial number is usually in the `auxiliary_on_us` field.
                 */
                @JsonProperty("serial_number")
                @ExcludeMissing
                fun serialNumber(serialNumber: JsonField<String>) = apply {
                    this.serialNumber = serialNumber
                }

                /** The ID of the Check Deposit that was accepted. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The ID of the Check Deposit that was accepted. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckDepositAcceptance =
                    CheckDepositAcceptance(
                        amount,
                        currency,
                        accountNumber,
                        routingNumber,
                        auxiliaryOnUs,
                        serialNumber,
                        checkDepositId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * A Check Deposit Return object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_deposit_return`.
         */
        @JsonDeserialize(builder = CheckDepositReturn.Builder::class)
        @NoAutoDetect
        class CheckDepositReturn
        private constructor(
            private val amount: JsonField<Long>,
            private val returnedAt: JsonField<OffsetDateTime>,
            private val currency: JsonField<Currency>,
            private val checkDepositId: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val returnReason: JsonField<ReturnReason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The identifier of the Check Deposit that was returned. */
            fun checkDepositId(): String = checkDepositId.getRequired("check_deposit_id")

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            fun transactionId(): String = transactionId.getRequired("transaction_id")

            fun returnReason(): ReturnReason = returnReason.getRequired("return_reason")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check deposit was returned.
             */
            @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The identifier of the Check Deposit that was returned. */
            @JsonProperty("check_deposit_id") @ExcludeMissing fun _checkDepositId() = checkDepositId

            /**
             * The identifier of the transaction that reversed the original check deposit
             * transaction.
             */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            @JsonProperty("return_reason") @ExcludeMissing fun _returnReason() = returnReason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckDepositReturn = apply {
                if (!validated) {
                    amount()
                    returnedAt()
                    currency()
                    checkDepositId()
                    transactionId()
                    returnReason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckDepositReturn &&
                    this.amount == other.amount &&
                    this.returnedAt == other.returnedAt &&
                    this.currency == other.currency &&
                    this.checkDepositId == other.checkDepositId &&
                    this.transactionId == other.transactionId &&
                    this.returnReason == other.returnReason &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            returnedAt,
                            currency,
                            checkDepositId,
                            transactionId,
                            returnReason,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckDepositReturn{amount=$amount, returnedAt=$returnedAt, currency=$currency, checkDepositId=$checkDepositId, transactionId=$transactionId, returnReason=$returnReason, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var checkDepositId: JsonField<String> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var returnReason: JsonField<ReturnReason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkDepositReturn: CheckDepositReturn) = apply {
                    this.amount = checkDepositReturn.amount
                    this.returnedAt = checkDepositReturn.returnedAt
                    this.currency = checkDepositReturn.currency
                    this.checkDepositId = checkDepositReturn.checkDepositId
                    this.transactionId = checkDepositReturn.transactionId
                    this.returnReason = checkDepositReturn.returnReason
                    additionalProperties(checkDepositReturn.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * check deposit was returned.
                 */
                @JsonProperty("returned_at")
                @ExcludeMissing
                fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                    this.returnedAt = returnedAt
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The identifier of the Check Deposit that was returned. */
                fun checkDepositId(checkDepositId: String) =
                    checkDepositId(JsonField.of(checkDepositId))

                /** The identifier of the Check Deposit that was returned. */
                @JsonProperty("check_deposit_id")
                @ExcludeMissing
                fun checkDepositId(checkDepositId: JsonField<String>) = apply {
                    this.checkDepositId = checkDepositId
                }

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the transaction that reversed the original check deposit
                 * transaction.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                fun returnReason(returnReason: ReturnReason) =
                    returnReason(JsonField.of(returnReason))

                @JsonProperty("return_reason")
                @ExcludeMissing
                fun returnReason(returnReason: JsonField<ReturnReason>) = apply {
                    this.returnReason = returnReason
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckDepositReturn =
                    CheckDepositReturn(
                        amount,
                        returnedAt,
                        currency,
                        checkDepositId,
                        transactionId,
                        returnReason,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            class ReturnReason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is ReturnReason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACH_CONVERSION_NOT_SUPPORTED =
                        ReturnReason(JsonField.of("ach_conversion_not_supported"))

                    val CLOSED_ACCOUNT = ReturnReason(JsonField.of("closed_account"))

                    val DUPLICATE_SUBMISSION = ReturnReason(JsonField.of("duplicate_submission"))

                    val INSUFFICIENT_FUNDS = ReturnReason(JsonField.of("insufficient_funds"))

                    val NO_ACCOUNT = ReturnReason(JsonField.of("no_account"))

                    val NOT_AUTHORIZED = ReturnReason(JsonField.of("not_authorized"))

                    val STALE_DATED = ReturnReason(JsonField.of("stale_dated"))

                    val STOP_PAYMENT = ReturnReason(JsonField.of("stop_payment"))

                    val UNKNOWN_REASON = ReturnReason(JsonField.of("unknown_reason"))

                    val UNMATCHED_DETAILS = ReturnReason(JsonField.of("unmatched_details"))

                    val UNREADABLE_IMAGE = ReturnReason(JsonField.of("unreadable_image"))

                    val ENDORSEMENT_IRREGULAR = ReturnReason(JsonField.of("endorsement_irregular"))

                    fun of(value: String) = ReturnReason(JsonField.of(value))
                }

                enum class Known {
                    ACH_CONVERSION_NOT_SUPPORTED,
                    CLOSED_ACCOUNT,
                    DUPLICATE_SUBMISSION,
                    INSUFFICIENT_FUNDS,
                    NO_ACCOUNT,
                    NOT_AUTHORIZED,
                    STALE_DATED,
                    STOP_PAYMENT,
                    UNKNOWN_REASON,
                    UNMATCHED_DETAILS,
                    UNREADABLE_IMAGE,
                    ENDORSEMENT_IRREGULAR,
                }

                enum class Value {
                    ACH_CONVERSION_NOT_SUPPORTED,
                    CLOSED_ACCOUNT,
                    DUPLICATE_SUBMISSION,
                    INSUFFICIENT_FUNDS,
                    NO_ACCOUNT,
                    NOT_AUTHORIZED,
                    STALE_DATED,
                    STOP_PAYMENT,
                    UNKNOWN_REASON,
                    UNMATCHED_DETAILS,
                    UNREADABLE_IMAGE,
                    ENDORSEMENT_IRREGULAR,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACH_CONVERSION_NOT_SUPPORTED -> Value.ACH_CONVERSION_NOT_SUPPORTED
                        CLOSED_ACCOUNT -> Value.CLOSED_ACCOUNT
                        DUPLICATE_SUBMISSION -> Value.DUPLICATE_SUBMISSION
                        INSUFFICIENT_FUNDS -> Value.INSUFFICIENT_FUNDS
                        NO_ACCOUNT -> Value.NO_ACCOUNT
                        NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                        STALE_DATED -> Value.STALE_DATED
                        STOP_PAYMENT -> Value.STOP_PAYMENT
                        UNKNOWN_REASON -> Value.UNKNOWN_REASON
                        UNMATCHED_DETAILS -> Value.UNMATCHED_DETAILS
                        UNREADABLE_IMAGE -> Value.UNREADABLE_IMAGE
                        ENDORSEMENT_IRREGULAR -> Value.ENDORSEMENT_IRREGULAR
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACH_CONVERSION_NOT_SUPPORTED -> Known.ACH_CONVERSION_NOT_SUPPORTED
                        CLOSED_ACCOUNT -> Known.CLOSED_ACCOUNT
                        DUPLICATE_SUBMISSION -> Known.DUPLICATE_SUBMISSION
                        INSUFFICIENT_FUNDS -> Known.INSUFFICIENT_FUNDS
                        NO_ACCOUNT -> Known.NO_ACCOUNT
                        NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                        STALE_DATED -> Known.STALE_DATED
                        STOP_PAYMENT -> Known.STOP_PAYMENT
                        UNKNOWN_REASON -> Known.UNKNOWN_REASON
                        UNMATCHED_DETAILS -> Known.UNMATCHED_DETAILS
                        UNREADABLE_IMAGE -> Known.UNREADABLE_IMAGE
                        ENDORSEMENT_IRREGULAR -> Known.ENDORSEMENT_IRREGULAR
                        else -> throw IncreaseInvalidDataException("Unknown ReturnReason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Check Transfer Deposit object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_deposit`.
         */
        @JsonDeserialize(builder = CheckTransferDeposit.Builder::class)
        @NoAutoDetect
        class CheckTransferDeposit
        private constructor(
            private val depositedAt: JsonField<OffsetDateTime>,
            private val transactionId: JsonField<String>,
            private val frontImageFileId: JsonField<String>,
            private val backImageFileId: JsonField<String>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** When the check was deposited. */
            fun depositedAt(): OffsetDateTime = depositedAt.getRequired("deposited_at")

            /** The identifier of the Transaction object created when the check was deposited. */
            fun transactionId(): String? = transactionId.getNullable("transaction_id")

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            fun frontImageFileId(): String? = frontImageFileId.getNullable("front_image_file_id")

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
             */
            fun type(): Type = type.getRequired("type")

            /** When the check was deposited. */
            @JsonProperty("deposited_at") @ExcludeMissing fun _depositedAt() = depositedAt

            /** The identifier of the Transaction object created when the check was deposited. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /**
             * The identifier of the API File object containing an image of the front of the
             * deposited check.
             */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun _frontImageFileId() = frontImageFileId

            /**
             * The identifier of the API File object containing an image of the back of the
             * deposited check.
             */
            @JsonProperty("back_image_file_id")
            @ExcludeMissing
            fun _backImageFileId() = backImageFileId

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_deposit`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckTransferDeposit = apply {
                if (!validated) {
                    depositedAt()
                    transactionId()
                    frontImageFileId()
                    backImageFileId()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckTransferDeposit &&
                    this.depositedAt == other.depositedAt &&
                    this.transactionId == other.transactionId &&
                    this.frontImageFileId == other.frontImageFileId &&
                    this.backImageFileId == other.backImageFileId &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            depositedAt,
                            transactionId,
                            frontImageFileId,
                            backImageFileId,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckTransferDeposit{depositedAt=$depositedAt, transactionId=$transactionId, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var depositedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var frontImageFileId: JsonField<String> = JsonMissing.of()
                private var backImageFileId: JsonField<String> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkTransferDeposit: CheckTransferDeposit) = apply {
                    this.depositedAt = checkTransferDeposit.depositedAt
                    this.transactionId = checkTransferDeposit.transactionId
                    this.frontImageFileId = checkTransferDeposit.frontImageFileId
                    this.backImageFileId = checkTransferDeposit.backImageFileId
                    this.type = checkTransferDeposit.type
                    additionalProperties(checkTransferDeposit.additionalProperties)
                }

                /** When the check was deposited. */
                fun depositedAt(depositedAt: OffsetDateTime) =
                    depositedAt(JsonField.of(depositedAt))

                /** When the check was deposited. */
                @JsonProperty("deposited_at")
                @ExcludeMissing
                fun depositedAt(depositedAt: JsonField<OffsetDateTime>) = apply {
                    this.depositedAt = depositedAt
                }

                /**
                 * The identifier of the Transaction object created when the check was deposited.
                 */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /**
                 * The identifier of the Transaction object created when the check was deposited.
                 */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * deposited check.
                 */
                fun frontImageFileId(frontImageFileId: String) =
                    frontImageFileId(JsonField.of(frontImageFileId))

                /**
                 * The identifier of the API File object containing an image of the front of the
                 * deposited check.
                 */
                @JsonProperty("front_image_file_id")
                @ExcludeMissing
                fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                    this.frontImageFileId = frontImageFileId
                }

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * deposited check.
                 */
                fun backImageFileId(backImageFileId: String) =
                    backImageFileId(JsonField.of(backImageFileId))

                /**
                 * The identifier of the API File object containing an image of the back of the
                 * deposited check.
                 */
                @JsonProperty("back_image_file_id")
                @ExcludeMissing
                fun backImageFileId(backImageFileId: JsonField<String>) = apply {
                    this.backImageFileId = backImageFileId
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_deposit`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_deposit`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckTransferDeposit =
                    CheckTransferDeposit(
                        depositedAt,
                        transactionId,
                        frontImageFileId,
                        backImageFileId,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
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

                    val CHECK_TRANSFER_DEPOSIT = Type(JsonField.of("check_transfer_deposit"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CHECK_TRANSFER_DEPOSIT,
                }

                enum class Value {
                    CHECK_TRANSFER_DEPOSIT,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CHECK_TRANSFER_DEPOSIT -> Value.CHECK_TRANSFER_DEPOSIT
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CHECK_TRANSFER_DEPOSIT -> Known.CHECK_TRANSFER_DEPOSIT
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Check Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `check_transfer_intention`.
         */
        @JsonDeserialize(builder = CheckTransferIntention.Builder::class)
        @NoAutoDetect
        class CheckTransferIntention
        private constructor(
            private val addressLine1: JsonField<String>,
            private val addressLine2: JsonField<String>,
            private val addressCity: JsonField<String>,
            private val addressState: JsonField<String>,
            private val addressZip: JsonField<String>,
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val recipientName: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The street address of the check's destination. */
            fun addressLine1(): String? = addressLine1.getNullable("address_line1")

            /** The second line of the address of the check's destination. */
            fun addressLine2(): String? = addressLine2.getNullable("address_line2")

            /** The city of the check's destination. */
            fun addressCity(): String? = addressCity.getNullable("address_city")

            /** The state of the check's destination. */
            fun addressState(): String? = addressState.getNullable("address_state")

            /** The postal code of the check's destination. */
            fun addressZip(): String? = addressZip.getNullable("address_zip")

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The name that will be printed on the check. */
            fun recipientName(): String? = recipientName.getNullable("recipient_name")

            /** The identifier of the Check Transfer with which this is associated. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The street address of the check's destination. */
            @JsonProperty("address_line1") @ExcludeMissing fun _addressLine1() = addressLine1

            /** The second line of the address of the check's destination. */
            @JsonProperty("address_line2") @ExcludeMissing fun _addressLine2() = addressLine2

            /** The city of the check's destination. */
            @JsonProperty("address_city") @ExcludeMissing fun _addressCity() = addressCity

            /** The state of the check's destination. */
            @JsonProperty("address_state") @ExcludeMissing fun _addressState() = addressState

            /** The postal code of the check's destination. */
            @JsonProperty("address_zip") @ExcludeMissing fun _addressZip() = addressZip

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The name that will be printed on the check. */
            @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

            /** The identifier of the Check Transfer with which this is associated. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckTransferIntention = apply {
                if (!validated) {
                    addressLine1()
                    addressLine2()
                    addressCity()
                    addressState()
                    addressZip()
                    amount()
                    currency()
                    recipientName()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckTransferIntention &&
                    this.addressLine1 == other.addressLine1 &&
                    this.addressLine2 == other.addressLine2 &&
                    this.addressCity == other.addressCity &&
                    this.addressState == other.addressState &&
                    this.addressZip == other.addressZip &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.recipientName == other.recipientName &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            addressLine1,
                            addressLine2,
                            addressCity,
                            addressState,
                            addressZip,
                            amount,
                            currency,
                            recipientName,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckTransferIntention{addressLine1=$addressLine1, addressLine2=$addressLine2, addressCity=$addressCity, addressState=$addressState, addressZip=$addressZip, amount=$amount, currency=$currency, recipientName=$recipientName, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var addressLine1: JsonField<String> = JsonMissing.of()
                private var addressLine2: JsonField<String> = JsonMissing.of()
                private var addressCity: JsonField<String> = JsonMissing.of()
                private var addressState: JsonField<String> = JsonMissing.of()
                private var addressZip: JsonField<String> = JsonMissing.of()
                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var recipientName: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(checkTransferIntention: CheckTransferIntention) = apply {
                    this.addressLine1 = checkTransferIntention.addressLine1
                    this.addressLine2 = checkTransferIntention.addressLine2
                    this.addressCity = checkTransferIntention.addressCity
                    this.addressState = checkTransferIntention.addressState
                    this.addressZip = checkTransferIntention.addressZip
                    this.amount = checkTransferIntention.amount
                    this.currency = checkTransferIntention.currency
                    this.recipientName = checkTransferIntention.recipientName
                    this.transferId = checkTransferIntention.transferId
                    additionalProperties(checkTransferIntention.additionalProperties)
                }

                /** The street address of the check's destination. */
                fun addressLine1(addressLine1: String) = addressLine1(JsonField.of(addressLine1))

                /** The street address of the check's destination. */
                @JsonProperty("address_line1")
                @ExcludeMissing
                fun addressLine1(addressLine1: JsonField<String>) = apply {
                    this.addressLine1 = addressLine1
                }

                /** The second line of the address of the check's destination. */
                fun addressLine2(addressLine2: String) = addressLine2(JsonField.of(addressLine2))

                /** The second line of the address of the check's destination. */
                @JsonProperty("address_line2")
                @ExcludeMissing
                fun addressLine2(addressLine2: JsonField<String>) = apply {
                    this.addressLine2 = addressLine2
                }

                /** The city of the check's destination. */
                fun addressCity(addressCity: String) = addressCity(JsonField.of(addressCity))

                /** The city of the check's destination. */
                @JsonProperty("address_city")
                @ExcludeMissing
                fun addressCity(addressCity: JsonField<String>) = apply {
                    this.addressCity = addressCity
                }

                /** The state of the check's destination. */
                fun addressState(addressState: String) = addressState(JsonField.of(addressState))

                /** The state of the check's destination. */
                @JsonProperty("address_state")
                @ExcludeMissing
                fun addressState(addressState: JsonField<String>) = apply {
                    this.addressState = addressState
                }

                /** The postal code of the check's destination. */
                fun addressZip(addressZip: String) = addressZip(JsonField.of(addressZip))

                /** The postal code of the check's destination. */
                @JsonProperty("address_zip")
                @ExcludeMissing
                fun addressZip(addressZip: JsonField<String>) = apply {
                    this.addressZip = addressZip
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
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
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The name that will be printed on the check. */
                fun recipientName(recipientName: String) =
                    recipientName(JsonField.of(recipientName))

                /** The name that will be printed on the check. */
                @JsonProperty("recipient_name")
                @ExcludeMissing
                fun recipientName(recipientName: JsonField<String>) = apply {
                    this.recipientName = recipientName
                }

                /** The identifier of the Check Transfer with which this is associated. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The identifier of the Check Transfer with which this is associated. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckTransferIntention =
                    CheckTransferIntention(
                        addressLine1,
                        addressLine2,
                        addressCity,
                        addressState,
                        addressZip,
                        amount,
                        currency,
                        recipientName,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * A Check Transfer Stop Payment Request object. This field will be present in the JSON
         * response if and only if `category` is equal to `check_transfer_stop_payment_request`.
         */
        @JsonDeserialize(builder = CheckTransferStopPaymentRequest.Builder::class)
        @NoAutoDetect
        class CheckTransferStopPaymentRequest
        private constructor(
            private val transferId: JsonField<String>,
            private val reason: JsonField<Reason>,
            private val requestedAt: JsonField<OffsetDateTime>,
            private val type: JsonField<Type>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The ID of the check transfer that was stopped. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The reason why this transfer was stopped. */
            fun reason(): Reason = reason.getRequired("reason")

            /** The time the stop-payment was requested. */
            fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_stop_payment_request`.
             */
            fun type(): Type = type.getRequired("type")

            /** The ID of the check transfer that was stopped. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            /** The reason why this transfer was stopped. */
            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            /** The time the stop-payment was requested. */
            @JsonProperty("requested_at") @ExcludeMissing fun _requestedAt() = requestedAt

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_stop_payment_request`.
             */
            @JsonProperty("type") @ExcludeMissing fun _type() = type

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): CheckTransferStopPaymentRequest = apply {
                if (!validated) {
                    transferId()
                    reason()
                    requestedAt()
                    type()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is CheckTransferStopPaymentRequest &&
                    this.transferId == other.transferId &&
                    this.reason == other.reason &&
                    this.requestedAt == other.requestedAt &&
                    this.type == other.type &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            transferId,
                            reason,
                            requestedAt,
                            type,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "CheckTransferStopPaymentRequest{transferId=$transferId, reason=$reason, requestedAt=$requestedAt, type=$type, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var transferId: JsonField<String> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var type: JsonField<Type> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    checkTransferStopPaymentRequest: CheckTransferStopPaymentRequest
                ) = apply {
                    this.transferId = checkTransferStopPaymentRequest.transferId
                    this.reason = checkTransferStopPaymentRequest.reason
                    this.requestedAt = checkTransferStopPaymentRequest.requestedAt
                    this.type = checkTransferStopPaymentRequest.type
                    additionalProperties(checkTransferStopPaymentRequest.additionalProperties)
                }

                /** The ID of the check transfer that was stopped. */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /** The ID of the check transfer that was stopped. */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                /** The reason why this transfer was stopped. */
                fun reason(reason: Reason) = reason(JsonField.of(reason))

                /** The reason why this transfer was stopped. */
                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                /** The time the stop-payment was requested. */
                fun requestedAt(requestedAt: OffsetDateTime) =
                    requestedAt(JsonField.of(requestedAt))

                /** The time the stop-payment was requested. */
                @JsonProperty("requested_at")
                @ExcludeMissing
                fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
                    this.requestedAt = requestedAt
                }

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_stop_payment_request`.
                 */
                fun type(type: Type) = type(JsonField.of(type))

                /**
                 * A constant representing the object's type. For this resource it will always be
                 * `check_transfer_stop_payment_request`.
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

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): CheckTransferStopPaymentRequest =
                    CheckTransferStopPaymentRequest(
                        transferId,
                        reason,
                        requestedAt,
                        type,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val MAIL_DELIVERY_FAILED = Reason(JsonField.of("mail_delivery_failed"))

                    val REJECTED_BY_INCREASE = Reason(JsonField.of("rejected_by_increase"))

                    val UNKNOWN = Reason(JsonField.of("unknown"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    MAIL_DELIVERY_FAILED,
                    REJECTED_BY_INCREASE,
                    UNKNOWN,
                }

                enum class Value {
                    MAIL_DELIVERY_FAILED,
                    REJECTED_BY_INCREASE,
                    UNKNOWN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        MAIL_DELIVERY_FAILED -> Value.MAIL_DELIVERY_FAILED
                        REJECTED_BY_INCREASE -> Value.REJECTED_BY_INCREASE
                        UNKNOWN -> Value.UNKNOWN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        MAIL_DELIVERY_FAILED -> Known.MAIL_DELIVERY_FAILED
                        REJECTED_BY_INCREASE -> Known.REJECTED_BY_INCREASE
                        UNKNOWN -> Known.UNKNOWN
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

                    val CHECK_TRANSFER_STOP_PAYMENT_REQUEST =
                        Type(JsonField.of("check_transfer_stop_payment_request"))

                    fun of(value: String) = Type(JsonField.of(value))
                }

                enum class Known {
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                }

                enum class Value {
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                            Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        CHECK_TRANSFER_STOP_PAYMENT_REQUEST ->
                            Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                        else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Fee Payment object. This field will be present in the JSON response if and only if
         * `category` is equal to `fee_payment`.
         */
        @JsonDeserialize(builder = FeePayment.Builder::class)
        @NoAutoDetect
        class FeePayment
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val feePeriodStart: JsonField<LocalDate>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The start of this payment's fee period, usually the first day of a month. */
            fun feePeriodStart(): LocalDate = feePeriodStart.getRequired("fee_period_start")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The start of this payment's fee period, usually the first day of a month. */
            @JsonProperty("fee_period_start") @ExcludeMissing fun _feePeriodStart() = feePeriodStart

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): FeePayment = apply {
                if (!validated) {
                    amount()
                    currency()
                    feePeriodStart()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is FeePayment &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.feePeriodStart == other.feePeriodStart &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            feePeriodStart,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "FeePayment{amount=$amount, currency=$currency, feePeriodStart=$feePeriodStart, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var feePeriodStart: JsonField<LocalDate> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(feePayment: FeePayment) = apply {
                    this.amount = feePayment.amount
                    this.currency = feePayment.currency
                    this.feePeriodStart = feePayment.feePeriodStart
                    additionalProperties(feePayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The start of this payment's fee period, usually the first day of a month. */
                fun feePeriodStart(feePeriodStart: LocalDate) =
                    feePeriodStart(JsonField.of(feePeriodStart))

                /** The start of this payment's fee period, usually the first day of a month. */
                @JsonProperty("fee_period_start")
                @ExcludeMissing
                fun feePeriodStart(feePeriodStart: JsonField<LocalDate>) = apply {
                    this.feePeriodStart = feePeriodStart
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): FeePayment =
                    FeePayment(
                        amount,
                        currency,
                        feePeriodStart,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * An Inbound ACH Transfer Intention object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_ach_transfer`.
         */
        @JsonDeserialize(builder = InboundAchTransfer.Builder::class)
        @NoAutoDetect
        class InboundAchTransfer
        private constructor(
            private val amount: JsonField<Long>,
            private val originatorCompanyName: JsonField<String>,
            private val originatorCompanyDescriptiveDate: JsonField<String>,
            private val originatorCompanyDiscretionaryData: JsonField<String>,
            private val originatorCompanyEntryDescription: JsonField<String>,
            private val originatorCompanyId: JsonField<String>,
            private val receiverIdNumber: JsonField<String>,
            private val receiverName: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun originatorCompanyName(): String =
                originatorCompanyName.getRequired("originator_company_name")

            fun originatorCompanyDescriptiveDate(): String? =
                originatorCompanyDescriptiveDate.getNullable("originator_company_descriptive_date")

            fun originatorCompanyDiscretionaryData(): String? =
                originatorCompanyDiscretionaryData.getNullable(
                    "originator_company_discretionary_data"
                )

            fun originatorCompanyEntryDescription(): String =
                originatorCompanyEntryDescription.getRequired(
                    "originator_company_entry_description"
                )

            fun originatorCompanyId(): String =
                originatorCompanyId.getRequired("originator_company_id")

            fun receiverIdNumber(): String? = receiverIdNumber.getNullable("receiver_id_number")

            fun receiverName(): String? = receiverName.getNullable("receiver_name")

            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("originator_company_name")
            @ExcludeMissing
            fun _originatorCompanyName() = originatorCompanyName

            @JsonProperty("originator_company_descriptive_date")
            @ExcludeMissing
            fun _originatorCompanyDescriptiveDate() = originatorCompanyDescriptiveDate

            @JsonProperty("originator_company_discretionary_data")
            @ExcludeMissing
            fun _originatorCompanyDiscretionaryData() = originatorCompanyDiscretionaryData

            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            @JsonProperty("originator_company_id")
            @ExcludeMissing
            fun _originatorCompanyId() = originatorCompanyId

            @JsonProperty("receiver_id_number")
            @ExcludeMissing
            fun _receiverIdNumber() = receiverIdNumber

            @JsonProperty("receiver_name") @ExcludeMissing fun _receiverName() = receiverName

            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundAchTransfer = apply {
                if (!validated) {
                    amount()
                    originatorCompanyName()
                    originatorCompanyDescriptiveDate()
                    originatorCompanyDiscretionaryData()
                    originatorCompanyEntryDescription()
                    originatorCompanyId()
                    receiverIdNumber()
                    receiverName()
                    traceNumber()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundAchTransfer &&
                    this.amount == other.amount &&
                    this.originatorCompanyName == other.originatorCompanyName &&
                    this.originatorCompanyDescriptiveDate ==
                        other.originatorCompanyDescriptiveDate &&
                    this.originatorCompanyDiscretionaryData ==
                        other.originatorCompanyDiscretionaryData &&
                    this.originatorCompanyEntryDescription ==
                        other.originatorCompanyEntryDescription &&
                    this.originatorCompanyId == other.originatorCompanyId &&
                    this.receiverIdNumber == other.receiverIdNumber &&
                    this.receiverName == other.receiverName &&
                    this.traceNumber == other.traceNumber &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            originatorCompanyName,
                            originatorCompanyDescriptiveDate,
                            originatorCompanyDiscretionaryData,
                            originatorCompanyEntryDescription,
                            originatorCompanyId,
                            receiverIdNumber,
                            receiverName,
                            traceNumber,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundAchTransfer{amount=$amount, originatorCompanyName=$originatorCompanyName, originatorCompanyDescriptiveDate=$originatorCompanyDescriptiveDate, originatorCompanyDiscretionaryData=$originatorCompanyDiscretionaryData, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCompanyId=$originatorCompanyId, receiverIdNumber=$receiverIdNumber, receiverName=$receiverName, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var originatorCompanyName: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDescriptiveDate: JsonField<String> = JsonMissing.of()
                private var originatorCompanyDiscretionaryData: JsonField<String> = JsonMissing.of()
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
                private var originatorCompanyId: JsonField<String> = JsonMissing.of()
                private var receiverIdNumber: JsonField<String> = JsonMissing.of()
                private var receiverName: JsonField<String> = JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundAchTransfer: InboundAchTransfer) = apply {
                    this.amount = inboundAchTransfer.amount
                    this.originatorCompanyName = inboundAchTransfer.originatorCompanyName
                    this.originatorCompanyDescriptiveDate =
                        inboundAchTransfer.originatorCompanyDescriptiveDate
                    this.originatorCompanyDiscretionaryData =
                        inboundAchTransfer.originatorCompanyDiscretionaryData
                    this.originatorCompanyEntryDescription =
                        inboundAchTransfer.originatorCompanyEntryDescription
                    this.originatorCompanyId = inboundAchTransfer.originatorCompanyId
                    this.receiverIdNumber = inboundAchTransfer.receiverIdNumber
                    this.receiverName = inboundAchTransfer.receiverName
                    this.traceNumber = inboundAchTransfer.traceNumber
                    additionalProperties(inboundAchTransfer.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun originatorCompanyName(originatorCompanyName: String) =
                    originatorCompanyName(JsonField.of(originatorCompanyName))

                @JsonProperty("originator_company_name")
                @ExcludeMissing
                fun originatorCompanyName(originatorCompanyName: JsonField<String>) = apply {
                    this.originatorCompanyName = originatorCompanyName
                }

                fun originatorCompanyDescriptiveDate(originatorCompanyDescriptiveDate: String) =
                    originatorCompanyDescriptiveDate(JsonField.of(originatorCompanyDescriptiveDate))

                @JsonProperty("originator_company_descriptive_date")
                @ExcludeMissing
                fun originatorCompanyDescriptiveDate(
                    originatorCompanyDescriptiveDate: JsonField<String>
                ) = apply {
                    this.originatorCompanyDescriptiveDate = originatorCompanyDescriptiveDate
                }

                fun originatorCompanyDiscretionaryData(originatorCompanyDiscretionaryData: String) =
                    originatorCompanyDiscretionaryData(
                        JsonField.of(originatorCompanyDiscretionaryData)
                    )

                @JsonProperty("originator_company_discretionary_data")
                @ExcludeMissing
                fun originatorCompanyDiscretionaryData(
                    originatorCompanyDiscretionaryData: JsonField<String>
                ) = apply {
                    this.originatorCompanyDiscretionaryData = originatorCompanyDiscretionaryData
                }

                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                    originatorCompanyEntryDescription(
                        JsonField.of(originatorCompanyEntryDescription)
                    )

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun originatorCompanyEntryDescription(
                    originatorCompanyEntryDescription: JsonField<String>
                ) = apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

                fun originatorCompanyId(originatorCompanyId: String) =
                    originatorCompanyId(JsonField.of(originatorCompanyId))

                @JsonProperty("originator_company_id")
                @ExcludeMissing
                fun originatorCompanyId(originatorCompanyId: JsonField<String>) = apply {
                    this.originatorCompanyId = originatorCompanyId
                }

                fun receiverIdNumber(receiverIdNumber: String) =
                    receiverIdNumber(JsonField.of(receiverIdNumber))

                @JsonProperty("receiver_id_number")
                @ExcludeMissing
                fun receiverIdNumber(receiverIdNumber: JsonField<String>) = apply {
                    this.receiverIdNumber = receiverIdNumber
                }

                fun receiverName(receiverName: String) = receiverName(JsonField.of(receiverName))

                @JsonProperty("receiver_name")
                @ExcludeMissing
                fun receiverName(receiverName: JsonField<String>) = apply {
                    this.receiverName = receiverName
                }

                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundAchTransfer =
                    InboundAchTransfer(
                        amount,
                        originatorCompanyName,
                        originatorCompanyDescriptiveDate,
                        originatorCompanyDiscretionaryData,
                        originatorCompanyEntryDescription,
                        originatorCompanyId,
                        receiverIdNumber,
                        receiverName,
                        traceNumber,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Check object. This field will be present in the JSON response if and only if
         * `category` is equal to `inbound_check`.
         */
        @JsonDeserialize(builder = InboundCheck.Builder::class)
        @NoAutoDetect
        class InboundCheck
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val checkNumber: JsonField<String>,
            private val checkFrontImageFileId: JsonField<String>,
            private val checkRearImageFileId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            fun checkNumber(): String? = checkNumber.getNullable("check_number")

            fun checkFrontImageFileId(): String? =
                checkFrontImageFileId.getNullable("check_front_image_file_id")

            fun checkRearImageFileId(): String? =
                checkRearImageFileId.getNullable("check_rear_image_file_id")

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

            @JsonProperty("check_front_image_file_id")
            @ExcludeMissing
            fun _checkFrontImageFileId() = checkFrontImageFileId

            @JsonProperty("check_rear_image_file_id")
            @ExcludeMissing
            fun _checkRearImageFileId() = checkRearImageFileId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundCheck = apply {
                if (!validated) {
                    amount()
                    currency()
                    checkNumber()
                    checkFrontImageFileId()
                    checkRearImageFileId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundCheck &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.checkNumber == other.checkNumber &&
                    this.checkFrontImageFileId == other.checkFrontImageFileId &&
                    this.checkRearImageFileId == other.checkRearImageFileId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            checkNumber,
                            checkFrontImageFileId,
                            checkRearImageFileId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundCheck{amount=$amount, currency=$currency, checkNumber=$checkNumber, checkFrontImageFileId=$checkFrontImageFileId, checkRearImageFileId=$checkRearImageFileId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var checkNumber: JsonField<String> = JsonMissing.of()
                private var checkFrontImageFileId: JsonField<String> = JsonMissing.of()
                private var checkRearImageFileId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundCheck: InboundCheck) = apply {
                    this.amount = inboundCheck.amount
                    this.currency = inboundCheck.currency
                    this.checkNumber = inboundCheck.checkNumber
                    this.checkFrontImageFileId = inboundCheck.checkFrontImageFileId
                    this.checkRearImageFileId = inboundCheck.checkRearImageFileId
                    additionalProperties(inboundCheck.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction's
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

                @JsonProperty("check_number")
                @ExcludeMissing
                fun checkNumber(checkNumber: JsonField<String>) = apply {
                    this.checkNumber = checkNumber
                }

                fun checkFrontImageFileId(checkFrontImageFileId: String) =
                    checkFrontImageFileId(JsonField.of(checkFrontImageFileId))

                @JsonProperty("check_front_image_file_id")
                @ExcludeMissing
                fun checkFrontImageFileId(checkFrontImageFileId: JsonField<String>) = apply {
                    this.checkFrontImageFileId = checkFrontImageFileId
                }

                fun checkRearImageFileId(checkRearImageFileId: String) =
                    checkRearImageFileId(JsonField.of(checkRearImageFileId))

                @JsonProperty("check_rear_image_file_id")
                @ExcludeMissing
                fun checkRearImageFileId(checkRearImageFileId: JsonField<String>) = apply {
                    this.checkRearImageFileId = checkRearImageFileId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundCheck =
                    InboundCheck(
                        amount,
                        currency,
                        checkNumber,
                        checkFrontImageFileId,
                        checkRearImageFileId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * An Inbound International ACH Transfer object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_international_ach_transfer`.
         */
        @JsonDeserialize(builder = InboundInternationalAchTransfer.Builder::class)
        @NoAutoDetect
        class InboundInternationalAchTransfer
        private constructor(
            private val amount: JsonField<Long>,
            private val foreignExchangeIndicator: JsonField<String>,
            private val foreignExchangeReferenceIndicator: JsonField<String>,
            private val foreignExchangeReference: JsonField<String>,
            private val destinationCountryCode: JsonField<String>,
            private val destinationCurrencyCode: JsonField<String>,
            private val foreignPaymentAmount: JsonField<Long>,
            private val foreignTraceNumber: JsonField<String>,
            private val internationalTransactionTypeCode: JsonField<String>,
            private val originatingCurrencyCode: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionName: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionId: JsonField<String>,
            private val originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>,
            private val originatorCity: JsonField<String>,
            private val originatorCompanyEntryDescription: JsonField<String>,
            private val originatorCountry: JsonField<String>,
            private val originatorIdentification: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorPostalCode: JsonField<String>,
            private val originatorStreetAddress: JsonField<String>,
            private val originatorStateOrProvince: JsonField<String>,
            private val paymentRelatedInformation: JsonField<String>,
            private val paymentRelatedInformation2: JsonField<String>,
            private val receiverIdentificationNumber: JsonField<String>,
            private val receiverStreetAddress: JsonField<String>,
            private val receiverCity: JsonField<String>,
            private val receiverStateOrProvince: JsonField<String>,
            private val receiverCountry: JsonField<String>,
            private val receiverPostalCode: JsonField<String>,
            private val receivingCompanyOrIndividualName: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionName: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionId: JsonField<String>,
            private val receivingDepositoryFinancialInstitutionCountry: JsonField<String>,
            private val traceNumber: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun foreignExchangeIndicator(): String =
                foreignExchangeIndicator.getRequired("foreign_exchange_indicator")

            fun foreignExchangeReferenceIndicator(): String =
                foreignExchangeReferenceIndicator.getRequired(
                    "foreign_exchange_reference_indicator"
                )

            fun foreignExchangeReference(): String? =
                foreignExchangeReference.getNullable("foreign_exchange_reference")

            fun destinationCountryCode(): String =
                destinationCountryCode.getRequired("destination_country_code")

            fun destinationCurrencyCode(): String =
                destinationCurrencyCode.getRequired("destination_currency_code")

            fun foreignPaymentAmount(): Long =
                foreignPaymentAmount.getRequired("foreign_payment_amount")

            fun foreignTraceNumber(): String? =
                foreignTraceNumber.getNullable("foreign_trace_number")

            fun internationalTransactionTypeCode(): String =
                internationalTransactionTypeCode.getRequired("international_transaction_type_code")

            fun originatingCurrencyCode(): String =
                originatingCurrencyCode.getRequired("originating_currency_code")

            fun originatingDepositoryFinancialInstitutionName(): String =
                originatingDepositoryFinancialInstitutionName.getRequired(
                    "originating_depository_financial_institution_name"
                )

            fun originatingDepositoryFinancialInstitutionIdQualifier(): String =
                originatingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "originating_depository_financial_institution_id_qualifier"
                )

            fun originatingDepositoryFinancialInstitutionId(): String =
                originatingDepositoryFinancialInstitutionId.getRequired(
                    "originating_depository_financial_institution_id"
                )

            fun originatingDepositoryFinancialInstitutionBranchCountry(): String =
                originatingDepositoryFinancialInstitutionBranchCountry.getRequired(
                    "originating_depository_financial_institution_branch_country"
                )

            fun originatorCity(): String = originatorCity.getRequired("originator_city")

            fun originatorCompanyEntryDescription(): String =
                originatorCompanyEntryDescription.getRequired(
                    "originator_company_entry_description"
                )

            fun originatorCountry(): String = originatorCountry.getRequired("originator_country")

            fun originatorIdentification(): String =
                originatorIdentification.getRequired("originator_identification")

            fun originatorName(): String = originatorName.getRequired("originator_name")

            fun originatorPostalCode(): String? =
                originatorPostalCode.getNullable("originator_postal_code")

            fun originatorStreetAddress(): String =
                originatorStreetAddress.getRequired("originator_street_address")

            fun originatorStateOrProvince(): String? =
                originatorStateOrProvince.getNullable("originator_state_or_province")

            fun paymentRelatedInformation(): String? =
                paymentRelatedInformation.getNullable("payment_related_information")

            fun paymentRelatedInformation2(): String? =
                paymentRelatedInformation2.getNullable("payment_related_information2")

            fun receiverIdentificationNumber(): String? =
                receiverIdentificationNumber.getNullable("receiver_identification_number")

            fun receiverStreetAddress(): String =
                receiverStreetAddress.getRequired("receiver_street_address")

            fun receiverCity(): String = receiverCity.getRequired("receiver_city")

            fun receiverStateOrProvince(): String? =
                receiverStateOrProvince.getNullable("receiver_state_or_province")

            fun receiverCountry(): String = receiverCountry.getRequired("receiver_country")

            fun receiverPostalCode(): String? =
                receiverPostalCode.getNullable("receiver_postal_code")

            fun receivingCompanyOrIndividualName(): String =
                receivingCompanyOrIndividualName.getRequired("receiving_company_or_individual_name")

            fun receivingDepositoryFinancialInstitutionName(): String =
                receivingDepositoryFinancialInstitutionName.getRequired(
                    "receiving_depository_financial_institution_name"
                )

            fun receivingDepositoryFinancialInstitutionIdQualifier(): String =
                receivingDepositoryFinancialInstitutionIdQualifier.getRequired(
                    "receiving_depository_financial_institution_id_qualifier"
                )

            fun receivingDepositoryFinancialInstitutionId(): String =
                receivingDepositoryFinancialInstitutionId.getRequired(
                    "receiving_depository_financial_institution_id"
                )

            fun receivingDepositoryFinancialInstitutionCountry(): String =
                receivingDepositoryFinancialInstitutionCountry.getRequired(
                    "receiving_depository_financial_institution_country"
                )

            fun traceNumber(): String = traceNumber.getRequired("trace_number")

            /**
             * The amount in the minor unit of the destination account currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("foreign_exchange_indicator")
            @ExcludeMissing
            fun _foreignExchangeIndicator() = foreignExchangeIndicator

            @JsonProperty("foreign_exchange_reference_indicator")
            @ExcludeMissing
            fun _foreignExchangeReferenceIndicator() = foreignExchangeReferenceIndicator

            @JsonProperty("foreign_exchange_reference")
            @ExcludeMissing
            fun _foreignExchangeReference() = foreignExchangeReference

            @JsonProperty("destination_country_code")
            @ExcludeMissing
            fun _destinationCountryCode() = destinationCountryCode

            @JsonProperty("destination_currency_code")
            @ExcludeMissing
            fun _destinationCurrencyCode() = destinationCurrencyCode

            @JsonProperty("foreign_payment_amount")
            @ExcludeMissing
            fun _foreignPaymentAmount() = foreignPaymentAmount

            @JsonProperty("foreign_trace_number")
            @ExcludeMissing
            fun _foreignTraceNumber() = foreignTraceNumber

            @JsonProperty("international_transaction_type_code")
            @ExcludeMissing
            fun _internationalTransactionTypeCode() = internationalTransactionTypeCode

            @JsonProperty("originating_currency_code")
            @ExcludeMissing
            fun _originatingCurrencyCode() = originatingCurrencyCode

            @JsonProperty("originating_depository_financial_institution_name")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionName() =
                originatingDepositoryFinancialInstitutionName

            @JsonProperty("originating_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionIdQualifier() =
                originatingDepositoryFinancialInstitutionIdQualifier

            @JsonProperty("originating_depository_financial_institution_id")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionId() =
                originatingDepositoryFinancialInstitutionId

            @JsonProperty("originating_depository_financial_institution_branch_country")
            @ExcludeMissing
            fun _originatingDepositoryFinancialInstitutionBranchCountry() =
                originatingDepositoryFinancialInstitutionBranchCountry

            @JsonProperty("originator_city") @ExcludeMissing fun _originatorCity() = originatorCity

            @JsonProperty("originator_company_entry_description")
            @ExcludeMissing
            fun _originatorCompanyEntryDescription() = originatorCompanyEntryDescription

            @JsonProperty("originator_country")
            @ExcludeMissing
            fun _originatorCountry() = originatorCountry

            @JsonProperty("originator_identification")
            @ExcludeMissing
            fun _originatorIdentification() = originatorIdentification

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            @JsonProperty("originator_postal_code")
            @ExcludeMissing
            fun _originatorPostalCode() = originatorPostalCode

            @JsonProperty("originator_street_address")
            @ExcludeMissing
            fun _originatorStreetAddress() = originatorStreetAddress

            @JsonProperty("originator_state_or_province")
            @ExcludeMissing
            fun _originatorStateOrProvince() = originatorStateOrProvince

            @JsonProperty("payment_related_information")
            @ExcludeMissing
            fun _paymentRelatedInformation() = paymentRelatedInformation

            @JsonProperty("payment_related_information2")
            @ExcludeMissing
            fun _paymentRelatedInformation2() = paymentRelatedInformation2

            @JsonProperty("receiver_identification_number")
            @ExcludeMissing
            fun _receiverIdentificationNumber() = receiverIdentificationNumber

            @JsonProperty("receiver_street_address")
            @ExcludeMissing
            fun _receiverStreetAddress() = receiverStreetAddress

            @JsonProperty("receiver_city") @ExcludeMissing fun _receiverCity() = receiverCity

            @JsonProperty("receiver_state_or_province")
            @ExcludeMissing
            fun _receiverStateOrProvince() = receiverStateOrProvince

            @JsonProperty("receiver_country")
            @ExcludeMissing
            fun _receiverCountry() = receiverCountry

            @JsonProperty("receiver_postal_code")
            @ExcludeMissing
            fun _receiverPostalCode() = receiverPostalCode

            @JsonProperty("receiving_company_or_individual_name")
            @ExcludeMissing
            fun _receivingCompanyOrIndividualName() = receivingCompanyOrIndividualName

            @JsonProperty("receiving_depository_financial_institution_name")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionName() =
                receivingDepositoryFinancialInstitutionName

            @JsonProperty("receiving_depository_financial_institution_id_qualifier")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionIdQualifier() =
                receivingDepositoryFinancialInstitutionIdQualifier

            @JsonProperty("receiving_depository_financial_institution_id")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionId() =
                receivingDepositoryFinancialInstitutionId

            @JsonProperty("receiving_depository_financial_institution_country")
            @ExcludeMissing
            fun _receivingDepositoryFinancialInstitutionCountry() =
                receivingDepositoryFinancialInstitutionCountry

            @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundInternationalAchTransfer = apply {
                if (!validated) {
                    amount()
                    foreignExchangeIndicator()
                    foreignExchangeReferenceIndicator()
                    foreignExchangeReference()
                    destinationCountryCode()
                    destinationCurrencyCode()
                    foreignPaymentAmount()
                    foreignTraceNumber()
                    internationalTransactionTypeCode()
                    originatingCurrencyCode()
                    originatingDepositoryFinancialInstitutionName()
                    originatingDepositoryFinancialInstitutionIdQualifier()
                    originatingDepositoryFinancialInstitutionId()
                    originatingDepositoryFinancialInstitutionBranchCountry()
                    originatorCity()
                    originatorCompanyEntryDescription()
                    originatorCountry()
                    originatorIdentification()
                    originatorName()
                    originatorPostalCode()
                    originatorStreetAddress()
                    originatorStateOrProvince()
                    paymentRelatedInformation()
                    paymentRelatedInformation2()
                    receiverIdentificationNumber()
                    receiverStreetAddress()
                    receiverCity()
                    receiverStateOrProvince()
                    receiverCountry()
                    receiverPostalCode()
                    receivingCompanyOrIndividualName()
                    receivingDepositoryFinancialInstitutionName()
                    receivingDepositoryFinancialInstitutionIdQualifier()
                    receivingDepositoryFinancialInstitutionId()
                    receivingDepositoryFinancialInstitutionCountry()
                    traceNumber()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundInternationalAchTransfer &&
                    this.amount == other.amount &&
                    this.foreignExchangeIndicator == other.foreignExchangeIndicator &&
                    this.foreignExchangeReferenceIndicator ==
                        other.foreignExchangeReferenceIndicator &&
                    this.foreignExchangeReference == other.foreignExchangeReference &&
                    this.destinationCountryCode == other.destinationCountryCode &&
                    this.destinationCurrencyCode == other.destinationCurrencyCode &&
                    this.foreignPaymentAmount == other.foreignPaymentAmount &&
                    this.foreignTraceNumber == other.foreignTraceNumber &&
                    this.internationalTransactionTypeCode ==
                        other.internationalTransactionTypeCode &&
                    this.originatingCurrencyCode == other.originatingCurrencyCode &&
                    this.originatingDepositoryFinancialInstitutionName ==
                        other.originatingDepositoryFinancialInstitutionName &&
                    this.originatingDepositoryFinancialInstitutionIdQualifier ==
                        other.originatingDepositoryFinancialInstitutionIdQualifier &&
                    this.originatingDepositoryFinancialInstitutionId ==
                        other.originatingDepositoryFinancialInstitutionId &&
                    this.originatingDepositoryFinancialInstitutionBranchCountry ==
                        other.originatingDepositoryFinancialInstitutionBranchCountry &&
                    this.originatorCity == other.originatorCity &&
                    this.originatorCompanyEntryDescription ==
                        other.originatorCompanyEntryDescription &&
                    this.originatorCountry == other.originatorCountry &&
                    this.originatorIdentification == other.originatorIdentification &&
                    this.originatorName == other.originatorName &&
                    this.originatorPostalCode == other.originatorPostalCode &&
                    this.originatorStreetAddress == other.originatorStreetAddress &&
                    this.originatorStateOrProvince == other.originatorStateOrProvince &&
                    this.paymentRelatedInformation == other.paymentRelatedInformation &&
                    this.paymentRelatedInformation2 == other.paymentRelatedInformation2 &&
                    this.receiverIdentificationNumber == other.receiverIdentificationNumber &&
                    this.receiverStreetAddress == other.receiverStreetAddress &&
                    this.receiverCity == other.receiverCity &&
                    this.receiverStateOrProvince == other.receiverStateOrProvince &&
                    this.receiverCountry == other.receiverCountry &&
                    this.receiverPostalCode == other.receiverPostalCode &&
                    this.receivingCompanyOrIndividualName ==
                        other.receivingCompanyOrIndividualName &&
                    this.receivingDepositoryFinancialInstitutionName ==
                        other.receivingDepositoryFinancialInstitutionName &&
                    this.receivingDepositoryFinancialInstitutionIdQualifier ==
                        other.receivingDepositoryFinancialInstitutionIdQualifier &&
                    this.receivingDepositoryFinancialInstitutionId ==
                        other.receivingDepositoryFinancialInstitutionId &&
                    this.receivingDepositoryFinancialInstitutionCountry ==
                        other.receivingDepositoryFinancialInstitutionCountry &&
                    this.traceNumber == other.traceNumber &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            foreignExchangeIndicator,
                            foreignExchangeReferenceIndicator,
                            foreignExchangeReference,
                            destinationCountryCode,
                            destinationCurrencyCode,
                            foreignPaymentAmount,
                            foreignTraceNumber,
                            internationalTransactionTypeCode,
                            originatingCurrencyCode,
                            originatingDepositoryFinancialInstitutionName,
                            originatingDepositoryFinancialInstitutionIdQualifier,
                            originatingDepositoryFinancialInstitutionId,
                            originatingDepositoryFinancialInstitutionBranchCountry,
                            originatorCity,
                            originatorCompanyEntryDescription,
                            originatorCountry,
                            originatorIdentification,
                            originatorName,
                            originatorPostalCode,
                            originatorStreetAddress,
                            originatorStateOrProvince,
                            paymentRelatedInformation,
                            paymentRelatedInformation2,
                            receiverIdentificationNumber,
                            receiverStreetAddress,
                            receiverCity,
                            receiverStateOrProvince,
                            receiverCountry,
                            receiverPostalCode,
                            receivingCompanyOrIndividualName,
                            receivingDepositoryFinancialInstitutionName,
                            receivingDepositoryFinancialInstitutionIdQualifier,
                            receivingDepositoryFinancialInstitutionId,
                            receivingDepositoryFinancialInstitutionCountry,
                            traceNumber,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundInternationalAchTransfer{amount=$amount, foreignExchangeIndicator=$foreignExchangeIndicator, foreignExchangeReferenceIndicator=$foreignExchangeReferenceIndicator, foreignExchangeReference=$foreignExchangeReference, destinationCountryCode=$destinationCountryCode, destinationCurrencyCode=$destinationCurrencyCode, foreignPaymentAmount=$foreignPaymentAmount, foreignTraceNumber=$foreignTraceNumber, internationalTransactionTypeCode=$internationalTransactionTypeCode, originatingCurrencyCode=$originatingCurrencyCode, originatingDepositoryFinancialInstitutionName=$originatingDepositoryFinancialInstitutionName, originatingDepositoryFinancialInstitutionIdQualifier=$originatingDepositoryFinancialInstitutionIdQualifier, originatingDepositoryFinancialInstitutionId=$originatingDepositoryFinancialInstitutionId, originatingDepositoryFinancialInstitutionBranchCountry=$originatingDepositoryFinancialInstitutionBranchCountry, originatorCity=$originatorCity, originatorCompanyEntryDescription=$originatorCompanyEntryDescription, originatorCountry=$originatorCountry, originatorIdentification=$originatorIdentification, originatorName=$originatorName, originatorPostalCode=$originatorPostalCode, originatorStreetAddress=$originatorStreetAddress, originatorStateOrProvince=$originatorStateOrProvince, paymentRelatedInformation=$paymentRelatedInformation, paymentRelatedInformation2=$paymentRelatedInformation2, receiverIdentificationNumber=$receiverIdentificationNumber, receiverStreetAddress=$receiverStreetAddress, receiverCity=$receiverCity, receiverStateOrProvince=$receiverStateOrProvince, receiverCountry=$receiverCountry, receiverPostalCode=$receiverPostalCode, receivingCompanyOrIndividualName=$receivingCompanyOrIndividualName, receivingDepositoryFinancialInstitutionName=$receivingDepositoryFinancialInstitutionName, receivingDepositoryFinancialInstitutionIdQualifier=$receivingDepositoryFinancialInstitutionIdQualifier, receivingDepositoryFinancialInstitutionId=$receivingDepositoryFinancialInstitutionId, receivingDepositoryFinancialInstitutionCountry=$receivingDepositoryFinancialInstitutionCountry, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var foreignExchangeIndicator: JsonField<String> = JsonMissing.of()
                private var foreignExchangeReferenceIndicator: JsonField<String> = JsonMissing.of()
                private var foreignExchangeReference: JsonField<String> = JsonMissing.of()
                private var destinationCountryCode: JsonField<String> = JsonMissing.of()
                private var destinationCurrencyCode: JsonField<String> = JsonMissing.of()
                private var foreignPaymentAmount: JsonField<Long> = JsonMissing.of()
                private var foreignTraceNumber: JsonField<String> = JsonMissing.of()
                private var internationalTransactionTypeCode: JsonField<String> = JsonMissing.of()
                private var originatingCurrencyCode: JsonField<String> = JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionIdQualifier:
                    JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionId: JsonField<String> =
                    JsonMissing.of()
                private var originatingDepositoryFinancialInstitutionBranchCountry:
                    JsonField<String> =
                    JsonMissing.of()
                private var originatorCity: JsonField<String> = JsonMissing.of()
                private var originatorCompanyEntryDescription: JsonField<String> = JsonMissing.of()
                private var originatorCountry: JsonField<String> = JsonMissing.of()
                private var originatorIdentification: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorPostalCode: JsonField<String> = JsonMissing.of()
                private var originatorStreetAddress: JsonField<String> = JsonMissing.of()
                private var originatorStateOrProvince: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                private var paymentRelatedInformation2: JsonField<String> = JsonMissing.of()
                private var receiverIdentificationNumber: JsonField<String> = JsonMissing.of()
                private var receiverStreetAddress: JsonField<String> = JsonMissing.of()
                private var receiverCity: JsonField<String> = JsonMissing.of()
                private var receiverStateOrProvince: JsonField<String> = JsonMissing.of()
                private var receiverCountry: JsonField<String> = JsonMissing.of()
                private var receiverPostalCode: JsonField<String> = JsonMissing.of()
                private var receivingCompanyOrIndividualName: JsonField<String> = JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionName: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionId: JsonField<String> =
                    JsonMissing.of()
                private var receivingDepositoryFinancialInstitutionCountry: JsonField<String> =
                    JsonMissing.of()
                private var traceNumber: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    inboundInternationalAchTransfer: InboundInternationalAchTransfer
                ) = apply {
                    this.amount = inboundInternationalAchTransfer.amount
                    this.foreignExchangeIndicator =
                        inboundInternationalAchTransfer.foreignExchangeIndicator
                    this.foreignExchangeReferenceIndicator =
                        inboundInternationalAchTransfer.foreignExchangeReferenceIndicator
                    this.foreignExchangeReference =
                        inboundInternationalAchTransfer.foreignExchangeReference
                    this.destinationCountryCode =
                        inboundInternationalAchTransfer.destinationCountryCode
                    this.destinationCurrencyCode =
                        inboundInternationalAchTransfer.destinationCurrencyCode
                    this.foreignPaymentAmount = inboundInternationalAchTransfer.foreignPaymentAmount
                    this.foreignTraceNumber = inboundInternationalAchTransfer.foreignTraceNumber
                    this.internationalTransactionTypeCode =
                        inboundInternationalAchTransfer.internationalTransactionTypeCode
                    this.originatingCurrencyCode =
                        inboundInternationalAchTransfer.originatingCurrencyCode
                    this.originatingDepositoryFinancialInstitutionName =
                        inboundInternationalAchTransfer
                            .originatingDepositoryFinancialInstitutionName
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        inboundInternationalAchTransfer
                            .originatingDepositoryFinancialInstitutionIdQualifier
                    this.originatingDepositoryFinancialInstitutionId =
                        inboundInternationalAchTransfer.originatingDepositoryFinancialInstitutionId
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        inboundInternationalAchTransfer
                            .originatingDepositoryFinancialInstitutionBranchCountry
                    this.originatorCity = inboundInternationalAchTransfer.originatorCity
                    this.originatorCompanyEntryDescription =
                        inboundInternationalAchTransfer.originatorCompanyEntryDescription
                    this.originatorCountry = inboundInternationalAchTransfer.originatorCountry
                    this.originatorIdentification =
                        inboundInternationalAchTransfer.originatorIdentification
                    this.originatorName = inboundInternationalAchTransfer.originatorName
                    this.originatorPostalCode = inboundInternationalAchTransfer.originatorPostalCode
                    this.originatorStreetAddress =
                        inboundInternationalAchTransfer.originatorStreetAddress
                    this.originatorStateOrProvince =
                        inboundInternationalAchTransfer.originatorStateOrProvince
                    this.paymentRelatedInformation =
                        inboundInternationalAchTransfer.paymentRelatedInformation
                    this.paymentRelatedInformation2 =
                        inboundInternationalAchTransfer.paymentRelatedInformation2
                    this.receiverIdentificationNumber =
                        inboundInternationalAchTransfer.receiverIdentificationNumber
                    this.receiverStreetAddress =
                        inboundInternationalAchTransfer.receiverStreetAddress
                    this.receiverCity = inboundInternationalAchTransfer.receiverCity
                    this.receiverStateOrProvince =
                        inboundInternationalAchTransfer.receiverStateOrProvince
                    this.receiverCountry = inboundInternationalAchTransfer.receiverCountry
                    this.receiverPostalCode = inboundInternationalAchTransfer.receiverPostalCode
                    this.receivingCompanyOrIndividualName =
                        inboundInternationalAchTransfer.receivingCompanyOrIndividualName
                    this.receivingDepositoryFinancialInstitutionName =
                        inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionName
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        inboundInternationalAchTransfer
                            .receivingDepositoryFinancialInstitutionIdQualifier
                    this.receivingDepositoryFinancialInstitutionId =
                        inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionId
                    this.receivingDepositoryFinancialInstitutionCountry =
                        inboundInternationalAchTransfer
                            .receivingDepositoryFinancialInstitutionCountry
                    this.traceNumber = inboundInternationalAchTransfer.traceNumber
                    additionalProperties(inboundInternationalAchTransfer.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the destination account currency. For dollars,
                 * for example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun foreignExchangeIndicator(foreignExchangeIndicator: String) =
                    foreignExchangeIndicator(JsonField.of(foreignExchangeIndicator))

                @JsonProperty("foreign_exchange_indicator")
                @ExcludeMissing
                fun foreignExchangeIndicator(foreignExchangeIndicator: JsonField<String>) = apply {
                    this.foreignExchangeIndicator = foreignExchangeIndicator
                }

                fun foreignExchangeReferenceIndicator(foreignExchangeReferenceIndicator: String) =
                    foreignExchangeReferenceIndicator(
                        JsonField.of(foreignExchangeReferenceIndicator)
                    )

                @JsonProperty("foreign_exchange_reference_indicator")
                @ExcludeMissing
                fun foreignExchangeReferenceIndicator(
                    foreignExchangeReferenceIndicator: JsonField<String>
                ) = apply {
                    this.foreignExchangeReferenceIndicator = foreignExchangeReferenceIndicator
                }

                fun foreignExchangeReference(foreignExchangeReference: String) =
                    foreignExchangeReference(JsonField.of(foreignExchangeReference))

                @JsonProperty("foreign_exchange_reference")
                @ExcludeMissing
                fun foreignExchangeReference(foreignExchangeReference: JsonField<String>) = apply {
                    this.foreignExchangeReference = foreignExchangeReference
                }

                fun destinationCountryCode(destinationCountryCode: String) =
                    destinationCountryCode(JsonField.of(destinationCountryCode))

                @JsonProperty("destination_country_code")
                @ExcludeMissing
                fun destinationCountryCode(destinationCountryCode: JsonField<String>) = apply {
                    this.destinationCountryCode = destinationCountryCode
                }

                fun destinationCurrencyCode(destinationCurrencyCode: String) =
                    destinationCurrencyCode(JsonField.of(destinationCurrencyCode))

                @JsonProperty("destination_currency_code")
                @ExcludeMissing
                fun destinationCurrencyCode(destinationCurrencyCode: JsonField<String>) = apply {
                    this.destinationCurrencyCode = destinationCurrencyCode
                }

                fun foreignPaymentAmount(foreignPaymentAmount: Long) =
                    foreignPaymentAmount(JsonField.of(foreignPaymentAmount))

                @JsonProperty("foreign_payment_amount")
                @ExcludeMissing
                fun foreignPaymentAmount(foreignPaymentAmount: JsonField<Long>) = apply {
                    this.foreignPaymentAmount = foreignPaymentAmount
                }

                fun foreignTraceNumber(foreignTraceNumber: String) =
                    foreignTraceNumber(JsonField.of(foreignTraceNumber))

                @JsonProperty("foreign_trace_number")
                @ExcludeMissing
                fun foreignTraceNumber(foreignTraceNumber: JsonField<String>) = apply {
                    this.foreignTraceNumber = foreignTraceNumber
                }

                fun internationalTransactionTypeCode(internationalTransactionTypeCode: String) =
                    internationalTransactionTypeCode(JsonField.of(internationalTransactionTypeCode))

                @JsonProperty("international_transaction_type_code")
                @ExcludeMissing
                fun internationalTransactionTypeCode(
                    internationalTransactionTypeCode: JsonField<String>
                ) = apply {
                    this.internationalTransactionTypeCode = internationalTransactionTypeCode
                }

                fun originatingCurrencyCode(originatingCurrencyCode: String) =
                    originatingCurrencyCode(JsonField.of(originatingCurrencyCode))

                @JsonProperty("originating_currency_code")
                @ExcludeMissing
                fun originatingCurrencyCode(originatingCurrencyCode: JsonField<String>) = apply {
                    this.originatingCurrencyCode = originatingCurrencyCode
                }

                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: String
                ) =
                    originatingDepositoryFinancialInstitutionName(
                        JsonField.of(originatingDepositoryFinancialInstitutionName)
                    )

                @JsonProperty("originating_depository_financial_institution_name")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionName(
                    originatingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionName =
                        originatingDepositoryFinancialInstitutionName
                }

                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier: String
                ) =
                    originatingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(originatingDepositoryFinancialInstitutionIdQualifier)
                    )

                @JsonProperty("originating_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionIdQualifier(
                    originatingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionIdQualifier =
                        originatingDepositoryFinancialInstitutionIdQualifier
                }

                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: String
                ) =
                    originatingDepositoryFinancialInstitutionId(
                        JsonField.of(originatingDepositoryFinancialInstitutionId)
                    )

                @JsonProperty("originating_depository_financial_institution_id")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionId(
                    originatingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionId =
                        originatingDepositoryFinancialInstitutionId
                }

                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: String
                ) =
                    originatingDepositoryFinancialInstitutionBranchCountry(
                        JsonField.of(originatingDepositoryFinancialInstitutionBranchCountry)
                    )

                @JsonProperty("originating_depository_financial_institution_branch_country")
                @ExcludeMissing
                fun originatingDepositoryFinancialInstitutionBranchCountry(
                    originatingDepositoryFinancialInstitutionBranchCountry: JsonField<String>
                ) = apply {
                    this.originatingDepositoryFinancialInstitutionBranchCountry =
                        originatingDepositoryFinancialInstitutionBranchCountry
                }

                fun originatorCity(originatorCity: String) =
                    originatorCity(JsonField.of(originatorCity))

                @JsonProperty("originator_city")
                @ExcludeMissing
                fun originatorCity(originatorCity: JsonField<String>) = apply {
                    this.originatorCity = originatorCity
                }

                fun originatorCompanyEntryDescription(originatorCompanyEntryDescription: String) =
                    originatorCompanyEntryDescription(
                        JsonField.of(originatorCompanyEntryDescription)
                    )

                @JsonProperty("originator_company_entry_description")
                @ExcludeMissing
                fun originatorCompanyEntryDescription(
                    originatorCompanyEntryDescription: JsonField<String>
                ) = apply {
                    this.originatorCompanyEntryDescription = originatorCompanyEntryDescription
                }

                fun originatorCountry(originatorCountry: String) =
                    originatorCountry(JsonField.of(originatorCountry))

                @JsonProperty("originator_country")
                @ExcludeMissing
                fun originatorCountry(originatorCountry: JsonField<String>) = apply {
                    this.originatorCountry = originatorCountry
                }

                fun originatorIdentification(originatorIdentification: String) =
                    originatorIdentification(JsonField.of(originatorIdentification))

                @JsonProperty("originator_identification")
                @ExcludeMissing
                fun originatorIdentification(originatorIdentification: JsonField<String>) = apply {
                    this.originatorIdentification = originatorIdentification
                }

                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                fun originatorPostalCode(originatorPostalCode: String) =
                    originatorPostalCode(JsonField.of(originatorPostalCode))

                @JsonProperty("originator_postal_code")
                @ExcludeMissing
                fun originatorPostalCode(originatorPostalCode: JsonField<String>) = apply {
                    this.originatorPostalCode = originatorPostalCode
                }

                fun originatorStreetAddress(originatorStreetAddress: String) =
                    originatorStreetAddress(JsonField.of(originatorStreetAddress))

                @JsonProperty("originator_street_address")
                @ExcludeMissing
                fun originatorStreetAddress(originatorStreetAddress: JsonField<String>) = apply {
                    this.originatorStreetAddress = originatorStreetAddress
                }

                fun originatorStateOrProvince(originatorStateOrProvince: String) =
                    originatorStateOrProvince(JsonField.of(originatorStateOrProvince))

                @JsonProperty("originator_state_or_province")
                @ExcludeMissing
                fun originatorStateOrProvince(originatorStateOrProvince: JsonField<String>) =
                    apply {
                        this.originatorStateOrProvince = originatorStateOrProvince
                    }

                fun paymentRelatedInformation(paymentRelatedInformation: String) =
                    paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation = paymentRelatedInformation
                    }

                fun paymentRelatedInformation2(paymentRelatedInformation2: String) =
                    paymentRelatedInformation2(JsonField.of(paymentRelatedInformation2))

                @JsonProperty("payment_related_information2")
                @ExcludeMissing
                fun paymentRelatedInformation2(paymentRelatedInformation2: JsonField<String>) =
                    apply {
                        this.paymentRelatedInformation2 = paymentRelatedInformation2
                    }

                fun receiverIdentificationNumber(receiverIdentificationNumber: String) =
                    receiverIdentificationNumber(JsonField.of(receiverIdentificationNumber))

                @JsonProperty("receiver_identification_number")
                @ExcludeMissing
                fun receiverIdentificationNumber(receiverIdentificationNumber: JsonField<String>) =
                    apply {
                        this.receiverIdentificationNumber = receiverIdentificationNumber
                    }

                fun receiverStreetAddress(receiverStreetAddress: String) =
                    receiverStreetAddress(JsonField.of(receiverStreetAddress))

                @JsonProperty("receiver_street_address")
                @ExcludeMissing
                fun receiverStreetAddress(receiverStreetAddress: JsonField<String>) = apply {
                    this.receiverStreetAddress = receiverStreetAddress
                }

                fun receiverCity(receiverCity: String) = receiverCity(JsonField.of(receiverCity))

                @JsonProperty("receiver_city")
                @ExcludeMissing
                fun receiverCity(receiverCity: JsonField<String>) = apply {
                    this.receiverCity = receiverCity
                }

                fun receiverStateOrProvince(receiverStateOrProvince: String) =
                    receiverStateOrProvince(JsonField.of(receiverStateOrProvince))

                @JsonProperty("receiver_state_or_province")
                @ExcludeMissing
                fun receiverStateOrProvince(receiverStateOrProvince: JsonField<String>) = apply {
                    this.receiverStateOrProvince = receiverStateOrProvince
                }

                fun receiverCountry(receiverCountry: String) =
                    receiverCountry(JsonField.of(receiverCountry))

                @JsonProperty("receiver_country")
                @ExcludeMissing
                fun receiverCountry(receiverCountry: JsonField<String>) = apply {
                    this.receiverCountry = receiverCountry
                }

                fun receiverPostalCode(receiverPostalCode: String) =
                    receiverPostalCode(JsonField.of(receiverPostalCode))

                @JsonProperty("receiver_postal_code")
                @ExcludeMissing
                fun receiverPostalCode(receiverPostalCode: JsonField<String>) = apply {
                    this.receiverPostalCode = receiverPostalCode
                }

                fun receivingCompanyOrIndividualName(receivingCompanyOrIndividualName: String) =
                    receivingCompanyOrIndividualName(JsonField.of(receivingCompanyOrIndividualName))

                @JsonProperty("receiving_company_or_individual_name")
                @ExcludeMissing
                fun receivingCompanyOrIndividualName(
                    receivingCompanyOrIndividualName: JsonField<String>
                ) = apply {
                    this.receivingCompanyOrIndividualName = receivingCompanyOrIndividualName
                }

                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: String
                ) =
                    receivingDepositoryFinancialInstitutionName(
                        JsonField.of(receivingDepositoryFinancialInstitutionName)
                    )

                @JsonProperty("receiving_depository_financial_institution_name")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionName(
                    receivingDepositoryFinancialInstitutionName: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionName =
                        receivingDepositoryFinancialInstitutionName
                }

                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier: String
                ) =
                    receivingDepositoryFinancialInstitutionIdQualifier(
                        JsonField.of(receivingDepositoryFinancialInstitutionIdQualifier)
                    )

                @JsonProperty("receiving_depository_financial_institution_id_qualifier")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionIdQualifier(
                    receivingDepositoryFinancialInstitutionIdQualifier: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionIdQualifier =
                        receivingDepositoryFinancialInstitutionIdQualifier
                }

                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: String
                ) =
                    receivingDepositoryFinancialInstitutionId(
                        JsonField.of(receivingDepositoryFinancialInstitutionId)
                    )

                @JsonProperty("receiving_depository_financial_institution_id")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionId(
                    receivingDepositoryFinancialInstitutionId: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionId =
                        receivingDepositoryFinancialInstitutionId
                }

                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: String
                ) =
                    receivingDepositoryFinancialInstitutionCountry(
                        JsonField.of(receivingDepositoryFinancialInstitutionCountry)
                    )

                @JsonProperty("receiving_depository_financial_institution_country")
                @ExcludeMissing
                fun receivingDepositoryFinancialInstitutionCountry(
                    receivingDepositoryFinancialInstitutionCountry: JsonField<String>
                ) = apply {
                    this.receivingDepositoryFinancialInstitutionCountry =
                        receivingDepositoryFinancialInstitutionCountry
                }

                fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

                @JsonProperty("trace_number")
                @ExcludeMissing
                fun traceNumber(traceNumber: JsonField<String>) = apply {
                    this.traceNumber = traceNumber
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundInternationalAchTransfer =
                    InboundInternationalAchTransfer(
                        amount,
                        foreignExchangeIndicator,
                        foreignExchangeReferenceIndicator,
                        foreignExchangeReference,
                        destinationCountryCode,
                        destinationCurrencyCode,
                        foreignPaymentAmount,
                        foreignTraceNumber,
                        internationalTransactionTypeCode,
                        originatingCurrencyCode,
                        originatingDepositoryFinancialInstitutionName,
                        originatingDepositoryFinancialInstitutionIdQualifier,
                        originatingDepositoryFinancialInstitutionId,
                        originatingDepositoryFinancialInstitutionBranchCountry,
                        originatorCity,
                        originatorCompanyEntryDescription,
                        originatorCountry,
                        originatorIdentification,
                        originatorName,
                        originatorPostalCode,
                        originatorStreetAddress,
                        originatorStateOrProvince,
                        paymentRelatedInformation,
                        paymentRelatedInformation2,
                        receiverIdentificationNumber,
                        receiverStreetAddress,
                        receiverCity,
                        receiverStateOrProvince,
                        receiverCountry,
                        receiverPostalCode,
                        receivingCompanyOrIndividualName,
                        receivingDepositoryFinancialInstitutionName,
                        receivingDepositoryFinancialInstitutionIdQualifier,
                        receivingDepositoryFinancialInstitutionId,
                        receivingDepositoryFinancialInstitutionCountry,
                        traceNumber,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Real Time Payments Transfer Confirmation object. This field will be present in
         * the JSON response if and only if `category` is equal to
         * `inbound_real_time_payments_transfer_confirmation`.
         */
        @JsonDeserialize(builder = InboundRealTimePaymentsTransferConfirmation.Builder::class)
        @NoAutoDetect
        class InboundRealTimePaymentsTransferConfirmation
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val creditorName: JsonField<String>,
            private val debtorName: JsonField<String>,
            private val debtorAccountNumber: JsonField<String>,
            private val debtorRoutingNumber: JsonField<String>,
            private val transactionIdentification: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transfer's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
             * currency. This will always be "USD" for a Real Time Payments transfer.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            fun creditorName(): String = creditorName.getRequired("creditor_name")

            /** The name provided by the sender of the transfer. */
            fun debtorName(): String = debtorName.getRequired("debtor_name")

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(): String =
                debtorAccountNumber.getRequired("debtor_account_number")

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(): String =
                debtorRoutingNumber.getRequired("debtor_routing_number")

            /** The Real Time Payments network identification of the transfer */
            fun transactionIdentification(): String =
                transactionIdentification.getRequired("transaction_identification")

            /** Additional information included with the transfer. */
            fun remittanceInformation(): String? =
                remittanceInformation.getNullable("remittance_information")

            /**
             * The amount in the minor unit of the transfer's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
             * currency. This will always be "USD" for a Real Time Payments transfer.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The name the sender of the transfer specified as the recipient of the transfer. */
            @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

            /** The name provided by the sender of the transfer. */
            @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

            /** The account number of the account that sent the transfer. */
            @JsonProperty("debtor_account_number")
            @ExcludeMissing
            fun _debtorAccountNumber() = debtorAccountNumber

            /** The routing number of the account that sent the transfer. */
            @JsonProperty("debtor_routing_number")
            @ExcludeMissing
            fun _debtorRoutingNumber() = debtorRoutingNumber

            /** The Real Time Payments network identification of the transfer */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun _transactionIdentification() = transactionIdentification

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundRealTimePaymentsTransferConfirmation = apply {
                if (!validated) {
                    amount()
                    currency()
                    creditorName()
                    debtorName()
                    debtorAccountNumber()
                    debtorRoutingNumber()
                    transactionIdentification()
                    remittanceInformation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundRealTimePaymentsTransferConfirmation &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.creditorName == other.creditorName &&
                    this.debtorName == other.debtorName &&
                    this.debtorAccountNumber == other.debtorAccountNumber &&
                    this.debtorRoutingNumber == other.debtorRoutingNumber &&
                    this.transactionIdentification == other.transactionIdentification &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            creditorName,
                            debtorName,
                            debtorAccountNumber,
                            debtorRoutingNumber,
                            transactionIdentification,
                            remittanceInformation,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundRealTimePaymentsTransferConfirmation{amount=$amount, currency=$currency, creditorName=$creditorName, debtorName=$debtorName, debtorAccountNumber=$debtorAccountNumber, debtorRoutingNumber=$debtorRoutingNumber, transactionIdentification=$transactionIdentification, remittanceInformation=$remittanceInformation, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var creditorName: JsonField<String> = JsonMissing.of()
                private var debtorName: JsonField<String> = JsonMissing.of()
                private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
                private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
                private var transactionIdentification: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    inboundRealTimePaymentsTransferConfirmation:
                        InboundRealTimePaymentsTransferConfirmation
                ) = apply {
                    this.amount = inboundRealTimePaymentsTransferConfirmation.amount
                    this.currency = inboundRealTimePaymentsTransferConfirmation.currency
                    this.creditorName = inboundRealTimePaymentsTransferConfirmation.creditorName
                    this.debtorName = inboundRealTimePaymentsTransferConfirmation.debtorName
                    this.debtorAccountNumber =
                        inboundRealTimePaymentsTransferConfirmation.debtorAccountNumber
                    this.debtorRoutingNumber =
                        inboundRealTimePaymentsTransferConfirmation.debtorRoutingNumber
                    this.transactionIdentification =
                        inboundRealTimePaymentsTransferConfirmation.transactionIdentification
                    this.remittanceInformation =
                        inboundRealTimePaymentsTransferConfirmation.remittanceInformation
                    additionalProperties(
                        inboundRealTimePaymentsTransferConfirmation.additionalProperties
                    )
                }

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transfer's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code of the transfer's
                 * currency. This will always be "USD" for a Real Time Payments transfer.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

                /**
                 * The name the sender of the transfer specified as the recipient of the transfer.
                 */
                @JsonProperty("creditor_name")
                @ExcludeMissing
                fun creditorName(creditorName: JsonField<String>) = apply {
                    this.creditorName = creditorName
                }

                /** The name provided by the sender of the transfer. */
                fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

                /** The name provided by the sender of the transfer. */
                @JsonProperty("debtor_name")
                @ExcludeMissing
                fun debtorName(debtorName: JsonField<String>) = apply {
                    this.debtorName = debtorName
                }

                /** The account number of the account that sent the transfer. */
                fun debtorAccountNumber(debtorAccountNumber: String) =
                    debtorAccountNumber(JsonField.of(debtorAccountNumber))

                /** The account number of the account that sent the transfer. */
                @JsonProperty("debtor_account_number")
                @ExcludeMissing
                fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                    this.debtorAccountNumber = debtorAccountNumber
                }

                /** The routing number of the account that sent the transfer. */
                fun debtorRoutingNumber(debtorRoutingNumber: String) =
                    debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

                /** The routing number of the account that sent the transfer. */
                @JsonProperty("debtor_routing_number")
                @ExcludeMissing
                fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                    this.debtorRoutingNumber = debtorRoutingNumber
                }

                /** The Real Time Payments network identification of the transfer */
                fun transactionIdentification(transactionIdentification: String) =
                    transactionIdentification(JsonField.of(transactionIdentification))

                /** The Real Time Payments network identification of the transfer */
                @JsonProperty("transaction_identification")
                @ExcludeMissing
                fun transactionIdentification(transactionIdentification: JsonField<String>) =
                    apply {
                        this.transactionIdentification = transactionIdentification
                    }

                /** Additional information included with the transfer. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Additional information included with the transfer. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundRealTimePaymentsTransferConfirmation =
                    InboundRealTimePaymentsTransferConfirmation(
                        amount,
                        currency,
                        creditorName,
                        debtorName,
                        debtorAccountNumber,
                        debtorRoutingNumber,
                        transactionIdentification,
                        remittanceInformation,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * An Inbound Wire Drawdown Payment object. This field will be present in the JSON response
         * if and only if `category` is equal to `inbound_wire_drawdown_payment`.
         */
        @JsonDeserialize(builder = InboundWireDrawdownPayment.Builder::class)
        @NoAutoDetect
        class InboundWireDrawdownPayment
        private constructor(
            private val amount: JsonField<Long>,
            private val beneficiaryAddressLine1: JsonField<String>,
            private val beneficiaryAddressLine2: JsonField<String>,
            private val beneficiaryAddressLine3: JsonField<String>,
            private val beneficiaryName: JsonField<String>,
            private val beneficiaryReference: JsonField<String>,
            private val description: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val originatorAddressLine1: JsonField<String>,
            private val originatorAddressLine2: JsonField<String>,
            private val originatorAddressLine3: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorToBeneficiaryInformation: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun beneficiaryAddressLine1(): String? =
                beneficiaryAddressLine1.getNullable("beneficiary_address_line1")

            fun beneficiaryAddressLine2(): String? =
                beneficiaryAddressLine2.getNullable("beneficiary_address_line2")

            fun beneficiaryAddressLine3(): String? =
                beneficiaryAddressLine3.getNullable("beneficiary_address_line3")

            fun beneficiaryName(): String? = beneficiaryName.getNullable("beneficiary_name")

            fun beneficiaryReference(): String? =
                beneficiaryReference.getNullable("beneficiary_reference")

            fun description(): String = description.getRequired("description")

            fun inputMessageAccountabilityData(): String? =
                inputMessageAccountabilityData.getNullable("input_message_accountability_data")

            fun originatorAddressLine1(): String? =
                originatorAddressLine1.getNullable("originator_address_line1")

            fun originatorAddressLine2(): String? =
                originatorAddressLine2.getNullable("originator_address_line2")

            fun originatorAddressLine3(): String? =
                originatorAddressLine3.getNullable("originator_address_line3")

            fun originatorName(): String? = originatorName.getNullable("originator_name")

            fun originatorToBeneficiaryInformation(): String? =
                originatorToBeneficiaryInformation.getNullable(
                    "originator_to_beneficiary_information"
                )

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("beneficiary_address_line1")
            @ExcludeMissing
            fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

            @JsonProperty("beneficiary_address_line2")
            @ExcludeMissing
            fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

            @JsonProperty("beneficiary_address_line3")
            @ExcludeMissing
            fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

            @JsonProperty("beneficiary_name")
            @ExcludeMissing
            fun _beneficiaryName() = beneficiaryName

            @JsonProperty("beneficiary_reference")
            @ExcludeMissing
            fun _beneficiaryReference() = beneficiaryReference

            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            @JsonProperty("originator_address_line1")
            @ExcludeMissing
            fun _originatorAddressLine1() = originatorAddressLine1

            @JsonProperty("originator_address_line2")
            @ExcludeMissing
            fun _originatorAddressLine2() = originatorAddressLine2

            @JsonProperty("originator_address_line3")
            @ExcludeMissing
            fun _originatorAddressLine3() = originatorAddressLine3

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            @JsonProperty("originator_to_beneficiary_information")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireDrawdownPayment = apply {
                if (!validated) {
                    amount()
                    beneficiaryAddressLine1()
                    beneficiaryAddressLine2()
                    beneficiaryAddressLine3()
                    beneficiaryName()
                    beneficiaryReference()
                    description()
                    inputMessageAccountabilityData()
                    originatorAddressLine1()
                    originatorAddressLine2()
                    originatorAddressLine3()
                    originatorName()
                    originatorToBeneficiaryInformation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireDrawdownPayment &&
                    this.amount == other.amount &&
                    this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                    this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                    this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                    this.beneficiaryName == other.beneficiaryName &&
                    this.beneficiaryReference == other.beneficiaryReference &&
                    this.description == other.description &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.originatorAddressLine1 == other.originatorAddressLine1 &&
                    this.originatorAddressLine2 == other.originatorAddressLine2 &&
                    this.originatorAddressLine3 == other.originatorAddressLine3 &&
                    this.originatorName == other.originatorName &&
                    this.originatorToBeneficiaryInformation ==
                        other.originatorToBeneficiaryInformation &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            beneficiaryAddressLine1,
                            beneficiaryAddressLine2,
                            beneficiaryAddressLine3,
                            beneficiaryName,
                            beneficiaryReference,
                            description,
                            inputMessageAccountabilityData,
                            originatorAddressLine1,
                            originatorAddressLine2,
                            originatorAddressLine3,
                            originatorName,
                            originatorToBeneficiaryInformation,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireDrawdownPayment{amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
                private var beneficiaryName: JsonField<String> = JsonMissing.of()
                private var beneficiaryReference: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundWireDrawdownPayment: InboundWireDrawdownPayment) = apply {
                    this.amount = inboundWireDrawdownPayment.amount
                    this.beneficiaryAddressLine1 =
                        inboundWireDrawdownPayment.beneficiaryAddressLine1
                    this.beneficiaryAddressLine2 =
                        inboundWireDrawdownPayment.beneficiaryAddressLine2
                    this.beneficiaryAddressLine3 =
                        inboundWireDrawdownPayment.beneficiaryAddressLine3
                    this.beneficiaryName = inboundWireDrawdownPayment.beneficiaryName
                    this.beneficiaryReference = inboundWireDrawdownPayment.beneficiaryReference
                    this.description = inboundWireDrawdownPayment.description
                    this.inputMessageAccountabilityData =
                        inboundWireDrawdownPayment.inputMessageAccountabilityData
                    this.originatorAddressLine1 = inboundWireDrawdownPayment.originatorAddressLine1
                    this.originatorAddressLine2 = inboundWireDrawdownPayment.originatorAddressLine2
                    this.originatorAddressLine3 = inboundWireDrawdownPayment.originatorAddressLine3
                    this.originatorName = inboundWireDrawdownPayment.originatorName
                    this.originatorToBeneficiaryInformation =
                        inboundWireDrawdownPayment.originatorToBeneficiaryInformation
                    additionalProperties(inboundWireDrawdownPayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                    beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                    this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                }

                fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                    beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                    this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                }

                fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                    beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                    this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                }

                fun beneficiaryName(beneficiaryName: String) =
                    beneficiaryName(JsonField.of(beneficiaryName))

                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                    this.beneficiaryName = beneficiaryName
                }

                fun beneficiaryReference(beneficiaryReference: String) =
                    beneficiaryReference(JsonField.of(beneficiaryReference))

                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                    this.beneficiaryReference = beneficiaryReference
                }

                fun description(description: String) = description(JsonField.of(description))

                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                fun originatorAddressLine1(originatorAddressLine1: String) =
                    originatorAddressLine1(JsonField.of(originatorAddressLine1))

                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                    this.originatorAddressLine1 = originatorAddressLine1
                }

                fun originatorAddressLine2(originatorAddressLine2: String) =
                    originatorAddressLine2(JsonField.of(originatorAddressLine2))

                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                    this.originatorAddressLine2 = originatorAddressLine2
                }

                fun originatorAddressLine3(originatorAddressLine3: String) =
                    originatorAddressLine3(JsonField.of(originatorAddressLine3))

                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                    this.originatorAddressLine3 = originatorAddressLine3
                }

                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                fun originatorToBeneficiaryInformation(originatorToBeneficiaryInformation: String) =
                    originatorToBeneficiaryInformation(
                        JsonField.of(originatorToBeneficiaryInformation)
                    )

                @JsonProperty("originator_to_beneficiary_information")
                @ExcludeMissing
                fun originatorToBeneficiaryInformation(
                    originatorToBeneficiaryInformation: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundWireDrawdownPayment =
                    InboundWireDrawdownPayment(
                        amount,
                        beneficiaryAddressLine1,
                        beneficiaryAddressLine2,
                        beneficiaryAddressLine3,
                        beneficiaryName,
                        beneficiaryReference,
                        description,
                        inputMessageAccountabilityData,
                        originatorAddressLine1,
                        originatorAddressLine2,
                        originatorAddressLine3,
                        originatorName,
                        originatorToBeneficiaryInformation,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Wire Drawdown Payment Reversal object. This field will be present in the JSON
         * response if and only if `category` is equal to `inbound_wire_drawdown_payment_reversal`.
         */
        @JsonDeserialize(builder = InboundWireDrawdownPaymentReversal.Builder::class)
        @NoAutoDetect
        class InboundWireDrawdownPaymentReversal
        private constructor(
            private val amount: JsonField<Long>,
            private val description: JsonField<String>,
            private val inputCycleDate: JsonField<LocalDate>,
            private val inputSequenceNumber: JsonField<String>,
            private val inputSource: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val previousMessageInputMessageAccountabilityData: JsonField<String>,
            private val previousMessageInputCycleDate: JsonField<LocalDate>,
            private val previousMessageInputSequenceNumber: JsonField<String>,
            private val previousMessageInputSource: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The amount that was reversed. */
            fun amount(): Long = amount.getRequired("amount")

            /** The description on the reversal message from Fedwire. */
            fun description(): String = description.getRequired("description")

            /** The Fedwire cycle date for the wire reversal. */
            fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(): String =
                inputSequenceNumber.getRequired("input_sequence_number")

            /** The Fedwire input source identifier. */
            fun inputSource(): String = inputSource.getRequired("input_source")

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(): String =
                inputMessageAccountabilityData.getRequired("input_message_accountability_data")

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(): String =
                previousMessageInputMessageAccountabilityData.getRequired(
                    "previous_message_input_message_accountability_data"
                )

            /** The Fedwire cycle date for the wire transfer that was reversed. */
            fun previousMessageInputCycleDate(): LocalDate =
                previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(): String =
                previousMessageInputSequenceNumber.getRequired(
                    "previous_message_input_sequence_number"
                )

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(): String =
                previousMessageInputSource.getRequired("previous_message_input_source")

            /** The amount that was reversed. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The description on the reversal message from Fedwire. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The Fedwire cycle date for the wire reversal. */
            @JsonProperty("input_cycle_date") @ExcludeMissing fun _inputCycleDate() = inputCycleDate

            /** The Fedwire sequence number. */
            @JsonProperty("input_sequence_number")
            @ExcludeMissing
            fun _inputSequenceNumber() = inputSequenceNumber

            /** The Fedwire input source identifier. */
            @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

            /** The Fedwire transaction identifier. */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_message_accountability_data")
            @ExcludeMissing
            fun _previousMessageInputMessageAccountabilityData() =
                previousMessageInputMessageAccountabilityData

            /** The Fedwire cycle date for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_cycle_date")
            @ExcludeMissing
            fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_sequence_number")
            @ExcludeMissing
            fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_source")
            @ExcludeMissing
            fun _previousMessageInputSource() = previousMessageInputSource

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireDrawdownPaymentReversal = apply {
                if (!validated) {
                    amount()
                    description()
                    inputCycleDate()
                    inputSequenceNumber()
                    inputSource()
                    inputMessageAccountabilityData()
                    previousMessageInputMessageAccountabilityData()
                    previousMessageInputCycleDate()
                    previousMessageInputSequenceNumber()
                    previousMessageInputSource()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireDrawdownPaymentReversal &&
                    this.amount == other.amount &&
                    this.description == other.description &&
                    this.inputCycleDate == other.inputCycleDate &&
                    this.inputSequenceNumber == other.inputSequenceNumber &&
                    this.inputSource == other.inputSource &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.previousMessageInputMessageAccountabilityData ==
                        other.previousMessageInputMessageAccountabilityData &&
                    this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                    this.previousMessageInputSequenceNumber ==
                        other.previousMessageInputSequenceNumber &&
                    this.previousMessageInputSource == other.previousMessageInputSource &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            description,
                            inputCycleDate,
                            inputSequenceNumber,
                            inputSource,
                            inputMessageAccountabilityData,
                            previousMessageInputMessageAccountabilityData,
                            previousMessageInputCycleDate,
                            previousMessageInputSequenceNumber,
                            previousMessageInputSource,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireDrawdownPaymentReversal{amount=$amount, description=$description, inputCycleDate=$inputCycleDate, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, inputMessageAccountabilityData=$inputMessageAccountabilityData, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var inputSource: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                    JsonMissing.of()
                private var previousMessageInputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var previousMessageInputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    inboundWireDrawdownPaymentReversal: InboundWireDrawdownPaymentReversal
                ) = apply {
                    this.amount = inboundWireDrawdownPaymentReversal.amount
                    this.description = inboundWireDrawdownPaymentReversal.description
                    this.inputCycleDate = inboundWireDrawdownPaymentReversal.inputCycleDate
                    this.inputSequenceNumber =
                        inboundWireDrawdownPaymentReversal.inputSequenceNumber
                    this.inputSource = inboundWireDrawdownPaymentReversal.inputSource
                    this.inputMessageAccountabilityData =
                        inboundWireDrawdownPaymentReversal.inputMessageAccountabilityData
                    this.previousMessageInputMessageAccountabilityData =
                        inboundWireDrawdownPaymentReversal
                            .previousMessageInputMessageAccountabilityData
                    this.previousMessageInputCycleDate =
                        inboundWireDrawdownPaymentReversal.previousMessageInputCycleDate
                    this.previousMessageInputSequenceNumber =
                        inboundWireDrawdownPaymentReversal.previousMessageInputSequenceNumber
                    this.previousMessageInputSource =
                        inboundWireDrawdownPaymentReversal.previousMessageInputSource
                    additionalProperties(inboundWireDrawdownPaymentReversal.additionalProperties)
                }

                /** The amount that was reversed. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount that was reversed. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The description on the reversal message from Fedwire. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description on the reversal message from Fedwire. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The Fedwire cycle date for the wire reversal. */
                fun inputCycleDate(inputCycleDate: LocalDate) =
                    inputCycleDate(JsonField.of(inputCycleDate))

                /** The Fedwire cycle date for the wire reversal. */
                @JsonProperty("input_cycle_date")
                @ExcludeMissing
                fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                    this.inputCycleDate = inputCycleDate
                }

                /** The Fedwire sequence number. */
                fun inputSequenceNumber(inputSequenceNumber: String) =
                    inputSequenceNumber(JsonField.of(inputSequenceNumber))

                /** The Fedwire sequence number. */
                @JsonProperty("input_sequence_number")
                @ExcludeMissing
                fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                    this.inputSequenceNumber = inputSequenceNumber
                }

                /** The Fedwire input source identifier. */
                fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

                /** The Fedwire input source identifier. */
                @JsonProperty("input_source")
                @ExcludeMissing
                fun inputSource(inputSource: JsonField<String>) = apply {
                    this.inputSource = inputSource
                }

                /** The Fedwire transaction identifier. */
                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                /** The Fedwire transaction identifier. */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: String
                ) =
                    previousMessageInputMessageAccountabilityData(
                        JsonField.of(previousMessageInputMessageAccountabilityData)
                    )

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_message_accountability_data")
                @ExcludeMissing
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: JsonField<String>
                ) = apply {
                    this.previousMessageInputMessageAccountabilityData =
                        previousMessageInputMessageAccountabilityData
                }

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                    previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_cycle_date")
                @ExcludeMissing
                fun previousMessageInputCycleDate(
                    previousMessageInputCycleDate: JsonField<LocalDate>
                ) = apply { this.previousMessageInputCycleDate = previousMessageInputCycleDate }

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                fun previousMessageInputSequenceNumber(previousMessageInputSequenceNumber: String) =
                    previousMessageInputSequenceNumber(
                        JsonField.of(previousMessageInputSequenceNumber)
                    )

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_sequence_number")
                @ExcludeMissing
                fun previousMessageInputSequenceNumber(
                    previousMessageInputSequenceNumber: JsonField<String>
                ) = apply {
                    this.previousMessageInputSequenceNumber = previousMessageInputSequenceNumber
                }

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                fun previousMessageInputSource(previousMessageInputSource: String) =
                    previousMessageInputSource(JsonField.of(previousMessageInputSource))

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_source")
                @ExcludeMissing
                fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) =
                    apply {
                        this.previousMessageInputSource = previousMessageInputSource
                    }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundWireDrawdownPaymentReversal =
                    InboundWireDrawdownPaymentReversal(
                        amount,
                        description,
                        inputCycleDate,
                        inputSequenceNumber,
                        inputSource,
                        inputMessageAccountabilityData,
                        previousMessageInputMessageAccountabilityData,
                        previousMessageInputCycleDate,
                        previousMessageInputSequenceNumber,
                        previousMessageInputSource,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Wire Reversal object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_reversal`.
         */
        @JsonDeserialize(builder = InboundWireReversal.Builder::class)
        @NoAutoDetect
        class InboundWireReversal
        private constructor(
            private val amount: JsonField<Long>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val description: JsonField<String>,
            private val inputCycleDate: JsonField<LocalDate>,
            private val inputSequenceNumber: JsonField<String>,
            private val inputSource: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val previousMessageInputMessageAccountabilityData: JsonField<String>,
            private val previousMessageInputCycleDate: JsonField<LocalDate>,
            private val previousMessageInputSequenceNumber: JsonField<String>,
            private val previousMessageInputSource: JsonField<String>,
            private val receiverFinancialInstitutionInformation: JsonField<String>,
            private val financialInstitutionToFinancialInstitutionInformation: JsonField<String>,
            private val transactionId: JsonField<String>,
            private val wireTransferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The amount that was reversed. */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /** The description on the reversal message from Fedwire. */
            fun description(): String = description.getRequired("description")

            /** The Fedwire cycle date for the wire reversal. */
            fun inputCycleDate(): LocalDate = inputCycleDate.getRequired("input_cycle_date")

            /** The Fedwire sequence number. */
            fun inputSequenceNumber(): String =
                inputSequenceNumber.getRequired("input_sequence_number")

            /** The Fedwire input source identifier. */
            fun inputSource(): String = inputSource.getRequired("input_source")

            /** The Fedwire transaction identifier. */
            fun inputMessageAccountabilityData(): String =
                inputMessageAccountabilityData.getRequired("input_message_accountability_data")

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            fun previousMessageInputMessageAccountabilityData(): String =
                previousMessageInputMessageAccountabilityData.getRequired(
                    "previous_message_input_message_accountability_data"
                )

            /** The Fedwire cycle date for the wire transfer that was reversed. */
            fun previousMessageInputCycleDate(): LocalDate =
                previousMessageInputCycleDate.getRequired("previous_message_input_cycle_date")

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            fun previousMessageInputSequenceNumber(): String =
                previousMessageInputSequenceNumber.getRequired(
                    "previous_message_input_sequence_number"
                )

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            fun previousMessageInputSource(): String =
                previousMessageInputSource.getRequired("previous_message_input_source")

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            fun receiverFinancialInstitutionInformation(): String? =
                receiverFinancialInstitutionInformation.getNullable(
                    "receiver_financial_institution_information"
                )

            /** Additional financial institution information included in the wire reversal. */
            fun financialInstitutionToFinancialInstitutionInformation(): String? =
                financialInstitutionToFinancialInstitutionInformation.getNullable(
                    "financial_institution_to_financial_institution_information"
                )

            /** The ID for the Transaction associated with the transfer reversal. */
            fun transactionId(): String? = transactionId.getNullable("transaction_id")

            /** The ID for the Wire Transfer that is being reversed. */
            fun wireTransferId(): String = wireTransferId.getRequired("wire_transfer_id")

            /** The amount that was reversed. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * reversal was created.
             */
            @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

            /** The description on the reversal message from Fedwire. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            /** The Fedwire cycle date for the wire reversal. */
            @JsonProperty("input_cycle_date") @ExcludeMissing fun _inputCycleDate() = inputCycleDate

            /** The Fedwire sequence number. */
            @JsonProperty("input_sequence_number")
            @ExcludeMissing
            fun _inputSequenceNumber() = inputSequenceNumber

            /** The Fedwire input source identifier. */
            @JsonProperty("input_source") @ExcludeMissing fun _inputSource() = inputSource

            /** The Fedwire transaction identifier. */
            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            /** The Fedwire transaction identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_message_accountability_data")
            @ExcludeMissing
            fun _previousMessageInputMessageAccountabilityData() =
                previousMessageInputMessageAccountabilityData

            /** The Fedwire cycle date for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_cycle_date")
            @ExcludeMissing
            fun _previousMessageInputCycleDate() = previousMessageInputCycleDate

            /** The Fedwire sequence number for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_sequence_number")
            @ExcludeMissing
            fun _previousMessageInputSequenceNumber() = previousMessageInputSequenceNumber

            /** The Fedwire input source identifier for the wire transfer that was reversed. */
            @JsonProperty("previous_message_input_source")
            @ExcludeMissing
            fun _previousMessageInputSource() = previousMessageInputSource

            /**
             * Information included in the wire reversal for the receiving financial institution.
             */
            @JsonProperty("receiver_financial_institution_information")
            @ExcludeMissing
            fun _receiverFinancialInstitutionInformation() = receiverFinancialInstitutionInformation

            /** Additional financial institution information included in the wire reversal. */
            @JsonProperty("financial_institution_to_financial_institution_information")
            @ExcludeMissing
            fun _financialInstitutionToFinancialInstitutionInformation() =
                financialInstitutionToFinancialInstitutionInformation

            /** The ID for the Transaction associated with the transfer reversal. */
            @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

            /** The ID for the Wire Transfer that is being reversed. */
            @JsonProperty("wire_transfer_id") @ExcludeMissing fun _wireTransferId() = wireTransferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireReversal = apply {
                if (!validated) {
                    amount()
                    createdAt()
                    description()
                    inputCycleDate()
                    inputSequenceNumber()
                    inputSource()
                    inputMessageAccountabilityData()
                    previousMessageInputMessageAccountabilityData()
                    previousMessageInputCycleDate()
                    previousMessageInputSequenceNumber()
                    previousMessageInputSource()
                    receiverFinancialInstitutionInformation()
                    financialInstitutionToFinancialInstitutionInformation()
                    transactionId()
                    wireTransferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireReversal &&
                    this.amount == other.amount &&
                    this.createdAt == other.createdAt &&
                    this.description == other.description &&
                    this.inputCycleDate == other.inputCycleDate &&
                    this.inputSequenceNumber == other.inputSequenceNumber &&
                    this.inputSource == other.inputSource &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.previousMessageInputMessageAccountabilityData ==
                        other.previousMessageInputMessageAccountabilityData &&
                    this.previousMessageInputCycleDate == other.previousMessageInputCycleDate &&
                    this.previousMessageInputSequenceNumber ==
                        other.previousMessageInputSequenceNumber &&
                    this.previousMessageInputSource == other.previousMessageInputSource &&
                    this.receiverFinancialInstitutionInformation ==
                        other.receiverFinancialInstitutionInformation &&
                    this.financialInstitutionToFinancialInstitutionInformation ==
                        other.financialInstitutionToFinancialInstitutionInformation &&
                    this.transactionId == other.transactionId &&
                    this.wireTransferId == other.wireTransferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            createdAt,
                            description,
                            inputCycleDate,
                            inputSequenceNumber,
                            inputSource,
                            inputMessageAccountabilityData,
                            previousMessageInputMessageAccountabilityData,
                            previousMessageInputCycleDate,
                            previousMessageInputSequenceNumber,
                            previousMessageInputSource,
                            receiverFinancialInstitutionInformation,
                            financialInstitutionToFinancialInstitutionInformation,
                            transactionId,
                            wireTransferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireReversal{amount=$amount, createdAt=$createdAt, description=$description, inputCycleDate=$inputCycleDate, inputSequenceNumber=$inputSequenceNumber, inputSource=$inputSource, inputMessageAccountabilityData=$inputMessageAccountabilityData, previousMessageInputMessageAccountabilityData=$previousMessageInputMessageAccountabilityData, previousMessageInputCycleDate=$previousMessageInputCycleDate, previousMessageInputSequenceNumber=$previousMessageInputSequenceNumber, previousMessageInputSource=$previousMessageInputSource, receiverFinancialInstitutionInformation=$receiverFinancialInstitutionInformation, financialInstitutionToFinancialInstitutionInformation=$financialInstitutionToFinancialInstitutionInformation, transactionId=$transactionId, wireTransferId=$wireTransferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var inputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var inputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var inputSource: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var previousMessageInputMessageAccountabilityData: JsonField<String> =
                    JsonMissing.of()
                private var previousMessageInputCycleDate: JsonField<LocalDate> = JsonMissing.of()
                private var previousMessageInputSequenceNumber: JsonField<String> = JsonMissing.of()
                private var previousMessageInputSource: JsonField<String> = JsonMissing.of()
                private var receiverFinancialInstitutionInformation: JsonField<String> =
                    JsonMissing.of()
                private var financialInstitutionToFinancialInstitutionInformation:
                    JsonField<String> =
                    JsonMissing.of()
                private var transactionId: JsonField<String> = JsonMissing.of()
                private var wireTransferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundWireReversal: InboundWireReversal) = apply {
                    this.amount = inboundWireReversal.amount
                    this.createdAt = inboundWireReversal.createdAt
                    this.description = inboundWireReversal.description
                    this.inputCycleDate = inboundWireReversal.inputCycleDate
                    this.inputSequenceNumber = inboundWireReversal.inputSequenceNumber
                    this.inputSource = inboundWireReversal.inputSource
                    this.inputMessageAccountabilityData =
                        inboundWireReversal.inputMessageAccountabilityData
                    this.previousMessageInputMessageAccountabilityData =
                        inboundWireReversal.previousMessageInputMessageAccountabilityData
                    this.previousMessageInputCycleDate =
                        inboundWireReversal.previousMessageInputCycleDate
                    this.previousMessageInputSequenceNumber =
                        inboundWireReversal.previousMessageInputSequenceNumber
                    this.previousMessageInputSource = inboundWireReversal.previousMessageInputSource
                    this.receiverFinancialInstitutionInformation =
                        inboundWireReversal.receiverFinancialInstitutionInformation
                    this.financialInstitutionToFinancialInstitutionInformation =
                        inboundWireReversal.financialInstitutionToFinancialInstitutionInformation
                    this.transactionId = inboundWireReversal.transactionId
                    this.wireTransferId = inboundWireReversal.wireTransferId
                    additionalProperties(inboundWireReversal.additionalProperties)
                }

                /** The amount that was reversed. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The amount that was reversed. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * reversal was created.
                 */
                @JsonProperty("created_at")
                @ExcludeMissing
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The description on the reversal message from Fedwire. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description on the reversal message from Fedwire. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                /** The Fedwire cycle date for the wire reversal. */
                fun inputCycleDate(inputCycleDate: LocalDate) =
                    inputCycleDate(JsonField.of(inputCycleDate))

                /** The Fedwire cycle date for the wire reversal. */
                @JsonProperty("input_cycle_date")
                @ExcludeMissing
                fun inputCycleDate(inputCycleDate: JsonField<LocalDate>) = apply {
                    this.inputCycleDate = inputCycleDate
                }

                /** The Fedwire sequence number. */
                fun inputSequenceNumber(inputSequenceNumber: String) =
                    inputSequenceNumber(JsonField.of(inputSequenceNumber))

                /** The Fedwire sequence number. */
                @JsonProperty("input_sequence_number")
                @ExcludeMissing
                fun inputSequenceNumber(inputSequenceNumber: JsonField<String>) = apply {
                    this.inputSequenceNumber = inputSequenceNumber
                }

                /** The Fedwire input source identifier. */
                fun inputSource(inputSource: String) = inputSource(JsonField.of(inputSource))

                /** The Fedwire input source identifier. */
                @JsonProperty("input_source")
                @ExcludeMissing
                fun inputSource(inputSource: JsonField<String>) = apply {
                    this.inputSource = inputSource
                }

                /** The Fedwire transaction identifier. */
                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                /** The Fedwire transaction identifier. */
                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: String
                ) =
                    previousMessageInputMessageAccountabilityData(
                        JsonField.of(previousMessageInputMessageAccountabilityData)
                    )

                /** The Fedwire transaction identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_message_accountability_data")
                @ExcludeMissing
                fun previousMessageInputMessageAccountabilityData(
                    previousMessageInputMessageAccountabilityData: JsonField<String>
                ) = apply {
                    this.previousMessageInputMessageAccountabilityData =
                        previousMessageInputMessageAccountabilityData
                }

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                fun previousMessageInputCycleDate(previousMessageInputCycleDate: LocalDate) =
                    previousMessageInputCycleDate(JsonField.of(previousMessageInputCycleDate))

                /** The Fedwire cycle date for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_cycle_date")
                @ExcludeMissing
                fun previousMessageInputCycleDate(
                    previousMessageInputCycleDate: JsonField<LocalDate>
                ) = apply { this.previousMessageInputCycleDate = previousMessageInputCycleDate }

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                fun previousMessageInputSequenceNumber(previousMessageInputSequenceNumber: String) =
                    previousMessageInputSequenceNumber(
                        JsonField.of(previousMessageInputSequenceNumber)
                    )

                /** The Fedwire sequence number for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_sequence_number")
                @ExcludeMissing
                fun previousMessageInputSequenceNumber(
                    previousMessageInputSequenceNumber: JsonField<String>
                ) = apply {
                    this.previousMessageInputSequenceNumber = previousMessageInputSequenceNumber
                }

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                fun previousMessageInputSource(previousMessageInputSource: String) =
                    previousMessageInputSource(JsonField.of(previousMessageInputSource))

                /** The Fedwire input source identifier for the wire transfer that was reversed. */
                @JsonProperty("previous_message_input_source")
                @ExcludeMissing
                fun previousMessageInputSource(previousMessageInputSource: JsonField<String>) =
                    apply {
                        this.previousMessageInputSource = previousMessageInputSource
                    }

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                fun receiverFinancialInstitutionInformation(
                    receiverFinancialInstitutionInformation: String
                ) =
                    receiverFinancialInstitutionInformation(
                        JsonField.of(receiverFinancialInstitutionInformation)
                    )

                /**
                 * Information included in the wire reversal for the receiving financial
                 * institution.
                 */
                @JsonProperty("receiver_financial_institution_information")
                @ExcludeMissing
                fun receiverFinancialInstitutionInformation(
                    receiverFinancialInstitutionInformation: JsonField<String>
                ) = apply {
                    this.receiverFinancialInstitutionInformation =
                        receiverFinancialInstitutionInformation
                }

                /** Additional financial institution information included in the wire reversal. */
                fun financialInstitutionToFinancialInstitutionInformation(
                    financialInstitutionToFinancialInstitutionInformation: String
                ) =
                    financialInstitutionToFinancialInstitutionInformation(
                        JsonField.of(financialInstitutionToFinancialInstitutionInformation)
                    )

                /** Additional financial institution information included in the wire reversal. */
                @JsonProperty("financial_institution_to_financial_institution_information")
                @ExcludeMissing
                fun financialInstitutionToFinancialInstitutionInformation(
                    financialInstitutionToFinancialInstitutionInformation: JsonField<String>
                ) = apply {
                    this.financialInstitutionToFinancialInstitutionInformation =
                        financialInstitutionToFinancialInstitutionInformation
                }

                /** The ID for the Transaction associated with the transfer reversal. */
                fun transactionId(transactionId: String) =
                    transactionId(JsonField.of(transactionId))

                /** The ID for the Transaction associated with the transfer reversal. */
                @JsonProperty("transaction_id")
                @ExcludeMissing
                fun transactionId(transactionId: JsonField<String>) = apply {
                    this.transactionId = transactionId
                }

                /** The ID for the Wire Transfer that is being reversed. */
                fun wireTransferId(wireTransferId: String) =
                    wireTransferId(JsonField.of(wireTransferId))

                /** The ID for the Wire Transfer that is being reversed. */
                @JsonProperty("wire_transfer_id")
                @ExcludeMissing
                fun wireTransferId(wireTransferId: JsonField<String>) = apply {
                    this.wireTransferId = wireTransferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundWireReversal =
                    InboundWireReversal(
                        amount,
                        createdAt,
                        description,
                        inputCycleDate,
                        inputSequenceNumber,
                        inputSource,
                        inputMessageAccountabilityData,
                        previousMessageInputMessageAccountabilityData,
                        previousMessageInputCycleDate,
                        previousMessageInputSequenceNumber,
                        previousMessageInputSource,
                        receiverFinancialInstitutionInformation,
                        financialInstitutionToFinancialInstitutionInformation,
                        transactionId,
                        wireTransferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Inbound Wire Transfer object. This field will be present in the JSON response if and
         * only if `category` is equal to `inbound_wire_transfer`.
         */
        @JsonDeserialize(builder = InboundWireTransfer.Builder::class)
        @NoAutoDetect
        class InboundWireTransfer
        private constructor(
            private val amount: JsonField<Long>,
            private val beneficiaryAddressLine1: JsonField<String>,
            private val beneficiaryAddressLine2: JsonField<String>,
            private val beneficiaryAddressLine3: JsonField<String>,
            private val beneficiaryName: JsonField<String>,
            private val beneficiaryReference: JsonField<String>,
            private val description: JsonField<String>,
            private val inputMessageAccountabilityData: JsonField<String>,
            private val originatorAddressLine1: JsonField<String>,
            private val originatorAddressLine2: JsonField<String>,
            private val originatorAddressLine3: JsonField<String>,
            private val originatorName: JsonField<String>,
            private val originatorToBeneficiaryInformationLine1: JsonField<String>,
            private val originatorToBeneficiaryInformationLine2: JsonField<String>,
            private val originatorToBeneficiaryInformationLine3: JsonField<String>,
            private val originatorToBeneficiaryInformationLine4: JsonField<String>,
            private val originatorToBeneficiaryInformation: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            fun beneficiaryAddressLine1(): String? =
                beneficiaryAddressLine1.getNullable("beneficiary_address_line1")

            fun beneficiaryAddressLine2(): String? =
                beneficiaryAddressLine2.getNullable("beneficiary_address_line2")

            fun beneficiaryAddressLine3(): String? =
                beneficiaryAddressLine3.getNullable("beneficiary_address_line3")

            fun beneficiaryName(): String? = beneficiaryName.getNullable("beneficiary_name")

            fun beneficiaryReference(): String? =
                beneficiaryReference.getNullable("beneficiary_reference")

            fun description(): String = description.getRequired("description")

            fun inputMessageAccountabilityData(): String? =
                inputMessageAccountabilityData.getNullable("input_message_accountability_data")

            fun originatorAddressLine1(): String? =
                originatorAddressLine1.getNullable("originator_address_line1")

            fun originatorAddressLine2(): String? =
                originatorAddressLine2.getNullable("originator_address_line2")

            fun originatorAddressLine3(): String? =
                originatorAddressLine3.getNullable("originator_address_line3")

            fun originatorName(): String? = originatorName.getNullable("originator_name")

            fun originatorToBeneficiaryInformationLine1(): String? =
                originatorToBeneficiaryInformationLine1.getNullable(
                    "originator_to_beneficiary_information_line1"
                )

            fun originatorToBeneficiaryInformationLine2(): String? =
                originatorToBeneficiaryInformationLine2.getNullable(
                    "originator_to_beneficiary_information_line2"
                )

            fun originatorToBeneficiaryInformationLine3(): String? =
                originatorToBeneficiaryInformationLine3.getNullable(
                    "originator_to_beneficiary_information_line3"
                )

            fun originatorToBeneficiaryInformationLine4(): String? =
                originatorToBeneficiaryInformationLine4.getNullable(
                    "originator_to_beneficiary_information_line4"
                )

            fun originatorToBeneficiaryInformation(): String? =
                originatorToBeneficiaryInformation.getNullable(
                    "originator_to_beneficiary_information"
                )

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            @JsonProperty("beneficiary_address_line1")
            @ExcludeMissing
            fun _beneficiaryAddressLine1() = beneficiaryAddressLine1

            @JsonProperty("beneficiary_address_line2")
            @ExcludeMissing
            fun _beneficiaryAddressLine2() = beneficiaryAddressLine2

            @JsonProperty("beneficiary_address_line3")
            @ExcludeMissing
            fun _beneficiaryAddressLine3() = beneficiaryAddressLine3

            @JsonProperty("beneficiary_name")
            @ExcludeMissing
            fun _beneficiaryName() = beneficiaryName

            @JsonProperty("beneficiary_reference")
            @ExcludeMissing
            fun _beneficiaryReference() = beneficiaryReference

            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonProperty("input_message_accountability_data")
            @ExcludeMissing
            fun _inputMessageAccountabilityData() = inputMessageAccountabilityData

            @JsonProperty("originator_address_line1")
            @ExcludeMissing
            fun _originatorAddressLine1() = originatorAddressLine1

            @JsonProperty("originator_address_line2")
            @ExcludeMissing
            fun _originatorAddressLine2() = originatorAddressLine2

            @JsonProperty("originator_address_line3")
            @ExcludeMissing
            fun _originatorAddressLine3() = originatorAddressLine3

            @JsonProperty("originator_name") @ExcludeMissing fun _originatorName() = originatorName

            @JsonProperty("originator_to_beneficiary_information_line1")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine1() = originatorToBeneficiaryInformationLine1

            @JsonProperty("originator_to_beneficiary_information_line2")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine2() = originatorToBeneficiaryInformationLine2

            @JsonProperty("originator_to_beneficiary_information_line3")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine3() = originatorToBeneficiaryInformationLine3

            @JsonProperty("originator_to_beneficiary_information_line4")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformationLine4() = originatorToBeneficiaryInformationLine4

            @JsonProperty("originator_to_beneficiary_information")
            @ExcludeMissing
            fun _originatorToBeneficiaryInformation() = originatorToBeneficiaryInformation

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InboundWireTransfer = apply {
                if (!validated) {
                    amount()
                    beneficiaryAddressLine1()
                    beneficiaryAddressLine2()
                    beneficiaryAddressLine3()
                    beneficiaryName()
                    beneficiaryReference()
                    description()
                    inputMessageAccountabilityData()
                    originatorAddressLine1()
                    originatorAddressLine2()
                    originatorAddressLine3()
                    originatorName()
                    originatorToBeneficiaryInformationLine1()
                    originatorToBeneficiaryInformationLine2()
                    originatorToBeneficiaryInformationLine3()
                    originatorToBeneficiaryInformationLine4()
                    originatorToBeneficiaryInformation()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InboundWireTransfer &&
                    this.amount == other.amount &&
                    this.beneficiaryAddressLine1 == other.beneficiaryAddressLine1 &&
                    this.beneficiaryAddressLine2 == other.beneficiaryAddressLine2 &&
                    this.beneficiaryAddressLine3 == other.beneficiaryAddressLine3 &&
                    this.beneficiaryName == other.beneficiaryName &&
                    this.beneficiaryReference == other.beneficiaryReference &&
                    this.description == other.description &&
                    this.inputMessageAccountabilityData == other.inputMessageAccountabilityData &&
                    this.originatorAddressLine1 == other.originatorAddressLine1 &&
                    this.originatorAddressLine2 == other.originatorAddressLine2 &&
                    this.originatorAddressLine3 == other.originatorAddressLine3 &&
                    this.originatorName == other.originatorName &&
                    this.originatorToBeneficiaryInformationLine1 ==
                        other.originatorToBeneficiaryInformationLine1 &&
                    this.originatorToBeneficiaryInformationLine2 ==
                        other.originatorToBeneficiaryInformationLine2 &&
                    this.originatorToBeneficiaryInformationLine3 ==
                        other.originatorToBeneficiaryInformationLine3 &&
                    this.originatorToBeneficiaryInformationLine4 ==
                        other.originatorToBeneficiaryInformationLine4 &&
                    this.originatorToBeneficiaryInformation ==
                        other.originatorToBeneficiaryInformation &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            beneficiaryAddressLine1,
                            beneficiaryAddressLine2,
                            beneficiaryAddressLine3,
                            beneficiaryName,
                            beneficiaryReference,
                            description,
                            inputMessageAccountabilityData,
                            originatorAddressLine1,
                            originatorAddressLine2,
                            originatorAddressLine3,
                            originatorName,
                            originatorToBeneficiaryInformationLine1,
                            originatorToBeneficiaryInformationLine2,
                            originatorToBeneficiaryInformationLine3,
                            originatorToBeneficiaryInformationLine4,
                            originatorToBeneficiaryInformation,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InboundWireTransfer{amount=$amount, beneficiaryAddressLine1=$beneficiaryAddressLine1, beneficiaryAddressLine2=$beneficiaryAddressLine2, beneficiaryAddressLine3=$beneficiaryAddressLine3, beneficiaryName=$beneficiaryName, beneficiaryReference=$beneficiaryReference, description=$description, inputMessageAccountabilityData=$inputMessageAccountabilityData, originatorAddressLine1=$originatorAddressLine1, originatorAddressLine2=$originatorAddressLine2, originatorAddressLine3=$originatorAddressLine3, originatorName=$originatorName, originatorToBeneficiaryInformationLine1=$originatorToBeneficiaryInformationLine1, originatorToBeneficiaryInformationLine2=$originatorToBeneficiaryInformationLine2, originatorToBeneficiaryInformationLine3=$originatorToBeneficiaryInformationLine3, originatorToBeneficiaryInformationLine4=$originatorToBeneficiaryInformationLine4, originatorToBeneficiaryInformation=$originatorToBeneficiaryInformation, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var beneficiaryAddressLine1: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine2: JsonField<String> = JsonMissing.of()
                private var beneficiaryAddressLine3: JsonField<String> = JsonMissing.of()
                private var beneficiaryName: JsonField<String> = JsonMissing.of()
                private var beneficiaryReference: JsonField<String> = JsonMissing.of()
                private var description: JsonField<String> = JsonMissing.of()
                private var inputMessageAccountabilityData: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine1: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine2: JsonField<String> = JsonMissing.of()
                private var originatorAddressLine3: JsonField<String> = JsonMissing.of()
                private var originatorName: JsonField<String> = JsonMissing.of()
                private var originatorToBeneficiaryInformationLine1: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine2: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine3: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformationLine4: JsonField<String> =
                    JsonMissing.of()
                private var originatorToBeneficiaryInformation: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(inboundWireTransfer: InboundWireTransfer) = apply {
                    this.amount = inboundWireTransfer.amount
                    this.beneficiaryAddressLine1 = inboundWireTransfer.beneficiaryAddressLine1
                    this.beneficiaryAddressLine2 = inboundWireTransfer.beneficiaryAddressLine2
                    this.beneficiaryAddressLine3 = inboundWireTransfer.beneficiaryAddressLine3
                    this.beneficiaryName = inboundWireTransfer.beneficiaryName
                    this.beneficiaryReference = inboundWireTransfer.beneficiaryReference
                    this.description = inboundWireTransfer.description
                    this.inputMessageAccountabilityData =
                        inboundWireTransfer.inputMessageAccountabilityData
                    this.originatorAddressLine1 = inboundWireTransfer.originatorAddressLine1
                    this.originatorAddressLine2 = inboundWireTransfer.originatorAddressLine2
                    this.originatorAddressLine3 = inboundWireTransfer.originatorAddressLine3
                    this.originatorName = inboundWireTransfer.originatorName
                    this.originatorToBeneficiaryInformationLine1 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine1
                    this.originatorToBeneficiaryInformationLine2 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine2
                    this.originatorToBeneficiaryInformationLine3 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine3
                    this.originatorToBeneficiaryInformationLine4 =
                        inboundWireTransfer.originatorToBeneficiaryInformationLine4
                    this.originatorToBeneficiaryInformation =
                        inboundWireTransfer.originatorToBeneficiaryInformation
                    additionalProperties(inboundWireTransfer.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                fun beneficiaryAddressLine1(beneficiaryAddressLine1: String) =
                    beneficiaryAddressLine1(JsonField.of(beneficiaryAddressLine1))

                @JsonProperty("beneficiary_address_line1")
                @ExcludeMissing
                fun beneficiaryAddressLine1(beneficiaryAddressLine1: JsonField<String>) = apply {
                    this.beneficiaryAddressLine1 = beneficiaryAddressLine1
                }

                fun beneficiaryAddressLine2(beneficiaryAddressLine2: String) =
                    beneficiaryAddressLine2(JsonField.of(beneficiaryAddressLine2))

                @JsonProperty("beneficiary_address_line2")
                @ExcludeMissing
                fun beneficiaryAddressLine2(beneficiaryAddressLine2: JsonField<String>) = apply {
                    this.beneficiaryAddressLine2 = beneficiaryAddressLine2
                }

                fun beneficiaryAddressLine3(beneficiaryAddressLine3: String) =
                    beneficiaryAddressLine3(JsonField.of(beneficiaryAddressLine3))

                @JsonProperty("beneficiary_address_line3")
                @ExcludeMissing
                fun beneficiaryAddressLine3(beneficiaryAddressLine3: JsonField<String>) = apply {
                    this.beneficiaryAddressLine3 = beneficiaryAddressLine3
                }

                fun beneficiaryName(beneficiaryName: String) =
                    beneficiaryName(JsonField.of(beneficiaryName))

                @JsonProperty("beneficiary_name")
                @ExcludeMissing
                fun beneficiaryName(beneficiaryName: JsonField<String>) = apply {
                    this.beneficiaryName = beneficiaryName
                }

                fun beneficiaryReference(beneficiaryReference: String) =
                    beneficiaryReference(JsonField.of(beneficiaryReference))

                @JsonProperty("beneficiary_reference")
                @ExcludeMissing
                fun beneficiaryReference(beneficiaryReference: JsonField<String>) = apply {
                    this.beneficiaryReference = beneficiaryReference
                }

                fun description(description: String) = description(JsonField.of(description))

                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun inputMessageAccountabilityData(inputMessageAccountabilityData: String) =
                    inputMessageAccountabilityData(JsonField.of(inputMessageAccountabilityData))

                @JsonProperty("input_message_accountability_data")
                @ExcludeMissing
                fun inputMessageAccountabilityData(
                    inputMessageAccountabilityData: JsonField<String>
                ) = apply { this.inputMessageAccountabilityData = inputMessageAccountabilityData }

                fun originatorAddressLine1(originatorAddressLine1: String) =
                    originatorAddressLine1(JsonField.of(originatorAddressLine1))

                @JsonProperty("originator_address_line1")
                @ExcludeMissing
                fun originatorAddressLine1(originatorAddressLine1: JsonField<String>) = apply {
                    this.originatorAddressLine1 = originatorAddressLine1
                }

                fun originatorAddressLine2(originatorAddressLine2: String) =
                    originatorAddressLine2(JsonField.of(originatorAddressLine2))

                @JsonProperty("originator_address_line2")
                @ExcludeMissing
                fun originatorAddressLine2(originatorAddressLine2: JsonField<String>) = apply {
                    this.originatorAddressLine2 = originatorAddressLine2
                }

                fun originatorAddressLine3(originatorAddressLine3: String) =
                    originatorAddressLine3(JsonField.of(originatorAddressLine3))

                @JsonProperty("originator_address_line3")
                @ExcludeMissing
                fun originatorAddressLine3(originatorAddressLine3: JsonField<String>) = apply {
                    this.originatorAddressLine3 = originatorAddressLine3
                }

                fun originatorName(originatorName: String) =
                    originatorName(JsonField.of(originatorName))

                @JsonProperty("originator_name")
                @ExcludeMissing
                fun originatorName(originatorName: JsonField<String>) = apply {
                    this.originatorName = originatorName
                }

                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: String
                ) =
                    originatorToBeneficiaryInformationLine1(
                        JsonField.of(originatorToBeneficiaryInformationLine1)
                    )

                @JsonProperty("originator_to_beneficiary_information_line1")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine1(
                    originatorToBeneficiaryInformationLine1: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine1 =
                        originatorToBeneficiaryInformationLine1
                }

                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: String
                ) =
                    originatorToBeneficiaryInformationLine2(
                        JsonField.of(originatorToBeneficiaryInformationLine2)
                    )

                @JsonProperty("originator_to_beneficiary_information_line2")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine2(
                    originatorToBeneficiaryInformationLine2: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine2 =
                        originatorToBeneficiaryInformationLine2
                }

                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: String
                ) =
                    originatorToBeneficiaryInformationLine3(
                        JsonField.of(originatorToBeneficiaryInformationLine3)
                    )

                @JsonProperty("originator_to_beneficiary_information_line3")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine3(
                    originatorToBeneficiaryInformationLine3: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine3 =
                        originatorToBeneficiaryInformationLine3
                }

                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: String
                ) =
                    originatorToBeneficiaryInformationLine4(
                        JsonField.of(originatorToBeneficiaryInformationLine4)
                    )

                @JsonProperty("originator_to_beneficiary_information_line4")
                @ExcludeMissing
                fun originatorToBeneficiaryInformationLine4(
                    originatorToBeneficiaryInformationLine4: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformationLine4 =
                        originatorToBeneficiaryInformationLine4
                }

                fun originatorToBeneficiaryInformation(originatorToBeneficiaryInformation: String) =
                    originatorToBeneficiaryInformation(
                        JsonField.of(originatorToBeneficiaryInformation)
                    )

                @JsonProperty("originator_to_beneficiary_information")
                @ExcludeMissing
                fun originatorToBeneficiaryInformation(
                    originatorToBeneficiaryInformation: JsonField<String>
                ) = apply {
                    this.originatorToBeneficiaryInformation = originatorToBeneficiaryInformation
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InboundWireTransfer =
                    InboundWireTransfer(
                        amount,
                        beneficiaryAddressLine1,
                        beneficiaryAddressLine2,
                        beneficiaryAddressLine3,
                        beneficiaryName,
                        beneficiaryReference,
                        description,
                        inputMessageAccountabilityData,
                        originatorAddressLine1,
                        originatorAddressLine2,
                        originatorAddressLine3,
                        originatorName,
                        originatorToBeneficiaryInformationLine1,
                        originatorToBeneficiaryInformationLine2,
                        originatorToBeneficiaryInformationLine3,
                        originatorToBeneficiaryInformationLine4,
                        originatorToBeneficiaryInformation,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * An Interest Payment object. This field will be present in the JSON response if and only
         * if `category` is equal to `interest_payment`.
         */
        @JsonDeserialize(builder = InterestPayment.Builder::class)
        @NoAutoDetect
        class InterestPayment
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val periodStart: JsonField<OffsetDateTime>,
            private val periodEnd: JsonField<OffsetDateTime>,
            private val accruedOnAccountId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            /** The start of the period for which this transaction paid interest. */
            fun periodStart(): OffsetDateTime = periodStart.getRequired("period_start")

            /** The end of the period for which this transaction paid interest. */
            fun periodEnd(): OffsetDateTime = periodEnd.getRequired("period_end")

            /** The account on which the interest was accrued. */
            fun accruedOnAccountId(): String? =
                accruedOnAccountId.getNullable("accrued_on_account_id")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            /** The start of the period for which this transaction paid interest. */
            @JsonProperty("period_start") @ExcludeMissing fun _periodStart() = periodStart

            /** The end of the period for which this transaction paid interest. */
            @JsonProperty("period_end") @ExcludeMissing fun _periodEnd() = periodEnd

            /** The account on which the interest was accrued. */
            @JsonProperty("accrued_on_account_id")
            @ExcludeMissing
            fun _accruedOnAccountId() = accruedOnAccountId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InterestPayment = apply {
                if (!validated) {
                    amount()
                    currency()
                    periodStart()
                    periodEnd()
                    accruedOnAccountId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InterestPayment &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.periodStart == other.periodStart &&
                    this.periodEnd == other.periodEnd &&
                    this.accruedOnAccountId == other.accruedOnAccountId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            periodStart,
                            periodEnd,
                            accruedOnAccountId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InterestPayment{amount=$amount, currency=$currency, periodStart=$periodStart, periodEnd=$periodEnd, accruedOnAccountId=$accruedOnAccountId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var periodStart: JsonField<OffsetDateTime> = JsonMissing.of()
                private var periodEnd: JsonField<OffsetDateTime> = JsonMissing.of()
                private var accruedOnAccountId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(interestPayment: InterestPayment) = apply {
                    this.amount = interestPayment.amount
                    this.currency = interestPayment.currency
                    this.periodStart = interestPayment.periodStart
                    this.periodEnd = interestPayment.periodEnd
                    this.accruedOnAccountId = interestPayment.accruedOnAccountId
                    additionalProperties(interestPayment.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                /** The start of the period for which this transaction paid interest. */
                fun periodStart(periodStart: OffsetDateTime) =
                    periodStart(JsonField.of(periodStart))

                /** The start of the period for which this transaction paid interest. */
                @JsonProperty("period_start")
                @ExcludeMissing
                fun periodStart(periodStart: JsonField<OffsetDateTime>) = apply {
                    this.periodStart = periodStart
                }

                /** The end of the period for which this transaction paid interest. */
                fun periodEnd(periodEnd: OffsetDateTime) = periodEnd(JsonField.of(periodEnd))

                /** The end of the period for which this transaction paid interest. */
                @JsonProperty("period_end")
                @ExcludeMissing
                fun periodEnd(periodEnd: JsonField<OffsetDateTime>) = apply {
                    this.periodEnd = periodEnd
                }

                /** The account on which the interest was accrued. */
                fun accruedOnAccountId(accruedOnAccountId: String) =
                    accruedOnAccountId(JsonField.of(accruedOnAccountId))

                /** The account on which the interest was accrued. */
                @JsonProperty("accrued_on_account_id")
                @ExcludeMissing
                fun accruedOnAccountId(accruedOnAccountId: JsonField<String>) = apply {
                    this.accruedOnAccountId = accruedOnAccountId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InterestPayment =
                    InterestPayment(
                        amount,
                        currency,
                        periodStart,
                        periodEnd,
                        accruedOnAccountId,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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
        }

        /**
         * An Internal Source object. This field will be present in the JSON response if and only if
         * `category` is equal to `internal_source`.
         */
        @JsonDeserialize(builder = InternalSource.Builder::class)
        @NoAutoDetect
        class InternalSource
        private constructor(
            private val amount: JsonField<Long>,
            private val currency: JsonField<Currency>,
            private val reason: JsonField<Reason>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            fun amount(): Long = amount.getRequired("amount")

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            fun currency(): Currency = currency.getRequired("currency")

            fun reason(): Reason = reason.getRequired("reason")

            /**
             * The amount in the minor unit of the transaction's currency. For dollars, for example,
             * this is cents.
             */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
             * currency.
             */
            @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

            @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): InternalSource = apply {
                if (!validated) {
                    amount()
                    currency()
                    reason()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is InternalSource &&
                    this.amount == other.amount &&
                    this.currency == other.currency &&
                    this.reason == other.reason &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            currency,
                            reason,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "InternalSource{amount=$amount, currency=$currency, reason=$reason, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var currency: JsonField<Currency> = JsonMissing.of()
                private var reason: JsonField<Reason> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(internalSource: InternalSource) = apply {
                    this.amount = internalSource.amount
                    this.currency = internalSource.currency
                    this.reason = internalSource.reason
                    additionalProperties(internalSource.additionalProperties)
                }

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /**
                 * The amount in the minor unit of the transaction's currency. For dollars, for
                 * example, this is cents.
                 */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                fun currency(currency: Currency) = currency(JsonField.of(currency))

                /**
                 * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transaction
                 * currency.
                 */
                @JsonProperty("currency")
                @ExcludeMissing
                fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

                fun reason(reason: Reason) = reason(JsonField.of(reason))

                @JsonProperty("reason")
                @ExcludeMissing
                fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): InternalSource =
                    InternalSource(
                        amount,
                        currency,
                        reason,
                        additionalProperties.toUnmodifiable(),
                    )
            }

            class Currency
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

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

            class Reason
            @JsonCreator
            private constructor(
                private val value: JsonField<String>,
            ) {

                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Reason && this.value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()

                companion object {

                    val ACCOUNT_CLOSURE = Reason(JsonField.of("account_closure"))

                    val BANK_MIGRATION = Reason(JsonField.of("bank_migration"))

                    val CASHBACK = Reason(JsonField.of("cashback"))

                    val CHECK_ADJUSTMENT = Reason(JsonField.of("check_adjustment"))

                    val COLLECTION_RECEIVABLE = Reason(JsonField.of("collection_receivable"))

                    val EMPYREAL_ADJUSTMENT = Reason(JsonField.of("empyreal_adjustment"))

                    val ERROR = Reason(JsonField.of("error"))

                    val ERROR_CORRECTION = Reason(JsonField.of("error_correction"))

                    val FEES = Reason(JsonField.of("fees"))

                    val INTEREST = Reason(JsonField.of("interest"))

                    val NEGATIVE_BALANCE_FORGIVENESS =
                        Reason(JsonField.of("negative_balance_forgiveness"))

                    val SAMPLE_FUNDS = Reason(JsonField.of("sample_funds"))

                    val SAMPLE_FUNDS_RETURN = Reason(JsonField.of("sample_funds_return"))

                    fun of(value: String) = Reason(JsonField.of(value))
                }

                enum class Known {
                    ACCOUNT_CLOSURE,
                    BANK_MIGRATION,
                    CASHBACK,
                    CHECK_ADJUSTMENT,
                    COLLECTION_RECEIVABLE,
                    EMPYREAL_ADJUSTMENT,
                    ERROR,
                    ERROR_CORRECTION,
                    FEES,
                    INTEREST,
                    NEGATIVE_BALANCE_FORGIVENESS,
                    SAMPLE_FUNDS,
                    SAMPLE_FUNDS_RETURN,
                }

                enum class Value {
                    ACCOUNT_CLOSURE,
                    BANK_MIGRATION,
                    CASHBACK,
                    CHECK_ADJUSTMENT,
                    COLLECTION_RECEIVABLE,
                    EMPYREAL_ADJUSTMENT,
                    ERROR,
                    ERROR_CORRECTION,
                    FEES,
                    INTEREST,
                    NEGATIVE_BALANCE_FORGIVENESS,
                    SAMPLE_FUNDS,
                    SAMPLE_FUNDS_RETURN,
                    _UNKNOWN,
                }

                fun value(): Value =
                    when (this) {
                        ACCOUNT_CLOSURE -> Value.ACCOUNT_CLOSURE
                        BANK_MIGRATION -> Value.BANK_MIGRATION
                        CASHBACK -> Value.CASHBACK
                        CHECK_ADJUSTMENT -> Value.CHECK_ADJUSTMENT
                        COLLECTION_RECEIVABLE -> Value.COLLECTION_RECEIVABLE
                        EMPYREAL_ADJUSTMENT -> Value.EMPYREAL_ADJUSTMENT
                        ERROR -> Value.ERROR
                        ERROR_CORRECTION -> Value.ERROR_CORRECTION
                        FEES -> Value.FEES
                        INTEREST -> Value.INTEREST
                        NEGATIVE_BALANCE_FORGIVENESS -> Value.NEGATIVE_BALANCE_FORGIVENESS
                        SAMPLE_FUNDS -> Value.SAMPLE_FUNDS
                        SAMPLE_FUNDS_RETURN -> Value.SAMPLE_FUNDS_RETURN
                        else -> Value._UNKNOWN
                    }

                fun known(): Known =
                    when (this) {
                        ACCOUNT_CLOSURE -> Known.ACCOUNT_CLOSURE
                        BANK_MIGRATION -> Known.BANK_MIGRATION
                        CASHBACK -> Known.CASHBACK
                        CHECK_ADJUSTMENT -> Known.CHECK_ADJUSTMENT
                        COLLECTION_RECEIVABLE -> Known.COLLECTION_RECEIVABLE
                        EMPYREAL_ADJUSTMENT -> Known.EMPYREAL_ADJUSTMENT
                        ERROR -> Known.ERROR
                        ERROR_CORRECTION -> Known.ERROR_CORRECTION
                        FEES -> Known.FEES
                        INTEREST -> Known.INTEREST
                        NEGATIVE_BALANCE_FORGIVENESS -> Known.NEGATIVE_BALANCE_FORGIVENESS
                        SAMPLE_FUNDS -> Known.SAMPLE_FUNDS
                        SAMPLE_FUNDS_RETURN -> Known.SAMPLE_FUNDS_RETURN
                        else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                    }

                fun asString(): String = _value().asStringOrThrow()
            }
        }

        /**
         * A Real Time Payments Transfer Acknowledgement object. This field will be present in the
         * JSON response if and only if `category` is equal to
         * `real_time_payments_transfer_acknowledgement`.
         */
        @JsonDeserialize(builder = RealTimePaymentsTransferAcknowledgement.Builder::class)
        @NoAutoDetect
        class RealTimePaymentsTransferAcknowledgement
        private constructor(
            private val amount: JsonField<Long>,
            private val destinationAccountNumber: JsonField<String>,
            private val destinationRoutingNumber: JsonField<String>,
            private val remittanceInformation: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The destination account number. */
            fun destinationAccountNumber(): String =
                destinationAccountNumber.getRequired("destination_account_number")

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun destinationRoutingNumber(): String =
                destinationRoutingNumber.getRequired("destination_routing_number")

            /** Unstructured information that will show on the recipient's bank statement. */
            fun remittanceInformation(): String =
                remittanceInformation.getRequired("remittance_information")

            /** The identifier of the Real Time Payments Transfer that led to this Transaction. */
            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The destination account number. */
            @JsonProperty("destination_account_number")
            @ExcludeMissing
            fun _destinationAccountNumber() = destinationAccountNumber

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("destination_routing_number")
            @ExcludeMissing
            fun _destinationRoutingNumber() = destinationRoutingNumber

            /** Unstructured information that will show on the recipient's bank statement. */
            @JsonProperty("remittance_information")
            @ExcludeMissing
            fun _remittanceInformation() = remittanceInformation

            /** The identifier of the Real Time Payments Transfer that led to this Transaction. */
            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): RealTimePaymentsTransferAcknowledgement = apply {
                if (!validated) {
                    amount()
                    destinationAccountNumber()
                    destinationRoutingNumber()
                    remittanceInformation()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is RealTimePaymentsTransferAcknowledgement &&
                    this.amount == other.amount &&
                    this.destinationAccountNumber == other.destinationAccountNumber &&
                    this.destinationRoutingNumber == other.destinationRoutingNumber &&
                    this.remittanceInformation == other.remittanceInformation &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            destinationAccountNumber,
                            destinationRoutingNumber,
                            remittanceInformation,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "RealTimePaymentsTransferAcknowledgement{amount=$amount, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, remittanceInformation=$remittanceInformation, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var destinationAccountNumber: JsonField<String> = JsonMissing.of()
                private var destinationRoutingNumber: JsonField<String> = JsonMissing.of()
                private var remittanceInformation: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(
                    realTimePaymentsTransferAcknowledgement: RealTimePaymentsTransferAcknowledgement
                ) = apply {
                    this.amount = realTimePaymentsTransferAcknowledgement.amount
                    this.destinationAccountNumber =
                        realTimePaymentsTransferAcknowledgement.destinationAccountNumber
                    this.destinationRoutingNumber =
                        realTimePaymentsTransferAcknowledgement.destinationRoutingNumber
                    this.remittanceInformation =
                        realTimePaymentsTransferAcknowledgement.remittanceInformation
                    this.transferId = realTimePaymentsTransferAcknowledgement.transferId
                    additionalProperties(
                        realTimePaymentsTransferAcknowledgement.additionalProperties
                    )
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The destination account number. */
                fun destinationAccountNumber(destinationAccountNumber: String) =
                    destinationAccountNumber(JsonField.of(destinationAccountNumber))

                /** The destination account number. */
                @JsonProperty("destination_account_number")
                @ExcludeMissing
                fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
                    this.destinationAccountNumber = destinationAccountNumber
                }

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                fun destinationRoutingNumber(destinationRoutingNumber: String) =
                    destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                @JsonProperty("destination_routing_number")
                @ExcludeMissing
                fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
                    this.destinationRoutingNumber = destinationRoutingNumber
                }

                /** Unstructured information that will show on the recipient's bank statement. */
                fun remittanceInformation(remittanceInformation: String) =
                    remittanceInformation(JsonField.of(remittanceInformation))

                /** Unstructured information that will show on the recipient's bank statement. */
                @JsonProperty("remittance_information")
                @ExcludeMissing
                fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                    this.remittanceInformation = remittanceInformation
                }

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Transaction.
                 */
                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                /**
                 * The identifier of the Real Time Payments Transfer that led to this Transaction.
                 */
                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): RealTimePaymentsTransferAcknowledgement =
                    RealTimePaymentsTransferAcknowledgement(
                        amount,
                        destinationAccountNumber,
                        destinationRoutingNumber,
                        remittanceInformation,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Sample Funds object. This field will be present in the JSON response if and only if
         * `category` is equal to `sample_funds`.
         */
        @JsonDeserialize(builder = SampleFunds.Builder::class)
        @NoAutoDetect
        class SampleFunds
        private constructor(
            private val originator: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** Where the sample funds came from. */
            fun originator(): String = originator.getRequired("originator")

            /** Where the sample funds came from. */
            @JsonProperty("originator") @ExcludeMissing fun _originator() = originator

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): SampleFunds = apply {
                if (!validated) {
                    originator()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SampleFunds &&
                    this.originator == other.originator &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(originator, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "SampleFunds{originator=$originator, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var originator: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(sampleFunds: SampleFunds) = apply {
                    this.originator = sampleFunds.originator
                    additionalProperties(sampleFunds.additionalProperties)
                }

                /** Where the sample funds came from. */
                fun originator(originator: String) = originator(JsonField.of(originator))

                /** Where the sample funds came from. */
                @JsonProperty("originator")
                @ExcludeMissing
                fun originator(originator: JsonField<String>) = apply {
                    this.originator = originator
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): SampleFunds =
                    SampleFunds(originator, additionalProperties.toUnmodifiable())
            }
        }

        /**
         * A Wire Transfer Intention object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_intention`.
         */
        @JsonDeserialize(builder = WireTransferIntention.Builder::class)
        @NoAutoDetect
        class WireTransferIntention
        private constructor(
            private val amount: JsonField<Long>,
            private val accountNumber: JsonField<String>,
            private val routingNumber: JsonField<String>,
            private val messageToRecipient: JsonField<String>,
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            /** The transfer amount in USD cents. */
            fun amount(): Long = amount.getRequired("amount")

            /** The destination account number. */
            fun accountNumber(): String = accountNumber.getRequired("account_number")

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            fun routingNumber(): String = routingNumber.getRequired("routing_number")

            /** The message that will show on the recipient's bank statement. */
            fun messageToRecipient(): String =
                messageToRecipient.getRequired("message_to_recipient")

            fun transferId(): String = transferId.getRequired("transfer_id")

            /** The transfer amount in USD cents. */
            @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

            /** The destination account number. */
            @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

            /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
            @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

            /** The message that will show on the recipient's bank statement. */
            @JsonProperty("message_to_recipient")
            @ExcludeMissing
            fun _messageToRecipient() = messageToRecipient

            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireTransferIntention = apply {
                if (!validated) {
                    amount()
                    accountNumber()
                    routingNumber()
                    messageToRecipient()
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireTransferIntention &&
                    this.amount == other.amount &&
                    this.accountNumber == other.accountNumber &&
                    this.routingNumber == other.routingNumber &&
                    this.messageToRecipient == other.messageToRecipient &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode =
                        Objects.hash(
                            amount,
                            accountNumber,
                            routingNumber,
                            messageToRecipient,
                            transferId,
                            additionalProperties,
                        )
                }
                return hashCode
            }

            override fun toString() =
                "WireTransferIntention{amount=$amount, accountNumber=$accountNumber, routingNumber=$routingNumber, messageToRecipient=$messageToRecipient, transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var amount: JsonField<Long> = JsonMissing.of()
                private var accountNumber: JsonField<String> = JsonMissing.of()
                private var routingNumber: JsonField<String> = JsonMissing.of()
                private var messageToRecipient: JsonField<String> = JsonMissing.of()
                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(wireTransferIntention: WireTransferIntention) = apply {
                    this.amount = wireTransferIntention.amount
                    this.accountNumber = wireTransferIntention.accountNumber
                    this.routingNumber = wireTransferIntention.routingNumber
                    this.messageToRecipient = wireTransferIntention.messageToRecipient
                    this.transferId = wireTransferIntention.transferId
                    additionalProperties(wireTransferIntention.additionalProperties)
                }

                /** The transfer amount in USD cents. */
                fun amount(amount: Long) = amount(JsonField.of(amount))

                /** The transfer amount in USD cents. */
                @JsonProperty("amount")
                @ExcludeMissing
                fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

                /** The destination account number. */
                fun accountNumber(accountNumber: String) =
                    accountNumber(JsonField.of(accountNumber))

                /** The destination account number. */
                @JsonProperty("account_number")
                @ExcludeMissing
                fun accountNumber(accountNumber: JsonField<String>) = apply {
                    this.accountNumber = accountNumber
                }

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                fun routingNumber(routingNumber: String) =
                    routingNumber(JsonField.of(routingNumber))

                /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
                @JsonProperty("routing_number")
                @ExcludeMissing
                fun routingNumber(routingNumber: JsonField<String>) = apply {
                    this.routingNumber = routingNumber
                }

                /** The message that will show on the recipient's bank statement. */
                fun messageToRecipient(messageToRecipient: String) =
                    messageToRecipient(JsonField.of(messageToRecipient))

                /** The message that will show on the recipient's bank statement. */
                @JsonProperty("message_to_recipient")
                @ExcludeMissing
                fun messageToRecipient(messageToRecipient: JsonField<String>) = apply {
                    this.messageToRecipient = messageToRecipient
                }

                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): WireTransferIntention =
                    WireTransferIntention(
                        amount,
                        accountNumber,
                        routingNumber,
                        messageToRecipient,
                        transferId,
                        additionalProperties.toUnmodifiable(),
                    )
            }
        }

        /**
         * A Wire Transfer Rejection object. This field will be present in the JSON response if and
         * only if `category` is equal to `wire_transfer_rejection`.
         */
        @JsonDeserialize(builder = WireTransferRejection.Builder::class)
        @NoAutoDetect
        class WireTransferRejection
        private constructor(
            private val transferId: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            private var hashCode: Int = 0

            fun transferId(): String = transferId.getRequired("transfer_id")

            @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): WireTransferRejection = apply {
                if (!validated) {
                    transferId()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is WireTransferRejection &&
                    this.transferId == other.transferId &&
                    this.additionalProperties == other.additionalProperties
            }

            override fun hashCode(): Int {
                if (hashCode == 0) {
                    hashCode = Objects.hash(transferId, additionalProperties)
                }
                return hashCode
            }

            override fun toString() =
                "WireTransferRejection{transferId=$transferId, additionalProperties=$additionalProperties}"

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var transferId: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(wireTransferRejection: WireTransferRejection) = apply {
                    this.transferId = wireTransferRejection.transferId
                    additionalProperties(wireTransferRejection.additionalProperties)
                }

                fun transferId(transferId: String) = transferId(JsonField.of(transferId))

                @JsonProperty("transfer_id")
                @ExcludeMissing
                fun transferId(transferId: JsonField<String>) = apply {
                    this.transferId = transferId
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    this.additionalProperties.putAll(additionalProperties)
                }

                @JsonAnySetter
                fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                    this.additionalProperties.put(key, value)
                }

                fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) =
                    apply {
                        this.additionalProperties.putAll(additionalProperties)
                    }

                fun build(): WireTransferRejection =
                    WireTransferRejection(transferId, additionalProperties.toUnmodifiable())
            }
        }
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

            val TRANSACTION = Type(JsonField.of("transaction"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            TRANSACTION,
        }

        enum class Value {
            TRANSACTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                TRANSACTION -> Value.TRANSACTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                TRANSACTION -> Known.TRANSACTION
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
