// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.services.blocking.BookkeepingEntrySetService
import java.util.Objects

/** List Bookkeeping Entry Sets */
class BookkeepingEntrySetListPage
private constructor(
    private val bookkeepingEntrySetsService: BookkeepingEntrySetService,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.data]
     */
    fun data(): List<BookkeepingEntrySet> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntrySetListPage && bookkeepingEntrySetsService == other.bookkeepingEntrySetsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntrySetsService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetListPage{bookkeepingEntrySetsService=$bookkeepingEntrySetsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): BookkeepingEntrySetListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): BookkeepingEntrySetListPage? {
        return getNextPageParams()?.let { bookkeepingEntrySetsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bookkeepingEntrySetsService: BookkeepingEntrySetService,
            params: BookkeepingEntrySetListParams,
            response: BookkeepingEntrySetListPageResponse,
        ) = BookkeepingEntrySetListPage(bookkeepingEntrySetsService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntrySetListPage) :
        Sequence<BookkeepingEntrySet> {

        override fun iterator(): Iterator<BookkeepingEntrySet> = iterator {
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
