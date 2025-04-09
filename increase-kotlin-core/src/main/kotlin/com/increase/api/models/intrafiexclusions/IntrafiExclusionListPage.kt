// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.services.blocking.IntrafiExclusionService
import java.util.Objects

/** List IntraFi Exclusions */
class IntrafiExclusionListPage
private constructor(
    private val intrafiExclusionsService: IntrafiExclusionService,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.data]
     */
    fun data(): List<IntrafiExclusion> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [IntrafiExclusionListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiExclusionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiExclusionListPage && intrafiExclusionsService == other.intrafiExclusionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiExclusionsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPage{intrafiExclusionsService=$intrafiExclusionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiExclusionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): IntrafiExclusionListPage? {
        return getNextPageParams()?.let { intrafiExclusionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            intrafiExclusionsService: IntrafiExclusionService,
            params: IntrafiExclusionListParams,
            response: IntrafiExclusionListPageResponse,
        ) = IntrafiExclusionListPage(intrafiExclusionsService, params, response)
    }

    class AutoPager(private val firstPage: IntrafiExclusionListPage) : Sequence<IntrafiExclusion> {

        override fun iterator(): Iterator<IntrafiExclusion> = iterator {
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
