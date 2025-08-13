// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.PhysicalCardServiceAsync
import java.util.Objects

/** @see PhysicalCardServiceAsync.list */
class PhysicalCardListPageAsync
private constructor(
    private val service: PhysicalCardServiceAsync,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) : PageAsync<PhysicalCard> {

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardListPageResponse.data
     */
    fun data(): List<PhysicalCard> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<PhysicalCard> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PhysicalCardListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PhysicalCardListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhysicalCard> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [PhysicalCardListPageAsync].
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

    /** A builder for [PhysicalCardListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhysicalCardServiceAsync? = null
        private var params: PhysicalCardListParams? = null
        private var response: PhysicalCardListPageResponse? = null

        internal fun from(physicalCardListPageAsync: PhysicalCardListPageAsync) = apply {
            service = physicalCardListPageAsync.service
            params = physicalCardListPageAsync.params
            response = physicalCardListPageAsync.response
        }

        fun service(service: PhysicalCardServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [PhysicalCardListPageAsync].
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
        fun build(): PhysicalCardListPageAsync =
            PhysicalCardListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is PhysicalCardListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "PhysicalCardListPageAsync{service=$service, params=$params, response=$response}"
}
