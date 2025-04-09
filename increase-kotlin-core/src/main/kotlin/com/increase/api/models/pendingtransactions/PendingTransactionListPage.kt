// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.services.blocking.PendingTransactionService
import java.util.Objects

/** List Pending Transactions */
class PendingTransactionListPage
private constructor(
    private val pendingTransactionsService: PendingTransactionService,
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

        return /* spotless:off */ other is PendingTransactionListPage && pendingTransactionsService == other.pendingTransactionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(pendingTransactionsService, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPage{pendingTransactionsService=$pendingTransactionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): PendingTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): PendingTransactionListPage? {
        return getNextPageParams()?.let { pendingTransactionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            pendingTransactionsService: PendingTransactionService,
            params: PendingTransactionListParams,
            response: PendingTransactionListPageResponse,
        ) = PendingTransactionListPage(pendingTransactionsService, params, response)
    }

    class AutoPager(private val firstPage: PendingTransactionListPage) :
        Sequence<PendingTransaction> {

        override fun iterator(): Iterator<PendingTransaction> = iterator {
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
