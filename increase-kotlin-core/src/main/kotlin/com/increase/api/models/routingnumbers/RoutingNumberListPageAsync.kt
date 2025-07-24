// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.RoutingNumberServiceAsync
import java.util.Objects

/** @see RoutingNumberServiceAsync.list */
class RoutingNumberListPageAsync
private constructor(
    private val service: RoutingNumberServiceAsync,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) : PageAsync<RoutingNumberListResponse> {

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see RoutingNumberListPageResponse.data
     */
    fun data(): List<RoutingNumberListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see RoutingNumberListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<RoutingNumberListResponse> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): RoutingNumberListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): RoutingNumberListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<RoutingNumberListResponse> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): RoutingNumberListParams = params

    /** The response that this page was parsed from. */
    fun response(): RoutingNumberListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [RoutingNumberListPageAsync].
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

    /** A builder for [RoutingNumberListPageAsync]. */
    class Builder internal constructor() {

        private var service: RoutingNumberServiceAsync? = null
        private var params: RoutingNumberListParams? = null
        private var response: RoutingNumberListPageResponse? = null

        internal fun from(routingNumberListPageAsync: RoutingNumberListPageAsync) = apply {
            service = routingNumberListPageAsync.service
            params = routingNumberListPageAsync.params
            response = routingNumberListPageAsync.response
        }

        fun service(service: RoutingNumberServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RoutingNumberListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RoutingNumberListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [RoutingNumberListPageAsync].
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
        fun build(): RoutingNumberListPageAsync =
            RoutingNumberListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPageAsync{service=$service, params=$params, response=$response}"
}
