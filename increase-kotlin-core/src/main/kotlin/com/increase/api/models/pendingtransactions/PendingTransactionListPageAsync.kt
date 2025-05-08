// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.PendingTransactionServiceAsync
import java.util.Objects

/** @see [PendingTransactionServiceAsync.list] */
class PendingTransactionListPageAsync
private constructor(
    private val service: PendingTransactionServiceAsync,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) : PageAsync<PendingTransaction> {

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.data]
     */
    fun data(): List<PendingTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<PendingTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PendingTransactionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PendingTransactionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PendingTransaction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PendingTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PendingTransactionListPageAsync].
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

    /** A builder for [PendingTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PendingTransactionServiceAsync? = null
        private var params: PendingTransactionListParams? = null
        private var response: PendingTransactionListPageResponse? = null

        internal fun from(pendingTransactionListPageAsync: PendingTransactionListPageAsync) =
            apply {
                service = pendingTransactionListPageAsync.service
                params = pendingTransactionListPageAsync.params
                response = pendingTransactionListPageAsync.response
            }

        fun service(service: PendingTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PendingTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PendingTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PendingTransactionListPageAsync].
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
        fun build(): PendingTransactionListPageAsync =
            PendingTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PendingTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
