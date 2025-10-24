// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.fednowtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.FednowTransferServiceAsync
import java.util.Objects

/** @see FednowTransferServiceAsync.list */
class FednowTransferListPageAsync
private constructor(
    private val service: FednowTransferServiceAsync,
    private val params: FednowTransferListParams,
    private val response: FednowTransferListPageResponse,
) : PageAsync<FednowTransfer> {

    /**
     * Delegates to [FednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see FednowTransferListPageResponse.data
     */
    fun data(): List<FednowTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [FednowTransferListPageResponse], but gracefully handles missing data.
     *
     * @see FednowTransferListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<FednowTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): FednowTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): FednowTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<FednowTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): FednowTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): FednowTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [FednowTransferListPageAsync].
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

    /** A builder for [FednowTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: FednowTransferServiceAsync? = null
        private var params: FednowTransferListParams? = null
        private var response: FednowTransferListPageResponse? = null

        internal fun from(fednowTransferListPageAsync: FednowTransferListPageAsync) = apply {
            service = fednowTransferListPageAsync.service
            params = fednowTransferListPageAsync.params
            response = fednowTransferListPageAsync.response
        }

        fun service(service: FednowTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: FednowTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: FednowTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [FednowTransferListPageAsync].
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
        fun build(): FednowTransferListPageAsync =
            FednowTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is FednowTransferListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "FednowTransferListPageAsync{service=$service, params=$params, response=$response}"
}
