// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundcheckdeposits

import com.increase.api.services.blocking.InboundCheckDepositService
import java.util.Objects

/** List Inbound Check Deposits */
class InboundCheckDepositListPage
private constructor(
    private val inboundCheckDepositsService: InboundCheckDepositService,
    private val params: InboundCheckDepositListParams,
    private val response: InboundCheckDepositListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): InboundCheckDepositListPageResponse = response

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.data]
     */
    fun data(): List<InboundCheckDeposit> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [InboundCheckDepositListPageResponse], but gracefully handles missing data.
     *
     * @see [InboundCheckDepositListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is InboundCheckDepositListPage && inboundCheckDepositsService == other.inboundCheckDepositsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(inboundCheckDepositsService, params, response) /* spotless:on */

    override fun toString() =
        "InboundCheckDepositListPage{inboundCheckDepositsService=$inboundCheckDepositsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): InboundCheckDepositListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): InboundCheckDepositListPage? {
        return getNextPageParams()?.let { inboundCheckDepositsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            inboundCheckDepositsService: InboundCheckDepositService,
            params: InboundCheckDepositListParams,
            response: InboundCheckDepositListPageResponse,
        ) = InboundCheckDepositListPage(inboundCheckDepositsService, params, response)
    }

    class AutoPager(private val firstPage: InboundCheckDepositListPage) :
        Sequence<InboundCheckDeposit> {

        override fun iterator(): Iterator<InboundCheckDeposit> = iterator {
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
