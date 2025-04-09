// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.services.blocking.CardPurchaseSupplementService
import java.util.Objects

/** List Card Purchase Supplements */
class CardPurchaseSupplementListPage
private constructor(
    private val cardPurchaseSupplementsService: CardPurchaseSupplementService,
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

        return /* spotless:off */ other is CardPurchaseSupplementListPage && cardPurchaseSupplementsService == other.cardPurchaseSupplementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPurchaseSupplementsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPage{cardPurchaseSupplementsService=$cardPurchaseSupplementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardPurchaseSupplementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): CardPurchaseSupplementListPage? {
        return getNextPageParams()?.let { cardPurchaseSupplementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardPurchaseSupplementsService: CardPurchaseSupplementService,
            params: CardPurchaseSupplementListParams,
            response: CardPurchaseSupplementListPageResponse,
        ) = CardPurchaseSupplementListPage(cardPurchaseSupplementsService, params, response)
    }

    class AutoPager(private val firstPage: CardPurchaseSupplementListPage) :
        Sequence<CardPurchaseSupplement> {

        override fun iterator(): Iterator<CardPurchaseSupplement> = iterator {
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
