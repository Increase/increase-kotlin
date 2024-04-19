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
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects

class AchPrenotificationCreateParams
constructor(
    private val accountNumber: String,
    private val routingNumber: String,
    private val accountId: String?,
    private val addendum: String?,
    private val companyDescriptiveDate: String?,
    private val companyDiscretionaryData: String?,
    private val companyEntryDescription: String?,
    private val companyName: String?,
    private val creditDebitIndicator: CreditDebitIndicator?,
    private val effectiveDate: LocalDate?,
    private val individualId: String?,
    private val individualName: String?,
    private val standardEntryClassCode: StandardEntryClassCode?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumber(): String = accountNumber

    fun routingNumber(): String = routingNumber

    fun accountId(): String? = accountId

    fun addendum(): String? = addendum

    fun companyDescriptiveDate(): String? = companyDescriptiveDate

    fun companyDiscretionaryData(): String? = companyDiscretionaryData

    fun companyEntryDescription(): String? = companyEntryDescription

    fun companyName(): String? = companyName

    fun creditDebitIndicator(): CreditDebitIndicator? = creditDebitIndicator

    fun effectiveDate(): LocalDate? = effectiveDate

    fun individualId(): String? = individualId

    fun individualName(): String? = individualName

    fun standardEntryClassCode(): StandardEntryClassCode? = standardEntryClassCode

    internal fun getBody(): AchPrenotificationCreateBody {
        return AchPrenotificationCreateBody(
            accountNumber,
            routingNumber,
            accountId,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            creditDebitIndicator,
            effectiveDate,
            individualId,
            individualName,
            standardEntryClassCode,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = AchPrenotificationCreateBody.Builder::class)
    @NoAutoDetect
    class AchPrenotificationCreateBody
    internal constructor(
        private val accountNumber: String?,
        private val routingNumber: String?,
        private val accountId: String?,
        private val addendum: String?,
        private val companyDescriptiveDate: String?,
        private val companyDiscretionaryData: String?,
        private val companyEntryDescription: String?,
        private val companyName: String?,
        private val creditDebitIndicator: CreditDebitIndicator?,
        private val effectiveDate: LocalDate?,
        private val individualId: String?,
        private val individualName: String?,
        private val standardEntryClassCode: StandardEntryClassCode?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The account number for the destination account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** Additional information that will be sent to the recipient. */
        @JsonProperty("addendum") fun addendum(): String? = addendum

        /** The description of the date of the transfer. */
        @JsonProperty("company_descriptive_date")
        fun companyDescriptiveDate(): String? = companyDescriptiveDate

        /** The data you choose to associate with the transfer. */
        @JsonProperty("company_discretionary_data")
        fun companyDiscretionaryData(): String? = companyDiscretionaryData

        /** The description of the transfer you wish to be shown to the recipient. */
        @JsonProperty("company_entry_description")
        fun companyEntryDescription(): String? = companyEntryDescription

        /** The name by which the recipient knows you. */
        @JsonProperty("company_name") fun companyName(): String? = companyName

        /** Whether the Prenotification is for a future debit or credit. */
        @JsonProperty("credit_debit_indicator")
        fun creditDebitIndicator(): CreditDebitIndicator? = creditDebitIndicator

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        @JsonProperty("effective_date") fun effectiveDate(): LocalDate? = effectiveDate

        /** Your identifier for the transfer recipient. */
        @JsonProperty("individual_id") fun individualId(): String? = individualId

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        @JsonProperty("individual_name") fun individualName(): String? = individualName

        /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
        @JsonProperty("standard_entry_class_code")
        fun standardEntryClassCode(): StandardEntryClassCode? = standardEntryClassCode

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is AchPrenotificationCreateBody &&
                this.accountNumber == other.accountNumber &&
                this.routingNumber == other.routingNumber &&
                this.accountId == other.accountId &&
                this.addendum == other.addendum &&
                this.companyDescriptiveDate == other.companyDescriptiveDate &&
                this.companyDiscretionaryData == other.companyDiscretionaryData &&
                this.companyEntryDescription == other.companyEntryDescription &&
                this.companyName == other.companyName &&
                this.creditDebitIndicator == other.creditDebitIndicator &&
                this.effectiveDate == other.effectiveDate &&
                this.individualId == other.individualId &&
                this.individualName == other.individualName &&
                this.standardEntryClassCode == other.standardEntryClassCode &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumber,
                        routingNumber,
                        accountId,
                        addendum,
                        companyDescriptiveDate,
                        companyDiscretionaryData,
                        companyEntryDescription,
                        companyName,
                        creditDebitIndicator,
                        effectiveDate,
                        individualId,
                        individualName,
                        standardEntryClassCode,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "AchPrenotificationCreateBody{accountNumber=$accountNumber, routingNumber=$routingNumber, accountId=$accountId, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountNumber: String? = null
            private var routingNumber: String? = null
            private var accountId: String? = null
            private var addendum: String? = null
            private var companyDescriptiveDate: String? = null
            private var companyDiscretionaryData: String? = null
            private var companyEntryDescription: String? = null
            private var companyName: String? = null
            private var creditDebitIndicator: CreditDebitIndicator? = null
            private var effectiveDate: LocalDate? = null
            private var individualId: String? = null
            private var individualName: String? = null
            private var standardEntryClassCode: StandardEntryClassCode? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(achPrenotificationCreateBody: AchPrenotificationCreateBody) = apply {
                this.accountNumber = achPrenotificationCreateBody.accountNumber
                this.routingNumber = achPrenotificationCreateBody.routingNumber
                this.accountId = achPrenotificationCreateBody.accountId
                this.addendum = achPrenotificationCreateBody.addendum
                this.companyDescriptiveDate = achPrenotificationCreateBody.companyDescriptiveDate
                this.companyDiscretionaryData =
                    achPrenotificationCreateBody.companyDiscretionaryData
                this.companyEntryDescription = achPrenotificationCreateBody.companyEntryDescription
                this.companyName = achPrenotificationCreateBody.companyName
                this.creditDebitIndicator = achPrenotificationCreateBody.creditDebitIndicator
                this.effectiveDate = achPrenotificationCreateBody.effectiveDate
                this.individualId = achPrenotificationCreateBody.individualId
                this.individualName = achPrenotificationCreateBody.individualName
                this.standardEntryClassCode = achPrenotificationCreateBody.standardEntryClassCode
                additionalProperties(achPrenotificationCreateBody.additionalProperties)
            }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

            /** The Increase identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** Additional information that will be sent to the recipient. */
            @JsonProperty("addendum")
            fun addendum(addendum: String) = apply { this.addendum = addendum }

            /** The description of the date of the transfer. */
            @JsonProperty("company_descriptive_date")
            fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
                this.companyDescriptiveDate = companyDescriptiveDate
            }

            /** The data you choose to associate with the transfer. */
            @JsonProperty("company_discretionary_data")
            fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
                this.companyDiscretionaryData = companyDiscretionaryData
            }

            /** The description of the transfer you wish to be shown to the recipient. */
            @JsonProperty("company_entry_description")
            fun companyEntryDescription(companyEntryDescription: String) = apply {
                this.companyEntryDescription = companyEntryDescription
            }

            /** The name by which the recipient knows you. */
            @JsonProperty("company_name")
            fun companyName(companyName: String) = apply { this.companyName = companyName }

            /** Whether the Prenotification is for a future debit or credit. */
            @JsonProperty("credit_debit_indicator")
            fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) = apply {
                this.creditDebitIndicator = creditDebitIndicator
            }

            /**
             * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601)
             * format.
             */
            @JsonProperty("effective_date")
            fun effectiveDate(effectiveDate: LocalDate) = apply {
                this.effectiveDate = effectiveDate
            }

            /** Your identifier for the transfer recipient. */
            @JsonProperty("individual_id")
            fun individualId(individualId: String) = apply { this.individualId = individualId }

            /**
             * The name of the transfer recipient. This value is information and not verified by the
             * recipient's bank.
             */
            @JsonProperty("individual_name")
            fun individualName(individualName: String) = apply {
                this.individualName = individualName
            }

            /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
            @JsonProperty("standard_entry_class_code")
            fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
                this.standardEntryClassCode = standardEntryClassCode
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

            fun build(): AchPrenotificationCreateBody =
                AchPrenotificationCreateBody(
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                    accountId,
                    addendum,
                    companyDescriptiveDate,
                    companyDiscretionaryData,
                    companyEntryDescription,
                    companyName,
                    creditDebitIndicator,
                    effectiveDate,
                    individualId,
                    individualName,
                    standardEntryClassCode,
                    additionalProperties.toUnmodifiable(),
                )
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchPrenotificationCreateParams &&
            this.accountNumber == other.accountNumber &&
            this.routingNumber == other.routingNumber &&
            this.accountId == other.accountId &&
            this.addendum == other.addendum &&
            this.companyDescriptiveDate == other.companyDescriptiveDate &&
            this.companyDiscretionaryData == other.companyDiscretionaryData &&
            this.companyEntryDescription == other.companyEntryDescription &&
            this.companyName == other.companyName &&
            this.creditDebitIndicator == other.creditDebitIndicator &&
            this.effectiveDate == other.effectiveDate &&
            this.individualId == other.individualId &&
            this.individualName == other.individualName &&
            this.standardEntryClassCode == other.standardEntryClassCode &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumber,
            routingNumber,
            accountId,
            addendum,
            companyDescriptiveDate,
            companyDiscretionaryData,
            companyEntryDescription,
            companyName,
            creditDebitIndicator,
            effectiveDate,
            individualId,
            individualName,
            standardEntryClassCode,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "AchPrenotificationCreateParams{accountNumber=$accountNumber, routingNumber=$routingNumber, accountId=$accountId, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumber: String? = null
        private var routingNumber: String? = null
        private var accountId: String? = null
        private var addendum: String? = null
        private var companyDescriptiveDate: String? = null
        private var companyDiscretionaryData: String? = null
        private var companyEntryDescription: String? = null
        private var companyName: String? = null
        private var creditDebitIndicator: CreditDebitIndicator? = null
        private var effectiveDate: LocalDate? = null
        private var individualId: String? = null
        private var individualName: String? = null
        private var standardEntryClassCode: StandardEntryClassCode? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(achPrenotificationCreateParams: AchPrenotificationCreateParams) = apply {
            this.accountNumber = achPrenotificationCreateParams.accountNumber
            this.routingNumber = achPrenotificationCreateParams.routingNumber
            this.accountId = achPrenotificationCreateParams.accountId
            this.addendum = achPrenotificationCreateParams.addendum
            this.companyDescriptiveDate = achPrenotificationCreateParams.companyDescriptiveDate
            this.companyDiscretionaryData = achPrenotificationCreateParams.companyDiscretionaryData
            this.companyEntryDescription = achPrenotificationCreateParams.companyEntryDescription
            this.companyName = achPrenotificationCreateParams.companyName
            this.creditDebitIndicator = achPrenotificationCreateParams.creditDebitIndicator
            this.effectiveDate = achPrenotificationCreateParams.effectiveDate
            this.individualId = achPrenotificationCreateParams.individualId
            this.individualName = achPrenotificationCreateParams.individualName
            this.standardEntryClassCode = achPrenotificationCreateParams.standardEntryClassCode
            additionalQueryParams(achPrenotificationCreateParams.additionalQueryParams)
            additionalHeaders(achPrenotificationCreateParams.additionalHeaders)
            additionalBodyProperties(achPrenotificationCreateParams.additionalBodyProperties)
        }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** Additional information that will be sent to the recipient. */
        fun addendum(addendum: String) = apply { this.addendum = addendum }

        /** The description of the date of the transfer. */
        fun companyDescriptiveDate(companyDescriptiveDate: String) = apply {
            this.companyDescriptiveDate = companyDescriptiveDate
        }

        /** The data you choose to associate with the transfer. */
        fun companyDiscretionaryData(companyDiscretionaryData: String) = apply {
            this.companyDiscretionaryData = companyDiscretionaryData
        }

        /** The description of the transfer you wish to be shown to the recipient. */
        fun companyEntryDescription(companyEntryDescription: String) = apply {
            this.companyEntryDescription = companyEntryDescription
        }

        /** The name by which the recipient knows you. */
        fun companyName(companyName: String) = apply { this.companyName = companyName }

        /** Whether the Prenotification is for a future debit or credit. */
        fun creditDebitIndicator(creditDebitIndicator: CreditDebitIndicator) = apply {
            this.creditDebitIndicator = creditDebitIndicator
        }

        /**
         * The transfer effective date in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format.
         */
        fun effectiveDate(effectiveDate: LocalDate) = apply { this.effectiveDate = effectiveDate }

        /** Your identifier for the transfer recipient. */
        fun individualId(individualId: String) = apply { this.individualId = individualId }

        /**
         * The name of the transfer recipient. This value is information and not verified by the
         * recipient's bank.
         */
        fun individualName(individualName: String) = apply { this.individualName = individualName }

        /** The Standard Entry Class (SEC) code to use for the ACH Prenotification. */
        fun standardEntryClassCode(standardEntryClassCode: StandardEntryClassCode) = apply {
            this.standardEntryClassCode = standardEntryClassCode
        }

        fun additionalQueryParams(additionalQueryParams: Map<String, List<String>>) = apply {
            this.additionalQueryParams.clear()
            putAllQueryParams(additionalQueryParams)
        }

        fun putQueryParam(name: String, value: String) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putQueryParams(name: String, values: Iterable<String>) = apply {
            this.additionalQueryParams.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllQueryParams(additionalQueryParams: Map<String, Iterable<String>>) = apply {
            additionalQueryParams.forEach(this::putQueryParams)
        }

        fun removeQueryParam(name: String) = apply {
            this.additionalQueryParams.put(name, mutableListOf())
        }

        fun additionalHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            this.additionalHeaders.clear()
            putAllHeaders(additionalHeaders)
        }

        fun putHeader(name: String, value: String) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.add(value)
        }

        fun putHeaders(name: String, values: Iterable<String>) = apply {
            this.additionalHeaders.getOrPut(name) { mutableListOf() }.addAll(values)
        }

        fun putAllHeaders(additionalHeaders: Map<String, Iterable<String>>) = apply {
            additionalHeaders.forEach(this::putHeaders)
        }

        fun removeHeader(name: String) = apply { this.additionalHeaders.put(name, mutableListOf()) }

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            this.additionalBodyProperties.putAll(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            this.additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun build(): AchPrenotificationCreateParams =
            AchPrenotificationCreateParams(
                checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
                accountId,
                addendum,
                companyDescriptiveDate,
                companyDiscretionaryData,
                companyEntryDescription,
                companyName,
                creditDebitIndicator,
                effectiveDate,
                individualId,
                individualName,
                standardEntryClassCode,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }

    class CreditDebitIndicator
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is CreditDebitIndicator && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CREDIT = CreditDebitIndicator(JsonField.of("credit"))

            val DEBIT = CreditDebitIndicator(JsonField.of("debit"))

            fun of(value: String) = CreditDebitIndicator(JsonField.of(value))
        }

        enum class Known {
            CREDIT,
            DEBIT,
        }

        enum class Value {
            CREDIT,
            DEBIT,
            _UNKNOWN,
        }

        fun value(): Value =
            when (this) {
                CREDIT -> Value.CREDIT
                DEBIT -> Value.DEBIT
                else -> Value._UNKNOWN
            }

        fun known(): Known =
            when (this) {
                CREDIT -> Known.CREDIT
                DEBIT -> Known.DEBIT
                else -> throw IncreaseInvalidDataException("Unknown CreditDebitIndicator: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }

    class StandardEntryClassCode
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is StandardEntryClassCode && this.value == other.value
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val CORPORATE_CREDIT_OR_DEBIT =
                StandardEntryClassCode(JsonField.of("corporate_credit_or_debit"))

            val CORPORATE_TRADE_EXCHANGE =
                StandardEntryClassCode(JsonField.of("corporate_trade_exchange"))

            val PREARRANGED_PAYMENTS_AND_DEPOSIT =
                StandardEntryClassCode(JsonField.of("prearranged_payments_and_deposit"))

            val INTERNET_INITIATED = StandardEntryClassCode(JsonField.of("internet_initiated"))

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
    }
}
