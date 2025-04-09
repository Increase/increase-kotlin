// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.services.async.PendingTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Pending Transactions */
class PendingTransactionListPageAsync
private constructor(
    private val pendingTransactionsService: PendingTransactionServiceAsync,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.data]
     */
    fun data(): List<PendingTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPageAsync && pendingTransactionsService == other.pendingTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pendingTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPageAsync{pendingTransactionsService=$pendingTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): PendingTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): PendingTransactionListPageAsync? {
        return getNextPageParams()?.let { pendingTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            pendingTransactionsService: PendingTransactionServiceAsync,
            params: PendingTransactionListParams,
            response: PendingTransactionListPageResponse,
        ) = PendingTransactionListPageAsync(pendingTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: PendingTransactionListPageAsync) :
        Flow<PendingTransaction> {

        override suspend fun collect(collector: FlowCollector<PendingTransaction>) {
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
