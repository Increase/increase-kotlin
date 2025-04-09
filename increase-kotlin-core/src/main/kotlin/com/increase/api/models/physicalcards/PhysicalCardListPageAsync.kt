// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcards

import com.increase.api.services.async.PhysicalCardServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Physical Cards */
class PhysicalCardListPageAsync
private constructor(
    private val physicalCardsService: PhysicalCardServiceAsync,
    private val params: PhysicalCardListParams,
    private val response: PhysicalCardListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardListPageResponse = response

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.data]
     */
    fun data(): List<PhysicalCard> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PhysicalCardListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardListPageAsync && physicalCardsService == other.physicalCardsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardsService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardListPageAsync{physicalCardsService=$physicalCardsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): PhysicalCardListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): PhysicalCardListPageAsync? {
        return getNextPageParams()?.let { physicalCardsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            physicalCardsService: PhysicalCardServiceAsync,
            params: PhysicalCardListParams,
            response: PhysicalCardListPageResponse,
        ) = PhysicalCardListPageAsync(physicalCardsService, params, response)
    }

    class AutoPager(private val firstPage: PhysicalCardListPageAsync) : Flow<PhysicalCard> {

        override suspend fun collect(collector: FlowCollector<PhysicalCard>) {
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
