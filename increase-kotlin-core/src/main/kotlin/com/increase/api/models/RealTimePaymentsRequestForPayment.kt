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
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network. A request for payment is a request to the
 * receiver to send funds to your account. The permitted uses of Requests For Payment are limited by
 * the Real-Time Payments network to business-to-business payments and transfers between two
 * accounts at different banks owned by the same individual. Please contact
 * [support@increase.com](mailto:support@increase.com) to enable this API for your team.
 */
@JsonDeserialize(builder = RealTimePaymentsRequestForPayment.Builder::class)
@NoAutoDetect
class RealTimePaymentsRequestForPayment
private constructor(
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val debtorName: JsonField<String>,
    private val destinationAccountNumberId: JsonField<String>,
    private val expiresAt: JsonField<LocalDate>,
    private val fulfillmentTransactionId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val refusal: JsonField<Refusal>,
    private val rejection: JsonField<Rejection>,
    private val remittanceInformation: JsonField<String>,
    private val sourceAccountNumber: JsonField<String>,
    private val sourceRoutingNumber: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The name of the recipient the sender is requesting a transfer from. */
    fun debtorName(): String = debtorName.getRequired("debtor_name")

    /** The Account Number in which a successful transfer will arrive. */
    fun destinationAccountNumberId(): String =
        destinationAccountNumberId.getRequired("destination_account_number_id")

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    fun expiresAt(): LocalDate = expiresAt.getRequired("expires_at")

    /** The transaction that fulfilled this request. */
    fun fulfillmentTransactionId(): String? =
        fulfillmentTransactionId.getNullable("fulfillment_transaction_id")

    /** The Real-Time Payments Request for Payment's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    fun refusal(): Refusal? = refusal.getNullable("refusal")

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    fun rejection(): Rejection? = rejection.getNullable("rejection")

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String =
        remittanceInformation.getRequired("remittance_information")

    /** The account number the request is sent to. */
    fun sourceAccountNumber(): String = sourceAccountNumber.getRequired("source_account_number")

    /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun sourceRoutingNumber(): String = sourceRoutingNumber.getRequired("source_routing_number")

    /** The lifecycle status of the request for payment. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    fun submission(): Submission? = submission.getNullable("submission")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     */
    fun type(): Type = type.getRequired("type")

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request for
     * payment was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The name of the recipient the sender is requesting a transfer from. */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

    /** The Account Number in which a successful transfer will arrive. */
    @JsonProperty("destination_account_number_id")
    @ExcludeMissing
    fun _destinationAccountNumberId() = destinationAccountNumberId

    /**
     * The expiration time for this request, in UTC. The requestee will not be able to pay after
     * this date.
     */
    @JsonProperty("expires_at") @ExcludeMissing fun _expiresAt() = expiresAt

    /** The transaction that fulfilled this request. */
    @JsonProperty("fulfillment_transaction_id")
    @ExcludeMissing
    fun _fulfillmentTransactionId() = fulfillmentTransactionId

    /** The Real-Time Payments Request for Payment's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    @JsonProperty("refusal") @ExcludeMissing fun _refusal() = refusal

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection() = rejection

    /** Unstructured information that will show on the recipient's bank statement. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The account number the request is sent to. */
    @JsonProperty("source_account_number")
    @ExcludeMissing
    fun _sourceAccountNumber() = sourceAccountNumber

    /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("source_routing_number")
    @ExcludeMissing
    fun _sourceRoutingNumber() = sourceRoutingNumber

    /** The lifecycle status of the request for payment. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_request_for_payment`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RealTimePaymentsRequestForPayment = apply {
        if (!validated) {
            amount()
            createdAt()
            currency()
            debtorName()
            destinationAccountNumberId()
            expiresAt()
            fulfillmentTransactionId()
            id()
            idempotencyKey()
            refusal()?.validate()
            rejection()?.validate()
            remittanceInformation()
            sourceAccountNumber()
            sourceRoutingNumber()
            status()
            submission()?.validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var debtorName: JsonField<String> = JsonMissing.of()
        private var destinationAccountNumberId: JsonField<String> = JsonMissing.of()
        private var expiresAt: JsonField<LocalDate> = JsonMissing.of()
        private var fulfillmentTransactionId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var refusal: JsonField<Refusal> = JsonMissing.of()
        private var rejection: JsonField<Rejection> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var sourceAccountNumber: JsonField<String> = JsonMissing.of()
        private var sourceRoutingNumber: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(realTimePaymentsRequestForPayment: RealTimePaymentsRequestForPayment) =
            apply {
                amount = realTimePaymentsRequestForPayment.amount
                createdAt = realTimePaymentsRequestForPayment.createdAt
                currency = realTimePaymentsRequestForPayment.currency
                debtorName = realTimePaymentsRequestForPayment.debtorName
                destinationAccountNumberId =
                    realTimePaymentsRequestForPayment.destinationAccountNumberId
                expiresAt = realTimePaymentsRequestForPayment.expiresAt
                fulfillmentTransactionId =
                    realTimePaymentsRequestForPayment.fulfillmentTransactionId
                id = realTimePaymentsRequestForPayment.id
                idempotencyKey = realTimePaymentsRequestForPayment.idempotencyKey
                refusal = realTimePaymentsRequestForPayment.refusal
                rejection = realTimePaymentsRequestForPayment.rejection
                remittanceInformation = realTimePaymentsRequestForPayment.remittanceInformation
                sourceAccountNumber = realTimePaymentsRequestForPayment.sourceAccountNumber
                sourceRoutingNumber = realTimePaymentsRequestForPayment.sourceRoutingNumber
                status = realTimePaymentsRequestForPayment.status
                submission = realTimePaymentsRequestForPayment.submission
                type = realTimePaymentsRequestForPayment.type
                additionalProperties =
                    realTimePaymentsRequestForPayment.additionalProperties.toMutableMap()
            }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the request
         * for payment was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For real-time payments transfers this is always equal to `USD`.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The name of the recipient the sender is requesting a transfer from. */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /** The name of the recipient the sender is requesting a transfer from. */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The Account Number in which a successful transfer will arrive. */
        fun destinationAccountNumberId(destinationAccountNumberId: String) =
            destinationAccountNumberId(JsonField.of(destinationAccountNumberId))

        /** The Account Number in which a successful transfer will arrive. */
        @JsonProperty("destination_account_number_id")
        @ExcludeMissing
        fun destinationAccountNumberId(destinationAccountNumberId: JsonField<String>) = apply {
            this.destinationAccountNumberId = destinationAccountNumberId
        }

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        fun expiresAt(expiresAt: LocalDate) = expiresAt(JsonField.of(expiresAt))

        /**
         * The expiration time for this request, in UTC. The requestee will not be able to pay after
         * this date.
         */
        @JsonProperty("expires_at")
        @ExcludeMissing
        fun expiresAt(expiresAt: JsonField<LocalDate>) = apply { this.expiresAt = expiresAt }

        /** The transaction that fulfilled this request. */
        fun fulfillmentTransactionId(fulfillmentTransactionId: String) =
            fulfillmentTransactionId(JsonField.of(fulfillmentTransactionId))

        /** The transaction that fulfilled this request. */
        @JsonProperty("fulfillment_transaction_id")
        @ExcludeMissing
        fun fulfillmentTransactionId(fulfillmentTransactionId: JsonField<String>) = apply {
            this.fulfillmentTransactionId = fulfillmentTransactionId
        }

        /** The Real-Time Payments Request for Payment's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Payments Request for Payment's identifier. */
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
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        fun refusal(refusal: Refusal) = refusal(JsonField.of(refusal))

        /**
         * If the request for payment is refused by the destination financial institution or the
         * receiving customer, this will contain supplemental details.
         */
        @JsonProperty("refusal")
        @ExcludeMissing
        fun refusal(refusal: JsonField<Refusal>) = apply { this.refusal = refusal }

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

        /**
         * If the request for payment is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        @JsonProperty("rejection")
        @ExcludeMissing
        fun rejection(rejection: JsonField<Rejection>) = apply { this.rejection = rejection }

        /** Unstructured information that will show on the recipient's bank statement. */
        fun remittanceInformation(remittanceInformation: String) =
            remittanceInformation(JsonField.of(remittanceInformation))

        /** Unstructured information that will show on the recipient's bank statement. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The account number the request is sent to. */
        fun sourceAccountNumber(sourceAccountNumber: String) =
            sourceAccountNumber(JsonField.of(sourceAccountNumber))

        /** The account number the request is sent to. */
        @JsonProperty("source_account_number")
        @ExcludeMissing
        fun sourceAccountNumber(sourceAccountNumber: JsonField<String>) = apply {
            this.sourceAccountNumber = sourceAccountNumber
        }

        /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun sourceRoutingNumber(sourceRoutingNumber: String) =
            sourceRoutingNumber(JsonField.of(sourceRoutingNumber))

        /** The receiver's American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("source_routing_number")
        @ExcludeMissing
        fun sourceRoutingNumber(sourceRoutingNumber: JsonField<String>) = apply {
            this.sourceRoutingNumber = sourceRoutingNumber
        }

        /** The lifecycle status of the request for payment. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the request for payment. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the request for payment is submitted to Real-Time Payments, this will contain
         * supplemental details.
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_request_for_payment`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_request_for_payment`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
            this.additionalProperties.clear()
            putAllAdditionalProperties(additionalProperties)
        }

        @JsonAnySetter
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

        fun build(): RealTimePaymentsRequestForPayment =
            RealTimePaymentsRequestForPayment(
                amount,
                createdAt,
                currency,
                debtorName,
                destinationAccountNumberId,
                expiresAt,
                fulfillmentTransactionId,
                id,
                idempotencyKey,
                refusal,
                rejection,
                remittanceInformation,
                sourceAccountNumber,
                sourceRoutingNumber,
                status,
                submission,
                type,
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

    /**
     * If the request for payment is refused by the destination financial institution or the
     * receiving customer, this will contain supplemental details.
     */
    @JsonDeserialize(builder = Refusal.Builder::class)
    @NoAutoDetect
    class Refusal
    private constructor(
        private val refusalReasonCode: JsonField<RefusalReasonCode>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         */
        fun refusalReasonCode(): RefusalReasonCode =
            refusalReasonCode.getRequired("refusal_reason_code")

        /**
         * The reason the request for payment was refused as provided by the recipient bank or the
         * customer.
         */
        @JsonProperty("refusal_reason_code")
        @ExcludeMissing
        fun _refusalReasonCode() = refusalReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Refusal = apply {
            if (!validated) {
                refusalReasonCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var refusalReasonCode: JsonField<RefusalReasonCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(refusal: Refusal) = apply {
                refusalReasonCode = refusal.refusalReasonCode
                additionalProperties = refusal.additionalProperties.toMutableMap()
            }

            /**
             * The reason the request for payment was refused as provided by the recipient bank or
             * the customer.
             */
            fun refusalReasonCode(refusalReasonCode: RefusalReasonCode) =
                refusalReasonCode(JsonField.of(refusalReasonCode))

            /**
             * The reason the request for payment was refused as provided by the recipient bank or
             * the customer.
             */
            @JsonProperty("refusal_reason_code")
            @ExcludeMissing
            fun refusalReasonCode(refusalReasonCode: JsonField<RefusalReasonCode>) = apply {
                this.refusalReasonCode = refusalReasonCode
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Refusal = Refusal(refusalReasonCode, additionalProperties.toImmutable())
        }

        class RefusalReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT_BLOCKED = of("account_blocked")

                val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                val UNEXPECTED_AMOUNT = of("unexpected_amount")

                val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                val CREDITOR_IDENTIFIER_INCORRECT = of("creditor_identifier_incorrect")

                val REQUESTED_BY_CUSTOMER = of("requested_by_customer")

                val ORDER_REJECTED = of("order_rejected")

                val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                val CUSTOMER_HAS_OPTED_OUT = of("customer_has_opted_out")

                val OTHER = of("other")

                fun of(value: String) = RefusalReasonCode(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_BLOCKED,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_DEBTOR_ADDRESS,
                INVALID_CREDITOR_ADDRESS,
                CREDITOR_IDENTIFIER_INCORRECT,
                REQUESTED_BY_CUSTOMER,
                ORDER_REJECTED,
                END_CUSTOMER_DECEASED,
                CUSTOMER_HAS_OPTED_OUT,
                OTHER,
            }

            enum class Value {
                ACCOUNT_BLOCKED,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_DEBTOR_ADDRESS,
                INVALID_CREDITOR_ADDRESS,
                CREDITOR_IDENTIFIER_INCORRECT,
                REQUESTED_BY_CUSTOMER,
                ORDER_REJECTED,
                END_CUSTOMER_DECEASED,
                CUSTOMER_HAS_OPTED_OUT,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_BLOCKED -> Value.ACCOUNT_BLOCKED
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Value.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Value.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    CREDITOR_IDENTIFIER_INCORRECT -> Value.CREDITOR_IDENTIFIER_INCORRECT
                    REQUESTED_BY_CUSTOMER -> Value.REQUESTED_BY_CUSTOMER
                    ORDER_REJECTED -> Value.ORDER_REJECTED
                    END_CUSTOMER_DECEASED -> Value.END_CUSTOMER_DECEASED
                    CUSTOMER_HAS_OPTED_OUT -> Value.CUSTOMER_HAS_OPTED_OUT
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_BLOCKED -> Known.ACCOUNT_BLOCKED
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Known.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Known.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    CREDITOR_IDENTIFIER_INCORRECT -> Known.CREDITOR_IDENTIFIER_INCORRECT
                    REQUESTED_BY_CUSTOMER -> Known.REQUESTED_BY_CUSTOMER
                    ORDER_REJECTED -> Known.ORDER_REJECTED
                    END_CUSTOMER_DECEASED -> Known.END_CUSTOMER_DECEASED
                    CUSTOMER_HAS_OPTED_OUT -> Known.CUSTOMER_HAS_OPTED_OUT
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown RefusalReasonCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RefusalReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Refusal && refusalReasonCode == other.refusalReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(refusalReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Refusal{refusalReasonCode=$refusalReasonCode, additionalProperties=$additionalProperties}"
    }

    /**
     * If the request for payment is rejected by Real-Time Payments or the destination financial
     * institution, this will contain supplemental details.
     */
    @JsonDeserialize(builder = Rejection.Builder::class)
    @NoAutoDetect
    class Rejection
    private constructor(
        private val rejectReasonCode: JsonField<RejectReasonCode>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * The reason the request for payment was rejected as provided by the recipient bank or the
         * Real-Time Payments network.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode() = rejectReasonCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (!validated) {
                rejectReasonCode()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rejection: Rejection) = apply {
                rejectReasonCode = rejection.rejectReasonCode
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /**
             * The reason the request for payment was rejected as provided by the recipient bank or
             * the Real-Time Payments network.
             */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /**
             * The reason the request for payment was rejected as provided by the recipient bank or
             * the Real-Time Payments network.
             */
            @JsonProperty("reject_reason_code")
            @ExcludeMissing
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
            }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Rejection = Rejection(rejectReasonCode, additionalProperties.toImmutable())
        }

        class RejectReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val ACCOUNT_CLOSED = of("account_closed")

                val ACCOUNT_BLOCKED = of("account_blocked")

                val INVALID_CREDITOR_ACCOUNT_TYPE = of("invalid_creditor_account_type")

                val INVALID_CREDITOR_ACCOUNT_NUMBER = of("invalid_creditor_account_number")

                val INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER =
                    of("invalid_creditor_financial_institution_identifier")

                val END_CUSTOMER_DECEASED = of("end_customer_deceased")

                val NARRATIVE = of("narrative")

                val TRANSACTION_FORBIDDEN = of("transaction_forbidden")

                val TRANSACTION_TYPE_NOT_SUPPORTED = of("transaction_type_not_supported")

                val UNEXPECTED_AMOUNT = of("unexpected_amount")

                val AMOUNT_EXCEEDS_BANK_LIMITS = of("amount_exceeds_bank_limits")

                val INVALID_CREDITOR_ADDRESS = of("invalid_creditor_address")

                val UNKNOWN_END_CUSTOMER = of("unknown_end_customer")

                val INVALID_DEBTOR_ADDRESS = of("invalid_debtor_address")

                val TIMEOUT = of("timeout")

                val UNSUPPORTED_MESSAGE_FOR_RECIPIENT = of("unsupported_message_for_recipient")

                val RECIPIENT_CONNECTION_NOT_AVAILABLE = of("recipient_connection_not_available")

                val REAL_TIME_PAYMENTS_SUSPENDED = of("real_time_payments_suspended")

                val INSTRUCTED_AGENT_SIGNED_OFF = of("instructed_agent_signed_off")

                val PROCESSING_ERROR = of("processing_error")

                val OTHER = of("other")

                fun of(value: String) = RejectReasonCode(JsonField.of(value))
            }

            enum class Known {
                ACCOUNT_CLOSED,
                ACCOUNT_BLOCKED,
                INVALID_CREDITOR_ACCOUNT_TYPE,
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                END_CUSTOMER_DECEASED,
                NARRATIVE,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_CREDITOR_ADDRESS,
                UNKNOWN_END_CUSTOMER,
                INVALID_DEBTOR_ADDRESS,
                TIMEOUT,
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                REAL_TIME_PAYMENTS_SUSPENDED,
                INSTRUCTED_AGENT_SIGNED_OFF,
                PROCESSING_ERROR,
                OTHER,
            }

            enum class Value {
                ACCOUNT_CLOSED,
                ACCOUNT_BLOCKED,
                INVALID_CREDITOR_ACCOUNT_TYPE,
                INVALID_CREDITOR_ACCOUNT_NUMBER,
                INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER,
                END_CUSTOMER_DECEASED,
                NARRATIVE,
                TRANSACTION_FORBIDDEN,
                TRANSACTION_TYPE_NOT_SUPPORTED,
                UNEXPECTED_AMOUNT,
                AMOUNT_EXCEEDS_BANK_LIMITS,
                INVALID_CREDITOR_ADDRESS,
                UNKNOWN_END_CUSTOMER,
                INVALID_DEBTOR_ADDRESS,
                TIMEOUT,
                UNSUPPORTED_MESSAGE_FOR_RECIPIENT,
                RECIPIENT_CONNECTION_NOT_AVAILABLE,
                REAL_TIME_PAYMENTS_SUSPENDED,
                INSTRUCTED_AGENT_SIGNED_OFF,
                PROCESSING_ERROR,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    ACCOUNT_CLOSED -> Value.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Value.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Value.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Value.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Value.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Value.END_CUSTOMER_DECEASED
                    NARRATIVE -> Value.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Value.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Value.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Value.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Value.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Value.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Value.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Value.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Value.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Value.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Value.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Value.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Value.INSTRUCTED_AGENT_SIGNED_OFF
                    PROCESSING_ERROR -> Value.PROCESSING_ERROR
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    ACCOUNT_CLOSED -> Known.ACCOUNT_CLOSED
                    ACCOUNT_BLOCKED -> Known.ACCOUNT_BLOCKED
                    INVALID_CREDITOR_ACCOUNT_TYPE -> Known.INVALID_CREDITOR_ACCOUNT_TYPE
                    INVALID_CREDITOR_ACCOUNT_NUMBER -> Known.INVALID_CREDITOR_ACCOUNT_NUMBER
                    INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER ->
                        Known.INVALID_CREDITOR_FINANCIAL_INSTITUTION_IDENTIFIER
                    END_CUSTOMER_DECEASED -> Known.END_CUSTOMER_DECEASED
                    NARRATIVE -> Known.NARRATIVE
                    TRANSACTION_FORBIDDEN -> Known.TRANSACTION_FORBIDDEN
                    TRANSACTION_TYPE_NOT_SUPPORTED -> Known.TRANSACTION_TYPE_NOT_SUPPORTED
                    UNEXPECTED_AMOUNT -> Known.UNEXPECTED_AMOUNT
                    AMOUNT_EXCEEDS_BANK_LIMITS -> Known.AMOUNT_EXCEEDS_BANK_LIMITS
                    INVALID_CREDITOR_ADDRESS -> Known.INVALID_CREDITOR_ADDRESS
                    UNKNOWN_END_CUSTOMER -> Known.UNKNOWN_END_CUSTOMER
                    INVALID_DEBTOR_ADDRESS -> Known.INVALID_DEBTOR_ADDRESS
                    TIMEOUT -> Known.TIMEOUT
                    UNSUPPORTED_MESSAGE_FOR_RECIPIENT -> Known.UNSUPPORTED_MESSAGE_FOR_RECIPIENT
                    RECIPIENT_CONNECTION_NOT_AVAILABLE -> Known.RECIPIENT_CONNECTION_NOT_AVAILABLE
                    REAL_TIME_PAYMENTS_SUSPENDED -> Known.REAL_TIME_PAYMENTS_SUSPENDED
                    INSTRUCTED_AGENT_SIGNED_OFF -> Known.INSTRUCTED_AGENT_SIGNED_OFF
                    PROCESSING_ERROR -> Known.PROCESSING_ERROR
                    OTHER -> Known.OTHER
                    else -> throw IncreaseInvalidDataException("Unknown RejectReasonCode: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is RejectReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Rejection && rejectReasonCode == other.rejectReasonCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejectReasonCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonCode=$rejectReasonCode, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING_SUBMISSION = of("pending_submission")

            val PENDING_RESPONSE = of("pending_response")

            val REJECTED = of("rejected")

            val ACCEPTED = of("accepted")

            val REFUSED = of("refused")

            val FULFILLED = of("fulfilled")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_SUBMISSION,
            PENDING_RESPONSE,
            REJECTED,
            ACCEPTED,
            REFUSED,
            FULFILLED,
        }

        enum class Value {
            PENDING_SUBMISSION,
            PENDING_RESPONSE,
            REJECTED,
            ACCEPTED,
            REFUSED,
            FULFILLED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_RESPONSE -> Value.PENDING_RESPONSE
                REJECTED -> Value.REJECTED
                ACCEPTED -> Value.ACCEPTED
                REFUSED -> Value.REFUSED
                FULFILLED -> Value.FULFILLED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_RESPONSE -> Known.PENDING_RESPONSE
                REJECTED -> Known.REJECTED
                ACCEPTED -> Known.ACCEPTED
                REFUSED -> Known.REFUSED
                FULFILLED -> Known.FULFILLED
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

    /**
     * After the request for payment is submitted to Real-Time Payments, this will contain
     * supplemental details.
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val paymentInformationIdentification: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** The Real-Time Payments payment information identification of the request. */
        fun paymentInformationIdentification(): String =
            paymentInformationIdentification.getRequired("payment_information_identification")

        /** The Real-Time Payments payment information identification of the request. */
        @JsonProperty("payment_information_identification")
        @ExcludeMissing
        fun _paymentInformationIdentification() = paymentInformationIdentification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (!validated) {
                paymentInformationIdentification()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var paymentInformationIdentification: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                paymentInformationIdentification = submission.paymentInformationIdentification
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /** The Real-Time Payments payment information identification of the request. */
            fun paymentInformationIdentification(paymentInformationIdentification: String) =
                paymentInformationIdentification(JsonField.of(paymentInformationIdentification))

            /** The Real-Time Payments payment information identification of the request. */
            @JsonProperty("payment_information_identification")
            @ExcludeMissing
            fun paymentInformationIdentification(
                paymentInformationIdentification: JsonField<String>
            ) = apply { this.paymentInformationIdentification = paymentInformationIdentification }

            fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.clear()
                putAllAdditionalProperties(additionalProperties)
            }

            @JsonAnySetter
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

            fun build(): Submission =
                Submission(paymentInformationIdentification, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && paymentInformationIdentification == other.paymentInformationIdentification && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(paymentInformationIdentification, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{paymentInformationIdentification=$paymentInformationIdentification, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT =
                of("real_time_payments_request_for_payment")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT,
        }

        enum class Value {
            REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Value.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT ->
                    Known.REAL_TIME_PAYMENTS_REQUEST_FOR_PAYMENT
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

        return /* spotless:off */ other is RealTimePaymentsRequestForPayment && amount == other.amount && createdAt == other.createdAt && currency == other.currency && debtorName == other.debtorName && destinationAccountNumberId == other.destinationAccountNumberId && expiresAt == other.expiresAt && fulfillmentTransactionId == other.fulfillmentTransactionId && id == other.id && idempotencyKey == other.idempotencyKey && refusal == other.refusal && rejection == other.rejection && remittanceInformation == other.remittanceInformation && sourceAccountNumber == other.sourceAccountNumber && sourceRoutingNumber == other.sourceRoutingNumber && status == other.status && submission == other.submission && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(amount, createdAt, currency, debtorName, destinationAccountNumberId, expiresAt, fulfillmentTransactionId, id, idempotencyKey, refusal, rejection, remittanceInformation, sourceAccountNumber, sourceRoutingNumber, status, submission, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimePaymentsRequestForPayment{amount=$amount, createdAt=$createdAt, currency=$currency, debtorName=$debtorName, destinationAccountNumberId=$destinationAccountNumberId, expiresAt=$expiresAt, fulfillmentTransactionId=$fulfillmentTransactionId, id=$id, idempotencyKey=$idempotencyKey, refusal=$refusal, rejection=$rejection, remittanceInformation=$remittanceInformation, sourceAccountNumber=$sourceAccountNumber, sourceRoutingNumber=$sourceRoutingNumber, status=$status, submission=$submission, type=$type, additionalProperties=$additionalProperties}"
}
