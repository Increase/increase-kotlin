// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List Digital Wallet Tokens */
class DigitalWalletTokenListPageAsync
private constructor(
    private val digitalWalletTokensService: DigitalWalletTokenServiceAsync,
    private val params: DigitalWalletTokenListParams,
    private val response: DigitalWalletTokenListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): DigitalWalletTokenListPageResponse = response

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalWalletTokenListPageResponse.data]
     */
    fun data(): List<DigitalWalletToken> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalWalletTokenListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletTokenListPageAsync && digitalWalletTokensService == other.digitalWalletTokensService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(digitalWalletTokensService, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPageAsync{digitalWalletTokensService=$digitalWalletTokensService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DigitalWalletTokenListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): DigitalWalletTokenListPageAsync? {
        return getNextPageParams()?.let { digitalWalletTokensService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            digitalWalletTokensService: DigitalWalletTokenServiceAsync,
            params: DigitalWalletTokenListParams,
            response: DigitalWalletTokenListPageResponse,
        ) = DigitalWalletTokenListPageAsync(digitalWalletTokensService, params, response)
    }

    class AutoPager(private val firstPage: DigitalWalletTokenListPageAsync) :
        Flow<DigitalWalletToken> {

        override suspend fun collect(collector: FlowCollector<DigitalWalletToken>) {
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
