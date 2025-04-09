// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.services.async.DigitalCardProfileServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Card Profiles */
class DigitalCardProfileListPageAsync
private constructor(
    private val digitalCardProfilesService: DigitalCardProfileServiceAsync,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.data]
     */
    fun data(): List<DigitalCardProfile> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalCardProfileListPageAsync && digitalCardProfilesService == other.digitalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileListPageAsync{digitalCardProfilesService=$digitalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DigitalCardProfileListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): DigitalCardProfileListPageAsync? {
        return getNextPageParams()?.let { digitalCardProfilesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            digitalCardProfilesService: DigitalCardProfileServiceAsync,
            params: DigitalCardProfileListParams,
            response: DigitalCardProfileListPageResponse,
        ) = DigitalCardProfileListPageAsync(digitalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: DigitalCardProfileListPageAsync) :
        Flow<DigitalCardProfile> {

        override suspend fun collect(collector: FlowCollector<DigitalCardProfile>) {
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
