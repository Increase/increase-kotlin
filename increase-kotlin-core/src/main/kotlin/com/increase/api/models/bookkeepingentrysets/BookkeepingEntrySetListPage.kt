// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.BookkeepingEntrySetService
import java.util.Objects

/** @see [BookkeepingEntrySetService.list] */
class BookkeepingEntrySetListPage
private constructor(
    private val service: BookkeepingEntrySetService,
    private val params: BookkeepingEntrySetListParams,
    private val response: BookkeepingEntrySetListPageResponse,
) {

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.data]
     */
    fun data(): List<BookkeepingEntrySet> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [BookkeepingEntrySetListPageResponse], but gracefully handles missing data.
     *
     * @see [BookkeepingEntrySetListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): BookkeepingEntrySetListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): BookkeepingEntrySetListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): BookkeepingEntrySetListParams = params

    /** The response that this page was parsed from. */
    fun response(): BookkeepingEntrySetListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [BookkeepingEntrySetListPage].
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

    /** A builder for [BookkeepingEntrySetListPage]. */
    class Builder internal constructor() {

        private var service: BookkeepingEntrySetService? = null
        private var params: BookkeepingEntrySetListParams? = null
        private var response: BookkeepingEntrySetListPageResponse? = null

        internal fun from(bookkeepingEntrySetListPage: BookkeepingEntrySetListPage) = apply {
            service = bookkeepingEntrySetListPage.service
            params = bookkeepingEntrySetListPage.params
            response = bookkeepingEntrySetListPage.response
        }

        fun service(service: BookkeepingEntrySetService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: BookkeepingEntrySetListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: BookkeepingEntrySetListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [BookkeepingEntrySetListPage].
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
        fun build(): BookkeepingEntrySetListPage =
            BookkeepingEntrySetListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: BookkeepingEntrySetListPage) :
        Sequence<BookkeepingEntrySet> {

        override fun iterator(): Iterator<BookkeepingEntrySet> = iterator {
            var page = firstPage
            var index = 0
            while (true) {
                while (index < page.data().size) {
                    yield(page.data()[index++])
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

        return /* spotless:off */ other is BookkeepingEntrySetListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "BookkeepingEntrySetListPage{service=$service, params=$params, response=$response}"
}
