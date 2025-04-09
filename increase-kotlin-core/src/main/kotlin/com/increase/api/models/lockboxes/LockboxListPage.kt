// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.services.blocking.LockboxService
import java.util.Objects

/** List Lockboxes */
class LockboxListPage
private constructor(
    private val lockboxesService: LockboxService,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.data]
     */
    fun data(): List<Lockbox> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LockboxListPage && lockboxesService == other.lockboxesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(lockboxesService, params, response) /* spotless:on */

    override fun toString() =
        "LockboxListPage{lockboxesService=$lockboxesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): LockboxListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): LockboxListPage? {
        return getNextPageParams()?.let { lockboxesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            lockboxesService: LockboxService,
            params: LockboxListParams,
            response: LockboxListPageResponse,
        ) = LockboxListPage(lockboxesService, params, response)
    }

    class AutoPager(private val firstPage: LockboxListPage) : Sequence<Lockbox> {

        override fun iterator(): Iterator<Lockbox> = iterator {
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
