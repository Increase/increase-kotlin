// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.services.async.IntrafiExclusionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List IntraFi Exclusions */
class IntrafiExclusionListPageAsync
private constructor(
    private val intrafiExclusionsService: IntrafiExclusionServiceAsync,
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

        return /* spotless:off */ other is IntrafiExclusionListPageAsync && intrafiExclusionsService == other.intrafiExclusionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiExclusionsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPageAsync{intrafiExclusionsService=$intrafiExclusionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiExclusionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): IntrafiExclusionListPageAsync? {
        return getNextPageParams()?.let { intrafiExclusionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            intrafiExclusionsService: IntrafiExclusionServiceAsync,
            params: IntrafiExclusionListParams,
            response: IntrafiExclusionListPageResponse,
        ) = IntrafiExclusionListPageAsync(intrafiExclusionsService, params, response)
    }

    class AutoPager(private val firstPage: IntrafiExclusionListPageAsync) : Flow<IntrafiExclusion> {

        override suspend fun collect(collector: FlowCollector<IntrafiExclusion>) {
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
