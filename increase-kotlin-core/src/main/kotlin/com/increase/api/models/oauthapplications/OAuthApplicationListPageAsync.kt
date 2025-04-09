// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.services.async.OAuthApplicationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** List OAuth Applications */
class OAuthApplicationListPageAsync
private constructor(
    private val oauthApplicationsService: OAuthApplicationServiceAsync,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) {

    /** Returns the response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.data]
     */
    fun data(): List<OAuthApplication> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [OAuthApplicationListPageResponse], but gracefully handles missing data.
     *
     * @see [OAuthApplicationListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthApplicationListPageAsync && oauthApplicationsService == other.oauthApplicationsService && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(oauthApplicationsService, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPageAsync{oauthApplicationsService=$oauthApplicationsService, params=$params, response=$response}"

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): OAuthApplicationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): OAuthApplicationListPageAsync? {
        return getNextPageParams()?.let { oauthApplicationsService.list(it) }
    }

    fun autoPager(): AutoPager = AutoPager(this)

    companion object {

        fun of(
            oauthApplicationsService: OAuthApplicationServiceAsync,
            params: OAuthApplicationListParams,
            response: OAuthApplicationListPageResponse,
        ) = OAuthApplicationListPageAsync(oauthApplicationsService, params, response)
    }

    class AutoPager(private val firstPage: OAuthApplicationListPageAsync) : Flow<OAuthApplication> {

        override suspend fun collect(collector: FlowCollector<OAuthApplication>) {
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
