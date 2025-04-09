// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.externalaccounts

import com.increase.api.core.checkRequired
import com.increase.api.services.async.ExternalAccountServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [ExternalAccountServiceAsync.list] */
class ExternalAccountListPageAsync
private constructor(
    private val service: ExternalAccountServiceAsync,
    private val params: ExternalAccountListParams,
    private val response: ExternalAccountListPageResponse,
) {

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.data]
     */
    fun data(): List<ExternalAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ExternalAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [ExternalAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): ExternalAccountListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): ExternalAccountListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): ExternalAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): ExternalAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ExternalAccountListPageAsync].
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

    /** A builder for [ExternalAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: ExternalAccountServiceAsync? = null
        private var params: ExternalAccountListParams? = null
        private var response: ExternalAccountListPageResponse? = null

        internal fun from(externalAccountListPageAsync: ExternalAccountListPageAsync) = apply {
            service = externalAccountListPageAsync.service
            params = externalAccountListPageAsync.params
            response = externalAccountListPageAsync.response
        }

        fun service(service: ExternalAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ExternalAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ExternalAccountListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ExternalAccountListPageAsync].
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
        fun build(): ExternalAccountListPageAsync =
            ExternalAccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: ExternalAccountListPageAsync) : Flow<ExternalAccount> {

        override suspend fun collect(collector: FlowCollector<ExternalAccount>) {
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

        return /* spotless:off */ other is ExternalAccountListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "ExternalAccountListPageAsync{service=$service, params=$params, response=$response}"
}
