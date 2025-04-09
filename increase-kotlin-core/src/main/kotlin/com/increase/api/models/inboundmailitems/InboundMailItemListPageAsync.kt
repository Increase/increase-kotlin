// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.services.async.InboundMailItemServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Inbound Mail Items */
class InboundMailItemListPageAsync
private constructor(
    private val inboundMailItemsService: InboundMailItemServiceAsync,
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

        return /* spotless:off */ other is InboundMailItemListPageAsync && inboundMailItemsService == other.inboundMailItemsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundMailItemsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundMailItemListPageAsync{inboundMailItemsService=$inboundMailItemsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundMailItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): InboundMailItemListPageAsync? {
        return getNextPageParams()?.let { inboundMailItemsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundMailItemsService: InboundMailItemServiceAsync,
            params: InboundMailItemListParams,
            response: InboundMailItemListPageResponse,
        ) = InboundMailItemListPageAsync(inboundMailItemsService, params, response)
    }

    class AutoPager(private val firstPage: InboundMailItemListPageAsync) : Flow<InboundMailItem> {

        override suspend fun collect(collector: FlowCollector<InboundMailItem>) {
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
