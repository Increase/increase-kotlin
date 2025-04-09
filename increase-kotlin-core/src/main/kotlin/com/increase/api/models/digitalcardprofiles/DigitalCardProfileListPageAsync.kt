// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalcardprofiles

import com.increase.api.core.checkRequired
import com.increase.api.services.async.DigitalCardProfileServiceAsync
import java.util.Objects
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.FlowCollector

/** @see [DigitalCardProfileServiceAsync.list] */
class DigitalCardProfileListPageAsync
private constructor(
    private val service: DigitalCardProfileServiceAsync,
    private val params: DigitalCardProfileListParams,
    private val response: DigitalCardProfileListPageResponse,
) {

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.data]
     */
    fun data(): List<DigitalCardProfile> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DigitalCardProfileListPageResponse], but gracefully handles missing data.
     *
     * @see [DigitalCardProfileListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): DigitalCardProfileListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    suspend fun getNextPage(): DigitalCardProfileListPageAsync? =
        getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalCardProfileListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalCardProfileListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalCardProfileListPageAsync].
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

    /** A builder for [DigitalCardProfileListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalCardProfileServiceAsync? = null
        private var params: DigitalCardProfileListParams? = null
        private var response: DigitalCardProfileListPageResponse? = null

        internal fun from(digitalCardProfileListPageAsync: DigitalCardProfileListPageAsync) =
            apply {
                service = digitalCardProfileListPageAsync.service
                params = digitalCardProfileListPageAsync.params
                response = digitalCardProfileListPageAsync.response
            }

        fun service(service: DigitalCardProfileServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalCardProfileListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalCardProfileListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalCardProfileListPageAsync].
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
        fun build(): DigitalCardProfileListPageAsync =
            DigitalCardProfileListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: DigitalCardProfileListPageAsync) :
        Flow<DigitalCardProfile> {

        override suspend fun collect(collector: FlowCollector<DigitalCardProfile>) {
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

        return /* spotless:off */ other is DigitalCardProfileListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalCardProfileListPageAsync{service=$service, params=$params, response=$response}"
}
