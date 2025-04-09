// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardpayments

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardPaymentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [CardPaymentServiceAsync.list] */
class CardPaymentListPageAsync
private constructor(
    private val service: CardPaymentServiceAsync,
    private val params: CardPaymentListParams,
    private val response: CardPaymentListPageResponse,
) {

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.data]
     */
    fun data(): List<CardPayment> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardPaymentListPageResponse], but gracefully handles missing data.
     *
     * @see [CardPaymentListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CardPaymentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CardPaymentListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): CardPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardPaymentListPageAsync].
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

    /** A builder for [CardPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardPaymentServiceAsync? = null
        private var params: CardPaymentListParams? = null
        private var response: CardPaymentListPageResponse? = null

        internal fun from(cardPaymentListPageAsync: CardPaymentListPageAsync) = apply {
            service = cardPaymentListPageAsync.service
            params = cardPaymentListPageAsync.params
            response = cardPaymentListPageAsync.response
        }

        fun service(service: CardPaymentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardPaymentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardPaymentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardPaymentListPageAsync].
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
        fun build(): CardPaymentListPageAsync =
            CardPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: CardPaymentListPageAsync) : Flow<CardPayment> {

        override suspend fun collect(collector: FlowCollector<CardPayment>) {
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

        return /* spotless:off */ other is CardPaymentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CardPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
