// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AccountService
import java.util.Objects

/** @see AccountService.list */
class AccountListPage
private constructor(
    private val service: AccountService,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) : Page<Account> {

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.data
     */
    fun data(): List<Account> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see AccountListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Account> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AccountListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AccountListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<Account> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AccountListPage].
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

    /** A builder for [AccountListPage]. */
    class Builder internal constructor() {

        private var service: AccountService? = null
        private var params: AccountListParams? = null
        private var response: AccountListPageResponse? = null

        internal fun from(accountListPage: AccountListPage) = apply {
            service = accountListPage.service
            params = accountListPage.params
            response = accountListPage.response
        }

        fun service(service: AccountService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [AccountListPage].
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
        fun build(): AccountListPage =
            AccountListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPage{service=$service, params=$params, response=$response}"
}
