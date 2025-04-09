// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import com.increase.api.services.async.AccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Accounts */
class AccountListPageAsync
private constructor(
    private val accountsService: AccountServiceAsync,
    private val params: AccountListParams,
    private val response: AccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountListPageResponse = response

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.data]
     */
    fun data(): List<Account> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountListPageAsync && accountsService == other.accountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountListPageAsync{accountsService=$accountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): AccountListPageAsync? {
        return getNextPageParams()?.let { accountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountsService: AccountServiceAsync,
            params: AccountListParams,
            response: AccountListPageResponse,
        ) = AccountListPageAsync(accountsService, params, response)
    }

    class AutoPager(private val firstPage: AccountListPageAsync) : Flow<Account> {

        override suspend fun collect(collector: FlowCollector<Account>) {
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
}
