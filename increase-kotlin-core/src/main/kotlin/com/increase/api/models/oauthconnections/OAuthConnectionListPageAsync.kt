// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.services.async.OAuthConnectionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List OAuth Connections */
class OAuthConnectionListPageAsync
private constructor(
    private val oauthConnectionsService: OAuthConnectionServiceAsync,
    private val params: OAuthConnectionListParams,
    private val response: OAuthConnectionListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OAuthConnectionListPageResponse = response

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthConnectionListPageResponse.data]
     */
    fun data(): List<OAuthConnection> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthConnectionListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthConnectionListPageAsync && oauthConnectionsService == other.oauthConnectionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthConnectionsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListPageAsync{oauthConnectionsService=$oauthConnectionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): OAuthConnectionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): OAuthConnectionListPageAsync? {
        return getNextPageParams()?.let { oauthConnectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            oauthConnectionsService: OAuthConnectionServiceAsync,
            params: OAuthConnectionListParams,
            response: OAuthConnectionListPageResponse,
        ) = OAuthConnectionListPageAsync(oauthConnectionsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthConnectionListPageAsync) : Flow<OAuthConnection> {

        override suspend fun collect(collector: FlowCollector<OAuthConnection>) {
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
