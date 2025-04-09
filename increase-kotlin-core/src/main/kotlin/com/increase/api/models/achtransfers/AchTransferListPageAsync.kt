// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import com.increase.api.services.async.AchTransferServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List ACH Transfers */
class AchTransferListPageAsync
private constructor(
    private val achTransfersService: AchTransferServiceAsync,
    private val params: AchTransferListParams,
    private val response: AchTransferListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): AchTransferListPageResponse = response

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.data]
     */
    fun data(): List<AchTransfer> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AchTransferListPageResponse], but gracefully handles missing data.
     *
     * @see [AchTransferListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchTransferListPageAsync && achTransfersService == other.achTransfersService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(achTransfersService, params, response) /* spotless:on */

    override fun toString() =
        "AchTransferListPageAsync{achTransfersService=$achTransfersService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): AchTransferListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): AchTransferListPageAsync? {
        return getNextPageParams()?.let { achTransfersService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            achTransfersService: AchTransferServiceAsync,
            params: AchTransferListParams,
            response: AchTransferListPageResponse,
        ) = AchTransferListPageAsync(achTransfersService, params, response)
    }

    class AutoPager(private val firstPage: AchTransferListPageAsync) : Flow<AchTransfer> {

        override suspend fun collect(collector: FlowCollector<AchTransfer>) {
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
