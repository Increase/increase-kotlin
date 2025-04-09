// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.increase.api.services.async.DeclinedTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Declined Transactions */
class DeclinedTransactionListPageAsync
private constructor(
    private val declinedTransactionsService: DeclinedTransactionServiceAsync,
    private val params: DeclinedTransactionListParams,
    private val response: DeclinedTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DeclinedTransactionListPageResponse = response

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.data]
     */
    fun data(): List<DeclinedTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DeclinedTransactionListPageAsync && declinedTransactionsService == other.declinedTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(declinedTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "DeclinedTransactionListPageAsync{declinedTransactionsService=$declinedTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DeclinedTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): DeclinedTransactionListPageAsync? {
        return getNextPageParams()?.let { declinedTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            declinedTransactionsService: DeclinedTransactionServiceAsync,
            params: DeclinedTransactionListParams,
            response: DeclinedTransactionListPageResponse,
        ) = DeclinedTransactionListPageAsync(declinedTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: DeclinedTransactionListPageAsync) :
        Flow<DeclinedTransaction> {

        override suspend fun collect(collector: FlowCollector<DeclinedTransaction>) {
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
