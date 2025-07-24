// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundAchTransferServiceAsync
import java.util.Objects

/** @see InboundAchTransferServiceAsync.list */
class InboundAchTransferListPageAsync
private constructor(
    private val service: InboundAchTransferServiceAsync,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) : PageAsync<InboundAchTransfer> {

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundAchTransferListPageResponse.data
     */
    fun data(): List<InboundAchTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see InboundAchTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundAchTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundAchTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): InboundAchTransferListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<InboundAchTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundAchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferListPageAsync].
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

    /** A builder for [InboundAchTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundAchTransferServiceAsync? = null
        private var params: InboundAchTransferListParams? = null
        private var response: InboundAchTransferListPageResponse? = null

        internal fun from(inboundAchTransferListPageAsync: InboundAchTransferListPageAsync) =
            apply {
                service = inboundAchTransferListPageAsync.service
                params = inboundAchTransferListPageAsync.params
                response = inboundAchTransferListPageAsync.response
            }

        fun service(service: InboundAchTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundAchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundAchTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundAchTransferListPageAsync].
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
        fun build(): InboundAchTransferListPageAsync =
            InboundAchTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundAchTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPageAsync{service=$service, params=$params, response=$response}"
}
