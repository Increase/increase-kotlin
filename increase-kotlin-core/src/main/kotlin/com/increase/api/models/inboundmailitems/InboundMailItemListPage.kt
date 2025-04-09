// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.services.blocking.InboundMailItemService
import java.util.Objects

/** List Inbound Mail Items */
class InboundMailItemListPage
private constructor(
    private val inboundMailItemsService: InboundMailItemService,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.data]
     */
    fun data(): List<InboundMailItem> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundMailItemListPage && inboundMailItemsService == other.inboundMailItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundMailItemsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundMailItemListPage{inboundMailItemsService=$inboundMailItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundMailItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundMailItemListPage? {
        return getNextPageParams()?.let { inboundMailItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundMailItemsService: InboundMailItemService,
            params: InboundMailItemListParams,
            response: InboundMailItemListPageResponse,
        ) = InboundMailItemListPage(inboundMailItemsService, params, response)
    }

    class AutoPager(private val firstPage: InboundMailItemListPage) : Sequence<InboundMailItem> {

        override fun iterator(): Iterator<InboundMailItem> = iterator {
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
