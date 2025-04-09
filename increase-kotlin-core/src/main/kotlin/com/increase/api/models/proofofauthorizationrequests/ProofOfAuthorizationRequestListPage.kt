// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.proofofauthorizationrequests

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ProofOfAuthorizationRequestService
import java.util.Objects

/** @see [ProofOfAuthorizationRequestService.list] */
class ProofOfAuthorizationRequestListPage
private constructor(
    private val service: ProofOfAuthorizationRequestService,
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

    fun getNextPage(): ProofOfAuthorizationRequestListPage? =
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
         * [ProofOfAuthorizationRequestListPage].
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

    /** A builder for [ProofOfAuthorizationRequestListPage]. */
    class Builder internal constructor() {

        private var service: ProofOfAuthorizationRequestService? = null
        private var params: ProofOfAuthorizationRequestListParams? = null
        private var response: ProofOfAuthorizationRequestListPageResponse? = null

        internal fun from(
            proofOfAuthorizationRequestListPage: ProofOfAuthorizationRequestListPage
        ) = apply {
            service = proofOfAuthorizationRequestListPage.service
            params = proofOfAuthorizationRequestListPage.params
            response = proofOfAuthorizationRequestListPage.response
        }

        fun service(service: ProofOfAuthorizationRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProofOfAuthorizationRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProofOfAuthorizationRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [ProofOfAuthorizationRequestListPage].
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
        fun build(): ProofOfAuthorizationRequestListPage =
            ProofOfAuthorizationRequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ProofOfAuthorizationRequestListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ProofOfAuthorizationRequestListPage{service=$service, params=$params, response=$response}"
}
