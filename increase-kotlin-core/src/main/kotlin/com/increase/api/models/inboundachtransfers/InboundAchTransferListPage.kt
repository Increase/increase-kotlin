// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundAchTransferService
import java.util.Objects

/** @see [InboundAchTransferService.list] */
class InboundAchTransferListPage
private constructor(
    private val service: InboundAchTransferService,
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

    fun getNextPage(): InboundAchTransferListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundAchTransferListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundAchTransferListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundAchTransferListPage].
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

    /** A builder for [InboundAchTransferListPage]. */
    class Builder internal constructor() {

        private var service: InboundAchTransferService? = null
        private var params: InboundAchTransferListParams? = null
        private var response: InboundAchTransferListPageResponse? = null

        internal fun from(inboundAchTransferListPage: InboundAchTransferListPage) = apply {
            service = inboundAchTransferListPage.service
            params = inboundAchTransferListPage.params
            response = inboundAchTransferListPage.response
        }

        fun service(service: InboundAchTransferService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundAchTransferListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundAchTransferListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundAchTransferListPage].
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
        fun build(): InboundAchTransferListPage =
            InboundAchTransferListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: InboundAchTransferListPage) :
        Sequence<InboundAchTransfer> {

        override fun iterator(): Iterator<InboundAchTransfer> = iterator {
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

        return /* spotless:off */ other is InboundAchTransferListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundAchTransferListPage{service=$service, params=$params, response=$response}"
}
