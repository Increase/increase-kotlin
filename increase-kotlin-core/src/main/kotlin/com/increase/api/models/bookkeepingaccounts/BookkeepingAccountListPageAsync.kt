// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.services.async.BookkeepingAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Bookkeeping Accounts */
class BookkeepingAccountListPageAsync
private constructor(
    private val bookkeepingAccountsService: BookkeepingAccountServiceAsync,
    private val params: BookkeepingAccountListParams,
    private val response: BookkeepingAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingAccountListPageResponse = response

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.data]
     */
    fun data(): List<BookkeepingAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountListPageAsync && bookkeepingAccountsService == other.bookkeepingAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingAccountListPageAsync{bookkeepingAccountsService=$bookkeepingAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): BookkeepingAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): BookkeepingAccountListPageAsync? {
        return getNextPageParams()?.let { bookkeepingAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bookkeepingAccountsService: BookkeepingAccountServiceAsync,
            params: BookkeepingAccountListParams,
            response: BookkeepingAccountListPageResponse,
        ) = BookkeepingAccountListPageAsync(bookkeepingAccountsService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingAccountListPageAsync) :
        Flow<BookkeepingAccount> {

        override suspend fun collect(collector: FlowCollector<BookkeepingAccount>) {
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
