// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.services.async.WireDrawdownRequestServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Wire Drawdown Requests */
class WireDrawdownRequestListPageAsync
private constructor(
    private val wireDrawdownRequestsService: WireDrawdownRequestServiceAsync,
    private val params: WireDrawdownRequestListParams,
    private val response: WireDrawdownRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): WireDrawdownRequestListPageResponse = response

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<WireDrawdownRequest> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestListPageAsync && wireDrawdownRequestsService == other.wireDrawdownRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(wireDrawdownRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestListPageAsync{wireDrawdownRequestsService=$wireDrawdownRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): WireDrawdownRequestListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): WireDrawdownRequestListPageAsync? {
        return getNextPageParams()?.let { wireDrawdownRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            wireDrawdownRequestsService: WireDrawdownRequestServiceAsync,
            params: WireDrawdownRequestListParams,
            response: WireDrawdownRequestListPageResponse,
        ) = WireDrawdownRequestListPageAsync(wireDrawdownRequestsService, params, response)
    }

    class AutoPager(private val firstPage: WireDrawdownRequestListPageAsync) :
        Flow<WireDrawdownRequest> {

        override suspend fun collect(collector: FlowCollector<WireDrawdownRequest>) {
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
}
