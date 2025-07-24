// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardPurchaseSupplementService
import java.util.Objects

/** @see CardPurchaseSupplementService.list */
class CardPurchaseSupplementListPage
private constructor(
    private val service: CardPurchaseSupplementService,
    private val params: CardPurchaseSupplementListParams,
    private val response: CardPurchaseSupplementListPageResponse,
) : Page<CardPurchaseSupplement> {

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see CardPurchaseSupplementListPageResponse.data
     */
    fun data(): List<CardPurchaseSupplement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see CardPurchaseSupplementListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CardPurchaseSupplement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardPurchaseSupplementListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CardPurchaseSupplementListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CardPurchaseSupplement> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPurchaseSupplementListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPurchaseSupplementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [CardPurchaseSupplementListPage].
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

    /** A builder for [CardPurchaseSupplementListPage]. */
    class Builder internal constructor() {

        private var service: CardPurchaseSupplementService? = null
        private var params: CardPurchaseSupplementListParams? = null
        private var response: CardPurchaseSupplementListPageResponse? = null

        internal fun from(cardPurchaseSupplementListPage: CardPurchaseSupplementListPage) = apply {
            service = cardPurchaseSupplementListPage.service
            params = cardPurchaseSupplementListPage.params
            response = cardPurchaseSupplementListPage.response
        }

        fun service(service: CardPurchaseSupplementService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPurchaseSupplementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPurchaseSupplementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPurchaseSupplementListPage].
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
        fun build(): CardPurchaseSupplementListPage =
            CardPurchaseSupplementListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CardPurchaseSupplementListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPage{service=$service, params=$params, response=$response}"
}
