// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounttransfers

import com.increase.api.services.async.AccountTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Account Transfers */
class AccountTransferListPageAsync
private constructor(
    private val accountTransfersService: AccountTransferServiceAsync,
    private val params: AccountTransferListParams,
    private val response: AccountTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AccountTransferListPageResponse = response

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.data]
     */
    fun data(): List<AccountTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AccountTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AccountTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AccountTransferListPageAsync && accountTransfersService == other.accountTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(accountTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AccountTransferListPageAsync{accountTransfersService=$accountTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AccountTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): AccountTransferListPageAsync? {
        return getNextPageParams()?.let { accountTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            accountTransfersService: AccountTransferServiceAsync,
            params: AccountTransferListParams,
            response: AccountTransferListPageResponse,
        ) = AccountTransferListPageAsync(accountTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AccountTransferListPageAsync) : Flow<AccountTransfer> {

        override suspend fun collect(collector: FlowCollector<AccountTransfer>) {
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
