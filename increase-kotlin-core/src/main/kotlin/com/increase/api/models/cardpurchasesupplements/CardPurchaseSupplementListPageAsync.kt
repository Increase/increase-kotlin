// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Card Purchase Supplements */
class CardPurchaseSupplementListPageAsync
private constructor(
    private val cardPurchaseSupplementsService: CardPurchaseSupplementServiceAsync,
    private val params: CardPurchaseSupplementListParams,
    private val response: CardPurchaseSupplementListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardPurchaseSupplementListPageResponse = response

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.data]
     */
    fun data(): List<CardPurchaseSupplement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPurchaseSupplementListPageAsync && cardPurchaseSupplementsService == other.cardPurchaseSupplementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPurchaseSupplementsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPageAsync{cardPurchaseSupplementsService=$cardPurchaseSupplementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardPurchaseSupplementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardPurchaseSupplementListPageAsync? {
        return getNextPageParams()?.let { cardPurchaseSupplementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardPurchaseSupplementsService: CardPurchaseSupplementServiceAsync,
            params: CardPurchaseSupplementListParams,
            response: CardPurchaseSupplementListPageResponse,
        ) = CardPurchaseSupplementListPageAsync(cardPurchaseSupplementsService, params, response)
    }

    class AutoPager(private val firstPage: CardPurchaseSupplementListPageAsync) :
        Flow<CardPurchaseSupplement> {

        override suspend fun collect(collector: FlowCollector<CardPurchaseSupplement>) {
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
