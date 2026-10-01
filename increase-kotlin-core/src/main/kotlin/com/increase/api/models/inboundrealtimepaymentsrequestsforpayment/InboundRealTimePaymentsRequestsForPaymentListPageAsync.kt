// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentsrequestsforpayment

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundRealTimePaymentsRequestsForPaymentServiceAsync
import java.util.Objects

/** @see InboundRealTimePaymentsRequestsForPaymentServiceAsync.list */
class InboundRealTimePaymentsRequestsForPaymentListPageAsync
private constructor(
    private val service: InboundRealTimePaymentsRequestsForPaymentServiceAsync,
    private val params: InboundRealTimePaymentsRequestsForPaymentListParams,
    private val response: InboundRealTimePaymentsRequestsForPaymentListPageResponse,
) : PageAsync<InboundRealTimePaymentsRequestForPayment> {

    /**
     * Delegates to [InboundRealTimePaymentsRequestsForPaymentListPageResponse], but gracefully
     * handles missing data.
     *
     * @see InboundRealTimePaymentsRequestsForPaymentListPageResponse.data
     */
    fun data(): List<InboundRealTimePaymentsRequestForPayment> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsRequestsForPaymentListPageResponse], but gracefully
     * handles missing data.
     *
     * @see InboundRealTimePaymentsRequestsForPaymentListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundRealTimePaymentsRequestForPayment> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundRealTimePaymentsRequestsForPaymentListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundRealTimePaymentsRequestsForPaymentListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundRealTimePaymentsRequestForPayment> =
        AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundRealTimePaymentsRequestsForPaymentListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsRequestsForPaymentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundRealTimePaymentsRequestsForPaymentListPageAsync].
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

    /** A builder for [InboundRealTimePaymentsRequestsForPaymentListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundRealTimePaymentsRequestsForPaymentServiceAsync? = null
        private var params: InboundRealTimePaymentsRequestsForPaymentListParams? = null
        private var response: InboundRealTimePaymentsRequestsForPaymentListPageResponse? = null

        internal fun from(
            inboundRealTimePaymentsRequestsForPaymentListPageAsync:
                InboundRealTimePaymentsRequestsForPaymentListPageAsync
        ) = apply {
            service = inboundRealTimePaymentsRequestsForPaymentListPageAsync.service
            params = inboundRealTimePaymentsRequestsForPaymentListPageAsync.params
            response = inboundRealTimePaymentsRequestsForPaymentListPageAsync.response
        }

        fun service(service: InboundRealTimePaymentsRequestsForPaymentServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundRealTimePaymentsRequestsForPaymentListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: InboundRealTimePaymentsRequestsForPaymentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of
         * [InboundRealTimePaymentsRequestsForPaymentListPageAsync].
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
        fun build(): InboundRealTimePaymentsRequestsForPaymentListPageAsync =
            InboundRealTimePaymentsRequestsForPaymentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundRealTimePaymentsRequestsForPaymentListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundRealTimePaymentsRequestsForPaymentListPageAsync{service=$service, params=$params, response=$response}"
}
