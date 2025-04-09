// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.core.checkRequired
import com.increase.api.services.async.AccountStatementServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [AccountStatementServiceAsync.list] */
class AccountStatementListPageAsync
private constructor(
    private val service: AccountStatementServiceAsync,
    private val params: AccountStatementListParams,
    private val response: AccountStatementListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AccountStatementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): AccountStatementListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

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

    class AutoPager(private val firstPage: AccountStatementListPageAsync) : Flow<AccountStatement> {

        override suspend fun collect(collector: FlowCollector<AccountStatement>) {
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

        return /* spotless:off */ other is AccountStatementListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AccountStatementListPageAsync{service=$service, params=$params, response=$response}"
}
