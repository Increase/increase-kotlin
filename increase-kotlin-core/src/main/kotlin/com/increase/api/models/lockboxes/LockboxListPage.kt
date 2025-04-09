// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxes

import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.LockboxService
import java.util.Objects

/** @see [LockboxService.list] */
class LockboxListPage
private constructor(
    private val service: LockboxService,
    private val params: LockboxListParams,
    private val response: LockboxListPageResponse,
) {

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.data]
     */
    fun data(): List<Lockbox> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxListPageResponse], but gracefully handles missing data.
     *
     * @see [LockboxListPageResponse.nextCursor]
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    fun hasNextPage(): Boolean = data().isNotEmpty() && nextCursor() != null

    fun getNextPageParams(): LockboxListParams? {
        if (!hasNextPage()) {
            return null
        }

        return params.toBuilder().apply { nextCursor()?.let { cursor(it) } }.build()
    }

    fun getNextPage(): LockboxListPage? = getNextPageParams()?.let { service.list(it) }

    fun autoPager(): AutoPager = AutoPager(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxListPage].
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

    /** A builder for [LockboxListPage]. */
    class Builder internal constructor() {

        private var service: LockboxService? = null
        private var params: LockboxListParams? = null
        private var response: LockboxListPageResponse? = null

        internal fun from(lockboxListPage: LockboxListPage) = apply {
            service = lockboxListPage.service
            params = lockboxListPage.params
            response = lockboxListPage.response
        }

        fun service(service: LockboxService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxListPage].
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
        fun build(): LockboxListPage =
            LockboxListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    class AutoPager(private val firstPage: LockboxListPage) : Sequence<Lockbox> {

        override fun iterator(): Iterator<Lockbox> = iterator {
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

        return /* spotless:off */ other is LockboxListPage && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "LockboxListPage{service=$service, params=$params, response=$response}"
}
