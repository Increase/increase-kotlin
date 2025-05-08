// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.RealTimePaymentsTransferServiceAsync
import java.util.Objects

/** @see [RealTimePaymentsTransferServiceAsync.list] */
class RealTimePaymentsTransferListPageAsync
private constructor(
    private val service: RealTimePaymentsTransferServiceAsync,
    private val params: RealTimePaymentsTransferListParams,
    private val response: RealTimePaymentsTransferListPageResponse,
) : PageAsync<RealTimePaymentsTransfer> {

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<RealTimePaymentsTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<RealTimePaymentsTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): RealTimePaymentsTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): RealTimePaymentsTransferListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RealTimePaymentsTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsTransferListPageAsync].
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

    /** A builder for [RealTimePaymentsTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsTransferServiceAsync? = null
        private var params: RealTimePaymentsTransferListParams? = null
        private var response: RealTimePaymentsTransferListPageResponse? = null

        internal fun from(
            realTimePaymentsTransferListPageAsync: RealTimePaymentsTransferListPageAsync
        ) = apply {
            service = realTimePaymentsTransferListPageAsync.service
            params = realTimePaymentsTransferListPageAsync.params
            response = realTimePaymentsTransferListPageAsync.response
        }

        fun service(service: RealTimePaymentsTransferServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: RealTimePaymentsTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RealTimePaymentsTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RealTimePaymentsTransferListPageAsync].
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
        fun build(): RealTimePaymentsTransferListPageAsync =
            RealTimePaymentsTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RealTimePaymentsTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferListPageAsync{service=$service, params=$params, response=$response}"
}
