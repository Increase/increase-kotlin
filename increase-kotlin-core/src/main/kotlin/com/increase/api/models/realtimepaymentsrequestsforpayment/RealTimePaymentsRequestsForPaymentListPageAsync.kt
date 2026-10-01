// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentsrequestsforpayment

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.RealTimePaymentsRequestsForPaymentServiceAsync
import java.util.Objects

/** @see RealTimePaymentsRequestsForPaymentServiceAsync.list */
class RealTimePaymentsRequestsForPaymentListPageAsync
private constructor(
    private val service: RealTimePaymentsRequestsForPaymentServiceAsync,
    private val params: RealTimePaymentsRequestsForPaymentListParams,
    private val response: RealTimePaymentsRequestsForPaymentListPageResponse,
) : PageAsync<RealTimePaymentsRequestForPayment> {

    /**
     * Delegates to [RealTimePaymentsRequestsForPaymentListPageResponse], but gracefully handles
     * missing data.
     *
     * @see RealTimePaymentsRequestsForPaymentListPageResponse.data
     */
    fun data(): List<RealTimePaymentsRequestForPayment> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsRequestsForPaymentListPageResponse], but gracefully handles
     * missing data.
     *
     * @see RealTimePaymentsRequestsForPaymentListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<RealTimePaymentsRequestForPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): RealTimePaymentsRequestsForPaymentListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): RealTimePaymentsRequestsForPaymentListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RealTimePaymentsRequestForPayment> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsRequestsForPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsRequestsForPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsRequestsForPaymentListPageAsync].
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

    /** A builder for [RealTimePaymentsRequestsForPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsRequestsForPaymentServiceAsync? = null
        private var params: RealTimePaymentsRequestsForPaymentListParams? = null
        private var response: RealTimePaymentsRequestsForPaymentListPageResponse? = null

        internal fun from(
            realTimePaymentsRequestsForPaymentListPageAsync:
                RealTimePaymentsRequestsForPaymentListPageAsync
        ) = apply {
            service = realTimePaymentsRequestsForPaymentListPageAsync.service
            params = realTimePaymentsRequestsForPaymentListPageAsync.params
            response = realTimePaymentsRequestsForPaymentListPageAsync.response
        }

        fun service(service: RealTimePaymentsRequestsForPaymentServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: RealTimePaymentsRequestsForPaymentListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: RealTimePaymentsRequestsForPaymentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RealTimePaymentsRequestsForPaymentListPageAsync].
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
        fun build(): RealTimePaymentsRequestsForPaymentListPageAsync =
            RealTimePaymentsRequestsForPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is RealTimePaymentsRequestsForPaymentListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "RealTimePaymentsRequestsForPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
