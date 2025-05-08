// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.LockboxServiceAsync
import java.util.Objects

/** @see [LockboxServiceAsync.list] */
class LockboxListPageAsync
private constructor(
    private val service: LockboxServiceAsync,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) : PageAsync<Lockbox> {

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.data]
     */
    fun data(): List<Lockbox> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Lockbox> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): LockboxListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): LockboxListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Lockbox> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxListPageAsync].
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

    /** A builder for [LockboxListPageAsync]. */
    class Builder internal constructor() {

        private var service: LockboxServiceAsync? = null
        private var params: LockboxListParams? = null
        private var response: LockboxListPageResponse? = null

        internal fun from(lockboxListPageAsync: LockboxListPageAsync) = apply {
            service = lockboxListPageAsync.service
            params = lockboxListPageAsync.params
            response = lockboxListPageAsync.response
        }

        fun service(service: LockboxServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxListPageAsync].
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
        fun build(): LockboxListPageAsync =
            LockboxListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is LockboxListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LockboxListPageAsync{service=$service, params=$params, response=$response}"
}
