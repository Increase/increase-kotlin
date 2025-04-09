// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import com.increase.api.services.async.CheckDepositServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Check Deposits */
class CheckDepositListPageAsync
private constructor(
    private val checkDepositsService: CheckDepositServiceAsync,
    private val params: CheckDepositListParams,
    private val response: CheckDepositListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CheckDepositListPageResponse = response

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.data]
     */
    fun data(): List<CheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckDepositListPageAsync && checkDepositsService == other.checkDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "CheckDepositListPageAsync{checkDepositsService=$checkDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CheckDepositListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CheckDepositListPageAsync? {
        return getNextPageParams()?.let { checkDepositsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            checkDepositsService: CheckDepositServiceAsync,
            params: CheckDepositListParams,
            response: CheckDepositListPageResponse,
        ) = CheckDepositListPageAsync(checkDepositsService, params, response)
    }

    class AutoPager(private val firstPage: CheckDepositListPageAsync) : Flow<CheckDeposit> {

        override suspend fun collect(collector: FlowCollector<CheckDeposit>) {
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
