// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.RealTimePaymentsTransferService
import java.util.Objects

/** @see [RealTimePaymentsTransferService.list] */
class RealTimePaymentsTransferListPage
private constructor(
    private val service: RealTimePaymentsTransferService,
    private val params: RealTimePaymentsTransferListParams,
    private val response: RealTimePaymentsTransferListPageResponse,
) {

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.data]
     */
    fun data(): List<RealTimePaymentsTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [RealTimePaymentsTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [RealTimePaymentsTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): RealTimePaymentsTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): RealTimePaymentsTransferListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): RealTimePaymentsTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): RealTimePaymentsTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [RealTimePaymentsTransferListPage].
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

    /** A builder for [RealTimePaymentsTransferListPage]. */
    class Builder internal constructor() {

        private var service: RealTimePaymentsTransferService? = null
        private var params: RealTimePaymentsTransferListParams? = null
        private var response: RealTimePaymentsTransferListPageResponse? = null

        internal fun from(realTimePaymentsTransferListPage: RealTimePaymentsTransferListPage) =
            apply {
                service = realTimePaymentsTransferListPage.service
                params = realTimePaymentsTransferListPage.params
                response = realTimePaymentsTransferListPage.response
            }

        fun service(service: RealTimePaymentsTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: RealTimePaymentsTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: RealTimePaymentsTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [RealTimePaymentsTransferListPage].
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
        fun build(): RealTimePaymentsTransferListPage =
            RealTimePaymentsTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: RealTimePaymentsTransferListPage) :
        Sequence<RealTimePaymentsTransfer> {

        override fun iterator(): Iterator<RealTimePaymentsTransfer> = iterator {
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

        return /* spotless:off */ other is RealTimePaymentsTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "RealTimePaymentsTransferListPage{service=$service, params=$params, response=$response}"
}
