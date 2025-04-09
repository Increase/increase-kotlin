// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.increase.api.services.blocking.DocumentService
import java.util.Objects

/** List Documents */
class DocumentListPage
private constructor(
    private val documentsService: DocumentService,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [DocumentListPageResponse.data]
     */
    fun data(): List<Document> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [DocumentListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DocumentListPage && documentsService == other.documentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(documentsService, params, response) /* spotless:on */

    override fun toString() =
        "DocumentListPage{documentsService=$documentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DocumentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): DocumentListPage? {
        return getNextPageParams()?.let { documentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            documentsService: DocumentService,
            params: DocumentListParams,
            response: DocumentListPageResponse,
        ) = DocumentListPage(documentsService, params, response)
    }

    class AutoPager(private val firstPage: DocumentListPage) : Sequence<Document> {

        override fun iterator(): Iterator<Document> = iterator {
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
