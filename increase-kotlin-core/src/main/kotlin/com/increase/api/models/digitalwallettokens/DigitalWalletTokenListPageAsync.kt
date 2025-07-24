// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DigitalWalletTokenServiceAsync
import java.util.Objects

/** @see DigitalWalletTokenServiceAsync.list */
class DigitalWalletTokenListPageAsync
private constructor(
    private val service: DigitalWalletTokenServiceAsync,
    private val params: DigitalWalletTokenListParams,
    private val response: DigitalWalletTokenListPageResponse,
) : PageAsync<DigitalWalletToken> {

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalWalletTokenListPageResponse.data
     */
    fun data(): List<DigitalWalletToken> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DigitalWalletTokenListPageResponse], but gracefully handles missing data.
     *
     * @see DigitalWalletTokenListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<DigitalWalletToken> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): DigitalWalletTokenListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): DigitalWalletTokenListPageAsync =
        service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<DigitalWalletToken> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DigitalWalletTokenListParams = params

    /** The response that this page was parsed from. */
    fun response(): DigitalWalletTokenListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of
         * [DigitalWalletTokenListPageAsync].
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

    /** A builder for [DigitalWalletTokenListPageAsync]. */
    class Builder internal constructor() {

        private var service: DigitalWalletTokenServiceAsync? = null
        private var params: DigitalWalletTokenListParams? = null
        private var response: DigitalWalletTokenListPageResponse? = null

        internal fun from(digitalWalletTokenListPageAsync: DigitalWalletTokenListPageAsync) =
            apply {
                service = digitalWalletTokenListPageAsync.service
                params = digitalWalletTokenListPageAsync.params
                response = digitalWalletTokenListPageAsync.response
            }

        fun service(service: DigitalWalletTokenServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DigitalWalletTokenListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DigitalWalletTokenListPageResponse) = apply {
            this.response = response
        }

        /**
         * Returns an immutable instance of [DigitalWalletTokenListPageAsync].
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
        fun build(): DigitalWalletTokenListPageAsync =
            DigitalWalletTokenListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return /* spotless:off */ other is DigitalWalletTokenListPageAsync && service == other.service && params == other.params && response == other.response /* spotless:on */
    }

    override fun hashCode(): Int = /* spotless:off */ Objects.hash(service, params, response) /* spotless:on */

    override fun toString() =
        "DigitalWalletTokenListPageAsync{service=$service, params=$params, response=$response}"
}
