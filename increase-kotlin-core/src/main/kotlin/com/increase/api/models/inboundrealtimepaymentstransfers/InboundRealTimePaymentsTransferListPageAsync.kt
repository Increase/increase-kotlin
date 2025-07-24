// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundRealTimePaymentsTransferServiceAsync
import java.util.Objects

/** @see InboundRealTimePaymentsTransferServiceAsync.list */
class InboundRealTimePaymentsTransferListPageAsync
private constructor(
    private val service: InboundRealTimePaymentsTransferServiceAsync,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: InboundRealTimePaymentsTransferListPageResponse,
) : PageAsync<InboundRealTimePaymentsTransfer> {

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see InboundRealTimePaymentsTransferListPageResponse.data
     */
    fun data(): List<InboundRealTimePaymentsTransfer> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see InboundRealTimePaymentsTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundRealTimePaymentsTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundRealTimePaymentsTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundRealTimePaymentsTransferListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundRealTimePaymentsTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundRealTimePaymentsTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundRealTimePaymentsTransferListPageAsync].
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

    /** A builder for [InboundRealTimePaymentsTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundRealTimePaymentsTransferServiceAsync? = null
        private var params: InboundRealTimePaymentsTransferListParams? = null
        private var response: InboundRealTimePaymentsTransferListPageResponse? = null

        internal fun from(
            inboundRealTimePaymentsTransferListPageAsync:
                InboundRealTimePaymentsTransferListPageAsync
        ) = apply {
            service = inboundRealTimePaymentsTransferListPageAsync.service
            params = inboundRealTimePaymentsTransferListPageAsync.params
            response = inboundRealTimePaymentsTransferListPageAsync.response
        }

        fun service(service: InboundRealTimePaymentsTransferServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundRealTimePaymentsTransferListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: InboundRealTimePaymentsTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundRealTimePaymentsTransferListPageAsync].
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
        fun build(): InboundRealTimePaymentsTransferListPageAsync =
            InboundRealTimePaymentsTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPageAsync{service=$service, params=$params, response=$response}"
}
