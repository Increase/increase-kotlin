// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountnumbers

import com.increase.api.services.blocking.AccountNumberService
import java.util.Objects

/** List Account Numbers */
class AccountNumberListPage
private constructor(
    private val accountNumbersService: AccountNumberService,
    private val params: AccountNumberListParams,
    private val response: AccountNumberListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountNumberListPageResponse = response

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.data]
     */
    fun data(): List<AccountNumber> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountNumberListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountNumberListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountNumberListPage && accountNumbersService == other.accountNumbersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountNumbersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountNumberListPage{accountNumbersService=$accountNumbersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AccountNumberListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): AccountNumberListPage? {
        return getNextPageParams()?.let { accountNumbersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountNumbersService: AccountNumberService,
            params: AccountNumberListParams,
            response: AccountNumberListPageResponse,
        ) = AccountNumberListPage(accountNumbersService, params, response)
    }

    class AutoPager(private val firstPage: AccountNumberListPage) : Sequence<AccountNumber> {

        override fun iterator(): Iterator<AccountNumber> = iterator {
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
