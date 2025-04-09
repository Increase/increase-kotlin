// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.increase.api.services.blocking.WireTransferService
import java.util.Objects

/** List Wire Transfers */
class WireTransferListPage
private constructor(
    private val wireTransfersService: WireTransferService,
    private val params: WireTransferListParams,
    private val response: WireTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireTransferListPageResponse = response

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.data]
     */
    fun data(): List<WireTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferListPage && wireTransfersService == other.wireTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "WireTransferListPage{wireTransfersService=$wireTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): WireTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): WireTransferListPage? {
        return getNextPageParams()?.let { wireTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            wireTransfersService: WireTransferService,
            params: WireTransferListParams,
            response: WireTransferListPageResponse,
        ) = WireTransferListPage(wireTransfersService, params, response)
    }

    class AutoPager(private val firstPage: WireTransferListPage) : Sequence<WireTransfer> {

        override fun iterator(): Iterator<WireTransfer> = iterator {
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
