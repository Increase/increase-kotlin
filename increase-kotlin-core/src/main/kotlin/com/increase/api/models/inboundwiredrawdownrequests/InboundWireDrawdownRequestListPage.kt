// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiredrawdownrequests

import com.increase.api.services.blocking.InboundWireDrawdownRequestService
import java.util.Objects

/** List Inbound Wire Drawdown Requests */
class InboundWireDrawdownRequestListPage
private constructor(
    private val inboundWireDrawdownRequestsService: InboundWireDrawdownRequestService,
    private val params: InboundWireDrawdownRequestListParams,
    private val response: InboundWireDrawdownRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundWireDrawdownRequestListPageResponse = response

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [InboundWireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<InboundWireDrawdownRequest> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundWireDrawdownRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [InboundWireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundWireDrawdownRequestListPage && inboundWireDrawdownRequestsService == other.inboundWireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundWireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundWireDrawdownRequestListPage{inboundWireDrawdownRequestsService=$inboundWireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundWireDrawdownRequestListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundWireDrawdownRequestListPage? {
        return getNextPageParams()?.let { inboundWireDrawdownRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundWireDrawdownRequestsService: InboundWireDrawdownRequestService,
            params: InboundWireDrawdownRequestListParams,
            response: InboundWireDrawdownRequestListPageResponse,
        ) = InboundWireDrawdownRequestListPage(inboundWireDrawdownRequestsService, params, response)
    }

    class AutoPager(private val firstPage: InboundWireDrawdownRequestListPage) :
        Sequence<InboundWireDrawdownRequest> {

        override fun iterator(): Iterator<InboundWireDrawdownRequest> = iterator {
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
}
