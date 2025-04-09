// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.files

import com.increase.api.services.async.FileServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Files */
class FileListPageAsync
private constructor(
    private val filesService: FileServiceAsync,
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

        return /* spotless:off */ other is FileListPageAsync && filesService == other.filesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(filesService, params, response) /* spotless:on */

    override fun toString() =
        "FileListPageAsync{filesService=$filesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): FileListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): FileListPageAsync? {
        return getNextPageParams()?.let { filesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            filesService: FileServiceAsync,
            params: FileListParams,
            response: FileListPageResponse,
        ) = FileListPageAsync(filesService, params, response)
    }

    class AutoPager(private val firstPage: FileListPageAsync) : Flow<File> {

        override suspend fun collect(collector: FlowCollector<File>) {
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
