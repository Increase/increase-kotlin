// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.physicalcardprofiles

import com.increase.api.services.blocking.PhysicalCardProfileService
import java.util.Objects

/** List Physical Card Profiles */
class PhysicalCardProfileListPage
private constructor(
    private val physicalCardProfilesService: PhysicalCardProfileService,
    private val params: PhysicalCardProfileListParams,
    private val response: PhysicalCardProfileListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): PhysicalCardProfileListPageResponse = response

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.data]
     */
    fun data(): List<PhysicalCardProfile> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [PhysicalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [PhysicalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is PhysicalCardProfileListPage && physicalCardProfilesService == other.physicalCardProfilesService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(physicalCardProfilesService, params, response) /* spotless:on */

    override fun toString() =
        "PhysicalCardProfileListPage{physicalCardProfilesService=$physicalCardProfilesService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): PhysicalCardProfileListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): PhysicalCardProfileListPage? {
        return getNextPageParams()?.let { physicalCardProfilesService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            physicalCardProfilesService: PhysicalCardProfileService,
            params: PhysicalCardProfileListParams,
            response: PhysicalCardProfileListPageResponse,
        ) = PhysicalCardProfileListPage(physicalCardProfilesService, params, response)
    }

    class AutoPager(private val firstPage: PhysicalCardProfileListPage) :
        Sequence<PhysicalCardProfile> {

        override fun iterator(): Iterator<PhysicalCardProfile> = iterator {
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
