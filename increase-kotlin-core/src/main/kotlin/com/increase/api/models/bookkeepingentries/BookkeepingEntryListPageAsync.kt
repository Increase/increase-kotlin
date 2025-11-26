// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentries

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingEntryServiceAsync
import java.util.Objects

/** @see BookkeepingEntryServiceAsync.list */
class BookkeepingEntryListPageAsync
private constructor(
    private val service: BookkeepingEntryServiceAsync,
    private val params: BookkeepingEntryListParams,
    private val response: BookkeepingEntryListPageResponse,
) : PageAsync<BookkeepingEntry> {

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntryListPageResponse.data
     */
    fun data(): List<BookkeepingEntry> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingEntryListPageResponse], but gracefully handles missing data.
     *
     * @see BookkeepingEntryListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<BookkeepingEntry> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): BookkeepingEntryListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): BookkeepingEntryListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookkeepingEntry> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntryListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntryListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingEntryListPageAsync].
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

    /** A builder for [BookkeepingEntryListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntryServiceAsync? = null
        private var params: BookkeepingEntryListParams? = null
        private var response: BookkeepingEntryListPageResponse? = null

        internal fun from(bookkeepingEntryListPageAsync: BookkeepingEntryListPageAsync) = apply {
            service = bookkeepingEntryListPageAsync.service
            params = bookkeepingEntryListPageAsync.params
            response = bookkeepingEntryListPageAsync.response
        }

        fun service(service: BookkeepingEntryServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntryListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntryListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntryListPageAsync].
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
        fun build(): BookkeepingEntryListPageAsync =
            BookkeepingEntryListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is BookkeepingEntryListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "BookkeepingEntryListPageAsync{service=$service, params=$params, response=$response}"
}
