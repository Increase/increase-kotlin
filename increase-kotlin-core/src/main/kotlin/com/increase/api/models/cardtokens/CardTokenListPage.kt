// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardtokens

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardTokenService
import java.util.Objects

/** @see CardTokenService.list */
class CardTokenListPage
private constructor(
    private val service: CardTokenService,
    private val params: CardTokenListParams,
    private val response: CardTokenListPageResponse,
) : Page<CardToken> {

    /**
     * Delegates to [CardTokenListPageResponse], but gracefully handles missing data.
     *
     * @see CardTokenListPageResponse.data
     */
    fun data(): List<CardToken> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardTokenListPageResponse], but gracefully handles missing data.
     *
     * @see CardTokenListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CardToken> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardTokenListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CardTokenListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardToken> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardTokenListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardTokenListPage].
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

    /** A builder for [CardTokenListPage]. */
    class Builder internal constructor() {

        private var service: CardTokenService? = null
        private var params: CardTokenListParams? = null
        private var response: CardTokenListPageResponse? = null

        internal fun from(cardTokenListPage: CardTokenListPage) = apply {
            service = cardTokenListPage.service
            params = cardTokenListPage.params
            response = cardTokenListPage.response
        }

        fun service(service: CardTokenService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardTokenListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardTokenListPage].
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
        fun build(): CardTokenListPage =
            CardTokenListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardTokenListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardTokenListPage{service=$service, params=$params, response=$response}"
}
