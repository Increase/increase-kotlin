// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.NoAutoDetect
import com.increase.api.core.toUnmodifiable
import com.increase.api.models.*
import java.util.Objects

class InboundRealTimePaymentsTransferRetrieveParams
constructor(
    private val inboundRealTimePaymentsTransferId: String,
    private val additionalQueryParams: Map<String, List<String>>,
    private val additionalHeaders: Map<String, List<String>>,
) {

    fun inboundRealTimePaymentsTransferId(): String = inboundRealTimePaymentsTransferId

    internal fun getQueryParams(): Map<String, List<String>> = additionalQueryParams

    internal fun getHeaders(): Map<String, List<String>> = additionalHeaders

    fun getPathParam(index: Int): String {
        return when (index) {
            0 -> inboundRealTimePaymentsTransferId
            else -> ""
        }
    }

    fun _additionalQueryParams(): Map<String, List<String>> = additionalQueryParams

    fun _additionalHeaders(): Map<String, List<String>> = additionalHeaders

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferRetrieveParams && this.inboundRealTimePaymentsTransferId == other.inboundRealTimePaymentsTransferId && this.additionalQueryParams == other.additionalQueryParams && this.additionalHeaders == other.additionalHeaders /* spotless:on */
    }

    override fun hashCode(): Int {
        return /* spotless:off */ Objects.hash(inboundRealTimePaymentsTransferId, additionalQueryParams, additionalHeaders) /* spotless:on */
    }

    override fun toString() =
        "InboundRealTimePaymentsTransferRetrieveParams{inboundRealTimePaymentsTransferId=$inboundRealTimePaymentsTransferId, additionalQueryParams=$additionalQueryParams, additionalHeaders=$additionalHeaders}"

    fun toBuilder() = Builder().from(this)

    companion object {

        fun builder() = Builder()
    }

    @NoAutoDetect
    class Builder {

        private var inboundRealTimePaymentsTransferId: String? = null
        private var additionalQueryParams: MutableMap<String, MutableList<String>> = mutableMapOf()
        private var additionalHeaders: MutableMap<String, MutableList<String>> = mutableMapOf()

        internal fun from(
            inboundRealTimePaymentsTransferRetrieveParams:
                InboundRealTimePaymentsTransferRetrieveParams
        ) = apply {
            this.inboundRealTimePaymentsTransferId =
                inboundRealTimePaymentsTransferRetrieveParams.inboundRealTimePaymentsTransferId
            additionalQueryParams(
                inboundRealTimePaymentsTransferRetrieveParams.additionalQueryParams
            )
            additionalHeaders(inboundRealTimePaymentsTransferRetrieveParams.additionalHeaders)
        }

        /** The identifier of the Inbound Real-Time Payments Transfer to get details for. */
        fun inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId: String) = apply {
            this.inboundRealTimePaymentsTransferId = inboundRealTimePaymentsTransferId
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

        fun build(): InboundRealTimePaymentsTransferRetrieveParams =
            InboundRealTimePaymentsTransferRetrieveParams(
                checkNotNull(inboundRealTimePaymentsTransferId) {
                    "`inboundRealTimePaymentsTransferId` is required but was not set"
                },
                additionalQueryParams.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
                additionalHeaders.mapValues { it.value.toUnmodifiable() }.toUnmodifiable(),
            )
    }
}
