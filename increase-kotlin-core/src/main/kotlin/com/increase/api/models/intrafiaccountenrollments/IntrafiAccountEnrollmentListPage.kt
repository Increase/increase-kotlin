// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.services.blocking.IntrafiAccountEnrollmentService
import java.util.Objects

/** List IntraFi Account Enrollments */
class IntrafiAccountEnrollmentListPage
private constructor(
    private val intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentService,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: IntrafiAccountEnrollmentListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): IntrafiAccountEnrollmentListPageResponse = response

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiAccountEnrollmentListPageResponse.data]
     */
    fun data(): List<IntrafiAccountEnrollment> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [IntrafiAccountEnrollmentListPageResponse], but gracefully handles missing data.
     *
     * @see [IntrafiAccountEnrollmentListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPage && intrafiAccountEnrollmentsService == other.intrafiAccountEnrollmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiAccountEnrollmentsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPage{intrafiAccountEnrollmentsService=$intrafiAccountEnrollmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiAccountEnrollmentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): IntrafiAccountEnrollmentListPage? {
        return getNextPageParams()?.let { intrafiAccountEnrollmentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentService,
            params: IntrafiAccountEnrollmentListParams,
            response: IntrafiAccountEnrollmentListPageResponse,
        ) = IntrafiAccountEnrollmentListPage(intrafiAccountEnrollmentsService, params, response)
    }

    class AutoPager(private val firstPage: IntrafiAccountEnrollmentListPage) :
        Sequence<IntrafiAccountEnrollment> {

        override fun iterator(): Iterator<IntrafiAccountEnrollment> = iterator {
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
