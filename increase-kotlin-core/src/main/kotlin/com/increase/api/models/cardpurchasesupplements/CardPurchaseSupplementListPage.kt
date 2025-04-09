// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CardPurchaseSupplementService
import java.util.Objects

/** @see [CardPurchaseSupplementService.list] */
class CardPurchaseSupplementListPage
private constructor(
    private val service: CardPurchaseSupplementService,
    private val params: CardPurchaseSupplementListParams,
    private val response: CardPurchaseSupplementListPageResponse,
) {

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.data]
     */
    fun data(): List<CardPurchaseSupplement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPurchaseSupplementListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPurchaseSupplementListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardPurchaseSupplementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): CardPurchaseSupplementListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: CardPurchaseSupplementListPage) :
        Sequence<CardPurchaseSupplement> {

        override fun iterator(): Iterator<CardPurchaseSupplement> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
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

        return /* spotless:off */ other is CardPurchaseSupplementListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPage{service=$service, params=$params, response=$response}"
}
