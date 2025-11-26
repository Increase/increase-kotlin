// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundWireTransferServiceAsync
import java.util.Objects

/** @see InboundWireTransferServiceAsync.list */
class InboundWireTransferListPageAsync
private constructor(
    private val service: InboundWireTransferServiceAsync,
    private val params: InboundWireTransferListParams,
    private val response: InboundWireTransferListPageResponse,
) : PageAsync<InboundWireTransfer> {

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundWireTransferListPageResponse.data
     */
    fun data(): List<InboundWireTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundWireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundWireTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundWireTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundWireTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundWireTransferListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundWireTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundWireTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundWireTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireTransferListPageAsync].
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

    /** A builder for [InboundWireTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundWireTransferServiceAsync? = null
        private var params: InboundWireTransferListParams? = null
        private var response: InboundWireTransferListPageResponse? = null

        internal fun from(inboundWireTransferListPageAsync: InboundWireTransferListPageAsync) =
            apply {
                service = inboundWireTransferListPageAsync.service
                params = inboundWireTransferListPageAsync.params
                response = inboundWireTransferListPageAsync.response
            }

        fun service(service: InboundWireTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundWireTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundWireTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundWireTransferListPageAsync].
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
        fun build(): InboundWireTransferListPageAsync =
            InboundWireTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireTransferListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundWireTransferListPageAsync{service=$service, params=$params, response=$response}"
}
