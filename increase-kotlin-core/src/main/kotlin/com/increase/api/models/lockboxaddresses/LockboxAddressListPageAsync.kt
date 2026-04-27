// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.LockboxAddressServiceAsync
import java.util.Objects

/** @see LockboxAddressServiceAsync.list */
class LockboxAddressListPageAsync
private constructor(
    private val service: LockboxAddressServiceAsync,
    private val params: LockboxAddressListParams,
    private val response: LockboxAddressListPageResponse,
) : PageAsync<LockboxAddress> {

    /**
     * Delegates to [LockboxAddressListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxAddressListPageResponse.data
     */
    fun data(): List<LockboxAddress> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxAddressListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxAddressListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<LockboxAddress> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): LockboxAddressListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): LockboxAddressListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<LockboxAddress> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxAddressListPageAsync].
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

    /** A builder for [LockboxAddressListPageAsync]. */
    class Builder internal constructor() {

        private var service: LockboxAddressServiceAsync? = null
        private var params: LockboxAddressListParams? = null
        private var response: LockboxAddressListPageResponse? = null

        internal fun from(lockboxAddressListPageAsync: LockboxAddressListPageAsync) = apply {
            service = lockboxAddressListPageAsync.service
            params = lockboxAddressListPageAsync.params
            response = lockboxAddressListPageAsync.response
        }

        fun service(service: LockboxAddressServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxAddressListPageAsync].
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
        fun build(): LockboxAddressListPageAsync =
            LockboxAddressListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LockboxAddressListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LockboxAddressListPageAsync{service=$service, params=$params, response=$response}"
}
