// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.carddisputes

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardDisputeService
import java.util.Objects

/** @see CardDisputeService.list */
class CardDisputeListPage
private constructor(
    private val service: CardDisputeService,
    private val params: CardDisputeListParams,
    private val response: CardDisputeListPageResponse,
) : Page<CardDispute> {

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

    override fun nextPage(): CardDisputeListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardDispute> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardDisputeListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardDisputeListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardDisputeListPage].
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

    /** A builder for [CardDisputeListPage]. */
    class Builder internal constructor() {

        private var service: CardDisputeService? = null
        private var params: CardDisputeListParams? = null
        private var response: CardDisputeListPageResponse? = null

        internal fun from(cardDisputeListPage: CardDisputeListPage) = apply {
            service = cardDisputeListPage.service
            params = cardDisputeListPage.params
            response = cardDisputeListPage.response
        }

        fun service(service: CardDisputeService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardDisputeListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardDisputeListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardDisputeListPage].
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
        fun build(): CardDisputeListPage =
            CardDisputeListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardDisputeListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardDisputeListPage{service=$service, params=$params, response=$response}"
}
