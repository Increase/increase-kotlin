// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achprenotifications

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.AchPrenotificationService
import java.util.Objects

/** @see [AchPrenotificationService.list] */
class AchPrenotificationListPage
private constructor(
    private val service: AchPrenotificationService,
    private val params: AchPrenotificationListParams,
    private val response: AchPrenotificationListPageResponse,
) : Page<AchPrenotification> {

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.data]
     */
    fun data(): List<AchPrenotification> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [AchPrenotificationListPageResponse], but gracefully handles missing data.
     *
     * @see [AchPrenotificationListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<AchPrenotification> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): AchPrenotificationListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): AchPrenotificationListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<AchPrenotification> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): AchPrenotificationListParams = params

    /** The response that this page was parsed from. */
    fun response(): AchPrenotificationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [AchPrenotificationListPage].
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

    /** A builder for [AchPrenotificationListPage]. */
    class Builder internal constructor() {

        private var service: AchPrenotificationService? = null
        private var params: AchPrenotificationListParams? = null
        private var response: AchPrenotificationListPageResponse? = null

        internal fun from(achPrenotificationListPage: AchPrenotificationListPage) = apply {
            service = achPrenotificationListPage.service
            params = achPrenotificationListPage.params
            response = achPrenotificationListPage.response
        }

        fun service(service: AchPrenotificationService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: AchPrenotificationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: AchPrenotificationListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [AchPrenotificationListPage].
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
        fun build(): AchPrenotificationListPage =
            AchPrenotificationListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is AchPrenotificationListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "AchPrenotificationListPage{service=$service, params=$params, response=$response}"
}
