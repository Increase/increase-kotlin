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
import java.time.OffsetDateTime
import java.util.Objects

/**
 * Real-Time Payments transfers move funds, within seconds, between your Increase account and any
 * other account on the Real-Time Payments network.
 */
@JsonDeserialize(builder = RealTimePaymentsTransfer.Builder::class)
@NoAutoDetect
class RealTimePaymentsTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val acknowledgement: JsonField<Acknowledgement>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val creditorName: JsonField<String>,
    private val currency: JsonField<Currency>,
    private val debtorName: JsonField<String>,
    private val destinationAccountNumber: JsonField<String>,
    private val destinationRoutingNumber: JsonField<String>,
    private val externalAccountId: JsonField<String>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val pendingTransactionId: JsonField<String>,
    private val rejection: JsonField<Rejection>,
    private val remittanceInformation: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val ultimateCreditorName: JsonField<String>,
    private val ultimateDebtorName: JsonField<String>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    /** The Account from which the transfer was sent. */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    fun acknowledgement(): Acknowledgement? = acknowledgement.getNullable("acknowledgement")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    fun approval(): Approval? = approval.getNullable("approval")

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    fun cancellation(): Cancellation? = cancellation.getNullable("cancellation")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): CreatedBy? = createdBy.getNullable("created_by")

    /**
     * The name of the transfer's recipient. This is set by the sender when creating the transfer.
     */
    fun creditorName(): String = creditorName.getRequired("creditor_name")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    fun debtorName(): String? = debtorName.getNullable("debtor_name")

    /** The destination account number. */
    fun destinationAccountNumber(): String =
        destinationAccountNumber.getRequired("destination_account_number")

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun destinationRoutingNumber(): String =
        destinationRoutingNumber.getRequired("destination_routing_number")

    /** The identifier of the External Account the transfer was made to, if any. */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /** The Real-Time Payments Transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): String? = pendingTransactionId.getNullable("pending_transaction_id")

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    fun rejection(): Rejection? = rejection.getNullable("rejection")

    /** Unstructured information that will show on the recipient's bank statement. */
    fun remittanceInformation(): String =
        remittanceInformation.getRequired("remittance_information")

    /** The Account Number the recipient will see as having sent the transfer. */
    fun sourceAccountNumberId(): String =
        sourceAccountNumberId.getRequired("source_account_number_id")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    fun submission(): Submission? = submission.getNullable("submission")

    /** The Transaction funding the transfer once it is complete. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    fun ultimateCreditorName(): String? = ultimateCreditorName.getNullable("ultimate_creditor_name")

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    fun ultimateDebtorName(): String? = ultimateDebtorName.getNullable("ultimate_debtor_name")

    /** The Account from which the transfer was sent. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    @JsonProperty("acknowledgement") @ExcludeMissing fun _acknowledgement() = acknowledgement

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval() = approval

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation") @ExcludeMissing fun _cancellation() = cancellation

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /**
     * The name of the transfer's recipient. This is set by the sender when creating the transfer.
     */
    @JsonProperty("creditor_name") @ExcludeMissing fun _creditorName() = creditorName

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * real-time payments transfers this is always equal to `USD`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /**
     * The name of the transfer's sender. If not provided, defaults to the name of the account's
     * entity.
     */
    @JsonProperty("debtor_name") @ExcludeMissing fun _debtorName() = debtorName

    /** The destination account number. */
    @JsonProperty("destination_account_number")
    @ExcludeMissing
    fun _destinationAccountNumber() = destinationAccountNumber

    /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("destination_routing_number")
    @ExcludeMissing
    fun _destinationRoutingNumber() = destinationRoutingNumber

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /** The Real-Time Payments Transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId() = pendingTransactionId

    /**
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @JsonProperty("rejection") @ExcludeMissing fun _rejection() = rejection

    /** Unstructured information that will show on the recipient's bank statement. */
    @JsonProperty("remittance_information")
    @ExcludeMissing
    fun _remittanceInformation() = remittanceInformation

    /** The Account Number the recipient will see as having sent the transfer. */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId() = sourceAccountNumberId

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /** The Transaction funding the transfer once it is complete. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `real_time_payments_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    /**
     * The name of the ultimate recipient of the transfer. Set this if the creditor is an
     * intermediary receiving the payment for someone else.
     */
    @JsonProperty("ultimate_creditor_name")
    @ExcludeMissing
    fun _ultimateCreditorName() = ultimateCreditorName

    /**
     * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
     * behalf of someone who is not the account holder at Increase.
     */
    @JsonProperty("ultimate_debtor_name")
    @ExcludeMissing
    fun _ultimateDebtorName() = ultimateDebtorName

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): RealTimePaymentsTransfer = apply {
        if (!validated) {
            accountId()
            acknowledgement()?.validate()
            amount()
            approval()?.validate()
            cancellation()?.validate()
            createdAt()
            createdBy()?.validate()
            creditorName()
            currency()
            debtorName()
            destinationAccountNumber()
            destinationRoutingNumber()
            externalAccountId()
            id()
            idempotencyKey()
            pendingTransactionId()
            rejection()?.validate()
            remittanceInformation()
            sourceAccountNumberId()
            status()
            submission()?.validate()
            transactionId()
            type()
            ultimateCreditorName()
            ultimateDebtorName()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var acknowledgement: JsonField<Acknowledgement> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<CreatedBy> = JsonMissing.of()
        private var creditorName: JsonField<String> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var debtorName: JsonField<String> = JsonMissing.of()
        private var destinationAccountNumber: JsonField<String> = JsonMissing.of()
        private var destinationRoutingNumber: JsonField<String> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var rejection: JsonField<Rejection> = JsonMissing.of()
        private var remittanceInformation: JsonField<String> = JsonMissing.of()
        private var sourceAccountNumberId: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var ultimateCreditorName: JsonField<String> = JsonMissing.of()
        private var ultimateDebtorName: JsonField<String> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(realTimePaymentsTransfer: RealTimePaymentsTransfer) = apply {
            accountId = realTimePaymentsTransfer.accountId
            acknowledgement = realTimePaymentsTransfer.acknowledgement
            amount = realTimePaymentsTransfer.amount
            approval = realTimePaymentsTransfer.approval
            cancellation = realTimePaymentsTransfer.cancellation
            createdAt = realTimePaymentsTransfer.createdAt
            createdBy = realTimePaymentsTransfer.createdBy
            creditorName = realTimePaymentsTransfer.creditorName
            currency = realTimePaymentsTransfer.currency
            debtorName = realTimePaymentsTransfer.debtorName
            destinationAccountNumber = realTimePaymentsTransfer.destinationAccountNumber
            destinationRoutingNumber = realTimePaymentsTransfer.destinationRoutingNumber
            externalAccountId = realTimePaymentsTransfer.externalAccountId
            id = realTimePaymentsTransfer.id
            idempotencyKey = realTimePaymentsTransfer.idempotencyKey
            pendingTransactionId = realTimePaymentsTransfer.pendingTransactionId
            rejection = realTimePaymentsTransfer.rejection
            remittanceInformation = realTimePaymentsTransfer.remittanceInformation
            sourceAccountNumberId = realTimePaymentsTransfer.sourceAccountNumberId
            status = realTimePaymentsTransfer.status
            submission = realTimePaymentsTransfer.submission
            transactionId = realTimePaymentsTransfer.transactionId
            type = realTimePaymentsTransfer.type
            ultimateCreditorName = realTimePaymentsTransfer.ultimateCreditorName
            ultimateDebtorName = realTimePaymentsTransfer.ultimateDebtorName
            additionalProperties = realTimePaymentsTransfer.additionalProperties.toMutableMap()
        }

        /** The Account from which the transfer was sent. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account from which the transfer was sent. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /**
         * If the transfer is acknowledged by the recipient bank, this will contain supplemental
         * details.
         */
        fun acknowledgement(acknowledgement: Acknowledgement) =
            acknowledgement(JsonField.of(acknowledgement))

        /**
         * If the transfer is acknowledged by the recipient bank, this will contain supplemental
         * details.
         */
        @JsonProperty("acknowledgement")
        @ExcludeMissing
        fun acknowledgement(acknowledgement: JsonField<Acknowledgement>) = apply {
            this.acknowledgement = acknowledgement
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval) = approval(JsonField.of(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        @JsonProperty("approval")
        @ExcludeMissing
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation) = cancellation(JsonField.of(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        @JsonProperty("cancellation")
        @ExcludeMissing
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
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
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy) = createdBy(JsonField.of(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        @JsonProperty("created_by")
        @ExcludeMissing
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * The name of the transfer's recipient. This is set by the sender when creating the
         * transfer.
         */
        fun creditorName(creditorName: String) = creditorName(JsonField.of(creditorName))

        /**
         * The name of the transfer's recipient. This is set by the sender when creating the
         * transfer.
         */
        @JsonProperty("creditor_name")
        @ExcludeMissing
        fun creditorName(creditorName: JsonField<String>) = apply {
            this.creditorName = creditorName
        }

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

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

        /**
         * The name of the transfer's sender. If not provided, defaults to the name of the account's
         * entity.
         */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

        /** The destination account number. */
        fun destinationAccountNumber(destinationAccountNumber: String) =
            destinationAccountNumber(JsonField.of(destinationAccountNumber))

        /** The destination account number. */
        @JsonProperty("destination_account_number")
        @ExcludeMissing
        fun destinationAccountNumber(destinationAccountNumber: JsonField<String>) = apply {
            this.destinationAccountNumber = destinationAccountNumber
        }

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun destinationRoutingNumber(destinationRoutingNumber: String) =
            destinationRoutingNumber(JsonField.of(destinationRoutingNumber))

        /** The destination American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("destination_routing_number")
        @ExcludeMissing
        fun destinationRoutingNumber(destinationRoutingNumber: JsonField<String>) = apply {
            this.destinationRoutingNumber = destinationRoutingNumber
        }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The Real-Time Payments Transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Real-Time Payments Transfer's identifier. */
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
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String) =
            pendingTransactionId(JsonField.of(pendingTransactionId))

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
         * institution, this will contain supplemental details.
         */
        fun rejection(rejection: Rejection) = rejection(JsonField.of(rejection))

        /**
         * If the transfer is rejected by Real-Time Payments or the destination financial
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

        /** The Account Number the recipient will see as having sent the transfer. */
        fun sourceAccountNumberId(sourceAccountNumberId: String) =
            sourceAccountNumberId(JsonField.of(sourceAccountNumberId))

        /** The Account Number the recipient will see as having sent the transfer. */
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the transfer is submitted to Real-Time Payments, this will contain supplemental
         * details.
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The Transaction funding the transfer once it is complete. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The Transaction funding the transfer once it is complete. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `real_time_payments_transfer`.
         */
        @JsonProperty("type")
        @ExcludeMissing
        fun type(type: JsonField<Type>) = apply { this.type = type }

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        fun ultimateCreditorName(ultimateCreditorName: String) =
            ultimateCreditorName(JsonField.of(ultimateCreditorName))

        /**
         * The name of the ultimate recipient of the transfer. Set this if the creditor is an
         * intermediary receiving the payment for someone else.
         */
        @JsonProperty("ultimate_creditor_name")
        @ExcludeMissing
        fun ultimateCreditorName(ultimateCreditorName: JsonField<String>) = apply {
            this.ultimateCreditorName = ultimateCreditorName
        }

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        fun ultimateDebtorName(ultimateDebtorName: String) =
            ultimateDebtorName(JsonField.of(ultimateDebtorName))

        /**
         * The name of the ultimate sender of the transfer. Set this if the funds are being sent on
         * behalf of someone who is not the account holder at Increase.
         */
        @JsonProperty("ultimate_debtor_name")
        @ExcludeMissing
        fun ultimateDebtorName(ultimateDebtorName: JsonField<String>) = apply {
            this.ultimateDebtorName = ultimateDebtorName
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

        fun build(): RealTimePaymentsTransfer =
            RealTimePaymentsTransfer(
                accountId,
                acknowledgement,
                amount,
                approval,
                cancellation,
                createdAt,
                createdBy,
                creditorName,
                currency,
                debtorName,
                destinationAccountNumber,
                destinationRoutingNumber,
                externalAccountId,
                id,
                idempotencyKey,
                pendingTransactionId,
                rejection,
                remittanceInformation,
                sourceAccountNumberId,
                status,
                submission,
                transactionId,
                type,
                ultimateCreditorName,
                ultimateDebtorName,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * If the transfer is acknowledged by the recipient bank, this will contain supplemental
     * details.
     */
    @JsonDeserialize(builder = Acknowledgement.Builder::class)
    @NoAutoDetect
    class Acknowledgement
    private constructor(
        private val acknowledgedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** When the transfer was acknowledged. */
        fun acknowledgedAt(): OffsetDateTime = acknowledgedAt.getRequired("acknowledged_at")

        /** When the transfer was acknowledged. */
        @JsonProperty("acknowledged_at") @ExcludeMissing fun _acknowledgedAt() = acknowledgedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acknowledgement = apply {
            if (!validated) {
                acknowledgedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var acknowledgedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(acknowledgement: Acknowledgement) = apply {
                acknowledgedAt = acknowledgement.acknowledgedAt
                additionalProperties = acknowledgement.additionalProperties.toMutableMap()
            }

            /** When the transfer was acknowledged. */
            fun acknowledgedAt(acknowledgedAt: OffsetDateTime) =
                acknowledgedAt(JsonField.of(acknowledgedAt))

            /** When the transfer was acknowledged. */
            @JsonProperty("acknowledged_at")
            @ExcludeMissing
            fun acknowledgedAt(acknowledgedAt: JsonField<OffsetDateTime>) = apply {
                this.acknowledgedAt = acknowledgedAt
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

            fun build(): Acknowledgement =
                Acknowledgement(acknowledgedAt, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Acknowledgement && acknowledgedAt == other.acknowledgedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(acknowledgedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Acknowledgement{acknowledgedAt=$acknowledgedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        fun approvedBy(): String? = approvedBy.getNullable("approved_by")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         */
        @JsonProperty("approved_at") @ExcludeMissing fun _approvedAt() = approvedAt

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("approved_by") @ExcludeMissing fun _approvedBy() = approvedBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (!validated) {
                approvedAt()
                approvedBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var approvedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(approval: Approval) = apply {
                approvedAt = approval.approvedAt
                approvedBy = approval.approvedBy
                additionalProperties = approval.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
             */
            fun approvedAt(approvedAt: OffsetDateTime) = approvedAt(JsonField.of(approvedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
             */
            @JsonProperty("approved_at")
            @ExcludeMissing
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String) = approvedBy(JsonField.of(approvedBy))

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            @JsonProperty("approved_by")
            @ExcludeMissing
            fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

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

            fun build(): Approval =
                Approval(
                    approvedAt,
                    approvedBy,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Approval && approvedAt == other.approvedAt && approvedBy == other.approvedBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(approvedAt, approvedBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonDeserialize(builder = Cancellation.Builder::class)
    @NoAutoDetect
    class Cancellation
    private constructor(
        private val canceledAt: JsonField<OffsetDateTime>,
        private val canceledBy: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        fun canceledBy(): String? = canceledBy.getNullable("canceled_by")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         */
        @JsonProperty("canceled_at") @ExcludeMissing fun _canceledAt() = canceledAt

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("canceled_by") @ExcludeMissing fun _canceledBy() = canceledBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (!validated) {
                canceledAt()
                canceledBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var canceledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var canceledBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cancellation: Cancellation) = apply {
                canceledAt = cancellation.canceledAt
                canceledBy = cancellation.canceledBy
                additionalProperties = cancellation.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
             */
            fun canceledAt(canceledAt: OffsetDateTime) = canceledAt(JsonField.of(canceledAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
             */
            @JsonProperty("canceled_at")
            @ExcludeMissing
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String) = canceledBy(JsonField.of(canceledBy))

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            @JsonProperty("canceled_by")
            @ExcludeMissing
            fun canceledBy(canceledBy: JsonField<String>) = apply { this.canceledBy = canceledBy }

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

            fun build(): Cancellation =
                Cancellation(
                    canceledAt,
                    canceledBy,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Cancellation && canceledAt == other.canceledAt && canceledBy == other.canceledBy && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(canceledAt, canceledBy, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonDeserialize(builder = CreatedBy.Builder::class)
    @NoAutoDetect
    class CreatedBy
    private constructor(
        private val apiKey: JsonField<ApiKey>,
        private val category: JsonField<Category>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /** If present, details about the API key that created the transfer. */
        fun apiKey(): ApiKey? = apiKey.getNullable("api_key")

        /** The type of object that created this transfer. */
        fun category(): Category = category.getRequired("category")

        /** If present, details about the OAuth Application that created the transfer. */
        fun oauthApplication(): OAuthApplication? =
            oauthApplication.getNullable("oauth_application")

        /** If present, details about the User that created the transfer. */
        fun user(): User? = user.getNullable("user")

        /** If present, details about the API key that created the transfer. */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey() = apiKey

        /** The type of object that created this transfer. */
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication() = oauthApplication

        /** If present, details about the User that created the transfer. */
        @JsonProperty("user") @ExcludeMissing fun _user() = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (!validated) {
                apiKey()?.validate()
                category()
                oauthApplication()?.validate()
                user()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var apiKey: JsonField<ApiKey> = JsonMissing.of()
            private var category: JsonField<Category> = JsonMissing.of()
            private var oauthApplication: JsonField<OAuthApplication> = JsonMissing.of()
            private var user: JsonField<User> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createdBy: CreatedBy) = apply {
                apiKey = createdBy.apiKey
                category = createdBy.category
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey) = apiKey(JsonField.of(apiKey))

            /** If present, details about the API key that created the transfer. */
            @JsonProperty("api_key")
            @ExcludeMissing
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            @JsonProperty("category")
            @ExcludeMissing
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication) =
                oauthApplication(JsonField.of(oauthApplication))

            /** If present, details about the OAuth Application that created the transfer. */
            @JsonProperty("oauth_application")
            @ExcludeMissing
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User) = user(JsonField.of(user))

            /** If present, details about the User that created the transfer. */
            @JsonProperty("user")
            @ExcludeMissing
            fun user(user: JsonField<User>) = apply { this.user = user }

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

            fun build(): CreatedBy =
                CreatedBy(
                    apiKey,
                    category,
                    oauthApplication,
                    user,
                    additionalProperties.toImmutable(),
                )
        }

        /** If present, details about the API key that created the transfer. */
        @JsonDeserialize(builder = ApiKey.Builder::class)
        @NoAutoDetect
        class ApiKey
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The description set for the API key when it was created. */
            fun description(): String? = description.getNullable("description")

            /** The description set for the API key when it was created. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (!validated) {
                    description()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var description: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(apiKey: ApiKey) = apply {
                    description = apiKey.description
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                /** The description set for the API key when it was created. */
                fun description(description: String) = description(JsonField.of(description))

                /** The description set for the API key when it was created. */
                @JsonProperty("description")
                @ExcludeMissing
                fun description(description: JsonField<String>) = apply {
                    this.description = description
                }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): ApiKey = ApiKey(description, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ApiKey && description == other.description && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val API_KEY = of("api_key")

                val OAUTH_APPLICATION = of("oauth_application")

                val USER = of("user")

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                API_KEY,
                OAUTH_APPLICATION,
                USER,
            }

            enum class Value {
                API_KEY,
                OAUTH_APPLICATION,
                USER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
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

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonDeserialize(builder = OAuthApplication.Builder::class)
        @NoAutoDetect
        class OAuthApplication
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (!validated) {
                    name()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var name: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(oauthApplication: OAuthApplication) = apply {
                    name = oauthApplication.name
                    additionalProperties = oauthApplication.additionalProperties.toMutableMap()
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the OAuth Application. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): OAuthApplication =
                    OAuthApplication(name, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is OAuthApplication && name == other.name && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        @JsonDeserialize(builder = User.Builder::class)
        @NoAutoDetect
        class User
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email") @ExcludeMissing fun _email() = email

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (!validated) {
                    email()
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var email: JsonField<String> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(user: User) = apply {
                    email = user.email
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /** The email address of the User. */
                @JsonProperty("email")
                @ExcludeMissing
                fun email(email: JsonField<String>) = apply { this.email = email }

                fun additionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                    this.additionalProperties.clear()
                    putAllAdditionalProperties(additionalProperties)
                }

                @JsonAnySetter
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

                fun build(): User = User(email, additionalProperties.toImmutable())
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is User && email == other.email && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is CreatedBy && apiKey == other.apiKey && category == other.category && oauthApplication == other.oauthApplication && user == other.user && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(apiKey, category, oauthApplication, user, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{apiKey=$apiKey, category=$category, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
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
     * If the transfer is rejected by Real-Time Payments or the destination financial institution,
     * this will contain supplemental details.
     */
    @JsonDeserialize(builder = Rejection.Builder::class)
    @NoAutoDetect
    class Rejection
    private constructor(
        private val rejectReasonAdditionalInformation: JsonField<String>,
        private val rejectReasonCode: JsonField<RejectReasonCode>,
        private val rejectedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * Additional information about the rejection provided by the recipient bank when the
         * `reject_reason_code` is `NARRATIVE`.
         */
        fun rejectReasonAdditionalInformation(): String? =
            rejectReasonAdditionalInformation.getNullable("reject_reason_additional_information")

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        fun rejectReasonCode(): RejectReasonCode =
            rejectReasonCode.getRequired("reject_reason_code")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        fun rejectedAt(): OffsetDateTime? = rejectedAt.getNullable("rejected_at")

        /**
         * Additional information about the rejection provided by the recipient bank when the
         * `reject_reason_code` is `NARRATIVE`.
         */
        @JsonProperty("reject_reason_additional_information")
        @ExcludeMissing
        fun _rejectReasonAdditionalInformation() = rejectReasonAdditionalInformation

        /**
         * The reason the transfer was rejected as provided by the recipient bank or the Real-Time
         * Payments network.
         */
        @JsonProperty("reject_reason_code")
        @ExcludeMissing
        fun _rejectReasonCode() = rejectReasonCode

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was rejected.
         */
        @JsonProperty("rejected_at") @ExcludeMissing fun _rejectedAt() = rejectedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Rejection = apply {
            if (!validated) {
                rejectReasonAdditionalInformation()
                rejectReasonCode()
                rejectedAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var rejectReasonAdditionalInformation: JsonField<String> = JsonMissing.of()
            private var rejectReasonCode: JsonField<RejectReasonCode> = JsonMissing.of()
            private var rejectedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(rejection: Rejection) = apply {
                rejectReasonAdditionalInformation = rejection.rejectReasonAdditionalInformation
                rejectReasonCode = rejection.rejectReasonCode
                rejectedAt = rejection.rejectedAt
                additionalProperties = rejection.additionalProperties.toMutableMap()
            }

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            fun rejectReasonAdditionalInformation(rejectReasonAdditionalInformation: String) =
                rejectReasonAdditionalInformation(JsonField.of(rejectReasonAdditionalInformation))

            /**
             * Additional information about the rejection provided by the recipient bank when the
             * `reject_reason_code` is `NARRATIVE`.
             */
            @JsonProperty("reject_reason_additional_information")
            @ExcludeMissing
            fun rejectReasonAdditionalInformation(
                rejectReasonAdditionalInformation: JsonField<String>
            ) = apply { this.rejectReasonAdditionalInformation = rejectReasonAdditionalInformation }

            /**
             * The reason the transfer was rejected as provided by the recipient bank or the
             * Real-Time Payments network.
             */
            fun rejectReasonCode(rejectReasonCode: RejectReasonCode) =
                rejectReasonCode(JsonField.of(rejectReasonCode))

            /**
             * The reason the transfer was rejected as provided by the recipient bank or the
             * Real-Time Payments network.
             */
            @JsonProperty("reject_reason_code")
            @ExcludeMissing
            fun rejectReasonCode(rejectReasonCode: JsonField<RejectReasonCode>) = apply {
                this.rejectReasonCode = rejectReasonCode
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            fun rejectedAt(rejectedAt: OffsetDateTime) = rejectedAt(JsonField.of(rejectedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was rejected.
             */
            @JsonProperty("rejected_at")
            @ExcludeMissing
            fun rejectedAt(rejectedAt: JsonField<OffsetDateTime>) = apply {
                this.rejectedAt = rejectedAt
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

            fun build(): Rejection =
                Rejection(
                    rejectReasonAdditionalInformation,
                    rejectReasonCode,
                    rejectedAt,
                    additionalProperties.toImmutable(),
                )
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

            return /* spotless:off */ other is Rejection && rejectReasonAdditionalInformation == other.rejectReasonAdditionalInformation && rejectReasonCode == other.rejectReasonCode && rejectedAt == other.rejectedAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(rejectReasonAdditionalInformation, rejectReasonCode, rejectedAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Rejection{rejectReasonAdditionalInformation=$rejectReasonAdditionalInformation, rejectReasonCode=$rejectReasonCode, rejectedAt=$rejectedAt, additionalProperties=$additionalProperties}"
    }

    class Status
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val PENDING_APPROVAL = of("pending_approval")

            val CANCELED = of("canceled")

            val PENDING_REVIEWING = of("pending_reviewing")

            val REQUIRES_ATTENTION = of("requires_attention")

            val REJECTED = of("rejected")

            val PENDING_SUBMISSION = of("pending_submission")

            val SUBMITTED = of("submitted")

            val COMPLETE = of("complete")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_REVIEWING,
            REQUIRES_ATTENTION,
            REJECTED,
            PENDING_SUBMISSION,
            SUBMITTED,
            COMPLETE,
        }

        enum class Value {
            PENDING_APPROVAL,
            CANCELED,
            PENDING_REVIEWING,
            REQUIRES_ATTENTION,
            REJECTED,
            PENDING_SUBMISSION,
            SUBMITTED,
            COMPLETE,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                REJECTED -> Value.REJECTED
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                COMPLETE -> Value.COMPLETE
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                REJECTED -> Known.REJECTED
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
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

    /**
     * After the transfer is submitted to Real-Time Payments, this will contain supplemental
     * details.
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val submittedAt: JsonField<OffsetDateTime>,
        private val transactionIdentification: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was submitted to The Clearing House.
         */
        fun submittedAt(): OffsetDateTime? = submittedAt.getNullable("submitted_at")

        /** The Real-Time Payments network identification of the transfer. */
        fun transactionIdentification(): String =
            transactionIdentification.getRequired("transaction_identification")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was submitted to The Clearing House.
         */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        /** The Real-Time Payments network identification of the transfer. */
        @JsonProperty("transaction_identification")
        @ExcludeMissing
        fun _transactionIdentification() = transactionIdentification

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (!validated) {
                submittedAt()
                transactionIdentification()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var transactionIdentification: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                submittedAt = submission.submittedAt
                transactionIdentification = submission.transactionIdentification
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was submitted to The Clearing House.
             */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /** The Real-Time Payments network identification of the transfer. */
            fun transactionIdentification(transactionIdentification: String) =
                transactionIdentification(JsonField.of(transactionIdentification))

            /** The Real-Time Payments network identification of the transfer. */
            @JsonProperty("transaction_identification")
            @ExcludeMissing
            fun transactionIdentification(transactionIdentification: JsonField<String>) = apply {
                this.transactionIdentification = transactionIdentification
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

            fun build(): Submission =
                Submission(
                    submittedAt,
                    transactionIdentification,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && submittedAt == other.submittedAt && transactionIdentification == other.transactionIdentification && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(submittedAt, transactionIdentification, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{submittedAt=$submittedAt, transactionIdentification=$transactionIdentification, additionalProperties=$additionalProperties}"
    }

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val REAL_TIME_PAYMENTS_TRANSFER = of("real_time_payments_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            REAL_TIME_PAYMENTS_TRANSFER,
        }

        enum class Value {
            REAL_TIME_PAYMENTS_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Value.REAL_TIME_PAYMENTS_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                REAL_TIME_PAYMENTS_TRANSFER -> Known.REAL_TIME_PAYMENTS_TRANSFER
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

        return /* spotless:off */ other is RealTimePaymentsTransfer && accountId == other.accountId && acknowledgement == other.acknowledgement && amount == other.amount && approval == other.approval && cancellation == other.cancellation && createdAt == other.createdAt && createdBy == other.createdBy && creditorName == other.creditorName && currency == other.currency && debtorName == other.debtorName && destinationAccountNumber == other.destinationAccountNumber && destinationRoutingNumber == other.destinationRoutingNumber && externalAccountId == other.externalAccountId && id == other.id && idempotencyKey == other.idempotencyKey && pendingTransactionId == other.pendingTransactionId && rejection == other.rejection && remittanceInformation == other.remittanceInformation && sourceAccountNumberId == other.sourceAccountNumberId && status == other.status && submission == other.submission && transactionId == other.transactionId && type == other.type && ultimateCreditorName == other.ultimateCreditorName && ultimateDebtorName == other.ultimateDebtorName && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, acknowledgement, amount, approval, cancellation, createdAt, createdBy, creditorName, currency, debtorName, destinationAccountNumber, destinationRoutingNumber, externalAccountId, id, idempotencyKey, pendingTransactionId, rejection, remittanceInformation, sourceAccountNumberId, status, submission, transactionId, type, ultimateCreditorName, ultimateDebtorName, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "RealTimePaymentsTransfer{accountId=$accountId, acknowledgement=$acknowledgement, amount=$amount, approval=$approval, cancellation=$cancellation, createdAt=$createdAt, createdBy=$createdBy, creditorName=$creditorName, currency=$currency, debtorName=$debtorName, destinationAccountNumber=$destinationAccountNumber, destinationRoutingNumber=$destinationRoutingNumber, externalAccountId=$externalAccountId, id=$id, idempotencyKey=$idempotencyKey, pendingTransactionId=$pendingTransactionId, rejection=$rejection, remittanceInformation=$remittanceInformation, sourceAccountNumberId=$sourceAccountNumberId, status=$status, submission=$submission, transactionId=$transactionId, type=$type, ultimateCreditorName=$ultimateCreditorName, ultimateDebtorName=$ultimateDebtorName, additionalProperties=$additionalProperties}"
}
