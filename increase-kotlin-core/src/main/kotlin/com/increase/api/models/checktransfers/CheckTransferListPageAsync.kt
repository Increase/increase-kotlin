// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckTransferServiceAsync
import java.util.Objects

/** @see CheckTransferServiceAsync.list */
class CheckTransferListPageAsync
private constructor(
    private val service: CheckTransferServiceAsync,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) : PageAsync<CheckTransfer> {

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CheckTransferListPageResponse.data
     */
    fun data(): List<CheckTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see CheckTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CheckTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CheckTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CheckTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckTransferListPageAsync].
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

    /** A builder for [CheckTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckTransferServiceAsync? = null
        private var params: CheckTransferListParams? = null
        private var response: CheckTransferListPageResponse? = null

        internal fun from(checkTransferListPageAsync: CheckTransferListPageAsync) = apply {
            service = checkTransferListPageAsync.service
            params = checkTransferListPageAsync.params
            response = checkTransferListPageAsync.response
        }

        fun service(service: CheckTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckTransferListPageAsync].
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
        fun build(): CheckTransferListPageAsync =
            CheckTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckTransferListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CheckTransferListPageAsync{service=$service, params=$params, response=$response}"
}
