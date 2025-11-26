// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundWireDrawdownRequestServiceAsync
import java.util.Objects

/** @see InboundWireDrawdownRequestServiceAsync.list */
class InboundWireDrawdownRequestListPageAsync
private constructor(
    private val service: InboundWireDrawdownRequestServiceAsync,
    private val params: InboundWireDrawdownRequestListParams,
    private val response: InboundWireDrawdownRequestListPageResponse,
) : PageAsync<InboundWireDrawdownRequest> {

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see InboundWireDrawdownRequestListPageResponse.data
     */
    fun data(): List<InboundWireDrawdownRequest> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see InboundWireDrawdownRequestListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundWireDrawdownRequest> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundWireDrawdownRequestListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundWireDrawdownRequestListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundWireDrawdownRequest> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundWireDrawdownRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundWireDrawdownRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundWireDrawdownRequestListPageAsync].
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

    /** A builder for [InboundWireDrawdownRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundWireDrawdownRequestServiceAsync? = null
        private var params: InboundWireDrawdownRequestListParams? = null
        private var response: InboundWireDrawdownRequestListPageResponse? = null

        internal fun from(
            inboundWireDrawdownRequestListPageAsync: InboundWireDrawdownRequestListPageAsync
        ) = apply {
            service = inboundWireDrawdownRequestListPageAsync.service
            params = inboundWireDrawdownRequestListPageAsync.params
            response = inboundWireDrawdownRequestListPageAsync.response
        }

        fun service(service: InboundWireDrawdownRequestServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundWireDrawdownRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundWireDrawdownRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundWireDrawdownRequestListPageAsync].
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
        fun build(): InboundWireDrawdownRequestListPageAsync =
            InboundWireDrawdownRequestListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is InboundWireDrawdownRequestListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "InboundWireDrawdownRequestListPageAsync{service=$service, params=$params, response=$response}"
}
