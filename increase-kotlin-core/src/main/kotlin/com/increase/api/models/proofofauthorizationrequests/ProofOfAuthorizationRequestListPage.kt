// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import java.util.Objects

/** List Proof of Authorization Requests */
class ProofOfAuthorizationRequestListPage
private constructor(
    private val proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestService,
    private val params: ProofOfAuthorizationRequestListParams,
    private val response: ProofOfAuthorizationRequestListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestListPageResponse = response

    /**
     * Delegates to [ProofOfAuthorizationRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ProofOfAuthorizationRequestListPageResponse.data]
     */
    fun data(): List<ProofOfAuthorizationRequest> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ProofOfAuthorizationRequestListPageResponse], but gracefully handles missing
     * data.
     *
     * @see [ProofOfAuthorizationRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPage && proofOfAuthorizationRequestsService == other.proofOfAuthorizationRequestsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(proofOfAuthorizationRequestsService, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPage{proofOfAuthorizationRequestsService=$proofOfAuthorizationRequestsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ProofOfAuthorizationRequestListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ProofOfAuthorizationRequestListPage? {
        return getNextPageParams()?.let { proofOfAuthorizationRequestsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            proofOfAuthorizationRequestsService: ProofOfAuthorizationRequestService,
            params: ProofOfAuthorizationRequestListParams,
            response: ProofOfAuthorizationRequestListPageResponse,
        ) =
            ProofOfAuthorizationRequestListPage(
                proofOfAuthorizationRequestsService,
                params,
                response,
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestListPage) :
        Sequence<ProofOfAuthorizationRequest> {

        override fun iterator(): Iterator<ProofOfAuthorizationRequest> = iterator {
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
