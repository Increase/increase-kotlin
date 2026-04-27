// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.lockboxaddresses

import com.increase.api.core.AutoPager
import com.increase.api.core.Page
import com.increase.api.core.checkRequired
import com.increase.api.services.blocking.LockboxAddressService
import java.util.Objects

/** @see LockboxAddressService.list */
class LockboxAddressListPage
private constructor(
    private val service: LockboxAddressService,
    private val params: LockboxAddressListParams,
    private val response: LockboxAddressListPageResponse,
) : Page<LockboxAddress> {

    /**
     * Delegates to [LockboxAddressListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxAddressListPageResponse.data
     */
    fun data(): List<LockboxAddress> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [LockboxAddressListPageResponse], but gracefully handles missing data.
     *
     * @see LockboxAddressListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<LockboxAddress> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): LockboxAddressListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override fun nextPage(): LockboxAddressListPage = service.list(nextPageParams())

    fun autoPager(): AutoPager<LockboxAddress> = AutoPager.from(this)

    /** The parameters that were used to request this page. */
    fun params(): LockboxAddressListParams = params

    /** The response that this page was parsed from. */
    fun response(): LockboxAddressListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [LockboxAddressListPage].
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

    /** A builder for [LockboxAddressListPage]. */
    class Builder internal constructor() {

        private var service: LockboxAddressService? = null
        private var params: LockboxAddressListParams? = null
        private var response: LockboxAddressListPageResponse? = null

        internal fun from(lockboxAddressListPage: LockboxAddressListPage) = apply {
            service = lockboxAddressListPage.service
            params = lockboxAddressListPage.params
            response = lockboxAddressListPage.response
        }

        fun service(service: LockboxAddressService) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: LockboxAddressListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: LockboxAddressListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [LockboxAddressListPage].
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
        fun build(): LockboxAddressListPage =
            LockboxAddressListPage(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is LockboxAddressListPage &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "LockboxAddressListPage{service=$service, params=$params, response=$response}"
}
