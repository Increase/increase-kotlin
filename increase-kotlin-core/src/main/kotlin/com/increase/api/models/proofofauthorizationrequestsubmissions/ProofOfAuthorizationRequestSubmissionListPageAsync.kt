// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequestsubmissions

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProofOfAuthorizationRequestSubmissionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ProofOfAuthorizationRequestSubmissionServiceAsync.list] */
class ProofOfAuthorizationRequestSubmissionListPageAsync
private constructor(
    private val service: ProofOfAuthorizationRequestSubmissionServiceAsync,
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

    suspend fun getNextPage(): ProofOfAuthorizationRequestSubmissionListPageAsync? =
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
         * [ProofOfAuthorizationRequestSubmissionListPageAsync].
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

    /** A builder for [ProofOfAuthorizationRequestSubmissionListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestSubmissionServiceAsync? = null
        private var params: ProofOfAuthorizationRequestSubmissionListParams? = null
        private var response: ProofOfAuthorizationRequestSubmissionListPageResponse? = null

        internal fun from(
            proofOfAuthorizationRequestSubmissionListPageAsync:
                ProofOfAuthorizationRequestSubmissionListPageAsync
        ) = apply {
            service = proofOfAuthorizationRequestSubmissionListPageAsync.service
            params = proofOfAuthorizationRequestSubmissionListPageAsync.params
            response = proofOfAuthorizationRequestSubmissionListPageAsync.response
        }

        fun service(service: ProofOfAuthorizationRequestSubmissionServiceAsync) = apply {
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
         * Returns an immutable instance of [ProofOfAuthorizationRequestSubmissionListPageAsync].
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
        fun build(): ProofOfAuthorizationRequestSubmissionListPageAsync =
            ProofOfAuthorizationRequestSubmissionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestSubmissionListPageAsync) :
        Flow<ProofOfAuthorizationRequestSubmission> {

        override suspend fun collect(
            collector: FlowCollector<ProofOfAuthorizationRequestSubmission>
        ) {
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestSubmissionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestSubmissionListPageAsync{service=$service, params=$params, response=$response}"
}
