// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.services.async.InboundAchTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Inbound ACH Transfers */
class InboundAchTransferListPageAsync
private constructor(
    private val inboundAchTransfersService: InboundAchTransferServiceAsync,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.data]
     */
    fun data(): List<InboundAchTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListPageAsync && inboundAchTransfersService == other.inboundAchTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPageAsync{inboundAchTransfersService=$inboundAchTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundAchTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): InboundAchTransferListPageAsync? {
        return getNextPageParams()?.let { inboundAchTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundAchTransfersService: InboundAchTransferServiceAsync,
            params: InboundAchTransferListParams,
            response: InboundAchTransferListPageResponse,
        ) = InboundAchTransferListPageAsync(inboundAchTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundAchTransferListPageAsync) :
        Flow<InboundAchTransfer> {

        override suspend fun collect(collector: FlowCollector<InboundAchTransfer>) {
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
