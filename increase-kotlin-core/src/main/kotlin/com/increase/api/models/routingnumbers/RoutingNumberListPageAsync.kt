// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.routingnumbers

import com.increase.api.services.async.RoutingNumberServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/**
 * You can use this API to confirm if a routing number is valid, such as when a user is providing
 * you with bank account details. Since routing numbers uniquely identify a bank, this will always
 * return 0 or 1 entry. In Sandbox, the only valid routing number for this method is 110000000.
 */
class RoutingNumberListPageAsync
private constructor(
    private val routingNumbersService: RoutingNumberServiceAsync,
    private val params: RoutingNumberListParams,
    private val response: RoutingNumberListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): RoutingNumberListPageResponse = response

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.data]
     */
    fun data(): List<RoutingNumberListResponse> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [RoutingNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [RoutingNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is RoutingNumberListPageAsync && routingNumbersService == other.routingNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(routingNumbersService, params, response) /* spotless:on */

    override fun toString() =
        "RoutingNumberListPageAsync{routingNumbersService=$routingNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): RoutingNumberListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): RoutingNumberListPageAsync? {
        return getNextPageParams()?.let { routingNumbersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            routingNumbersService: RoutingNumberServiceAsync,
            params: RoutingNumberListParams,
            response: RoutingNumberListPageResponse,
        ) = RoutingNumberListPageAsync(routingNumbersService, params, response)
    }

    class AutoPager(private val firstPage: RoutingNumberListPageAsync) :
        Flow<RoutingNumberListResponse> {

        override suspend fun collect(collector: FlowCollector<RoutingNumberListResponse>) {
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
