// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthapplications

import com.increase.api.core.checkRequired
import com.increase.api.services.async.OAuthApplicationServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [OAuthApplicationServiceAsync.list] */
class OAuthApplicationListPageAsync
private constructor(
    private val service: OAuthApplicationServiceAsync,
    private val params: OAuthApplicationListParams,
    private val response: OAuthApplicationListPageResponse,
) {

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

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): OAuthApplicationListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): OAuthApplicationListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthApplicationListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthApplicationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [OAuthApplicationListPageAsync].
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

    /** A builder for [OAuthApplicationListPageAsync]. */
    class Builder internal constructor() {

        private var service: OAuthApplicationServiceAsync? = null
        private var params: OAuthApplicationListParams? = null
        private var response: OAuthApplicationListPageResponse? = null

        internal fun from(oauthApplicationListPageAsync: OAuthApplicationListPageAsync) = apply {
            service = oauthApplicationListPageAsync.service
            params = oauthApplicationListPageAsync.params
            response = oauthApplicationListPageAsync.response
        }

        fun service(service: OAuthApplicationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthApplicationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthApplicationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [OAuthApplicationListPageAsync].
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
        fun build(): OAuthApplicationListPageAsync =
            OAuthApplicationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
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

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthApplicationListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "OAuthApplicationListPageAsync{service=$service, params=$params, response=$response}"
}
