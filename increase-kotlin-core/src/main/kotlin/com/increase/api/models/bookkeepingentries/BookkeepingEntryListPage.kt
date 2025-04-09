// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.services.blocking.BookkeepingEntryService
import java.util.Objects

/** List Bookkeeping Entries */
class BookkeepingEntryListPage
private constructor(
    private val bookkeepingEntriesService: BookkeepingEntryService,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.data]
     */
    fun data(): List<BookkeepingEntry> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntryListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingEntryListPage && bookkeepingEntriesService == other.bookkeepingEntriesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(bookkeepingEntriesService, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntryListPage{bookkeepingEntriesService=$bookkeepingEntriesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): BookkeepingEntryListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): BookkeepingEntryListPage? {
        return getNextPageParams()?.let { bookkeepingEntriesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            bookkeepingEntriesService: BookkeepingEntryService,
            params: BookkeepingEntryListParams,
            response: BookkeepingEntryListPageResponse,
        ) = BookkeepingEntryListPage(bookkeepingEntriesService, params, response)
    }

    class AutoPager(private val firstPage: BookkeepingEntryListPage) : Sequence<BookkeepingEntry> {

        override fun iterator(): Iterator<BookkeepingEntry> = iterator {
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
