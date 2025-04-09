// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.events

import com.increase.api.services.blocking.EventService
import java.util.Objects

/** List Events */
class EventListPage
private constructor(
    private val eventsService: EventService,
    private val params: EventListParams,
    private val response: EventListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): EventListPageResponse = response

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.data]
     */
    fun data(): List<Event> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [EventListPageResponse], but gracefully handles missing data.
     *
     * @see [EventListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is EventListPage && eventsService == other.eventsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(eventsService, params, response) /* spotless:on */

    override fun toString() =
        "EventListPage{eventsService=$eventsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): EventListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): EventListPage? {
        return getNextPageParams()?.let { eventsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            eventsService: EventService,
            params: EventListParams,
            response: EventListPageResponse,
        ) = EventListPage(eventsService, params, response)
    }

    class AutoPager(private val firstPage: EventListPage) : Sequence<Event> {

        override fun iterator(): Iterator<Event> = iterator {
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
