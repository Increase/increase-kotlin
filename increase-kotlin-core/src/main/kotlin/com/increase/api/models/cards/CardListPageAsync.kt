// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardServiceAsync
import java.util.Objects

/** @see CardServiceAsync.list */
class CardListPageAsync
private constructor(
    private val service: CardServiceAsync,
    private val params: CardListParams,
    private val response: CardListPageResponse,
) : PageAsync<Card> {

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.data
     */
    fun data(): List<Card> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardListPageResponse], but gracefully handles missing data.
     *
     * @see CardListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Card> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CardListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Card> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardListPageAsync].
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

    /** A builder for [CardListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardServiceAsync? = null
        private var params: CardListParams? = null
        private var response: CardListPageResponse? = null

        internal fun from(cardListPageAsync: CardListPageAsync) = apply {
            service = cardListPageAsync.service
            params = cardListPageAsync.params
            response = cardListPageAsync.response
        }

        fun service(service: CardServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardListPageAsync].
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
        fun build(): CardListPageAsync =
            CardListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardListPageAsync{service=$service, params=$params, response=$response}"
}
