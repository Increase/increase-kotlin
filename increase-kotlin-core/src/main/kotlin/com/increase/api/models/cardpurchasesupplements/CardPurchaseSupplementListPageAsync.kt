// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpurchasesupplements

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPurchaseSupplementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [CardPurchaseSupplementServiceAsync.list] */
class CardPurchaseSupplementListPageAsync
private constructor(
    private val service: CardPurchaseSupplementServiceAsync,
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

    suspend fun getNextPage(): CardPurchaseSupplementListPageAsync? =
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
         * [CardPurchaseSupplementListPageAsync].
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

    /** A builder for [CardPurchaseSupplementListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPurchaseSupplementServiceAsync? = null
        private var params: CardPurchaseSupplementListParams? = null
        private var response: CardPurchaseSupplementListPageResponse? = null

        internal fun from(
            cardPurchaseSupplementListPageAsync: CardPurchaseSupplementListPageAsync
        ) = apply {
            service = cardPurchaseSupplementListPageAsync.service
            params = cardPurchaseSupplementListPageAsync.params
            response = cardPurchaseSupplementListPageAsync.response
        }

        fun service(service: CardPurchaseSupplementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPurchaseSupplementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPurchaseSupplementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [CardPurchaseSupplementListPageAsync].
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
        fun build(): CardPurchaseSupplementListPageAsync =
            CardPurchaseSupplementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardPurchaseSupplementListPageAsync) :
        Flow<CardPurchaseSupplement> {

        override suspend fun collect(collector: FlowCollector<CardPurchaseSupplement>) {
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

        return /* spotless:off */ other is CardPurchaseSupplementListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPurchaseSupplementListPageAsync{service=$service, params=$params, response=$response}"
}
