// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.supplementaldocuments

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.SupplementalDocumentService
import java.util.Objects

/** @see [SupplementalDocumentService.list] */
class SupplementalDocumentListPage
private constructor(
    private val service: SupplementalDocumentService,
    private val params: SupplementalDocumentListParams,
    private val response: SupplementalDocumentListPageResponse,
) : Page<EntitySupplementalDocument> {

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

    override fun items(): List<EntitySupplementalDocument> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): SupplementalDocumentListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): SupplementalDocumentListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<EntitySupplementalDocument> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): SupplementalDocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): SupplementalDocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [SupplementalDocumentListPage].
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

    /** A builder for [SupplementalDocumentListPage]. */
    class Builder internal constructor() {

        private var service: SupplementalDocumentService? = null
        private var params: SupplementalDocumentListParams? = null
        private var response: SupplementalDocumentListPageResponse? = null

        internal fun from(supplementalDocumentListPage: SupplementalDocumentListPage) = apply {
            service = supplementalDocumentListPage.service
            params = supplementalDocumentListPage.params
            response = supplementalDocumentListPage.response
        }

        fun service(service: SupplementalDocumentService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: SupplementalDocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: SupplementalDocumentListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [SupplementalDocumentListPage].
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
        fun build(): SupplementalDocumentListPage =
            SupplementalDocumentListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is SupplementalDocumentListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "SupplementalDocumentListPage{service=$service, params=$params, response=$response}"
}
