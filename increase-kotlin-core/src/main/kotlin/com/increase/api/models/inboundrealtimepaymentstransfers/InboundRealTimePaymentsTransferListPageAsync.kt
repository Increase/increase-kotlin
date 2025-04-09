// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Inbound Real-Time Payments Transfers */
class InboundRealTimePaymentsTransferListPageAsync
private constructor(
    private val inboundRealTimePaymentsTransfersService:
        InboundRealTimePaymentsTransferServiceAsync,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: InboundRealTimePaymentsTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsTransferListPageResponse = response

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<InboundRealTimePaymentsTransfer> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPageAsync && inboundRealTimePaymentsTransfersService == other.inboundRealTimePaymentsTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundRealTimePaymentsTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPageAsync{inboundRealTimePaymentsTransfersService=$inboundRealTimePaymentsTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundRealTimePaymentsTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): InboundRealTimePaymentsTransferListPageAsync? {
        return getNextPageParams()?.let { inboundRealTimePaymentsTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundRealTimePaymentsTransfersService: InboundRealTimePaymentsTransferServiceAsync,
            params: InboundRealTimePaymentsTransferListParams,
            response: InboundRealTimePaymentsTransferListPageResponse,
        ) =
            InboundRealTimePaymentsTransferListPageAsync(
                inboundRealTimePaymentsTransfersService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: InboundRealTimePaymentsTransferListPageAsync) :
        Flow<InboundRealTimePaymentsTransfer> {

        override suspend fun collect(collector: FlowCollector<InboundRealTimePaymentsTransfer>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
