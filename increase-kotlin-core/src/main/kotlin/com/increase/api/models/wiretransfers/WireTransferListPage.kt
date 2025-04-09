// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.WireTransferService
import java.util.Objects

/** @see [WireTransferService.list] */
class WireTransferListPage
private constructor(
    private val service: WireTransferService,
    private val params: WireTransferListParams,
    private val response: WireTransferListPageResponse,
) {

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.data]
     */
    fun data(): List<WireTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WireTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [WireTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): WireTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): WireTransferListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): WireTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireTransferListPage].
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

    /** A builder for [WireTransferListPage]. */
    class Builder internal constructor() {

        private var service: WireTransferService? = null
        private var params: WireTransferListParams? = null
        private var response: WireTransferListPageResponse? = null

        internal fun from(wireTransferListPage: WireTransferListPage) = apply {
            service = wireTransferListPage.service
            params = wireTransferListPage.params
            response = wireTransferListPage.response
        }

        fun service(service: WireTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WireTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireTransferListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [WireTransferListPage].
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
        fun build(): WireTransferListPage =
            WireTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: WireTransferListPage) : Sequence<WireTransfer> {

        override fun iterator(): Iterator<WireTransfer> = iterator {
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

        return /* spotless:off */ other is WireTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WireTransferListPage{service=$service, params=$params, response=$response}"
}
