// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpushtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPushTransferServiceAsync
import java.util.Objects

/** @see CardPushTransferServiceAsync.list */
class CardPushTransferListPageAsync
private constructor(
    private val service: CardPushTransferServiceAsync,
    private val params: CardPushTransferListParams,
    private val response: CardPushTransferListPageResponse,
) : PageAsync<CardPushTransfer> {

    /**
     * Delegates to [CardPushTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CardPushTransferListPageResponse.data
     */
    fun data(): List<CardPushTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPushTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CardPushTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CardPushTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardPushTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CardPushTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardPushTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPushTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPushTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardPushTransferListPageAsync].
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

    /** A builder for [CardPushTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPushTransferServiceAsync? = null
        private var params: CardPushTransferListParams? = null
        private var response: CardPushTransferListPageResponse? = null

        internal fun from(cardPushTransferListPageAsync: CardPushTransferListPageAsync) = apply {
            service = cardPushTransferListPageAsync.service
            params = cardPushTransferListPageAsync.params
            response = cardPushTransferListPageAsync.response
        }

        fun service(service: CardPushTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPushTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPushTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPushTransferListPageAsync].
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
        fun build(): CardPushTransferListPageAsync =
            CardPushTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardPushTransferListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardPushTransferListPageAsync{service=$service, params=$params, response=$response}"
}
