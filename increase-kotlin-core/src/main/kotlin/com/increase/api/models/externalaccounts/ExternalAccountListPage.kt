// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.ExternalAccountService
import java.util.Objects

/** @see [ExternalAccountService.list] */
class ExternalAccountListPage
private constructor(
    private val service: ExternalAccountService,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListPageResponse,
) : Page<ExternalAccount> {

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.data]
     */
    fun data(): List<ExternalAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<ExternalAccount> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): ExternalAccountListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): ExternalAccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<ExternalAccount> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountListPage].
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

    /** A builder for [ExternalAccountListPage]. */
    class Builder internal constructor() {

        private var service: ExternalAccountService? = null
        private var params: ExternalAccountListParams? = null
        private var response: ExternalAccountListPageResponse? = null

        internal fun from(externalAccountListPage: ExternalAccountListPage) = apply {
            service = externalAccountListPage.service
            params = externalAccountListPage.params
            response = externalAccountListPage.response
        }

        fun service(service: ExternalAccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalAccountListPage].
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
        fun build(): ExternalAccountListPage =
            ExternalAccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPage{service=$service, params=$params, response=$response}"
}
