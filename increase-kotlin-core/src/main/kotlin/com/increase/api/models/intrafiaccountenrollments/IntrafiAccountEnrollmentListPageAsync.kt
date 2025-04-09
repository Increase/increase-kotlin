// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List IntraFi Account Enrollments */
class IntrafiAccountEnrollmentListPageAsync
private constructor(
    private val intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
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

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPageAsync && intrafiAccountEnrollmentsService == other.intrafiAccountEnrollmentsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(intrafiAccountEnrollmentsService, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPageAsync{intrafiAccountEnrollmentsService=$intrafiAccountEnrollmentsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiAccountEnrollmentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): IntrafiAccountEnrollmentListPageAsync? {
        return getNextPageParams()?.let { intrafiAccountEnrollmentsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            intrafiAccountEnrollmentsService: IntrafiAccountEnrollmentServiceAsync,
            params: IntrafiAccountEnrollmentListParams,
            response: IntrafiAccountEnrollmentListPageResponse,
        ) =
            IntrafiAccountEnrollmentListPageAsync(
                intrafiAccountEnrollmentsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: IntrafiAccountEnrollmentListPageAsync) :
        Flow<IntrafiAccountEnrollment> {

        override suspend fun collect(collector: FlowCollector<IntrafiAccountEnrollment>) {
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
