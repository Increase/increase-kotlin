// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkbookchecks

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CheckbookCheckServiceAsync
import java.util.Objects

/** @see CheckbookCheckServiceAsync.list */
class CheckbookCheckListPageAsync
private constructor(
    private val service: CheckbookCheckServiceAsync,
    private val params: CheckbookCheckListParams,
    private val response: CheckbookCheckListPageResponse,
) : PageAsync<CheckbookCheck> {

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

    override suspend fun nextPage(): CheckbookCheckListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CheckbookCheck> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CheckbookCheckListParams = params

    /** The response that this page was parsed from. */
    fun response(): CheckbookCheckListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CheckbookCheckListPageAsync].
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

    /** A builder for [CheckbookCheckListPageAsync]. */
    class Builder internal constructor() {

        private var service: CheckbookCheckServiceAsync? = null
        private var params: CheckbookCheckListParams? = null
        private var response: CheckbookCheckListPageResponse? = null

        internal fun from(checkbookCheckListPageAsync: CheckbookCheckListPageAsync) = apply {
            service = checkbookCheckListPageAsync.service
            params = checkbookCheckListPageAsync.params
            response = checkbookCheckListPageAsync.response
        }

        fun service(service: CheckbookCheckServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CheckbookCheckListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CheckbookCheckListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CheckbookCheckListPageAsync].
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
        fun build(): CheckbookCheckListPageAsync =
            CheckbookCheckListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CheckbookCheckListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CheckbookCheckListPageAsync{service=$service, params=$params, response=$response}"
}
