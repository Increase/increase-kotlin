// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundrealtimepaymentstransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundRealTimePaymentsTransferService
import java.util.Objects

/** @see [InboundRealTimePaymentsTransferService.list] */
class InboundRealTimePaymentsTransferListPage
private constructor(
    private val service: InboundRealTimePaymentsTransferService,
    private val params: InboundRealTimePaymentsTransferListParams,
    private val response: InboundRealTimePaymentsTransferListPageResponse,
) {

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<InboundRealTimePaymentsTransfer> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundRealTimePaymentsTransferListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [InboundRealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundRealTimePaymentsTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundRealTimePaymentsTransferListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundRealTimePaymentsTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundRealTimePaymentsTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [InboundRealTimePaymentsTransferListPage].
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

    /** A builder for [InboundRealTimePaymentsTransferListPage]. */
    class Builder internal constructor() {

        private var service: InboundRealTimePaymentsTransferService? = null
        private var params: InboundRealTimePaymentsTransferListParams? = null
        private var response: InboundRealTimePaymentsTransferListPageResponse? = null

        internal fun from(
            inboundRealTimePaymentsTransferListPage: InboundRealTimePaymentsTransferListPage
        ) = apply {
            service = inboundRealTimePaymentsTransferListPage.service
            params = inboundRealTimePaymentsTransferListPage.params
            response = inboundRealTimePaymentsTransferListPage.response
        }

        fun service(service: InboundRealTimePaymentsTransferService) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: InboundRealTimePaymentsTransferListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: InboundRealTimePaymentsTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundRealTimePaymentsTransferListPage].
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
        fun build(): InboundRealTimePaymentsTransferListPage =
            InboundRealTimePaymentsTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: InboundRealTimePaymentsTransferListPage) :
        Sequence<InboundRealTimePaymentsTransfer> {

        override fun iterator(): Iterator<InboundRealTimePaymentsTransfer> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
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

        return /* spotless:off */ other is InboundRealTimePaymentsTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundRealTimePaymentsTransferListPage{service=$service, params=$params, response=$response}"
}
