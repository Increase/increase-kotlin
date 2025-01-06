// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.http.Headers
import com.increase.api.core.http.QueryParams
import com.increase.api.core.immutableEmptyMap
import com.increase.api.core.toImmutable
import java.util.Objects

class SimulationInboundRealTimePaymentsTransferCreateParams
constructor(
    private val body: SimulationInboundRealTimePaymentsTransferCreateBody,
    private val additionalHeaders: Headers,
    private val additionalQueryParams: QueryParams,
) {

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

    fun _additionalHeaders(): Headers = additionalHeaders

    fun _additionalQueryParams(): QueryParams = additionalQueryParams

    fun _additionalBodyProperties(): Map<String, JsonValue> = body._additionalProperties()

    internal fun getBody(): SimulationInboundRealTimePaymentsTransferCreateBody = body

    internal fun getHeaders(): Headers = additionalHeaders

    internal fun getQueryParams(): QueryParams = additionalQueryParams

    @NoAutoDetect
    class SimulationInboundRealTimePaymentsTransferCreateBody
    @JsonCreator
    internal constructor(
        @JsonProperty("account_number_id") private val accountNumberId: String,
        @JsonProperty("amount") private val amount: Long,
        @JsonProperty("debtor_account_number") private val debtorAccountNumber: String?,
        @JsonProperty("debtor_name") private val debtorName: String?,
        @JsonProperty("debtor_routing_number") private val debtorRoutingNumber: String?,
        @JsonProperty("remittance_information") private val remittanceInformation: String?,
        @JsonProperty("request_for_payment_id") private val requestForPaymentId: String?,
        @JsonAnySetter
        private val additionalProperties: Map<String, JsonValue> = immutableEmptyMap(),
    ) {

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String = accountNumberId

        /** The transfer amount in USD cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long = amount

        /** The account number of the account that sent the transfer. */
        @JsonProperty("debtor_account_number")
        fun debtorAccountNumber(): String? = debtorAccountNumber

        /** The name provided by the sender of the transfer. */
        @JsonProperty("debtor_name") fun debtorName(): String? = debtorName

        /** The routing number of the account that sent the transfer. */
        @JsonProperty("debtor_routing_number")
        fun debtorRoutingNumber(): String? = debtorRoutingNumber

        /** Additional information included with the transfer. */
        @JsonProperty("remittance_information")
        fun remittanceInformation(): String? = remittanceInformation

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        @JsonProperty("request_for_payment_id")
        fun requestForPaymentId(): String? = requestForPaymentId

        @JsonAnyGetter
        @ExcludeMissing
        fun _additionalProperties(): Map<String, JsonValue> = additionalProperties

        fun toBuilder() = Builder().from(this)

        companion object {

            fun builder() = Builder()
        }

        class Builder {

            private var accountNumberId: String? = null
            private var amount: Long? = null
            private var debtorAccountNumber: String? = null
            private var debtorName: String? = null
            private var debtorRoutingNumber: String? = null
            private var remittanceInformation: String? = null
            private var requestForPaymentId: String? = null
            private var additionalProperties: MutableMap<String, JsonValue> = mutableMapOf()

            internal fun from(
                simulationInboundRealTimePaymentsTransferCreateBody:
                    SimulationInboundRealTimePaymentsTransferCreateBody
            ) = apply {
                accountNumberId =
                    simulationInboundRealTimePaymentsTransferCreateBody.accountNumberId
                amount = simulationInboundRealTimePaymentsTransferCreateBody.amount
                debtorAccountNumber =
                    simulationInboundRealTimePaymentsTransferCreateBody.debtorAccountNumber
                debtorName = simulationInboundRealTimePaymentsTransferCreateBody.debtorName
                debtorRoutingNumber =
                    simulationInboundRealTimePaymentsTransferCreateBody.debtorRoutingNumber
                remittanceInformation =
                    simulationInboundRealTimePaymentsTransferCreateBody.remittanceInformation
                requestForPaymentId =
                    simulationInboundRealTimePaymentsTransferCreateBody.requestForPaymentId
                additionalProperties =
                    simulationInboundRealTimePaymentsTransferCreateBody.additionalProperties
                        .toMutableMap()
            }

            /**
             * The identifier of the Account Number the inbound Real-Time Payments Transfer is for.
             */
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in USD cents. Must be positive. */
            fun amount(amount: Long) = apply { this.amount = amount }

            /** The account number of the account that sent the transfer. */
            fun debtorAccountNumber(debtorAccountNumber: String?) = apply {
                this.debtorAccountNumber = debtorAccountNumber
            }

            /** The name provided by the sender of the transfer. */
            fun debtorName(debtorName: String?) = apply { this.debtorName = debtorName }

            /** The routing number of the account that sent the transfer. */
            fun debtorRoutingNumber(debtorRoutingNumber: String?) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /** Additional information included with the transfer. */
            fun remittanceInformation(remittanceInformation: String?) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of a pending Request for Payment that this transfer will fulfill. */
            fun requestForPaymentId(requestForPaymentId: String?) = apply {
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

            fun build(): SimulationInboundRealTimePaymentsTransferCreateBody =
                SimulationInboundRealTimePaymentsTransferCreateBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
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

            return /* spotless:off */ other is SimulationInboundRealTimePaymentsTransferCreateBody && accountNumberId == other.accountNumberId && amount == other.amount && debtorAccountNumber == other.debtorAccountNumber && debtorName == other.debtorName && debtorRoutingNumber == other.debtorRoutingNumber && remittanceInformation == other.remittanceInformation && requestForPaymentId == other.requestForPaymentId && additionalProperties == other.additionalProperties /* spotless:on */
        }

        /* spotless:off */
        private val hashCode: Int by lazy { Objects.hash(accountNumberId, amount, debtorAccountNumber, debtorName, debtorRoutingNumber, remittanceInformation, requestForPaymentId, additionalProperties) }
        /* spotless:on */

        override fun hashCode(): Int = hashCode

        override fun toString() =
            "SimulationInboundRealTimePaymentsTransferCreateBody{accountNumberId=$accountNumberId, amount=$amount, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, remittanceInformation=$remittanceInformation, requestForPaymentId=$requestForPaymentId, additionalProperties=$additionalProperties}"
    }

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var body: SimulationInboundRealTimePaymentsTransferCreateBody.Builder =
            SimulationInboundRealTimePaymentsTransferCreateBody.builder()
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

        /** The transfer amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { body.amount(amount) }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String?) = apply {
            body.debtorAccountNumber(debtorAccountNumber)
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String?) = apply { body.debtorName(debtorName) }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String?) = apply {
            body.debtorRoutingNumber(debtorRoutingNumber)
        }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String?) = apply {
            body.remittanceInformation(remittanceInformation)
        }

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        fun requestForPaymentId(requestForPaymentId: String?) = apply {
            body.requestForPaymentId(requestForPaymentId)
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
