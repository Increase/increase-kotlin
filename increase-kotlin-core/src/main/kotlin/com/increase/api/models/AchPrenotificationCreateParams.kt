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
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.toImmutable
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.*
import java.time.LocalDate
import java.util.Objects

class AchPrenotificationCreateParams
constructor(
    private val accountId: String,
    private val accountNumber: String,
    private val routingNumber: String,
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
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountId(): String = accountId

    fun accountNumber(): String = accountNumber

    fun routingNumber(): String = routingNumber

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    internal fun getBody(): AchPrenotificationCreateBody {
        return AchPrenotificationCreateBody(
            accountId,
            accountNumber,
            routingNumber,
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

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @JsonDeserialize(builder = AchPrenotificationCreateBody.Builder::class)
    @NoAutoDetect
    class AchPrenotificationCreateBody
    internal constructor(
        private val accountId: String?,
        private val accountNumber: String?,
        private val routingNumber: String?,
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

        /** The Increase identifier for the account that will send the transfer. */
        @JsonProperty("account_id") fun accountId(): String? = accountId

        /** The account number for the destination account. */
        @JsonProperty("account_number") fun accountNumber(): String? = accountNumber

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        @JsonProperty("routing_number") fun routingNumber(): String? = routingNumber

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

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountId: String? = null
            private var accountNumber: String? = null
            private var routingNumber: String? = null
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
                this.accountId = achPrenotificationCreateBody.accountId
                this.accountNumber = achPrenotificationCreateBody.accountNumber
                this.routingNumber = achPrenotificationCreateBody.routingNumber
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

            /** The Increase identifier for the account that will send the transfer. */
            @JsonProperty("account_id")
            fun accountId(accountId: String) = apply { this.accountId = accountId }

            /** The account number for the destination account. */
            @JsonProperty("account_number")
            fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

            /**
             * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the
             * destination account.
             */
            @JsonProperty("routing_number")
            fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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
                    checkNotNull(accountId) { "`accountId` is required but was not set" },
                    checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                    checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
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
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is AchPrenotificationCreateBody && accountId == other.accountId && accountNumber == other.accountNumber && routingNumber == other.routingNumber && addendum == other.addendum && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && creditDebitIndicator == other.creditDebitIndicator && effectiveDate == other.effectiveDate && individualId == other.individualId && individualName == other.individualName && standardEntryClassCode == other.standardEntryClassCode && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountId, accountNumber, routingNumber, addendum, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, creditDebitIndicator, effectiveDate, individualId, individualName, standardEntryClassCode, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "AchPrenotificationCreateBody{accountId=$accountId, accountNumber=$accountNumber, routingNumber=$routingNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountId: String? = null
        private var accountNumber: String? = null
        private var routingNumber: String? = null
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
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(achPrenotificationCreateParams: AchPrenotificationCreateParams) = apply {
            accountId = achPrenotificationCreateParams.accountId
            accountNumber = achPrenotificationCreateParams.accountNumber
            routingNumber = achPrenotificationCreateParams.routingNumber
            addendum = achPrenotificationCreateParams.addendum
            companyDescriptiveDate = achPrenotificationCreateParams.companyDescriptiveDate
            companyDiscretionaryData = achPrenotificationCreateParams.companyDiscretionaryData
            companyEntryDescription = achPrenotificationCreateParams.companyEntryDescription
            companyName = achPrenotificationCreateParams.companyName
            creditDebitIndicator = achPrenotificationCreateParams.creditDebitIndicator
            effectiveDate = achPrenotificationCreateParams.effectiveDate
            individualId = achPrenotificationCreateParams.individualId
            individualName = achPrenotificationCreateParams.individualName
            standardEntryClassCode = achPrenotificationCreateParams.standardEntryClassCode
            additionalHeaders = achPrenotificationCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams = achPrenotificationCreateParams.additionalQueryParams.toBuilder()
            additionalBodyProperties =
                achPrenotificationCreateParams.additionalBodyProperties.toMutableMap()
        }

        /** The Increase identifier for the account that will send the transfer. */
        fun accountId(accountId: String) = apply { this.accountId = accountId }

        /** The account number for the destination account. */
        fun accountNumber(accountNumber: String) = apply { this.accountNumber = accountNumber }

        /**
         * The American Bankers' Association (ABA) Routing Transit Number (RTN) for the destination
         * account.
         */
        fun routingNumber(routingNumber: String) = apply { this.routingNumber = routingNumber }

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

        fun additionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) = apply {
            this.additionalBodyProperties.clear()
            putAllAdditionalBodyProperties(additionalBodyProperties)
        }

        fun putAdditionalBodyProperty(key: String, value: JsonValue) = apply {
            additionalBodyProperties.put(key, value)
        }

        fun putAllAdditionalBodyProperties(additionalBodyProperties: Map<String, JsonValue>) =
            apply {
                this.additionalBodyProperties.putAll(additionalBodyProperties)
            }

        fun removeAdditionalBodyProperty(key: String) = apply {
            additionalBodyProperties.remove(key)
        }

        fun removeAllAdditionalBodyProperties(keys: Set<String>) = apply {
            keys.forEach(::removeAdditionalBodyProperty)
        }

        fun build(): AchPrenotificationCreateParams =
            AchPrenotificationCreateParams(
                checkNotNull(accountId) { "`accountId` is required but was not set" },
                checkNotNull(accountNumber) { "`accountNumber` is required but was not set" },
                checkNotNull(routingNumber) { "`routingNumber` is required but was not set" },
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
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
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

            return /* spotless:off */ other is CreditDebitIndicator && value == other.value /* spotless:on */
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

            return /* spotless:off */ other is StandardEntryClassCode && value == other.value /* spotless:on */
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchPrenotificationCreateParams && accountId == other.accountId && accountNumber == other.accountNumber && routingNumber == other.routingNumber && addendum == other.addendum && companyDescriptiveDate == other.companyDescriptiveDate && companyDiscretionaryData == other.companyDiscretionaryData && companyEntryDescription == other.companyEntryDescription && companyName == other.companyName && creditDebitIndicator == other.creditDebitIndicator && effectiveDate == other.effectiveDate && individualId == other.individualId && individualName == other.individualName && standardEntryClassCode == other.standardEntryClassCode && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams && additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountId, accountNumber, routingNumber, addendum, companyDescriptiveDate, companyDiscretionaryData, companyEntryDescription, companyName, creditDebitIndicator, effectiveDate, individualId, individualName, standardEntryClassCode, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */

    override fun toString() =
        "AchPrenotificationCreateParams{accountId=$accountId, accountNumber=$accountNumber, routingNumber=$routingNumber, addendum=$addendum, companyDescriptiveDate=$companyDescriptiveDate, companyDiscretionaryData=$companyDiscretionaryData, companyEntryDescription=$companyEntryDescription, companyName=$companyName, creditDebitIndicator=$creditDebitIndicator, effectiveDate=$effectiveDate, individualId=$individualId, individualName=$individualName, standardEntryClassCode=$standardEntryClassCode, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"
}
