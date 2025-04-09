// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiexclusions

import com.increase.api.core.checkRequired
import com.increase.api.services.async.IntrafiExclusionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [IntrafiExclusionServiceAsync.list] */
class IntrafiExclusionListPageAsync
private constructor(
    private val service: IntrafiExclusionServiceAsync,
    private val params: IntrafiExclusionListParams,
    private val response: IntrafiExclusionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiExclusionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): IntrafiExclusionListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiExclusionListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiExclusionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiExclusionListPageAsync].
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

    /** A builder for [IntrafiExclusionListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntrafiExclusionServiceAsync? = null
        private var params: IntrafiExclusionListParams? = null
        private var response: IntrafiExclusionListPageResponse? = null

        internal fun from(intrafiExclusionListPageAsync: IntrafiExclusionListPageAsync) = apply {
            service = intrafiExclusionListPageAsync.service
            params = intrafiExclusionListPageAsync.params
            response = intrafiExclusionListPageAsync.response
        }

        fun service(service: IntrafiExclusionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiExclusionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiExclusionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiExclusionListPageAsync].
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
        fun build(): IntrafiExclusionListPageAsync =
            IntrafiExclusionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiExclusionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiExclusionListPageAsync{service=$service, params=$params, response=$response}"
}
