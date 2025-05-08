// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountStatementServiceAsync
import java.util.Objects

/** @see [AccountStatementServiceAsync.list] */
class AccountStatementListPageAsync
private constructor(
    private val service: AccountStatementServiceAsync,
    private val params: AccountStatementListParams,
    private val response: AccountStatementListPageResponse,
) : PageAsync<AccountStatement> {

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountStatementListPageResponse.data]
     */
    fun data(): List<AccountStatement> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountStatementListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountStatementListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<AccountStatement> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AccountStatementListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AccountStatementListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AccountStatement> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AccountStatementListParams = params

    /** The response that this page was parsed from. */
    fun response(): AccountStatementListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AccountStatementListPageAsync].
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

    /** A builder for [AccountStatementListPageAsync]. */
    class Builder internal constructor() {

        private var service: AccountStatementServiceAsync? = null
        private var params: AccountStatementListParams? = null
        private var response: AccountStatementListPageResponse? = null

        internal fun from(accountStatementListPageAsync: AccountStatementListPageAsync) = apply {
            service = accountStatementListPageAsync.service
            params = accountStatementListPageAsync.params
            response = accountStatementListPageAsync.response
        }

        fun service(service: AccountStatementServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AccountStatementListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AccountStatementListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AccountStatementListPageAsync].
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
        fun build(): AccountStatementListPageAsync =
            AccountStatementListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountStatementListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountStatementListPageAsync{service=$service, params=$params, response=$response}"
}
