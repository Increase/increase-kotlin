// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckDepositServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [CheckDepositServiceAsync.list] */
class CheckDepositListPageAsync
private constructor(
    private val service: CheckDepositServiceAsync,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) {

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.data]
     */
    fun data(): List<CheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CheckDepositListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CheckDepositListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: CheckDepositListPageAsync) : Flow<CheckDeposit> {

        override suspend fun collect(collector: FlowCollector<CheckDeposit>) {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    collector.emit(page.data()[index++])
                }
                page = page.getNextPage() ?: break
                index = 0
            }
        }
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
