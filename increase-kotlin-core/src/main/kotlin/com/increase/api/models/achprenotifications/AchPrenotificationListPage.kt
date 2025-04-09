// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.services.blocking.AchPrenotificationService
import java.util.Objects

/** List ACH Prenotifications */
class AchPrenotificationListPage
private constructor(
    private val achPrenotificationsService: AchPrenotificationService,
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

        return /* spotless:off */ other is AchPrenotificationListPage && achPrenotificationsService == other.achPrenotificationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achPrenotificationsService, params, response) /* spotless:on */

    override fun toString() =
        "AchPrenotificationListPage{achPrenotificationsService=$achPrenotificationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AchPrenotificationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): AchPrenotificationListPage? {
        return getNextPageParams()?.let { achPrenotificationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            achPrenotificationsService: AchPrenotificationService,
            params: AchPrenotificationListParams,
            response: AchPrenotificationListPageResponse,
        ) = AchPrenotificationListPage(achPrenotificationsService, params, response)
    }

    class AutoPager(private val firstPage: AchPrenotificationListPage) :
        Sequence<AchPrenotification> {

        override fun iterator(): Iterator<AchPrenotification> = iterator {
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
