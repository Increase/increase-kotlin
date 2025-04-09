// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ProofOfAuthorizationRequestSubmissionService
import java.util.Objects

/** @see [ProofOfAuthorizationRequestSubmissionService.list] */
class ProofOfAuthorizationRequestSubmissionListPage
private constructor(
    private val service: ProofOfAuthorizationRequestSubmissionService,
    private val params: ProofOfAuthorizationRequestSubmissionListParams,
    private val response: ProofOfAuthorizationRequestSubmissionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ProofOfAuthorizationRequestSubmissionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ProofOfAuthorizationRequestSubmissionListPage? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProofOfAuthorizationRequestSubmissionListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestSubmissionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestSubmissionListPage].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [ProofOfAuthorizationRequestSubmissionListPage]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestSubmissionService? = null
        private var params: ProofOfAuthorizationRequestSubmissionListParams? = null
        private var response: ProofOfAuthorizationRequestSubmissionListPageResponse? = null

        internal fun from(
            proofOfAuthorizationRequestSubmissionListPage:
                ProofOfAuthorizationRequestSubmissionListPage
        ) = apply {
            service = proofOfAuthorizationRequestSubmissionListPage.service
            params = proofOfAuthorizationRequestSubmissionListPage.params
            response = proofOfAuthorizationRequestSubmissionListPage.response
        }

        fun service(service: ProofOfAuthorizationRequestSubmissionService) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProofOfAuthorizationRequestSubmissionListParams) = apply {
            this.params = params
        }

        /** The response that this page was parsed from. */
        fun response(response: ProofOfAuthorizationRequestSubmissionListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestSubmissionListPage].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): ProofOfAuthorizationRequestSubmissionListPage =
            ProofOfAuthorizationRequestSubmissionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPage{service=$service, params=$params, response=$response}"
}
