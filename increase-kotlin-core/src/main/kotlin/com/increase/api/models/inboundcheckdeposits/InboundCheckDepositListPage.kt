// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.InboundCheckDepositService
import java.util.Objects

/** @see InboundCheckDepositService.list */
class InboundCheckDepositListPage
private constructor(
    private val service: InboundCheckDepositService,
    private val params: InboundCheckDepositListParams,
    private val response: InboundCheckDepositListPageResponse,
) : Page<InboundCheckDeposit> {

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see InboundCheckDepositListPageResponse.data
     */
    fun data(): List<InboundCheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see InboundCheckDepositListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<InboundCheckDeposit> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): InboundCheckDepositListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): InboundCheckDepositListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<InboundCheckDeposit> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): InboundCheckDepositListParams = params

    /** The response that this page was parsed from. */
    fun response(): InboundCheckDepositListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [InboundCheckDepositListPage].
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

    /** A builder for [InboundCheckDepositListPage]. */
    class Builder internal constructor() {

        private var service: InboundCheckDepositService? = null
        private var params: InboundCheckDepositListParams? = null
        private var response: InboundCheckDepositListPageResponse? = null

        internal fun from(inboundCheckDepositListPage: InboundCheckDepositListPage) = apply {
            service = inboundCheckDepositListPage.service
            params = inboundCheckDepositListPage.params
            response = inboundCheckDepositListPage.response
        }

        fun service(service: InboundCheckDepositService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: InboundCheckDepositListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: InboundCheckDepositListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [InboundCheckDepositListPage].
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
        fun build(): InboundCheckDepositListPage =
            InboundCheckDepositListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositListPage{service=$service, params=$params, response=$response}"
}
