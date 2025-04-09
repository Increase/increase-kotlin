// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.increase.api.services.async.EntityServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Entities */
class EntityListPageAsync
private constructor(
    private val entitiesService: EntityServiceAsync,
    private val params: EntityListParams,
    private val response: EntityListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EntityListPageResponse = response

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see [EntityListPageResponse.data]
     */
    fun data(): List<Entity> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EntityListPageResponse], but gracefully handles missing data.
     *
     * @see [EntityListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityListPageAsync && entitiesService == other.entitiesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(entitiesService, params, response) /* spotless:on */

    override fun toString() =
        "EntityListPageAsync{entitiesService=$entitiesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): EntityListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): EntityListPageAsync? {
        return getNextPageParams()?.let { entitiesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            entitiesService: EntityServiceAsync,
            params: EntityListParams,
            response: EntityListPageResponse,
        ) = EntityListPageAsync(entitiesService, params, response)
    }

    class AutoPager(private val firstPage: EntityListPageAsync) : Flow<Entity> {

        override suspend fun collect(collector: FlowCollector<Entity>) {
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
