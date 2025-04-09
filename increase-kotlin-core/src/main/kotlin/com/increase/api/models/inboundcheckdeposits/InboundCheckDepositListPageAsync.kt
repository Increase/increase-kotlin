// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundCheckDepositServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [InboundCheckDepositServiceAsync.list] */
class InboundCheckDepositListPageAsync
private constructor(
    private val service: InboundCheckDepositServiceAsync,
    private val params: InboundCheckDepositListParams,
    private val response: InboundCheckDepositListPageResponse,
) {

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.data]
     */
    fun data(): List<InboundCheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundCheckDepositListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): InboundCheckDepositListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundCheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundCheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundCheckDepositListPageAsync].
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

    /** A builder for [InboundCheckDepositListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundCheckDepositServiceAsync? = null
        private var params: InboundCheckDepositListParams? = null
        private var response: InboundCheckDepositListPageResponse? = null

        internal fun from(inboundCheckDepositListPageAsync: InboundCheckDepositListPageAsync) =
            apply {
                service = inboundCheckDepositListPageAsync.service
                params = inboundCheckDepositListPageAsync.params
                response = inboundCheckDepositListPageAsync.response
            }

        fun service(service: InboundCheckDepositServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundCheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundCheckDepositListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundCheckDepositListPageAsync].
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
        fun build(): InboundCheckDepositListPageAsync =
            InboundCheckDepositListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: InboundCheckDepositListPageAsync) :
        Flow<InboundCheckDeposit> {

        override suspend fun collect(collector: FlowCollector<InboundCheckDeposit>) {
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

        return /* spotless:off */ other is InboundCheckDepositListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositListPageAsync{service=$service, params=$params, response=$response}"
}
