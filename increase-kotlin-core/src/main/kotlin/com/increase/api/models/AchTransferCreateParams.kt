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
import com.increase.api.core.Params
import com.increase.api.core.checkKnown
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import java.time.LocalDate
import java.util.Objects

/** Create an ACH Transfer */
class AchTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The Increase identifier for the account that will send the transfer. */
    fun accountId(): String = body.accountId()

    /**
     * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
     * funds to the receiving account. A negative amount originates a debit transfer pulling funds
     * from the receiving account.
     */
    fun amount(): Long = body.amount()

    /**
     * A description you choose to give the transfer. This will be saved with the transfer details,
     * displayed in the dashboard, and returned by the API. If `individual_name` and `company_name`
     * are not explicitly set by this API, the `statement_descriptor` will be sent in those fields
     * to the receiving bank to help the customer recognize the transfer. You are highly encouraged
     * to pass `individual_name` and `company_name` instead of relying on this fallback.
     */
    fun statementDescriptor(): String = body.statementDescriptor()

    /** The account number for the destination account. */
    fun accountNumber(): String? = body.accountNumber()

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
    fun addenda(): Addenda? = body.addenda()

    /**
     * The description of the date of the transfer, usually in the format `YYMMDD`. This is included
     * in the transfer data sent to the receiving bank.
     */
    fun companyDescriptiveDate(): String? = body.companyDescriptiveDate()

    /**
     * The data you choose to associate with the transfer. This is included in the transfer data
     * sent to the receiving bank.
     */
    fun companyDiscretionaryData(): String? = body.companyDiscretionaryData()

    /**
     * A description of the transfer. This is included in the transfer data sent to the receiving
     * bank.
     */
    fun companyEntryDescription(): String? = body.companyEntryDescription()

    /**
     * The name by which the recipient knows you. This is included in the transfer data sent to the
     * receiving bank.
     */
    fun companyName(): String? = body.companyName()

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    fun destinationAccountHolder(): DestinationAccountHolder? = body.destinationAccountHolder()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number`, `routing_number`, and `funding` must be absent.
     */
    fun externalAccountId(): String? = body.externalAccountId()

    /** The type of the account to which the transfer will be sent. */
    fun funding(): Funding? = body.funding()

    /** Your identifier for the transfer recipient. */
    fun individualId(): String? = body.individualId()

    /**
     * The name of the transfer recipient. This value is informational and not verified by the
     * recipient's bank.
     */
    fun individualName(): String? = body.individualName()

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    fun preferredEffectiveDate(): PreferredEffectiveDate? = body.preferredEffectiveDate()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun requireApproval(): Boolean? = body.requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun routingNumber(): String? = body.routingNumber()

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    fun standardEntryClassCode(): StandardEntryClassCode? = body.standardEntryClassCode()

    /** The timing of the transaction. */
    fun transactionTiming(): TransactionTiming? = body.transactionTiming()

    /** The Increase identifier for the account that will send the transfer. */
    fun _accountId(): JsonField<String> = body._accountId()

    /**
     * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
     * funds to the receiving account. A negative amount originates a debit transfer pulling funds
     * from the receiving account.
     */
    fun _amount(): JsonField<Long> = body._amount()

    /**
     * A description you choose to give the transfer. This will be saved with the transfer details,
     * displayed in the dashboard, and returned by the API. If `individual_name` and `company_name`
     * are not explicitly set by this API, the `statement_descriptor` will be sent in those fields
     * to the receiving bank to help the customer recognize the transfer. You are highly encouraged
     * to pass `individual_name` and `company_name` instead of relying on this fallback.
     */
    fun _statementDescriptor(): JsonField<String> = body._statementDescriptor()

    /** The account number for the destination account. */
    fun _accountNumber(): JsonField<String> = body._accountNumber()

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
    fun _addenda(): JsonField<Addenda> = body._addenda()

    /**
     * The description of the date of the transfer, usually in the format `YYMMDD`. This is included
     * in the transfer data sent to the receiving bank.
     */
    fun _companyDescriptiveDate(): JsonField<String> = body._companyDescriptiveDate()

    /**
     * The data you choose to associate with the transfer. This is included in the transfer data
     * sent to the receiving bank.
     */
    fun _companyDiscretionaryData(): JsonField<String> = body._companyDiscretionaryData()

    /**
     * A description of the transfer. This is included in the transfer data sent to the receiving
     * bank.
     */
    fun _companyEntryDescription(): JsonField<String> = body._companyEntryDescription()

    /**
     * The name by which the recipient knows you. This is included in the transfer data sent to the
     * receiving bank.
     */
    fun _companyName(): JsonField<String> = body._companyName()

    /** The type of entity that owns the account to which the ACH Transfer is being sent. */
    fun _destinationAccountHolder(): JsonField<DestinationAccountHolder> =
        body._destinationAccountHolder()

    /**
     * The ID of an External Account to initiate a transfer to. If this parameter is provided,
     * `account_number`, `routing_number`, and `funding` must be absent.
     */
    fun _externalAccountId(): JsonField<String> = body._externalAccountId()

    /** The type of the account to which the transfer will be sent. */
    fun _funding(): JsonField<Funding> = body._funding()

    /** Your identifier for the transfer recipient. */
    fun _individualId(): JsonField<String> = body._individualId()

    /**
     * The name of the transfer recipient. This value is informational and not verified by the
     * recipient's bank.
     */
    fun _individualName(): JsonField<String> = body._individualName()

    /**
     * Configuration for how the effective date of the transfer will be set. This determines
     * same-day vs future-dated settlement timing. If not set, defaults to a `settlement_schedule`
     * of `same_day`. If set, exactly one of the child attributes must be set.
     */
    fun _preferredEffectiveDate(): JsonField<PreferredEffectiveDate> =
        body._preferredEffectiveDate()

    /** Whether the transfer requires explicit approval via the dashboard or API. */
    fun _requireApproval(): JsonField<Boolean> = body._requireApproval()

    /**
     * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
     * account.
     */
    fun _routingNumber(): JsonField<String> = body._routingNumber()

    /** The Standard Entry Class (SEC) code to use for the transfer. */
    fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> =
        body._standardEntryClassCode()

    /** The timing of the transaction. */
    fun _transactionTiming(): JsonField<TransactionTiming> = body._transactionTiming()

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    internal fun _body(): Body = body

    override fun _headers(): Headers = additionalHeaders

    override fun _queryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class Body
    @JsonCreator
    private constructor(
        @JsonProperty("account_id")
        @ExcludeMissing
        private val accountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        private val statementDescriptor: JsonField<String> = JsonMissing.of(),
        @JsonProperty("account_number")
        @ExcludeMissing
        private val accountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("addenda")
        @ExcludeMissing
        private val addenda: JsonField<Addenda> = JsonMissing.of(),
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
        @JsonProperty("destination_account_holder")
        @ExcludeMissing
        private val destinationAccountHolder: JsonField<DestinationAccountHolder> =
            JsonMissing.of(),
        @JsonProperty("external_account_id")
        @ExcludeMissing
        private val externalAccountId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("funding")
        @ExcludeMissing
        private val funding: JsonField<Funding> = JsonMissing.of(),
        @JsonProperty("individual_id")
        @ExcludeMissing
        private val individualId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("individual_name")
        @ExcludeMissing
        private val individualName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("preferred_effective_date")
        @ExcludeMissing
        private val preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of(),
        @JsonProperty("require_approval")
        @ExcludeMissing
        private val requireApproval: JsonField<Boolean> = JsonMissing.of(),
        @JsonProperty("routing_number")
        @ExcludeMissing
        private val routingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        private val standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of(),
        @JsonProperty("transaction_timing")
        @ExcludeMissing
        private val transactionTiming: JsonField<TransactionTiming> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(): String = accountId.getRequired("account_id")

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(): Long = amount.getRequired("amount")

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(): String = statementDescriptor.getRequired("statement_descriptor")

        /** The account number for the destination account. */
        fun accountNumber(): String? = accountNumber.getNullable("account_number")

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addenda(): Addenda? = addenda.getNullable("addenda")

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(): String? =
            companyDescriptiveDate.getNullable("company_descriptive_date")

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(): String? =
            companyDiscretionaryData.getNullable("company_discretionary_data")

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        fun companyEntryDescription(): String? =
            companyEntryDescription.getNullable("company_entry_description")

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(): String? = companyName.getNullable("company_name")

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(): DestinationAccountHolder? =
            destinationAccountHolder.getNullable("destination_account_holder")

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        fun externalAccountId(): String? = externalAccountId.getNullable("external_account_id")

        /** The type of the account to which the transfer will be sent. */
        fun funding(): Funding? = funding.getNullable("funding")

        /** Your identifier for the transfer recipient. */
        fun individualId(): String? = individualId.getNullable("individual_id")

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(): String? = individualName.getNullable("individual_name")

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(): PreferredEffectiveDate? =
            preferredEffectiveDate.getNullable("preferred_effective_date")

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(): Boolean? = requireApproval.getNullable("require_approval")

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(): String? = routingNumber.getNullable("routing_number")

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(): StandardEntryClassCode? =
            standardEntryClassCode.getNullable("standard_entry_class_code")

        /** The timing of the transaction. */
        fun transactionTiming(): TransactionTiming? =
            transactionTiming.getNullable("transaction_timing")

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") @ExcludeMissing fun _accountId(): JsonField<String> = accountId

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        @JsonProperty("statement_descriptor")
        @ExcludeMissing
        fun _statementDescriptor(): JsonField<String> = statementDescriptor

        /** The account number for the destination account. */
        @JsonProperty("account_number")
        @ExcludeMissing
        fun _accountNumber(): JsonField<String> = accountNumber

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        @JsonProperty("addenda") @ExcludeMissing fun _addenda(): JsonField<Addenda> = addenda

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        @JsonProperty("company_descriptive_date")
        @ExcludeMissing
        fun _companyDescriptiveDate(): JsonField<String> = companyDescriptiveDate

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        @JsonProperty("company_discretionary_data")
        @ExcludeMissing
        fun _companyDiscretionaryData(): JsonField<String> = companyDiscretionaryData

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        @JsonProperty("company_entry_description")
        @ExcludeMissing
        fun _companyEntryDescription(): JsonField<String> = companyEntryDescription

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        @JsonProperty("company_name")
        @ExcludeMissing
        fun _companyName(): JsonField<String> = companyName

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        @JsonProperty("destination_account_holder")
        @ExcludeMissing
        fun _destinationAccountHolder(): JsonField<DestinationAccountHolder> =
            destinationAccountHolder

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        @JsonProperty("external_account_id")
        @ExcludeMissing
        fun _externalAccountId(): JsonField<String> = externalAccountId

        /** The type of the account to which the transfer will be sent. */
        @JsonProperty("funding") @ExcludeMissing fun _funding(): JsonField<Funding> = funding

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id")
        @ExcludeMissing
        fun _individualId(): JsonField<String> = individualId

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name")
        @ExcludeMissing
        fun _individualName(): JsonField<String> = individualName

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        @JsonProperty("preferred_effective_date")
        @ExcludeMissing
        fun _preferredEffectiveDate(): JsonField<PreferredEffectiveDate> = preferredEffectiveDate

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        @JsonProperty("require_approval")
        @ExcludeMissing
        fun _requireApproval(): JsonField<Boolean> = requireApproval

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number")
        @ExcludeMissing
        fun _routingNumber(): JsonField<String> = routingNumber

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        @JsonProperty("standard_entry_class_code")
        @ExcludeMissing
        fun _standardEntryClassCode(): JsonField<StandardEntryClassCode> = standardEntryClassCode

        /** The timing of the transaction. */
        @JsonProperty("transaction_timing")
        @ExcludeMissing
        fun _transactionTiming(): JsonField<TransactionTiming> = transactionTiming

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountId()
            amount()
            statementDescriptor()
            accountNumber()
            addenda()?.validate()
            companyDescriptiveDate()
            companyDiscretionaryData()
            companyEntryDescription()
            companyName()
            destinationAccountHolder()
            externalAccountId()
            funding()
            individualId()
            individualName()
            preferredEffectiveDate()?.validate()
            requireApproval()
            routingNumber()
            standardEntryClassCode()
            transactionTiming()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .accountId()
             * .amount()
             * .statementDescriptor()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var statementDescriptor: JsonField<String>? = null
            private var accountNumber: JsonField<String> = JsonMissing.of()
            private var addenda: JsonField<Addenda> = JsonMissing.of()
            private var companyDescriptiveDate: JsonField<String> = JsonMissing.of()
            private var companyDiscretionaryData: JsonField<String> = JsonMissing.of()
            private var companyEntryDescription: JsonField<String> = JsonMissing.of()
            private var companyName: JsonField<String> = JsonMissing.of()
            private var destinationAccountHolder: JsonField<DestinationAccountHolder> =
                JsonMissing.of()
            private var externalAccountId: JsonField<String> = JsonMissing.of()
            private var funding: JsonField<Funding> = JsonMissing.of()
            private var individualId: JsonField<String> = JsonMissing.of()
            private var individualName: JsonField<String> = JsonMissing.of()
            private var preferredEffectiveDate: JsonField<PreferredEffectiveDate> = JsonMissing.of()
            private var requireApproval: JsonField<Boolean> = JsonMissing.of()
            private var routingNumber: JsonField<String> = JsonMissing.of()
            private var standardEntryClassCode: JsonField<StandardEntryClassCode> = JsonMissing.of()
            private var transactionTiming: JsonField<TransactionTiming> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountId = body.accountId
                amount = body.amount
                statementDescriptor = body.statementDescriptor
                accountNumber = body.accountNumber
                addenda = body.addenda
                companyDescriptiveDate = body.companyDescriptiveDate
                companyDiscretionaryData = body.companyDiscretionaryData
                companyEntryDescription = body.companyEntryDescription
                companyName = body.companyName
                destinationAccountHolder = body.destinationAccountHolder
                externalAccountId = body.externalAccountId
                funding = body.funding
                individualId = body.individualId
                individualName = body.individualName
                preferredEffectiveDate = body.preferredEffectiveDate
                requireApproval = body.requireApproval
                routingNumber = body.routingNumber
                standardEntryClassCode = body.standardEntryClassCode
                transactionTiming = body.transactionTiming
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /** The Increase identifier for the account that will send the transfer. */
            fun accountId(accountId: String) = accountId(JsonField.of(accountId))

            /** The Increase identifier for the account that will send the transfer. */
            fun accountId(accountId: JsonField<String>) = apply { this.accountId = accountId }

            /**
             * The transfer amount in USD cents. A positive amount originates a credit transfer
             * pushing funds to the receiving account. A negative amount originates a debit transfer
             * pulling funds from the receiving account.
             */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /**
             * The transfer amount in USD cents. A positive amount originates a credit transfer
             * pushing funds to the receiving account. A negative amount originates a debit transfer
             * pulling funds from the receiving account.
             */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /**
             * A description you choose to give the transfer. This will be saved with the transfer
             * details, displayed in the dashboard, and returned by the API. If `individual_name`
             * and `company_name` are not explicitly set by this API, the `statement_descriptor`
             * will be sent in those fields to the receiving bank to help the customer recognize the
             * transfer. You are highly encouraged to pass `individual_name` and `company_name`
             * instead of relying on this fallback.
             */
            fun statementDescriptor(statementDescriptor: String) =
                statementDescriptor(JsonField.of(statementDescriptor))

            /**
             * A description you choose to give the transfer. This will be saved with the transfer
             * details, displayed in the dashboard, and returned by the API. If `individual_name`
             * and `company_name` are not explicitly set by this API, the `statement_descriptor`
             * will be sent in those fields to the receiving bank to help the customer recognize the
             * transfer. You are highly encouraged to pass `individual_name` and `company_name`
             * instead of relying on this fallback.
             */
            fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
                this.statementDescriptor = statementDescriptor
            }

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: String) = accountNumber(JsonField.of(accountNumber))

            /** The account number for the destination account. */
            fun accountNumber(accountNumber: JsonField<String>) = apply {
                this.accountNumber = accountNumber
            }

            /**
             * Additional information that will be sent to the recipient. This is included in the
             * transfer data sent to the receiving bank.
             */
            fun addenda(addenda: Addenda) = addenda(JsonField.of(addenda))

            /**
             * Additional information that will be sent to the recipient. This is included in the
             * transfer data sent to the receiving bank.
             */
            fun addenda(addenda: JsonField<Addenda>) = apply { this.addenda = addenda }

            /**
             * The description of the date of the transfer, usually in the format `YYMMDD`. This is
             * included in the transfer data sent to the receiving bank.
             */
            fun companyDescriptiveDate(companyDescriptiveDate: String) =
                companyDescriptiveDate(JsonField.of(companyDescriptiveDate))

            /**
             * The description of the date of the transfer, usually in the format `YYMMDD`. This is
             * included in the transfer data sent to the receiving bank.
             */
            fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /**
             * The data you choose to associate with the transfer. This is included in the transfer
             * data sent to the receiving bank.
             */
            fun companyDiscretionaryData(companyDiscretionaryData: String) =
                companyDiscretionaryData(JsonField.of(companyDiscretionaryData))

            /**
             * The data you choose to associate with the transfer. This is included in the transfer
             * data sent to the receiving bank.
             */
            fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /**
             * A description of the transfer. This is included in the transfer data sent to the
             * receiving bank.
             */
            fun companyEntryDescription(companyEntryDescription: String) =
                companyEntryDescription(JsonField.of(companyEntryDescription))

            /**
             * A description of the transfer. This is included in the transfer data sent to the
             * receiving bank.
             */
            fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /**
             * The name by which the recipient knows you. This is included in the transfer data sent
             * to the receiving bank.
             */
            fun companyName(companyName: String) = companyName(JsonField.of(companyName))

            /**
             * The name by which the recipient knows you. This is included in the transfer data sent
             * to the receiving bank.
             */
            fun companyName(companyName: JsonField<String>) = apply {
                this.companyName = companyName
            }

            /** The type of entity that owns the account to which the ACH Transfer is being sent. */
            fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) =
                destinationAccountHolder(JsonField.of(destinationAccountHolder))

            /** The type of entity that owns the account to which the ACH Transfer is being sent. */
            fun destinationAccountHolder(
                destinationAccountHolder: JsonField<DestinationAccountHolder>
            ) = apply { this.destinationAccountHolder = destinationAccountHolder }

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number`, `routing_number`, and `funding` must be absent.
             */
            fun externalAccountId(externalAccountId: String) =
                externalAccountId(JsonField.of(externalAccountId))

            /**
             * The ID of an External Account to initiate a transfer to. If this parameter is
             * provided, `account_number`, `routing_number`, and `funding` must be absent.
             */
            fun externalAccountId(externalAccountId: JsonField<String>) = apply {
                this.externalAccountId = externalAccountId
            }

            /** The type of the account to which the transfer will be sent. */
            fun funding(funding: Funding) = funding(JsonField.of(funding))

            /** The type of the account to which the transfer will be sent. */
            fun funding(funding: JsonField<Funding>) = apply { this.funding = funding }

            /** Your identifier for the transfer recipient. */
            fun individualId(individualId: String) = individualId(JsonField.of(individualId))

            /** Your identifier for the transfer recipient. */
            fun individualId(individualId: JsonField<String>) = apply {
                this.individualId = individualId
            }

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * the recipient's bank.
             */
            fun individualName(individualName: String) =
                individualName(JsonField.of(individualName))

            /**
             * The name of the transfer recipient. This value is informational and not verified by
             * the recipient's bank.
             */
            fun individualName(individualName: JsonField<String>) = apply {
                this.individualName = individualName
            }

            /**
             * Configuration for how the effective date of the transfer will be set. This determines
             * same-day vs future-dated settlement timing. If not set, defaults to a
             * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must
             * be set.
             */
            fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) =
                preferredEffectiveDate(JsonField.of(preferredEffectiveDate))

            /**
             * Configuration for how the effective date of the transfer will be set. This determines
             * same-day vs future-dated settlement timing. If not set, defaults to a
             * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must
             * be set.
             */
            fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
                apply {
                    this.preferredEffectiveDate = preferredEffectiveDate
                }

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: Boolean) =
                requireApproval(JsonField.of(requireApproval))

            /** Whether the transfer requires explicit approval via the dashboard or API. */
            fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
                this.requireApproval = requireApproval
            }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: String) = routingNumber(JsonField.of(routingNumber))

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            fun routingNumber(routingNumber: JsonField<String>) = apply {
                this.routingNumber = routingNumber
            }

            /** The Standard Entry Class (SEC) code to use for the transfer. */
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) =
                standardEntryClassCode(JsonField.of(standardEntryClassCode))

            /** The Standard Entry Class (SEC) code to use for the transfer. */
            fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
                apply {
                    this.standardEntryClassCode = standardEntryClassCode
                }

            /** The timing of the transaction. */
            fun transactionTiming(transactionTiming: TransactionTiming) =
                transactionTiming(JsonField.of(transactionTiming))

            /** The timing of the transaction. */
            fun transactionTiming(transactionTiming: JsonField<TransactionTiming>) = apply {
                this.transactionTiming = transactionTiming
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

            fun build(): Body =
                Body(
                    checkRequired("accountId", accountId),
                    checkRequired("amount", amount),
                    checkRequired("statementDescriptor", statementDescriptor),
                    accountNumber,
                    addenda,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    destinationAccountHolder,
                    externalAccountId,
                    funding,
                    individualId,
                    individualName,
                    preferredEffectiveDate,
                    requireApproval,
                    routingNumber,
                    standardEntryClassCode,
                    transactionTiming,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountId == other.accountId && amount == other.amount && statementDescriptor == other.statementDescriptor && accountNumber == other.accountNumber && addenda == other.addenda && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && destinationAccountHolder == other.destinationAccountHolder && externalAccountId == other.externalAccountId && funding == other.funding && individualId == other.individualId && individualName == other.individualName && preferredEffectiveDate == other.preferredEffectiveDate && requireApproval == other.requireApproval && routingNumber == other.routingNumber && standardEntryClassCode == other.standardEntryClassCode && transactionTiming == other.transactionTiming && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, amount, statementDescriptor, accountNumber, addenda, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, destinationAccountHolder, externalAccountId, funding, individualId, individualName, preferredEffectiveDate, requireApproval, routingNumber, standardEntryClassCode, transactionTiming, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountId=$accountId, amount=$amount, statementDescriptor=$statementDescriptor, accountNumber=$accountNumber, addenda=$addenda, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, destinationAccountHolder=$destinationAccountHolder, externalAccountId=$externalAccountId, funding=$funding, individualId=$individualId, individualName=$individualName, preferredEffectiveDate=$preferredEffectiveDate, requireApproval=$requireApproval, routingNumber=$routingNumber, standardEntryClassCode=$standardEntryClassCode, transactionTiming=$transactionTiming, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AchTransferCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountId()
         * .amount()
         * .statementDescriptor()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [AchTransferCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(achTransferCreateParams: AchTransferCreateParams) = apply {
            body = achTransferCreateParams.body.toBuilder()
            additionalHeaders = achTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achTransferCreateParams.additionalQueryParams.toBuilder()
        }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { body.accountId(accountId) }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: JsonField<String>) = apply { body.accountId(accountId) }

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /**
         * The transfer amount in USD cents. A positive amount originates a credit transfer pushing
         * funds to the receiving account. A negative amount originates a debit transfer pulling
         * funds from the receiving account.
         */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(statementDescriptor: String) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /**
         * A description you choose to give the transfer. This will be saved with the transfer
         * details, displayed in the dashboard, and returned by the API. If `individual_name` and
         * `company_name` are not explicitly set by this API, the `statement_descriptor` will be
         * sent in those fields to the receiving bank to help the customer recognize the transfer.
         * You are highly encouraged to pass `individual_name` and `company_name` instead of relying
         * on this fallback.
         */
        fun statementDescriptor(statementDescriptor: JsonField<String>) = apply {
            body.statementDescriptor(statementDescriptor)
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { body.accountNumber(accountNumber) }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: JsonField<String>) = apply {
            body.accountNumber(accountNumber)
        }

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addenda(addenda: Addenda) = apply { body.addenda(addenda) }

        /**
         * Additional information that will be sent to the recipient. This is included in the
         * transfer data sent to the receiving bank.
         */
        fun addenda(addenda: JsonField<Addenda>) = apply { body.addenda(addenda) }

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /**
         * The description of the date of the transfer, usually in the format `YYMMDD`. This is
         * included in the transfer data sent to the receiving bank.
         */
        fun companyDescriptiveDate(companyDescriptiveDate: JsonField<String>) = apply {
            body.companyDescriptiveDate(companyDescriptiveDate)
        }

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /**
         * The data you choose to associate with the transfer. This is included in the transfer data
         * sent to the receiving bank.
         */
        fun companyDiscretionaryData(companyDiscretionaryData: JsonField<String>) = apply {
            body.companyDiscretionaryData(companyDiscretionaryData)
        }

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /**
         * A description of the transfer. This is included in the transfer data sent to the
         * receiving bank.
         */
        fun companyEntryDescription(companyEntryDescription: JsonField<String>) = apply {
            body.companyEntryDescription(companyEntryDescription)
        }

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(companyName: String) = apply { body.companyName(companyName) }

        /**
         * The name by which the recipient knows you. This is included in the transfer data sent to
         * the receiving bank.
         */
        fun companyName(companyName: JsonField<String>) = apply { body.companyName(companyName) }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(destinationAccountHolder: DestinationAccountHolder) = apply {
            body.destinationAccountHolder(destinationAccountHolder)
        }

        /** The type of entity that owns the account to which the ACH Transfer is being sent. */
        fun destinationAccountHolder(
            destinationAccountHolder: JsonField<DestinationAccountHolder>
        ) = apply { body.destinationAccountHolder(destinationAccountHolder) }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        fun externalAccountId(externalAccountId: String) = apply {
            body.externalAccountId(externalAccountId)
        }

        /**
         * The ID of an External Account to initiate a transfer to. If this parameter is provided,
         * `account_number`, `routing_number`, and `funding` must be absent.
         */
        fun externalAccountId(externalAccountId: JsonField<String>) = apply {
            body.externalAccountId(externalAccountId)
        }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: Funding) = apply { body.funding(funding) }

        /** The type of the account to which the transfer will be sent. */
        fun funding(funding: JsonField<Funding>) = apply { body.funding(funding) }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = apply { body.individualId(individualId) }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: JsonField<String>) = apply {
            body.individualId(individualId)
        }

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = apply { body.individualName(individualName) }

        /**
         * The name of the transfer recipient. This value is informational and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: JsonField<String>) = apply {
            body.individualName(individualName)
        }

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: PreferredEffectiveDate) = apply {
            body.preferredEffectiveDate(preferredEffectiveDate)
        }

        /**
         * Configuration for how the effective date of the transfer will be set. This determines
         * same-day vs future-dated settlement timing. If not set, defaults to a
         * `settlement_schedule` of `same_day`. If set, exactly one of the child attributes must be
         * set.
         */
        fun preferredEffectiveDate(preferredEffectiveDate: JsonField<PreferredEffectiveDate>) =
            apply {
                body.preferredEffectiveDate(preferredEffectiveDate)
            }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: Boolean) = apply {
            body.requireApproval(requireApproval)
        }

        /** Whether the transfer requires explicit approval via the dashboard or API. */
        fun requireApproval(requireApproval: JsonField<Boolean>) = apply {
            body.requireApproval(requireApproval)
        }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { body.routingNumber(routingNumber) }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: JsonField<String>) = apply {
            body.routingNumber(routingNumber)
        }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            body.standardEntryClassCode(standardEntryClassCode)
        }

        /** The Standard Entry Class (SEC) code to use for the transfer. */
        fun standardEntryClassCode(standardEntryClassCode: JsonField<StandardEntryClassCode>) =
            apply {
                body.standardEntryClassCode(standardEntryClassCode)
            }

        /** The timing of the transaction. */
        fun transactionTiming(transactionTiming: TransactionTiming) = apply {
            body.transactionTiming(transactionTiming)
        }

        /** The timing of the transaction. */
        fun transactionTiming(transactionTiming: JsonField<TransactionTiming>) = apply {
            body.transactionTiming(transactionTiming)
        }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            body.additionalProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            body.putAdditionalProperty(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                body.putAllAdditionalProperties(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply { body.removeAdditionalProperty(key) }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            body.removeAllAdditionalProperties(keys)
        }

        fun additionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllAdditionalHeaders(additionalHeaders)
        }

        fun putAdditionalHeader(name: String, value: String) = apply {
            additionalHeaders.put(name, value)
        }

        fun putAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.put(name, values)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun putAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.putAll(additionalHeaders)
        }

        fun replaceAdditionalHeaders(name: String, value: String) = apply {
            additionalHeaders.replace(name, value)
        }

        fun replaceAdditionalHeaders(name: String, values: Iterable<String>) = apply {
            additionalHeaders.replace(name, values)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Headers) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun replaceAllAdditionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.replaceAll(additionalHeaders)
        }

        fun removeAdditionalHeaders(name: String) = apply { additionalHeaders.remove(name) }

        fun removeAllAdditionalHeaders(names: Set<String>) = apply {
            additionalHeaders.removeAll(names)
        }

        fun additionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllAdditionalQueryParams(additionalQueryParams)
        }

        fun putAdditionalQueryParam(key: String, value: String) = apply {
            additionalQueryParams.put(key, value)
        }

        fun putAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.put(key, values)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.putAll(additionalQueryParams)
        }

        fun putAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.putAll(additionalQueryParams)
            }

        fun replaceAdditionalQueryParams(key: String, value: String) = apply {
            additionalQueryParams.replace(key, value)
        }

        fun replaceAdditionalQueryParams(key: String, values: Iterable<String>) = apply {
            additionalQueryParams.replace(key, values)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: QueryParams) = apply {
            this.additionalQueryParams.replaceAll(additionalQueryParams)
        }

        fun replaceAllAdditionalQueryParams(additionalQueryParams: Map<String, Iterable<String>>) =
            apply {
                this.additionalQueryParams.replaceAll(additionalQueryParams)
            }

        fun removeAdditionalQueryParams(key: String) = apply { additionalQueryParams.remove(key) }

        fun removeAllAdditionalQueryParams(keys: Set<String>) = apply {
            additionalQueryParams.removeAll(keys)
        }

        fun build(): AchTransferCreateParams =
            AchTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    /**
     * Additional information that will be sent to the recipient. This is included in the transfer
     * data sent to the receiving bank.
     */
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

        /** The type of addenda to pass with the transfer. */
        fun category(): Category = category.getRequired("category")

        /** Unstructured `payment_related_information` passed through with the transfer. */
        fun freeform(): Freeform? = freeform.getNullable("freeform")

        /**
         * Structured ASC X12 820 remittance advice records. Please reach out to
         * [support@increase.com](mailto:support@increase.com) for more information.
         */
        fun paymentOrderRemittanceAdvice(): PaymentOrderRemittanceAdvice? =
            paymentOrderRemittanceAdvice.getNullable("payment_order_remittance_advice")

        /** The type of addenda to pass with the transfer. */
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

            /**
             * Returns a mutable builder for constructing an instance of [Addenda].
             *
             * The following fields are required:
             * ```kotlin
             * .category()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Addenda]. */
        class Builder internal constructor() {

            private var category: JsonField<Category>? = null
            private var freeform: JsonField<Freeform> = JsonMissing.of()
            private var paymentOrderRemittanceAdvice: JsonField<PaymentOrderRemittanceAdvice> =
                JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(addenda: Addenda) = apply {
                category = addenda.category
                freeform = addenda.freeform
                paymentOrderRemittanceAdvice = addenda.paymentOrderRemittanceAdvice
                additionalProperties = addenda.additionalProperties.toMutableMap()
            }

            /** The type of addenda to pass with the transfer. */
            fun category(category: Category) = category(JsonField.of(category))

            /** The type of addenda to pass with the transfer. */
            fun category(category: JsonField<Category>) = apply { this.category = category }

            /** Unstructured `payment_related_information` passed through with the transfer. */
            fun freeform(freeform: Freeform) = freeform(JsonField.of(freeform))

            /** Unstructured `payment_related_information` passed through with the transfer. */
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
                    freeform,
                    paymentOrderRemittanceAdvice,
                    additionalProperties.toImmutable(),
                )
        }

        /** The type of addenda to pass with the transfer. */
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

            /**
             * Each entry represents an addendum sent with the transfer. Please reach out to
             * [support@increase.com](mailto:support@increase.com) to send more than one addendum.
             */
            fun entries(): List<Entry> = entries.getRequired("entries")

            /**
             * Each entry represents an addendum sent with the transfer. Please reach out to
             * [support@increase.com](mailto:support@increase.com) to send more than one addendum.
             */
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

                /**
                 * Returns a mutable builder for constructing an instance of [Freeform].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .entries()
                 * ```
                 */
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

                /**
                 * Each entry represents an addendum sent with the transfer. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send more than one
                 * addendum.
                 */
                fun entries(entries: List<Entry>) = entries(JsonField.of(entries))

                /**
                 * Each entry represents an addendum sent with the transfer. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send more than one
                 * addendum.
                 */
                fun entries(entries: JsonField<List<Entry>>) = apply {
                    this.entries = entries.map { it.toMutableList() }
                }

                /**
                 * Each entry represents an addendum sent with the transfer. Please reach out to
                 * [support@increase.com](mailto:support@increase.com) to send more than one
                 * addendum.
                 */
                fun addEntry(entry: Entry) = apply {
                    entries =
                        (entries ?: JsonField.of(mutableListOf())).also {
                            checkKnown("entries", it).add(entry)
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

                    /**
                     * Returns a mutable builder for constructing an instance of [Entry].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .paymentRelatedInformation()
                     * ```
                     */
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

                /**
                 * Returns a mutable builder for constructing an instance of
                 * [PaymentOrderRemittanceAdvice].
                 *
                 * The following fields are required:
                 * ```kotlin
                 * .invoices()
                 * ```
                 */
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
                        (invoices ?: JsonField.of(mutableListOf())).also {
                            checkKnown("invoices", it).add(invoice)
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

                    /**
                     * Returns a mutable builder for constructing an instance of [Invoice].
                     *
                     * The following fields are required:
                     * ```kotlin
                     * .invoiceNumber()
                     * .paidAmount()
                     * ```
                     */
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

            /**
             * Returns a mutable builder for constructing an instance of [PreferredEffectiveDate].
             */
            fun builder() = Builder()
        }

        /** A builder for [PreferredEffectiveDate]. */
        class Builder internal constructor() {

            private var date: JsonField<LocalDate> = JsonMissing.of()
            private var settlementSchedule: JsonField<SettlementSchedule> = JsonMissing.of()
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
            fun date(date: LocalDate) = date(JsonField.of(date))

            /**
             * A specific date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format to use
             * as the effective date when submitting this transfer.
             */
            fun date(date: JsonField<LocalDate>) = apply { this.date = date }

            /** A schedule by which Increase will choose an effective date for the transfer. */
            fun settlementSchedule(settlementSchedule: SettlementSchedule) =
                settlementSchedule(JsonField.of(settlementSchedule))

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
                PreferredEffectiveDate(date, settlementSchedule, additionalProperties.toImmutable())
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

    /** The timing of the transaction. */
    class TransactionTiming @JsonCreator private constructor(private val value: JsonField<String>) :
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

            /** A Transaction will be created immediately. */
            val SYNCHRONOUS = of("synchronous")

            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            val ASYNCHRONOUS = of("asynchronous")

            fun of(value: String) = TransactionTiming(JsonField.of(value))
        }

        /** An enum containing [TransactionTiming]'s known values. */
        enum class Known {
            /** A Transaction will be created immediately. */
            SYNCHRONOUS,
            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            ASYNCHRONOUS,
        }

        /**
         * An enum containing [TransactionTiming]'s known values, as well as an [_UNKNOWN] member.
         *
         * An instance of [TransactionTiming] can contain an unknown value in a couple of cases:
         * - It was deserialized from data that doesn't match any known member. For example, if the
         *   SDK is on an older version than the API, then the API may respond with new members that
         *   the SDK is unaware of.
         * - It was constructed with an arbitrary value using the [of] method.
         */
        enum class Value {
            /** A Transaction will be created immediately. */
            SYNCHRONOUS,
            /** A Transaction will be created when the funds settle at the Federal Reserve. */
            ASYNCHRONOUS,
            /**
             * An enum member indicating that [TransactionTiming] was instantiated with an unknown
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
                SYNCHRONOUS -> Value.SYNCHRONOUS
                ASYNCHRONOUS -> Value.ASYNCHRONOUS
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
                SYNCHRONOUS -> Known.SYNCHRONOUS
                ASYNCHRONOUS -> Known.ASYNCHRONOUS
                else -> throw IncreaseInvalidDataException("Unknown TransactionTiming: $value")
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

            return /* spotless:off */ other is TransactionTiming && value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "AchTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
