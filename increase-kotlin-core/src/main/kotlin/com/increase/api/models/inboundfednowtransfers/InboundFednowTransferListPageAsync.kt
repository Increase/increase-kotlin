// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundfednowtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundFednowTransferServiceAsync
import java.util.Objects

/** @see InboundFednowTransferServiceAsync.list */
class InboundFednowTransferListPageAsync
private constructor(
    private val service: InboundFednowTransferServiceAsync,
    private val params: InboundFednowTransferListParams,
    private val response: InboundFednowTransferListPageResponse,
) : PageAsync<InboundFednowTransfer> {

    /**
     * Delegates to [InboundFednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundFednowTransferListPageResponse.data
     */
    fun data(): List<InboundFednowTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundFednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundFednowTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundFednowTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundFednowTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundFednowTransferListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundFednowTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundFednowTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundFednowTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundFednowTransferListPageAsync].
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

    /** A builder for [InboundFednowTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundFednowTransferServiceAsync? = null
        private var params: InboundFednowTransferListParams? = null
        private var response: InboundFednowTransferListPageResponse? = null

        internal fun from(inboundFednowTransferListPageAsync: InboundFednowTransferListPageAsync) =
            apply {
                service = inboundFednowTransferListPageAsync.service
                params = inboundFednowTransferListPageAsync.params
                response = inboundFednowTransferListPageAsync.response
            }

        fun service(service: InboundFednowTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundFednowTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundFednowTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundFednowTransferListPageAsync].
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
        fun build(): InboundFednowTransferListPageAsync =
            InboundFednowTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundFednowTransferListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundFednowTransferListPageAsync{service=$service, params=$params, response=$response}"
}
