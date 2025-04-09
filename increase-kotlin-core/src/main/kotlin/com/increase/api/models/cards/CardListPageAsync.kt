// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.increase.api.services.async.CardServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Cards */
class CardListPageAsync
private constructor(
    private val cardsService: CardServiceAsync,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.data]
     */
    fun data(): List<Card> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see [CardListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardListPageAsync && cardsService == other.cardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardsService, params, response) /* spotless:on */

    override fun toString() =
        "CardListPageAsync{cardsService=$cardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardListPageAsync? {
        return getNextPageParams()?.let { cardsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardsService: CardServiceAsync,
            params: CardListParams,
            response: CardListPageResponse,
        ) = CardListPageAsync(cardsService, params, response)
    }

    class AutoPager(private val firstPage: CardListPageAsync) : Flow<Card> {

        override suspend fun collect(collector: FlowCollector<Card>) {
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
