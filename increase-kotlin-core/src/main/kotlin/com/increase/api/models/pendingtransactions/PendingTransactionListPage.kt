// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.PendingTransactionService
import java.util.Objects

/** @see PendingTransactionService.list */
class PendingTransactionListPage
private constructor(
    private val service: PendingTransactionService,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) : Page<PendingTransaction> {

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see PendingTransactionListPageResponse.data
     */
    fun data(): List<PendingTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see PendingTransactionListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<PendingTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PendingTransactionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): PendingTransactionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<PendingTransaction> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PendingTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PendingTransactionListPage].
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

    /** A builder for [PendingTransactionListPage]. */
    class Builder internal constructor() {

        private var service: PendingTransactionService? = null
        private var params: PendingTransactionListParams? = null
        private var response: PendingTransactionListPageResponse? = null

        internal fun from(pendingTransactionListPage: PendingTransactionListPage) = apply {
            service = pendingTransactionListPage.service
            params = pendingTransactionListPage.params
            response = pendingTransactionListPage.response
        }

        fun service(service: PendingTransactionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PendingTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PendingTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PendingTransactionListPage].
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
        fun build(): PendingTransactionListPage =
            PendingTransactionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPage{service=$service, params=$params, response=$response}"
}
