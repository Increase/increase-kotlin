// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.eventsubscriptions

import com.increase.api.services.async.EventSubscriptionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Event Subscriptions */
class EventSubscriptionListPageAsync
private constructor(
    private val eventSubscriptionsService: EventSubscriptionServiceAsync,
    private val params: EventSubscriptionListParams,
    private val response: EventSubscriptionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventSubscriptionListPageResponse = response

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.data]
     */
    fun data(): List<EventSubscription> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventSubscriptionListPageResponse], but gracefully handles missing data.
     *
     * @see [EventSubscriptionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventSubscriptionListPageAsync && eventSubscriptionsService == other.eventSubscriptionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventSubscriptionsService, params, response) /* spotless:on */

    override fun toString() =
        "EventSubscriptionListPageAsync{eventSubscriptionsService=$eventSubscriptionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): EventSubscriptionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): EventSubscriptionListPageAsync? {
        return getNextPageParams()?.let { eventSubscriptionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventSubscriptionsService: EventSubscriptionServiceAsync,
            params: EventSubscriptionListParams,
            response: EventSubscriptionListPageResponse,
        ) = EventSubscriptionListPageAsync(eventSubscriptionsService, params, response)
    }

    class AutoPager(private val firstPage: EventSubscriptionListPageAsync) :
        Flow<EventSubscription> {

        override suspend fun collect(collector: FlowCollector<EventSubscription>) {
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
