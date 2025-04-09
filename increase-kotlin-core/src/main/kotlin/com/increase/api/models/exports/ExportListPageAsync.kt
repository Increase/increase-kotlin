// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.services.async.ExportServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Exports */
class ExportListPageAsync
private constructor(
    private val exportsService: ExportServiceAsync,
    private val params: ExportListParams,
    private val response: ExportListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExportListPageResponse = response

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.data]
     */
    fun data(): List<Export> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExportListPageAsync && exportsService == other.exportsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(exportsService, params, response) /* spotless:on */

    override fun toString() =
        "ExportListPageAsync{exportsService=$exportsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ExportListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): ExportListPageAsync? {
        return getNextPageParams()?.let { exportsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            exportsService: ExportServiceAsync,
            params: ExportListParams,
            response: ExportListPageResponse,
        ) = ExportListPageAsync(exportsService, params, response)
    }

    class AutoPager(private val firstPage: ExportListPageAsync) : Flow<Export> {

        override suspend fun collect(collector: FlowCollector<Export>) {
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
