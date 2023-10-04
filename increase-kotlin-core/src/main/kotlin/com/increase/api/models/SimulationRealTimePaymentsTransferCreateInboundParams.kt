// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.fasterxml.jackson.annotation.JsonAnyGetter
import com.fasterxml.jackson.annotation.JsonAnySetter
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.increase.api.core.ExcludeMissing
import com.increase.api.core.JsonValue
import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class SimulationRealTimePaymentsTransferCreateInboundParams
constructor(
    private val accountNumberId: String,
    private val amount: Long,
    private val debtorAccountNumber: String?,
    private val debtorName: String?,
    private val debtorRoutingNumber: String?,
    private val remittanceInformation: String?,
    private val requestForPaymentId: String?,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
    private val additionalBodyProperties: Map<String, JsonValue>,
) {

    fun accountNumberId(): String = accountNumberId

    fun amount(): Long = amount

    fun debtorAccountNumber(): String? = debtorAccountNumber

    fun debtorName(): String? = debtorName

    fun debtorRoutingNumber(): String? = debtorRoutingNumber

    fun remittanceInformation(): String? = remittanceInformation

    fun requestForPaymentId(): String? = requestForPaymentId

    internal fun getBody(): SimulationRealTimePaymentsTransferCreateInboundBody {
        return SimulationRealTimePaymentsTransferCreateInboundBody(
            accountNumberId,
            amount,
            debtorAccountNumber,
            debtorName,
            debtorRoutingNumber,
            remittanceInformation,
            requestForPaymentId,
            additionalBodyProperties,
        )
    }

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    @JsonDeserialize(builder = SimulationRealTimePaymentsTransferCreateInboundBody.Builder::class)
    @NoAutoDetect
    class SimulationRealTimePaymentsTransferCreateInboundBody
    internal constructor(
        private val accountNumberId: String?,
        private val amount: Long?,
        private val debtorAccountNumber: String?,
        private val debtorName: String?,
        private val debtorRoutingNumber: String?,
        private val remittanceInformation: String?,
        private val requestForPaymentId: String?,
        private val additionalProperties: Map<String, JsonValue>,
    ) {

        private var hashCode: Int = 0

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        @JsonProperty("account_number_id") fun accountNumberId(): String? = accountNumberId

        /** The transfer amount in USD cents. Must be positive. */
        @JsonProperty("amount") fun amount(): Long? = amount

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

        override fun equals(other: Any?): Boolean {
            if (this === other) {
                return true
            }

            return other is SimulationRealTimePaymentsTransferCreateInboundBody &&
                this.accountNumberId == other.accountNumberId &&
                this.amount == other.amount &&
                this.debtorAccountNumber == other.debtorAccountNumber &&
                this.debtorName == other.debtorName &&
                this.debtorRoutingNumber == other.debtorRoutingNumber &&
                this.remittanceInformation == other.remittanceInformation &&
                this.requestForPaymentId == other.requestForPaymentId &&
                this.additionalProperties == other.additionalProperties
        }

        override fun hashCode(): Int {
            if (hashCode == 0) {
                hashCode =
                    Objects.hash(
                        accountNumberId,
                        amount,
                        debtorAccountNumber,
                        debtorName,
                        debtorRoutingNumber,
                        remittanceInformation,
                        requestForPaymentId,
                        additionalProperties,
                    )
            }
            return hashCode
        }

        override fun toString() =
            "SimulationRealTimePaymentsTransferCreateInboundBody{accountNumberId=$accountNumberId, amount=$amount, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, remittanceInformation=$remittanceInformation, requestForPaymentId=$requestForPaymentId, additionalProperties=$additionalProperties}"

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
                simulationRealTimePaymentsTransferCreateInboundBody:
                    SimulationRealTimePaymentsTransferCreateInboundBody
            ) = apply {
                this.accountNumberId =
                    simulationRealTimePaymentsTransferCreateInboundBody.accountNumberId
                this.amount = simulationRealTimePaymentsTransferCreateInboundBody.amount
                this.debtorAccountNumber =
                    simulationRealTimePaymentsTransferCreateInboundBody.debtorAccountNumber
                this.debtorName = simulationRealTimePaymentsTransferCreateInboundBody.debtorName
                this.debtorRoutingNumber =
                    simulationRealTimePaymentsTransferCreateInboundBody.debtorRoutingNumber
                this.remittanceInformation =
                    simulationRealTimePaymentsTransferCreateInboundBody.remittanceInformation
                this.requestForPaymentId =
                    simulationRealTimePaymentsTransferCreateInboundBody.requestForPaymentId
                additionalProperties(
                    simulationRealTimePaymentsTransferCreateInboundBody.additionalProperties
                )
            }

            /**
             * The identifier of the Account Number the inbound Real-Time Payments Transfer is for.
             */
            @JsonProperty("account_number_id")
            fun accountNumberId(accountNumberId: String) = apply {
                this.accountNumberId = accountNumberId
            }

            /** The transfer amount in USD cents. Must be positive. */
            @JsonProperty("amount") fun amount(amount: Long) = apply { this.amount = amount }

            /** The account number of the account that sent the transfer. */
            @JsonProperty("debtor_account_number")
            fun debtorAccountNumber(debtorAccountNumber: String) = apply {
                this.debtorAccountNumber = debtorAccountNumber
            }

            /** The name provided by the sender of the transfer. */
            @JsonProperty("debtor_name")
            fun debtorName(debtorName: String) = apply { this.debtorName = debtorName }

            /** The routing number of the account that sent the transfer. */
            @JsonProperty("debtor_routing_number")
            fun debtorRoutingNumber(debtorRoutingNumber: String) = apply {
                this.debtorRoutingNumber = debtorRoutingNumber
            }

            /** Additional information included with the transfer. */
            @JsonProperty("remittance_information")
            fun remittanceInformation(remittanceInformation: String) = apply {
                this.remittanceInformation = remittanceInformation
            }

            /** The identifier of a pending Request for Payment that this transfer will fulfill. */
            @JsonProperty("request_for_payment_id")
            fun requestForPaymentId(requestForPaymentId: String) = apply {
                this.requestForPaymentId = requestForPaymentId
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

            fun build(): SimulationRealTimePaymentsTransferCreateInboundBody =
                SimulationRealTimePaymentsTransferCreateInboundBody(
                    checkNotNull(accountNumberId) {
                        "`accountNumberId` is required but was not set"
                    },
                    checkNotNull(amount) { "`amount` is required but was not set" },
                    debtorAccountNumber,
                    debtorName,
                    debtorRoutingNumber,
                    remittanceInformation,
                    requestForPaymentId,
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

        return other is SimulationRealTimePaymentsTransferCreateInboundParams &&
            this.accountNumberId == other.accountNumberId &&
            this.amount == other.amount &&
            this.debtorAccountNumber == other.debtorAccountNumber &&
            this.debtorName == other.debtorName &&
            this.debtorRoutingNumber == other.debtorRoutingNumber &&
            this.remittanceInformation == other.remittanceInformation &&
            this.requestForPaymentId == other.requestForPaymentId &&
            this.additionalQueryParams == other.additionalQueryParams &&
            this.additionalHeaders == other.additionalHeaders &&
            this.additionalBodyProperties == other.additionalBodyProperties
    }

    override fun hashCode(): Int {
        return Objects.hash(
            accountNumberId,
            amount,
            debtorAccountNumber,
            debtorName,
            debtorRoutingNumber,
            remittanceInformation,
            requestForPaymentId,
            additionalQueryParams,
            additionalHeaders,
            additionalBodyProperties,
        )
    }

    override fun toString() =
        "SimulationRealTimePaymentsTransferCreateInboundParams{accountNumberId=$accountNumberId, amount=$amount, debtorAccountNumber=$debtorAccountNumber, debtorName=$debtorName, debtorRoutingNumber=$debtorRoutingNumber, remittanceInformation=$remittanceInformation, requestForPaymentId=$requestForPaymentId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders, additionalBodyProperties=$additionalBodyProperties}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var accountNumberId: String? = null
        private var amount: Long? = null
        private var debtorAccountNumber: String? = null
        private var debtorName: String? = null
        private var debtorRoutingNumber: String? = null
        private var remittanceInformation: String? = null
        private var requestForPaymentId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalBodyProperties: MutableMap<String, JsonValue> = mutableMapOf()

        internal fun from(
            simulationRealTimePaymentsTransferCreateInboundParams:
                SimulationRealTimePaymentsTransferCreateInboundParams
        ) = apply {
            this.accountNumberId =
                simulationRealTimePaymentsTransferCreateInboundParams.accountNumberId
            this.amount = simulationRealTimePaymentsTransferCreateInboundParams.amount
            this.debtorAccountNumber =
                simulationRealTimePaymentsTransferCreateInboundParams.debtorAccountNumber
            this.debtorName = simulationRealTimePaymentsTransferCreateInboundParams.debtorName
            this.debtorRoutingNumber =
                simulationRealTimePaymentsTransferCreateInboundParams.debtorRoutingNumber
            this.remittanceInformation =
                simulationRealTimePaymentsTransferCreateInboundParams.remittanceInformation
            this.requestForPaymentId =
                simulationRealTimePaymentsTransferCreateInboundParams.requestForPaymentId
            additionalQueryParams(
                simulationRealTimePaymentsTransferCreateInboundParams.additionalQueryParams
            )
            additionalHeaders(
                simulationRealTimePaymentsTransferCreateInboundParams.additionalHeaders
            )
            additionalBodyProperties(
                simulationRealTimePaymentsTransferCreateInboundParams.additionalBodyProperties
            )
        }

        /** The identifier of the Account Number the inbound Real-Time Payments Transfer is for. */
        fun accountNumberId(accountNumberId: String) = apply {
            this.accountNumberId = accountNumberId
        }

        /** The transfer amount in USD cents. Must be positive. */
        fun amount(amount: Long) = apply { this.amount = amount }

        /** The account number of the account that sent the transfer. */
        fun debtorAccountNumber(debtorAccountNumber: String) = apply {
            this.debtorAccountNumber = debtorAccountNumber
        }

        /** The name provided by the sender of the transfer. */
        fun debtorName(debtorName: String) = apply { this.debtorName = debtorName }

        /** The routing number of the account that sent the transfer. */
        fun debtorRoutingNumber(debtorRoutingNumber: String) = apply {
            this.debtorRoutingNumber = debtorRoutingNumber
        }

        /** Additional information included with the transfer. */
        fun remittanceInformation(remittanceInformation: String) = apply {
            this.remittanceInformation = remittanceInformation
        }

        /** The identifier of a pending Request for Payment that this transfer will fulfill. */
        fun requestForPaymentId(requestForPaymentId: String) = apply {
            this.requestForPaymentId = requestForPaymentId
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

        fun build(): SimulationRealTimePaymentsTransferCreateInboundParams =
            SimulationRealTimePaymentsTransferCreateInboundParams(
                checkNotNull(accountNumberId) { "`accountNumberId` is required but was not set" },
                checkNotNull(amount) { "`amount` is required but was not set" },
                debtorAccountNumber,
                debtorName,
                debtorRoutingNumber,
                remittanceInformation,
                requestForPaymentId,
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalBodyProperties.toUnmodifiable(),
            )
    }
}
