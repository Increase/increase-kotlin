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
import com.increase.api.core.checkRequired
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.time.OffsetDateTime
import java.util.Objects

/**
 * ACH transfers move funds between your Increase account and any other account accessible by the
 * Automated Clearing House (ACH).
 */
@NoAutoDetect
class AchTransfer
@JsonCreator
private constructor(
    @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_id")
    @ExcludeMissing
    private val accountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("account_number")
    @ExcludeMissing
    private val accountNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("acknowledgement")
    @ExcludeMissing
    private val acknowledgement: JsonField<Acknowledgement> = JsonMissing.of(),
    @JsonProperty("addenda")
    @ExcludeMissing
    private val addenda: JsonField<Addenda> = JsonMissing.of(),
    @JsonProperty("amount") @ExcludeMissing private val amount: JsonField<Long> = JsonMissing.of(),
    @JsonProperty("approval")
    @ExcludeMissing
    private val approval: JsonField<Approval> = JsonMissing.of(),
    @JsonProperty("cancellation")
    @ExcludeMissing
    private val cancellation: JsonField<Cancellation> = JsonMissing.of(),
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    private val companyDescriptiveDate: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    private val companyDiscretionaryData: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    private val companyEntryDescription: JsonField<String> = JsonMissing.of(),
    @JsonProperty("company_name")
    @ExcludeMissing
    private val companyName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("created_at")
    @ExcludeMissing
    private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
    @JsonProperty("created_by")
    @ExcludeMissing
    private val createdBy: JsonField<CreatedBy> = JsonMissing.of(),
    @JsonProperty("currency")
    @ExcludeMissing
    private val currency: JsonField<Currency> = JsonMissing.of(),
    @JsonProperty("destination_account_holder")
    @ExcludeMissing
    private val destinationAccountHolder: JsonField<DestinationAccountHolder> = JsonMissing.of(),
    @JsonProperty("external_account_id")
    @ExcludeMissing
    private val externalAccountId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("funding")
    @ExcludeMissing
    private val funding: JsonField<Funding> = JsonMissing.of(),
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    private val idempotencyKey: JsonField<String> = JsonMissing.of(),
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    private val inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of(),
    @JsonProperty("individual_id")
    @ExcludeMissing
    private val individualId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("individual_name")
    @ExcludeMissing
    private val individualName: JsonField<String> = JsonMissing.of(),
    @JsonProperty("network")
    @ExcludeMissing
    private val network: JsonField<Network> = JsonMissing.of(),
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    private val notificationsOfChange: JsonField<List<NotificationsOfChange>> = JsonMissing.of(),
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    private val pendingTransactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("preferred_effective_date")
    @ExcludeMissing
    private val preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of(),
    @JsonProperty("return")
    @ExcludeMissing
    private val return_: JsonField<Return> = JsonMissing.of(),
    @JsonProperty("routing_number")
    @ExcludeMissing
    private val routingNumber: JsonField<String> = JsonMissing.of(),
    @JsonProperty("settlement")
    @ExcludeMissing
    private val settlement: JsonField<Settlement> = JsonMissing.of(),
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    private val standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    private val statementDescriptor: JsonField<String> = JsonMissing.of(),
    @JsonProperty("status")
    @ExcludeMissing
    private val status: JsonField<Status> = JsonMissing.of(),
    @JsonProperty("submission")
    @ExcludeMissing
    private val submission: JsonField<Submission> = JsonMissing.of(),
    @JsonProperty("transaction_id")
    @ExcludeMissing
    private val transactionId: JsonField<String> = JsonMissing.of(),
    @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
    @JsonAnySetter private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
) {

    /** The ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

    /** The Account to which the transfer belongs. */
    fun accountId(): String = accountId.getRequired("account_id")

    /** The destination account number. */
    fun accountNumber(): String = accountNumber.getRequired("account_number")

    /**
     * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
     * Federal Reserve sends an acknowledgement message for each file that Increase submits.
     */
    fun acknowledgement(): Acknowledgement? = acknowledgement.getNullable("acknowledgement")

    /** Additional information that will be sent to the recipient. */
    fun addenda(): Addenda? = addenda.getNullable("addenda")

    /**
     * The transfer amount in USD cents. A positive amount indicates a credit transfer pushing funds
     * to the receiving account. A negative amount indicates a debit transfer pulling funds from the
     * receiving account.
     */
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

    /** The description of the date of the transfer. */
    fun companyDescriptiveDate(): String? =
        companyDescriptiveDate.getNullable("company_descriptive_date")

    /** The data you chose to associate with the transfer. */
    fun companyDiscretionaryData(): String? =
        companyDiscretionaryData.getNullable("company_discretionary_data")

    /** The description of the transfer you set to be shown to the recipient. */
    fun companyEntryDescription(): String? =
        companyEntryDescription.getNullable("company_entry_description")

    /** The name by which the recipient knows you. */
    fun companyName(): String? = companyName.getNullable("company_name")

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

    /** What object created the transfer, either via the API or the dashboard. */
    fun createdBy(): CreatedBy? = createdBy.getNullable("created_by")

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * ACH transfers this is always equal to `usd`.
     */
    fun currency(): Currency = currency.getRequired("currency")

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    fun destinationAccountHolder(): DestinationAccountHolder =
        destinationAccountHolder.getRequired("destination_account_holder")

    /** The identifier of the External Account the transfer was made to, if any. */
    fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

    /** The type of the account to which the transfer will be sent. */
    fun funding(): Funding = funding.getRequired("funding")

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    fun idempotencyKey(): String? = idempotencyKey.getNullable("idempotency_key")

    /**
     * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
     * sub-object will contain details of the hold.
     */
    fun inboundFundsHold(): InboundFundsHold? = inboundFundsHold.getNullable("inbound_funds_hold")

    /** Your identifier for the transfer recipient. */
    fun individualId(): String? = individualId.getNullable("individual_id")

    /**
     * The name of the transfer recipient. This value is information and not verified by the
     * recipient's bank.
     */
    fun individualName(): String? = individualName.getNullable("individual_name")

    /** The transfer's network. */
    fun network(): Network = network.getRequired("network")

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers should use
     * different details, this will contain those details.
     */
    fun notificationsOfChange(): List<NotificationsOfChange> =
        notificationsOfChange.getRequired("notifications_of_change")

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    fun pendingTransactionId(): String? = pendingTransactionId.getNullable("pending_transaction_id")

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    fun preferredEffectiveDate(): PreferredEffectiveDate =
        preferredEffectiveDate.getRequired("preferred_effective_date")

    /** If your transfer is returned, this will contain details of the return. */
    fun return_(): Return? = return_.getNullable("return")

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    fun routingNumber(): String = routingNumber.getRequired("routing_number")

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     */
    fun settlement(): Settlement? = settlement.getNullable("settlement")

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode =
        standardEntryClassCode.getRequired("standard_entry_class_code")

    /** The descriptor that will show on the recipient's bank statement. */
    fun statementDescriptor(): String = statementDescriptor.getRequired("statement_descriptor")

    /** The lifecycle status of the transfer. */
    fun status(): Status = status.getRequired("status")

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental details. Increase
     * batches transfers and submits a file to the Federal Reserve roughly every 30 minutes. The
     * Federal Reserve processes ACH transfers during weekdays according to their
     * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
     */
    fun submission(): Submission? = submission.getNullable("submission")

    /** The ID for the transaction funding the transfer. */
    fun transactionId(): String? = transactionId.getNullable("transaction_id")

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
     */
    fun type(): Type = type.getRequired("type")

    /** The ACH transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id(): JsonField<String> = id

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

    /** The destination account number. */
    @JsonProperty("account_number")
    @ExcludeMissing
    fun _accountNumber(): JsonField<String> = accountNumber

    /**
     * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
     * Federal Reserve sends an acknowledgement message for each file that Increase submits.
     */
    @JsonProperty("acknowledgement")
    @ExcludeMissing
    fun _acknowledgement(): JsonField<Acknowledgement> = acknowledgement

    /** Additional information that will be sent to the recipient. */
    @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<Addenda> = addenda

    /**
     * The transfer amount in USD cents. A positive amount indicates a credit transfer pushing funds
     * to the receiving account. A negative amount indicates a debit transfer pulling funds from the
     * receiving account.
     */
    @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @JsonProperty("approval") @ExcludeMissing fun _approval(): JsonField<Approval> = approval

    /**
     * If your account requires approvals for transfers and the transfer was not approved, this will
     * contain details of the cancellation.
     */
    @JsonProperty("cancellation")
    @ExcludeMissing
    fun _cancellation(): JsonField<Cancellation> = cancellation

    /** The description of the date of the transfer. */
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

    /** The data you chose to associate with the transfer. */
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

    /** The description of the transfer you set to be shown to the recipient. */
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

    /** The name by which the recipient knows you. */
    @JsonProperty("company_name")
    @ExcludeMissing
    fun _companyName(): JsonField<String> = companyName

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at")
    @ExcludeMissing
    fun _createdAt(): JsonField<OffsetDateTime> = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy(): JsonField<CreatedBy> = createdBy

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * ACH transfers this is always equal to `usd`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    @JsonProperty("destination_account_holder")
    @ExcludeMissing
    fun _destinationAccountHolder(): JsonField<DestinationAccountHolder> = destinationAccountHolder

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId(): JsonField<String> = externalAccountId

    /** The type of the account to which the transfer will be sent. */
    @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key")
    @ExcludeMissing
    fun _idempotencyKey(): JsonField<String> = idempotencyKey

    /**
     * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
     * sub-object will contain details of the hold.
     */
    @JsonProperty("inbound_funds_hold")
    @ExcludeMissing
    fun _inboundFundsHold(): JsonField<InboundFundsHold> = inboundFundsHold

    /** Your identifier for the transfer recipient. */
    @JsonProperty("individual_id")
    @ExcludeMissing
    fun _individualId(): JsonField<String> = individualId

    /**
     * The name of the transfer recipient. This value is information and not verified by the
     * recipient's bank.
     */
    @JsonProperty("individual_name")
    @ExcludeMissing
    fun _individualName(): JsonField<String> = individualName

    /** The transfer's network. */
    @JsonProperty("network") @ExcludeMissing fun _network(): JsonField<Network> = network

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers should use
     * different details, this will contain those details.
     */
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    fun _notificationsOfChange(): JsonField<List<NotificationsOfChange>> = notificationsOfChange

    /**
     * The ID for the pending transaction representing the transfer. A pending transaction is
     * created when the transfer
     * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
     * by someone else in your organization.
     */
    @JsonProperty("pending_transaction_id")
    @ExcludeMissing
    fun _pendingTransactionId(): JsonField<String> = pendingTransactionId

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    @JsonProperty("preferred_effective_date")
    @ExcludeMissing
    fun _preferredEffectiveDate(): JsonField<PreferredEffectiveDate> = preferredEffectiveDate

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("return") @ExcludeMissing fun _return_(): JsonField<Return> = return_

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number")
    @ExcludeMissing
    fun _routingNumber(): JsonField<String> = routingNumber

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     */
    @JsonProperty("settlement")
    @ExcludeMissing
    fun _settlement(): JsonField<Settlement> = settlement

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

    /** The descriptor that will show on the recipient's bank statement. */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor(): JsonField<String> = statementDescriptor

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status(): JsonField<Status> = status

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental details. Increase
     * batches transfers and submits a file to the Federal Reserve roughly every 30 minutes. The
     * Federal Reserve processes ACH transfers during weekdays according to their
     * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
     */
    @JsonProperty("submission")
    @ExcludeMissing
    fun _submission(): JsonField<Submission> = submission

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id")
    @ExcludeMissing
    fun _transactionId(): JsonField<String> = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type(): JsonField<Type> = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    private var validated: Boolean = false

    fun validate(): AchTransfer = apply {
        if (validated) {
            return@apply
        }

        id()
        accountId()
        accountNumber()
        acknowledgement()?.validate()
        addenda()?.validate()
        amount()
        approval()?.validate()
        cancellation()?.validate()
        companyDescriptiveDate()
        companyDiscretionaryData()
        companyEntryDescription()
        companyName()
        createdAt()
        createdBy()?.validate()
        currency()
        destinationAccountHolder()
        externalAccountId()
        funding()
        idempotencyKey()
        inboundFundsHold()?.validate()
        individualId()
        individualName()
        network()
        notificationsOfChange().forEach { it.validate() }
        pendingTransactionId()
        preferredEffectiveDate().validate()
        return_()?.validate()
        routingNumber()
        settlement()?.validate()
        standardEntryClassCode()
        statementDescriptor()
        status()
        submission()?.validate()
        transactionId()
        type()
        validated = true
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    /** A builder for [AchTransfer]. */
    class Builder internal constructor() {

        private var id: JsonField<String>? = null
        private var accountId: JsonField<String>? = null
        private var accountNumber: JsonField<String>? = null
        private var acknowledgement: JsonField<Acknowledgement>? = null
        private var addenda: JsonField<Addenda>? = null
        private var amount: JsonField<Long>? = null
        private var approval: JsonField<Approval>? = null
        private var cancellation: JsonField<Cancellation>? = null
        private var companyDescriptiveDate: JsonField<String>? = null
        private var companyDiscretionaryData: JsonField<String>? = null
        private var companyEntryDescription: JsonField<String>? = null
        private var companyName: JsonField<String>? = null
        private var createdAt: JsonField<OffsetDateTime>? = null
        private var createdBy: JsonField<CreatedBy>? = null
        private var currency: JsonField<Currency>? = null
        private var destinationAccountHolder: JsonField<DestinationAccountHolder>? = null
        private var externalAccountId: JsonField<String>? = null
        private var funding: JsonField<Funding>? = null
        private var idempotencyKey: JsonField<String>? = null
        private var inboundFundsHold: JsonField<InboundFundsHold>? = null
        private var individualId: JsonField<String>? = null
        private var individualName: JsonField<String>? = null
        private var network: JsonField<Network>? = null
        private var notificationsOfChange: JsonField<MutableList<NotificationsOfChange>>? = null
        private var pendingTransactionId: JsonField<String>? = null
        private var preferredEffectiveDate: JsonField<PreferredEffectiveDate>? = null
        private var return_: JsonField<Return>? = null
        private var routingNumber: JsonField<String>? = null
        private var settlement: JsonField<Settlement>? = null
        private var standardEntryClassCode: JsonField<StandardEntryClassCode>? = null
        private var statementDescriptor: JsonField<String>? = null
        private var status: JsonField<Status>? = null
        private var submission: JsonField<Submission>? = null
        private var transactionId: JsonField<String>? = null
        private var type: JsonField<Type>? = null
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(achTransfer: AchTransfer) = apply {
            id = achTransfer.id
            accountId = achTransfer.accountId
            accountNumber = achTransfer.accountNumber
            acknowledgement = achTransfer.acknowledgement
            addenda = achTransfer.addenda
            amount = achTransfer.amount
            approval = achTransfer.approval
            cancellation = achTransfer.cancellation
            companyDescriptiveDate = achTransfer.companyDescriptiveDate
            companyDiscretionaryData = achTransfer.companyDiscretionaryData
            companyEntryDescription = achTransfer.companyEntryDescription
            companyName = achTransfer.companyName
            createdAt = achTransfer.createdAt
            createdBy = achTransfer.createdBy
            currency = achTransfer.currency
            destinationAccountHolder = achTransfer.destinationAccountHolder
            externalAccountId = achTransfer.externalAccountId
            funding = achTransfer.funding
            idempotencyKey = achTransfer.idempotencyKey
            inboundFundsHold = achTransfer.inboundFundsHold
            individualId = achTransfer.individualId
            individualName = achTransfer.individualName
            network = achTransfer.network
            notificationsOfChange = achTransfer.notificationsOfChange.map { it.toMutableList() }
            pendingTransactionId = achTransfer.pendingTransactionId
            preferredEffectiveDate = achTransfer.preferredEffectiveDate
            return_ = achTransfer.return_
            routingNumber = achTransfer.routingNumber
            settlement = achTransfer.settlement
            standardEntryClassCode = achTransfer.standardEntryClassCode
            statementDescriptor = achTransfer.statementDescriptor
            status = achTransfer.status
            submission = achTransfer.submission
            transactionId = achTransfer.transactionId
            type = achTransfer.type
            additionalProperties = achTransfer.additionalProperties.toMutableMap()
        }

        /** The ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH transfer's identifier. */
        fun id(id: JsonField<String>) = apply { this.id = id }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /**
         * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
         * Federal Reserve sends an acknowledgement message for each file that Increase submits.
         */
        fun acknowledgement(acknowledgement: Acknowledgement?) =
            acknowledgement(JsonField.ofNullable(acknowledgement))

        /**
         * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
         * Federal Reserve sends an acknowledgement message for each file that Increase submits.
         */
        fun acknowledgement(acknowledgement: JsonField<Acknowledgement>) = apply {
            this.acknowledgement = acknowledgement
        }

        /** Additional information that will be sent to the recipient. */
        fun addenda(addenda: Addenda?) = addenda(JsonField.ofNullable(addenda))

        /** Additional information that will be sent to the recipient. */
        fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

        /**
         * The transfer amount in USD cents. A positive amount indicates a credit transfer pushing
         * funds to the receiving account. A negative amount indicates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = amount(JsonField.of(amount))

        /**
         * The transfer amount in USD cents. A positive amount indicates a credit transfer pushing
         * funds to the receiving account. A negative amount indicates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: Approval?) = approval(JsonField.ofNullable(approval))

        /**
         * If your account requires approvals for transfers and the transfer was approved, this will
         * contain details of the approval.
         */
        fun approval(approval: JsonField<Approval>) = apply { this.approval = approval }

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: Cancellation?) =
            cancellation(JsonField.ofNullable(cancellation))

        /**
         * If your account requires approvals for transfers and the transfer was not approved, this
         * will contain details of the cancellation.
         */
        fun cancellation(cancellation: JsonField<Cancellation>) = apply {
            this.cancellation = cancellation
        }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String?) =
            companyDescriptiveDate(JsonField.ofNullable(companyDescriptiveDate))

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** The data you chose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: String?) =
            companyDiscretionaryData(JsonField.ofNullable(companyDiscretionaryData))

        /** The data you chose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer you set to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: String?) =
            companyEntryDescription(JsonField.ofNullable(companyEntryDescription))

        /** The description of the transfer you set to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String?) = companyName(JsonField.ofNullable(companyName))

        /** The name by which the recipient knows you. */
        fun companyName(companyName: JsonField<String>) = apply { this.companyName = companyName }

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply { this.createdAt = createdAt }

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: CreatedBy?) = createdBy(JsonField.ofNullable(createdBy))

        /** What object created the transfer, either via the API or the dashboard. */
        fun createdBy(createdBy: JsonField<CreatedBy>) = apply { this.createdBy = createdBy }

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For ACH transfers this is always equal to `usd`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For ACH transfers this is always equal to `usd`.
         */
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
            destinationAccountHolder(JsonField.of(destinationAccountHolder))

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(
            destinationAccountHolder: JsonField<DestinationAccountHolder>
        ) = apply { this.destinationAccountHolder = destinationAccountHolder }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String?) =
            externalAccountId(JsonField.ofNullable(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = funding(JsonField.of(funding))

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: String?) =
            idempotencyKey(JsonField.ofNullable(idempotencyKey))

        /**
         * The idempotency key you chose for this object. This value is unique across Increase and
         * is used to ensure that a request is only processed once. Learn more about
         * [idempotency](https://increase.com/documentation/idempotency-keys).
         */
        fun idempotencyKey(idempotencyKey: JsonField<String>) = apply {
            this.idempotencyKey = idempotencyKey
        }

        /**
         * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold?) =
            inboundFundsHold(JsonField.ofNullable(inboundFundsHold))

        /**
         * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
            this.inboundFundsHold = inboundFundsHold
        }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String?) = individualId(JsonField.ofNullable(individualId))

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String?) =
            individualName(JsonField.ofNullable(individualName))

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: JsonField<String>) = apply {
            this.individualName = individualName
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        fun network(network: JsonField<Network>) = apply { this.network = network }

        /**
         * If the receiving bank accepts the transfer but notifies that future transfers should use
         * different details, this will contain those details.
         */
        fun notificationsOfChange(notificationsOfChange: List<NotificationsOfChange>) =
            notificationsOfChange(JsonField.of(notificationsOfChange))

        /**
         * If the receiving bank accepts the transfer but notifies that future transfers should use
         * different details, this will contain those details.
         */
        fun notificationsOfChange(notificationsOfChange: JsonField<List<NotificationsOfChange>>) =
            apply {
                this.notificationsOfChange = notificationsOfChange.map { it.toMutableList() }
            }

        /**
         * If the receiving bank accepts the transfer but notifies that future transfers should use
         * different details, this will contain those details.
         */
        fun addNotificationsOfChange(notificationsOfChange: NotificationsOfChange) = apply {
            this.notificationsOfChange =
                (this.notificationsOfChange ?: JsonField.of(mutableListOf())).apply {
                    (asKnown()
                            ?: throw IllegalStateException(
                                "Field was set to non-list type: ${javaClass.simpleName}"
                            ))
                        .add(notificationsOfChange)
                }
        }

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: String?) =
            pendingTransactionId(JsonField.ofNullable(pendingTransactionId))

        /**
         * The ID for the pending transaction representing the transfer. A pending transaction is
         * created when the transfer
         * [requires approval](https://increase.com/documentation/transfer-approvals#transfer-approvals)
         * by someone else in your organization.
         */
        fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
            this.pendingTransactionId = pendingTransactionId
        }

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) =
            preferredEffectiveDate(JsonField.of(preferredEffectiveDate))

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
            apply {
                this.preferredEffectiveDate = preferredEffectiveDate
            }

        /** If your transfer is returned, this will contain details of the return. */
        fun return_(return_: Return?) = return_(JsonField.ofNullable(return_))

        /** If your transfer is returned, this will contain details of the return. */
        fun return_(return_: JsonField<Return>) = apply { this.return_ = return_ }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * A subhash containing information about when and how the transfer settled at the Federal
         * Reserve.
         */
        fun settlement(settlement: Settlement?) = settlement(JsonField.ofNullable(settlement))

        /**
         * A subhash containing information about when and how the transfer settled at the Federal
         * Reserve.
         */
        fun settlement(settlement: JsonField<Settlement>) = apply { this.settlement = settlement }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
            standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

        /** The descriptor that will show on the recipient's bank statement. */
        fun statementDescriptor(statementDescriptor: String) =
            statementDescriptor(JsonField.of(statementDescriptor))

        /** The descriptor that will show on the recipient's bank statement. */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental details.
         * Increase batches transfers and submits a file to the Federal Reserve roughly every 30
         * minutes. The Federal Reserve processes ACH transfers during weekdays according to their
         * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        fun submission(submission: Submission?) = submission(JsonField.ofNullable(submission))

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental details.
         * Increase batches transfers and submits a file to the Federal Reserve roughly every 30
         * minutes. The Federal Reserve processes ACH transfers during weekdays according to their
         * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String?) =
            transactionId(JsonField.ofNullable(transactionId))

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: JsonField<String>) = apply {
            this.transactionId = transactionId
        }

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_transfer`.
         */
        fun type(type: Type) = type(JsonField.of(type))

        /**
         * A constant representing the object's type. For this resource it will always be
         * `ach_transfer`.
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

        fun build(): AchTransfer =
            AchTransfer(
                checkRequired("id", id),
                checkRequired("accountId", accountId),
                checkRequired("accountNumber", accountNumber),
                checkRequired("acknowledgement", acknowledgement),
                checkRequired("addenda", addenda),
                checkRequired("amount", amount),
                checkRequired("approval", approval),
                checkRequired("cancellation", cancellation),
                checkRequired("companyDescriptiveDate", companyDescriptiveDate),
                checkRequired("companyDiscretionaryData", companyDiscretionaryData),
                checkRequired("companyEntryDescription", companyEntryDescription),
                checkRequired("companyName", companyName),
                checkRequired("createdAt", createdAt),
                checkRequired("createdBy", createdBy),
                checkRequired("currency", currency),
                checkRequired("destinationAccountHolder", destinationAccountHolder),
                checkRequired("externalAccountId", externalAccountId),
                checkRequired("funding", funding),
                checkRequired("idempotencyKey", idempotencyKey),
                checkRequired("inboundFundsHold", inboundFundsHold),
                checkRequired("individualId", individualId),
                checkRequired("individualName", individualName),
                checkRequired("network", network),
                checkRequired("notificationsOfChange", notificationsOfChange).map {
                    it.toImmutable()
                },
                checkRequired("pendingTransactionId", pendingTransactionId),
                checkRequired("preferredEffectiveDate", preferredEffectiveDate),
                checkRequired("return_", return_),
                checkRequired("routingNumber", routingNumber),
                checkRequired("settlement", settlement),
                checkRequired("standardEntryClassCode", standardEntryClassCode),
                checkRequired("statementDescriptor", statementDescriptor),
                checkRequired("status", status),
                checkRequired("submission", submission),
                checkRequired("transactionId", transactionId),
                checkRequired("type", type),
                additionalProperties.toImmutable(),
            )
    }

    /**
     * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
     * Federal Reserve sends an acknowledgement message for each file that Increase submits.
     */
    @NoAutoDetect
    class Acknowledgement
    @JsonCreator
    private constructor(
        @JsonProperty("acknowledged_at")
        @ExcludeMissing
        private val acknowledgedAt: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** When the Federal Reserve acknowledged the submitted file containing this transfer. */
        fun acknowledgedAt(): String = acknowledgedAt.getRequired("acknowledged_at")

        /** When the Federal Reserve acknowledged the submitted file containing this transfer. */
        @JsonProperty("acknowledged_at")
        @ExcludeMissing
        fun _acknowledgedAt(): JsonField<String> = acknowledgedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Acknowledgement = apply {
            if (validated) {
                return@apply
            }

            acknowledgedAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Acknowledgement]. */
        class Builder internal constructor() {

            private var acknowledgedAt: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(acknowledgement: Acknowledgement) = apply {
                acknowledgedAt = acknowledgement.acknowledgedAt
                additionalProperties = acknowledgement.additionalProperties.toMutableMap()
            }

            /**
             * When the Federal Reserve acknowledged the submitted file containing this transfer.
             */
            fun acknowledgedAt(acknowledgedAt: String) =
                acknowledgedAt(JsonField.of(acknowledgedAt))

            /**
             * When the Federal Reserve acknowledged the submitted file containing this transfer.
             */
            fun acknowledgedAt(acknowledgedAt: JsonField<String>) = apply {
                this.acknowledgedAt = acknowledgedAt
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

            fun build(): Acknowledgement =
                Acknowledgement(
                    checkRequired("acknowledgedAt", acknowledgedAt),
                    additionalProperties.toImmutable(),
                )
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

    /** Additional information that will be sent to the recipient. */
    @NoAutoDetect
    class Addenda
    @JsonCreator
    private constructor(
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("freeform")
        @ExcludeMissing
        private val freeform: JsonField<Freeform> = JsonMissing.of(),
        @JsonProperty("payment_order_remittance_advice")
        @ExcludeMissing
        private val paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice> =
            JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        fun category(): Category = category.getRequired("category")

        /** Unstructured `payment_related_information` passed through with the transfer. */
        fun freeform(): Freeform? = freeform.getNullable("freeform")

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        fun paymentOrderRemittanceAdvice(): PaymentOrderRemittanceAdvice? =
            paymentOrderRemittanceAdvice.getNullable("payment_order_remittance_advice")

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform(): JsonField<Freeform> = freeform

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonProperty("payment_order_remittance_advice")
        @ExcludeMissing
        fun _paymentOrderRemittanceAdvice(): JsonField<PaymentOrderRemittanceAdvice> =
            paymentOrderRemittanceAdvice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Addenda = apply {
            if (validated) {
                return@apply
            }

            category()
            freeform()?.validate()
            paymentOrderRemittanceAdvice()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform>? = null
            private var paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>? =
                null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties = addenda.additionalProperties.toMutableMap()
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

            /** Unstructured `payment_related_information` passed through with the transfer. */
            fun freeform(freeform: Freeform?) = freeform(JsonField.ofNullable(freeform))

            /** Unstructured `payment_related_information` passed through with the transfer. */
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice?
            ) = paymentOrderRemittanceAdvice(JsonField.ofNullable(paymentOrderRemittanceAdvice))

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>
            ) = apply { this.paymentOrderRemittanceAdvice = paymentOrderRemittanceAdvice }

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

            fun build(): Addenda =
                Addenda(
                    checkRequired("category", category),
                    checkRequired("freeform", freeform),
                    checkRequired("paymentOrderRemittanceAdvice", paymentOrderRemittanceAdvice),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The type of the resource. We may add additional possible values for this enum over time;
         * your application should be able to handle such additions gracefully.
         */
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

                /** Unstructured `payment_related_information` passed through with the transfer. */
                val FREEFORM = of("freeform")

                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                val PAYMENT_ORDER_REMITTANCE_ADVICE = of("payment_order_remittance_advice")

                /** Unknown addenda type. */
                val OTHER = of("other")

                fun of(value: String) = Category(JsonField.of(value))
            }

            /** An enum containing [Category]'s known values. */
            enum class Known {
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM,
                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                /** Unknown addenda type. */
                OTHER,
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
                /** Unstructured `payment_related_information` passed through with the transfer. */
                FREEFORM,
                /**
                 * Structured ASC X12 820 remittance advice records. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) for more information.
                 */
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                /** Unknown addenda type. */
                OTHER,
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
                    FREEFORM -> Value.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Value.PAYMENT_ORDER_REMITTANCE_ADVICE
                    OTHER -> Value.OTHER
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
                    FREEFORM -> Known.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Known.PAYMENT_ORDER_REMITTANCE_ADVICE
                    OTHER -> Known.OTHER
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Category && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @NoAutoDetect
        class Freeform
        @JsonCreator
        private constructor(
            @JsonProperty("entries")
            @ExcludeMissing
            private val entries: JsonField<List<Entry>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** Each entry represents an addendum sent with the transfer. */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /** Each entry represents an addendum sent with the transfer. */
            @JsonProperty("entries")
            @ExcludeMissing
            fun _entries(): JsonField<List<Entry>> = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): Freeform = apply {
                if (validated) {
                    return@apply
                }

                entries().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [Freeform]. */
            class Builder internal constructor() {

                private var entries: JsonField<MutableList<Entry>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(freeform: Freeform) = apply {
                    entries = freeform.entries.map { it.toMutableList() }
                    additionalProperties = freeform.additionalProperties.toMutableMap()
                }

                /** Each entry represents an addendum sent with the transfer. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /** Each entry represents an addendum sent with the transfer. */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /** Each entry represents an addendum sent with the transfer. */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(entry)
                        }
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

                fun build(): Freeform =
                    Freeform(
                        checkRequired("entries", entries).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Entry
            @JsonCreator
            private constructor(
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                private val paymentRelatedInformation: JsonField<String> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /** The payment related information passed in the addendum. */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation(): JsonField<String> = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Entry = apply {
                    if (validated) {
                        return@apply
                    }

                    paymentRelatedInformation()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Entry]. */
                class Builder internal constructor() {

                    private var paymentRelatedInformation: JsonField<String>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(entry: Entry) = apply {
                        paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties = entry.additionalProperties.toMutableMap()
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
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

                    fun build(): Entry =
                        Entry(
                            checkRequired("paymentRelatedInformation", paymentRelatedInformation),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Entry && paymentRelatedInformation == other.paymentRelatedInformation && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(paymentRelatedInformation, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Entry{paymentRelatedInformation=$paymentRelatedInformation, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is Freeform && entries == other.entries && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(entries, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "Freeform{entries=$entries, additionalProperties=$additionalProperties}"
        }

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @NoAutoDetect
        class PaymentOrderRemittanceAdvice
        @JsonCreator
        private constructor(
            @JsonProperty("invoices")
            @ExcludeMissing
            private val invoices: JsonField<List<Invoice>> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** ASC X12 RMR records for this specific transfer. */
            fun invoices(): List<Invoice> = invoices.getRequired("invoices")

            /** ASC X12 RMR records for this specific transfer. */
            @JsonProperty("invoices")
            @ExcludeMissing
            fun _invoices(): JsonField<List<Invoice>> = invoices

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): PaymentOrderRemittanceAdvice = apply {
                if (validated) {
                    return@apply
                }

                invoices().forEach { it.validate() }
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            /** A builder for [PaymentOrderRemittanceAdvice]. */
            class Builder internal constructor() {

                private var invoices: JsonField<MutableList<Invoice>>? = null
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice) =
                    apply {
                        invoices = paymentOrderRemittanceAdvice.invoices.map { it.toMutableList() }
                        additionalProperties =
                            paymentOrderRemittanceAdvice.additionalProperties.toMutableMap()
                    }

                /** ASC X12 RMR records for this specific transfer. */
                fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

                /** ASC X12 RMR records for this specific transfer. */
                fun invoices(invoices: JsonField<List<Invoice>>) = apply {
                    this.invoices = invoices.map { it.toMutableList() }
                }

                /** ASC X12 RMR records for this specific transfer. */
                fun addInvoice(invoice: Invoice) = apply {
                    invoices =
                        (invoices ?: JsonField.of(mutableListOf())).apply {
                            (asKnown()
                                    ?: throw IllegalStateException(
                                        "Field was set to non-list type: ${javaClass.simpleName}"
                                    ))
                                .add(invoice)
                        }
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

                fun build(): PaymentOrderRemittanceAdvice =
                    PaymentOrderRemittanceAdvice(
                        checkRequired("invoices", invoices).map { it.toImmutable() },
                        additionalProperties.toImmutable(),
                    )
            }

            @NoAutoDetect
            class Invoice
            @JsonCreator
            private constructor(
                @JsonProperty("invoice_number")
                @ExcludeMissing
                private val invoiceNumber: JsonField<String> = JsonMissing.of(),
                @JsonProperty("paid_amount")
                @ExcludeMissing
                private val paidAmount: JsonField<Long> = JsonMissing.of(),
                @JsonAnySetter
                private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
            ) {

                /**
                 * The invoice number for this reference, determined in advance with the receiver.
                 */
                fun invoiceNumber(): String = invoiceNumber.getRequired("invoice_number")

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 */
                fun paidAmount(): Long = paidAmount.getRequired("paid_amount")

                /**
                 * The invoice number for this reference, determined in advance with the receiver.
                 */
                @JsonProperty("invoice_number")
                @ExcludeMissing
                fun _invoiceNumber(): JsonField<String> = invoiceNumber

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("paid_amount")
                @ExcludeMissing
                fun _paidAmount(): JsonField<Long> = paidAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                private var validated: Boolean = false

                fun validate(): Invoice = apply {
                    if (validated) {
                        return@apply
                    }

                    invoiceNumber()
                    paidAmount()
                    validated = true
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                /** A builder for [Invoice]. */
                class Builder internal constructor() {

                    private var invoiceNumber: JsonField<String>? = null
                    private var paidAmount: JsonField<Long>? = null
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(invoice: Invoice) = apply {
                        invoiceNumber = invoice.invoiceNumber
                        paidAmount = invoice.paidAmount
                        additionalProperties = invoice.additionalProperties.toMutableMap()
                    }

                    /**
                     * The invoice number for this reference, determined in advance with the
                     * receiver.
                     */
                    fun invoiceNumber(invoiceNumber: String) =
                        invoiceNumber(JsonField.of(invoiceNumber))

                    /**
                     * The invoice number for this reference, determined in advance with the
                     * receiver.
                     */
                    fun invoiceNumber(invoiceNumber: JsonField<String>) = apply {
                        this.invoiceNumber = invoiceNumber
                    }

                    /**
                     * The amount that was paid for this invoice in the minor unit of its currency.
                     * For dollars, for example, this is cents.
                     */
                    fun paidAmount(paidAmount: Long) = paidAmount(JsonField.of(paidAmount))

                    /**
                     * The amount that was paid for this invoice in the minor unit of its currency.
                     * For dollars, for example, this is cents.
                     */
                    fun paidAmount(paidAmount: JsonField<Long>) = apply {
                        this.paidAmount = paidAmount
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

                    fun build(): Invoice =
                        Invoice(
                            checkRequired("invoiceNumber", invoiceNumber),
                            checkRequired("paidAmount", paidAmount),
                            additionalProperties.toImmutable(),
                        )
                }

                override fun equals(other: Any?): Boolean {
                    if (this === other) {
                        return true
                    }

                    return /* spotless:off */ other is Invoice && invoiceNumber == other.invoiceNumber && paidAmount == other.paidAmount && additionalProperties == other.additionalProperties /* spotless:on */
                }

                /* spotless:off */
                private val hashCode: Int by lazy { Objects.hash(invoiceNumber, paidAmount, additionalProperties) }
                /* spotless:on */

                override fun hashCode(): Int = hashCode

                override fun toString() =
                    "Invoice{invoiceNumber=$invoiceNumber, paidAmount=$paidAmount, additionalProperties=$additionalProperties}"
            }

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is PaymentOrderRemittanceAdvice && invoices == other.invoices && additionalProperties == other.additionalProperties /* spotless:on */
            }

            /* spotless:off */
            private val hashCode: Int by lazy { Objects.hash(invoices, additionalProperties) }
            /* spotless:on */

            override fun hashCode(): Int = hashCode

            override fun toString() =
                "PaymentOrderRemittanceAdvice{invoices=$invoices, additionalProperties=$additionalProperties}"
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Addenda && category == other.category && freeform == other.freeform && paymentOrderRemittanceAdvice == other.paymentOrderRemittanceAdvice && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(category, freeform, paymentOrderRemittanceAdvice, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Addenda{category=$category, freeform=$freeform, paymentOrderRemittanceAdvice=$paymentOrderRemittanceAdvice, additionalProperties=$additionalProperties}"
    }

    /**
     * If your account requires approvals for transfers and the transfer was approved, this will
     * contain details of the approval.
     */
    @NoAutoDetect
    class Approval
    @JsonCreator
    private constructor(
        @JsonProperty("approved_at")
        @ExcludeMissing
        private val approvedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("approved_by")
        @ExcludeMissing
        private val approvedBy: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("approved_at")
        @ExcludeMissing
        fun _approvedAt(): JsonField<OffsetDateTime> = approvedAt

        /**
         * If the Transfer was approved by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("approved_by")
        @ExcludeMissing
        fun _approvedBy(): JsonField<String> = approvedBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Approval = apply {
            if (validated) {
                return@apply
            }

            approvedAt()
            approvedBy()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * transfer was approved.
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
             * If the Transfer was approved by a user in the dashboard, the email address of that
             * user.
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

            fun build(): Approval =
                Approval(
                    checkRequired("approvedAt", approvedAt),
                    checkRequired("approvedBy", approvedBy),
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
    @NoAutoDetect
    class Cancellation
    @JsonCreator
    private constructor(
        @JsonProperty("canceled_at")
        @ExcludeMissing
        private val canceledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("canceled_by")
        @ExcludeMissing
        private val canceledBy: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("canceled_at")
        @ExcludeMissing
        fun _canceledAt(): JsonField<OffsetDateTime> = canceledAt

        /**
         * If the Transfer was canceled by a user in the dashboard, the email address of that user.
         */
        @JsonProperty("canceled_by")
        @ExcludeMissing
        fun _canceledBy(): JsonField<String> = canceledBy

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Cancellation = apply {
            if (validated) {
                return@apply
            }

            canceledAt()
            canceledBy()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * Transfer was canceled.
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
             * If the Transfer was canceled by a user in the dashboard, the email address of that
             * user.
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

            fun build(): Cancellation =
                Cancellation(
                    checkRequired("canceledAt", canceledAt),
                    checkRequired("canceledBy", canceledBy),
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
    @NoAutoDetect
    class CreatedBy
    @JsonCreator
    private constructor(
        @JsonProperty("api_key")
        @ExcludeMissing
        private val apiKey: JsonField<ApiKey> = JsonMissing.of(),
        @JsonProperty("category")
        @ExcludeMissing
        private val category: JsonField<Category> = JsonMissing.of(),
        @JsonProperty("oauth_application")
        @ExcludeMissing
        private val oauthApplication: JsonField<OAuthApplication> = JsonMissing.of(),
        @JsonProperty("user") @ExcludeMissing private val user: JsonField<User> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
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
        @JsonProperty("api_key") @ExcludeMissing fun _apiKey(): JsonField<ApiKey> = apiKey

        /** The type of object that created this transfer. */
        @JsonProperty("category") @ExcludeMissing fun _category(): JsonField<Category> = category

        /** If present, details about the OAuth Application that created the transfer. */
        @JsonProperty("oauth_application")
        @ExcludeMissing
        fun _oauthApplication(): JsonField<OAuthApplication> = oauthApplication

        /** If present, details about the User that created the transfer. */
        @JsonProperty("user") @ExcludeMissing fun _user(): JsonField<User> = user

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): CreatedBy = apply {
            if (validated) {
                return@apply
            }

            apiKey()?.validate()
            category()
            oauthApplication()?.validate()
            user()?.validate()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

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

            /** If present, details about the API key that created the transfer. */
            fun apiKey(apiKey: JsonField<ApiKey>) = apply { this.apiKey = apiKey }

            /** The type of object that created this transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of object that created this transfer. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: OAuthApplication?) =
                oauthApplication(JsonField.ofNullable(oauthApplication))

            /** If present, details about the OAuth Application that created the transfer. */
            fun oauthApplication(oauthApplication: JsonField<OAuthApplication>) = apply {
                this.oauthApplication = oauthApplication
            }

            /** If present, details about the User that created the transfer. */
            fun user(user: User?) = user(JsonField.ofNullable(user))

            /** If present, details about the User that created the transfer. */
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

            fun build(): CreatedBy =
                CreatedBy(
                    checkRequired("apiKey", apiKey),
                    checkRequired("category", category),
                    checkRequired("oauthApplication", oauthApplication),
                    checkRequired("user", user),
                    additionalProperties.toImmutable(),
                )
        }

        /** If present, details about the API key that created the transfer. */
        @NoAutoDetect
        class ApiKey
        @JsonCreator
        private constructor(
            @JsonProperty("description")
            @ExcludeMissing
            private val description: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The description set for the API key when it was created. */
            fun description(): String? = description.getNullable("description")

            /** The description set for the API key when it was created. */
            @JsonProperty("description")
            @ExcludeMissing
            fun _description(): JsonField<String> = description

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): ApiKey = apply {
                if (validated) {
                    return@apply
                }

                description()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The description set for the API key when it was created. */
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

                fun build(): ApiKey =
                    ApiKey(
                        checkRequired("description", description),
                        additionalProperties.toImmutable(),
                    )
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
        @NoAutoDetect
        class OAuthApplication
        @JsonCreator
        private constructor(
            @JsonProperty("name")
            @ExcludeMissing
            private val name: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name") @ExcludeMissing fun _name(): JsonField<String> = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): OAuthApplication = apply {
                if (validated) {
                    return@apply
                }

                name()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The name of the OAuth Application. */
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

                fun build(): OAuthApplication =
                    OAuthApplication(
                        checkRequired("name", name),
                        additionalProperties.toImmutable(),
                    )
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
        @NoAutoDetect
        class User
        @JsonCreator
        private constructor(
            @JsonProperty("email")
            @ExcludeMissing
            private val email: JsonField<String> = JsonMissing.of(),
            @JsonAnySetter
            private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
        ) {

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email") @ExcludeMissing fun _email(): JsonField<String> = email

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            private var validated: Boolean = false

            fun validate(): User = apply {
                if (validated) {
                    return@apply
                }

                email()
                validated = true
            }

            fun toBuilder() = Builder().from(this)

            companion object {

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

                /** The email address of the User. */
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

                fun build(): User =
                    User(checkRequired("email", email), additionalProperties.toImmutable())
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

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * ACH transfers this is always equal to `usd`.
     */
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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    class DestinationAccountHolder
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** The External Account is owned by a business. */
            val BUSINESS = of("business")

            /** The External Account is owned by an individual. */
            val INDIVIDUAL = of("individual")

            /** It's unknown what kind of entity owns the External Account. */
            val UNKNOWN = of("unknown")

            fun of(value: String) = DestinationAccountHolder(JsonField.of(value))
        }

        /** An enum containing [DestinationAccountHolder]'s known values. */
        enum class Known {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
            INDIVIDUAL,
            /** It's unknown what kind of entity owns the External Account. */
            UNKNOWN,
        }

        /**
         * An enum containing [DestinationAccountHolder]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [DestinationAccountHolder] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** The External Account is owned by a business. */
            BUSINESS,
            /** The External Account is owned by an individual. */
            INDIVIDUAL,
            /** It's unknown what kind of entity owns the External Account. */
            UNKNOWN,
            /**
             * An enum member indicating that [DestinationAccountHolder] was instantiated with an
             * unknown value.
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
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
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
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
                else ->
                    throw IncreaseInvalidDataException("Unknown DestinationAccountHolder: $value")
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

            return /* spotless:off */ other is DestinationAccountHolder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /** The type of the account to which the transfer will be sent. */
    class Funding @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            /** A checking account. */
            val CHECKING = of("checking")

            /** A savings account. */
            val SAVINGS = of("savings")

            fun of(value: String) = Funding(JsonField.of(value))
        }

        /** An enum containing [Funding]'s known values. */
        enum class Known {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
        }

        /**
         * An enum containing [Funding]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Funding] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A checking account. */
            CHECKING,
            /** A savings account. */
            SAVINGS,
            /** An enum member indicating that [Funding] was instantiated with an unknown value. */
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
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
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
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
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

            return /* spotless:off */ other is Funding && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    /**
     * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
     * sub-object will contain details of the hold.
     */
    @NoAutoDetect
    class InboundFundsHold
    @JsonCreator
    private constructor(
        @JsonProperty("id") @ExcludeMissing private val id: JsonField<String> = JsonMissing.of(),
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
        @JsonProperty("type") @ExcludeMissing private val type: JsonField<Type> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Inbound Funds Hold identifier. */
        fun id(): String = id.getRequired("id")

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
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
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
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

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency(): JsonField<Currency> = currency

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
            if (validated) {
                return@apply
            }

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

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [InboundFundsHold]. */
        class Builder internal constructor() {

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
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
             */
            fun automaticallyReleasesAt(automaticallyReleasesAt: OffsetDateTime) =
                automaticallyReleasesAt(JsonField.of(automaticallyReleasesAt))

            /**
             * When the hold will be released automatically. Certain conditions may cause it to be
             * released before this time.
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
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
             */
            fun currency(currency: Currency) = currency(JsonField.of(currency))

            /**
             * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency.
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun removeAdditionalProperty(key: String) = apply { additionalProperties.remove(key) }

            fun removeAllAdditionalProperties(keys: Set<String>) = apply {
                keys.forEach(::removeAdditionalProperty)
            }

            fun build(): InboundFundsHold =
                InboundFundsHold(
                    checkRequired("id", id),
                    checkRequired("amount", amount),
                    checkRequired("automaticallyReleasesAt", automaticallyReleasesAt),
                    checkRequired("createdAt", createdAt),
                    checkRequired("currency", currency),
                    checkRequired("heldTransactionId", heldTransactionId),
                    checkRequired("pendingTransactionId", pendingTransactionId),
                    checkRequired("releasedAt", releasedAt),
                    checkRequired("status", status),
                    checkRequired("type", type),
                    additionalProperties.toImmutable(),
                )
        }

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        class Currency @JsonCreator private constructor(private val value: JsonField<String>) :
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
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
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
                /**
                 * An enum member indicating that [Currency] was instantiated with an unknown value.
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
             * Use the [value] method instead if you're uncertain the value is always known and
             * don't want to throw for the unknown case.
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

                return /* spotless:off */ other is Currency && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        /** The status of the hold. */
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

                /** Funds are still being held. */
                val HELD = of("held")

                /** Funds have been released. */
                val COMPLETE = of("complete")

                fun of(value: String) = Status(JsonField.of(value))
            }

            /** An enum containing [Status]'s known values. */
            enum class Known {
                /** Funds are still being held. */
                HELD,
                /** Funds have been released. */
                COMPLETE,
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
                /** Funds are still being held. */
                HELD,
                /** Funds have been released. */
                COMPLETE,
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
                    HELD -> Value.HELD
                    COMPLETE -> Value.COMPLETE
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
                    HELD -> Known.HELD
                    COMPLETE -> Known.COMPLETE
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

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
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

                val INBOUND_FUNDS_HOLD = of("inbound_funds_hold")

                fun of(value: String) = Type(JsonField.of(value))
            }

            /** An enum containing [Type]'s known values. */
            enum class Known {
                INBOUND_FUNDS_HOLD
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
                INBOUND_FUNDS_HOLD,
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
                    INBOUND_FUNDS_HOLD -> Value.INBOUND_FUNDS_HOLD
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
                    INBOUND_FUNDS_HOLD -> Known.INBOUND_FUNDS_HOLD
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

    /** The transfer's network. */
    class Network @JsonCreator private constructor(private val value: JsonField<String>) : Enum {

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

            val ACH = of("ach")

            fun of(value: String) = Network(JsonField.of(value))
        }

        /** An enum containing [Network]'s known values. */
        enum class Known {
            ACH
        }

        /**
         * An enum containing [Network]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [Network] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            ACH,
            /** An enum member indicating that [Network] was instantiated with an unknown value. */
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
                ACH -> Value.ACH
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
                ACH -> Known.ACH
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
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

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @NoAutoDetect
    class NotificationsOfChange
    @JsonCreator
    private constructor(
        @JsonProperty("change_code")
        @ExcludeMissing
        private val changeCode: JsonField<ChangeCode> = JsonMissing.of(),
        @JsonProperty("corrected_data")
        @ExcludeMissing
        private val correctedData: JsonField<String> = JsonMissing.of(),
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        fun changeCode(): ChangeCode = changeCode.getRequired("change_code")

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        fun correctedData(): String = correctedData.getRequired("corrected_data")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        @JsonProperty("change_code")
        @ExcludeMissing
        fun _changeCode(): JsonField<ChangeCode> = changeCode

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        @JsonProperty("corrected_data")
        @ExcludeMissing
        fun _correctedData(): JsonField<String> = correctedData

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): NotificationsOfChange = apply {
            if (validated) {
                return@apply
            }

            changeCode()
            correctedData()
            createdAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [NotificationsOfChange]. */
        class Builder internal constructor() {

            private var changeCode: JsonField<ChangeCode>? = null
            private var correctedData: JsonField<String>? = null
            private var createdAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(notificationsOfChange: NotificationsOfChange) = apply {
                changeCode = notificationsOfChange.changeCode
                correctedData = notificationsOfChange.correctedData
                createdAt = notificationsOfChange.createdAt
                additionalProperties = notificationsOfChange.additionalProperties.toMutableMap()
            }

            /**
             * The required type of change that is being signaled by the receiving financial
             * institution.
             */
            fun changeCode(changeCode: ChangeCode) = changeCode(JsonField.of(changeCode))

            /**
             * The required type of change that is being signaled by the receiving financial
             * institution.
             */
            fun changeCode(changeCode: JsonField<ChangeCode>) = apply {
                this.changeCode = changeCode
            }

            /**
             * The corrected data that should be used in future ACHs to this account. This may
             * contain the suggested new account number or routing number. When the `change_code` is
             * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a
             * 2 encourage changing the `funding` parameter to checking; numbers starting with a 3
             * encourage changing to savings.
             */
            fun correctedData(correctedData: String) = correctedData(JsonField.of(correctedData))

            /**
             * The corrected data that should be used in future ACHs to this account. This may
             * contain the suggested new account number or routing number. When the `change_code` is
             * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a
             * 2 encourage changing the `funding` parameter to checking; numbers starting with a 3
             * encourage changing to savings.
             */
            fun correctedData(correctedData: JsonField<String>) = apply {
                this.correctedData = correctedData
            }

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * notification occurred.
             */
            fun createdAt(createdAt: OffsetDateTime) = createdAt(JsonField.of(createdAt))

            /**
             * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
             * notification occurred.
             */
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun build(): NotificationsOfChange =
                NotificationsOfChange(
                    checkRequired("changeCode", changeCode),
                    checkRequired("correctedData", correctedData),
                    checkRequired("createdAt", createdAt),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The required type of change that is being signaled by the receiving financial
         * institution.
         */
        class ChangeCode @JsonCreator private constructor(private val value: JsonField<String>) :
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

                /** The account number was incorrect. */
                val INCORRECT_ACCOUNT_NUMBER = of("incorrect_account_number")

                /** The routing number was incorrect. */
                val INCORRECT_ROUTING_NUMBER = of("incorrect_routing_number")

                /** Both the routing number and the account number were incorrect. */
                val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                    of("incorrect_routing_number_and_account_number")

                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                val INCORRECT_TRANSACTION_CODE = of("incorrect_transaction_code")

                /** The account number and the transaction code were incorrect. */
                val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_account_number_and_transaction_code")

                /** The routing number, account number, and transaction code were incorrect. */
                val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_routing_number_account_number_and_transaction_code")

                /** The receiving depository financial institution identification was incorrect. */
                val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                    of("incorrect_receiving_depository_financial_institution_identification")

                /** The individual identification number was incorrect. */
                val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                    of("incorrect_individual_identification_number")

                /** The addenda had an incorrect format. */
                val ADDENDA_FORMAT_ERROR = of("addenda_format_error")

                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrect_standard_entry_class_code_for_outbound_international_payment")

                /** The notification of change was misrouted. */
                val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

                /** The trace number was incorrect. */
                val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

                /** The company identification number was incorrect. */
                val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                    of("incorrect_company_identification_number")

                /** The individual identification number or identification number was incorrect. */
                val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

                /** The corrected data was incorrectly formatted. */
                val INCORRECTLY_FORMATTED_CORRECTED_DATA =
                    of("incorrectly_formatted_corrected_data")

                /** The discretionary data was incorrect. */
                val INCORRECT_DISCRETIONARY_DATA = of("incorrect_discretionary_data")

                /** The routing number was not from the original entry detail record. */
                val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of("routing_number_not_from_original_entry_detail_record")

                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of(
                        "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                    )

                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                    of("incorrect_transaction_code_by_originating_depository_financial_institution")

                fun of(value: String) = ChangeCode(JsonField.of(value))
            }

            /** An enum containing [ChangeCode]'s known values. */
            enum class Known {
                /** The account number was incorrect. */
                INCORRECT_ACCOUNT_NUMBER,
                /** The routing number was incorrect. */
                INCORRECT_ROUTING_NUMBER,
                /** Both the routing number and the account number were incorrect. */
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                INCORRECT_TRANSACTION_CODE,
                /** The account number and the transaction code were incorrect. */
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The routing number, account number, and transaction code were incorrect. */
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The receiving depository financial institution identification was incorrect. */
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                /** The individual identification number was incorrect. */
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                /** The addenda had an incorrect format. */
                ADDENDA_FORMAT_ERROR,
                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** The notification of change was misrouted. */
                MISROUTED_NOTIFICATION_OF_CHANGE,
                /** The trace number was incorrect. */
                INCORRECT_TRACE_NUMBER,
                /** The company identification number was incorrect. */
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                /** The individual identification number or identification number was incorrect. */
                INCORRECT_IDENTIFICATION_NUMBER,
                /** The corrected data was incorrectly formatted. */
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                /** The discretionary data was incorrect. */
                INCORRECT_DISCRETIONARY_DATA,
                /** The routing number was not from the original entry detail record. */
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
            }

            /**
             * An enum containing [ChangeCode]'s known values, as well as an [_UNKNOWN] member.
             *
             * An instance of [ChangeCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The account number was incorrect. */
                INCORRECT_ACCOUNT_NUMBER,
                /** The routing number was incorrect. */
                INCORRECT_ROUTING_NUMBER,
                /** Both the routing number and the account number were incorrect. */
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                /**
                 * The transaction code was incorrect. Try changing the `funding` parameter from
                 * checking to savings or vice-versa.
                 */
                INCORRECT_TRANSACTION_CODE,
                /** The account number and the transaction code were incorrect. */
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The routing number, account number, and transaction code were incorrect. */
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                /** The receiving depository financial institution identification was incorrect. */
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                /** The individual identification number was incorrect. */
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                /** The addenda had an incorrect format. */
                ADDENDA_FORMAT_ERROR,
                /**
                 * The standard entry class code was incorrect for an outbound international
                 * payment.
                 */
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** The notification of change was misrouted. */
                MISROUTED_NOTIFICATION_OF_CHANGE,
                /** The trace number was incorrect. */
                INCORRECT_TRACE_NUMBER,
                /** The company identification number was incorrect. */
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                /** The individual identification number or identification number was incorrect. */
                INCORRECT_IDENTIFICATION_NUMBER,
                /** The corrected data was incorrectly formatted. */
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                /** The discretionary data was incorrect. */
                INCORRECT_DISCRETIONARY_DATA,
                /** The routing number was not from the original entry detail record. */
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The depository financial institution account number was not from the original
                 * entry detail record.
                 */
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                /**
                 * The transaction code was incorrect, initiated by the originating depository
                 * financial institution.
                 */
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
                /**
                 * An enum member indicating that [ChangeCode] was instantiated with an unknown
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
                    INCORRECT_ACCOUNT_NUMBER -> Value.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Value.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Value.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Value.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Value.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Value.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Value.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Value.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Value.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Value.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Value.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Value.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Value.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Value.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Value
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Value
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
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
                    INCORRECT_ACCOUNT_NUMBER -> Known.INCORRECT_ACCOUNT_NUMBER
                    INCORRECT_ROUTING_NUMBER -> Known.INCORRECT_ROUTING_NUMBER
                    INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER ->
                        Known.INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER
                    INCORRECT_TRANSACTION_CODE -> Known.INCORRECT_TRANSACTION_CODE
                    INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE ->
                        Known.INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE
                    INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION ->
                        Known.INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION
                    INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER
                    ADDENDA_FORMAT_ERROR -> Known.ADDENDA_FORMAT_ERROR
                    INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT ->
                        Known.INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT
                    MISROUTED_NOTIFICATION_OF_CHANGE -> Known.MISROUTED_NOTIFICATION_OF_CHANGE
                    INCORRECT_TRACE_NUMBER -> Known.INCORRECT_TRACE_NUMBER
                    INCORRECT_COMPANY_IDENTIFICATION_NUMBER ->
                        Known.INCORRECT_COMPANY_IDENTIFICATION_NUMBER
                    INCORRECT_IDENTIFICATION_NUMBER -> Known.INCORRECT_IDENTIFICATION_NUMBER
                    INCORRECTLY_FORMATTED_CORRECTED_DATA ->
                        Known.INCORRECTLY_FORMATTED_CORRECTED_DATA
                    INCORRECT_DISCRETIONARY_DATA -> Known.INCORRECT_DISCRETIONARY_DATA
                    ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known.ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD ->
                        Known
                            .DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD
                    INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION ->
                        Known
                            .INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION
                    else -> throw IncreaseInvalidDataException("Unknown ChangeCode: $value")
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

                return /* spotless:off */ other is ChangeCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is NotificationsOfChange && changeCode == other.changeCode && correctedData == other.correctedData && createdAt == other.createdAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(changeCode, correctedData, createdAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "NotificationsOfChange{changeCode=$changeCode, correctedData=$correctedData, createdAt=$createdAt, additionalProperties=$additionalProperties}"
    }

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    @NoAutoDetect
    class PreferredEffectiveDate
    @JsonCreator
    private constructor(
        @JsonProperty("date")
        @ExcludeMissing
        private val date: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("settlement_schedule")
        @ExcludeMissing
        private val settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use as
         * the effective date when submitting this transfer.
         */
        fun date(): LocalDate? = date.getNullable("date")

        /** A schedule by which Increase will choose an effective date for the transfer. */
        fun settlementSchedule(): SettlementSchedule? =
            settlementSchedule.getNullable("settlement_schedule")

        /**
         * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use as
         * the effective date when submitting this transfer.
         */
        @JsonProperty("date") @ExcludeMissing fun _date(): JsonField<LocalDate> = date

        /** A schedule by which Increase will choose an effective date for the transfer. */
        @JsonProperty("settlement_schedule")
        @ExcludeMissing
        fun _settlementSchedule(): JsonField<SettlementSchedule> = settlementSchedule

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): PreferredEffectiveDate = apply {
            if (validated) {
                return@apply
            }

            date()
            settlementSchedule()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [PreferredEffectiveDate]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate>? = null
            private var settlementSchedule: JsonField<SettlementSchedule>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(preferredEffectiveDate: PreferredEffectiveDate) = apply {
                date = preferredEffectiveDate.date
                settlementSchedule = preferredEffectiveDate.settlementSchedule
                additionalProperties = preferredEffectiveDate.additionalProperties.toMutableMap()
            }

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            fun date(date: LocalDate?) = date(JsonField.ofNullable(date))

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** A schedule by which Increase will choose an effective date for the transfer. */
            fun settlementSchedule(settlementSchedule: SettlementSchedule?) =
                settlementSchedule(JsonField.ofNullable(settlementSchedule))

            /** A schedule by which Increase will choose an effective date for the transfer. */
            fun settlementSchedule(settlementSchedule: JsonField<SettlementSchedule>) = apply {
                this.settlementSchedule = settlementSchedule
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

            fun build(): PreferredEffectiveDate =
                PreferredEffectiveDate(
                    checkRequired("date", date),
                    checkRequired("settlementSchedule", settlementSchedule),
                    additionalProperties.toImmutable(),
                )
        }

        /** A schedule by which Increase will choose an effective date for the transfer. */
        class SettlementSchedule
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

                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                val SAME_DAY = of("same_day")

                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                val FUTURE_DATED = of("future_dated")

                fun of(value: String) = SettlementSchedule(JsonField.of(value))
            }

            /** An enum containing [SettlementSchedule]'s known values. */
            enum class Known {
                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                SAME_DAY,
                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                FUTURE_DATED,
            }

            /**
             * An enum containing [SettlementSchedule]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [SettlementSchedule] can contain an unknown value in a couple of
             * cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * The chosen effective date will be the same as the ACH processing date on which
                 * the transfer is submitted. This is necessary, but not sufficient for the transfer
                 * to be settled same-day: it must also be submitted before the last same-day cutoff
                 * and be less than or equal to $1,000.000.00.
                 */
                SAME_DAY,
                /**
                 * The chosen effective date will be the business day following the ACH processing
                 * date on which the transfer is submitted. The transfer will be settled on that
                 * future day.
                 */
                FUTURE_DATED,
                /**
                 * An enum member indicating that [SettlementSchedule] was instantiated with an
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
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
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
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else -> throw IncreaseInvalidDataException("Unknown SettlementSchedule: $value")
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

                return /* spotless:off */ other is SettlementSchedule && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is PreferredEffectiveDate && date == other.date && settlementSchedule == other.settlementSchedule && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(date, settlementSchedule, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "PreferredEffectiveDate{date=$date, settlementSchedule=$settlementSchedule, additionalProperties=$additionalProperties}"
    }

    /** If your transfer is returned, this will contain details of the return. */
    @NoAutoDetect
    class Return
    @JsonCreator
    private constructor(
        @JsonProperty("created_at")
        @ExcludeMissing
        private val createdAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("raw_return_reason_code")
        @ExcludeMissing
        private val rawReturnReasonCode: JsonField<String> = JsonMissing.of(),
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        private val returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of(),
        @JsonProperty("trace_number")
        @ExcludeMissing
        private val traceNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transaction_id")
        @ExcludeMissing
        private val transactionId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("transfer_id")
        @ExcludeMissing
        private val transferId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        fun createdAt(): OffsetDateTime = createdAt.getRequired("created_at")

        /** The three character ACH return code, in the range R01 to R85. */
        fun rawReturnReasonCode(): String =
            rawReturnReasonCode.getRequired("raw_return_reason_code")

        /**
         * Why the ACH Transfer was returned. This reason code is sent by the receiving bank back to
         * Increase.
         */
        fun returnReasonCode(): ReturnReasonCode =
            returnReasonCode.getRequired("return_reason_code")

        /**
         * A 15 digit number that was generated by the bank that initiated the return. The trace
         * number of the return is different than that of the original transfer. ACH trace numbers
         * are not unique, but along with the amount and date this number can be used to identify
         * the ACH return at the bank that initiated it.
         */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

        /** The identifier of the Transaction associated with this return. */
        fun transactionId(): String = transactionId.getRequired("transaction_id")

        /** The identifier of the ACH Transfer associated with this return. */
        fun transferId(): String = transferId.getRequired("transfer_id")

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * transfer was created.
         */
        @JsonProperty("created_at")
        @ExcludeMissing
        fun _createdAt(): JsonField<OffsetDateTime> = createdAt

        /** The three character ACH return code, in the range R01 to R85. */
        @JsonProperty("raw_return_reason_code")
        @ExcludeMissing
        fun _rawReturnReasonCode(): JsonField<String> = rawReturnReasonCode

        /**
         * Why the ACH Transfer was returned. This reason code is sent by the receiving bank back to
         * Increase.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode(): JsonField<ReturnReasonCode> = returnReasonCode

        /**
         * A 15 digit number that was generated by the bank that initiated the return. The trace
         * number of the return is different than that of the original transfer. ACH trace numbers
         * are not unique, but along with the amount and date this number can be used to identify
         * the ACH return at the bank that initiated it.
         */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun _traceNumber(): JsonField<String> = traceNumber

        /** The identifier of the Transaction associated with this return. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
        fun _transactionId(): JsonField<String> = transactionId

        /** The identifier of the ACH Transfer associated with this return. */
        @JsonProperty("transfer_id")
        @ExcludeMissing
        fun _transferId(): JsonField<String> = transferId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Return = apply {
            if (validated) {
                return@apply
            }

            createdAt()
            rawReturnReasonCode()
            returnReasonCode()
            traceNumber()
            transactionId()
            transferId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Return]. */
        class Builder internal constructor() {

            private var createdAt: JsonField<OffsetDateTime>? = null
            private var rawReturnReasonCode: JsonField<String>? = null
            private var returnReasonCode: JsonField<ReturnReasonCode>? = null
            private var traceNumber: JsonField<String>? = null
            private var transactionId: JsonField<String>? = null
            private var transferId: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(return_: Return) = apply {
                createdAt = return_.createdAt
                rawReturnReasonCode = return_.rawReturnReasonCode
                returnReasonCode = return_.returnReasonCode
                traceNumber = return_.traceNumber
                transactionId = return_.transactionId
                transferId = return_.transferId
                additionalProperties = return_.additionalProperties.toMutableMap()
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
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
            }

            /** The three character ACH return code, in the range R01 to R85. */
            fun rawReturnReasonCode(rawReturnReasonCode: String) =
                rawReturnReasonCode(JsonField.of(rawReturnReasonCode))

            /** The three character ACH return code, in the range R01 to R85. */
            fun rawReturnReasonCode(rawReturnReasonCode: JsonField<String>) = apply {
                this.rawReturnReasonCode = rawReturnReasonCode
            }

            /**
             * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
             * back to Increase.
             */
            fun returnReasonCode(returnReasonCode: ReturnReasonCode) =
                returnReasonCode(JsonField.of(returnReasonCode))

            /**
             * Why the ACH Transfer was returned. This reason code is sent by the receiving bank
             * back to Increase.
             */
            fun returnReasonCode(returnReasonCode: JsonField<ReturnReasonCode>) = apply {
                this.returnReasonCode = returnReasonCode
            }

            /**
             * A 15 digit number that was generated by the bank that initiated the return. The trace
             * number of the return is different than that of the original transfer. ACH trace
             * numbers are not unique, but along with the amount and date this number can be used to
             * identify the ACH return at the bank that initiated it.
             */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /**
             * A 15 digit number that was generated by the bank that initiated the return. The trace
             * number of the return is different than that of the original transfer. ACH trace
             * numbers are not unique, but along with the amount and date this number can be used to
             * identify the ACH return at the bank that initiated it.
             */
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
            }

            /** The identifier of the Transaction associated with this return. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The identifier of the Transaction associated with this return. */
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

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

            fun build(): Return =
                Return(
                    checkRequired("createdAt", createdAt),
                    checkRequired("rawReturnReasonCode", rawReturnReasonCode),
                    checkRequired("returnReasonCode", returnReasonCode),
                    checkRequired("traceNumber", traceNumber),
                    checkRequired("transactionId", transactionId),
                    checkRequired("transferId", transferId),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * Why the ACH Transfer was returned. This reason code is sent by the receiving bank back to
         * Increase.
         */
        class ReturnReasonCode
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

                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                val INSUFFICIENT_FUND = of("insufficient_fund")

                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                val NO_ACCOUNT = of("no_account")

                /** Code R02. The account is closed at the receiving bank. */
                val ACCOUNT_CLOSED = of("account_closed")

                /** Code R04. The account number is invalid at the receiving bank. */
                val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                    of("account_frozen_entry_returned_per_ofac_instruction")

                /** Code R23. The receiving bank account refused a credit transfer. */
                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                    of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                /** Code R08. The receiving bank stopped payment on this transfer. */
                val PAYMENT_STOPPED = of("payment_stopped")

                /** Code R20. The receiving bank account does not perform transfers. */
                val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                val UNCOLLECTED_FUNDS = of("uncollected_funds")

                /** Code R28. The routing number is incorrect. */
                val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

                /** Code R10. The customer at the receiving bank reversed the transfer. */
                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                /** Code R19. The amount field is incorrect or too large. */
                val AMOUNT_FIELD_ERROR = of("amount_field_error")

                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                /** Code R13. The routing number is invalid. */
                val INVALID_ACH_ROUTING_NUMBER = of("invalid_ach_routing_number")

                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                val FILE_RECORD_EDIT_CRITERIA = of("file_record_edit_criteria")

                /** Code R45. The individual name field was invalid. */
                val ENR_INVALID_INDIVIDUAL_NAME = of("enr_invalid_individual_name")

                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                val LIMITED_PARTICIPATION_DFI = of("limited_participation_dfi")

                /** Code R85. The outbound international ACH transfer was incorrect. */
                val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrectly_coded_outbound_international_payment")

                /** Code R12. A rare return reason. The account was sold to another bank. */
                val ACCOUNT_SOLD_TO_ANOTHER_DFI = of("account_sold_to_another_dfi")

                /** Code R25. The addenda record is incorrect or missing. */
                val ADDENDA_ERROR = of("addenda_error")

                /** Code R15. A rare return reason. The account holder is deceased. */
                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                    of("customer_advised_not_within_authorization_terms")

                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                val CORRECTED_RETURN = of("corrected_return")

                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                val DUPLICATE_ENTRY = of("duplicate_entry")

                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                val DUPLICATE_RETURN = of("duplicate_return")

                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_DUPLICATE_ENROLLMENT = of("enr_duplicate_enrollment")

                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_DFI_ACCOUNT_NUMBER = of("enr_invalid_dfi_account_number")

                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                    of("enr_invalid_representative_payee_indicator")

                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    of("enr_routing_number_check_digit_error")

                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                val ENTRY_NOT_PROCESSED_BY_GATEWAY = of("entry_not_processed_by_gateway")

                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                val FIELD_ERROR = of("field_error")

                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                    of("foreign_receiving_dfi_unable_to_settle")

                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                val IAT_ENTRY_CODING_ERROR = of("iat_entry_coding_error")

                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                val IMPROPER_EFFECTIVE_ENTRY_DATE = of("improper_effective_entry_date")

                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                    of("improper_source_document_source_document_presented")

                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                val INVALID_COMPANY_ID = of("invalid_company_id")

                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                    of("invalid_foreign_receiving_dfi_identification")

                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                val INVALID_INDIVIDUAL_ID_NUMBER = of("invalid_individual_id_number")

                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                    of("item_and_rck_entry_presented_for_payment")

                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                    of("item_related_to_rck_entry_is_ineligible")

                /** Code R26. A rare return reason. The ACH is missing a required field. */
                val MANDATORY_FIELD_ERROR = of("mandatory_field_error")

                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                val MISROUTED_DISHONORED_RETURN = of("misrouted_dishonored_return")

                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                val MISROUTED_RETURN = of("misrouted_return")

                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                val NO_ERRORS_FOUND = of("no_errors_found")

                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                    of("non_acceptance_of_r62_dishonored_return")

                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                val NON_PARTICIPANT_IN_IAT_PROGRAM = of("non_participant_in_iat_program")

                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                val PERMISSIBLE_RETURN_ENTRY = of("permissible_return_entry")

                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                    of("permissible_return_entry_not_accepted")

                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                val RDFI_NON_SETTLEMENT = of("rdfi_non_settlement")

                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                    of("rdfi_participant_in_check_truncation_program")

                /** Code R14. A rare return reason. The payee is deceased. */
                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                val RETURN_NOT_A_DUPLICATE = of("return_not_a_duplicate")

                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    of("return_of_erroneous_or_reversing_debit")

                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                    of("source_document_presented_for_payment")

                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                    of("stop_payment_on_item_related_to_rck_entry")

                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                val TRACE_NUMBER_ERROR = of("trace_number_error")

                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

                /** Code R68. A rare return reason. The return was sent too late. */
                val UNTIMELY_RETURN = of("untimely_return")

                fun of(value: String) = ReturnReasonCode(JsonField.of(value))
            }

            /** An enum containing [ReturnReasonCode]'s known values. */
            enum class Known {
                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                INSUFFICIENT_FUND,
                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                NO_ACCOUNT,
                /** Code R02. The account is closed at the receiving bank. */
                ACCOUNT_CLOSED,
                /** Code R04. The account number is invalid at the receiving bank. */
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                /** Code R23. The receiving bank account refused a credit transfer. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** Code R08. The receiving bank stopped payment on this transfer. */
                PAYMENT_STOPPED,
                /** Code R20. The receiving bank account does not perform transfers. */
                NON_TRANSACTION_ACCOUNT,
                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                UNCOLLECTED_FUNDS,
                /** Code R28. The routing number is incorrect. */
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /** Code R10. The customer at the receiving bank reversed the transfer. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** Code R19. The amount field is incorrect or too large. */
                AMOUNT_FIELD_ERROR,
                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** Code R13. The routing number is invalid. */
                INVALID_ACH_ROUTING_NUMBER,
                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                FILE_RECORD_EDIT_CRITERIA,
                /** Code R45. The individual name field was invalid. */
                ENR_INVALID_INDIVIDUAL_NAME,
                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                LIMITED_PARTICIPATION_DFI,
                /** Code R85. The outbound international ACH transfer was incorrect. */
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** Code R12. A rare return reason. The account was sold to another bank. */
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                /** Code R25. The addenda record is incorrect or missing. */
                ADDENDA_ERROR,
                /** Code R15. A rare return reason. The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                CORRECTED_RETURN,
                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                DUPLICATE_ENTRY,
                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                DUPLICATE_RETURN,
                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_DUPLICATE_ENROLLMENT,
                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_TRANSACTION_CODE,
                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_RETURN_OF_ENR_ENTRY,
                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                FIELD_ERROR,
                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                IAT_ENTRY_CODING_ERROR,
                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                INVALID_COMPANY_ID,
                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                /** Code R26. A rare return reason. The ACH is missing a required field. */
                MANDATORY_FIELD_ERROR,
                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                MISROUTED_DISHONORED_RETURN,
                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                MISROUTED_RETURN,
                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                NO_ERRORS_FOUND,
                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                PERMISSIBLE_RETURN_ENTRY,
                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                RDFI_NON_SETTLEMENT,
                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                /** Code R14. A rare return reason. The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                RETURN_NOT_A_DUPLICATE,
                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                RETURN_OF_XCK_ENTRY,
                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                TIMELY_ORIGINAL_RETURN,
                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                TRACE_NUMBER_ERROR,
                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                UNTIMELY_DISHONORED_RETURN,
                /** Code R68. A rare return reason. The return was sent too late. */
                UNTIMELY_RETURN,
            }

            /**
             * An enum containing [ReturnReasonCode]'s known values, as well as an [_UNKNOWN]
             * member.
             *
             * An instance of [ReturnReasonCode] can contain an unknown value in a couple of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /**
                 * Code R01. Insufficient funds in the receiving account. Sometimes abbreviated to
                 * NSF.
                 */
                INSUFFICIENT_FUND,
                /**
                 * Code R03. The account does not exist or the receiving bank was unable to locate
                 * it.
                 */
                NO_ACCOUNT,
                /** Code R02. The account is closed at the receiving bank. */
                ACCOUNT_CLOSED,
                /** Code R04. The account number is invalid at the receiving bank. */
                INVALID_ACCOUNT_NUMBER_STRUCTURE,
                /**
                 * Code R16. The account at the receiving bank was frozen per the Office of Foreign
                 * Assets Control.
                 */
                ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION,
                /** Code R23. The receiving bank account refused a credit transfer. */
                CREDIT_ENTRY_REFUSED_BY_RECEIVER,
                /**
                 * Code R05. The receiving bank rejected because of an incorrect Standard Entry
                 * Class code.
                 */
                UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE,
                /** Code R29. The corporate customer at the receiving bank reversed the transfer. */
                CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED,
                /** Code R08. The receiving bank stopped payment on this transfer. */
                PAYMENT_STOPPED,
                /** Code R20. The receiving bank account does not perform transfers. */
                NON_TRANSACTION_ACCOUNT,
                /**
                 * Code R09. The receiving bank account does not have enough available balance for
                 * the transfer.
                 */
                UNCOLLECTED_FUNDS,
                /** Code R28. The routing number is incorrect. */
                ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /** Code R10. The customer at the receiving bank reversed the transfer. */
                CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE,
                /** Code R19. The amount field is incorrect or too large. */
                AMOUNT_FIELD_ERROR,
                /**
                 * Code R07. The customer at the receiving institution informed their bank that they
                 * have revoked authorization for a previously authorized transfer.
                 */
                AUTHORIZATION_REVOKED_BY_CUSTOMER,
                /** Code R13. The routing number is invalid. */
                INVALID_ACH_ROUTING_NUMBER,
                /** Code R17. The receiving bank is unable to process a field in the transfer. */
                FILE_RECORD_EDIT_CRITERIA,
                /** Code R45. The individual name field was invalid. */
                ENR_INVALID_INDIVIDUAL_NAME,
                /**
                 * Code R06. The originating financial institution asked for this transfer to be
                 * returned. The receiving bank is complying with the request.
                 */
                RETURNED_PER_ODFI_REQUEST,
                /**
                 * Code R34. The receiving bank's regulatory supervisor has limited their
                 * participation in the ACH network.
                 */
                LIMITED_PARTICIPATION_DFI,
                /** Code R85. The outbound international ACH transfer was incorrect. */
                INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT,
                /** Code R12. A rare return reason. The account was sold to another bank. */
                ACCOUNT_SOLD_TO_ANOTHER_DFI,
                /** Code R25. The addenda record is incorrect or missing. */
                ADDENDA_ERROR,
                /** Code R15. A rare return reason. The account holder is deceased. */
                BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED,
                /**
                 * Code R11. A rare return reason. The customer authorized some payment to the
                 * sender, but this payment was not in error.
                 */
                CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS,
                /**
                 * Code R74. A rare return reason. Sent in response to a return that was returned
                 * with code `field_error`. The latest return should include the corrected field(s).
                 */
                CORRECTED_RETURN,
                /**
                 * Code R24. A rare return reason. The receiving bank received an exact duplicate
                 * entry with the same trace number and amount.
                 */
                DUPLICATE_ENTRY,
                /**
                 * Code R67. A rare return reason. The return this message refers to was a
                 * duplicate.
                 */
                DUPLICATE_RETURN,
                /**
                 * Code R47. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_DUPLICATE_ENROLLMENT,
                /**
                 * Code R43. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_DFI_ACCOUNT_NUMBER,
                /**
                 * Code R44. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R46. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR,
                /**
                 * Code R41. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_INVALID_TRANSACTION_CODE,
                /**
                 * Code R40. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_RETURN_OF_ENR_ENTRY,
                /**
                 * Code R42. A rare return reason. Only used for US Government agency non-monetary
                 * automatic enrollment messages.
                 */
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR,
                /**
                 * Code R84. A rare return reason. The International ACH Transfer cannot be
                 * processed by the gateway.
                 */
                ENTRY_NOT_PROCESSED_BY_GATEWAY,
                /**
                 * Code R69. A rare return reason. One or more of the fields in the ACH were
                 * malformed.
                 */
                FIELD_ERROR,
                /**
                 * Code R83. A rare return reason. The Foreign receiving bank was unable to settle
                 * this ACH transfer.
                 */
                FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE,
                /** Code R80. A rare return reason. The International ACH Transfer is malformed. */
                IAT_ENTRY_CODING_ERROR,
                /**
                 * Code R18. A rare return reason. The ACH has an improper effective entry date
                 * field.
                 */
                IMPROPER_EFFECTIVE_ENTRY_DATE,
                /**
                 * Code R39. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED,
                /** Code R21. A rare return reason. The Company ID field of the ACH was invalid. */
                INVALID_COMPANY_ID,
                /**
                 * Code R82. A rare return reason. The foreign receiving bank identifier for an
                 * International ACH Transfer was invalid.
                 */
                INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION,
                /**
                 * Code R22. A rare return reason. The Individual ID number field of the ACH was
                 * invalid.
                 */
                INVALID_INDIVIDUAL_ID_NUMBER,
                /**
                 * Code R53. A rare return reason. Both the Represented Check ("RCK") entry and the
                 * original check were presented to the bank.
                 */
                ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R51. A rare return reason. The Represented Check ("RCK") entry is
                 * ineligible.
                 */
                ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE,
                /** Code R26. A rare return reason. The ACH is missing a required field. */
                MANDATORY_FIELD_ERROR,
                /**
                 * Code R71. A rare return reason. The receiving bank does not recognize the routing
                 * number in a dishonored return entry.
                 */
                MISROUTED_DISHONORED_RETURN,
                /**
                 * Code R61. A rare return reason. The receiving bank does not recognize the routing
                 * number in a return entry.
                 */
                MISROUTED_RETURN,
                /**
                 * Code R76. A rare return reason. Sent in response to a return, the bank does not
                 * find the errors alleged by the returning bank.
                 */
                NO_ERRORS_FOUND,
                /**
                 * Code R77. A rare return reason. The receiving bank does not accept the return of
                 * the erroneous debit. The funds are not available at the receiving bank.
                 */
                NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN,
                /**
                 * Code R81. A rare return reason. The receiving bank does not accept International
                 * ACH Transfers.
                 */
                NON_PARTICIPANT_IN_IAT_PROGRAM,
                /**
                 * Code R31. A rare return reason. A return that has been agreed to be accepted by
                 * the receiving bank, despite falling outside of the usual return timeframe.
                 */
                PERMISSIBLE_RETURN_ENTRY,
                /**
                 * Code R70. A rare return reason. The receiving bank had not approved this return.
                 */
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED,
                /**
                 * Code R32. A rare return reason. The receiving bank could not settle this
                 * transaction.
                 */
                RDFI_NON_SETTLEMENT,
                /**
                 * Code R30. A rare return reason. The receiving bank does not accept Check
                 * Truncation ACH transfers.
                 */
                RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM,
                /** Code R14. A rare return reason. The payee is deceased. */
                REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY,
                /**
                 * Code R75. A rare return reason. The originating bank disputes that an earlier
                 * `duplicate_entry` return was actually a duplicate.
                 */
                RETURN_NOT_A_DUPLICATE,
                /**
                 * Code R62. A rare return reason. The originating financial institution made a
                 * mistake and this return corrects it.
                 */
                RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT,
                /** Code R36. A rare return reason. Return of a malformed credit entry. */
                RETURN_OF_IMPROPER_CREDIT_ENTRY,
                /** Code R35. A rare return reason. Return of a malformed debit entry. */
                RETURN_OF_IMPROPER_DEBIT_ENTRY,
                /** Code R33. A rare return reason. Return of a Destroyed Check ("XKC") entry. */
                RETURN_OF_XCK_ENTRY,
                /**
                 * Code R37. A rare return reason. The source document related to this ACH, usually
                 * an ACH check conversion, was presented to the bank.
                 */
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT,
                /**
                 * Code R50. A rare return reason. State law prevents the bank from accepting the
                 * Represented Check ("RCK") entry.
                 */
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE,
                /**
                 * Code R52. A rare return reason. A stop payment was issued on a Represented Check
                 * ("RCK") entry.
                 */
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY,
                /**
                 * Code R38. A rare return reason. The source attached to the ACH, usually an ACH
                 * check conversion, includes a stop payment.
                 */
                STOP_PAYMENT_ON_SOURCE_DOCUMENT,
                /**
                 * Code R73. A rare return reason. The bank receiving an `untimely_return` believes
                 * it was on time.
                 */
                TIMELY_ORIGINAL_RETURN,
                /**
                 * Code R27. A rare return reason. An ACH return's trace number does not match an
                 * originated ACH.
                 */
                TRACE_NUMBER_ERROR,
                /** Code R72. A rare return reason. The dishonored return was sent too late. */
                UNTIMELY_DISHONORED_RETURN,
                /** Code R68. A rare return reason. The return was sent too late. */
                UNTIMELY_RETURN,
                /**
                 * An enum member indicating that [ReturnReasonCode] was instantiated with an
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
                        Value.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Value.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Value.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Value.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Value.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Value.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Value.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Value.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Value.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Value.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Value.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Value.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Value.UNTIMELY_RETURN
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
                        Known.REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY
                    RETURN_NOT_A_DUPLICATE -> Known.RETURN_NOT_A_DUPLICATE
                    RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT ->
                        Known.RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT
                    RETURN_OF_IMPROPER_CREDIT_ENTRY -> Known.RETURN_OF_IMPROPER_CREDIT_ENTRY
                    RETURN_OF_IMPROPER_DEBIT_ENTRY -> Known.RETURN_OF_IMPROPER_DEBIT_ENTRY
                    RETURN_OF_XCK_ENTRY -> Known.RETURN_OF_XCK_ENTRY
                    SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT ->
                        Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                    STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                    STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                        Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                    STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                    TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                    TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                    UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                    UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                    else -> throw IncreaseInvalidDataException("Unknown ReturnReasonCode: $value")
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

                return /* spotless:off */ other is ReturnReasonCode && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Return && createdAt == other.createdAt && rawReturnReasonCode == other.rawReturnReasonCode && returnReasonCode == other.returnReasonCode && traceNumber == other.traceNumber && transactionId == other.transactionId && transferId == other.transferId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(createdAt, rawReturnReasonCode, returnReasonCode, traceNumber, transactionId, transferId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Return{createdAt=$createdAt, rawReturnReasonCode=$rawReturnReasonCode, returnReasonCode=$returnReasonCode, traceNumber=$traceNumber, transactionId=$transactionId, transferId=$transferId, additionalProperties=$additionalProperties}"
    }

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     */
    @NoAutoDetect
    class Settlement
    @JsonCreator
    private constructor(
        @JsonProperty("settled_at")
        @ExcludeMissing
        private val settledAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * When the funds for this transfer have settled at the destination bank at the Federal
         * Reserve.
         */
        fun settledAt(): OffsetDateTime = settledAt.getRequired("settled_at")

        /**
         * When the funds for this transfer have settled at the destination bank at the Federal
         * Reserve.
         */
        @JsonProperty("settled_at")
        @ExcludeMissing
        fun _settledAt(): JsonField<OffsetDateTime> = settledAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Settlement = apply {
            if (validated) {
                return@apply
            }

            settledAt()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Settlement]. */
        class Builder internal constructor() {

            private var settledAt: JsonField<OffsetDateTime>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(settlement: Settlement) = apply {
                settledAt = settlement.settledAt
                additionalProperties = settlement.additionalProperties.toMutableMap()
            }

            /**
             * When the funds for this transfer have settled at the destination bank at the Federal
             * Reserve.
             */
            fun settledAt(settledAt: OffsetDateTime) = settledAt(JsonField.of(settledAt))

            /**
             * When the funds for this transfer have settled at the destination bank at the Federal
             * Reserve.
             */
            fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply {
                this.settledAt = settledAt
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

            fun build(): Settlement =
                Settlement(
                    checkRequired("settledAt", settledAt),
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Settlement && settledAt == other.settledAt && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(settledAt, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Settlement{settledAt=$settledAt, additionalProperties=$additionalProperties}"
    }

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    class StandardEntryClassCode
    @JsonCreator
    private constructor(private val value: JsonField<String>) : Enum {

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

            /** Corporate Credit and Debit (CCD). */
            val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            /** Corporate Trade Exchange (CTX). */
            val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            /** Prearranged Payments and Deposits (PPD). */
            val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            /** Internet Initiated (WEB). */
            val INTERNET_INITIATED = of("internet_initiated")

            fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        /** An enum containing [StandardEntryClassCode]'s known values. */
        enum class Known {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
        }

        /**
         * An enum containing [StandardEntryClassCode]'s known values, as well as an [_UNKNOWN]
         * member.
         *
         * An instance of [StandardEntryClassCode] can contain an unknown value in a couple of
         * cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** Corporate Credit and Debit (CCD). */
            CORPORATE_CREDIT_OR_DEBIT,
            /** Corporate Trade Exchange (CTX). */
            CORPORATE_TRADE_EXCHANGE,
            /** Prearranged Payments and Deposits (PPD). */
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            /** Internet Initiated (WEB). */
            INTERNET_INITIATED,
            /**
             * An enum member indicating that [StandardEntryClassCode] was instantiated with an
             * unknown value.
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
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
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
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
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

            return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
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

            /** The transfer is pending approval. */
            val PENDING_APPROVAL = of("pending_approval")

            /** The transfer belongs to a Transfer Session that is pending confirmation. */
            val PENDING_TRANSFER_SESSION_CONFIRMATION = of("pending_transfer_session_confirmation")

            /** The transfer has been canceled. */
            val CANCELED = of("canceled")

            /** The transfer is pending submission to the Federal Reserve. */
            val PENDING_SUBMISSION = of("pending_submission")

            /** The transfer is pending review by Increase. */
            val PENDING_REVIEWING = of("pending_reviewing")

            /** The transfer requires attention from an Increase operator. */
            val REQUIRES_ATTENTION = of("requires_attention")

            /** The transfer has been rejected. */
            val REJECTED = of("rejected")

            /** The transfer is complete. */
            val SUBMITTED = of("submitted")

            /** The transfer has been returned. */
            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        /** An enum containing [Status]'s known values. */
        enum class Known {
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer belongs to a Transfer Session that is pending confirmation. */
            PENDING_TRANSFER_SESSION_CONFIRMATION,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission to the Federal Reserve. */
            PENDING_SUBMISSION,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The transfer is complete. */
            SUBMITTED,
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
            /** The transfer is pending approval. */
            PENDING_APPROVAL,
            /** The transfer belongs to a Transfer Session that is pending confirmation. */
            PENDING_TRANSFER_SESSION_CONFIRMATION,
            /** The transfer has been canceled. */
            CANCELED,
            /** The transfer is pending submission to the Federal Reserve. */
            PENDING_SUBMISSION,
            /** The transfer is pending review by Increase. */
            PENDING_REVIEWING,
            /** The transfer requires attention from an Increase operator. */
            REQUIRES_ATTENTION,
            /** The transfer has been rejected. */
            REJECTED,
            /** The transfer is complete. */
            SUBMITTED,
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
                PENDING_TRANSFER_SESSION_CONFIRMATION -> Value.PENDING_TRANSFER_SESSION_CONFIRMATION
                CANCELED -> Value.CANCELED
                PENDING_SUBMISSION -> Value.PENDING_SUBMISSION
                PENDING_REVIEWING -> Value.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Value.REQUIRES_ATTENTION
                REJECTED -> Value.REJECTED
                SUBMITTED -> Value.SUBMITTED
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
                PENDING_TRANSFER_SESSION_CONFIRMATION -> Known.PENDING_TRANSFER_SESSION_CONFIRMATION
                CANCELED -> Known.CANCELED
                PENDING_SUBMISSION -> Known.PENDING_SUBMISSION
                PENDING_REVIEWING -> Known.PENDING_REVIEWING
                REQUIRES_ATTENTION -> Known.REQUIRES_ATTENTION
                REJECTED -> Known.REJECTED
                SUBMITTED -> Known.SUBMITTED
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
     * After the transfer is submitted to FedACH, this will contain supplemental details. Increase
     * batches transfers and submits a file to the Federal Reserve roughly every 30 minutes. The
     * Federal Reserve processes ACH transfers during weekdays according to their
     * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
     */
    @NoAutoDetect
    class Submission
    @JsonCreator
    private constructor(
        @JsonProperty("effective_date")
        @ExcludeMissing
        private val effectiveDate: JsonField<LocalDate> = JsonMissing.of(),
        @JsonProperty("expected_funds_settlement_at")
        @ExcludeMissing
        private val expectedFundsSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("expected_settlement_schedule")
        @ExcludeMissing
        private val expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule> =
            JsonMissing.of(),
        @JsonProperty("submitted_at")
        @ExcludeMissing
        private val submittedAt: JsonField<OffsetDateTime> = JsonMissing.of(),
        @JsonProperty("trace_number")
        @ExcludeMissing
        private val traceNumber: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /**
         * The ACH transfer's effective date as sent to the Federal Reserve. If a specific date was
         * configured using `preferred_effective_date`, this will match that value. Otherwise, it
         * will be the date selected (following the specified settlement schedule) at the time the
         * transfer was submitted.
         */
        fun effectiveDate(): LocalDate = effectiveDate.getRequired("effective_date")

        /**
         * When the transfer is expected to settle in the recipient's account. Credits may be
         * available sooner, at the receiving banks discretion. The FedACH schedule is published
         * [here](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        fun expectedFundsSettlementAt(): OffsetDateTime =
            expectedFundsSettlementAt.getRequired("expected_funds_settlement_at")

        /**
         * The settlement schedule the transfer is expected to follow. This expectation takes into
         * account the `effective_date`, `submitted_at`, and the amount of the transfer.
         */
        fun expectedSettlementSchedule(): ExpectedSettlementSchedule =
            expectedSettlementSchedule.getRequired("expected_settlement_schedule")

        /** When the ACH transfer was sent to FedACH. */
        fun submittedAt(): OffsetDateTime = submittedAt.getRequired("submitted_at")

        /**
         * A 15 digit number recorded in the Nacha file and transmitted to the receiving bank. Along
         * with the amount, date, and originating routing number, this can be used to identify the
         * ACH transfer at the receiving bank. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        fun traceNumber(): String = traceNumber.getRequired("trace_number")

        /**
         * The ACH transfer's effective date as sent to the Federal Reserve. If a specific date was
         * configured using `preferred_effective_date`, this will match that value. Otherwise, it
         * will be the date selected (following the specified settlement schedule) at the time the
         * transfer was submitted.
         */
        @JsonProperty("effective_date")
        @ExcludeMissing
        fun _effectiveDate(): JsonField<LocalDate> = effectiveDate

        /**
         * When the transfer is expected to settle in the recipient's account. Credits may be
         * available sooner, at the receiving banks discretion. The FedACH schedule is published
         * [here](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        @JsonProperty("expected_funds_settlement_at")
        @ExcludeMissing
        fun _expectedFundsSettlementAt(): JsonField<OffsetDateTime> = expectedFundsSettlementAt

        /**
         * The settlement schedule the transfer is expected to follow. This expectation takes into
         * account the `effective_date`, `submitted_at`, and the amount of the transfer.
         */
        @JsonProperty("expected_settlement_schedule")
        @ExcludeMissing
        fun _expectedSettlementSchedule(): JsonField<ExpectedSettlementSchedule> =
            expectedSettlementSchedule

        /** When the ACH transfer was sent to FedACH. */
        @JsonProperty("submitted_at")
        @ExcludeMissing
        fun _submittedAt(): JsonField<OffsetDateTime> = submittedAt

        /**
         * A 15 digit number recorded in the Nacha file and transmitted to the receiving bank. Along
         * with the amount, date, and originating routing number, this can be used to identify the
         * ACH transfer at the receiving bank. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        @JsonProperty("trace_number")
        @ExcludeMissing
        fun _traceNumber(): JsonField<String> = traceNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Submission = apply {
            if (validated) {
                return@apply
            }

            effectiveDate()
            expectedFundsSettlementAt()
            expectedSettlementSchedule()
            submittedAt()
            traceNumber()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        /** A builder for [Submission]. */
        class Builder internal constructor() {

            private var effectiveDate: JsonField<LocalDate>? = null
            private var expectedFundsSettlementAt: JsonField<OffsetDateTime>? = null
            private var expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>? = null
            private var submittedAt: JsonField<OffsetDateTime>? = null
            private var traceNumber: JsonField<String>? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                effectiveDate = submission.effectiveDate
                expectedFundsSettlementAt = submission.expectedFundsSettlementAt
                expectedSettlementSchedule = submission.expectedSettlementSchedule
                submittedAt = submission.submittedAt
                traceNumber = submission.traceNumber
                additionalProperties = submission.additionalProperties.toMutableMap()
            }

            /**
             * The ACH transfer's effective date as sent to the Federal Reserve. If a specific date
             * was configured using `preferred_effective_date`, this will match that value.
             * Otherwise, it will be the date selected (following the specified settlement schedule)
             * at the time the transfer was submitted.
             */
            fun effectiveDate(effectiveDate: LocalDate) = effectiveDate(JsonField.of(effectiveDate))

            /**
             * The ACH transfer's effective date as sent to the Federal Reserve. If a specific date
             * was configured using `preferred_effective_date`, this will match that value.
             * Otherwise, it will be the date selected (following the specified settlement schedule)
             * at the time the transfer was submitted.
             */
            fun effectiveDate(effectiveDate: JsonField<LocalDate>) = apply {
                this.effectiveDate = effectiveDate
            }

            /**
             * When the transfer is expected to settle in the recipient's account. Credits may be
             * available sooner, at the receiving banks discretion. The FedACH schedule is published
             * [here](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
             */
            fun expectedFundsSettlementAt(expectedFundsSettlementAt: OffsetDateTime) =
                expectedFundsSettlementAt(JsonField.of(expectedFundsSettlementAt))

            /**
             * When the transfer is expected to settle in the recipient's account. Credits may be
             * available sooner, at the receiving banks discretion. The FedACH schedule is published
             * [here](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
             */
            fun expectedFundsSettlementAt(expectedFundsSettlementAt: JsonField<OffsetDateTime>) =
                apply {
                    this.expectedFundsSettlementAt = expectedFundsSettlementAt
                }

            /**
             * The settlement schedule the transfer is expected to follow. This expectation takes
             * into account the `effective_date`, `submitted_at`, and the amount of the transfer.
             */
            fun expectedSettlementSchedule(expectedSettlementSchedule: ExpectedSettlementSchedule) =
                expectedSettlementSchedule(JsonField.of(expectedSettlementSchedule))

            /**
             * The settlement schedule the transfer is expected to follow. This expectation takes
             * into account the `effective_date`, `submitted_at`, and the amount of the transfer.
             */
            fun expectedSettlementSchedule(
                expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>
            ) = apply { this.expectedSettlementSchedule = expectedSettlementSchedule }

            /** When the ACH transfer was sent to FedACH. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When the ACH transfer was sent to FedACH. */
            fun submittedAt(submittedAt: JsonField<OffsetDateTime>) = apply {
                this.submittedAt = submittedAt
            }

            /**
             * A 15 digit number recorded in the Nacha file and transmitted to the receiving bank.
             * Along with the amount, date, and originating routing number, this can be used to
             * identify the ACH transfer at the receiving bank. ACH trace numbers are not unique,
             * but are
             * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
             */
            fun traceNumber(traceNumber: String) = traceNumber(JsonField.of(traceNumber))

            /**
             * A 15 digit number recorded in the Nacha file and transmitted to the receiving bank.
             * Along with the amount, date, and originating routing number, this can be used to
             * identify the ACH transfer at the receiving bank. ACH trace numbers are not unique,
             * but are
             * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
             */
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
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

            fun build(): Submission =
                Submission(
                    checkRequired("effectiveDate", effectiveDate),
                    checkRequired("expectedFundsSettlementAt", expectedFundsSettlementAt),
                    checkRequired("expectedSettlementSchedule", expectedSettlementSchedule),
                    checkRequired("submittedAt", submittedAt),
                    checkRequired("traceNumber", traceNumber),
                    additionalProperties.toImmutable(),
                )
        }

        /**
         * The settlement schedule the transfer is expected to follow. This expectation takes into
         * account the `effective_date`, `submitted_at`, and the amount of the transfer.
         */
        class ExpectedSettlementSchedule
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

                /** The transfer is expected to settle same-day. */
                val SAME_DAY = of("same_day")

                /** The transfer is expected to settle on a future date. */
                val FUTURE_DATED = of("future_dated")

                fun of(value: String) = ExpectedSettlementSchedule(JsonField.of(value))
            }

            /** An enum containing [ExpectedSettlementSchedule]'s known values. */
            enum class Known {
                /** The transfer is expected to settle same-day. */
                SAME_DAY,
                /** The transfer is expected to settle on a future date. */
                FUTURE_DATED,
            }

            /**
             * An enum containing [ExpectedSettlementSchedule]'s known values, as well as an
             * [_UNKNOWN] member.
             *
             * An instance of [ExpectedSettlementSchedule] can contain an unknown value in a couple
             * of cases:
             * - It was deserialized from data that doesn't match any known member. For example, if
             *   the SDK is on an older version than the API, then the API may respond with new
             *   members that the SDK is unaware of.
             * - It was constructed with an arbitrary value using the [of] method.
             */
            enum class Value {
                /** The transfer is expected to settle same-day. */
                SAME_DAY,
                /** The transfer is expected to settle on a future date. */
                FUTURE_DATED,
                /**
                 * An enum member indicating that [ExpectedSettlementSchedule] was instantiated with
                 * an unknown value.
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
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
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
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown ExpectedSettlementSchedule: $value"
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

            override fun equals(other: Any?): Boolean {
                if (this === other) {
                    return true
                }

                return /* spotless:off */ other is ExpectedSettlementSchedule && value == other.value /* spotless:on */
            }

            override fun hashCode() = value.hashCode()

            override fun toString() = value.toString()
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Submission && effectiveDate == other.effectiveDate && expectedFundsSettlementAt == other.expectedFundsSettlementAt && expectedSettlementSchedule == other.expectedSettlementSchedule && submittedAt == other.submittedAt && traceNumber == other.traceNumber && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(effectiveDate, expectedFundsSettlementAt, expectedSettlementSchedule, submittedAt, traceNumber, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Submission{effectiveDate=$effectiveDate, expectedFundsSettlementAt=$expectedFundsSettlementAt, expectedSettlementSchedule=$expectedSettlementSchedule, submittedAt=$submittedAt, traceNumber=$traceNumber, additionalProperties=$additionalProperties}"
    }

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
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

            val ACH_TRANSFER = of("ach_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        /** An enum containing [Type]'s known values. */
        enum class Known {
            ACH_TRANSFER
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
            ACH_TRANSFER,
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
                ACH_TRANSFER -> Value.ACH_TRANSFER
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
                ACH_TRANSFER -> Known.ACH_TRANSFER
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransfer && id == other.id && accountId == other.accountId && accountNumber == other.accountNumber && acknowledgement == other.acknowledgement && addenda == other.addenda && amount == other.amount && approval == other.approval && cancellation == other.cancellation && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && createdAt == other.createdAt && createdBy == other.createdBy && currency == other.currency && destinationAccountHolder == other.destinationAccountHolder && externalAccountId == other.externalAccountId && funding == other.funding && idempotencyKey == other.idempotencyKey && inboundFundsHold == other.inboundFundsHold && individualId == other.individualId && individualName == other.individualName && network == other.network && notificationsOfChange == other.notificationsOfChange && pendingTransactionId == other.pendingTransactionId && preferredEffectiveDate == other.preferredEffectiveDate && return_ == other.return_ && routingNumber == other.routingNumber && settlement == other.settlement && standardEntryClassCode == other.standardEntryClassCode && statementDescriptor == other.statementDescriptor && status == other.status && submission == other.submission && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(id, accountId, accountNumber, acknowledgement, addenda, amount, approval, cancellation, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, createdAt, createdBy, currency, destinationAccountHolder, externalAccountId, funding, idempotencyKey, inboundFundsHold, individualId, individualName, network, notificationsOfChange, pendingTransactionId, preferredEffectiveDate, return_, routingNumber, settlement, standardEntryClassCode, statementDescriptor, status, submission, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AchTransfer{id=$id, accountId=$accountId, accountNumber=$accountNumber, acknowledgement=$acknowledgement, addenda=$addenda, amount=$amount, approval=$approval, cancellation=$cancellation, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, individualId=$individualId, individualName=$individualName, network=$network, notificationsOfChange=$notificationsOfChange, pendingTransactionId=$pendingTransactionId, preferredEffectiveDate=$preferredEffectiveDate, return_=$return_, routingNumber=$routingNumber, settlement=$settlement, standardEntryClassCode=$standardEntryClassCode, statementDescriptor=$statementDescriptor, status=$status, submission=$submission, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
