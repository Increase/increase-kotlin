// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundmailitems

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundMailItemService
import java.util.Objects

/** @see [InboundMailItemService.list] */
class InboundMailItemListPage
private constructor(
    private val service: InboundMailItemService,
    private val params: InboundMailItemListParams,
    private val response: InboundMailItemListPageResponse,
) {

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.data]
     */
    fun data(): List<InboundMailItem> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundMailItemListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundMailItemListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundMailItemListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundMailItemListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundMailItemListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundMailItemListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundMailItemListPage].
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

    /** A builder for [InboundMailItemListPage]. */
    class Builder internal constructor() {

        private var service: InboundMailItemService? = null
        private var params: InboundMailItemListParams? = null
        private var response: InboundMailItemListPageResponse? = null

        internal fun from(inboundMailItemListPage: InboundMailItemListPage) = apply {
            service = inboundMailItemListPage.service
            params = inboundMailItemListPage.params
            response = inboundMailItemListPage.response
        }

        fun service(service: InboundMailItemService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundMailItemListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundMailItemListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [InboundMailItemListPage].
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
        fun build(): InboundMailItemListPage =
            InboundMailItemListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: InboundMailItemListPage) : Sequence<InboundMailItem> {

        override fun iterator(): Iterator<InboundMailItem> = iterator {
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

        return /* spotless:off */ other is InboundMailItemListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundMailItemListPage{service=$service, params=$params, response=$response}"
}
