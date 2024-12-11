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
 * ACH transfers move funds between your Increase account and any other account accessible by the
 * Automated Clearing House (ACH).
 */
@JsonDeserialize(builder = AchTransfer.Builder::class)
@NoAutoDetect
class AchTransfer
private constructor(
    private val accountId: JsonField<String>,
    private val accountNumber: JsonField<String>,
    private val acknowledgement: JsonField<Acknowledgement>,
    private val addenda: JsonField<Addenda>,
    private val amount: JsonField<Long>,
    private val approval: JsonField<Approval>,
    private val cancellation: JsonField<Cancellation>,
    private val companyDescriptiveDate: JsonField<String>,
    private val companyDiscretionaryData: JsonField<String>,
    private val companyEntryDescription: JsonField<String>,
    private val companyName: JsonField<String>,
    private val createdAt: JsonField<OffsetDateTime>,
    private val createdBy: JsonField<CreatedBy>,
    private val currency: JsonField<Currency>,
    private val destinationAccountHolder: JsonField<DestinationAccountHolder>,
    private val externalAccountId: JsonField<String>,
    private val funding: JsonField<Funding>,
    private val id: JsonField<String>,
    private val idempotencyKey: JsonField<String>,
    private val inboundFundsHold: JsonField<InboundFundsHold>,
    private val individualId: JsonField<String>,
    private val individualName: JsonField<String>,
    private val network: JsonField<Network>,
    private val notificationsOfChange: JsonField<List<NotificationsOfChange>>,
    private val pendingTransactionId: JsonField<String>,
    private val preferredEffectiveDate: JsonField<PreferredEffectiveDate>,
    private val return_: JsonField<Return>,
    private val routingNumber: JsonField<String>,
    private val settlement: JsonField<Settlement>,
    private val standardEntryClassCode: JsonField<StandardEntryClassCode>,
    private val statementDescriptor: JsonField<String>,
    private val status: JsonField<Status>,
    private val submission: JsonField<Submission>,
    private val transactionId: JsonField<String>,
    private val type: JsonField<Type>,
    private val additionalProperties: Map<String, JsonValue>,
) {

    private var validated: Boolean = false

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

    /** The ACH transfer's identifier. */
    fun id(): String = id.getRequired("id")

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

    /** The Account to which the transfer belongs. */
    @JsonProperty("account_id") @ExcludeMissing fun _accountId() = accountId

    /** The destination account number. */
    @JsonProperty("account_number") @ExcludeMissing fun _accountNumber() = accountNumber

    /**
     * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
     * Federal Reserve sends an acknowledgement message for each file that Increase submits.
     */
    @JsonProperty("acknowledgement") @ExcludeMissing fun _acknowledgement() = acknowledgement

    /** Additional information that will be sent to the recipient. */
    @JsonProperty("addenda") @ExcludeMissing fun _addenda() = addenda

    /**
     * The transfer amount in USD cents. A positive amount indicates a credit transfer pushing funds
     * to the receiving account. A negative amount indicates a debit transfer pulling funds from the
     * receiving account.
     */
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

    /** The description of the date of the transfer. */
    @JsonProperty("company_descriptive_date")
    @ExcludeMissing
    fun _companyDescriptiveDate() = companyDescriptiveDate

    /** The data you chose to associate with the transfer. */
    @JsonProperty("company_discretionary_data")
    @ExcludeMissing
    fun _companyDiscretionaryData() = companyDiscretionaryData

    /** The description of the transfer you set to be shown to the recipient. */
    @JsonProperty("company_entry_description")
    @ExcludeMissing
    fun _companyEntryDescription() = companyEntryDescription

    /** The name by which the recipient knows you. */
    @JsonProperty("company_name") @ExcludeMissing fun _companyName() = companyName

    /**
     * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the transfer
     * was created.
     */
    @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

    /** What object created the transfer, either via the API or the dashboard. */
    @JsonProperty("created_by") @ExcludeMissing fun _createdBy() = createdBy

    /**
     * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency. For
     * ACH transfers this is always equal to `usd`.
     */
    @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    @JsonProperty("destination_account_holder")
    @ExcludeMissing
    fun _destinationAccountHolder() = destinationAccountHolder

    /** The identifier of the External Account the transfer was made to, if any. */
    @JsonProperty("external_account_id")
    @ExcludeMissing
    fun _externalAccountId() = externalAccountId

    /** The type of the account to which the transfer will be sent. */
    @JsonProperty("funding") @ExcludeMissing fun _funding() = funding

    /** The ACH transfer's identifier. */
    @JsonProperty("id") @ExcludeMissing fun _id() = id

    /**
     * The idempotency key you chose for this object. This value is unique across Increase and is
     * used to ensure that a request is only processed once. Learn more about
     * [idempotency](https://increase.com/documentation/idempotency-keys).
     */
    @JsonProperty("idempotency_key") @ExcludeMissing fun _idempotencyKey() = idempotencyKey

    /**
     * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
     * sub-object will contain details of the hold.
     */
    @JsonProperty("inbound_funds_hold") @ExcludeMissing fun _inboundFundsHold() = inboundFundsHold

    /** Your identifier for the transfer recipient. */
    @JsonProperty("individual_id") @ExcludeMissing fun _individualId() = individualId

    /**
     * The name of the transfer recipient. This value is information and not verified by the
     * recipient's bank.
     */
    @JsonProperty("individual_name") @ExcludeMissing fun _individualName() = individualName

    /** The transfer's network. */
    @JsonProperty("network") @ExcludeMissing fun _network() = network

    /**
     * If the receiving bank accepts the transfer but notifies that future transfers should use
     * different details, this will contain those details.
     */
    @JsonProperty("notifications_of_change")
    @ExcludeMissing
    fun _notificationsOfChange() = notificationsOfChange

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
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    @JsonProperty("preferred_effective_date")
    @ExcludeMissing
    fun _preferredEffectiveDate() = preferredEffectiveDate

    /** If your transfer is returned, this will contain details of the return. */
    @JsonProperty("return") @ExcludeMissing fun _return_() = return_

    /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
    @JsonProperty("routing_number") @ExcludeMissing fun _routingNumber() = routingNumber

    /**
     * A subhash containing information about when and how the transfer settled at the Federal
     * Reserve.
     */
    @JsonProperty("settlement") @ExcludeMissing fun _settlement() = settlement

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    @JsonProperty("standard_entry_class_code")
    @ExcludeMissing
    fun _standardEntryClassCode() = standardEntryClassCode

    /** The descriptor that will show on the recipient's bank statement. */
    @JsonProperty("statement_descriptor")
    @ExcludeMissing
    fun _statementDescriptor() = statementDescriptor

    /** The lifecycle status of the transfer. */
    @JsonProperty("status") @ExcludeMissing fun _status() = status

    /**
     * After the transfer is submitted to FedACH, this will contain supplemental details. Increase
     * batches transfers and submits a file to the Federal Reserve roughly every 30 minutes. The
     * Federal Reserve processes ACH transfers during weekdays according to their
     * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
     */
    @JsonProperty("submission") @ExcludeMissing fun _submission() = submission

    /** The ID for the transaction funding the transfer. */
    @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

    /**
     * A constant representing the object's type. For this resource it will always be
     * `ach_transfer`.
     */
    @JsonProperty("type") @ExcludeMissing fun _type() = type

    @JsonAnyGetter
    @ExcludeMissing
    fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

    fun validate(): AchTransfer = apply {
        if (!validated) {
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
            id()
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
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    class Builder {

        private var accountId: JsonField<String> = JsonMissing.of()
        private var accountNumber: JsonField<String> = JsonMissing.of()
        private var acknowledgement: JsonField<Acknowledgement> = JsonMissing.of()
        private var addenda: JsonField<Addenda> = JsonMissing.of()
        private var amount: JsonField<Long> = JsonMissing.of()
        private var approval: JsonField<Approval> = JsonMissing.of()
        private var cancellation: JsonField<Cancellation> = JsonMissing.of()
        private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
        private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
        private var companyEntryDescription: JsonField<String> = JsonMissing.of()
        private var companyName: JsonField<String> = JsonMissing.of()
        private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
        private var createdBy: JsonField<CreatedBy> = JsonMissing.of()
        private var currency: JsonField<Currency> = JsonMissing.of()
        private var destinationAccountHolder: JsonField<DestinationAccountHolder> = JsonMissing.of()
        private var externalAccountId: JsonField<String> = JsonMissing.of()
        private var funding: JsonField<Funding> = JsonMissing.of()
        private var id: JsonField<String> = JsonMissing.of()
        private var idempotencyKey: JsonField<String> = JsonMissing.of()
        private var inboundFundsHold: JsonField<InboundFundsHold> = JsonMissing.of()
        private var individualId: JsonField<String> = JsonMissing.of()
        private var individualName: JsonField<String> = JsonMissing.of()
        private var network: JsonField<Network> = JsonMissing.of()
        private var notificationsOfChange: JsonField<List<NotificationsOfChange>> = JsonMissing.of()
        private var pendingTransactionId: JsonField<String> = JsonMissing.of()
        private var preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of()
        private var return_: JsonField<Return> = JsonMissing.of()
        private var routingNumber: JsonField<String> = JsonMissing.of()
        private var settlement: JsonField<Settlement> = JsonMissing.of()
        private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
        private var statementDescriptor: JsonField<String> = JsonMissing.of()
        private var status: JsonField<Status> = JsonMissing.of()
        private var submission: JsonField<Submission> = JsonMissing.of()
        private var transactionId: JsonField<String> = JsonMissing.of()
        private var type: JsonField<Type> = JsonMissing.of()
        private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(achTransfer: AchTransfer) = apply {
            this.accountId = achTransfer.accountId
            this.accountNumber = achTransfer.accountNumber
            this.acknowledgement = achTransfer.acknowledgement
            this.addenda = achTransfer.addenda
            this.amount = achTransfer.amount
            this.approval = achTransfer.approval
            this.cancellation = achTransfer.cancellation
            this.companyDescriptiveDate = achTransfer.companyDescriptiveDate
            this.companyDiscretionaryData = achTransfer.companyDiscretionaryData
            this.companyEntryDescription = achTransfer.companyEntryDescription
            this.companyName = achTransfer.companyName
            this.createdAt = achTransfer.createdAt
            this.createdBy = achTransfer.createdBy
            this.currency = achTransfer.currency
            this.destinationAccountHolder = achTransfer.destinationAccountHolder
            this.externalAccountId = achTransfer.externalAccountId
            this.funding = achTransfer.funding
            this.id = achTransfer.id
            this.idempotencyKey = achTransfer.idempotencyKey
            this.inboundFundsHold = achTransfer.inboundFundsHold
            this.individualId = achTransfer.individualId
            this.individualName = achTransfer.individualName
            this.network = achTransfer.network
            this.notificationsOfChange = achTransfer.notificationsOfChange
            this.pendingTransactionId = achTransfer.pendingTransactionId
            this.preferredEffectiveDate = achTransfer.preferredEffectiveDate
            this.return_ = achTransfer.return_
            this.routingNumber = achTransfer.routingNumber
            this.settlement = achTransfer.settlement
            this.standardEntryClassCode = achTransfer.standardEntryClassCode
            this.statementDescriptor = achTransfer.statementDescriptor
            this.status = achTransfer.status
            this.submission = achTransfer.submission
            this.transactionId = achTransfer.transactionId
            this.type = achTransfer.type
            additionalProperties(achTransfer.additionalProperties)
        }

        /** The Account to which the transfer belongs. */
        fun accountId(accountId: String) = accountId(JsonField.of(accountId))

        /** The Account to which the transfer belongs. */
        @JsonProperty("account_id")
        @ExcludeMissing
        fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

        /** The destination account number. */
        fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

        /** The destination account number. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            this.accountNumber = accountNumber
        }

        /**
         * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
         * Federal Reserve sends an acknowledgement message for each file that Increase submits.
         */
        fun acknowledgement(acknowledgement: Acknowledgement) =
            acknowledgement(JsonField.of(acknowledgement))

        /**
         * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
         * Federal Reserve sends an acknowledgement message for each file that Increase submits.
         */
        @JsonProperty("acknowledgement")
        @ExcludeMissing
        fun acknowledgement(acknowledgement: JsonField<Acknowledgement>) = apply {
            this.acknowledgement = acknowledgement
        }

        /** Additional information that will be sent to the recipient. */
        fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

        /** Additional information that will be sent to the recipient. */
        @JsonProperty("addenda")
        @ExcludeMissing
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

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) =
            companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** The data you chose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) =
            companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

        /** The data you chose to associate with the transfer. */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer you set to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: String) =
            companyEntryDescription(JsonField.of(companyEntryDescription))

        /** The description of the transfer you set to be shown to the recipient. */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String) = companyName(JsonField.of(companyName))

        /** The name by which the recipient knows you. */
        @JsonProperty("company_name")
        @ExcludeMissing
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
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For ACH transfers this is always equal to `usd`.
         */
        fun currency(currency: Currency) = currency(JsonField.of(currency))

        /**
         * The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the transfer's currency.
         * For ACH transfers this is always equal to `usd`.
         */
        @JsonProperty("currency")
        @ExcludeMissing
        fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
            destinationAccountHolder(JsonField.of(destinationAccountHolder))

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        @JsonProperty("destination_account_holder")
        @ExcludeMissing
        fun destinationAccountHolder(
            destinationAccountHolder: JsonField<DestinationAccountHolder>
        ) = apply { this.destinationAccountHolder = destinationAccountHolder }

        /** The identifier of the External Account the transfer was made to, if any. */
        fun externalAccountId(externalAccountId: String) =
            externalAccountId(JsonField.of(externalAccountId))

        /** The identifier of the External Account the transfer was made to, if any. */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            this.externalAccountId = externalAccountId
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = funding(JsonField.of(funding))

        /** The type of the account to which the transfer will be sent. */
        @JsonProperty("funding")
        @ExcludeMissing
        fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

        /** The ACH transfer's identifier. */
        fun id(id: String) = id(JsonField.of(id))

        /** The ACH transfer's identifier. */
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
         * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
         * sub-object will contain details of the hold.
         */
        fun inboundFundsHold(inboundFundsHold: InboundFundsHold) =
            inboundFundsHold(JsonField.of(inboundFundsHold))

        /**
         * Increase will sometimes hold the funds for ACH debit transfers. If funds are held, this
         * sub-object will contain details of the hold.
         */
        @JsonProperty("inbound_funds_hold")
        @ExcludeMissing
        fun inboundFundsHold(inboundFundsHold: JsonField<InboundFundsHold>) = apply {
            this.inboundFundsHold = inboundFundsHold
        }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = individualId(JsonField.of(individualId))

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun individualId(individualId: JsonField<String>) = apply {
            this.individualId = individualId
        }

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = individualName(JsonField.of(individualName))

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name")
        @ExcludeMissing
        fun individualName(individualName: JsonField<String>) = apply {
            this.individualName = individualName
        }

        /** The transfer's network. */
        fun network(network: Network) = network(JsonField.of(network))

        /** The transfer's network. */
        @JsonProperty("network")
        @ExcludeMissing
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
        @JsonProperty("notifications_of_change")
        @ExcludeMissing
        fun notificationsOfChange(notificationsOfChange: JsonField<List<NotificationsOfChange>>) =
            apply {
                this.notificationsOfChange = notificationsOfChange
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
        @JsonProperty("preferred_effective_date")
        @ExcludeMissing
        fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
            apply {
                this.preferredEffectiveDate = preferredEffectiveDate
            }

        /** If your transfer is returned, this will contain details of the return. */
        fun return_(return_: Return) = return_(JsonField.of(return_))

        /** If your transfer is returned, this will contain details of the return. */
        @JsonProperty("return")
        @ExcludeMissing
        fun return_(return_: JsonField<Return>) = apply { this.return_ = return_ }

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

        /** The American Bankers' Association (ABA) Routing Transit Number (RTN). */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            this.routingNumber = routingNumber
        }

        /**
         * A subhash containing information about when and how the transfer settled at the Federal
         * Reserve.
         */
        fun settlement(settlement: Settlement) = settlement(JsonField.of(settlement))

        /**
         * A subhash containing information about when and how the transfer settled at the Federal
         * Reserve.
         */
        @JsonProperty("settlement")
        @ExcludeMissing
        fun settlement(settlement: JsonField<Settlement>) = apply { this.settlement = settlement }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
            standardEntryClassCode(JsonField.of(standardEntryClassCode))

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                this.standardEntryClassCode = standardEntryClassCode
            }

        /** The descriptor that will show on the recipient's bank statement. */
        fun statementDescriptor(statementDescriptor: String) =
            statementDescriptor(JsonField.of(statementDescriptor))

        /** The descriptor that will show on the recipient's bank statement. */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            this.statementDescriptor = statementDescriptor
        }

        /** The lifecycle status of the transfer. */
        fun status(status: Status) = status(JsonField.of(status))

        /** The lifecycle status of the transfer. */
        @JsonProperty("status")
        @ExcludeMissing
        fun status(status: JsonField<Status>) = apply { this.status = status }

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental details.
         * Increase batches transfers and submits a file to the Federal Reserve roughly every 30
         * minutes. The Federal Reserve processes ACH transfers during weekdays according to their
         * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        fun submission(submission: Submission) = submission(JsonField.of(submission))

        /**
         * After the transfer is submitted to FedACH, this will contain supplemental details.
         * Increase batches transfers and submits a file to the Federal Reserve roughly every 30
         * minutes. The Federal Reserve processes ACH transfers during weekdays according to their
         * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        @JsonProperty("submission")
        @ExcludeMissing
        fun submission(submission: JsonField<Submission>) = apply { this.submission = submission }

        /** The ID for the transaction funding the transfer. */
        fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

        /** The ID for the transaction funding the transfer. */
        @JsonProperty("transaction_id")
        @ExcludeMissing
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

        fun build(): AchTransfer =
            AchTransfer(
                accountId,
                accountNumber,
                acknowledgement,
                addenda,
                amount,
                approval,
                cancellation,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                createdAt,
                createdBy,
                currency,
                destinationAccountHolder,
                externalAccountId,
                funding,
                id,
                idempotencyKey,
                inboundFundsHold,
                individualId,
                individualName,
                network,
                notificationsOfChange.map { it.toImmutable() },
                pendingTransactionId,
                preferredEffectiveDate,
                return_,
                routingNumber,
                settlement,
                standardEntryClassCode,
                statementDescriptor,
                status,
                submission,
                transactionId,
                type,
                additionalProperties.toImmutable(),
            )
    }

    /**
     * After the transfer is acknowledged by FedACH, this will contain supplemental details. The
     * Federal Reserve sends an acknowledgement message for each file that Increase submits.
     */
    @JsonDeserialize(builder = Acknowledgement.Builder::class)
    @NoAutoDetect
    class Acknowledgement
    private constructor(
        private val acknowledgedAt: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /** When the Federal Reserve acknowledged the submitted file containing this transfer. */
        fun acknowledgedAt(): String = acknowledgedAt.getRequired("acknowledged_at")

        /** When the Federal Reserve acknowledged the submitted file containing this transfer. */
        @JsonProperty("acknowledged_at") @ExcludeMissing fun _acknowledgedAt() = acknowledgedAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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

            private var acknowledgedAt: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(acknowledgement: Acknowledgement) = apply {
                this.acknowledgedAt = acknowledgement.acknowledgedAt
                additionalProperties(acknowledgement.additionalProperties)
            }

            /**
             * When the Federal Reserve acknowledged the submitted file containing this transfer.
             */
            fun acknowledgedAt(acknowledgedAt: String) =
                acknowledgedAt(JsonField.of(acknowledgedAt))

            /**
             * When the Federal Reserve acknowledged the submitted file containing this transfer.
             */
            @JsonProperty("acknowledged_at")
            @ExcludeMissing
            fun acknowledgedAt(acknowledgedAt: JsonField<String>) = apply {
                this.acknowledgedAt = acknowledgedAt
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

    /** Additional information that will be sent to the recipient. */
    @JsonDeserialize(builder = Addenda.Builder::class)
    @NoAutoDetect
    class Addenda
    private constructor(
        private val category: JsonField<Category>,
        private val freeform: JsonField<Freeform>,
        private val paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("category") @ExcludeMissing fun _category() = category

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonProperty("freeform") @ExcludeMissing fun _freeform() = freeform

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        @JsonProperty("payment_order_remittance_advice")
        @ExcludeMissing
        fun _paymentOrderRemittanceAdvice() = paymentOrderRemittanceAdvice

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Addenda = apply {
            if (!validated) {
                category()
                freeform()?.validate()
                paymentOrderRemittanceAdvice()?.validate()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var category: JsonField<Category> = JsonMissing.of()
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) = apply {
                this.category = addenda.category
                this.freeform = addenda.freeform
                this.paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties(addenda.additionalProperties)
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

            /** Unstructured `payment_related_information` passed through with the transfer. */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /** Unstructured `payment_related_information` passed through with the transfer. */
            @JsonProperty("freeform")
            @ExcludeMissing
            fun freeform(freeform: JsonField<Freeform>) = apply { this.freeform = freeform }

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice
            ) = paymentOrderRemittanceAdvice(JsonField.of(paymentOrderRemittanceAdvice))

            /**
             * Structured ASC X12 820 remittance advice records. Please reach out to
             * [support@increase.com](mailto:support@increase.com) for more information.
             */
            @JsonProperty("payment_order_remittance_advice")
            @ExcludeMissing
            fun paymentOrderRemittanceAdvice(
                paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice>
            ) = apply { this.paymentOrderRemittanceAdvice = paymentOrderRemittanceAdvice }

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

            fun build(): Addenda =
                Addenda(
                    category,
                    freeform,
                    paymentOrderRemittanceAdvice,
                    additionalProperties.toImmutable(),
                )
        }

        class Category
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val FREEFORM = of("freeform")

                val PAYMENT_ORDER_REMITTANCE_ADVICE = of("payment_order_remittance_advice")

                val OTHER = of("other")

                fun of(value: String) = Category(JsonField.of(value))
            }

            enum class Known {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                OTHER,
            }

            enum class Value {
                FREEFORM,
                PAYMENT_ORDER_REMITTANCE_ADVICE,
                OTHER,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    FREEFORM -> Value.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Value.PAYMENT_ORDER_REMITTANCE_ADVICE
                    OTHER -> Value.OTHER
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    FREEFORM -> Known.FREEFORM
                    PAYMENT_ORDER_REMITTANCE_ADVICE -> Known.PAYMENT_ORDER_REMITTANCE_ADVICE
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

        /** Unstructured `payment_related_information` passed through with the transfer. */
        @JsonDeserialize(builder = Freeform.Builder::class)
        @NoAutoDetect
        class Freeform
        private constructor(
            private val entries: JsonField<List<Entry>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** Each entry represents an addendum sent with the transfer. */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /** Each entry represents an addendum sent with the transfer. */
            @JsonProperty("entries") @ExcludeMissing fun _entries() = entries

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): Freeform = apply {
                if (!validated) {
                    entries().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var entries: JsonField<List<Entry>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(freeform: Freeform) = apply {
                    this.entries = freeform.entries
                    additionalProperties(freeform.additionalProperties)
                }

                /** Each entry represents an addendum sent with the transfer. */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /** Each entry represents an addendum sent with the transfer. */
                @JsonProperty("entries")
                @ExcludeMissing
                fun entries(entries: JsonField<List<Entry>>) = apply { this.entries = entries }

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

                fun build(): Freeform =
                    Freeform(entries.map { it.toImmutable() }, additionalProperties.toImmutable())
            }

            @JsonDeserialize(builder = Entry.Builder::class)
            @NoAutoDetect
            class Entry
            private constructor(
                private val paymentRelatedInformation: JsonField<String>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

                /** The payment related information passed in the addendum. */
                fun paymentRelatedInformation(): String =
                    paymentRelatedInformation.getRequired("payment_related_information")

                /** The payment related information passed in the addendum. */
                @JsonProperty("payment_related_information")
                @ExcludeMissing
                fun _paymentRelatedInformation() = paymentRelatedInformation

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Entry = apply {
                    if (!validated) {
                        paymentRelatedInformation()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var paymentRelatedInformation: JsonField<String> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(entry: Entry) = apply {
                        this.paymentRelatedInformation = entry.paymentRelatedInformation
                        additionalProperties(entry.additionalProperties)
                    }

                    /** The payment related information passed in the addendum. */
                    fun paymentRelatedInformation(paymentRelatedInformation: String) =
                        paymentRelatedInformation(JsonField.of(paymentRelatedInformation))

                    /** The payment related information passed in the addendum. */
                    @JsonProperty("payment_related_information")
                    @ExcludeMissing
                    fun paymentRelatedInformation(paymentRelatedInformation: JsonField<String>) =
                        apply {
                            this.paymentRelatedInformation = paymentRelatedInformation
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

                    fun build(): Entry =
                        Entry(paymentRelatedInformation, additionalProperties.toImmutable())
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
        @JsonDeserialize(builder = PaymentOrderRemittanceAdvice.Builder::class)
        @NoAutoDetect
        class PaymentOrderRemittanceAdvice
        private constructor(
            private val invoices: JsonField<List<Invoice>>,
            private val additionalProperties: Map<String, JsonValue>,
        ) {

            private var validated: Boolean = false

            /** ASC X12 RMR records for this specific transfer. */
            fun invoices(): List<Invoice> = invoices.getRequired("invoices")

            /** ASC X12 RMR records for this specific transfer. */
            @JsonProperty("invoices") @ExcludeMissing fun _invoices() = invoices

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

            fun validate(): PaymentOrderRemittanceAdvice = apply {
                if (!validated) {
                    invoices().forEach { it.validate() }
                    validated = true
                }
            }

            fun toBuilder() = Builder().from(this)

            companion object {

                fun builder() = Builder()
            }

            class Builder {

                private var invoices: JsonField<List<Invoice>> = JsonMissing.of()
                private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                internal fun from(paymentOrderRemittanceAdvice: PaymentOrderRemittanceAdvice) =
                    apply {
                        this.invoices = paymentOrderRemittanceAdvice.invoices
                        additionalProperties(paymentOrderRemittanceAdvice.additionalProperties)
                    }

                /** ASC X12 RMR records for this specific transfer. */
                fun invoices(invoices: List<Invoice>) = invoices(JsonField.of(invoices))

                /** ASC X12 RMR records for this specific transfer. */
                @JsonProperty("invoices")
                @ExcludeMissing
                fun invoices(invoices: JsonField<List<Invoice>>) = apply {
                    this.invoices = invoices
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

                fun build(): PaymentOrderRemittanceAdvice =
                    PaymentOrderRemittanceAdvice(
                        invoices.map { it.toImmutable() },
                        additionalProperties.toImmutable()
                    )
            }

            @JsonDeserialize(builder = Invoice.Builder::class)
            @NoAutoDetect
            class Invoice
            private constructor(
                private val invoiceNumber: JsonField<String>,
                private val paidAmount: JsonField<Long>,
                private val additionalProperties: Map<String, JsonValue>,
            ) {

                private var validated: Boolean = false

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
                @JsonProperty("invoice_number") @ExcludeMissing fun _invoiceNumber() = invoiceNumber

                /**
                 * The amount that was paid for this invoice in the minor unit of its currency. For
                 * dollars, for example, this is cents.
                 */
                @JsonProperty("paid_amount") @ExcludeMissing fun _paidAmount() = paidAmount

                @JsonAnyGetter
                @ExcludeMissing
                fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

                fun validate(): Invoice = apply {
                    if (!validated) {
                        invoiceNumber()
                        paidAmount()
                        validated = true
                    }
                }

                fun toBuilder() = Builder().from(this)

                companion object {

                    fun builder() = Builder()
                }

                class Builder {

                    private var invoiceNumber: JsonField<String> = JsonMissing.of()
                    private var paidAmount: JsonField<Long> = JsonMissing.of()
                    private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

                    internal fun from(invoice: Invoice) = apply {
                        this.invoiceNumber = invoice.invoiceNumber
                        this.paidAmount = invoice.paidAmount
                        additionalProperties(invoice.additionalProperties)
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
                    @JsonProperty("invoice_number")
                    @ExcludeMissing
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
                    @JsonProperty("paid_amount")
                    @ExcludeMissing
                    fun paidAmount(paidAmount: JsonField<Long>) = apply {
                        this.paidAmount = paidAmount
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

                    fun build(): Invoice =
                        Invoice(
                            invoiceNumber,
                            paidAmount,
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
    @JsonDeserialize(builder = Approval.Builder::class)
    @NoAutoDetect
    class Approval
    private constructor(
        private val approvedAt: JsonField<OffsetDateTime>,
        private val approvedBy: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        private var validated: Boolean = false

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

        private var validated: Boolean = false

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
                this.apiKey = createdBy.apiKey
                this.category = createdBy.category
                this.oauthApplication = createdBy.oauthApplication
                this.user = createdBy.user
                additionalProperties(createdBy.additionalProperties)
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
                this.additionalProperties.putAll(additionalProperties)
            }

            @JsonAnySetter
            fun putAdditionalProperty(key: String, value: JsonValue) = apply {
                this.additionalProperties.put(key, value)
            }

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
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

            private var validated: Boolean = false

            /** The description set for the API key when it was created. */
            fun description(): String? = description.getNullable("description")

            /** The description set for the API key when it was created. */
            @JsonProperty("description") @ExcludeMissing fun _description() = description

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.description = apiKey.description
                    additionalProperties(apiKey.additionalProperties)
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

            private var validated: Boolean = false

            /** The name of the OAuth Application. */
            fun name(): String = name.getRequired("name")

            /** The name of the OAuth Application. */
            @JsonProperty("name") @ExcludeMissing fun _name() = name

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.name = oauthApplication.name
                    additionalProperties(oauthApplication.additionalProperties)
                }

                /** The name of the OAuth Application. */
                fun name(name: String) = name(JsonField.of(name))

                /** The name of the OAuth Application. */
                @JsonProperty("name")
                @ExcludeMissing
                fun name(name: JsonField<String>) = apply { this.name = name }

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

            private var validated: Boolean = false

            /** The email address of the User. */
            fun email(): String = email.getRequired("email")

            /** The email address of the User. */
            @JsonProperty("email") @ExcludeMissing fun _email() = email

            @JsonAnyGetter
            @ExcludeMissing
            fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

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
                    this.email = user.email
                    additionalProperties(user.additionalProperties)
                }

                /** The email address of the User. */
                fun email(email: String) = email(JsonField.of(email))

                /** The email address of the User. */
                @JsonProperty("email")
                @ExcludeMissing
                fun email(email: JsonField<String>) = apply { this.email = email }

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

    class DestinationAccountHolder
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val BUSINESS = of("business")

            val INDIVIDUAL = of("individual")

            val UNKNOWN = of("unknown")

            fun of(value: String) = DestinationAccountHolder(JsonField.of(value))
        }

        enum class Known {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
        }

        enum class Value {
            BUSINESS,
            INDIVIDUAL,
            UNKNOWN,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                BUSINESS -> Value.BUSINESS
                INDIVIDUAL -> Value.INDIVIDUAL
                UNKNOWN -> Value.UNKNOWN
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                BUSINESS -> Known.BUSINESS
                INDIVIDUAL -> Known.INDIVIDUAL
                UNKNOWN -> Known.UNKNOWN
                else ->
                    throw IncreaseInvalidDataException("Unknown DestinationAccountHolder: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is DestinationAccountHolder && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    class Funding
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CHECKING = of("checking")

            val SAVINGS = of("savings")

            fun of(value: String) = Funding(JsonField.of(value))
        }

        enum class Known {
            CHECKING,
            SAVINGS,
        }

        enum class Value {
            CHECKING,
            SAVINGS,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CHECKING -> Value.CHECKING
                SAVINGS -> Value.SAVINGS
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CHECKING -> Known.CHECKING
                SAVINGS -> Known.SAVINGS
                else -> throw IncreaseInvalidDataException("Unknown Funding: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

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
    @JsonDeserialize(builder = InboundFundsHold.Builder::class)
    @NoAutoDetect
    class InboundFundsHold
    private constructor(
        private val amount: JsonField<Long>,
        private val automaticallyReleasesAt: JsonField<OffsetDateTime>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val currency: JsonField<Currency>,
        private val heldTransactionId: JsonField<String>,
        private val id: JsonField<String>,
        private val pendingTransactionId: JsonField<String>,
        private val releasedAt: JsonField<OffsetDateTime>,
        private val status: JsonField<Status>,
        private val type: JsonField<Type>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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

        /** The Inbound Funds Hold identifier. */
        fun id(): String = id.getRequired("id")

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

        /**
         * The held amount in the minor unit of the account's currency. For dollars, for example,
         * this is cents.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount() = amount

        /**
         * When the hold will be released automatically. Certain conditions may cause it to be
         * released before this time.
         */
        @JsonProperty("automatically_releases_at")
        @ExcludeMissing
        fun _automaticallyReleasesAt() = automaticallyReleasesAt

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) time at which the hold was
         * created.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** The [ISO 4217](https://en.wikipedia.org/wiki/ISO_4217) code for the hold's currency. */
        @JsonProperty("currency") @ExcludeMissing fun _currency() = currency

        /** The ID of the Transaction for which funds were held. */
        @JsonProperty("held_transaction_id")
        @ExcludeMissing
        fun _heldTransactionId() = heldTransactionId

        /** The Inbound Funds Hold identifier. */
        @JsonProperty("id") @ExcludeMissing fun _id() = id

        /** The ID of the Pending Transaction representing the held funds. */
        @JsonProperty("pending_transaction_id")
        @ExcludeMissing
        fun _pendingTransactionId() = pendingTransactionId

        /** When the hold was released (if it has been released). */
        @JsonProperty("released_at") @ExcludeMissing fun _releasedAt() = releasedAt

        /** The status of the hold. */
        @JsonProperty("status") @ExcludeMissing fun _status() = status

        /**
         * A constant representing the object's type. For this resource it will always be
         * `inbound_funds_hold`.
         */
        @JsonProperty("type") @ExcludeMissing fun _type() = type

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): InboundFundsHold = apply {
            if (!validated) {
                amount()
                automaticallyReleasesAt()
                createdAt()
                currency()
                heldTransactionId()
                id()
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

            private var amount: JsonField<Long> = JsonMissing.of()
            private var automaticallyReleasesAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var currency: JsonField<Currency> = JsonMissing.of()
            private var heldTransactionId: JsonField<String> = JsonMissing.of()
            private var id: JsonField<String> = JsonMissing.of()
            private var pendingTransactionId: JsonField<String> = JsonMissing.of()
            private var releasedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var status: JsonField<Status> = JsonMissing.of()
            private var type: JsonField<Type> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(inboundFundsHold: InboundFundsHold) = apply {
                this.amount = inboundFundsHold.amount
                this.automaticallyReleasesAt = inboundFundsHold.automaticallyReleasesAt
                this.createdAt = inboundFundsHold.createdAt
                this.currency = inboundFundsHold.currency
                this.heldTransactionId = inboundFundsHold.heldTransactionId
                this.id = inboundFundsHold.id
                this.pendingTransactionId = inboundFundsHold.pendingTransactionId
                this.releasedAt = inboundFundsHold.releasedAt
                this.status = inboundFundsHold.status
                this.type = inboundFundsHold.type
                additionalProperties(inboundFundsHold.additionalProperties)
            }

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The held amount in the minor unit of the account's currency. For dollars, for
             * example, this is cents.
             */
            @JsonProperty("amount")
            @ExcludeMissing
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
            @JsonProperty("automatically_releases_at")
            @ExcludeMissing
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
            @JsonProperty("created_at")
            @ExcludeMissing
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
            @JsonProperty("currency")
            @ExcludeMissing
            fun currency(currency: JsonField<Currency>) = apply { this.currency = currency }

            /** The ID of the Transaction for which funds were held. */
            fun heldTransactionId(heldTransactionId: String) =
                heldTransactionId(JsonField.of(heldTransactionId))

            /** The ID of the Transaction for which funds were held. */
            @JsonProperty("held_transaction_id")
            @ExcludeMissing
            fun heldTransactionId(heldTransactionId: JsonField<String>) = apply {
                this.heldTransactionId = heldTransactionId
            }

            /** The Inbound Funds Hold identifier. */
            fun id(id: String) = id(JsonField.of(id))

            /** The Inbound Funds Hold identifier. */
            @JsonProperty("id")
            @ExcludeMissing
            fun id(id: JsonField<String>) = apply { this.id = id }

            /** The ID of the Pending Transaction representing the held funds. */
            fun pendingTransactionId(pendingTransactionId: String) =
                pendingTransactionId(JsonField.of(pendingTransactionId))

            /** The ID of the Pending Transaction representing the held funds. */
            @JsonProperty("pending_transaction_id")
            @ExcludeMissing
            fun pendingTransactionId(pendingTransactionId: JsonField<String>) = apply {
                this.pendingTransactionId = pendingTransactionId
            }

            /** When the hold was released (if it has been released). */
            fun releasedAt(releasedAt: OffsetDateTime) = releasedAt(JsonField.of(releasedAt))

            /** When the hold was released (if it has been released). */
            @JsonProperty("released_at")
            @ExcludeMissing
            fun releasedAt(releasedAt: JsonField<OffsetDateTime>) = apply {
                this.releasedAt = releasedAt
            }

            /** The status of the hold. */
            fun status(status: Status) = status(JsonField.of(status))

            /** The status of the hold. */
            @JsonProperty("status")
            @ExcludeMissing
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

            fun build(): InboundFundsHold =
                InboundFundsHold(
                    amount,
                    automaticallyReleasesAt,
                    createdAt,
                    currency,
                    heldTransactionId,
                    id,
                    pendingTransactionId,
                    releasedAt,
                    status,
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

            return /* spotless:off */ other is InboundFundsHold && amount == other.amount && automaticallyReleasesAt == other.automaticallyReleasesAt && createdAt == other.createdAt && currency == other.currency && heldTransactionId == other.heldTransactionId && id == other.id && pendingTransactionId == other.pendingTransactionId && releasedAt == other.releasedAt && status == other.status && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(amount, automaticallyReleasesAt, createdAt, currency, heldTransactionId, id, pendingTransactionId, releasedAt, status, type, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "InboundFundsHold{amount=$amount, automaticallyReleasesAt=$automaticallyReleasesAt, createdAt=$createdAt, currency=$currency, heldTransactionId=$heldTransactionId, id=$id, pendingTransactionId=$pendingTransactionId, releasedAt=$releasedAt, status=$status, type=$type, additionalProperties=$additionalProperties}"
    }

    class Network
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH = of("ach")

            fun of(value: String) = Network(JsonField.of(value))
        }

        enum class Known {
            ACH,
        }

        enum class Value {
            ACH,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH -> Value.ACH
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH -> Known.ACH
                else -> throw IncreaseInvalidDataException("Unknown Network: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Network && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    @JsonDeserialize(builder = NotificationsOfChange.Builder::class)
    @NoAutoDetect
    class NotificationsOfChange
    private constructor(
        private val changeCode: JsonField<ChangeCode>,
        private val correctedData: JsonField<String>,
        private val createdAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("change_code") @ExcludeMissing fun _changeCode() = changeCode

        /**
         * The corrected data that should be used in future ACHs to this account. This may contain
         * the suggested new account number or routing number. When the `change_code` is
         * `incorrect_transaction_code`, this field contains an integer. Numbers starting with a 2
         * encourage changing the `funding` parameter to checking; numbers starting with a 3
         * encourage changing to savings.
         */
        @JsonProperty("corrected_data") @ExcludeMissing fun _correctedData() = correctedData

        /**
         * The [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) date and time at which the
         * notification occurred.
         */
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): NotificationsOfChange = apply {
            if (!validated) {
                changeCode()
                correctedData()
                createdAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var changeCode: JsonField<ChangeCode> = JsonMissing.of()
            private var correctedData: JsonField<String> = JsonMissing.of()
            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(notificationsOfChange: NotificationsOfChange) = apply {
                this.changeCode = notificationsOfChange.changeCode
                this.correctedData = notificationsOfChange.correctedData
                this.createdAt = notificationsOfChange.createdAt
                additionalProperties(notificationsOfChange.additionalProperties)
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
            @JsonProperty("change_code")
            @ExcludeMissing
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
            @JsonProperty("corrected_data")
            @ExcludeMissing
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
            @JsonProperty("created_at")
            @ExcludeMissing
            fun createdAt(createdAt: JsonField<OffsetDateTime>) = apply {
                this.createdAt = createdAt
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

            fun build(): NotificationsOfChange =
                NotificationsOfChange(
                    changeCode,
                    correctedData,
                    createdAt,
                    additionalProperties.toImmutable(),
                )
        }

        class ChangeCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INCORRECT_ACCOUNT_NUMBER = of("incorrect_account_number")

                val INCORRECT_ROUTING_NUMBER = of("incorrect_routing_number")

                val INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER =
                    of("incorrect_routing_number_and_account_number")

                val INCORRECT_TRANSACTION_CODE = of("incorrect_transaction_code")

                val INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_account_number_and_transaction_code")

                val INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE =
                    of("incorrect_routing_number_account_number_and_transaction_code")

                val INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION =
                    of("incorrect_receiving_depository_financial_institution_identification")

                val INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER =
                    of("incorrect_individual_identification_number")

                val ADDENDA_FORMAT_ERROR = of("addenda_format_error")

                val INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrect_standard_entry_class_code_for_outbound_international_payment")

                val MISROUTED_NOTIFICATION_OF_CHANGE = of("misrouted_notification_of_change")

                val INCORRECT_TRACE_NUMBER = of("incorrect_trace_number")

                val INCORRECT_COMPANY_IDENTIFICATION_NUMBER =
                    of("incorrect_company_identification_number")

                val INCORRECT_IDENTIFICATION_NUMBER = of("incorrect_identification_number")

                val INCORRECTLY_FORMATTED_CORRECTED_DATA =
                    of("incorrectly_formatted_corrected_data")

                val INCORRECT_DISCRETIONARY_DATA = of("incorrect_discretionary_data")

                val ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of("routing_number_not_from_original_entry_detail_record")

                val DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD =
                    of(
                        "depository_financial_institution_account_number_not_from_original_entry_detail_record"
                    )

                val INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION =
                    of("incorrect_transaction_code_by_originating_depository_financial_institution")

                fun of(value: String) = ChangeCode(JsonField.of(value))
            }

            enum class Known {
                INCORRECT_ACCOUNT_NUMBER,
                INCORRECT_ROUTING_NUMBER,
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                INCORRECT_TRANSACTION_CODE,
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                ADDENDA_FORMAT_ERROR,
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                MISROUTED_NOTIFICATION_OF_CHANGE,
                INCORRECT_TRACE_NUMBER,
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                INCORRECT_IDENTIFICATION_NUMBER,
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                INCORRECT_DISCRETIONARY_DATA,
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
            }

            enum class Value {
                INCORRECT_ACCOUNT_NUMBER,
                INCORRECT_ROUTING_NUMBER,
                INCORRECT_ROUTING_NUMBER_AND_ACCOUNT_NUMBER,
                INCORRECT_TRANSACTION_CODE,
                INCORRECT_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_ROUTING_NUMBER_ACCOUNT_NUMBER_AND_TRANSACTION_CODE,
                INCORRECT_RECEIVING_DEPOSITORY_FINANCIAL_INSTITUTION_IDENTIFICATION,
                INCORRECT_INDIVIDUAL_IDENTIFICATION_NUMBER,
                ADDENDA_FORMAT_ERROR,
                INCORRECT_STANDARD_ENTRY_CLASS_CODE_FOR_OUTBOUND_INTERNATIONAL_PAYMENT,
                MISROUTED_NOTIFICATION_OF_CHANGE,
                INCORRECT_TRACE_NUMBER,
                INCORRECT_COMPANY_IDENTIFICATION_NUMBER,
                INCORRECT_IDENTIFICATION_NUMBER,
                INCORRECTLY_FORMATTED_CORRECTED_DATA,
                INCORRECT_DISCRETIONARY_DATA,
                ROUTING_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                DEPOSITORY_FINANCIAL_INSTITUTION_ACCOUNT_NUMBER_NOT_FROM_ORIGINAL_ENTRY_DETAIL_RECORD,
                INCORRECT_TRANSACTION_CODE_BY_ORIGINATING_DEPOSITORY_FINANCIAL_INSTITUTION,
                _UNKNOWN,
            }

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

            fun asString(): String = _value().asStringOrThrow()

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
    @JsonDeserialize(builder = PreferredEffectiveDate.Builder::class)
    @NoAutoDetect
    class PreferredEffectiveDate
    private constructor(
        private val date: JsonField<LocalDate>,
        private val settlementSchedule: JsonField<SettlementSchedule>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("date") @ExcludeMissing fun _date() = date

        /** A schedule by which Increase will choose an effective date for the transfer. */
        @JsonProperty("settlement_schedule")
        @ExcludeMissing
        fun _settlementSchedule() = settlementSchedule

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): PreferredEffectiveDate = apply {
            if (!validated) {
                date()
                settlementSchedule()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var date: JsonField<LocalDate> = JsonMissing.of()
            private var settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(preferredEffectiveDate: PreferredEffectiveDate) = apply {
                this.date = preferredEffectiveDate.date
                this.settlementSchedule = preferredEffectiveDate.settlementSchedule
                additionalProperties(preferredEffectiveDate.additionalProperties)
            }

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            @JsonProperty("date")
            @ExcludeMissing
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** A schedule by which Increase will choose an effective date for the transfer. */
            fun settlementSchedule(settlementSchedule: SettlementSchedule) =
                settlementSchedule(JsonField.of(settlementSchedule))

            /** A schedule by which Increase will choose an effective date for the transfer. */
            @JsonProperty("settlement_schedule")
            @ExcludeMissing
            fun settlementSchedule(settlementSchedule: JsonField<SettlementSchedule>) = apply {
                this.settlementSchedule = settlementSchedule
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

            fun build(): PreferredEffectiveDate =
                PreferredEffectiveDate(
                    date,
                    settlementSchedule,
                    additionalProperties.toImmutable(),
                )
        }

        class SettlementSchedule
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val SAME_DAY = of("same_day")

                val FUTURE_DATED = of("future_dated")

                fun of(value: String) = SettlementSchedule(JsonField.of(value))
            }

            enum class Known {
                SAME_DAY,
                FUTURE_DATED,
            }

            enum class Value {
                SAME_DAY,
                FUTURE_DATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else -> throw IncreaseInvalidDataException("Unknown SettlementSchedule: $value")
                }

            fun asString(): String = _value().asStringOrThrow()

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
    @JsonDeserialize(builder = Return.Builder::class)
    @NoAutoDetect
    class Return
    private constructor(
        private val createdAt: JsonField<OffsetDateTime>,
        private val rawReturnReasonCode: JsonField<String>,
        private val returnReasonCode: JsonField<ReturnReasonCode>,
        private val traceNumber: JsonField<String>,
        private val transactionId: JsonField<String>,
        private val transferId: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("created_at") @ExcludeMissing fun _createdAt() = createdAt

        /** The three character ACH return code, in the range R01 to R85. */
        @JsonProperty("raw_return_reason_code")
        @ExcludeMissing
        fun _rawReturnReasonCode() = rawReturnReasonCode

        /**
         * Why the ACH Transfer was returned. This reason code is sent by the receiving bank back to
         * Increase.
         */
        @JsonProperty("return_reason_code")
        @ExcludeMissing
        fun _returnReasonCode() = returnReasonCode

        /**
         * A 15 digit number that was generated by the bank that initiated the return. The trace
         * number of the return is different than that of the original transfer. ACH trace numbers
         * are not unique, but along with the amount and date this number can be used to identify
         * the ACH return at the bank that initiated it.
         */
        @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

        /** The identifier of the Transaction associated with this return. */
        @JsonProperty("transaction_id") @ExcludeMissing fun _transactionId() = transactionId

        /** The identifier of the ACH Transfer associated with this return. */
        @JsonProperty("transfer_id") @ExcludeMissing fun _transferId() = transferId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Return = apply {
            if (!validated) {
                createdAt()
                rawReturnReasonCode()
                returnReasonCode()
                traceNumber()
                transactionId()
                transferId()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var createdAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var rawReturnReasonCode: JsonField<String> = JsonMissing.of()
            private var returnReasonCode: JsonField<ReturnReasonCode> = JsonMissing.of()
            private var traceNumber: JsonField<String> = JsonMissing.of()
            private var transactionId: JsonField<String> = JsonMissing.of()
            private var transferId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(return_: Return) = apply {
                this.createdAt = return_.createdAt
                this.rawReturnReasonCode = return_.rawReturnReasonCode
                this.returnReasonCode = return_.returnReasonCode
                this.traceNumber = return_.traceNumber
                this.transactionId = return_.transactionId
                this.transferId = return_.transferId
                additionalProperties(return_.additionalProperties)
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

            /** The three character ACH return code, in the range R01 to R85. */
            fun rawReturnReasonCode(rawReturnReasonCode: String) =
                rawReturnReasonCode(JsonField.of(rawReturnReasonCode))

            /** The three character ACH return code, in the range R01 to R85. */
            @JsonProperty("raw_return_reason_code")
            @ExcludeMissing
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
            @JsonProperty("return_reason_code")
            @ExcludeMissing
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
            @JsonProperty("trace_number")
            @ExcludeMissing
            fun traceNumber(traceNumber: JsonField<String>) = apply {
                this.traceNumber = traceNumber
            }

            /** The identifier of the Transaction associated with this return. */
            fun transactionId(transactionId: String) = transactionId(JsonField.of(transactionId))

            /** The identifier of the Transaction associated with this return. */
            @JsonProperty("transaction_id")
            @ExcludeMissing
            fun transactionId(transactionId: JsonField<String>) = apply {
                this.transactionId = transactionId
            }

            /** The identifier of the ACH Transfer associated with this return. */
            fun transferId(transferId: String) = transferId(JsonField.of(transferId))

            /** The identifier of the ACH Transfer associated with this return. */
            @JsonProperty("transfer_id")
            @ExcludeMissing
            fun transferId(transferId: JsonField<String>) = apply { this.transferId = transferId }

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

            fun build(): Return =
                Return(
                    createdAt,
                    rawReturnReasonCode,
                    returnReasonCode,
                    traceNumber,
                    transactionId,
                    transferId,
                    additionalProperties.toImmutable(),
                )
        }

        class ReturnReasonCode
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val INSUFFICIENT_FUND = of("insufficient_fund")

                val NO_ACCOUNT = of("no_account")

                val ACCOUNT_CLOSED = of("account_closed")

                val INVALID_ACCOUNT_NUMBER_STRUCTURE = of("invalid_account_number_structure")

                val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                    of("account_frozen_entry_returned_per_ofac_instruction")

                val CREDIT_ENTRY_REFUSED_BY_RECEIVER = of("credit_entry_refused_by_receiver")

                val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                    of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")

                val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                    of("corporate_customer_advised_not_authorized")

                val PAYMENT_STOPPED = of("payment_stopped")

                val NON_TRANSACTION_ACCOUNT = of("non_transaction_account")

                val UNCOLLECTED_FUNDS = of("uncollected_funds")

                val ROUTING_NUMBER_CHECK_DIGIT_ERROR = of("routing_number_check_digit_error")

                val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                    of("customer_advised_unauthorized_improper_ineligible_or_incomplete")

                val AMOUNT_FIELD_ERROR = of("amount_field_error")

                val AUTHORIZATION_REVOKED_BY_CUSTOMER = of("authorization_revoked_by_customer")

                val INVALID_ACH_ROUTING_NUMBER = of("invalid_ach_routing_number")

                val FILE_RECORD_EDIT_CRITERIA = of("file_record_edit_criteria")

                val ENR_INVALID_INDIVIDUAL_NAME = of("enr_invalid_individual_name")

                val RETURNED_PER_ODFI_REQUEST = of("returned_per_odfi_request")

                val LIMITED_PARTICIPATION_DFI = of("limited_participation_dfi")

                val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                    of("incorrectly_coded_outbound_international_payment")

                val ACCOUNT_SOLD_TO_ANOTHER_DFI = of("account_sold_to_another_dfi")

                val ADDENDA_ERROR = of("addenda_error")

                val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                    of("beneficiary_or_account_holder_deceased")

                val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                    of("customer_advised_not_within_authorization_terms")

                val CORRECTED_RETURN = of("corrected_return")

                val DUPLICATE_ENTRY = of("duplicate_entry")

                val DUPLICATE_RETURN = of("duplicate_return")

                val ENR_DUPLICATE_ENROLLMENT = of("enr_duplicate_enrollment")

                val ENR_INVALID_DFI_ACCOUNT_NUMBER = of("enr_invalid_dfi_account_number")

                val ENR_INVALID_INDIVIDUAL_ID_NUMBER = of("enr_invalid_individual_id_number")

                val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                    of("enr_invalid_representative_payee_indicator")

                val ENR_INVALID_TRANSACTION_CODE = of("enr_invalid_transaction_code")

                val ENR_RETURN_OF_ENR_ENTRY = of("enr_return_of_enr_entry")

                val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                    of("enr_routing_number_check_digit_error")

                val ENTRY_NOT_PROCESSED_BY_GATEWAY = of("entry_not_processed_by_gateway")

                val FIELD_ERROR = of("field_error")

                val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                    of("foreign_receiving_dfi_unable_to_settle")

                val IAT_ENTRY_CODING_ERROR = of("iat_entry_coding_error")

                val IMPROPER_EFFECTIVE_ENTRY_DATE = of("improper_effective_entry_date")

                val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                    of("improper_source_document_source_document_presented")

                val INVALID_COMPANY_ID = of("invalid_company_id")

                val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                    of("invalid_foreign_receiving_dfi_identification")

                val INVALID_INDIVIDUAL_ID_NUMBER = of("invalid_individual_id_number")

                val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                    of("item_and_rck_entry_presented_for_payment")

                val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                    of("item_related_to_rck_entry_is_ineligible")

                val MANDATORY_FIELD_ERROR = of("mandatory_field_error")

                val MISROUTED_DISHONORED_RETURN = of("misrouted_dishonored_return")

                val MISROUTED_RETURN = of("misrouted_return")

                val NO_ERRORS_FOUND = of("no_errors_found")

                val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                    of("non_acceptance_of_r62_dishonored_return")

                val NON_PARTICIPANT_IN_IAT_PROGRAM = of("non_participant_in_iat_program")

                val PERMISSIBLE_RETURN_ENTRY = of("permissible_return_entry")

                val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                    of("permissible_return_entry_not_accepted")

                val RDFI_NON_SETTLEMENT = of("rdfi_non_settlement")

                val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                    of("rdfi_participant_in_check_truncation_program")

                val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                    of("representative_payee_deceased_or_unable_to_continue_in_that_capacity")

                val RETURN_NOT_A_DUPLICATE = of("return_not_a_duplicate")

                val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                    of("return_of_erroneous_or_reversing_debit")

                val RETURN_OF_IMPROPER_CREDIT_ENTRY = of("return_of_improper_credit_entry")

                val RETURN_OF_IMPROPER_DEBIT_ENTRY = of("return_of_improper_debit_entry")

                val RETURN_OF_XCK_ENTRY = of("return_of_xck_entry")

                val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                    of("source_document_presented_for_payment")

                val STATE_LAW_AFFECTING_RCK_ACCEPTANCE = of("state_law_affecting_rck_acceptance")

                val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                    of("stop_payment_on_item_related_to_rck_entry")

                val STOP_PAYMENT_ON_SOURCE_DOCUMENT = of("stop_payment_on_source_document")

                val TIMELY_ORIGINAL_RETURN = of("timely_original_return")

                val TRACE_NUMBER_ERROR = of("trace_number_error")

                val UNTIMELY_DISHONORED_RETURN = of("untimely_dishonored_return")

                val UNTIMELY_RETURN = of("untimely_return")

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

            fun asString(): String = _value().asStringOrThrow()

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
    @JsonDeserialize(builder = Settlement.Builder::class)
    @NoAutoDetect
    class Settlement
    private constructor(
        private val settledAt: JsonField<OffsetDateTime>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

        /**
         * When the funds for this transfer have settled at the destination bank at the Federal
         * Reserve.
         */
        fun settledAt(): OffsetDateTime = settledAt.getRequired("settled_at")

        /**
         * When the funds for this transfer have settled at the destination bank at the Federal
         * Reserve.
         */
        @JsonProperty("settled_at") @ExcludeMissing fun _settledAt() = settledAt

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Settlement = apply {
            if (!validated) {
                settledAt()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var settledAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(settlement: Settlement) = apply {
                this.settledAt = settlement.settledAt
                additionalProperties(settlement.additionalProperties)
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
            @JsonProperty("settled_at")
            @ExcludeMissing
            fun settledAt(settledAt: JsonField<OffsetDateTime>) = apply {
                this.settledAt = settledAt
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

            fun build(): Settlement = Settlement(settledAt, additionalProperties.toImmutable())
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

    class StandardEntryClassCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val CORPORATE_CREDIT_OR_DEBIT = of("corporate_credit_or_debit")

            val CORPORATE_TRADE_EXCHANGE = of("corporate_trade_exchange")

            val PREARRANGED_PAYMENTS_AND_DEPOSIT = of("prearranged_payments_and_deposit")

            val INTERNET_INITIATED = of("internet_initiated")

            fun of(value: String) = StandardEntryClassCode(JsonField.of(value))
        }

        enum class Known {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
        }

        enum class Value {
            CORPORATE_CREDIT_OR_DEBIT,
            CORPORATE_TRADE_EXCHANGE,
            PREARRANGED_PAYMENTS_AND_DEPOSIT,
            INTERNET_INITIATED,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Value.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Value.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Value.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Value.INTERNET_INITIATED
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CORPORATE_CREDIT_OR_DEBIT -> Known.CORPORATE_CREDIT_OR_DEBIT
                CORPORATE_TRADE_EXCHANGE -> Known.CORPORATE_TRADE_EXCHANGE
                PREARRANGED_PAYMENTS_AND_DEPOSIT -> Known.PREARRANGED_PAYMENTS_AND_DEPOSIT
                INTERNET_INITIATED -> Known.INTERNET_INITIATED
                else -> throw IncreaseInvalidDataException("Unknown StandardEntryClassCode: $value")
            }

        fun asString(): String = _value().asStringOrThrow()

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
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

            val PENDING_APPROVAL = of("pending_approval")

            val PENDING_TRANSFER_SESSION_CONFIRMATION = of("pending_transfer_session_confirmation")

            val CANCELED = of("canceled")

            val PENDING_SUBMISSION = of("pending_submission")

            val PENDING_REVIEWING = of("pending_reviewing")

            val REQUIRES_ATTENTION = of("requires_attention")

            val REJECTED = of("rejected")

            val SUBMITTED = of("submitted")

            val RETURNED = of("returned")

            fun of(value: String) = Status(JsonField.of(value))
        }

        enum class Known {
            PENDING_APPROVAL,
            PENDING_TRANSFER_SESSION_CONFIRMATION,
            CANCELED,
            PENDING_SUBMISSION,
            PENDING_REVIEWING,
            REQUIRES_ATTENTION,
            REJECTED,
            SUBMITTED,
            RETURNED,
        }

        enum class Value {
            PENDING_APPROVAL,
            PENDING_TRANSFER_SESSION_CONFIRMATION,
            CANCELED,
            PENDING_SUBMISSION,
            PENDING_REVIEWING,
            REQUIRES_ATTENTION,
            REJECTED,
            SUBMITTED,
            RETURNED,
            _UNKNOWN,
        }

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
     * After the transfer is submitted to FedACH, this will contain supplemental details. Increase
     * batches transfers and submits a file to the Federal Reserve roughly every 30 minutes. The
     * Federal Reserve processes ACH transfers during weekdays according to their
     * [posted schedule](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
     */
    @JsonDeserialize(builder = Submission.Builder::class)
    @NoAutoDetect
    class Submission
    private constructor(
        private val effectiveDate: JsonField<LocalDate>,
        private val expectedFundsSettlementAt: JsonField<OffsetDateTime>,
        private val expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>,
        private val submittedAt: JsonField<OffsetDateTime>,
        private val traceNumber: JsonField<String>,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var validated: Boolean = false

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
        @JsonProperty("effective_date") @ExcludeMissing fun _effectiveDate() = effectiveDate

        /**
         * When the transfer is expected to settle in the recipient's account. Credits may be
         * available sooner, at the receiving banks discretion. The FedACH schedule is published
         * [here](https://www.frbservices.org/resources/resource-centers/same-day-ach/fedach-processing-schedule.html).
         */
        @JsonProperty("expected_funds_settlement_at")
        @ExcludeMissing
        fun _expectedFundsSettlementAt() = expectedFundsSettlementAt

        /**
         * The settlement schedule the transfer is expected to follow. This expectation takes into
         * account the `effective_date`, `submitted_at`, and the amount of the transfer.
         */
        @JsonProperty("expected_settlement_schedule")
        @ExcludeMissing
        fun _expectedSettlementSchedule() = expectedSettlementSchedule

        /** When the ACH transfer was sent to FedACH. */
        @JsonProperty("submitted_at") @ExcludeMissing fun _submittedAt() = submittedAt

        /**
         * A 15 digit number recorded in the Nacha file and transmitted to the receiving bank. Along
         * with the amount, date, and originating routing number, this can be used to identify the
         * ACH transfer at the receiving bank. ACH trace numbers are not unique, but are
         * [used to correlate returns](https://increase.com/documentation/ach-returns#ach-returns).
         */
        @JsonProperty("trace_number") @ExcludeMissing fun _traceNumber() = traceNumber

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun validate(): Submission = apply {
            if (!validated) {
                effectiveDate()
                expectedFundsSettlementAt()
                expectedSettlementSchedule()
                submittedAt()
                traceNumber()
                validated = true
            }
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var effectiveDate: JsonField<LocalDate> = JsonMissing.of()
            private var expectedFundsSettlementAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule> =
                JsonMissing.of()
            private var submittedAt: JsonField<OffsetDateTime> = JsonMissing.of()
            private var traceNumber: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(submission: Submission) = apply {
                this.effectiveDate = submission.effectiveDate
                this.expectedFundsSettlementAt = submission.expectedFundsSettlementAt
                this.expectedSettlementSchedule = submission.expectedSettlementSchedule
                this.submittedAt = submission.submittedAt
                this.traceNumber = submission.traceNumber
                additionalProperties(submission.additionalProperties)
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
            @JsonProperty("effective_date")
            @ExcludeMissing
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
            @JsonProperty("expected_funds_settlement_at")
            @ExcludeMissing
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
            @JsonProperty("expected_settlement_schedule")
            @ExcludeMissing
            fun expectedSettlementSchedule(
                expectedSettlementSchedule: JsonField<ExpectedSettlementSchedule>
            ) = apply { this.expectedSettlementSchedule = expectedSettlementSchedule }

            /** When the ACH transfer was sent to FedACH. */
            fun submittedAt(submittedAt: OffsetDateTime) = submittedAt(JsonField.of(submittedAt))

            /** When the ACH transfer was sent to FedACH. */
            @JsonProperty("submitted_at")
            @ExcludeMissing
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

            fun putAllAdditionalProperties(additionalProperties: Map<String, JsonValue>) = apply {
                this.additionalProperties.putAll(additionalProperties)
            }

            fun build(): Submission =
                Submission(
                    effectiveDate,
                    expectedFundsSettlementAt,
                    expectedSettlementSchedule,
                    submittedAt,
                    traceNumber,
                    additionalProperties.toImmutable(),
                )
        }

        class ExpectedSettlementSchedule
        @JsonCreator
        private constructor(
            private val value: JsonField<String>,
        ) : Enum {

            @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

            companion object {

                val SAME_DAY = of("same_day")

                val FUTURE_DATED = of("future_dated")

                fun of(value: String) = ExpectedSettlementSchedule(JsonField.of(value))
            }

            enum class Known {
                SAME_DAY,
                FUTURE_DATED,
            }

            enum class Value {
                SAME_DAY,
                FUTURE_DATED,
                _UNKNOWN,
            }

            fun value(): Value =
                when (this) {
                    SAME_DAY -> Value.SAME_DAY
                    FUTURE_DATED -> Value.FUTURE_DATED
                    else -> Value._UNKNOWN
                }

            fun known(): Known =
                when (this) {
                    SAME_DAY -> Known.SAME_DAY
                    FUTURE_DATED -> Known.FUTURE_DATED
                    else ->
                        throw IncreaseInvalidDataException(
                            "Unknown ExpectedSettlementSchedule: $value"
                        )
                }

            fun asString(): String = _value().asStringOrThrow()

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

    class Type
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        companion object {

            val ACH_TRANSFER = of("ach_transfer")

            fun of(value: String) = Type(JsonField.of(value))
        }

        enum class Known {
            ACH_TRANSFER,
        }

        enum class Value {
            ACH_TRANSFER,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                ACH_TRANSFER -> Value.ACH_TRANSFER
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                ACH_TRANSFER -> Known.ACH_TRANSFER
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

        return /* spotless:off */ other is AchTransfer && accountId == other.accountId && accountNumber == other.accountNumber && acknowledgement == other.acknowledgement && addenda == other.addenda && amount == other.amount && approval == other.approval && cancellation == other.cancellation && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && createdAt == other.createdAt && createdBy == other.createdBy && currency == other.currency && destinationAccountHolder == other.destinationAccountHolder && externalAccountId == other.externalAccountId && funding == other.funding && id == other.id && idempotencyKey == other.idempotencyKey && inboundFundsHold == other.inboundFundsHold && individualId == other.individualId && individualName == other.individualName && network == other.network && notificationsOfChange == other.notificationsOfChange && pendingTransactionId == other.pendingTransactionId && preferredEffectiveDate == other.preferredEffectiveDate && return_ == other.return_ && routingNumber == other.routingNumber && settlement == other.settlement && standardEntryClassCode == other.standardEntryClassCode && statementDescriptor == other.statementDescriptor && status == other.status && submission == other.submission && transactionId == other.transactionId && type == other.type && additionalProperties == other.additionalProperties /* spotless:on */
    }

    /* spotless:off */
    private val hashCode: Int by lazy { Objects.hash(accountId, accountNumber, acknowledgement, addenda, amount, approval, cancellation, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, createdAt, createdBy, currency, destinationAccountHolder, externalAccountId, funding, id, idempotencyKey, inboundFundsHold, individualId, individualName, network, notificationsOfChange, pendingTransactionId, preferredEffectiveDate, return_, routingNumber, settlement, standardEntryClassCode, statementDescriptor, status, submission, transactionId, type, additionalProperties) }
    /* spotless:on */

    override fun hashCode(): Int = hashCode

    override fun toString() =
        "AchTransfer{accountId=$accountId, accountNumber=$accountNumber, acknowledgement=$acknowledgement, addenda=$addenda, amount=$amount, approval=$approval, cancellation=$cancellation, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, createdAt=$createdAt, createdBy=$createdBy, currency=$currency, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, id=$id, idempotencyKey=$idempotencyKey, inboundFundsHold=$inboundFundsHold, individualId=$individualId, individualName=$individualName, network=$network, notificationsOfChange=$notificationsOfChange, pendingTransactionId=$pendingTransactionId, preferredEffectiveDate=$preferredEffectiveDate, return_=$return_, routingNumber=$routingNumber, settlement=$settlement, standardEntryClassCode=$standardEntryClassCode, statementDescriptor=$statementDescriptor, status=$status, submission=$submission, transactionId=$transactionId, type=$type, additionalProperties=$additionalProperties}"
}
