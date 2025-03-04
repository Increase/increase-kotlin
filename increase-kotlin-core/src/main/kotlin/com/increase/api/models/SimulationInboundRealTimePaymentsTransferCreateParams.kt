// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonField
import com.increase.api.core.JsonMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.Params
import com.increase.api.core.checkRequired
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

/**
 * Simulates an [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to your
 * account. Real-Time Payments are a beta feature.
 */
class SimulationInboundRealTimePaymentsTransferCreateParams
private constructor(
    private val body: Body,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) : Params {

    /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
    fun accountNumberId(): String = body.accountNumberId()

    /** The transfer amount in USD cents. Must be positive. */
    fun amount(): Long = body.amount()

    /** The account number of the account that sent the transfer. */
    fun debtorAccountNumber(): String? = body.debtorAccountNumber()

    /** The name provided by the sender of the transfer. */
    fun debtorName(): String? = body.debtorName()

    /** The routing number of the account that sent the transfer. */
    fun debtorRoutingNumber(): String? = body.debtorRoutingNumber()

    /** Additional information included with the transfer. */
    fun remittanceInformation(): String? = body.remittanceInformation()

    /** The identifier of a pending Request for Payment that this transfer will fulfill. */
    fun requestForPaymentId(): String? = body.requestForPaymentId()

    /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
    fun _accountNumberId(): JsonField<String> = body._accountNumberId()

    /** The transfer amount in USD cents. Must be positive. */
    fun _amount(): JsonField<Long> = body._amount()

    /** The account number of the account that sent the transfer. */
    fun _debtorAccountNumber(): JsonField<String> = body._debtorAccountNumber()

    /** The name provided by the sender of the transfer. */
    fun _debtorName(): JsonField<String> = body._debtorName()

    /** The routing number of the account that sent the transfer. */
    fun _debtorRoutingNumber(): JsonField<String> = body._debtorRoutingNumber()

    /** Additional information included with the transfer. */
    fun _remittanceInformation(): JsonField<String> = body._remittanceInformation()

    /** The identifier of a pending Request for Payment that this transfer will fulfill. */
    fun _requestForPaymentId(): JsonField<String> = body._requestForPaymentId()

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
        @JsonProperty("account_number_id")
        @ExcludeMissing
        private val accountNumberId: JsonField<String> = JsonMissing.of(),
        @JsonProperty("amount")
        @ExcludeMissing
        private val amount: JsonField<Long> = JsonMissing.of(),
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        private val debtorAccountNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_name")
        @ExcludeMissing
        private val debtorName: JsonField<String> = JsonMissing.of(),
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        private val debtorRoutingNumber: JsonField<String> = JsonMissing.of(),
        @JsonProperty("remittance_information")
        @ExcludeMissing
        private val remittanceInformation: JsonField<String> = JsonMissing.of(),
        @JsonProperty("request_for_payment_id")
        @ExcludeMissing
        private val requestForPaymentId: JsonField<String> = JsonMissing.of(),
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        fun accountNumberId(): String = accountNumberId.getRequired("account_number_id")

        /** The transfer amount in USD cents. Must be positive. */
        fun amount(): Long = amount.getRequired("amount")

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(): String? =
            debtorAccountNumber.getNullable("debtor_account_number")

        /** The name provided by the sender of the transfer. */
        fun debtorName(): String? = debtorName.getNullable("debtor_name")

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(): String? =
            debtorRoutingNumber.getNullable("debtor_routing_number")

        /** Additional information included with the transfer. */
        fun remittanceInformation(): String? =
            remittanceInformation.getNullable("remittance_information")

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        fun requestForPaymentId(): String? =
            requestForPaymentId.getNullable("request_for_payment_id")

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        @JsonProperty("account_number_id")
        @ExcludeMissing
        fun _accountNumberId(): JsonField<String> = accountNumberId

        /** The transfer amount in USD cents. Must be positive. */
        @JsonProperty("amount") @ExcludeMissing fun _amount(): JsonField<Long> = amount

        /** The account number of the account that sent the transfer. */
        @JsonProperty("debtor_account_number")
        @ExcludeMissing
        fun _debtorAccountNumber(): JsonField<String> = debtorAccountNumber

        /** The name provided by the sender of the transfer. */
        @JsonProperty("debtor_name")
        @ExcludeMissing
        fun _debtorName(): JsonField<String> = debtorName

        /** The routing number of the account that sent the transfer. */
        @JsonProperty("debtor_routing_number")
        @ExcludeMissing
        fun _debtorRoutingNumber(): JsonField<String> = debtorRoutingNumber

        /** Additional information included with the transfer. */
        @JsonProperty("remittance_information")
        @ExcludeMissing
        fun _remittanceInformation(): JsonField<String> = remittanceInformation

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        @JsonProperty("request_for_payment_id")
        @ExcludeMissing
        fun _requestForPaymentId(): JsonField<String> = requestForPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        private var validated: Boolean = false

        fun validate(): Body = apply {
            if (validated) {
                return@apply
            }

            accountNumberId()
            amount()
            debtorAccountNumber()
            debtorName()
            debtorRoutingNumber()
            remittanceInformation()
            requestForPaymentId()
            validated = true
        }

        fun toBuilder() = Builder().from(this)

        companion object {

            /**
             * Returns a mutable builder for constructing an instance of [Body].
             *
             * The following fields are required:
             * ```kotlin
             * .accountNumberId()
             * .amount()
             * ```
             */
            fun builder() = Builder()
        }

        /** A builder for [Body]. */
        class Builder internal constructor() {

            private var accountNumberId: JsonField<String>? = null
            private var amount: JsonField<Long>? = null
            private var debtorAccountNumber: JsonField<String> = JsonMissing.of()
            private var debtorName: JsonField<String> = JsonMissing.of()
            private var debtorRoutingNumber: JsonField<String> = JsonMissing.of()
            private var remittanceInformation: JsonField<String> = JsonMissing.of()
            private var requestForPaymentId: JsonField<String> = JsonMissing.of()
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(body: Body) = apply {
                accountNumberId = body.accountNumberId
                amount = body.amount
                debtorAccountNumber = body.debtorAccountNumber
                debtorName = body.debtorName
                debtorRoutingNumber = body.debtorRoutingNumber
                remittanceInformation = body.remittanceInformation
                requestForPaymentId = body.requestForPaymentId
                additionalProperties = body.additionalProperties.toMutableMap()
            }

            /**
             * The identifier of the Account Number the inbound Real-Time Payments Transfer is for.
             */
            fun accountNumberId(accountNumberId: String) =
                accountNumberId(JsonField.of(accountNumberId))

            /**
             * The identifier of the Account Number the inbound Real-Time Payments Transfer is for.
             */
            fun accountNumberId(accountNumberId: JsonField<String>) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in USD cents. Must be positive. */
            fun amount(amount: Long) = amount(JsonField.of(amount))

            /** The transfer amount in USD cents. Must be positive. */
            fun amount(amount: JsonField<Long>) = apply { this.amount = amount }

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(debtorAccountNumber: String) =
                debtorAccountNumber(JsonField.of(debtorAccountNumber))

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
                this.debtorAccountNumber = debtorAccountNumber
            }

            /** The name provided by the sender of the transfer. */
            fun debtorName(debtorName: String) = debtorName(JsonField.of(debtorName))

            /** The name provided by the sender of the transfer. */
            fun debtorName(debtorName: JsonField<String>) = apply { this.debtorName = debtorName }

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(debtorRoutingNumber: String) =
                debtorRoutingNumber(JsonField.of(debtorRoutingNumber))

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /** Additional information included with the transfer. */
            fun remittanceInformation(remittanceInformation: String) =
                remittanceInformation(JsonField.of(remittanceInformation))

            /** Additional information included with the transfer. */
            fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of a pending Request for Payment that this transfer will fulfill. */
            fun requestForPaymentId(requestForPaymentId: String) =
                requestForPaymentId(JsonField.of(requestForPaymentId))

            /** The identifier of a pending Request for Payment that this transfer will fulfill. */
            fun requestForPaymentId(requestForPaymentId: JsonField<String>) = apply {
                this.requestForPaymentId = requestForPaymentId
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
                    checkRequired("accountNumberId", accountNumberId),
                    checkRequired("amount", amount),
                    debtorAccountNumber,
                    debtorName,
                    debtorRoutingNumber,
                    remittanceInformation,
                    requestForPaymentId,
                    additionalProperties.toImmutable(),
                )
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return /* spotless:off */ other is Body && accountNumberId == other.accountNumberId && amount == other.amount && debtorAccountNumber == other.debtorAccountNumber && debtorName == other.debtorName && debtorRoutingNumber == other.debtorRoutingNumber && remittanceInformation == other.remittanceInformation && requestForPaymentId == other.requestForPaymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, debtorAccountNumber, debtorName, debtorRoutingNumber, remittanceInformation, requestForPaymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "Body{accountNumberId=$accountNumberId, amount=$amount, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, remittanceInformation=$remittanceInformation, requestForPaymentId=$requestForPaymentId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SimulationInboundRealTimePaymentsTransferCreateParams].
         *
         * The following fields are required:
         * ```kotlin
         * .accountNumberId()
         * .amount()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [SimulationInboundRealTimePaymentsTransferCreateParams]. */
    @NoAutoDetect
    class Builder internal constructor() {

        private var body: Body.Builder = Body.builder()
        private var additionalHeaders: Headers.Builder = Headers.builder()
        private var additionalQueryParams: QueryParams.Builder = QueryParams.builder()

        internal fun from(
            simulationInboundRealTimePaymentsTransferCreateParams:
                SimulationInboundRealTimePaymentsTransferCreateParams
        ) = apply {
            body = simulationInboundRealTimePaymentsTransferCreateParams.body.toBuilder()
            additionalHeaders =
                simulationInboundRealTimePaymentsTransferCreateParams.additionalHeaders.toBuilder()
            additionalQueryParams =
                simulationInboundRealTimePaymentsTransferCreateParams.additionalQueryParams
                    .toBuilder()
        }

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        fun accountNumberId(accountNumberId: JsonField<String>) = apply {
            body.accountNumberId(accountNumberId)
        }

        /** The transfer amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The transfer amount in USD cents. Must be positive. */
        fun amount(amount: JsonField<Long>) = apply { body.amount(amount) }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: JsonField<String>) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = apply { body.debtorName(debtorName) }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: JsonField<String>) = apply { body.debtorName(debtorName) }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: JsonField<String>) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: JsonField<String>) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        fun requestForPaymentId(requestForPaymentId: String) = apply {
            body.requestForPaymentId(requestForPaymentId)
        }

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        fun requestForPaymentId(requestForPaymentId: JsonField<String>) = apply {
            body.requestForPaymentId(requestForPaymentId)
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

        fun build(): SimulationInboundRealTimePaymentsTransferCreateParams =
            SimulationInboundRealTimePaymentsTransferCreateParams(
                body.build(),
                additionalHeaders.build(),
                additionalQueryParams.build(),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SimulationInboundRealTimePaymentsTransferCreateParams && body == other.body && additionalHeaders == other.additionalHeaders && additionalQueryParams == other.additionalQueryParams /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(body, additionalHeaders, additionalQueryParams) /* spotless:on */

    override fun toString() =
        "SimulationInboundRealTimePaymentsTransferCreateParams{body=$body, additionalHeaders=$additionalHeaders, additionalQueryParams=$additionalQueryParams}"
}
