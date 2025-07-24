// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardDisputeServiceAsync
import java.util.Objects

/** @see CardDisputeServiceAsync.list */
class CardDisputeListPageAsync
private constructor(
    private val service: CardDisputeServiceAsync,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) : PageAsync<CardDispute> {

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see CardDisputeListPageResponse.data
     */
    fun data(): List<CardDispute> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardDisputeListPageResponse], but gracefully handles missing data.
     *
     * @see CardDisputeListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CardDispute> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardDisputeListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CardDisputeListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardDispute> = AutoPagerAsync.from(this)

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
