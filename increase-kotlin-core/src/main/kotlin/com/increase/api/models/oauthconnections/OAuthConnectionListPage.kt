// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.oauthconnections

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.OAuthConnectionService
import java.util.Objects

/** @see OAuthConnectionService.list */
class OAuthConnectionListPage
private constructor(
    private val service: OAuthConnectionService,
    private val params: OAuthConnectionListParams,
    private val response: OAuthConnectionListPageResponse,
) : Page<OAuthConnection> {

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

    override fun nextPage(): OAuthConnectionListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<OAuthConnection> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): OAuthConnectionListParams = params

    /** The response that this page was parsed from. */
    fun response(): OAuthConnectionListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [OAuthConnectionListPage].
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

    /** A builder for [OAuthConnectionListPage]. */
    class Builder internal constructor() {

        private var service: OAuthConnectionService? = null
        private var params: OAuthConnectionListParams? = null
        private var response: OAuthConnectionListPageResponse? = null

        internal fun from(oauthConnectionListPage: OAuthConnectionListPage) = apply {
            service = oauthConnectionListPage.service
            params = oauthConnectionListPage.params
            response = oauthConnectionListPage.response
        }

        fun service(service: OAuthConnectionService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: OAuthConnectionListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: OAuthConnectionListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [OAuthConnectionListPage].
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
        fun build(): OAuthConnectionListPage =
            OAuthConnectionListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is OAuthConnectionListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "OAuthConnectionListPage{service=$service, params=$params, response=$response}"
}
