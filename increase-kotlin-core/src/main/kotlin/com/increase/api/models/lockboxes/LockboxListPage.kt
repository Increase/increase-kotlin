// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.LockboxService
import java.util.Objects

/** @see LockboxService.list */
class LockboxListPage
private constructor(
    private val service: LockboxService,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) : Page<Lockbox> {

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxListPageResponse.data
     */
    fun data(): List<Lockbox> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Lockbox> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): LockboxListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): LockboxListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Lockbox> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxListPage].
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

    /** A builder for [LockboxListPage]. */
    class Builder internal constructor() {

        private var service: LockboxService? = null
        private var params: LockboxListParams? = null
        private var response: LockboxListPageResponse? = null

        internal fun from(lockboxListPage: LockboxListPage) = apply {
            service = lockboxListPage.service
            params = lockboxListPage.params
            response = lockboxListPage.response
        }

        fun service(service: LockboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxListPage].
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
        fun build(): LockboxListPage =
            LockboxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LockboxListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LockboxListPage{service=$service, params=$params, response=$response}"
}
