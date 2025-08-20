// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

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

/** Check Transfers move funds from your Increase account by mailing a physical check. */
class CheckTransfer
private constructor(
    private val id: JsonField<String>,
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val approvedInboundCheckDepositId: JsonField<String>,
    private val balanceCheck: JsonField<BalanceCheck>,
    private val cancellation: JsonField<Cancellation>,
    private val checkNumber: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val currency: JsonField<Currency>,
    private val fulfillmentMethod: JsonField<FulfillmentMethod>,
    private val idempotencyKey: JsonField<String>,
    private val mailing: JsonField<Mailing>,
    private val pendingTransactionId: JsonField<String>,
    private val physicalCheck: JsonField<PhysicalCheck>,
    private val routingNumber: JsonField<String>,
    private val sourceAccountNumberId: JsonField<String>,
    private val status: JsonField<Status>,
    private val stopPaymentRequest: JsonField<StopPaymentRequest>,
    private val submission: JsonField<Submission>,
    private val thirdParty: JsonField<ThirdParty>,
    private val type: JsonField<Type>,
    private val additionalProperties: MutableMap<String, JsonValue>,
) {

    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing id: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_id") @ExcludeMissing accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount") @ExcludeMissing amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("approval") @ExcludeMissing approval: JsonField<Approval> = JsonMissing.of(),
        @JsonProperty("approved_inbound_check_deposit_id")
        @ExcludeMissing
        approvedInboundCheckDepositId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("balance_check")
        @ExcludeMissing
        balanceCheck: JsonField<BalanceCheck> = JsonMissing.of(),
        @JsonProperty("cancellation")
        @ExcludeMissing
        cancellation: JsonField<Cancellation> = JsonMissing.of(),
        @JsonProperty("check_number")
        @ExcludeMissing
        checkNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("created_by")
        @ExcludeMissing
        createdBy: JsonField<CreatedBy> = JsonMissing.of(),
        @JsonProperty("currency") @ExcludeMissing currency: JsonField<Currency> = JsonMissing.of(),
        @JsonProperty("fulfillment_method")
        @ExcludeMissing
        fulfillmentMethod: JsonField<FulfillmentMethod> = JsonMissing.of(),
        @JsonProperty("idempotency_key")
        @ExcludeMissing
        idempotencyKey: JsonField<String> = JsonMissing.of(),
        @JsonProperty("mailing") @ExcludeMissing mailing: JsonField<Mailing> = JsonMissing.of(),
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        pendingTransactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("physical_check")
        @ExcludeMissing
        physicalCheck: JsonField<PhysicalCheck> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("source_account_number_id")
        @ExcludeMissing
        sourceAccountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("status") @ExcludeMissing status: JsonField<Status> = JsonMissing.of(),
        @JsonProperty("stop_payment_request")
        @ExcludeMissing
        stopPaymentRequest: JsonField<StopPaymentRequest> = JsonMissing.of(),
        @JsonProperty("submission")
        @ExcludeMissing
        submission: JsonField<Submission> = JsonMissing.of(),
        @JsonProperty("third_party")
        @ExcludeMissing
        thirdParty: JsonField<ThirdParty> = JsonMissing.of(),
        @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
    ) : this(
        id,
        accountId,
        accountNumber,
        amount,
        approval,
        approvedInboundCheckDepositId,
        balanceCheck,
        cancellation,
        checkNumber,
        createdAt,
        createdBy,
        currency,
        fulfillmentMethod,
        idempotencyKey,
        mailing,
        pendingTransactionId,
        physicalCheck,
        routingNumber,
        sourceAccountNumberId,
        status,
        stopPaymentRequest,
        submission,
        thirdParty,
        type,
        mutableMapOf(),
    )

    /**
     * The Check transfer's identifier.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun id(): String = id.getRequired("id")

    /**
     * The identifier of the Account from which funds will be transferred.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountId(): String = accountId.getRequired("account_id")

    /**
     * The account number printed on the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * The transfer amount in USD cents.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approval(): Approval? = approval.getNullable("approval")

    /**
     * If the Check Transfer was successfully deposited, this will contain the identifier of the
     * Inbound Check Deposit object with details of the deposit.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun approvedInboundCheckDepositId(): String? =
        approvedInboundCheckDepositId.getNullable("approved_inbound_check_deposit_id")

    /**
     * How the account's available balance should be checked.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun balanceCheck(): BalanceCheck? = balanceCheck.getNullable("balance_check")

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun cancellation(): Cancellation? = cancellation.getNullable("cancellation")

    /**
     * The check number printed on the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun checkNumber(): String = checkNumber.getRequired("check_number")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /**
     * What object created the transfer, either via the API or the dashboard.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun createdBy(): CreatedBy? = createdBy.getNullable("created_by")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun currency(): Currency = currency.getRequired("currency")

    /**
     * Whether Increase will print and mail the check or if you will do it yourself.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun fulfillmentMethod(): FulfillmentMethod = fulfillmentMethod.getRequired("fulfillment_method")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * If the check has been mailed by Increase, this will contain details of the shipment.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun mailing(): Mailing? = mailing.getNullable("mailing")

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun pendingTransactionId(): String? = pendingTransactionId.getNullable("pending_transaction_id")

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun physicalCheck(): PhysicalCheck? = physicalCheck.getNullable("physical_check")

    /**
     * The routing number printed on the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * The identifier of the Account Number from which to send the transfer and print on the check.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun sourceAccountNumberId(): String? =
        sourceAccountNumberId.getNullable("source_account_number_id")

    /**
     * The lifecycle status of the transfer.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun status(): Status = status.getRequired("status")

    /**
     * After a stop-payment is requested on the check, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun stopPaymentRequest(): StopPaymentRequest? =
        stopPaymentRequest.getNullable("stop_payment_request")

    /**
     * After the transfer is submitted, this will contain supplemental details.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun submission(): Submission? = submission.getNullable("submission")

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if the
     *   server responded with an unexpected value).
     */
    fun thirdParty(): ThirdParty? = thirdParty.getNullable("third_party")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     *
     * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
     *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
     */
    fun type(): Type = type.getRequired("type")

    /**
     * Returns the raw JSON value of [id].
     *
     * Unlike [id], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /**
     * Returns the raw JSON value of [accountId].
     *
     * Unlike [accountId], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /**
     * Returns the raw JSON value of [accountNumber].
     *
     * Unlike [accountNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * Returns the raw JSON value of [amount].
     *
     * Unlike [amount], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * Returns the raw JSON value of [approval].
     *
     * Unlike [approval], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

    /**
     * Returns the raw JSON value of [approvedInboundCheckDepositId].
     *
     * Unlike [approvedInboundCheckDepositId], this method doesn't throw if the JSON field has an
     * unexpected type.
     */
    @JsonProperty("approved_inbound_check_deposit_id")
    @ExcludeMissing
    fun _approvedInboundCheckDepositId(): JsonField<String> = approvedInboundCheckDepositId

    /**
     * Returns the raw JSON value of [balanceCheck].
     *
     * Unlike [balanceCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("balance_check")
    @ExcludeMissing
    fun _balanceCheck(): JsonField<BalanceCheck> = balanceCheck

    /**
     * Returns the raw JSON value of [cancellation].
     *
     * Unlike [cancellation], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /**
     * Returns the raw JSON value of [checkNumber].
     *
     * Unlike [checkNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("check_number")
    @ExcludeMissing
    fun _checkNumber(): JsonField<String> = checkNumber

    /**
     * Returns the raw JSON value of [createdAt].
     *
     * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /**
     * Returns the raw JSON value of [createdBy].
     *
     * Unlike [createdBy], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * Returns the raw JSON value of [currency].
     *
     * Unlike [currency], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /**
     * Returns the raw JSON value of [fulfillmentMethod].
     *
     * Unlike [fulfillmentMethod], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("fulfillment_method")
    @ExcludeMissing
    fun _fulfillmentMethod(): JsonField<FulfillmentMethod> = fulfillmentMethod

    /**
     * Returns the raw JSON value of [idempotencyKey].
     *
     * Unlike [idempotencyKey], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Returns the raw JSON value of [mailing].
     *
     * Unlike [mailing], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("mailing") @ExcludeMissing fun _mailing(): JsonField<Mailing> = mailing

    /**
     * Returns the raw JSON value of [pendingTransactionId].
     *
     * Unlike [pendingTransactionId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /**
     * Returns the raw JSON value of [physicalCheck].
     *
     * Unlike [physicalCheck], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("physical_check")
    @ExcludeMissing
    fun _physicalCheck(): JsonField<PhysicalCheck> = physicalCheck

    /**
     * Returns the raw JSON value of [routingNumber].
     *
     * Unlike [routingNumber], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * Returns the raw JSON value of [sourceAccountNumberId].
     *
     * Unlike [sourceAccountNumberId], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("source_account_number_id")
    @ExcludeMissing
    fun _sourceAccountNumberId(): JsonField<String> = sourceAccountNumberId

    /**
     * Returns the raw JSON value of [status].
     *
     * Unlike [status], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * Returns the raw JSON value of [stopPaymentRequest].
     *
     * Unlike [stopPaymentRequest], this method doesn't throw if the JSON field has an unexpected
     * type.
     */
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    fun _stopPaymentRequest(): JsonField<StopPaymentRequest> = stopPaymentRequest

    /**
     * Returns the raw JSON value of [submission].
     *
     * Unlike [submission], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /**
     * Returns the raw JSON value of [thirdParty].
     *
     * Unlike [thirdParty], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("third_party")
    @ExcludeMissing
    fun _thirdParty(): JsonField<ThirdParty> = thirdParty

    /**
     * Returns the raw JSON value of [type].
     *
     * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
         * Returns a mutable builder for constructing an instance of [CheckTransfer].
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .accountNumber()
         * .amount()
         * .approval()
         * .approvedInboundCheckDepositId()
         * .balanceCheck()
         * .cancellation()
         * .checkNumber()
         * .createdAt()
         * .createdBy()
         * .currency()
         * .fulfillmentMethod()
         * .idempotencyKey()
         * .mailing()
         * .pendingTransactionId()
         * .physicalCheck()
         * .routingNumber()
         * .sourceAccountNumberId()
         * .status()
         * .stopPaymentRequest()
         * .submission()
         * .thirdParty()
         * .type()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [CheckTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var approvedInboundCheckDepositId: JsonField<String>? = null
        private var balanceCheck: JsonField<BalanceCheck>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var checkNumber: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var currency: JsonField<Currency>? = null
        private var fulfillmentMethod: JsonField<FulfillmentMethod>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var mailing: JsonField<Mailing>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var physicalCheck: JsonField<PhysicalCheck>? = null
        private var routingNumber: JsonField<String>? = null
        private var sourceAccountNumberId: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var stopPaymentRequest: JsonField<StopPaymentRequest>? = null
        private var submission: JsonField<Submission>? = null
        private var thirdParty: JsonField<ThirdParty>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkTransfer: CheckTransfer) = apply {
            id = checkTransfer.id
            accountId = checkTransfer.accountId
            accountNumber = checkTransfer.accountNumber
            amount = checkTransfer.amount
            approval = checkTransfer.approval
            approvedInboundCheckDepositId = checkTransfer.approvedInboundCheckDepositId
            balanceCheck = checkTransfer.balanceCheck
            cancellation = checkTransfer.cancellation
            checkNumber = checkTransfer.checkNumber
            createdAt = checkTransfer.createdAt
            createdBy = checkTransfer.createdBy
            currency = checkTransfer.currency
            fulfillmentMethod = checkTransfer.fulfillmentMethod
            idempotencyKey = checkTransfer.idempotencyKey
            mailing = checkTransfer.mailing
            pendingTransactionId = checkTransfer.pendingTransactionId
            physicalCheck = checkTransfer.physicalCheck
            routingNumber = checkTransfer.routingNumber
            sourceAccountNumberId = checkTransfer.sourceAccountNumberId
            status = checkTransfer.status
            stopPaymentRequest = checkTransfer.stopPaymentRequest
            submission = checkTransfer.submission
            thirdParty = checkTransfer.thirdParty
            type = checkTransfer.type
            additionalProperties = checkTransfer.additionalProperties.toMutableMap()
        }

        /** The Check transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /**
         * Sets [Builder.id] to an arbitrary JSON value.
         *
         * You should usually call [Builder.id] with a well-typed [String] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /**
         * Sets [Builder.accountId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountId] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The account number printed on the check. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /**
         * Sets [Builder.accountNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.accountNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * Sets [Builder.amount] to an arbitrary JSON value.
         *
         * You should usually call [Builder.amount] with a well-typed [Long] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval?) = approval(JsonField.ofNullable(approval))

        /**
         * Sets [Builder.approval] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approval] with a well-typed [Approval] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * If the Check Transfer was successfully deposited, this will contain the identifier of the
         * Inbound Check Deposit object with details of the deposit.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: String?) =
            approvedInboundCheckDepositId(JsonField.ofNullable(approvedInboundCheckDepositId))

        /**
         * Sets [Builder.approvedInboundCheckDepositId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.approvedInboundCheckDepositId] with a well-typed
         * [String] value instead. This method is primarily for setting the field to an undocumented
         * or not yet supported value.
         */
        fun approvedInboundCheckDepositId(approvedInboundCheckDepositId: JsonField<String>) =
            apply {
                this.approvedInboundCheckDepositId = approvedInboundCheckDepositId
            }

        /** How the account's available balance should be checked. */
        fun balanceCheck(balanceCheck: BalanceCheck?) =
            balanceCheck(JsonField.ofNullable(balanceCheck))

        /**
         * Sets [Builder.balanceCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.balanceCheck] with a well-typed [BalanceCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun balanceCheck(balanceCheck: JsonField<BalanceCheck>) = apply {
            this.balanceCheck = balanceCheck
        }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /**
         * Sets [Builder.cancellation] to an arbitrary JSON value.
         *
         * You should usually call [Builder.cancellation] with a well-typed [Cancellation] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /** The check number printed on the check. */
        fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

        /**
         * Sets [Builder.checkNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.checkNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun checkNumber(checkNumber: JsonField<String>) = apply { this.checkNumber = checkNumber }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
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

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /**
         * Sets [Builder.createdBy] to an arbitrary JSON value.
         *
         * You should usually call [Builder.createdBy] with a well-typed [CreatedBy] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * Sets [Builder.currency] to an arbitrary JSON value.
         *
         * You should usually call [Builder.currency] with a well-typed [Currency] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** Whether Increase will print and mail the check or if you will do it yourself. */
        fun fulfillmentMethod(fulfillmentMethod: FulfillmentMethod) =
            fulfillmentMethod(JsonField.of(fulfillmentMethod))

        /**
         * Sets [Builder.fulfillmentMethod] to an arbitrary JSON value.
         *
         * You should usually call [Builder.fulfillmentMethod] with a well-typed [FulfillmentMethod]
         * value instead. This method is primarily for setting the field to an undocumented or not
         * yet supported value.
         */
        fun fulfillmentMethod(fulfillmentMethod: JsonField<FulfillmentMethod>) = apply {
            this.fulfillmentMethod = fulfillmentMethod
        }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * Sets [Builder.idempotencyKey] to an arbitrary JSON value.
         *
         * You should usually call [Builder.idempotencyKey] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /** If the check has been mailed by Increase, this will contain details of the shipment. */
        fun mailing(mailing: Mailing?) = mailing(JsonField.ofNullable(mailing))

        /**
         * Sets [Builder.mailing] to an arbitrary JSON value.
         *
         * You should usually call [Builder.mailing] with a well-typed [Mailing] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun mailing(mailing: JsonField<Mailing>) = apply { this.mailing = mailing }

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /**
         * Sets [Builder.pendingTransactionId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.pendingTransactionId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /**
         * Details relating to the physical check that Increase will print and mail. Will be present
         * if and only if `fulfillment_method` is equal to `physical_check`.
         */
        fun physicalCheck(physicalCheck: PhysicalCheck?) =
            physicalCheck(JsonField.ofNullable(physicalCheck))

        /**
         * Sets [Builder.physicalCheck] to an arbitrary JSON value.
         *
         * You should usually call [Builder.physicalCheck] with a well-typed [PhysicalCheck] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun physicalCheck(physicalCheck: JsonField<PhysicalCheck>) = apply {
            this.physicalCheck = physicalCheck
        }

        /** The routing number printed on the check. */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /**
         * Sets [Builder.routingNumber] to an arbitrary JSON value.
         *
         * You should usually call [Builder.routingNumber] with a well-typed [String] value instead.
         * This method is primarily for setting the field to an undocumented or not yet supported
         * value.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * The identifier of the Account Number from which to send the transfer and print on the
         * check.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: String?) =
            sourceAccountNumberId(JsonField.ofNullable(sourceAccountNumberId))

        /**
         * Sets [Builder.sourceAccountNumberId] to an arbitrary JSON value.
         *
         * You should usually call [Builder.sourceAccountNumberId] with a well-typed [String] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun sourceAccountNumberId(sourceAccountNumberId: JsonField<String>) = apply {
            this.sourceAccountNumberId = sourceAccountNumberId
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /**
         * Sets [Builder.status] to an arbitrary JSON value.
         *
         * You should usually call [Builder.status] with a well-typed [Status] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
         */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: StopPaymentRequest?) =
            stopPaymentRequest(JsonField.ofNullable(stopPaymentRequest))

        /**
         * Sets [Builder.stopPaymentRequest] to an arbitrary JSON value.
         *
         * You should usually call [Builder.stopPaymentRequest] with a well-typed
         * [StopPaymentRequest] value instead. This method is primarily for setting the field to an
         * undocumented or not yet supported value.
         */
        fun stopPaymentRequest(stopPaymentRequest: JsonField<StopPaymentRequest>) = apply {
            this.stopPaymentRequest = stopPaymentRequest
        }

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /**
         * Sets [Builder.submission] to an arbitrary JSON value.
         *
         * You should usually call [Builder.submission] with a well-typed [Submission] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /**
         * Details relating to the custom fulfillment you will perform. Will be present if and only
         * if `fulfillment_method` is equal to `third_party`.
         */
        fun thirdParty(thirdParty: ThirdParty?) = thirdParty(JsonField.ofNullable(thirdParty))

        /**
         * Sets [Builder.thirdParty] to an arbitrary JSON value.
         *
         * You should usually call [Builder.thirdParty] with a well-typed [ThirdParty] value
         * instead. This method is primarily for setting the field to an undocumented or not yet
         * supported value.
         */
        fun thirdParty(thirdParty: JsonField<ThirdParty>) = apply { this.thirdParty = thirdParty }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * Sets [Builder.type] to an arbitrary JSON value.
         *
         * You should usually call [Builder.type] with a well-typed [Type] value instead. This
         * method is primarily for setting the field to an undocumented or not yet supported value.
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

        /**
         * Returns an immutable instance of [CheckTransfer].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .id()
         * .accountId()
         * .accountNumber()
         * .amount()
         * .approval()
         * .approvedInboundCheckDepositId()
         * .balanceCheck()
         * .cancellation()
         * .checkNumber()
         * .createdAt()
         * .createdBy()
         * .currency()
         * .fulfillmentMethod()
         * .idempotencyKey()
         * .mailing()
         * .pendingTransactionId()
         * .physicalCheck()
         * .routingNumber()
         * .sourceAccountNumberId()
         * .status()
         * .stopPaymentRequest()
         * .submission()
         * .thirdParty()
         * .type()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): CheckTransfer =
            CheckTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumber", accountNumber),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("approvedInboundCheckDepositId", approvedInboundCheckDepositId),
                checkRequired("balanceCheck", balanceCheck),
                checkRequired("cancellation", cancellation),
                checkRequired("checkNumber", checkNumber),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("currency", currency),
                checkRequired("fulfillmentMethod", fulfillmentMethod),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("mailing", mailing),
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("physicalCheck", physicalCheck),
                checkRequired("routingNumber", routingNumber),
                checkRequired("sourceAccountNumberId", sourceAccountNumberId),
                checkRequired("status", status),
                checkRequired("stopPaymentRequest", stopPaymentRequest),
                checkRequired("submission", submission),
                checkRequired("thirdParty", thirdParty),
                checkRequired("type", type),
                additionalProperties.toMutableMap(),
            )
    }

    private var validated: Boolean = false

    fun validate(): CheckTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumber()
        amount()
        approval()?.validate()
        approvedInboundCheckDepositId()
        balanceCheck()?.validate()
        cancellation()?.validate()
        checkNumber()
        createdAt()
        createdBy()?.validate()
        currency().validate()
        fulfillmentMethod().validate()
        idempotencyKey()
        mailing()?.validate()
        pendingTransactionId()
        physicalCheck()?.validate()
        routingNumber()
        sourceAccountNumberId()
        status().validate()
        stopPaymentRequest()?.validate()
        submission()?.validate()
        thirdParty()?.validate()
        type().validate()
        validated = true
    }

    fun isValid(): Boolean =
        try {
            validate()
            true
        } catch (e: IncreaseInvalidDataException) {
            false
        }

    /**
     * Returns a score indicating how many valid values are contained in this object recursively.
     *
     * Used for best match union deserialization.
     */
    internal fun validity(): Int =
        (if (id.asKnown() == null) 0 else 1) +
            (if (accountId.asKnown() == null) 0 else 1) +
            (if (accountNumber.asKnown() == null) 0 else 1) +
            (if (amount.asKnown() == null) 0 else 1) +
            (approval.asKnown()?.validity() ?: 0) +
            (if (approvedInboundCheckDepositId.asKnown() == null) 0 else 1) +
            (balanceCheck.asKnown()?.validity() ?: 0) +
            (cancellation.asKnown()?.validity() ?: 0) +
            (if (checkNumber.asKnown() == null) 0 else 1) +
            (if (createdAt.asKnown() == null) 0 else 1) +
            (createdBy.asKnown()?.validity() ?: 0) +
            (currency.asKnown()?.validity() ?: 0) +
            (fulfillmentMethod.asKnown()?.validity() ?: 0) +
            (if (idempotencyKey.asKnown() == null) 0 else 1) +
            (mailing.asKnown()?.validity() ?: 0) +
            (if (pendingTransactionId.asKnown() == null) 0 else 1) +
            (physicalCheck.asKnown()?.validity() ?: 0) +
            (if (routingNumber.asKnown() == null) 0 else 1) +
            (if (sourceAccountNumberId.asKnown() == null) 0 else 1) +
            (status.asKnown()?.validity() ?: 0) +
            (stopPaymentRequest.asKnown()?.validity() ?: 0) +
            (submission.asKnown()?.validity() ?: 0) +
            (thirdParty.asKnown()?.validity() ?: 0) +
            (type.asKnown()?.validity() ?: 0)

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    class Approval
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("approved_at")
            @ExcludeMissing
            approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("approved_by")
            @ExcludeMissing
            approvedBy: JsonField<String> = JsonMissing.of(),
        ) : this(approvedAt, approvedBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was approved.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun approvedAt(): OffsetDateTime = approvedAt.getRequired("approved_at")

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun approvedBy(): String? = approvedBy.getNullable("approved_by")

        /**
         * Returns the raw JSON value of [approvedAt].
         *
         * Unlike [approvedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * Returns the raw JSON value of [approvedBy].
         *
         * Unlike [approvedBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy(): JsonField<String> = approvedBy

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
             * Returns a mutable builder for constructing an instance of [Approval].
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .approvedBy()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Approval]. */
        class Builder internal constructor() {

            private var approvedAt: JsonField<OffsetDateTime>? = null
            private var approvedBy: JsonField<String>? = null
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
             * Sets [Builder.approvedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedAt(approvedAt: JsonField<OffsetDateTime>) = apply {
                this.approvedAt = approvedAt
            }

            /**
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
             */
            fun approvedBy(approvedBy: String?) = approvedBy(JsonField.ofNullable(approvedBy))

            /**
             * Sets [Builder.approvedBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.approvedBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun approvedBy(approvedBy: JsonField<String>) = apply { this.approvedBy = approvedBy }

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
             * Returns an immutable instance of [Approval].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .approvedAt()
             * .approvedBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Approval =
                Approval(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("approvedBy", approvedBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            approvedBy()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (approvedAt.asKnown() == null) 0 else 1) +
                (if (approvedBy.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Approval &&
                approvedAt == other.approvedAt &&
                approvedBy == other.approvedBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(approvedAt, approvedBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"
    }

    /** How the account's available balance should be checked. */
    class BalanceCheck @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount.
             */
            val FULL = of("full")

            /**
             * No balance check will performed; a zero-dollar Pending Transaction will be created.
             */
            val NONE = of("none")

            fun of(value: String) = BalanceCheck(JsonField.of(value))
        }

        /** An enum containing [BalanceCheck]'s known values. */
        enum class Known {
            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount.
             */
            FULL,
            /**
             * No balance check will performed; a zero-dollar Pending Transaction will be created.
             */
            NONE,
        }

        /**
         * An enum containing [BalanceCheck]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [BalanceCheck] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /**
             * The available balance of the account must be at least the amount of the check, and a
             * Pending Transaction will be created for the full amount.
             */
            FULL,
            /**
             * No balance check will performed; a zero-dollar Pending Transaction will be created.
             */
            NONE,
            /**
             * An enum member indicating that [BalanceCheck] was instantiated with an unknown value.
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
                FULL -> Value.FULL
                NONE -> Value.NONE
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
                FULL -> Known.FULL
                NONE -> Known.NONE
                else -> throw IncreaseInvalidDataException("Unknown BalanceCheck: $value")
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

        private var validated: Boolean = false

        fun validate(): BalanceCheck = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is BalanceCheck && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    class Cancellation
    private constructor(
        private val canceledAt: JsonField<OffsetDateTime>,
        private val canceledBy: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("canceled_at")
            @ExcludeMissing
            canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("canceled_by")
            @ExcludeMissing
            canceledBy: JsonField<String> = JsonMissing.of(),
        ) : this(canceledAt, canceledBy, mutableMapOf())

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * Transfer was canceled.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun canceledAt(): OffsetDateTime = canceledAt.getRequired("canceled_at")

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun canceledBy(): String? = canceledBy.getNullable("canceled_by")

        /**
         * Returns the raw JSON value of [canceledAt].
         *
         * Unlike [canceledAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

        /**
         * Returns the raw JSON value of [canceledBy].
         *
         * Unlike [canceledBy], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy(): JsonField<String> = canceledBy

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
             * Returns a mutable builder for constructing an instance of [Cancellation].
             *
             * The following fields are required:
             * ```kotlin
             * .canceledAt()
             * .canceledBy()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Cancellation]. */
        class Builder internal constructor() {

            private var canceledAt: JsonField<OffsetDateTime>? = null
            private var canceledBy: JsonField<String>? = null
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
             * Sets [Builder.canceledAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledAt(canceledAt: JsonField<OffsetDateTime>) = apply {
                this.canceledAt = canceledAt
            }

            /**
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
             */
            fun canceledBy(canceledBy: String?) = canceledBy(JsonField.ofNullable(canceledBy))

            /**
             * Sets [Builder.canceledBy] to an arbitrary JSON value.
             *
             * You should usually call [Builder.canceledBy] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun canceledBy(canceledBy: JsonField<String>) = apply { this.canceledBy = canceledBy }

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
             * Returns an immutable instance of [Cancellation].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .canceledAt()
             * .canceledBy()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Cancellation =
                Cancellation(
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("canceledBy", canceledBy),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            canceledAt()
            canceledBy()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (canceledAt.asKnown() == null) 0 else 1) +
                (if (canceledBy.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cancellation &&
                canceledAt == other.canceledAt &&
                canceledBy == other.canceledBy &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(canceledAt, canceledBy, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"
    }

    /** What object created the transfer, either via the API or the dashboard. */
    class CreatedBy
    private constructor(
        private val apiKey: JsonField<ApiKey>,
        private val category: JsonField<Category>,
        private val oauthApplication: JsonField<OAuthApplication>,
        private val user: JsonField<User>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("api_key") @ExcludeMissing apiKey: JsonField<ApiKey> = JsonMissing.of(),
            @JsonProperty("category")
            @ExcludeMissing
            category: JsonField<Category> = JsonMissing.of(),
            @JsonProperty("oauth_application")
            @ExcludeMissing
            oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
            @JsonProperty("user") @ExcludeMissing user: JsonField<User> = JsonMissing.of(),
        ) : this(apiKey, category, oauthApplication, user, mutableMapOf())

        /**
         * If present, details about the API key that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun apiKey(): ApiKey? = apiKey.getNullable("api_key")

        /**
         * The type of object that created this transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun category(): Category = category.getRequired("category")

        /**
         * If present, details about the OAuth Application that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun oauthApplication(): OAuthApplication? =
            oauthApplication.getNullable("oauth_application")

        /**
         * If present, details about the User that created the transfer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun user(): User? = user.getNullable("user")

        /**
         * Returns the raw JSON value of [apiKey].
         *
         * Unlike [apiKey], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /**
         * Returns the raw JSON value of [category].
         *
         * Unlike [category], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /**
         * Returns the raw JSON value of [oauthApplication].
         *
         * Unlike [oauthApplication], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /**
         * Returns the raw JSON value of [user].
         *
         * Unlike [user], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

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
             * Returns a mutable builder for constructing an instance of [CreatedBy].
             *
             * The following fields are required:
             * ```kotlin
             * .apiKey()
             * .category()
             * .oauthApplication()
             * .user()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [CreatedBy]. */
        class Builder internal constructor() {

            private var apiKey: JsonField<ApiKey>? = null
            private var category: JsonField<Category>? = null
            private var oauthApplication: JsonField<OAuthApplication>? = null
            private var user: JsonField<User>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(createdBy: CreatedBy) = apply {
                apiKey = createdBy.apiKey
                category = createdBy.category
                oauthApplication = createdBy.oauthApplication
                user = createdBy.user
                additionalProperties = createdBy.additionalProperties.toMutableMap()
            }

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: ApiKey?) = apiKey(JsonField.ofNullable(apiKey))

            /**
             * Sets [Builder.apiKey] to an arbitrary JSON value.
             *
             * You should usually call [Builder.apiKey] with a well-typed [ApiKey] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /**
             * Sets [Builder.category] to an arbitrary JSON value.
             *
             * You should usually call [Builder.category] with a well-typed [Category] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /**
             * Sets [Builder.oauthApplication] to an arbitrary JSON value.
             *
             * You should usually call [Builder.oauthApplication] with a well-typed
             * [OAuthApplication] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /**
             * Sets [Builder.user] to an arbitrary JSON value.
             *
             * You should usually call [Builder.user] with a well-typed [User] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun user(user: JsonField<User>) = apply { this.user = user }

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
             * Returns an immutable instance of [CreatedBy].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .apiKey()
             * .category()
             * .oauthApplication()
             * .user()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("apiKey", apiKey),
                    checkRequired("category", category),
                    checkRequired("oauthApplication", oauthApplication),
                    checkRequired("user", user),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            apiKey()?.validate()
            category().validate()
            oauthApplication()?.validate()
            user()?.validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (apiKey.asKnown()?.validity() ?: 0) +
                (category.asKnown()?.validity() ?: 0) +
                (oauthApplication.asKnown()?.validity() ?: 0) +
                (user.asKnown()?.validity() ?: 0)

        /** If present, details about the API key that created the transfer. */
        class ApiKey
        private constructor(
            private val description: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("description")
                @ExcludeMissing
                description: JsonField<String> = JsonMissing.of()
            ) : this(description, mutableMapOf())

            /**
             * The description set for the API key when it was created.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun description(): String? = description.getNullable("description")

            /**
             * Returns the raw JSON value of [description].
             *
             * Unlike [description], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

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
                 * Returns a mutable builder for constructing an instance of [ApiKey].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ApiKey]. */
            class Builder internal constructor() {

                private var description: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(apiKey: ApiKey) = apply {
                    description = apiKey.description
                    additionalProperties = apiKey.additionalProperties.toMutableMap()
                }

                /** The description set for the API key when it was created. */
                fun description(description: String?) =
                    description(JsonField.ofNullable(description))

                /**
                 * Sets [Builder.description] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.description] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun description(description: JsonField<String>) = apply {
                    this.description = description
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

                /**
                 * Returns an immutable instance of [ApiKey].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .description()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (description.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ApiKey &&
                    description == other.description &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(description, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ApiKey{description=$description, additionalProperties=$additionalProperties}"
        }

        /** The type of object that created this transfer. */
        class Category @JsonCreator private constructor(private val value: JsonField<String>) :
            Enum {

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

                /** An API key. Details will be under the `api_key` object. */
                val API_KEY = of("api_key")

                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                val OAUTH_APPLICATION = of("oauth_application")

                /** A User in the Increase dashboard. Details will be under the `user` object. */
                val USER = of("user")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
            }

            /**
             * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Category] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** An API key. Details will be under the `api_key` object. */
                API_KEY,
                /**
                 * An OAuth application you connected to Increase. Details will be under the
                 * `oauth_application` object.
                 */
                OAUTH_APPLICATION,
                /** A User in the Increase dashboard. Details will be under the `user` object. */
                USER,
                /**
                 * An enum member indicating that [Category] was instantiated with an unknown value.
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
                    API_KEY -> Value.API_KEY
                    OAUTH_APPLICATION -> Value.OAUTH_APPLICATION
                    USER -> Value.USER
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
                    API_KEY -> Known.API_KEY
                    OAUTH_APPLICATION -> Known.OAUTH_APPLICATION
                    USER -> Known.USER
                    else -> throw IncreaseInvalidDataException("Unknown Category: $value")
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

            private var validated: Boolean = false

            fun validate(): Category = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Category && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** If present, details about the OAuth Application that created the transfer. */
        class OAuthApplication
        private constructor(
            private val name: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of()
            ) : this(name, mutableMapOf())

            /**
             * The name of the OAuth Application.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun name(): String = name.getRequired("name")

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

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
                 * Returns a mutable builder for constructing an instance of [OAuthApplication].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [OAuthApplication]. */
            class Builder internal constructor() {

                private var name: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(oauthApplication: OAuthApplication) = apply {
                    name = oauthApplication.name
                    additionalProperties = oauthApplication.additionalProperties.toMutableMap()
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

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

                /**
                 * Returns an immutable instance of [OAuthApplication].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .name()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (name.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is OAuthApplication &&
                    name == other.name &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(name, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "OAuthApplication{name=$name, additionalProperties=$additionalProperties}"
        }

        /** If present, details about the User that created the transfer. */
        class User
        private constructor(
            private val email: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("email") @ExcludeMissing email: JsonField<String> = JsonMissing.of()
            ) : this(email, mutableMapOf())

            /**
             * The email address of the User.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun email(): String = email.getRequired("email")

            /**
             * Returns the raw JSON value of [email].
             *
             * Unlike [email], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

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
                 * Returns a mutable builder for constructing an instance of [User].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .email()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [User]. */
            class Builder internal constructor() {

                private var email: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(user: User) = apply {
                    email = user.email
                    additionalProperties = user.additionalProperties.toMutableMap()
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /**
                 * Sets [Builder.email] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.email] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun email(email: JsonField<String>) = apply { this.email = email }

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

                /**
                 * Returns an immutable instance of [User].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .email()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (email.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is User &&
                    email == other.email &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(email, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "User{email=$email, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreatedBy &&
                apiKey == other.apiKey &&
                category == other.category &&
                oauthApplication == other.oauthApplication &&
                user == other.user &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(apiKey, category, oauthApplication, user, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "CreatedBy{apiKey=$apiKey, category=$category, oauthApplication=$oauthApplication, user=$user, additionalProperties=$additionalProperties}"
    }

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    class Currency @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** Canadian Dollar (CAD) */
            val CAD = of("CAD")

            /** Swiss Franc (CHF) */
            val CHF = of("CHF")

            /** Euro (EUR) */
            val EUR = of("EUR")

            /** British Pound (GBP) */
            val GBP = of("GBP")

            /** Japanese Yen (JPY) */
            val JPY = of("JPY")

            /** US Dollar (USD) */
            val USD = of("USD")

            fun of(value: String) = Currency(JsonField.of(value))
        }

        /** An enum containing [Currency]'s known values. */
        enum class Known {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
        }

        /**
         * An enum containing [Currency]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Currency] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Canadian Dollar (CAD) */
            CAD,
            /** Swiss Franc (CHF) */
            CHF,
            /** Euro (EUR) */
            EUR,
            /** British Pound (GBP) */
            GBP,
            /** Japanese Yen (JPY) */
            JPY,
            /** US Dollar (USD) */
            USD,
            /** An enum member indicating that [Currency] was instantiated with an unknown value. */
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
                CAD -> Value.CAD
                CHF -> Value.CHF
                EUR -> Value.EUR
                GBP -> Value.GBP
                JPY -> Value.JPY
                USD -> Value.USD
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
                CAD -> Known.CAD
                CHF -> Known.CHF
                EUR -> Known.EUR
                GBP -> Known.GBP
                JPY -> Known.JPY
                USD -> Known.USD
                else -> throw IncreaseInvalidDataException("Unknown Currency: $value")
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

        private var validated: Boolean = false

        fun validate(): Currency = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Currency && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** Whether Increase will print and mail the check or if you will do it yourself. */
    class FulfillmentMethod @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** Increase will print and mail a physical check. */
            val PHYSICAL_CHECK = of("physical_check")

            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            val THIRD_PARTY = of("third_party")

            fun of(value: String) = FulfillmentMethod(JsonField.of(value))
        }

        /** An enum containing [FulfillmentMethod]'s known values. */
        enum class Known {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
        }

        /**
         * An enum containing [FulfillmentMethod]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [FulfillmentMethod] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Increase will print and mail a physical check. */
            PHYSICAL_CHECK,
            /**
             * Increase will not print a check; you are responsible for printing and mailing a check
             * with the provided account number, routing number, check number, and amount.
             */
            THIRD_PARTY,
            /**
             * An enum member indicating that [FulfillmentMethod] was instantiated with an unknown
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
                PHYSICAL_CHECK -> Value.PHYSICAL_CHECK
                THIRD_PARTY -> Value.THIRD_PARTY
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
                PHYSICAL_CHECK -> Known.PHYSICAL_CHECK
                THIRD_PARTY -> Known.THIRD_PARTY
                else -> throw IncreaseInvalidDataException("Unknown FulfillmentMethod: $value")
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

        private var validated: Boolean = false

        fun validate(): FulfillmentMethod = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is FulfillmentMethod && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** If the check has been mailed by Increase, this will contain details of the shipment. */
    class Mailing
    private constructor(
        private val imageId: JsonField<String>,
        private val mailedAt: JsonField<OffsetDateTime>,
        private val trackingNumber: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("image_id") @ExcludeMissing imageId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mailed_at")
            @ExcludeMissing
            mailedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("tracking_number")
            @ExcludeMissing
            trackingNumber: JsonField<String> = JsonMissing.of(),
        ) : this(imageId, mailedAt, trackingNumber, mutableMapOf())

        /**
         * The ID of the file corresponding to an image of the check that was mailed, if available.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun imageId(): String? = imageId.getNullable("image_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mailedAt(): OffsetDateTime = mailedAt.getRequired("mailed_at")

        /**
         * The tracking number of the shipment, if available for the shipping method.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun trackingNumber(): String? = trackingNumber.getNullable("tracking_number")

        /**
         * Returns the raw JSON value of [imageId].
         *
         * Unlike [imageId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("image_id") @ExcludeMissing fun _imageId(): JsonField<String> = imageId

        /**
         * Returns the raw JSON value of [mailedAt].
         *
         * Unlike [mailedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("mailed_at")
        @ExcludeMissing
        fun _mailedAt(): JsonField<OffsetDateTime> = mailedAt

        /**
         * Returns the raw JSON value of [trackingNumber].
         *
         * Unlike [trackingNumber], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tracking_number")
        @ExcludeMissing
        fun _trackingNumber(): JsonField<String> = trackingNumber

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
             * Returns a mutable builder for constructing an instance of [Mailing].
             *
             * The following fields are required:
             * ```kotlin
             * .imageId()
             * .mailedAt()
             * .trackingNumber()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Mailing]. */
        class Builder internal constructor() {

            private var imageId: JsonField<String>? = null
            private var mailedAt: JsonField<OffsetDateTime>? = null
            private var trackingNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(mailing: Mailing) = apply {
                imageId = mailing.imageId
                mailedAt = mailing.mailedAt
                trackingNumber = mailing.trackingNumber
                additionalProperties = mailing.additionalProperties.toMutableMap()
            }

            /**
             * The ID of the file corresponding to an image of the check that was mailed, if
             * available.
             */
            fun imageId(imageId: String?) = imageId(JsonField.ofNullable(imageId))

            /**
             * Sets [Builder.imageId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.imageId] with a well-typed [String] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun imageId(imageId: JsonField<String>) = apply { this.imageId = imageId }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check was mailed.
             */
            fun mailedAt(mailedAt: OffsetDateTime) = mailedAt(JsonField.of(mailedAt))

            /**
             * Sets [Builder.mailedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mailedAt] with a well-typed [OffsetDateTime] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun mailedAt(mailedAt: JsonField<OffsetDateTime>) = apply { this.mailedAt = mailedAt }

            /** The tracking number of the shipment, if available for the shipping method. */
            fun trackingNumber(trackingNumber: String?) =
                trackingNumber(JsonField.ofNullable(trackingNumber))

            /**
             * Sets [Builder.trackingNumber] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trackingNumber] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun trackingNumber(trackingNumber: JsonField<String>) = apply {
                this.trackingNumber = trackingNumber
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
             * Returns an immutable instance of [Mailing].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .imageId()
             * .mailedAt()
             * .trackingNumber()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Mailing =
                Mailing(
                    checkRequired("imageId", imageId),
                    checkRequired("mailedAt", mailedAt),
                    checkRequired("trackingNumber", trackingNumber),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Mailing = apply {
            if (validated) {
                return@apply
            }

            imageId()
            mailedAt()
            trackingNumber()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (imageId.asKnown() == null) 0 else 1) +
                (if (mailedAt.asKnown() == null) 0 else 1) +
                (if (trackingNumber.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Mailing &&
                imageId == other.imageId &&
                mailedAt == other.mailedAt &&
                trackingNumber == other.trackingNumber &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(imageId, mailedAt, trackingNumber, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Mailing{imageId=$imageId, mailedAt=$mailedAt, trackingNumber=$trackingNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the physical check that Increase will print and mail. Will be present if
     * and only if `fulfillment_method` is equal to `physical_check`.
     */
    class PhysicalCheck
    private constructor(
        private val attachmentFileId: JsonField<String>,
        private val mailingAddress: JsonField<MailingAddress>,
        private val memo: JsonField<String>,
        private val note: JsonField<String>,
        private val payer: JsonField<List<Payer>>,
        private val recipientName: JsonField<String>,
        private val returnAddress: JsonField<ReturnAddress>,
        private val shippingMethod: JsonField<ShippingMethod>,
        private val signatureText: JsonField<String>,
        private val trackingUpdates: JsonField<List<TrackingUpdate>>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("attachment_file_id")
            @ExcludeMissing
            attachmentFileId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("mailing_address")
            @ExcludeMissing
            mailingAddress: JsonField<MailingAddress> = JsonMissing.of(),
            @JsonProperty("memo") @ExcludeMissing memo: JsonField<String> = JsonMissing.of(),
            @JsonProperty("note") @ExcludeMissing note: JsonField<String> = JsonMissing.of(),
            @JsonProperty("payer") @ExcludeMissing payer: JsonField<List<Payer>> = JsonMissing.of(),
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of(),
            @JsonProperty("return_address")
            @ExcludeMissing
            returnAddress: JsonField<ReturnAddress> = JsonMissing.of(),
            @JsonProperty("shipping_method")
            @ExcludeMissing
            shippingMethod: JsonField<ShippingMethod> = JsonMissing.of(),
            @JsonProperty("signature_text")
            @ExcludeMissing
            signatureText: JsonField<String> = JsonMissing.of(),
            @JsonProperty("tracking_updates")
            @ExcludeMissing
            trackingUpdates: JsonField<List<TrackingUpdate>> = JsonMissing.of(),
        ) : this(
            attachmentFileId,
            mailingAddress,
            memo,
            note,
            payer,
            recipientName,
            returnAddress,
            shippingMethod,
            signatureText,
            trackingUpdates,
            mutableMapOf(),
        )

        /**
         * The ID of the file for the check attachment.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun attachmentFileId(): String? = attachmentFileId.getNullable("attachment_file_id")

        /**
         * Details for where Increase will mail the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun mailingAddress(): MailingAddress = mailingAddress.getRequired("mailing_address")

        /**
         * The descriptor that will be printed on the memo field on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun memo(): String? = memo.getNullable("memo")

        /**
         * The descriptor that will be printed on the letter included with the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun note(): String? = note.getNullable("note")

        /**
         * The payer of the check. This will be printed on the top-left portion of the check and
         * defaults to the return address if unspecified.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun payer(): List<Payer> = payer.getRequired("payer")

        /**
         * The name that will be printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun recipientName(): String = recipientName.getRequired("recipient_name")

        /**
         * The return address to be printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun returnAddress(): ReturnAddress? = returnAddress.getNullable("return_address")

        /**
         * The shipping method for the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun shippingMethod(): ShippingMethod? = shippingMethod.getNullable("shipping_method")

        /**
         * The text that will appear as the signature on the check in cursive font. If blank, the
         * check will be printed with 'No signature required'.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun signatureText(): String? = signatureText.getNullable("signature_text")

        /**
         * Tracking updates relating to the physical check's delivery.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun trackingUpdates(): List<TrackingUpdate> =
            trackingUpdates.getRequired("tracking_updates")

        /**
         * Returns the raw JSON value of [attachmentFileId].
         *
         * Unlike [attachmentFileId], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("attachment_file_id")
        @ExcludeMissing
        fun _attachmentFileId(): JsonField<String> = attachmentFileId

        /**
         * Returns the raw JSON value of [mailingAddress].
         *
         * Unlike [mailingAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("mailing_address")
        @ExcludeMissing
        fun _mailingAddress(): JsonField<MailingAddress> = mailingAddress

        /**
         * Returns the raw JSON value of [memo].
         *
         * Unlike [memo], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("memo") @ExcludeMissing fun _memo(): JsonField<String> = memo

        /**
         * Returns the raw JSON value of [note].
         *
         * Unlike [note], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("note") @ExcludeMissing fun _note(): JsonField<String> = note

        /**
         * Returns the raw JSON value of [payer].
         *
         * Unlike [payer], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("payer") @ExcludeMissing fun _payer(): JsonField<List<Payer>> = payer

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

        /**
         * Returns the raw JSON value of [returnAddress].
         *
         * Unlike [returnAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun _returnAddress(): JsonField<ReturnAddress> = returnAddress

        /**
         * Returns the raw JSON value of [shippingMethod].
         *
         * Unlike [shippingMethod], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("shipping_method")
        @ExcludeMissing
        fun _shippingMethod(): JsonField<ShippingMethod> = shippingMethod

        /**
         * Returns the raw JSON value of [signatureText].
         *
         * Unlike [signatureText], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("signature_text")
        @ExcludeMissing
        fun _signatureText(): JsonField<String> = signatureText

        /**
         * Returns the raw JSON value of [trackingUpdates].
         *
         * Unlike [trackingUpdates], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("tracking_updates")
        @ExcludeMissing
        fun _trackingUpdates(): JsonField<List<TrackingUpdate>> = trackingUpdates

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
             * Returns a mutable builder for constructing an instance of [PhysicalCheck].
             *
             * The following fields are required:
             * ```kotlin
             * .attachmentFileId()
             * .mailingAddress()
             * .memo()
             * .note()
             * .payer()
             * .recipientName()
             * .returnAddress()
             * .shippingMethod()
             * .signatureText()
             * .trackingUpdates()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [PhysicalCheck]. */
        class Builder internal constructor() {

            private var attachmentFileId: JsonField<String>? = null
            private var mailingAddress: JsonField<MailingAddress>? = null
            private var memo: JsonField<String>? = null
            private var note: JsonField<String>? = null
            private var payer: JsonField<MutableList<Payer>>? = null
            private var recipientName: JsonField<String>? = null
            private var returnAddress: JsonField<ReturnAddress>? = null
            private var shippingMethod: JsonField<ShippingMethod>? = null
            private var signatureText: JsonField<String>? = null
            private var trackingUpdates: JsonField<MutableList<TrackingUpdate>>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(physicalCheck: PhysicalCheck) = apply {
                attachmentFileId = physicalCheck.attachmentFileId
                mailingAddress = physicalCheck.mailingAddress
                memo = physicalCheck.memo
                note = physicalCheck.note
                payer = physicalCheck.payer.map { it.toMutableList() }
                recipientName = physicalCheck.recipientName
                returnAddress = physicalCheck.returnAddress
                shippingMethod = physicalCheck.shippingMethod
                signatureText = physicalCheck.signatureText
                trackingUpdates = physicalCheck.trackingUpdates.map { it.toMutableList() }
                additionalProperties = physicalCheck.additionalProperties.toMutableMap()
            }

            /** The ID of the file for the check attachment. */
            fun attachmentFileId(attachmentFileId: String?) =
                attachmentFileId(JsonField.ofNullable(attachmentFileId))

            /**
             * Sets [Builder.attachmentFileId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.attachmentFileId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun attachmentFileId(attachmentFileId: JsonField<String>) = apply {
                this.attachmentFileId = attachmentFileId
            }

            /** Details for where Increase will mail the check. */
            fun mailingAddress(mailingAddress: MailingAddress) =
                mailingAddress(JsonField.of(mailingAddress))

            /**
             * Sets [Builder.mailingAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.mailingAddress] with a well-typed [MailingAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun mailingAddress(mailingAddress: JsonField<MailingAddress>) = apply {
                this.mailingAddress = mailingAddress
            }

            /** The descriptor that will be printed on the memo field on the check. */
            fun memo(memo: String?) = memo(JsonField.ofNullable(memo))

            /**
             * Sets [Builder.memo] to an arbitrary JSON value.
             *
             * You should usually call [Builder.memo] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun memo(memo: JsonField<String>) = apply { this.memo = memo }

            /** The descriptor that will be printed on the letter included with the check. */
            fun note(note: String?) = note(JsonField.ofNullable(note))

            /**
             * Sets [Builder.note] to an arbitrary JSON value.
             *
             * You should usually call [Builder.note] with a well-typed [String] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
             */
            fun note(note: JsonField<String>) = apply { this.note = note }

            /**
             * The payer of the check. This will be printed on the top-left portion of the check and
             * defaults to the return address if unspecified.
             */
            fun payer(payer: List<Payer>) = payer(JsonField.of(payer))

            /**
             * Sets [Builder.payer] to an arbitrary JSON value.
             *
             * You should usually call [Builder.payer] with a well-typed `List<Payer>` value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun payer(payer: JsonField<List<Payer>>) = apply {
                this.payer = payer.map { it.toMutableList() }
            }

            /**
             * Adds a single [Payer] to [Builder.payer].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addPayer(payer: Payer) = apply {
                this.payer =
                    (this.payer ?: JsonField.of(mutableListOf())).also {
                        checkKnown("payer", it).add(payer)
                    }
            }

            /** The name that will be printed on the check. */
            fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
            }

            /** The return address to be printed on the check. */
            fun returnAddress(returnAddress: ReturnAddress?) =
                returnAddress(JsonField.ofNullable(returnAddress))

            /**
             * Sets [Builder.returnAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.returnAddress] with a well-typed [ReturnAddress]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
                this.returnAddress = returnAddress
            }

            /** The shipping method for the check. */
            fun shippingMethod(shippingMethod: ShippingMethod?) =
                shippingMethod(JsonField.ofNullable(shippingMethod))

            /**
             * Sets [Builder.shippingMethod] to an arbitrary JSON value.
             *
             * You should usually call [Builder.shippingMethod] with a well-typed [ShippingMethod]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun shippingMethod(shippingMethod: JsonField<ShippingMethod>) = apply {
                this.shippingMethod = shippingMethod
            }

            /**
             * The text that will appear as the signature on the check in cursive font. If blank,
             * the check will be printed with 'No signature required'.
             */
            fun signatureText(signatureText: String?) =
                signatureText(JsonField.ofNullable(signatureText))

            /**
             * Sets [Builder.signatureText] to an arbitrary JSON value.
             *
             * You should usually call [Builder.signatureText] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun signatureText(signatureText: JsonField<String>) = apply {
                this.signatureText = signatureText
            }

            /** Tracking updates relating to the physical check's delivery. */
            fun trackingUpdates(trackingUpdates: List<TrackingUpdate>) =
                trackingUpdates(JsonField.of(trackingUpdates))

            /**
             * Sets [Builder.trackingUpdates] to an arbitrary JSON value.
             *
             * You should usually call [Builder.trackingUpdates] with a well-typed
             * `List<TrackingUpdate>` value instead. This method is primarily for setting the field
             * to an undocumented or not yet supported value.
             */
            fun trackingUpdates(trackingUpdates: JsonField<List<TrackingUpdate>>) = apply {
                this.trackingUpdates = trackingUpdates.map { it.toMutableList() }
            }

            /**
             * Adds a single [TrackingUpdate] to [trackingUpdates].
             *
             * @throws IllegalStateException if the field was previously set to a non-list.
             */
            fun addTrackingUpdate(trackingUpdate: TrackingUpdate) = apply {
                trackingUpdates =
                    (trackingUpdates ?: JsonField.of(mutableListOf())).also {
                        checkKnown("trackingUpdates", it).add(trackingUpdate)
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
             * Returns an immutable instance of [PhysicalCheck].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .attachmentFileId()
             * .mailingAddress()
             * .memo()
             * .note()
             * .payer()
             * .recipientName()
             * .returnAddress()
             * .shippingMethod()
             * .signatureText()
             * .trackingUpdates()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): PhysicalCheck =
                PhysicalCheck(
                    checkRequired("attachmentFileId", attachmentFileId),
                    checkRequired("mailingAddress", mailingAddress),
                    checkRequired("memo", memo),
                    checkRequired("note", note),
                    checkRequired("payer", payer).map { it.toImmutable() },
                    checkRequired("recipientName", recipientName),
                    checkRequired("returnAddress", returnAddress),
                    checkRequired("shippingMethod", shippingMethod),
                    checkRequired("signatureText", signatureText),
                    checkRequired("trackingUpdates", trackingUpdates).map { it.toImmutable() },
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): PhysicalCheck = apply {
            if (validated) {
                return@apply
            }

            attachmentFileId()
            mailingAddress().validate()
            memo()
            note()
            payer().forEach { it.validate() }
            recipientName()
            returnAddress()?.validate()
            shippingMethod()?.validate()
            signatureText()
            trackingUpdates().forEach { it.validate() }
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (if (attachmentFileId.asKnown() == null) 0 else 1) +
                (mailingAddress.asKnown()?.validity() ?: 0) +
                (if (memo.asKnown() == null) 0 else 1) +
                (if (note.asKnown() == null) 0 else 1) +
                (payer.asKnown()?.sumOf { it.validity().toInt() } ?: 0) +
                (if (recipientName.asKnown() == null) 0 else 1) +
                (returnAddress.asKnown()?.validity() ?: 0) +
                (shippingMethod.asKnown()?.validity() ?: 0) +
                (if (signatureText.asKnown() == null) 0 else 1) +
                (trackingUpdates.asKnown()?.sumOf { it.validity().toInt() } ?: 0)

        /** Details for where Increase will mail the check. */
        class MailingAddress
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, name, postalCode, state, mutableMapOf())

            /**
             * The city of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun city(): String? = city.getNullable("city")

            /**
             * The street address of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line1(): String? = line1.getNullable("line1")

            /**
             * The second line of the address of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): String? = line2.getNullable("line2")

            /**
             * The name component of the check's mailing address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * The postal code of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /**
             * The state of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): String? = state.getNullable("state")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
                 * Returns a mutable builder for constructing an instance of [MailingAddress].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [MailingAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(mailingAddress: MailingAddress) = apply {
                    city = mailingAddress.city
                    line1 = mailingAddress.line1
                    line2 = mailingAddress.line2
                    name = mailingAddress.name
                    postalCode = mailingAddress.postalCode
                    state = mailingAddress.state
                    additionalProperties = mailingAddress.additionalProperties.toMutableMap()
                }

                /** The city of the check's destination. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's mailing address. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                /**
                 * Returns an immutable instance of [MailingAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): MailingAddress =
                    MailingAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): MailingAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                name()
                postalCode()
                state()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (city.asKnown() == null) 0 else 1) +
                    (if (line1.asKnown() == null) 0 else 1) +
                    (if (line2.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (postalCode.asKnown() == null) 0 else 1) +
                    (if (state.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is MailingAddress &&
                    city == other.city &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    name == other.name &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "MailingAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        class Payer
        private constructor(
            private val contents: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("contents")
                @ExcludeMissing
                contents: JsonField<String> = JsonMissing.of()
            ) : this(contents, mutableMapOf())

            /**
             * The contents of the line.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun contents(): String = contents.getRequired("contents")

            /**
             * Returns the raw JSON value of [contents].
             *
             * Unlike [contents], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("contents") @ExcludeMissing fun _contents(): JsonField<String> = contents

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
                 * Returns a mutable builder for constructing an instance of [Payer].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .contents()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [Payer]. */
            class Builder internal constructor() {

                private var contents: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(payer: Payer) = apply {
                    contents = payer.contents
                    additionalProperties = payer.additionalProperties.toMutableMap()
                }

                /** The contents of the line. */
                fun contents(contents: String) = contents(JsonField.of(contents))

                /**
                 * Sets [Builder.contents] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.contents] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun contents(contents: JsonField<String>) = apply { this.contents = contents }

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

                /**
                 * Returns an immutable instance of [Payer].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .contents()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): Payer =
                    Payer(checkRequired("contents", contents), additionalProperties.toMutableMap())
            }

            private var validated: Boolean = false

            fun validate(): Payer = apply {
                if (validated) {
                    return@apply
                }

                contents()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = (if (contents.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Payer &&
                    contents == other.contents &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy { Objects.hash(contents, additionalProperties) }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Payer{contents=$contents, additionalProperties=$additionalProperties}"
        }

        /** The return address to be printed on the check. */
        class ReturnAddress
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val name: JsonField<String>,
            private val postalCode: JsonField<String>,
            private val state: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("name") @ExcludeMissing name: JsonField<String> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, name, postalCode, state, mutableMapOf())

            /**
             * The city of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun city(): String? = city.getNullable("city")

            /**
             * The street address of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line1(): String? = line1.getNullable("line1")

            /**
             * The second line of the address of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): String? = line2.getNullable("line2")

            /**
             * The name component of the check's return address.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun name(): String? = name.getNullable("name")

            /**
             * The postal code of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun postalCode(): String? = postalCode.getNullable("postal_code")

            /**
             * The state of the check's destination.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun state(): String? = state.getNullable("state")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * Returns the raw JSON value of [name].
             *
             * Unlike [name], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

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
                 * Returns a mutable builder for constructing an instance of [ReturnAddress].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [ReturnAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var name: JsonField<String>? = null
                private var postalCode: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(returnAddress: ReturnAddress) = apply {
                    city = returnAddress.city
                    line1 = returnAddress.line1
                    line2 = returnAddress.line2
                    name = returnAddress.name
                    postalCode = returnAddress.postalCode
                    state = returnAddress.state
                    additionalProperties = returnAddress.additionalProperties.toMutableMap()
                }

                /** The city of the check's destination. */
                fun city(city: String?) = city(JsonField.ofNullable(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The street address of the check's destination. */
                fun line1(line1: String?) = line1(JsonField.ofNullable(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The second line of the address of the check's destination. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The name component of the check's return address. */
                fun name(name: String?) = name(JsonField.ofNullable(name))

                /**
                 * Sets [Builder.name] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.name] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun name(name: JsonField<String>) = apply { this.name = name }

                /** The postal code of the check's destination. */
                fun postalCode(postalCode: String?) = postalCode(JsonField.ofNullable(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
                }

                /** The state of the check's destination. */
                fun state(state: String?) = state(JsonField.ofNullable(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

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

                /**
                 * Returns an immutable instance of [ReturnAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .name()
                 * .postalCode()
                 * .state()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): ReturnAddress =
                    ReturnAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("name", name),
                        checkRequired("postalCode", postalCode),
                        checkRequired("state", state),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): ReturnAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                name()
                postalCode()
                state()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (city.asKnown() == null) 0 else 1) +
                    (if (line1.asKnown() == null) 0 else 1) +
                    (if (line2.asKnown() == null) 0 else 1) +
                    (if (name.asKnown() == null) 0 else 1) +
                    (if (postalCode.asKnown() == null) 0 else 1) +
                    (if (state.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ReturnAddress &&
                    city == other.city &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    name == other.name &&
                    postalCode == other.postalCode &&
                    state == other.state &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, line2, name, postalCode, state, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "ReturnAddress{city=$city, line1=$line1, line2=$line2, name=$name, postalCode=$postalCode, state=$state, additionalProperties=$additionalProperties}"
        }

        /** The shipping method for the check. */
        class ShippingMethod
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** USPS First Class */
                val USPS_FIRST_CLASS = of("usps_first_class")

                /** FedEx Overnight */
                val FEDEX_OVERNIGHT = of("fedex_overnight")

                fun of(value: String) = ShippingMethod(JsonField.of(value))
            }

            /** An enum containing [ShippingMethod]'s known values. */
            enum class Known {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
            }

            /**
             * An enum containing [ShippingMethod]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ShippingMethod] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** USPS First Class */
                USPS_FIRST_CLASS,
                /** FedEx Overnight */
                FEDEX_OVERNIGHT,
                /**
                 * An enum member indicating that [ShippingMethod] was instantiated with an unknown
                 * value.
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
                    USPS_FIRST_CLASS -> Value.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Value.FEDEX_OVERNIGHT
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
                    USPS_FIRST_CLASS -> Known.USPS_FIRST_CLASS
                    FEDEX_OVERNIGHT -> Known.FEDEX_OVERNIGHT
                    else -> throw IncreaseInvalidDataException("Unknown ShippingMethod: $value")
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

            private var validated: Boolean = false

            fun validate(): ShippingMethod = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is ShippingMethod && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        class TrackingUpdate
        private constructor(
            private val category: JsonField<Category>,
            private val createdAt: JsonField<OffsetDateTime>,
            private val postalCode: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("category")
                @ExcludeMissing
                category: JsonField<Category> = JsonMissing.of(),
                @JsonProperty("created_at")
                @ExcludeMissing
                createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
                @JsonProperty("postal_code")
                @ExcludeMissing
                postalCode: JsonField<String> = JsonMissing.of(),
            ) : this(category, createdAt, postalCode, mutableMapOf())

            /**
             * The type of tracking event.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun category(): Category = category.getRequired("category")

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * tracking event took place.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

            /**
             * The postal code where the event took place.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun postalCode(): String = postalCode.getRequired("postal_code")

            /**
             * Returns the raw JSON value of [category].
             *
             * Unlike [category], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("category")
            @ExcludeMissing
            fun _category(): JsonField<Category> = category

            /**
             * Returns the raw JSON value of [createdAt].
             *
             * Unlike [createdAt], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("created_at")
            @ExcludeMissing
            fun _createdAt(): JsonField<OffsetDateTime> = createdAt

            /**
             * Returns the raw JSON value of [postalCode].
             *
             * Unlike [postalCode], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("postal_code")
            @ExcludeMissing
            fun _postalCode(): JsonField<String> = postalCode

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
                 * Returns a mutable builder for constructing an instance of [TrackingUpdate].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .category()
                 * .createdAt()
                 * .postalCode()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [TrackingUpdate]. */
            class Builder internal constructor() {

                private var category: JsonField<Category>? = null
                private var createdAt: JsonField<OffsetDateTime>? = null
                private var postalCode: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(trackingUpdate: TrackingUpdate) = apply {
                    category = trackingUpdate.category
                    createdAt = trackingUpdate.createdAt
                    postalCode = trackingUpdate.postalCode
                    additionalProperties = trackingUpdate.additionalProperties.toMutableMap()
                }

                /** The type of tracking event. */
                fun category(category: Category) = category(JsonField.of(category))

                /**
                 * Sets [Builder.category] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.category] with a well-typed [Category] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun category(category: JsonField<Category>) = apply { this.category = category }

                /**
                 * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
                 * tracking event took place.
                 */
                fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

                /**
                 * Sets [Builder.createdAt] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.createdAt] with a well-typed [OffsetDateTime]
                 * value instead. This method is primarily for setting the field to an undocumented
                 * or not yet supported value.
                 */
                fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                    this.createdAt = createdAt
                }

                /** The postal code where the event took place. */
                fun postalCode(postalCode: String) = postalCode(JsonField.of(postalCode))

                /**
                 * Sets [Builder.postalCode] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.postalCode] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun postalCode(postalCode: JsonField<String>) = apply {
                    this.postalCode = postalCode
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

                /**
                 * Returns an immutable instance of [TrackingUpdate].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .category()
                 * .createdAt()
                 * .postalCode()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): TrackingUpdate =
                    TrackingUpdate(
                        checkRequired("category", category),
                        checkRequired("createdAt", createdAt),
                        checkRequired("postalCode", postalCode),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): TrackingUpdate = apply {
                if (validated) {
                    return@apply
                }

                category().validate()
                createdAt()
                postalCode()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (category.asKnown()?.validity() ?: 0) +
                    (if (createdAt.asKnown() == null) 0 else 1) +
                    (if (postalCode.asKnown() == null) 0 else 1)

            /** The type of tracking event. */
            class Category @JsonCreator private constructor(private val value: JsonField<String>) :
                Enum {

                /**
                 * Returns this class instance's raw value.
                 *
                 * This is usually only useful if this instance was deserialized from data that
                 * doesn't match any known member, and you want to know that value. For example, if
                 * the SDK is on an older version than the API, then the API may respond with new
                 * members that the SDK is unaware of.
                 */
                @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

                companion object {

                    /** The check is in transit. */
                    val IN_TRANSIT = of("in_transit")

                    /** The check has been processed for delivery. */
                    val PROCESSED_FOR_DELIVERY = of("processed_for_delivery")

                    /** The check has been delivered. */
                    val DELIVERED = of("delivered")

                    /** Delivery failed and the check was returned to sender. */
                    val RETURNED_TO_SENDER = of("returned_to_sender")

                    fun of(value: String) = Category(JsonField.of(value))
                }

                /** An enum containing [Category]'s known values. */
                enum class Known {
                    /** The check is in transit. */
                    IN_TRANSIT,
                    /** The check has been processed for delivery. */
                    PROCESSED_FOR_DELIVERY,
                    /** The check has been delivered. */
                    DELIVERED,
                    /** Delivery failed and the check was returned to sender. */
                    RETURNED_TO_SENDER,
                }

                /**
                 * An enum containing [Category]'s known values, as well as an [_UNKNOWN] member.
                 *
                 * An instance of [Category] can contain an unknown value in a couple of cases:
                 * - It was deserialized from data that doesn't match any known member. For example,
                 *   if the SDK is on an older version than the API, then the API may respond with
                 *   new members that the SDK is unaware of.
                 * - It was constructed with an arbitrary value using the [of] method.
                 */
                enum class Value {
                    /** The check is in transit. */
                    IN_TRANSIT,
                    /** The check has been processed for delivery. */
                    PROCESSED_FOR_DELIVERY,
                    /** The check has been delivered. */
                    DELIVERED,
                    /** Delivery failed and the check was returned to sender. */
                    RETURNED_TO_SENDER,
                    /**
                     * An enum member indicating that [Category] was instantiated with an unknown
                     * value.
                     */
                    _UNKNOWN,
                }

                /**
                 * Returns an enum member corresponding to this class instance's value, or
                 * [Value._UNKNOWN] if the class was instantiated with an unknown value.
                 *
                 * Use the [known] method instead if you're certain the value is always known or if
                 * you want to throw for the unknown case.
                 */
                fun value(): Value =
                    when (this) {
                        IN_TRANSIT -> Value.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Value.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Value.DELIVERED
                        RETURNED_TO_SENDER -> Value.RETURNED_TO_SENDER
                        else -> Value._UNKNOWN
                    }

                /**
                 * Returns an enum member corresponding to this class instance's value.
                 *
                 * Use the [value] method instead if you're uncertain the value is always known and
                 * don't want to throw for the unknown case.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value is a not a
                 *   known member.
                 */
                fun known(): Known =
                    when (this) {
                        IN_TRANSIT -> Known.IN_TRANSIT
                        PROCESSED_FOR_DELIVERY -> Known.PROCESSED_FOR_DELIVERY
                        DELIVERED -> Known.DELIVERED
                        RETURNED_TO_SENDER -> Known.RETURNED_TO_SENDER
                        else -> throw IncreaseInvalidDataException("Unknown Category: $value")
                    }

                /**
                 * Returns this class instance's primitive wire representation.
                 *
                 * This differs from the [toString] method because that method is primarily for
                 * debugging and generally doesn't throw.
                 *
                 * @throws IncreaseInvalidDataException if this class instance's value does not have
                 *   the expected primitive type.
                 */
                fun asString(): String =
                    _value().asString()
                        ?: throw IncreaseInvalidDataException("Value is not a String")

                private var validated: Boolean = false

                fun validate(): Category = apply {
                    if (validated) {
                        return@apply
                    }

                    known()
                    validated = true
                }

                fun isValid(): Boolean =
                    try {
                        validate()
                        true
                    } catch (e: IncreaseInvalidDataException) {
                        false
                    }

                /**
                 * Returns a score indicating how many valid values are contained in this object
                 * recursively.
                 *
                 * Used for best match union deserialization.
                 */
                internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return other is Category && value == other.value
                }

                override fun hashCode() = value.hashCode()

                override fun toString() = value.toString()
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is TrackingUpdate &&
                    category == other.category &&
                    createdAt == other.createdAt &&
                    postalCode == other.postalCode &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(category, createdAt, postalCode, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "TrackingUpdate{category=$category, createdAt=$createdAt, postalCode=$postalCode, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is PhysicalCheck &&
                attachmentFileId == other.attachmentFileId &&
                mailingAddress == other.mailingAddress &&
                memo == other.memo &&
                note == other.note &&
                payer == other.payer &&
                recipientName == other.recipientName &&
                returnAddress == other.returnAddress &&
                shippingMethod == other.shippingMethod &&
                signatureText == other.signatureText &&
                trackingUpdates == other.trackingUpdates &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                attachmentFileId,
                mailingAddress,
                memo,
                note,
                payer,
                recipientName,
                returnAddress,
                shippingMethod,
                signatureText,
                trackingUpdates,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PhysicalCheck{attachmentFileId=$attachmentFileId, mailingAddress=$mailingAddress, memo=$memo, note=$note, payer=$payer, recipientName=$recipientName, returnAddress=$returnAddress, shippingMethod=$shippingMethod, signatureText=$signatureText, trackingUpdates=$trackingUpdates, additionalProperties=$additionalProperties}"
    }

    /** The lifecycle status of the transfer. */
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

            /** The transfer is awaiting approval. */
            val PENDING_APPROVAL = of("pending_approval")

            /** The transfer has been canceled. */
            val CANCELED = of("canceled")

            /** The transfer is pending submission. */
            val PENDING_SUBMISSION = of("pending_submission")

            /** The transfer requires attention from an Increase operator. */
            val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer has been rejected. */
            val REJECTED = of("rejected")

            /** The check is queued for mailing. */
            val PENDING_MAILING = of("pending_mailing")

            /** The check has been mailed. */
            val MAILED = of("mailed")

            /** The check has been deposited. */
            val DEPOSITED = of("deposited")

            /** A stop-payment was requested for this check. */
            val STOPPED = of("stopped")

            /** The transfer has been returned. */
            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is awaiting approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission. */
            PENDING_SUBMISSION,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The check is queued for mailing. */
            PENDING_MAILING,
            /** The check has been mailed. */
            MAILED,
            /** The check has been deposited. */
            DEPOSITED,
            /** A stop-payment was requested for this check. */
            STOPPED,
            /** The transfer has been returned. */
            RETURNED,
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
            /** The transfer is awaiting approval. */
            PENDING_APPROVAL,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission. */
            PENDING_SUBMISSION,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The check is queued for mailing. */
            PENDING_MAILING,
            /** The check has been mailed. */
            MAILED,
            /** The check has been deposited. */
            DEPOSITED,
            /** A stop-payment was requested for this check. */
            STOPPED,
            /** The transfer has been returned. */
            RETURNED,
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
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                CANCELED -> Value.CANCELED
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                REJECTED -> Value.REJECTED
                PENDING_MAILING -> Value.PENDING_MAILING
                MAILED -> Value.MAILED
                DEPOSITED -> Value.DEPOSITED
                STOPPED -> Value.STOPPED
                RETURNED -> Value.RETURNED
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
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                CANCELED -> Known.CANCELED
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                REJECTED -> Known.REJECTED
                PENDING_MAILING -> Known.PENDING_MAILING
                MAILED -> Known.MAILED
                DEPOSITED -> Known.DEPOSITED
                STOPPED -> Known.STOPPED
                RETURNED -> Known.RETURNED
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

        private var validated: Boolean = false

        fun validate(): Status = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Status && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    class StopPaymentRequest
    private constructor(
        private val reason: JsonField<Reason>,
        private val requestedAt: JsonField<OffsetDateTime>,
        private val transferId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("reason") @ExcludeMissing reason: JsonField<Reason> = JsonMissing.of(),
            @JsonProperty("requested_at")
            @ExcludeMissing
            requestedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
            @JsonProperty("transfer_id")
            @ExcludeMissing
            transferId: JsonField<String> = JsonMissing.of(),
            @JsonProperty("type") @ExcludeMissing type: JsonField<Type> = JsonMissing.of(),
        ) : this(reason, requestedAt, transferId, type, mutableMapOf())

        /**
         * The reason why this transfer was stopped.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The time the stop-payment was requested.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

        /**
         * The ID of the check transfer that was stopped.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun type(): Type = type.getRequired("type")

        /**
         * Returns the raw JSON value of [reason].
         *
         * Unlike [reason], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("reason") @ExcludeMissing fun _reason(): JsonField<Reason> = reason

        /**
         * Returns the raw JSON value of [requestedAt].
         *
         * Unlike [requestedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("requested_at")
        @ExcludeMissing
        fun _requestedAt(): JsonField<OffsetDateTime> = requestedAt

        /**
         * Returns the raw JSON value of [transferId].
         *
         * Unlike [transferId], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId(): JsonField<String> = transferId

        /**
         * Returns the raw JSON value of [type].
         *
         * Unlike [type], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

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
             * Returns a mutable builder for constructing an instance of [StopPaymentRequest].
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .requestedAt()
             * .transferId()
             * .type()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [StopPaymentRequest]. */
        class Builder internal constructor() {

            private var reason: JsonField<Reason>? = null
            private var requestedAt: JsonField<OffsetDateTime>? = null
            private var transferId: JsonField<String>? = null
            private var type: JsonField<Type>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stopPaymentRequest: StopPaymentRequest) = apply {
                reason = stopPaymentRequest.reason
                requestedAt = stopPaymentRequest.requestedAt
                transferId = stopPaymentRequest.transferId
                type = stopPaymentRequest.type
                additionalProperties = stopPaymentRequest.additionalProperties.toMutableMap()
            }

            /** The reason why this transfer was stopped. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /**
             * Sets [Builder.reason] to an arbitrary JSON value.
             *
             * You should usually call [Builder.reason] with a well-typed [Reason] value instead.
             * This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /** The time the stop-payment was requested. */
            fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

            /**
             * Sets [Builder.requestedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.requestedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun requestedAt(requestedAt: JsonField<OffsetDateTime>) = apply {
                this.requestedAt = requestedAt
            }

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /**
             * Sets [Builder.transferId] to an arbitrary JSON value.
             *
             * You should usually call [Builder.transferId] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

            /**
             * A constant representing the object's type. For this resource it will always be
             * `check_transfer_stop_payment_request`.
             */
            fun type(type: Type) = type(JsonField.of(type))

            /**
             * Sets [Builder.type] to an arbitrary JSON value.
             *
             * You should usually call [Builder.type] with a well-typed [Type] value instead. This
             * method is primarily for setting the field to an undocumented or not yet supported
             * value.
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

            /**
             * Returns an immutable instance of [StopPaymentRequest].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .reason()
             * .requestedAt()
             * .transferId()
             * .type()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): StopPaymentRequest =
                StopPaymentRequest(
                    checkRequired("reason", reason),
                    checkRequired("requestedAt", requestedAt),
                    checkRequired("transferId", transferId),
                    checkRequired("type", type),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): StopPaymentRequest = apply {
            if (validated) {
                return@apply
            }

            reason().validate()
            requestedAt()
            transferId()
            type().validate()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (reason.asKnown()?.validity() ?: 0) +
                (if (requestedAt.asKnown() == null) 0 else 1) +
                (if (transferId.asKnown() == null) 0 else 1) +
                (type.asKnown()?.validity() ?: 0)

        /** The reason why this transfer was stopped. */
        class Reason @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                /** The check could not be delivered. */
                val MAIL_DELIVERY_FAILED = of("mail_delivery_failed")

                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                val REJECTED_BY_INCREASE = of("rejected_by_increase")

                /** The check was not authorized. */
                val NOT_AUTHORIZED = of("not_authorized")

                /** The check was stopped for another reason. */
                val UNKNOWN = of("unknown")

                fun of(value: String) = Reason(JsonField.of(value))
            }

            /** An enum containing [Reason]'s known values. */
            enum class Known {
                /** The check could not be delivered. */
                MAIL_DELIVERY_FAILED,
                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                REJECTED_BY_INCREASE,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was stopped for another reason. */
                UNKNOWN,
            }

            /**
             * An enum containing [Reason]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Reason] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The check could not be delivered. */
                MAIL_DELIVERY_FAILED,
                /**
                 * The check was canceled by an Increase operator who will provide details
                 * out-of-band.
                 */
                REJECTED_BY_INCREASE,
                /** The check was not authorized. */
                NOT_AUTHORIZED,
                /** The check was stopped for another reason. */
                UNKNOWN,
                /**
                 * An enum member indicating that [Reason] was instantiated with an unknown value.
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
                    MAIL_DELIVERY_FAILED -> Value.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Value.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Value.NOT_AUTHORIZED
                    UNKNOWN -> Value.UNKNOWN
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
                    MAIL_DELIVERY_FAILED -> Known.MAIL_DELIVERY_FAILED
                    REJECTED_BY_INCREASE -> Known.REJECTED_BY_INCREASE
                    NOT_AUTHORIZED -> Known.NOT_AUTHORIZED
                    UNKNOWN -> Known.UNKNOWN
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
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

            private var validated: Boolean = false

            fun validate(): Reason = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Reason && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        class Type @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

                val CHECK_TRANSFER_STOP_PAYMENT_REQUEST = of("check_transfer_stop_payment_request")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST
            }

            /**
             * An enum containing [Type]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [Type] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                CHECK_TRANSFER_STOP_PAYMENT_REQUEST,
                /** An enum member indicating that [Type] was instantiated with an unknown value. */
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
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
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
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
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

            private var validated: Boolean = false

            fun validate(): Type = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is Type && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StopPaymentRequest &&
                reason == other.reason &&
                requestedAt == other.requestedAt &&
                transferId == other.transferId &&
                type == other.type &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(reason, requestedAt, transferId, type, additionalProperties)
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "StopPaymentRequest{reason=$reason, requestedAt=$requestedAt, transferId=$transferId, type=$type, additionalProperties=$additionalProperties}"
    }

    /** After the transfer is submitted, this will contain supplemental details. */
    class Submission
    private constructor(
        private val addressCorrectionAction: JsonField<AddressCorrectionAction>,
        private val submittedAddress: JsonField<SubmittedAddress>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("address_correction_action")
            @ExcludeMissing
            addressCorrectionAction: JsonField<AddressCorrectionAction> = JsonMissing.of(),
            @JsonProperty("submitted_address")
            @ExcludeMissing
            submittedAddress: JsonField<SubmittedAddress> = JsonMissing.of(),
            @JsonProperty("submitted_at")
            @ExcludeMissing
            submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        ) : this(addressCorrectionAction, submittedAddress, submittedAt, mutableMapOf())

        /**
         * Per USPS requirements, Increase will standardize the address to USPS standards and check
         * it against the USPS National Change of Address (NCOA) database before mailing it. This
         * indicates what modifications, if any, were made to the address before printing and
         * mailing the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun addressCorrectionAction(): AddressCorrectionAction =
            addressCorrectionAction.getRequired("address_correction_action")

        /**
         * The address we submitted to the printer. This is what is physically printed on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAddress(): SubmittedAddress = submittedAddress.getRequired("submitted_address")

        /**
         * When this check transfer was submitted to our check printer.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
         *   unexpectedly missing or null (e.g. if the server responded with an unexpected value).
         */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * Returns the raw JSON value of [addressCorrectionAction].
         *
         * Unlike [addressCorrectionAction], this method doesn't throw if the JSON field has an
         * unexpected type.
         */
        @JsonProperty("address_correction_action")
        @ExcludeMissing
        fun _addressCorrectionAction(): JsonField<AddressCorrectionAction> = addressCorrectionAction

        /**
         * Returns the raw JSON value of [submittedAddress].
         *
         * Unlike [submittedAddress], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("submitted_address")
        @ExcludeMissing
        fun _submittedAddress(): JsonField<SubmittedAddress> = submittedAddress

        /**
         * Returns the raw JSON value of [submittedAt].
         *
         * Unlike [submittedAt], this method doesn't throw if the JSON field has an unexpected type.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

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
             * Returns a mutable builder for constructing an instance of [Submission].
             *
             * The following fields are required:
             * ```kotlin
             * .addressCorrectionAction()
             * .submittedAddress()
             * .submittedAt()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var addressCorrectionAction: JsonField<AddressCorrectionAction>? = null
            private var submittedAddress: JsonField<SubmittedAddress>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                addressCorrectionAction = submission.addressCorrectionAction
                submittedAddress = submission.submittedAddress
                submittedAt = submission.submittedAt
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * Per USPS requirements, Increase will standardize the address to USPS standards and
             * check it against the USPS National Change of Address (NCOA) database before mailing
             * it. This indicates what modifications, if any, were made to the address before
             * printing and mailing the check.
             */
            fun addressCorrectionAction(addressCorrectionAction: AddressCorrectionAction) =
                addressCorrectionAction(JsonField.of(addressCorrectionAction))

            /**
             * Sets [Builder.addressCorrectionAction] to an arbitrary JSON value.
             *
             * You should usually call [Builder.addressCorrectionAction] with a well-typed
             * [AddressCorrectionAction] value instead. This method is primarily for setting the
             * field to an undocumented or not yet supported value.
             */
            fun addressCorrectionAction(
                addressCorrectionAction: JsonField<AddressCorrectionAction>
            ) = apply { this.addressCorrectionAction = addressCorrectionAction }

            /**
             * The address we submitted to the printer. This is what is physically printed on the
             * check.
             */
            fun submittedAddress(submittedAddress: SubmittedAddress) =
                submittedAddress(JsonField.of(submittedAddress))

            /**
             * Sets [Builder.submittedAddress] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAddress] with a well-typed
             * [SubmittedAddress] value instead. This method is primarily for setting the field to
             * an undocumented or not yet supported value.
             */
            fun submittedAddress(submittedAddress: JsonField<SubmittedAddress>) = apply {
                this.submittedAddress = submittedAddress
            }

            /** When this check transfer was submitted to our check printer. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /**
             * Sets [Builder.submittedAt] to an arbitrary JSON value.
             *
             * You should usually call [Builder.submittedAt] with a well-typed [OffsetDateTime]
             * value instead. This method is primarily for setting the field to an undocumented or
             * not yet supported value.
             */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
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
             * Returns an immutable instance of [Submission].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .addressCorrectionAction()
             * .submittedAddress()
             * .submittedAt()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): Submission =
                Submission(
                    checkRequired("addressCorrectionAction", addressCorrectionAction),
                    checkRequired("submittedAddress", submittedAddress),
                    checkRequired("submittedAt", submittedAt),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            addressCorrectionAction().validate()
            submittedAddress().validate()
            submittedAt()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int =
            (addressCorrectionAction.asKnown()?.validity() ?: 0) +
                (submittedAddress.asKnown()?.validity() ?: 0) +
                (if (submittedAt.asKnown() == null) 0 else 1)

        /**
         * Per USPS requirements, Increase will standardize the address to USPS standards and check
         * it against the USPS National Change of Address (NCOA) database before mailing it. This
         * indicates what modifications, if any, were made to the address before printing and
         * mailing the check.
         */
        class AddressCorrectionAction
        @JsonCreator
        private constructor(private val value: JsonField<String>) : Enum {

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

                /** No address correction took place. */
                val NONE = of("none")

                /** The address was standardized. */
                val STANDARDIZATION = of("standardization")

                /**
                 * The address was first standardized and then changed because the recipient moved.
                 */
                val STANDARDIZATION_WITH_ADDRESS_CHANGE = of("standardization_with_address_change")

                /**
                 * An error occurred while correcting the address. This typically means the USPS
                 * could not find that address. The address was not changed.
                 */
                val ERROR = of("error")

                fun of(value: String) = AddressCorrectionAction(JsonField.of(value))
            }

            /** An enum containing [AddressCorrectionAction]'s known values. */
            enum class Known {
                /** No address correction took place. */
                NONE,
                /** The address was standardized. */
                STANDARDIZATION,
                /**
                 * The address was first standardized and then changed because the recipient moved.
                 */
                STANDARDIZATION_WITH_ADDRESS_CHANGE,
                /**
                 * An error occurred while correcting the address. This typically means the USPS
                 * could not find that address. The address was not changed.
                 */
                ERROR,
            }

            /**
             * An enum containing [AddressCorrectionAction]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [AddressCorrectionAction] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** No address correction took place. */
                NONE,
                /** The address was standardized. */
                STANDARDIZATION,
                /**
                 * The address was first standardized and then changed because the recipient moved.
                 */
                STANDARDIZATION_WITH_ADDRESS_CHANGE,
                /**
                 * An error occurred while correcting the address. This typically means the USPS
                 * could not find that address. The address was not changed.
                 */
                ERROR,
                /**
                 * An enum member indicating that [AddressCorrectionAction] was instantiated with an
                 * unknown value.
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
                    NONE -> Value.NONE
                    STANDARDIZATION -> Value.STANDARDIZATION
                    STANDARDIZATION_WITH_ADDRESS_CHANGE -> Value.STANDARDIZATION_WITH_ADDRESS_CHANGE
                    ERROR -> Value.ERROR
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
                    NONE -> Known.NONE
                    STANDARDIZATION -> Known.STANDARDIZATION
                    STANDARDIZATION_WITH_ADDRESS_CHANGE -> Known.STANDARDIZATION_WITH_ADDRESS_CHANGE
                    ERROR -> Known.ERROR
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown AddressCorrectionAction: $value"
                        )
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

            private var validated: Boolean = false

            fun validate(): AddressCorrectionAction = apply {
                if (validated) {
                    return@apply
                }

                known()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is AddressCorrectionAction && value == other.value
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /**
         * The address we submitted to the printer. This is what is physically printed on the check.
         */
        class SubmittedAddress
        private constructor(
            private val city: JsonField<String>,
            private val line1: JsonField<String>,
            private val line2: JsonField<String>,
            private val recipientName: JsonField<String>,
            private val state: JsonField<String>,
            private val zip: JsonField<String>,
            private val additionalProperties: MutableMap<String, JsonValue>,
        ) {

            @JsonCreator
            private constructor(
                @JsonProperty("city") @ExcludeMissing city: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line1") @ExcludeMissing line1: JsonField<String> = JsonMissing.of(),
                @JsonProperty("line2") @ExcludeMissing line2: JsonField<String> = JsonMissing.of(),
                @JsonProperty("recipient_name")
                @ExcludeMissing
                recipientName: JsonField<String> = JsonMissing.of(),
                @JsonProperty("state") @ExcludeMissing state: JsonField<String> = JsonMissing.of(),
                @JsonProperty("zip") @ExcludeMissing zip: JsonField<String> = JsonMissing.of(),
            ) : this(city, line1, line2, recipientName, state, zip, mutableMapOf())

            /**
             * The submitted address city.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun city(): String = city.getRequired("city")

            /**
             * The submitted address line 1.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun line1(): String = line1.getRequired("line1")

            /**
             * The submitted address line 2.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g.
             *   if the server responded with an unexpected value).
             */
            fun line2(): String? = line2.getNullable("line2")

            /**
             * The submitted recipient name.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun recipientName(): String = recipientName.getRequired("recipient_name")

            /**
             * The submitted address state.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun state(): String = state.getRequired("state")

            /**
             * The submitted address zip.
             *
             * @throws IncreaseInvalidDataException if the JSON field has an unexpected type or is
             *   unexpectedly missing or null (e.g. if the server responded with an unexpected
             *   value).
             */
            fun zip(): String = zip.getRequired("zip")

            /**
             * Returns the raw JSON value of [city].
             *
             * Unlike [city], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("city") @ExcludeMissing fun _city(): JsonField<String> = city

            /**
             * Returns the raw JSON value of [line1].
             *
             * Unlike [line1], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line1") @ExcludeMissing fun _line1(): JsonField<String> = line1

            /**
             * Returns the raw JSON value of [line2].
             *
             * Unlike [line2], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("line2") @ExcludeMissing fun _line2(): JsonField<String> = line2

            /**
             * Returns the raw JSON value of [recipientName].
             *
             * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
             * type.
             */
            @JsonProperty("recipient_name")
            @ExcludeMissing
            fun _recipientName(): JsonField<String> = recipientName

            /**
             * Returns the raw JSON value of [state].
             *
             * Unlike [state], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("state") @ExcludeMissing fun _state(): JsonField<String> = state

            /**
             * Returns the raw JSON value of [zip].
             *
             * Unlike [zip], this method doesn't throw if the JSON field has an unexpected type.
             */
            @JsonProperty("zip") @ExcludeMissing fun _zip(): JsonField<String> = zip

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
                 * Returns a mutable builder for constructing an instance of [SubmittedAddress].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .recipientName()
                 * .state()
                 * .zip()
                 * ```
                 */
                fun builder() = Builder()
            }

            /** A builder for [SubmittedAddress]. */
            class Builder internal constructor() {

                private var city: JsonField<String>? = null
                private var line1: JsonField<String>? = null
                private var line2: JsonField<String>? = null
                private var recipientName: JsonField<String>? = null
                private var state: JsonField<String>? = null
                private var zip: JsonField<String>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(submittedAddress: SubmittedAddress) = apply {
                    city = submittedAddress.city
                    line1 = submittedAddress.line1
                    line2 = submittedAddress.line2
                    recipientName = submittedAddress.recipientName
                    state = submittedAddress.state
                    zip = submittedAddress.zip
                    additionalProperties = submittedAddress.additionalProperties.toMutableMap()
                }

                /** The submitted address city. */
                fun city(city: String) = city(JsonField.of(city))

                /**
                 * Sets [Builder.city] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.city] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun city(city: JsonField<String>) = apply { this.city = city }

                /** The submitted address line 1. */
                fun line1(line1: String) = line1(JsonField.of(line1))

                /**
                 * Sets [Builder.line1] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line1] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

                /** The submitted address line 2. */
                fun line2(line2: String?) = line2(JsonField.ofNullable(line2))

                /**
                 * Sets [Builder.line2] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.line2] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

                /** The submitted recipient name. */
                fun recipientName(recipientName: String) =
                    recipientName(JsonField.of(recipientName))

                /**
                 * Sets [Builder.recipientName] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.recipientName] with a well-typed [String] value
                 * instead. This method is primarily for setting the field to an undocumented or not
                 * yet supported value.
                 */
                fun recipientName(recipientName: JsonField<String>) = apply {
                    this.recipientName = recipientName
                }

                /** The submitted address state. */
                fun state(state: String) = state(JsonField.of(state))

                /**
                 * Sets [Builder.state] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.state] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun state(state: JsonField<String>) = apply { this.state = state }

                /** The submitted address zip. */
                fun zip(zip: String) = zip(JsonField.of(zip))

                /**
                 * Sets [Builder.zip] to an arbitrary JSON value.
                 *
                 * You should usually call [Builder.zip] with a well-typed [String] value instead.
                 * This method is primarily for setting the field to an undocumented or not yet
                 * supported value.
                 */
                fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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

                /**
                 * Returns an immutable instance of [SubmittedAddress].
                 *
                 * Further updates to this [Builder] will not mutate the returned instance.
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .city()
                 * .line1()
                 * .line2()
                 * .recipientName()
                 * .state()
                 * .zip()
                 * ```
                 *
                 * @throws IllegalStateException if any required field is unset.
                 */
                fun build(): SubmittedAddress =
                    SubmittedAddress(
                        checkRequired("city", city),
                        checkRequired("line1", line1),
                        checkRequired("line2", line2),
                        checkRequired("recipientName", recipientName),
                        checkRequired("state", state),
                        checkRequired("zip", zip),
                        additionalProperties.toMutableMap(),
                    )
            }

            private var validated: Boolean = false

            fun validate(): SubmittedAddress = apply {
                if (validated) {
                    return@apply
                }

                city()
                line1()
                line2()
                recipientName()
                state()
                zip()
                validated = true
            }

            fun isValid(): Boolean =
                try {
                    validate()
                    true
                } catch (e: IncreaseInvalidDataException) {
                    false
                }

            /**
             * Returns a score indicating how many valid values are contained in this object
             * recursively.
             *
             * Used for best match union deserialization.
             */
            internal fun validity(): Int =
                (if (city.asKnown() == null) 0 else 1) +
                    (if (line1.asKnown() == null) 0 else 1) +
                    (if (line2.asKnown() == null) 0 else 1) +
                    (if (recipientName.asKnown() == null) 0 else 1) +
                    (if (state.asKnown() == null) 0 else 1) +
                    (if (zip.asKnown() == null) 0 else 1)

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return other is SubmittedAddress &&
                    city == other.city &&
                    line1 == other.line1 &&
                    line2 == other.line2 &&
                    recipientName == other.recipientName &&
                    state == other.state &&
                    zip == other.zip &&
                    additionalProperties == other.additionalProperties
            }

            private val hashCode: Int by lazy {
                Objects.hash(city, line1, line2, recipientName, state, zip, additionalProperties)
            }

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "SubmittedAddress{city=$city, line1=$line1, line2=$line2, recipientName=$recipientName, state=$state, zip=$zip, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                addressCorrectionAction == other.addressCorrectionAction &&
                submittedAddress == other.submittedAddress &&
                submittedAt == other.submittedAt &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy {
            Objects.hash(
                addressCorrectionAction,
                submittedAddress,
                submittedAt,
                additionalProperties,
            )
        }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{addressCorrectionAction=$addressCorrectionAction, submittedAddress=$submittedAddress, submittedAt=$submittedAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Details relating to the custom fulfillment you will perform. Will be present if and only if
     * `fulfillment_method` is equal to `third_party`.
     */
    class ThirdParty
    private constructor(
        private val recipientName: JsonField<String>,
        private val additionalProperties: MutableMap<String, JsonValue>,
    ) {

        @JsonCreator
        private constructor(
            @JsonProperty("recipient_name")
            @ExcludeMissing
            recipientName: JsonField<String> = JsonMissing.of()
        ) : this(recipientName, mutableMapOf())

        /**
         * The name that you will print on the check.
         *
         * @throws IncreaseInvalidDataException if the JSON field has an unexpected type (e.g. if
         *   the server responded with an unexpected value).
         */
        fun recipientName(): String? = recipientName.getNullable("recipient_name")

        /**
         * Returns the raw JSON value of [recipientName].
         *
         * Unlike [recipientName], this method doesn't throw if the JSON field has an unexpected
         * type.
         */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun _recipientName(): JsonField<String> = recipientName

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
             * Returns a mutable builder for constructing an instance of [ThirdParty].
             *
             * The following fields are required:
             * ```kotlin
             * .recipientName()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [ThirdParty]. */
        class Builder internal constructor() {

            private var recipientName: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(thirdParty: ThirdParty) = apply {
                recipientName = thirdParty.recipientName
                additionalProperties = thirdParty.additionalProperties.toMutableMap()
            }

            /** The name that you will print on the check. */
            fun recipientName(recipientName: String?) =
                recipientName(JsonField.ofNullable(recipientName))

            /**
             * Sets [Builder.recipientName] to an arbitrary JSON value.
             *
             * You should usually call [Builder.recipientName] with a well-typed [String] value
             * instead. This method is primarily for setting the field to an undocumented or not yet
             * supported value.
             */
            fun recipientName(recipientName: JsonField<String>) = apply {
                this.recipientName = recipientName
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
             * Returns an immutable instance of [ThirdParty].
             *
             * Further updates to this [Builder] will not mutate the returned instance.
             *
             * The following fields are required:
             * ```kotlin
             * .recipientName()
             * ```
             *
             * @throws IllegalStateException if any required field is unset.
             */
            fun build(): ThirdParty =
                ThirdParty(
                    checkRequired("recipientName", recipientName),
                    additionalProperties.toMutableMap(),
                )
        }

        private var validated: Boolean = false

        fun validate(): ThirdParty = apply {
            if (validated) {
                return@apply
            }

            recipientName()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = (if (recipientName.asKnown() == null) 0 else 1)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ThirdParty &&
                recipientName == other.recipientName &&
                additionalProperties == other.additionalProperties
        }

        private val hashCode: Int by lazy { Objects.hash(recipientName, additionalProperties) }

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "ThirdParty{recipientName=$recipientName, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
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

            val CHECK_TRANSFER = of("check_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            CHECK_TRANSFER
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
            CHECK_TRANSFER,
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
                CHECK_TRANSFER -> Value.CHECK_TRANSFER
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
                CHECK_TRANSFER -> Known.CHECK_TRANSFER
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

        private var validated: Boolean = false

        fun validate(): Type = apply {
            if (validated) {
                return@apply
            }

            known()
            validated = true
        }

        fun isValid(): Boolean =
            try {
                validate()
                true
            } catch (e: IncreaseInvalidDataException) {
                false
            }

        /**
         * Returns a score indicating how many valid values are contained in this object
         * recursively.
         *
         * Used for best match union deserialization.
         */
        internal fun validity(): Int = if (value() == Value._UNKNOWN) 0 else 1

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Type && value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransfer &&
            id == other.id &&
            accountId == other.accountId &&
            accountNumber == other.accountNumber &&
            amount == other.amount &&
            approval == other.approval &&
            approvedInboundCheckDepositId == other.approvedInboundCheckDepositId &&
            balanceCheck == other.balanceCheck &&
            cancellation == other.cancellation &&
            checkNumber == other.checkNumber &&
            createdAt == other.createdAt &&
            createdBy == other.createdBy &&
            currency == other.currency &&
            fulfillmentMethod == other.fulfillmentMethod &&
            idempotencyKey == other.idempotencyKey &&
            mailing == other.mailing &&
            pendingTransactionId == other.pendingTransactionId &&
            physicalCheck == other.physicalCheck &&
            routingNumber == other.routingNumber &&
            sourceAccountNumberId == other.sourceAccountNumberId &&
            status == other.status &&
            stopPaymentRequest == other.stopPaymentRequest &&
            submission == other.submission &&
            thirdParty == other.thirdParty &&
            type == other.type &&
            additionalProperties == other.additionalProperties
    }

    private val hashCode: Int by lazy {
        Objects.hash(
            id,
            accountId,
            accountNumber,
            amount,
            approval,
            approvedInboundCheckDepositId,
            balanceCheck,
            cancellation,
            checkNumber,
            createdAt,
            createdBy,
            currency,
            fulfillmentMethod,
            idempotencyKey,
            mailing,
            pendingTransactionId,
            physicalCheck,
            routingNumber,
            sourceAccountNumberId,
            status,
            stopPaymentRequest,
            submission,
            thirdParty,
            type,
            additionalProperties,
        )
    }

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "CheckTransfer{id=$id, accountId=$accountId, accountNumber=$accountNumber, amount=$amount, approval=$approval, approvedInboundCheckDepositId=$approvedInboundCheckDepositId, balanceCheck=$balanceCheck, cancellation=$cancellation, checkNumber=$checkNumber, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, fulfillmentMethod=$fulfillmentMethod, idempotencyKey=$idempotencyKey, mailing=$mailing, pendingTransactionId=$pendingTransactionId, physicalCheck=$physicalCheck, routingNumber=$routingNumber, sourceAccountNumberId=$sourceAccountNumberId, status=$status, stopPaymentRequest=$stopPaymentRequest, submission=$submission, thirdParty=$thirdParty, type=$type, additionalProperties=$additionalProperties}"
}
