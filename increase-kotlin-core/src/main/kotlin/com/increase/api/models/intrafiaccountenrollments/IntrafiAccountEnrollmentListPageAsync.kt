// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.intrafiaccountenrollments

import com.increase.api.core.checkRequired
import com.increase.api.services.async.IntrafiAccountEnrollmentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [IntrafiAccountEnrollmentServiceAsync.list] */
class IntrafiAccountEnrollmentListPageAsync
private constructor(
    private val service: IntrafiAccountEnrollmentServiceAsync,
    private val params: IntrafiAccountEnrollmentListParams,
    private val response: IntrafiAccountEnrollmentListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): IntrafiAccountEnrollmentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): IntrafiAccountEnrollmentListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): IntrafiAccountEnrollmentListParams = params

    /** The response that this page was parsed from. */
    fun response(): IntrafiAccountEnrollmentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [IntrafiAccountEnrollmentListPageAsync].
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

    /** A builder for [IntrafiAccountEnrollmentListPageAsync]. */
    class Builder internal constructor() {

        private var service: IntrafiAccountEnrollmentServiceAsync? = null
        private var params: IntrafiAccountEnrollmentListParams? = null
        private var response: IntrafiAccountEnrollmentListPageResponse? = null

        internal fun from(
            intrafiAccountEnrollmentListPageAsync: IntrafiAccountEnrollmentListPageAsync
        ) = apply {
            service = intrafiAccountEnrollmentListPageAsync.service
            params = intrafiAccountEnrollmentListPageAsync.params
            response = intrafiAccountEnrollmentListPageAsync.response
        }

        fun service(service: IntrafiAccountEnrollmentServiceAsync) = apply {
            this.service = service
        }

        /** The parameters that were used to request this page. */
        fun params(params: IntrafiAccountEnrollmentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: IntrafiAccountEnrollmentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [IntrafiAccountEnrollmentListPageAsync].
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
        fun build(): IntrafiAccountEnrollmentListPageAsync =
            IntrafiAccountEnrollmentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is IntrafiAccountEnrollmentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "IntrafiAccountEnrollmentListPageAsync{service=$service, params=$params, response=$response}"
}
