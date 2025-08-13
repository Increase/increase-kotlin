// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingEntrySetServiceAsync
import java.util.Objects

/** @see BookkeepingEntrySetServiceAsync.list */
class BookkeepingEntrySetListPageAsync
private constructor(
    private val service: BookkeepingEntrySetServiceAsync,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) : PageAsync<BookkeepingEntrySet> {

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntrySetListPageResponse.data
     */
    fun data(): List<BookkeepingEntrySet> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntrySetListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<BookkeepingEntrySet> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): BookkeepingEntrySetListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): BookkeepingEntrySetListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookkeepingEntrySet> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntrySetListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntrySetListPageAsync].
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

    /** A builder for [BookkeepingEntrySetListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntrySetServiceAsync? = null
        private var params: BookkeepingEntrySetListParams? = null
        private var response: BookkeepingEntrySetListPageResponse? = null

        internal fun from(bookkeepingEntrySetListPageAsync: BookkeepingEntrySetListPageAsync) =
            apply {
                service = bookkeepingEntrySetListPageAsync.service
                params = bookkeepingEntrySetListPageAsync.params
                response = bookkeepingEntrySetListPageAsync.response
            }

        fun service(service: BookkeepingEntrySetServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntrySetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntrySetListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntrySetListPageAsync].
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
        fun build(): BookkeepingEntrySetListPageAsync =
            BookkeepingEntrySetListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntrySetListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BookkeepingEntrySetListPageAsync{service=$service, params=$params, response=$response}"
}
