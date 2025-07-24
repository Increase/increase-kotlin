// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.OAuthConnectionServiceAsync
import java.util.Objects

/** @see OAuthConnectionServiceAsync.list */
class OAuthConnectionListPageAsync
private constructor(
    private val service: OAuthConnectionServiceAsync,
    private val params: OAuthConnectionListParams,
    private val response: OAuthConnectionListPageResponse,
) : PageAsync<OAuthConnection> {

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthConnectionListPageResponse.data
     */
    fun data(): List<OAuthConnection> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [OAuthConnectionListPageResponse], but gracefully handles missing data.
     *
     * @see OAuthConnectionListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<OAuthConnection> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): OAuthConnectionListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): OAuthConnectionListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<OAuthConnection> = AutoPagerAsync.from(this)

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
