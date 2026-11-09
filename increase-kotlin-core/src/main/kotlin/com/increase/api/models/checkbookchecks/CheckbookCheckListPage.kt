// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.CheckbookCheckService
import java.util.Objects

/** @see CheckbookCheckService.list */
class CheckbookCheckListPage
private constructor(
    private val service: CheckbookCheckService,
    private val params: CheckbookCheckListParams,
    private val response: CheckbookCheckListPageResponse,
) : Page<CheckbookCheck> {

    /**
     * Delegates to [CheckbookCheckListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookCheckListPageResponse.data
     */
    fun data(): List<CheckbookCheck> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CheckbookCheckListPageResponse], but gracefully handles missing data.
     *
     * @see CheckbookCheckListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CheckbookCheck> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CheckbookCheckListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): CheckbookCheckListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<CheckbookCheck> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckbookCheckListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckbookCheckListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckbookCheckListPage].
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

    /** A builder for [CheckbookCheckListPage]. */
    class Builder internal constructor() {

        private var service: CheckbookCheckService? = null
        private var params: CheckbookCheckListParams? = null
        private var response: CheckbookCheckListPageResponse? = null

        internal fun from(checkbookCheckListPage: CheckbookCheckListPage) = apply {
            service = checkbookCheckListPage.service
            params = checkbookCheckListPage.params
            response = checkbookCheckListPage.response
        }

        fun service(service: CheckbookCheckService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckbookCheckListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckbookCheckListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckbookCheckListPage].
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
        fun build(): CheckbookCheckListPage =
            CheckbookCheckListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckbookCheckListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CheckbookCheckListPage{service=$service, params=$params, response=$response}"
}
