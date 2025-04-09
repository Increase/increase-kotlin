// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionService
import java.util.Objects

/** List Proof of Authorization Request Submissions */
class ProofOfAuthorizationRequestSubmissionListPage
private constructor(
    private val proofOfAuthorizationRequestSubmissionsService:
        ProofOfAuthorizationRequestSubmissionService,
    private val params: ProofOfAuthorizationRequestSubmissionListParams,
    private val response: ProofOfAuthorizationRequestSubmissionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestSubmissionListPageResponse = response

    /**
     * Delegates to [ProofOfAuthorizationRequestSubmissionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ProofOfAuthorizationRequestSubmissionListPageResponse.data]
     */
    fun data(): List<ProofOfAuthorizationRequestSubmission> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ProofOfAuthorizationRequestSubmissionListPageResponse], but gracefully handles
     * missing data.
     *
     * @see [ProofOfAuthorizationRequestSubmissionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPage && proofOfAuthorizationRequestSubmissionsService == other.proofOfAuthorizationRequestSubmissionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestSubmissionsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPage{proofOfAuthorizationRequestSubmissionsService=$proofOfAuthorizationRequestSubmissionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ProofOfAuthorizationRequestSubmissionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ProofOfAuthorizationRequestSubmissionListPage? {
        return getNextPageParams()?.let { proofOfAuthorizationRequestSubmissionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            proofOfAuthorizationRequestSubmissionsService:
                ProofOfAuthorizationRequestSubmissionService,
            params: ProofOfAuthorizationRequestSubmissionListParams,
            response: ProofOfAuthorizationRequestSubmissionListPageResponse,
        ) =
            ProofOfAuthorizationRequestSubmissionListPage(
                proofOfAuthorizationRequestSubmissionsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestSubmissionListPage) :
        Sequence<ProofOfAuthorizationRequestSubmission> {

        override fun iterator(): Iterator<ProofOfAuthorizationRequestSubmission> = iterator {
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
