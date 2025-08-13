// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.declinedtransactions

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DeclinedTransactionServiceAsync
import java.util.Objects

/** @see DeclinedTransactionServiceAsync.list */
class DeclinedTransactionListPageAsync
private constructor(
    private val service: DeclinedTransactionServiceAsync,
    private val params: DeclinedTransactionListParams,
    private val response: DeclinedTransactionListPageResponse,
) : PageAsync<DeclinedTransaction> {

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see DeclinedTransactionListPageResponse.data
     */
    fun data(): List<DeclinedTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DeclinedTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see DeclinedTransactionListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<DeclinedTransaction> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): DeclinedTransactionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): DeclinedTransactionListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DeclinedTransaction> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DeclinedTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): DeclinedTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DeclinedTransactionListPageAsync].
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

    /** A builder for [DeclinedTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: DeclinedTransactionServiceAsync? = null
        private var params: DeclinedTransactionListParams? = null
        private var response: DeclinedTransactionListPageResponse? = null

        internal fun from(declinedTransactionListPageAsync: DeclinedTransactionListPageAsync) =
            apply {
                service = declinedTransactionListPageAsync.service
                params = declinedTransactionListPageAsync.params
                response = declinedTransactionListPageAsync.response
            }

        fun service(service: DeclinedTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DeclinedTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DeclinedTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DeclinedTransactionListPageAsync].
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
        fun build(): DeclinedTransactionListPageAsync =
            DeclinedTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DeclinedTransactionListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DeclinedTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
