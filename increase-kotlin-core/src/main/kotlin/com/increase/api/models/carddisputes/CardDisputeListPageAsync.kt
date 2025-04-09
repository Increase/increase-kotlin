// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Card Disputes */
class CardDisputeListPageAsync
private constructor(
    private val cardDisputesService: CardDisputeServiceAsync,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardDisputeListPageResponse = response

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.data]
     */
    fun data(): List<CardDispute> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDisputeListPageAsync && cardDisputesService == other.cardDisputesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardDisputesService, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPageAsync{cardDisputesService=$cardDisputesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardDisputeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardDisputeListPageAsync? {
        return getNextPageParams()?.let { cardDisputesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardDisputesService: CardDisputeServiceAsync,
            params: CardDisputeListParams,
            response: CardDisputeListPageResponse,
        ) = CardDisputeListPageAsync(cardDisputesService, params, response)
    }

    class AutoPager(private val firstPage: CardDisputeListPageAsync) : Flow<CardDispute> {

        override suspend fun collect(collector: FlowCollector<CardDispute>) {
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
