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
import java.util.Objects

class SimulationAchTransferReturnParams
constructor(
    private val achTransferId: String,
    private val reason: Reason?,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun achTransferId(): String = achTransferId

    fun reason(): Reason? = reason

    internal fun getBody(): SimulationAchTransferReturnBody {
        return SimulationAchTransferReturnBody(reason, additionalBodyProperties)
    }

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> achTransferId
            else -> ""
        }
    }

    @JsonDeserialize(builder = SimulationAchTransferReturnBody.Builder::class)
    @NoAutoDetect
    class SimulationAchTransferReturnBody
    internal constructor(
        private val reason: Reason?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         */
        @JsonProperty("reason") fun reason(): Reason? = reason

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var reason: Reason? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(simulationAchTransferReturnBody: SimulationAchTransferReturnBody) =
                apply {
                    this.reason = simulationAchTransferReturnBody.reason
                    additionalProperties(simulationAchTransferReturnBody.additionalProperties)
                }

            /**
             * The reason why the Federal Reserve or destination bank returned this transfer.
             * Defaults to `no_account`.
             */
            @JsonProperty("reason") fun reason(reason: Reason) = apply { this.reason = reason }

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

            fun build(): SimulationAchTransferReturnBody =
                SimulationAchTransferReturnBody(reason, additionalProperties.toImmutable())
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is SimulationAchTransferReturnBody && this.reason == other.reason && this.additionalProperties == other.additionalProperties /* spotless:on */
        }

        private var hashCode: Int = 0

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode = /* spotless:off */ Objects.hash(reason, additionalProperties) /* spotless:on */
            }
            return hashCode
        }

        override fun toString() =
            "SimulationAchTransferReturnBody{reason=$reason, additionalProperties=$additionalProperties}"
    }

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = additionalBodyProperties

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationAchTransferReturnParams && this.achTransferId == other.achTransferId && this.reason == other.reason && this.additionalHeaders == other.additionalHeaders && this.additionalQueryParams == other.additionalQueryParams && this.additionalBodyProperties == other.additionalBodyProperties /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(achTransferId, reason, additionalHeaders, additionalQueryParams, additionalBodyProperties) /* spotless:on */
    }

    override fun toString() =
        "SimulationAchTransferReturnParams{achTransferId=$achTransferId, reason=$reason, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var achTransferId: String? = null
        private var reason: Reason? = null
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(simulationAchTransferReturnParams: SimulationAchTransferReturnParams) =
            apply {
                this.achTransferId = simulationAchTransferReturnParams.achTransferId
                this.reason = simulationAchTransferReturnParams.reason
                additionalHeaders(simulationAchTransferReturnParams.additionalHeaders)
                additionalQueryParams(simulationAchTransferReturnParams.additionalQueryParams)
                additionalBodyProperties(simulationAchTransferReturnParams.additionalBodyProperties)
            }

        /** The identifier of the ACH Transfer you wish to return. */
        fun achTransferId(achTransferId: String) = apply { this.achTransferId = achTransferId }

        /**
         * The reason why the Federal Reserve or destination bank returned this transfer. Defaults
         * to `no_account`.
         */
        fun reason(reason: Reason) = apply { this.reason = reason }

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

        fun build(): SimulationAchTransferReturnParams =
            SimulationAchTransferReturnParams(
                checkNotNull(achTransferId) { "`achTransferId` is required but was not set" },
                reason,
                additionalHeaders.build(),
                additionalQueryParams.build(),
                additionalBodyProperties.toImmutable(),
            )
    }

    class Reason
    @JsonCreator
    private constructor(
        private val value: JsonField<String>,
    ) : Enum {

        @com.fasterxml.jackson.annotation.JsonValue fun _value(): JsonField<String> = value

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Reason && this.value == other.value /* spotless:on */
        }

        override fun hashCode() = value.hashCode()

        override fun toString() = value.toString()

        companion object {

            val INSUFFICIENT_FUND = Reason(JsonField.of("insufficient_fund"))

            val NO_ACCOUNT = Reason(JsonField.of("no_account"))

            val ACCOUNT_CLOSED = Reason(JsonField.of("account_closed"))

            val INVALID_ACCOUNT_NUMBER_STRUCTURE =
                Reason(JsonField.of("invalid_account_number_structure"))

            val ACCOUNT_FROZEN_ENTRY_RETURNED_PER_OFAC_INSTRUCTION =
                Reason(JsonField.of("account_frozen_entry_returned_per_ofac_instruction"))

            val CREDIT_ENTRY_REFUSED_BY_RECEIVER =
                Reason(JsonField.of("credit_entry_refused_by_receiver"))

            val UNAUTHORIZED_DEBIT_TO_CONSUMER_ACCOUNT_USING_CORPORATE_SEC_CODE =
                Reason(
                    JsonField.of("unauthorized_debit_to_consumer_account_using_corporate_sec_code")
                )

            val CORPORATE_CUSTOMER_ADVISED_NOT_AUTHORIZED =
                Reason(JsonField.of("corporate_customer_advised_not_authorized"))

            val PAYMENT_STOPPED = Reason(JsonField.of("payment_stopped"))

            val NON_TRANSACTION_ACCOUNT = Reason(JsonField.of("non_transaction_account"))

            val UNCOLLECTED_FUNDS = Reason(JsonField.of("uncollected_funds"))

            val ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                Reason(JsonField.of("routing_number_check_digit_error"))

            val CUSTOMER_ADVISED_UNAUTHORIZED_IMPROPER_INELIGIBLE_OR_INCOMPLETE =
                Reason(
                    JsonField.of("customer_advised_unauthorized_improper_ineligible_or_incomplete")
                )

            val AMOUNT_FIELD_ERROR = Reason(JsonField.of("amount_field_error"))

            val AUTHORIZATION_REVOKED_BY_CUSTOMER =
                Reason(JsonField.of("authorization_revoked_by_customer"))

            val INVALID_ACH_ROUTING_NUMBER = Reason(JsonField.of("invalid_ach_routing_number"))

            val FILE_RECORD_EDIT_CRITERIA = Reason(JsonField.of("file_record_edit_criteria"))

            val ENR_INVALID_INDIVIDUAL_NAME = Reason(JsonField.of("enr_invalid_individual_name"))

            val RETURNED_PER_ODFI_REQUEST = Reason(JsonField.of("returned_per_odfi_request"))

            val LIMITED_PARTICIPATION_DFI = Reason(JsonField.of("limited_participation_dfi"))

            val INCORRECTLY_CODED_OUTBOUND_INTERNATIONAL_PAYMENT =
                Reason(JsonField.of("incorrectly_coded_outbound_international_payment"))

            val ACCOUNT_SOLD_TO_ANOTHER_DFI = Reason(JsonField.of("account_sold_to_another_dfi"))

            val ADDENDA_ERROR = Reason(JsonField.of("addenda_error"))

            val BENEFICIARY_OR_ACCOUNT_HOLDER_DECEASED =
                Reason(JsonField.of("beneficiary_or_account_holder_deceased"))

            val CUSTOMER_ADVISED_NOT_WITHIN_AUTHORIZATION_TERMS =
                Reason(JsonField.of("customer_advised_not_within_authorization_terms"))

            val CORRECTED_RETURN = Reason(JsonField.of("corrected_return"))

            val DUPLICATE_ENTRY = Reason(JsonField.of("duplicate_entry"))

            val DUPLICATE_RETURN = Reason(JsonField.of("duplicate_return"))

            val ENR_DUPLICATE_ENROLLMENT = Reason(JsonField.of("enr_duplicate_enrollment"))

            val ENR_INVALID_DFI_ACCOUNT_NUMBER =
                Reason(JsonField.of("enr_invalid_dfi_account_number"))

            val ENR_INVALID_INDIVIDUAL_ID_NUMBER =
                Reason(JsonField.of("enr_invalid_individual_id_number"))

            val ENR_INVALID_REPRESENTATIVE_PAYEE_INDICATOR =
                Reason(JsonField.of("enr_invalid_representative_payee_indicator"))

            val ENR_INVALID_TRANSACTION_CODE = Reason(JsonField.of("enr_invalid_transaction_code"))

            val ENR_RETURN_OF_ENR_ENTRY = Reason(JsonField.of("enr_return_of_enr_entry"))

            val ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR =
                Reason(JsonField.of("enr_routing_number_check_digit_error"))

            val ENTRY_NOT_PROCESSED_BY_GATEWAY =
                Reason(JsonField.of("entry_not_processed_by_gateway"))

            val FIELD_ERROR = Reason(JsonField.of("field_error"))

            val FOREIGN_RECEIVING_DFI_UNABLE_TO_SETTLE =
                Reason(JsonField.of("foreign_receiving_dfi_unable_to_settle"))

            val IAT_ENTRY_CODING_ERROR = Reason(JsonField.of("iat_entry_coding_error"))

            val IMPROPER_EFFECTIVE_ENTRY_DATE =
                Reason(JsonField.of("improper_effective_entry_date"))

            val IMPROPER_SOURCE_DOCUMENT_SOURCE_DOCUMENT_PRESENTED =
                Reason(JsonField.of("improper_source_document_source_document_presented"))

            val INVALID_COMPANY_ID = Reason(JsonField.of("invalid_company_id"))

            val INVALID_FOREIGN_RECEIVING_DFI_IDENTIFICATION =
                Reason(JsonField.of("invalid_foreign_receiving_dfi_identification"))

            val INVALID_INDIVIDUAL_ID_NUMBER = Reason(JsonField.of("invalid_individual_id_number"))

            val ITEM_AND_RCK_ENTRY_PRESENTED_FOR_PAYMENT =
                Reason(JsonField.of("item_and_rck_entry_presented_for_payment"))

            val ITEM_RELATED_TO_RCK_ENTRY_IS_INELIGIBLE =
                Reason(JsonField.of("item_related_to_rck_entry_is_ineligible"))

            val MANDATORY_FIELD_ERROR = Reason(JsonField.of("mandatory_field_error"))

            val MISROUTED_DISHONORED_RETURN = Reason(JsonField.of("misrouted_dishonored_return"))

            val MISROUTED_RETURN = Reason(JsonField.of("misrouted_return"))

            val NO_ERRORS_FOUND = Reason(JsonField.of("no_errors_found"))

            val NON_ACCEPTANCE_OF_R62_DISHONORED_RETURN =
                Reason(JsonField.of("non_acceptance_of_r62_dishonored_return"))

            val NON_PARTICIPANT_IN_IAT_PROGRAM =
                Reason(JsonField.of("non_participant_in_iat_program"))

            val PERMISSIBLE_RETURN_ENTRY = Reason(JsonField.of("permissible_return_entry"))

            val PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED =
                Reason(JsonField.of("permissible_return_entry_not_accepted"))

            val RDFI_NON_SETTLEMENT = Reason(JsonField.of("rdfi_non_settlement"))

            val RDFI_PARTICIPANT_IN_CHECK_TRUNCATION_PROGRAM =
                Reason(JsonField.of("rdfi_participant_in_check_truncation_program"))

            val REPRESENTATIVE_PAYEE_DECEASED_OR_UNABLE_TO_CONTINUE_IN_THAT_CAPACITY =
                Reason(
                    JsonField.of(
                        "representative_payee_deceased_or_unable_to_continue_in_that_capacity"
                    )
                )

            val RETURN_NOT_A_DUPLICATE = Reason(JsonField.of("return_not_a_duplicate"))

            val RETURN_OF_ERRONEOUS_OR_REVERSING_DEBIT =
                Reason(JsonField.of("return_of_erroneous_or_reversing_debit"))

            val RETURN_OF_IMPROPER_CREDIT_ENTRY =
                Reason(JsonField.of("return_of_improper_credit_entry"))

            val RETURN_OF_IMPROPER_DEBIT_ENTRY =
                Reason(JsonField.of("return_of_improper_debit_entry"))

            val RETURN_OF_XCK_ENTRY = Reason(JsonField.of("return_of_xck_entry"))

            val SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT =
                Reason(JsonField.of("source_document_presented_for_payment"))

            val STATE_LAW_AFFECTING_RCK_ACCEPTANCE =
                Reason(JsonField.of("state_law_affecting_rck_acceptance"))

            val STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY =
                Reason(JsonField.of("stop_payment_on_item_related_to_rck_entry"))

            val STOP_PAYMENT_ON_SOURCE_DOCUMENT =
                Reason(JsonField.of("stop_payment_on_source_document"))

            val TIMELY_ORIGINAL_RETURN = Reason(JsonField.of("timely_original_return"))

            val TRACE_NUMBER_ERROR = Reason(JsonField.of("trace_number_error"))

            val UNTIMELY_DISHONORED_RETURN = Reason(JsonField.of("untimely_dishonored_return"))

            val UNTIMELY_RETURN = Reason(JsonField.of("untimely_return"))

            fun of(value: String) = Reason(JsonField.of(value))
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
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Value.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
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
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED -> Value.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
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
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT -> Value.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
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
                ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR -> Known.ENR_ROUTING_NUMBER_CHECK_DIGIT_ERROR
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
                PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED -> Known.PERMISSIBLE_RETURN_ENTRY_NOT_ACCEPTED
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
                SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT -> Known.SOURCE_DOCUMENT_PRESENTED_FOR_PAYMENT
                STATE_LAW_AFFECTING_RCK_ACCEPTANCE -> Known.STATE_LAW_AFFECTING_RCK_ACCEPTANCE
                STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY ->
                    Known.STOP_PAYMENT_ON_ITEM_RELATED_TO_RCK_ENTRY
                STOP_PAYMENT_ON_SOURCE_DOCUMENT -> Known.STOP_PAYMENT_ON_SOURCE_DOCUMENT
                TIMELY_ORIGINAL_RETURN -> Known.TIMELY_ORIGINAL_RETURN
                TRACE_NUMBER_ERROR -> Known.TRACE_NUMBER_ERROR
                UNTIMELY_DISHONORED_RETURN -> Known.UNTIMELY_DISHONORED_RETURN
                UNTIMELY_RETURN -> Known.UNTIMELY_RETURN
                else -> throw IncreaseInvalidDataException("Unknown Reason: $value")
            }

        fun asString(): String = _value().asStringOrThrow()
    }
}
