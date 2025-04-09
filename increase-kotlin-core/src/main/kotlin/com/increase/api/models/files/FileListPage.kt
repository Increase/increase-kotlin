// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.services.blocking.FileService
import java.util.Objects

/** List Files */
class FileListPage
private constructor(
    private val filesService: FileService,
    private val params: FileListParams,
    private val response: FileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): FileListPageResponse = response

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.data]
     */
    fun data(): List<File> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FileListPageResponse], but gracefully handles missing data.
     *
     * @see [FileListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is FileListPage && filesService == other.filesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(filesService, params, response) /* spotless:on */

    override fun toString() =
        "FileListPage{filesService=$filesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): FileListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): FileListPage? {
        return getNextPageParams()?.let { filesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(filesService: FileService, params: FileListParams, response: FileListPageResponse) =
            FileListPage(filesService, params, response)
    }

    class AutoPager(private val firstPage: FileListPage) : Sequence<File> {

        override fun iterator(): Iterator<File> = iterator {
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
