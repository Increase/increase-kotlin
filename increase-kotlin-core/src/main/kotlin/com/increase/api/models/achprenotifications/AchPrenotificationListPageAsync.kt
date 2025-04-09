// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.services.async.AchPrenotificationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List ACH Prenotifications */
class AchPrenotificationListPageAsync
private constructor(
    private val achPrenotificationsService: AchPrenotificationServiceAsync,
    private val params: AchPrenotificationListParams,
    private val response: AchPrenotificationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AchPrenotificationListPageResponse = response

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.data]
     */
    fun data(): List<AchPrenotification> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchPrenotificationListPageAsync && achPrenotificationsService == other.achPrenotificationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achPrenotificationsService, params, response) /* spotless:on */

    override fun toString() =
        "AchPrenotificationListPageAsync{achPrenotificationsService=$achPrenotificationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AchPrenotificationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): AchPrenotificationListPageAsync? {
        return getNextPageParams()?.let { achPrenotificationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            achPrenotificationsService: AchPrenotificationServiceAsync,
            params: AchPrenotificationListParams,
            response: AchPrenotificationListPageResponse,
        ) = AchPrenotificationListPageAsync(achPrenotificationsService, params, response)
    }

    class AutoPager(private val firstPage: AchPrenotificationListPageAsync) :
        Flow<AchPrenotification> {

        override suspend fun collect(collector: FlowCollector<AchPrenotification>) {
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
