// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.services.blocking.ExternalAccountService
import java.util.Objects

/** List External Accounts */
class ExternalAccountListPage
private constructor(
    private val externalAccountsService: ExternalAccountService,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): ExternalAccountListPageResponse = response

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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is ExternalAccountListPage && externalAccountsService == other.externalAccountsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(externalAccountsService, params, response) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPage{externalAccountsService=$externalAccountsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ExternalAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): ExternalAccountListPage? {
        return getNextPageParams()?.let { externalAccountsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            externalAccountsService: ExternalAccountService,
            params: ExternalAccountListParams,
            response: ExternalAccountListPageResponse,
        ) = ExternalAccountListPage(externalAccountsService, params, response)
    }

    class AutoPager(private val firstPage: ExternalAccountListPage) : Sequence<ExternalAccount> {

        override fun iterator(): Iterator<ExternalAccount> = iterator {
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
