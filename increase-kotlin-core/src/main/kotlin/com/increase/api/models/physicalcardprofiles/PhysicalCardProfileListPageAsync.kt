// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.PhysicalCardProfileServiceAsync
import java.util.Objects

/** @see PhysicalCardProfileServiceAsync.list */
class PhysicalCardProfileListPageAsync
private constructor(
    private val service: PhysicalCardProfileServiceAsync,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) : PageAsync<PhysicalCardProfile> {

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.data
     */
    fun data(): List<PhysicalCardProfile> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see PhysicalCardProfileListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<PhysicalCardProfile> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): PhysicalCardProfileListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): PhysicalCardProfileListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<PhysicalCardProfile> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): PhysicalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PhysicalCardProfileListPageAsync].
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

    /** A builder for [PhysicalCardProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: PhysicalCardProfileServiceAsync? = null
        private var params: PhysicalCardProfileListParams? = null
        private var response: PhysicalCardProfileListPageResponse? = null

        internal fun from(physicalCardProfileListPageAsync: PhysicalCardProfileListPageAsync) =
            apply {
                service = physicalCardProfileListPageAsync.service
                params = physicalCardProfileListPageAsync.params
                response = physicalCardProfileListPageAsync.response
            }

        fun service(service: PhysicalCardProfileServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PhysicalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PhysicalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PhysicalCardProfileListPageAsync].
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
        fun build(): PhysicalCardProfileListPageAsync =
            PhysicalCardProfileListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileListPageAsync{service=$service, params=$params, response=$response}"
}
