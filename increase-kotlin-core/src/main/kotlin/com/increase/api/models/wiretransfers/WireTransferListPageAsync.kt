// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.WireTransferServiceAsync
import java.util.Objects

/** @see [WireTransferServiceAsync.list] */
class WireTransferListPageAsync
private constructor(
    private val service: WireTransferServiceAsync,
    private val params: WireTransferListParams,
    private val response: WireTransferListPageResponse,
) : PageAsync<WireTransfer> {

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.data]
     */
    fun data(): List<WireTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<WireTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): WireTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): WireTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<WireTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WireTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireTransferListPageAsync].
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

    /** A builder for [WireTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: WireTransferServiceAsync? = null
        private var params: WireTransferListParams? = null
        private var response: WireTransferListPageResponse? = null

        internal fun from(wireTransferListPageAsync: WireTransferListPageAsync) = apply {
            service = wireTransferListPageAsync.service
            params = wireTransferListPageAsync.params
            response = wireTransferListPageAsync.response
        }

        fun service(service: WireTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WireTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WireTransferListPageAsync].
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
        fun build(): WireTransferListPageAsync =
            WireTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WireTransferListPageAsync{service=$service, params=$params, response=$response}"
}
