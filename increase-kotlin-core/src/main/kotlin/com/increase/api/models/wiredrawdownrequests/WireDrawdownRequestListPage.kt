// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.WireDrawdownRequestService
import java.util.Objects

/** @see [WireDrawdownRequestService.list] */
class WireDrawdownRequestListPage
private constructor(
    private val service: WireDrawdownRequestService,
    private val params: WireDrawdownRequestListParams,
    private val response: WireDrawdownRequestListPageResponse,
) : Page<WireDrawdownRequest> {

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.data]
     */
    fun data(): List<WireDrawdownRequest> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [WireDrawdownRequestListPageResponse], but gracefully handles missing data.
     *
     * @see [WireDrawdownRequestListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<WireDrawdownRequest> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): WireDrawdownRequestListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): WireDrawdownRequestListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<WireDrawdownRequest> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): WireDrawdownRequestListParams = params

    /** The response that this page was parsed from. */
    fun response(): WireDrawdownRequestListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [WireDrawdownRequestListPage].
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

    /** A builder for [WireDrawdownRequestListPage]. */
    class Builder internal constructor() {

        private var service: WireDrawdownRequestService? = null
        private var params: WireDrawdownRequestListParams? = null
        private var response: WireDrawdownRequestListPageResponse? = null

        internal fun from(wireDrawdownRequestListPage: WireDrawdownRequestListPage) = apply {
            service = wireDrawdownRequestListPage.service
            params = wireDrawdownRequestListPage.params
            response = wireDrawdownRequestListPage.response
        }

        fun service(service: WireDrawdownRequestService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: WireDrawdownRequestListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: WireDrawdownRequestListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [WireDrawdownRequestListPage].
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
        fun build(): WireDrawdownRequestListPage =
            WireDrawdownRequestListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is WireDrawdownRequestListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "WireDrawdownRequestListPage{service=$service, params=$params, response=$response}"
}
