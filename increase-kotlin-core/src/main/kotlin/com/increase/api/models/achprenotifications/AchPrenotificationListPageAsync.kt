// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.AchPrenotificationServiceAsync
import java.util.Objects

/** @see AchPrenotificationServiceAsync.list */
class AchPrenotificationListPageAsync
private constructor(
    private val service: AchPrenotificationServiceAsync,
    private val params: AchPrenotificationListParams,
    private val response: AchPrenotificationListPageResponse,
) : PageAsync<AchPrenotification> {

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see AchPrenotificationListPageResponse.data
     */
    fun data(): List<AchPrenotification> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see AchPrenotificationListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<AchPrenotification> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AchPrenotificationListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): AchPrenotificationListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<AchPrenotification> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AchPrenotificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AchPrenotificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [AchPrenotificationListPageAsync].
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

    /** A builder for [AchPrenotificationListPageAsync]. */
    class Builder internal constructor() {

        private var service: AchPrenotificationServiceAsync? = null
        private var params: AchPrenotificationListParams? = null
        private var response: AchPrenotificationListPageResponse? = null

        internal fun from(achPrenotificationListPageAsync: AchPrenotificationListPageAsync) =
            apply {
                service = achPrenotificationListPageAsync.service
                params = achPrenotificationListPageAsync.params
                response = achPrenotificationListPageAsync.response
            }

        fun service(service: AchPrenotificationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AchPrenotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AchPrenotificationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AchPrenotificationListPageAsync].
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
        fun build(): AchPrenotificationListPageAsync =
            AchPrenotificationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is AchPrenotificationListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "AchPrenotificationListPageAsync{service=$service, params=$params, response=$response}"
}
