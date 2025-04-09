// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.pendingtransactions

import com.increase.api.core.checkRequired
import com.increase.api.services.async.PendingTransactionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [PendingTransactionServiceAsync.list] */
class PendingTransactionListPageAsync
private constructor(
    private val service: PendingTransactionServiceAsync,
    private val params: PendingTransactionListParams,
    private val response: PendingTransactionListPageResponse,
) {

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.data]
     */
    fun data(): List<PendingTransaction> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PendingTransactionListPageResponse], but gracefully handles missing data.
     *
     * @see [PendingTransactionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): PendingTransactionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): PendingTransactionListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): PendingTransactionListParams = params

    /** The response that this page was parsed from. */
    fun response(): PendingTransactionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [PendingTransactionListPageAsync].
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

    /** A builder for [PendingTransactionListPageAsync]. */
    class Builder internal constructor() {

        private var service: PendingTransactionServiceAsync? = null
        private var params: PendingTransactionListParams? = null
        private var response: PendingTransactionListPageResponse? = null

        internal fun from(pendingTransactionListPageAsync: PendingTransactionListPageAsync) =
            apply {
                service = pendingTransactionListPageAsync.service
                params = pendingTransactionListPageAsync.params
                response = pendingTransactionListPageAsync.response
            }

        fun service(service: PendingTransactionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: PendingTransactionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: PendingTransactionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [PendingTransactionListPageAsync].
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
        fun build(): PendingTransactionListPageAsync =
            PendingTransactionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: PendingTransactionListPageAsync) :
        Flow<PendingTransaction> {

        override suspend fun collect(collector: FlowCollector<PendingTransaction>) {
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

        return /* spotless:off */ other is PendingTransactionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "PendingTransactionListPageAsync{service=$service, params=$params, response=$response}"
}
