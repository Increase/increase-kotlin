// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [CardDisputeServiceAsync.list] */
class CardDisputeListPageAsync
private constructor(
    private val service: CardDisputeServiceAsync,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) {

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.data]
     */
    fun data(): List<CardDispute> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see [CardDisputeListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardDisputeListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardDisputeListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardDisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardDisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDisputeListPageAsync].
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

    /** A builder for [CardDisputeListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardDisputeServiceAsync? = null
        private var params: CardDisputeListParams? = null
        private var response: CardDisputeListPageResponse? = null

        internal fun from(cardDisputeListPageAsync: CardDisputeListPageAsync) = apply {
            service = cardDisputeListPageAsync.service
            params = cardDisputeListPageAsync.params
            response = cardDisputeListPageAsync.response
        }

        fun service(service: CardDisputeServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardDisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardDisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardDisputeListPageAsync].
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
        fun build(): CardDisputeListPageAsync =
            CardDisputeListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardDisputeListPageAsync) : Flow<CardDispute> {

        override suspend fun collect(collector: FlowCollector<CardDispute>) {
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

        return /* spotless:off */ other is CardDisputeListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPageAsync{service=$service, params=$params, response=$response}"
}
