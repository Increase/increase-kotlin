// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckDepositServiceAsync
import java.util.Objects

/** @see CheckDepositServiceAsync.list */
class CheckDepositListPageAsync
private constructor(
    private val service: CheckDepositServiceAsync,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) : PageAsync<CheckDeposit> {

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see CheckDepositListPageResponse.data
     */
    fun data(): List<CheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see CheckDepositListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CheckDeposit> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CheckDepositListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CheckDepositListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckDeposit> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckDepositListPageAsync].
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

    /** A builder for [CheckDepositListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckDepositServiceAsync? = null
        private var params: CheckDepositListParams? = null
        private var response: CheckDepositListPageResponse? = null

        internal fun from(checkDepositListPageAsync: CheckDepositListPageAsync) = apply {
            service = checkDepositListPageAsync.service
            params = checkDepositListPageAsync.params
            response = checkDepositListPageAsync.response
        }

        fun service(service: CheckDepositServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckDepositListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckDepositListPageAsync].
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
        fun build(): CheckDepositListPageAsync =
            CheckDepositListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPageAsync{service=$service, params=$params, response=$response}"
}
