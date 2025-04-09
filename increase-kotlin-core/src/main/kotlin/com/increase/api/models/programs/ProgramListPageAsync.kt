// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.services.async.ProgramServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Programs */
class ProgramListPageAsync
private constructor(
    private val programsService: ProgramServiceAsync,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.data]
     */
    fun data(): List<Program> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see [ProgramListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProgramListPageAsync && programsService == other.programsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(programsService, params, response) /* spotless:on */

    override fun toString() =
        "ProgramListPageAsync{programsService=$programsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ProgramListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): ProgramListPageAsync? {
        return getNextPageParams()?.let { programsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            programsService: ProgramServiceAsync,
            params: ProgramListParams,
            response: ProgramListPageResponse,
        ) = ProgramListPageAsync(programsService, params, response)
    }

    class AutoPager(private val firstPage: ProgramListPageAsync) : Flow<Program> {

        override suspend fun collect(collector: FlowCollector<Program>) {
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
