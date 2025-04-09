// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.core.checkRequired
import com.increase.api.services.async.SupplementalDocumentServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [SupplementalDocumentServiceAsync.list] */
class SupplementalDocumentListPageAsync
private constructor(
    private val service: SupplementalDocumentServiceAsync,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) {

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [SupplementalDocumentListPageResponse.data]
     */
    fun data(): List<EntitySupplementalDocument> =
        response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [SupplementalDocumentListPageResponse], but gracefully handles missing data.
     *
     * @see [SupplementalDocumentListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): SupplementalDocumentListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): SupplementalDocumentListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): SupplementalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [SupplementalDocumentListPageAsync].
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

    /** A builder for [SupplementalDocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: SupplementalDocumentServiceAsync? = null
        private var params: SupplementalDocumentListParams? = null
        private var response: SupplementalDocumentListPageResponse? = null

        internal fun from(supplementalDocumentListPageAsync: SupplementalDocumentListPageAsync) =
            apply {
                service = supplementalDocumentListPageAsync.service
                params = supplementalDocumentListPageAsync.params
                response = supplementalDocumentListPageAsync.response
            }

        fun service(service: SupplementalDocumentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SupplementalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SupplementalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SupplementalDocumentListPageAsync].
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
        fun build(): SupplementalDocumentListPageAsync =
            SupplementalDocumentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: SupplementalDocumentListPageAsync) :
        Flow<EntitySupplementalDocument> {

        override suspend fun collect(collector: FlowCollector<EntitySupplementalDocument>) {
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

        return /* spotless:off */ other is SupplementalDocumentListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPageAsync{service=$service, params=$params, response=$response}"
}
