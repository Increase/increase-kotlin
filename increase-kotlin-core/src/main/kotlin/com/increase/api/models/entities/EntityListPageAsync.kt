// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import com.increase.api.core.checkRequired
import com.increase.api.services.async.EntityServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [EntityServiceAsync.list] */
class EntityListPageAsync
private constructor(
    private val service: EntityServiceAsync,
    private val params: EntityListParams,
    private val response: EntityListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): EntityListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): EntityListPageAsync? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): EntityListParams = params

    /** The response that this page was parsed from. */
    fun response(): EntityListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [EntityListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [EntityListPageAsync]. */
    class Builder internal constructor() {

        private var service: EntityServiceAsync? = null
        private var params: EntityListParams? = null
        private var response: EntityListPageResponse? = null

        internal fun from(entityListPageAsync: EntityListPageAsync) = apply {
            service = entityListPageAsync.service
            params = entityListPageAsync.params
            response = entityListPageAsync.response
        }

        fun service(service: EntityServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: EntityListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: EntityListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [EntityListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): EntityListPageAsync =
            EntityListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EntityListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "EntityListPageAsync{service=$service, params=$params, response=$response}"
}
