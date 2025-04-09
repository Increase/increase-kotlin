// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProofOfAuthorizationRequestServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ProofOfAuthorizationRequestServiceAsync.list] */
class ProofOfAuthorizationRequestListPageAsync
private constructor(
    private val service: ProofOfAuthorizationRequestServiceAsync,
    private val params: ProofOfAuthorizationRequestListParams,
    private val response: ProofOfAuthorizationRequestListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ProofOfAuthorizationRequestListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): ProofOfAuthorizationRequestListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ProofOfAuthorizationRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProofOfAuthorizationRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [ProofOfAuthorizationRequestListPageAsync].
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

    /** A builder for [ProofOfAuthorizationRequestListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestServiceAsync? = null
        private var params: ProofOfAuthorizationRequestListParams? = null
        private var response: ProofOfAuthorizationRequestListPageResponse? = null

        internal fun from(
            proofOfAuthorizationRequestListPageAsync: ProofOfAuthorizationRequestListPageAsync
        ) = apply {
            service = proofOfAuthorizationRequestListPageAsync.service
            params = proofOfAuthorizationRequestListPageAsync.params
            response = proofOfAuthorizationRequestListPageAsync.response
        }

        fun service(service: ProofOfAuthorizationRequestServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: ProofOfAuthorizationRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProofOfAuthorizationRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestListPageAsync].
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
        fun build(): ProofOfAuthorizationRequestListPageAsync =
            ProofOfAuthorizationRequestListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ProofOfAuthorizationRequestListPageAsync) :
        Flow<ProofOfAuthorizationRequest> {

        override suspend fun collect(collector: FlowCollector<ProofOfAuthorizationRequest>) {
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

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPageAsync{service=$service, params=$params, response=$response}"
}
