// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.DeclinedTransactionService
import java.util.Objects

/** @see [DeclinedTransactionService.list] */
class DeclinedTransactionListPage
private constructor(
    private val service: DeclinedTransactionService,
    private val params: DeclinedTransactionListParams,
    private val response: DeclinedTransactionListPageResponse,
) {

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.data]
     */
    fun data(): List<DeclinedTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [DeclinedTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DeclinedTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): DeclinedTransactionListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DeclinedTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): DeclinedTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DeclinedTransactionListPage].
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

    /** A builder for [DeclinedTransactionListPage]. */
    class Builder internal constructor() {

        private var service: DeclinedTransactionService? = null
        private var params: DeclinedTransactionListParams? = null
        private var response: DeclinedTransactionListPageResponse? = null

        internal fun from(declinedTransactionListPage: DeclinedTransactionListPage) = apply {
            service = declinedTransactionListPage.service
            params = declinedTransactionListPage.params
            response = declinedTransactionListPage.response
        }

        fun service(service: DeclinedTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DeclinedTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DeclinedTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DeclinedTransactionListPage].
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
        fun build(): DeclinedTransactionListPage =
            DeclinedTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DeclinedTransactionListPage) :
        Sequence<DeclinedTransaction> {

        override fun iterator(): Iterator<DeclinedTransaction> = iterator {
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

        return /* spotless:off */ other is DeclinedTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DeclinedTransactionListPage{service=$service, params=$params, response=$response}"
}
