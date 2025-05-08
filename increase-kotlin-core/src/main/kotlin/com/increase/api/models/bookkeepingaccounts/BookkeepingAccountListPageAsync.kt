// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.BookkeepingAccountServiceAsync
import java.util.Objects

/** @see [BookkeepingAccountServiceAsync.list] */
class BookkeepingAccountListPageAsync
private constructor(
    private val service: BookkeepingAccountServiceAsync,
    private val params: BookkeepingAccountListParams,
    private val response: BookkeepingAccountListPageResponse,
) : PageAsync<BookkeepingAccount> {

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.data]
     */
    fun data(): List<BookkeepingAccount> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingAccountListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingAccountListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<BookkeepingAccount> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): BookkeepingAccountListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): BookkeepingAccountListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<BookkeepingAccount> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingAccountListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingAccountListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [BookkeepingAccountListPageAsync].
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

    /** A builder for [BookkeepingAccountListPageAsync]. */
    class Builder internal constructor() {

        private var service: BookkeepingAccountServiceAsync? = null
        private var params: BookkeepingAccountListParams? = null
        private var response: BookkeepingAccountListPageResponse? = null

        internal fun from(bookkeepingAccountListPageAsync: BookkeepingAccountListPageAsync) =
            apply {
                service = bookkeepingAccountListPageAsync.service
                params = bookkeepingAccountListPageAsync.params
                response = bookkeepingAccountListPageAsync.response
            }

        fun service(service: BookkeepingAccountServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingAccountListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingAccountListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingAccountListPageAsync].
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
        fun build(): BookkeepingAccountListPageAsync =
            BookkeepingAccountListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is BookkeepingAccountListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingAccountListPageAsync{service=$service, params=$params, response=$response}"
}
