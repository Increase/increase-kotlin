// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.exports

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ExportService
import java.util.Objects

/** @see [ExportService.list] */
class ExportListPage
private constructor(
    private val service: ExportService,
    private val params: ExportListParams,
    private val response: ExportListPageResponse,
) {

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.data]
     */
    fun data(): List<Export> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExportListPageResponse], but gracefully handles missing data.
     *
     * @see [ExportListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ExportListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ExportListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExportListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExportListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExportListPage].
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

    /** A builder for [ExportListPage]. */
    class Builder internal constructor() {

        private var service: ExportService? = null
        private var params: ExportListParams? = null
        private var response: ExportListPageResponse? = null

        internal fun from(exportListPage: ExportListPage) = apply {
            service = exportListPage.service
            params = exportListPage.params
            response = exportListPage.response
        }

        fun service(service: ExportService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExportListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExportListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExportListPage].
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
        fun build(): ExportListPage =
            ExportListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExportListPage) : Sequence<Export> {

        override fun iterator(): Iterator<Export> = iterator {
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

        return /* spotless:off */ other is ExportListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() = "ExportListPage{service=$service, params=$params, response=$response}"
}
