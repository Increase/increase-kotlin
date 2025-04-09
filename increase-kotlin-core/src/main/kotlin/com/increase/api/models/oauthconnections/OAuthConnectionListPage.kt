// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.services.blocking.OAuthConnectionService
import java.util.Objects

/** List OAuth Connections */
class OAuthConnectionListPage
private constructor(
    private val oauthConnectionsService: OAuthConnectionService,
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

        return /* spotless:off */ other is OAuthConnectionListPage && oauthConnectionsService == other.oauthConnectionsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthConnectionsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListPage{oauthConnectionsService=$oauthConnectionsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): OAuthConnectionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): OAuthConnectionListPage? {
        return getNextPageParams()?.let { oauthConnectionsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            oauthConnectionsService: OAuthConnectionService,
            params: OAuthConnectionListParams,
            response: OAuthConnectionListPageResponse,
        ) = OAuthConnectionListPage(oauthConnectionsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthConnectionListPage) : Sequence<OAuthConnection> {

        override fun iterator(): Iterator<OAuthConnection> = iterator {
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
