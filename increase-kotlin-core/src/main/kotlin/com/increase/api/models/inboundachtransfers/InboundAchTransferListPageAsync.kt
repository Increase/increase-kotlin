// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.async.InboundAchTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [InboundAchTransferServiceAsync.list] */
class InboundAchTransferListPageAsync
private constructor(
    private val service: InboundAchTransferServiceAsync,
    private val params: InboundAchTransferListParams,
    private val response: InboundAchTransferListPageResponse,
) {

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.data]
     */
    fun data(): List<InboundAchTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundAchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundAchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundAchTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): InboundAchTransferListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundAchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundAchTransferListPageAsync].
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

    /** A builder for [InboundAchTransferListPageAsync]. */
    class Builder internal constructor() {

        private var service: InboundAchTransferServiceAsync? = null
        private var params: InboundAchTransferListParams? = null
        private var response: InboundAchTransferListPageResponse? = null

        internal fun from(inboundAchTransferListPageAsync: InboundAchTransferListPageAsync) =
            apply {
                service = inboundAchTransferListPageAsync.service
                params = inboundAchTransferListPageAsync.params
                response = inboundAchTransferListPageAsync.response
            }

        fun service(service: InboundAchTransferServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundAchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundAchTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundAchTransferListPageAsync].
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
        fun build(): InboundAchTransferListPageAsync =
            InboundAchTransferListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: InboundAchTransferListPageAsync) :
        Flow<InboundAchTransfer> {

        override suspend fun collect(collector: FlowCollector<InboundAchTransfer>) {
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

        return /* spotless:off */ other is InboundAchTransferListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPageAsync{service=$service, params=$params, response=$response}"
}
