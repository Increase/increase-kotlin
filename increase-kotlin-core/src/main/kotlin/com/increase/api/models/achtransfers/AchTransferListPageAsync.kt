// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AchTransferServiceAsync
import java.util.Objects

/** @see [AchTransferServiceAsync.list] */
class AchTransferListPageAsync
private constructor(
    private val service: AchTransferServiceAsync,
    private val params: AchTransferListParams,
    private val response: AchTransferListPageResponse,
) : PageAsync<AchTransfer> {

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.data]
     */
    fun data(): List<AchTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<AchTransfer> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AchTransferListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AchTransferListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AchTransfer> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): AchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AchTransferListPageAsync].
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

    /** A builder for [AchTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: AchTransferServiceAsync? = null
        private var params: AchTransferListParams? = null
        private var response: AchTransferListPageResponse? = null

        internal fun from(achTransferListPageAsync: AchTransferListPageAsync) = apply {
            service = achTransferListPageAsync.service
            params = achTransferListPageAsync.params
            response = achTransferListPageAsync.response
        }

        fun service(service: AchTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AchTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AchTransferListPageAsync].
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
        fun build(): AchTransferListPageAsync =
            AchTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AchTransferListPageAsync{service=$service, params=$params, response=$response}"
}
