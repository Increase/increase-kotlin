// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.increase.api.services.blocking.AccountStatementService
import java.util.Objects

/** List Account Statements */
class AccountStatementListPage
private constructor(
    private val accountStatementsService: AccountStatementService,
    private val params: AccountStatementListParams,
    private val response: AccountStatementListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountStatementListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountStatementListPage && accountStatementsService == other.accountStatementsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountStatementsService, params, response) /* spotless:on */

    override fun toString() =
        "AccountStatementListPage{accountStatementsService=$accountStatementsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AccountStatementListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): AccountStatementListPage? {
        return getNextPageParams()?.let { accountStatementsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountStatementsService: AccountStatementService,
            params: AccountStatementListParams,
            response: AccountStatementListPageResponse,
        ) = AccountStatementListPage(accountStatementsService, params, response)
    }

    class AutoPager(private val firstPage: AccountStatementListPage) : Sequence<AccountStatement> {

        override fun iterator(): Iterator<AccountStatement> = iterator {
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
}
