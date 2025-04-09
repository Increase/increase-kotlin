// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.services.async.CardPaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Card Payments */
class CardPaymentListPageAsync
private constructor(
    private val cardPaymentsService: CardPaymentServiceAsync,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.data]
     */
    fun data(): List<CardPayment> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPaymentListPageAsync && cardPaymentsService == other.cardPaymentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(cardPaymentsService, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPageAsync{cardPaymentsService=$cardPaymentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardPaymentListPageAsync? {
        return getNextPageParams()?.let { cardPaymentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            cardPaymentsService: CardPaymentServiceAsync,
            params: CardPaymentListParams,
            response: CardPaymentListPageResponse,
        ) = CardPaymentListPageAsync(cardPaymentsService, params, response)
    }

    class AutoPager(private val firstPage: CardPaymentListPageAsync) : Flow<CardPayment> {

        override suspend fun collect(collector: FlowCollector<CardPayment>) {
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
