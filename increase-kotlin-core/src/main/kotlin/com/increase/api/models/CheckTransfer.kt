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

/** Check Transfers move funds from your Increase account by mailing a physical check. */
@JsonDeserialize(builder = CheckTransfer.Builder::class)
@NoAutoDetect
class CheckTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val addressLine1: JsonField<String>,
    private val addressLine2: JsonField<String>,
    private val addressCity: JsonField<String>,
    private val addressState: JsonField<String>,
    private val addressZip: JsonField<String>,
    private val returnAddress: JsonField<ReturnAddress>,
    private val amount: JsonField<Long>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val currency: JsonField<Currency>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val id: JsonField<String>,
    private val mailedAt: JsonField<OffsetDateTime>,
    private val message: JsonField<String>,
    private val note: JsonField<String>,
    private val recipientName: JsonField<String>,
    private val status: JsonField<Status>,
    private val submittedAt: JsonField<OffsetDateTime>,
    private val submission: JsonField<Submission>,
    private val transactionId: JsonField<String>,
    private val stopPaymentRequest: JsonField<StopPaymentRequest>,
    private val deposit: JsonField<Deposit>,
    private val returnDetails: JsonField<ReturnDetails>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

    private var hashCode: Int = 0

    /** The identifier of the Account from which funds will be transferred. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The street address of the check's destination. */
    fun addressLine1(): String = addressLine1.getRequired("address_line1")

    /** The second line of the address of the check's destination. */
    fun addressLine2(): String? = addressLine2.getNullable("address_line2")

    /** The city of the check's destination. */
    fun addressCity(): String = addressCity.getRequired("address_city")

    /** The state of the check's destination. */
    fun addressState(): String = addressState.getRequired("address_state")

    /** The postal code of the check's destination. */
    fun addressZip(): String = addressZip.getRequired("address_zip")

    /** The return address to be printed on the check. */
    fun returnAddress(): ReturnAddress? = returnAddress.getNullable("return_address")

    /** The transfer amount in USD cents. */
    fun amount(): Long = amount.getRequired("amount")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    fun currency(): Currency = currency.getRequired("currency")

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

    /** The Check transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check was
     * mailed.
     */
    fun mailedAt(): OffsetDateTime? = mailedAt.getNullable("mailed_at")

    /** The descriptor that will be printed on the memo field on the check. */
    fun message(): String = message.getRequired("message")

    /** The descriptor that will be printed on the letter included with the check. */
    fun note(): String? = note.getNullable("note")

    /** The name that will be printed on the check. */
    fun recipientName(): String = recipientName.getRequired("recipient_name")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check was
     * submitted.
     */
    fun submittedAt(): OffsetDateTime? = submittedAt.getNullable("submitted_at")

    /** After the transfer is submitted, this will contain supplemental details. */
    fun submission(): Submission? = submission.getNullable("submission")

    /** The ID for the transaction caused by the transfer. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    fun stopPaymentRequest(): StopPaymentRequest? =
        stopPaymentRequest.getNullable("stop_payment_request")

    /** After a check transfer is deposited, this will contain supplemental details. */
    fun deposit(): Deposit? = deposit.getNullable("deposit")

    /**
     * After a check transfer is returned, this will contain supplemental details. A check transfer
     * is returned when the receiver mails a never deposited check back to the bank printed on the
     * check.
     */
    fun returnDetails(): ReturnDetails? = returnDetails.getNullable("return_details")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The identifier of the Account from which funds will be transferred. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

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

    /** The return address to be printed on the check. */
    @JsonProperty("return_address") @ExcludeMissing fun _returnAddress() = returnAddress

    /** The transfer amount in USD cents. */
    @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

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

    /** The Check transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check was
     * mailed.
     */
    @JsonProperty("mailed_at") @ExcludeMissing fun _mailedAt() = mailedAt

    /** The descriptor that will be printed on the memo field on the check. */
    @JsonProperty("message") @ExcludeMissing fun _message() = message

    /** The descriptor that will be printed on the letter included with the check. */
    @JsonProperty("note") @ExcludeMissing fun _note() = note

    /** The name that will be printed on the check. */
    @JsonProperty("recipient_name") @ExcludeMissing fun _recipientName() = recipientName

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check was
     * submitted.
     */
    @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /** The ID for the transaction caused by the transfer. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonProperty("stop_payment_request")
    @ExcludeMissing
    fun _stopPaymentRequest() = stopPaymentRequest

    /** After a check transfer is deposited, this will contain supplemental details. */
    @JsonProperty("deposit") @ExcludeMissing fun _deposit() = deposit

    /**
     * After a check transfer is returned, this will contain supplemental details. A check transfer
     * is returned when the receiver mails a never deposited check back to the bank printed on the
     * check.
     */
    @JsonProperty("return_details") @ExcludeMissing fun _returnDetails() = returnDetails

    /**
     * A constant representing the object's type. For this resource it will always be
     * `check_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): CheckTransfer = apply {
        if (!validated) {
            accountId()
            addressLine1()
            addressLine2()
            addressCity()
            addressState()
            addressZip()
            returnAddress()?.validate()
            amount()
            createdAt()
            currency()
            approval()?.validate()
            cancellation()?.validate()
            id()
            mailedAt()
            message()
            note()
            recipientName()
            status()
            submittedAt()
            submission()?.validate()
            transactionId()
            stopPaymentRequest()?.validate()
            deposit()?.validate()
            returnDetails()?.validate()
            type()
            validated = true
        }
    }

    fun toBuilder() = Builder().from(this)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransfer &&
            this.accountId == other.accountId &&
            this.addressLine1 == other.addressLine1 &&
            this.addressLine2 == other.addressLine2 &&
            this.addressCity == other.addressCity &&
            this.addressState == other.addressState &&
            this.addressZip == other.addressZip &&
            this.returnAddress == other.returnAddress &&
            this.amount == other.amount &&
            this.createdAt == other.createdAt &&
            this.currency == other.currency &&
            this.approval == other.approval &&
            this.cancellation == other.cancellation &&
            this.id == other.id &&
            this.mailedAt == other.mailedAt &&
            this.message == other.message &&
            this.note == other.note &&
            this.recipientName == other.recipientName &&
            this.status == other.status &&
            this.submittedAt == other.submittedAt &&
            this.submission == other.submission &&
            this.transactionId == other.transactionId &&
            this.stopPaymentRequest == other.stopPaymentRequest &&
            this.deposit == other.deposit &&
            this.returnDetails == other.returnDetails &&
            this.type == other.type &&
            this.additionalProperties == other.additionalProperties
    }

    override fun hashCode(): Int {
        if (hashCode == 0) {
            hashCode =
                Objects.hash(
                    accountId,
                    addressLine1,
                    addressLine2,
                    addressCity,
                    addressState,
                    addressZip,
                    returnAddress,
                    amount,
                    createdAt,
                    currency,
                    approval,
                    cancellation,
                    id,
                    mailedAt,
                    message,
                    note,
                    recipientName,
                    status,
                    submittedAt,
                    submission,
                    transactionId,
                    stopPaymentRequest,
                    deposit,
                    returnDetails,
                    type,
                    additionalProperties,
                )
        }
        return hashCode
    }

    override fun toString() =
        "CheckTransfer{accountId=$accountId, addressLine1=$addressLine1, addressLine2=$addressLine2, addressCity=$addressCity, addressState=$addressState, addressZip=$addressZip, returnAddress=$returnAddress, amount=$amount, createdAt=$createdAt, currency=$currency, approval=$approval, cancellation=$cancellation, id=$id, mailedAt=$mailedAt, message=$message, note=$note, recipientName=$recipientName, status=$status, submittedAt=$submittedAt, submission=$submission, transactionId=$transactionId, stopPaymentRequest=$stopPaymentRequest, deposit=$deposit, returnDetails=$returnDetails, type=$type, additionalProperties=$additionalProperties}"

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var addressLine1: JsonField<String> = JsonMissing.of()
        private var addressLine2: JsonField<String> = JsonMissing.of()
        private var addressCity: JsonField<String> = JsonMissing.of()
        private var addressState: JsonField<String> = JsonMissing.of()
        private var addressZip: JsonField<String> = JsonMissing.of()
        private var returnAddress: JsonField<ReturnAddress> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var mailedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var message: JsonField<String> = JsonMissing.of()
        private var note: JsonField<String> = JsonMissing.of()
        private var recipientName: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var stopPaymentRequest: JsonField<StopPaymentRequest> = JsonMissing.of()
        private var deposit: JsonField<Deposit> = JsonMissing.of()
        private var returnDetails: JsonField<ReturnDetails> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(checkTransfer: CheckTransfer) = apply {
            this.accountId = checkTransfer.accountId
            this.addressLine1 = checkTransfer.addressLine1
            this.addressLine2 = checkTransfer.addressLine2
            this.addressCity = checkTransfer.addressCity
            this.addressState = checkTransfer.addressState
            this.addressZip = checkTransfer.addressZip
            this.returnAddress = checkTransfer.returnAddress
            this.amount = checkTransfer.amount
            this.createdAt = checkTransfer.createdAt
            this.currency = checkTransfer.currency
            this.approval = checkTransfer.approval
            this.cancellation = checkTransfer.cancellation
            this.id = checkTransfer.id
            this.mailedAt = checkTransfer.mailedAt
            this.message = checkTransfer.message
            this.note = checkTransfer.note
            this.recipientName = checkTransfer.recipientName
            this.status = checkTransfer.status
            this.submittedAt = checkTransfer.submittedAt
            this.submission = checkTransfer.submission
            this.transactionId = checkTransfer.transactionId
            this.stopPaymentRequest = checkTransfer.stopPaymentRequest
            this.deposit = checkTransfer.deposit
            this.returnDetails = checkTransfer.returnDetails
            this.type = checkTransfer.type
            additionalProperties(checkTransfer.additionalProperties)
        }

        /** The identifier of the Account from which funds will be transferred. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The identifier of the Account from which funds will be transferred. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

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
        fun addressCity(addressCity: JsonField<String>) = apply { this.addressCity = addressCity }

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
        fun addressZip(addressZip: JsonField<String>) = apply { this.addressZip = addressZip }

        /** The return address to be printed on the check. */
        fun returnAddress(returnAddress: ReturnAddress) = returnAddress(JsonField.of(returnAddress))

        /** The return address to be printed on the check. */
        @JsonProperty("return_address")
        @ExcludeMissing
        fun returnAddress(returnAddress: JsonField<ReturnAddress>) = apply {
            this.returnAddress = returnAddress
        }

        /** The transfer amount in USD cents. */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /** The transfer amount in USD cents. */
        @JsonProperty("amount")
        @ExcludeMissing
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the check's currency. */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

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

        /** The Check transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The Check transfer's identifier. */
        @JsonProperty("id") @ExcludeMissing fun id(id: JsonField<String>) = apply { this.id = id }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        fun mailedAt(mailedAt: OffsetDateTime) = mailedAt(JsonField.of(mailedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was mailed.
         */
        @JsonProperty("mailed_at")
        @ExcludeMissing
        fun mailedAt(mailedAt: JsonField<OffsetDateTime>) = apply { this.mailedAt = mailedAt }

        /** The descriptor that will be printed on the memo field on the check. */
        fun message(message: String) = message(JsonField.of(message))

        /** The descriptor that will be printed on the memo field on the check. */
        @JsonProperty("message")
        @ExcludeMissing
        fun message(message: JsonField<String>) = apply { this.message = message }

        /** The descriptor that will be printed on the letter included with the check. */
        fun note(note: String) = note(JsonField.of(note))

        /** The descriptor that will be printed on the letter included with the check. */
        @JsonProperty("note")
        @ExcludeMissing
        fun note(note: JsonField<String>) = apply { this.note = note }

        /** The name that will be printed on the check. */
        fun recipientName(recipientName: String) = recipientName(JsonField.of(recipientName))

        /** The name that will be printed on the check. */
        @JsonProperty("recipient_name")
        @ExcludeMissing
        fun recipientName(recipientName: JsonField<String>) = apply {
            this.recipientName = recipientName
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was submitted.
         */
        fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was submitted.
         */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
            this.submittedAt = submittedAt
        }

        /** After the transfer is submitted, this will contain supplemental details. */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /** After the transfer is submitted, this will contain supplemental details. */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction caused by the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction caused by the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        fun stopPaymentRequest(stopPaymentRequest: StopPaymentRequest) =
            stopPaymentRequest(JsonField.of(stopPaymentRequest))

        /**
         * After a stop-payment is requested on the check, this will contain supplemental details.
         */
        @JsonProperty("stop_payment_request")
        @ExcludeMissing
        fun stopPaymentRequest(stopPaymentRequest: JsonField<StopPaymentRequest>) = apply {
            this.stopPaymentRequest = stopPaymentRequest
        }

        /** After a check transfer is deposited, this will contain supplemental details. */
        fun deposit(deposit: Deposit) = deposit(JsonField.of(deposit))

        /** After a check transfer is deposited, this will contain supplemental details. */
        @JsonProperty("deposit")
        @ExcludeMissing
        fun deposit(deposit: JsonField<Deposit>) = apply { this.deposit = deposit }

        /**
         * After a check transfer is returned, this will contain supplemental details. A check
         * transfer is returned when the receiver mails a never deposited check back to the bank
         * printed on the check.
         */
        fun returnDetails(returnDetails: ReturnDetails) = returnDetails(JsonField.of(returnDetails))

        /**
         * After a check transfer is returned, this will contain supplemental details. A check
         * transfer is returned when the receiver mails a never deposited check back to the bank
         * printed on the check.
         */
        @JsonProperty("return_details")
        @ExcludeMissing
        fun returnDetails(returnDetails: JsonField<ReturnDetails>) = apply {
            this.returnDetails = returnDetails
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer`.
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

        fun build(): CheckTransfer =
            CheckTransfer(
                accountId,
                addressLine1,
                addressLine2,
                addressCity,
                addressState,
                addressZip,
                returnAddress,
                amount,
                createdAt,
                currency,
                approval,
                cancellation,
                id,
                mailedAt,
                message,
                note,
                recipientName,
                status,
                submittedAt,
                submission,
                transactionId,
                stopPaymentRequest,
                deposit,
                returnDetails,
                type,
                additionalProperties.toUnmodifiable(),
            )
    }

    /** The return address to be printed on the check. */
    @JsonDeserialize(builder = ReturnAddress.Builder::class)
    @NoAutoDetect
    class ReturnAddress
    private constructor(
        private val name: JsonField<String>,
        private val line1: JsonField<String>,
        private val line2: JsonField<String>,
        private val city: JsonField<String>,
        private val state: JsonField<String>,
        private val zip: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The name of the address. */
        fun name(): String? = name.getNullable("name")

        /** The first line of the address. */
        fun line1(): String? = line1.getNullable("line1")

        /** The second line of the address. */
        fun line2(): String? = line2.getNullable("line2")

        /** The city of the address. */
        fun city(): String? = city.getNullable("city")

        /** The US state of the address. */
        fun state(): String? = state.getNullable("state")

        /** The postal code of the address. */
        fun zip(): String? = zip.getNullable("zip")

        /** The name of the address. */
        @JsonProperty("name") @ExcludeMissing fun _name() = name

        /** The first line of the address. */
        @JsonProperty("line1") @ExcludeMissing fun _line1() = line1

        /** The second line of the address. */
        @JsonProperty("line2") @ExcludeMissing fun _line2() = line2

        /** The city of the address. */
        @JsonProperty("city") @ExcludeMissing fun _city() = city

        /** The US state of the address. */
        @JsonProperty("state") @ExcludeMissing fun _state() = state

        /** The postal code of the address. */
        @JsonProperty("zip") @ExcludeMissing fun _zip() = zip

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ReturnAddress = apply {
            if (!validated) {
                name()
                line1()
                line2()
                city()
                state()
                zip()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnAddress &&
                this.name == other.name &&
                this.line1 == other.line1 &&
                this.line2 == other.line2 &&
                this.city == other.city &&
                this.state == other.state &&
                this.zip == other.zip &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        name,
                        line1,
                        line2,
                        city,
                        state,
                        zip,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReturnAddress{name=$name, line1=$line1, line2=$line2, city=$city, state=$state, zip=$zip, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var name: JsonField<String> = JsonMissing.of()
            private var line1: JsonField<String> = JsonMissing.of()
            private var line2: JsonField<String> = JsonMissing.of()
            private var city: JsonField<String> = JsonMissing.of()
            private var state: JsonField<String> = JsonMissing.of()
            private var zip: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(returnAddress: ReturnAddress) = apply {
                this.name = returnAddress.name
                this.line1 = returnAddress.line1
                this.line2 = returnAddress.line2
                this.city = returnAddress.city
                this.state = returnAddress.state
                this.zip = returnAddress.zip
                additionalProperties(returnAddress.additionalProperties)
            }

            /** The name of the address. */
            fun name(name: String) = name(JsonField.of(name))

            /** The name of the address. */
            @JsonProperty("name")
            @ExcludeMissing
            fun name(name: JsonField<String>) = apply { this.name = name }

            /** The first line of the address. */
            fun line1(line1: String) = line1(JsonField.of(line1))

            /** The first line of the address. */
            @JsonProperty("line1")
            @ExcludeMissing
            fun line1(line1: JsonField<String>) = apply { this.line1 = line1 }

            /** The second line of the address. */
            fun line2(line2: String) = line2(JsonField.of(line2))

            /** The second line of the address. */
            @JsonProperty("line2")
            @ExcludeMissing
            fun line2(line2: JsonField<String>) = apply { this.line2 = line2 }

            /** The city of the address. */
            fun city(city: String) = city(JsonField.of(city))

            /** The city of the address. */
            @JsonProperty("city")
            @ExcludeMissing
            fun city(city: JsonField<String>) = apply { this.city = city }

            /** The US state of the address. */
            fun state(state: String) = state(JsonField.of(state))

            /** The US state of the address. */
            @JsonProperty("state")
            @ExcludeMissing
            fun state(state: JsonField<String>) = apply { this.state = state }

            /** The postal code of the address. */
            fun zip(zip: String) = zip(JsonField.of(zip))

            /** The postal code of the address. */
            @JsonProperty("zip")
            @ExcludeMissing
            fun zip(zip: JsonField<String>) = apply { this.zip = zip }

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

            fun build(): ReturnAddress =
                ReturnAddress(
                    name,
                    line1,
                    line2,
                    city,
                    state,
                    zip,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Approval = apply {
            if (!validated) {
                approvedAt()
                approvedBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Approval &&
                this.approvedAt == other.approvedAt &&
                this.approvedBy == other.approvedBy &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        approvedAt,
                        approvedBy,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Approval{approvedAt=$approvedAt, approvedBy=$approvedBy, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var approvedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var approvedBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(approval: Approval) = apply {
                this.approvedAt = approval.approvedAt
                this.approvedBy = approval.approvedBy
                additionalProperties(approval.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Approval =
                Approval(
                    approvedAt,
                    approvedBy,
                    additionalProperties.toUnmodifiable(),
                )
        }
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

        private var validated: Boolean = false

        private var hashCode: Int = 0

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

        fun validate(): Cancellation = apply {
            if (!validated) {
                canceledAt()
                canceledBy()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Cancellation &&
                this.canceledAt == other.canceledAt &&
                this.canceledBy == other.canceledBy &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        canceledAt,
                        canceledBy,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Cancellation{canceledAt=$canceledAt, canceledBy=$canceledBy, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var canceledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var canceledBy: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(cancellation: Cancellation) = apply {
                this.canceledAt = cancellation.canceledAt
                this.canceledBy = cancellation.canceledBy
                additionalProperties(cancellation.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Cancellation =
                Cancellation(
                    canceledAt,
                    canceledBy,
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

            val PENDING_APPROVAL = Status(JsonField.of("pending_approval"))

            val PENDING_SUBMISSION = Status(JsonField.of("pending_submission"))

            val SUBMITTED = Status(JsonField.of("submitted"))

            val PENDING_MAILING = Status(JsonField.of("pending_mailing"))

            val MAILED = Status(JsonField.of("mailed"))

            val CANCELED = Status(JsonField.of("canceled"))

            val DEPOSITED = Status(JsonField.of("deposited"))

            val STOPPED = Status(JsonField.of("stopped"))

            val RETURNED = Status(JsonField.of("returned"))

            val REJECTED = Status(JsonField.of("rejected"))

            val REQUIRES_ATTENTION = Status(JsonField.of("requires_attention"))

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            PENDING_SUBMISSION,
            SUBMITTED,
            PENDING_MAILING,
            MAILED,
            CANCELED,
            DEPOSITED,
            STOPPED,
            RETURNED,
            REJECTED,
            REQUIRES_ATTENTION,
        }

        enum class Value {
            PENDING_APPROVAL,
            PENDING_SUBMISSION,
            SUBMITTED,
            PENDING_MAILING,
            MAILED,
            CANCELED,
            DEPOSITED,
            STOPPED,
            RETURNED,
            REJECTED,
            REQUIRES_ATTENTION,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                PENDING_APPROVAL -> Value.PENDING_APPROVAL
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                SUBMITTED -> Value.SUBMITTED
                PENDING_MAILING -> Value.PENDING_MAILING
                MAILED -> Value.MAILED
                CANCELED -> Value.CANCELED
                DEPOSITED -> Value.DEPOSITED
                STOPPED -> Value.STOPPED
                RETURNED -> Value.RETURNED
                REJECTED -> Value.REJECTED
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                PENDING_APPROVAL -> Known.PENDING_APPROVAL
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                SUBMITTED -> Known.SUBMITTED
                PENDING_MAILING -> Known.PENDING_MAILING
                MAILED -> Known.MAILED
                CANCELED -> Known.CANCELED
                DEPOSITED -> Known.DEPOSITED
                STOPPED -> Known.STOPPED
                RETURNED -> Known.RETURNED
                REJECTED -> Known.REJECTED
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                else -> throw IncreaseInvalidDataException("Unknown Status: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    /** After the transfer is submitted, this will contain supplemental details. */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val submittedAt: JsonField<OffsetDateTime>,
        private val checkNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** When this check transfer was submitted to our check printer. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /** The identitying number of the check. */
        fun checkNumber(): String = checkNumber.getRequired("check_number")

        /** When this check transfer was submitted to our check printer. */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        /** The identitying number of the check. */
        @JsonProperty("check_number") @ExcludeMissing fun _checkNumber() = checkNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Submission = apply {
            if (!validated) {
                submittedAt()
                checkNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is Submission &&
                this.submittedAt == other.submittedAt &&
                this.checkNumber == other.checkNumber &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        submittedAt,
                        checkNumber,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Submission{submittedAt=$submittedAt, checkNumber=$checkNumber, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var checkNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                this.submittedAt = submission.submittedAt
                this.checkNumber = submission.checkNumber
                additionalProperties(submission.additionalProperties)
            }

            /** When this check transfer was submitted to our check printer. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When this check transfer was submitted to our check printer. */
            @JsonProperty("submitted_at")
            @ExcludeMissing
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /** The identitying number of the check. */
            fun checkNumber(checkNumber: String) = checkNumber(JsonField.of(checkNumber))

            /** The identitying number of the check. */
            @JsonProperty("check_number")
            @ExcludeMissing
            fun checkNumber(checkNumber: JsonField<String>) = apply {
                this.checkNumber = checkNumber
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

            fun build(): Submission =
                Submission(
                    submittedAt,
                    checkNumber,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    /** After a stop-payment is requested on the check, this will contain supplemental details. */
    @JsonDeserialize(builder = StopPaymentRequest.Builder::class)
    @NoAutoDetect
    class StopPaymentRequest
    private constructor(
        private val transferId: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val requestedAt: JsonField<OffsetDateTime>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The ID of the check transfer that was stopped. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /** The transaction ID of the corresponding credit transaction. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The time the stop-payment was requested. */
        fun requestedAt(): OffsetDateTime = requestedAt.getRequired("requested_at")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_stop_payment_request`.
         */
        fun type(): Type = type.getRequired("type")

        /** The ID of the check transfer that was stopped. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        /** The transaction ID of the corresponding credit transaction. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

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

        fun validate(): StopPaymentRequest = apply {
            if (!validated) {
                transferId()
                transactionId()
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

            return other is StopPaymentRequest &&
                this.transferId == other.transferId &&
                this.transactionId == other.transactionId &&
                this.requestedAt == other.requestedAt &&
                this.type == other.type &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        transferId,
                        transactionId,
                        requestedAt,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "StopPaymentRequest{transferId=$transferId, transactionId=$transactionId, requestedAt=$requestedAt, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var transferId: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var requestedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(stopPaymentRequest: StopPaymentRequest) = apply {
                this.transferId = stopPaymentRequest.transferId
                this.transactionId = stopPaymentRequest.transactionId
                this.requestedAt = stopPaymentRequest.requestedAt
                this.type = stopPaymentRequest.type
                additionalProperties(stopPaymentRequest.additionalProperties)
            }

            /** The ID of the check transfer that was stopped. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The ID of the check transfer that was stopped. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

            /** The transaction ID of the corresponding credit transaction. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The transaction ID of the corresponding credit transaction. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The time the stop-payment was requested. */
            fun requestedAt(requestedAt: OffsetDateTime) = requestedAt(JsonField.of(requestedAt))

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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): StopPaymentRequest =
                StopPaymentRequest(
                    transferId,
                    transactionId,
                    requestedAt,
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
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Value.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    CHECK_TRANSFER_STOP_PAYMENT_REQUEST -> Known.CHECK_TRANSFER_STOP_PAYMENT_REQUEST
                    else -> throw IncreaseInvalidDataException("Unknown Type: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
        }
    }

    /** After a check transfer is deposited, this will contain supplemental details. */
    @JsonDeserialize(builder = Deposit.Builder::class)
    @NoAutoDetect
    class Deposit
    private constructor(
        private val depositedAt: JsonField<OffsetDateTime>,
        private val frontImageFileId: JsonField<String>,
        private val backImageFileId: JsonField<String>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** When the check was deposited. */
        fun depositedAt(): OffsetDateTime = depositedAt.getRequired("deposited_at")

        /** The ID for the File containing the image of the front of the check. */
        fun frontImageFileId(): String? = frontImageFileId.getNullable("front_image_file_id")

        /** The ID for the File containing the image of the rear of the check. */
        fun backImageFileId(): String? = backImageFileId.getNullable("back_image_file_id")

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_deposit`.
         */
        fun type(): Type = type.getRequired("type")

        /** When the check was deposited. */
        @JsonProperty("deposited_at") @ExcludeMissing fun _depositedAt() = depositedAt

        /** The ID for the File containing the image of the front of the check. */
        @JsonProperty("front_image_file_id")
        @ExcludeMissing
        fun _frontImageFileId() = frontImageFileId

        /** The ID for the File containing the image of the rear of the check. */
        @JsonProperty("back_image_file_id") @ExcludeMissing fun _backImageFileId() = backImageFileId

        /**
         * A constant representing the object's type. For this resource it will always be
         * `check_transfer_deposit`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Deposit = apply {
            if (!validated) {
                depositedAt()
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

            return other is Deposit &&
                this.depositedAt == other.depositedAt &&
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
                        frontImageFileId,
                        backImageFileId,
                        type,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "Deposit{depositedAt=$depositedAt, frontImageFileId=$frontImageFileId, backImageFileId=$backImageFileId, type=$type, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var depositedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var frontImageFileId: JsonField<String> = JsonMissing.of()
            private var backImageFileId: JsonField<String> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(deposit: Deposit) = apply {
                this.depositedAt = deposit.depositedAt
                this.frontImageFileId = deposit.frontImageFileId
                this.backImageFileId = deposit.backImageFileId
                this.type = deposit.type
                additionalProperties(deposit.additionalProperties)
            }

            /** When the check was deposited. */
            fun depositedAt(depositedAt: OffsetDateTime) = depositedAt(JsonField.of(depositedAt))

            /** When the check was deposited. */
            @JsonProperty("deposited_at")
            @ExcludeMissing
            fun depositedAt(depositedAt: JsonField<OffsetDateTime>) = apply {
                this.depositedAt = depositedAt
            }

            /** The ID for the File containing the image of the front of the check. */
            fun frontImageFileId(frontImageFileId: String) =
                frontImageFileId(JsonField.of(frontImageFileId))

            /** The ID for the File containing the image of the front of the check. */
            @JsonProperty("front_image_file_id")
            @ExcludeMissing
            fun frontImageFileId(frontImageFileId: JsonField<String>) = apply {
                this.frontImageFileId = frontImageFileId
            }

            /** The ID for the File containing the image of the rear of the check. */
            fun backImageFileId(backImageFileId: String) =
                backImageFileId(JsonField.of(backImageFileId))

            /** The ID for the File containing the image of the rear of the check. */
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Deposit =
                Deposit(
                    depositedAt,
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
     * After a check transfer is returned, this will contain supplemental details. A check transfer
     * is returned when the receiver mails a never deposited check back to the bank printed on the
     * check.
     */
    @JsonDeserialize(builder = ReturnDetails.Builder::class)
    @NoAutoDetect
    class ReturnDetails
    private constructor(
        private val transferId: JsonField<String>,
        private val returnedAt: JsonField<OffsetDateTime>,
        private val fileId: JsonField<String>,
        private val reason: JsonField<Reason>,
        private val transactionId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        private var hashCode: Int = 0

        /** The identifier of the returned Check Transfer. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was returned.
         */
        fun returnedAt(): OffsetDateTime = returnedAt.getRequired("returned_at")

        /** If available, a document with additional information about the return. */
        fun fileId(): String? = fileId.getNullable("file_id")

        /** The reason why the check was returned. */
        fun reason(): Reason = reason.getRequired("reason")

        /**
         * The identifier of the Transaction that was created to credit you for the returned check.
         */
        fun transactionId(): String? = transactionId.getNullable("transaction_id")

        /** The identifier of the returned Check Transfer. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the check
         * was returned.
         */
        @JsonProperty("returned_at") @ExcludeMissing fun _returnedAt() = returnedAt

        /** If available, a document with additional information about the return. */
        @JsonProperty("file_id") @ExcludeMissing fun _fileId() = fileId

        /** The reason why the check was returned. */
        @JsonProperty("reason") @ExcludeMissing fun _reason() = reason

        /**
         * The identifier of the Transaction that was created to credit you for the returned check.
         */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): ReturnDetails = apply {
            if (!validated) {
                transferId()
                returnedAt()
                fileId()
                reason()
                transactionId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is ReturnDetails &&
                this.transferId == other.transferId &&
                this.returnedAt == other.returnedAt &&
                this.fileId == other.fileId &&
                this.reason == other.reason &&
                this.transactionId == other.transactionId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        transferId,
                        returnedAt,
                        fileId,
                        reason,
                        transactionId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "ReturnDetails{transferId=$transferId, returnedAt=$returnedAt, fileId=$fileId, reason=$reason, transactionId=$transactionId, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var transferId: JsonField<String> = JsonMissing.of()
            private var returnedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var fileId: JsonField<String> = JsonMissing.of()
            private var reason: JsonField<Reason> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(returnDetails: ReturnDetails) = apply {
                this.transferId = returnDetails.transferId
                this.returnedAt = returnDetails.returnedAt
                this.fileId = returnDetails.fileId
                this.reason = returnDetails.reason
                this.transactionId = returnDetails.transactionId
                additionalProperties(returnDetails.additionalProperties)
            }

            /** The identifier of the returned Check Transfer. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The identifier of the returned Check Transfer. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check was returned.
             */
            fun returnedAt(returnedAt: OffsetDateTime) = returnedAt(JsonField.of(returnedAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * check was returned.
             */
            @JsonProperty("returned_at")
            @ExcludeMissing
            fun returnedAt(returnedAt: JsonField<OffsetDateTime>) = apply {
                this.returnedAt = returnedAt
            }

            /** If available, a document with additional information about the return. */
            fun fileId(fileId: String) = fileId(JsonField.of(fileId))

            /** If available, a document with additional information about the return. */
            @JsonProperty("file_id")
            @ExcludeMissing
            fun fileId(fileId: JsonField<String>) = apply { this.fileId = fileId }

            /** The reason why the check was returned. */
            fun reason(reason: Reason) = reason(JsonField.of(reason))

            /** The reason why the check was returned. */
            @JsonProperty("reason")
            @ExcludeMissing
            fun reason(reason: JsonField<Reason>) = apply { this.reason = reason }

            /**
             * The identifier of the Transaction that was created to credit you for the returned
             * check.
             */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /**
             * The identifier of the Transaction that was created to credit you for the returned
             * check.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): ReturnDetails =
                ReturnDetails(
                    transferId,
                    returnedAt,
                    fileId,
                    reason,
                    transactionId,
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

                val MAIL_DELIVERY_FAILURE = Reason(JsonField.of("mail_delivery_failure"))

                val REFUSED_BY_RECIPIENT = Reason(JsonField.of("refused_by_recipient"))

                val RETURNED_NOT_AUTHORIZED = Reason(JsonField.of("returned_not_authorized"))

                fun of(value: String) = Reason(JsonField.of(value))
            }

            enum class Known {
                MAIL_DELIVERY_FAILURE,
                REFUSED_BY_RECIPIENT,
                RETURNED_NOT_AUTHORIZED,
            }

            enum class Value {
                MAIL_DELIVERY_FAILURE,
                REFUSED_BY_RECIPIENT,
                RETURNED_NOT_AUTHORIZED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    MAIL_DELIVERY_FAILURE -> Value.MAIL_DELIVERY_FAILURE
                    REFUSED_BY_RECIPIENT -> Value.REFUSED_BY_RECIPIENT
                    RETURNED_NOT_AUTHORIZED -> Value.RETURNED_NOT_AUTHORIZED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    MAIL_DELIVERY_FAILURE -> Known.MAIL_DELIVERY_FAILURE
                    REFUSED_BY_RECIPIENT -> Known.REFUSED_BY_RECIPIENT
                    RETURNED_NOT_AUTHORIZED -> Known.RETURNED_NOT_AUTHORIZED
                    else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
                }

            fun asString(): String = _value().asStringOrThrow()
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

            val CHECK_TRANSFER = Type(JsonField.of("check_transfer"))

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            CHECK_TRANSFER,
        }

        enum class Value {
            CHECK_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECK_TRANSFER -> Value.CHECK_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECK_TRANSFER -> Known.CHECK_TRANSFER
                else -> throw IncreaseInvalidDataException("Unknown Type: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
