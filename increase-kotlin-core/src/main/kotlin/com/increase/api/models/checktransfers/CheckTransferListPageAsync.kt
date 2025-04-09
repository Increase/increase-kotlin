// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import com.increase.api.services.async.CheckTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Check Transfers */
class CheckTransferListPageAsync
private constructor(
    private val checkTransfersService: CheckTransferServiceAsync,
    private val params: CheckTransferListParams,
    private val response: CheckTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): CheckTransferListPageResponse = response

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.data]
     */
    fun data(): List<CheckTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [CheckTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is CheckTransferListPageAsync && checkTransfersService == other.checkTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(checkTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "CheckTransferListPageAsync{checkTransfersService=$checkTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): CheckTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): CheckTransferListPageAsync? {
        return getNextPageParams()?.let { checkTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            checkTransfersService: CheckTransferServiceAsync,
            params: CheckTransferListParams,
            response: CheckTransferListPageResponse,
        ) = CheckTransferListPageAsync(checkTransfersService, params, response)
    }

    class AutoPager(private val firstPage: CheckTransferListPageAsync) : Flow<CheckTransfer> {

        override suspend fun collect(collector: FlowCollector<CheckTransfer>) {
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
