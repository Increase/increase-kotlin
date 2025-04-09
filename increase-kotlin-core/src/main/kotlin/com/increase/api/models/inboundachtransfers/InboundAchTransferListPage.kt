// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.services.blocking.InboundAchTransferService
import java.util.Objects

/** List Inbound ACH Transfers */
class InboundAchTransferListPage
private constructor(
    private val inboundAchTransfersService: InboundAchTransferService,
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

        return /* spotless:off */ other is InboundAchTransferListPage && inboundAchTransfersService == other.inboundAchTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundAchTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPage{inboundAchTransfersService=$inboundAchTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundAchTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundAchTransferListPage? {
        return getNextPageParams()?.let { inboundAchTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundAchTransfersService: InboundAchTransferService,
            params: InboundAchTransferListParams,
            response: InboundAchTransferListPageResponse,
        ) = InboundAchTransferListPage(inboundAchTransfersService, params, response)
    }

    class AutoPager(private val firstPage: InboundAchTransferListPage) :
        Sequence<InboundAchTransfer> {

        override fun iterator(): Iterator<InboundAchTransfer> = iterator {
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
