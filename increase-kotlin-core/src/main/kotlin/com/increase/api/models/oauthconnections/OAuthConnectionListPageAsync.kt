// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.core.checkRequired
import com.increase.api.services.async.OAuthConnectionServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [OAuthConnectionServiceAsync.list] */
class OAuthConnectionListPageAsync
private constructor(
    private val service: OAuthConnectionServiceAsync,
    private val params: OAuthConnectionListParams,
    private val response: OAuthConnectionListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): OAuthConnectionListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): OAuthConnectionListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthConnectionListPageAsync].
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         */
        fun builder() = Builder()
    }

    /** A builder for [OAuthConnectionListPageAsync]. */
    class Builder internal constructor() {

        private var service: OAuthConnectionServiceAsync? = null
        private var params: OAuthConnectionListParams? = null
        private var response: OAuthConnectionListPageResponse? = null

        internal fun from(oauthConnectionListPageAsync: OAuthConnectionListPageAsync) = apply {
            service = oauthConnectionListPageAsync.service
            params = oauthConnectionListPageAsync.params
            response = oauthConnectionListPageAsync.response
        }

        fun service(service: OAuthConnectionServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthConnectionListPageAsync].
         *
         * Further updates to this [Builder] will not mutate the returned instance.
         *
         * The following fields are required:
         * ```kotlin
         * .service()
         * .params()
         * .response()
         * ```
         *
         * @throws IllegalStateException if any required field is unset.
         */
        fun build(): OAuthConnectionListPageAsync =
            OAuthConnectionListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthConnectionListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListPageAsync{service=$service, params=$params, response=$response}"
}
