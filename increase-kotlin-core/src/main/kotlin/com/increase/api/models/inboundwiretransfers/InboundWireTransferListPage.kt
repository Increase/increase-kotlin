// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.services.blocking.InboundWireTransferService
import java.util.Objects

/** List Inbound Wire Transfers */
class InboundWireTransferListPage
private constructor(
    private val inboundWireTransfersService: InboundWireTransferService,
    private val params: InboundWireTransferListParams,
    private val response: InboundWireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundWireTransferListPageResponse = response

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.data]
     */
    fun data(): List<InboundWireTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundWireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireTransferListPage && inboundWireTransfersService == other.inboundWireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireTransferListPage{inboundWireTransfersService=$inboundWireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundWireTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundWireTransferListPage? {
        return getNextPageParams()?.let { inboundWireTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundWireTransfersService: InboundWireTransferService,
            params: InboundWireTransferListParams,
            response: InboundWireTransferListPageResponse,
        ) = InboundWireTransferListPage(inboundWireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundWireTransferListPage) :
        Sequence<InboundWireTransfer> {

        override fun iterator(): Iterator<InboundWireTransfer> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
    }
}
