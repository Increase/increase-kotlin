// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.services.blocking.ExportService
import java.util.Objects

/** List Exports */
class ExportListPage
private constructor(
    private val exportsService: ExportService,
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

        return /* spotless:off */ other is ExportListPage && exportsService == other.exportsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(exportsService, params, response) /* spotless:on */

    override fun toString() =
        "ExportListPage{exportsService=$exportsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ExportListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ExportListPage? {
        return getNextPageParams()?.let { exportsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            exportsService: ExportService,
            params: ExportListParams,
            response: ExportListPageResponse,
        ) = ExportListPage(exportsService, params, response)
    }

    class AutoPager(private val firstPage: ExportListPage) : Sequence<Export> {

        override fun iterator(): Iterator<Export> = iterator {
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
