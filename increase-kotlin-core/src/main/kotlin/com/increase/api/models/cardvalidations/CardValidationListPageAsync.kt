// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cardvalidations

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.CardValidationServiceAsync
import java.util.Objects

/** @see CardValidationServiceAsync.list */
class CardValidationListPageAsync
private constructor(
    private val service: CardValidationServiceAsync,
    private val params: CardValidationListParams,
    private val response: CardValidationListPageResponse,
) : PageAsync<CardValidation> {

    /**
     * Delegates to [CardValidationListPageResponse], but gracefully handles missing data.
     *
     * @see CardValidationListPageResponse.data
     */
    fun data(): List<CardValidation> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [CardValidationListPageResponse], but gracefully handles missing data.
     *
     * @see CardValidationListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<CardValidation> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): CardValidationListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): CardValidationListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<CardValidation> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): CardValidationListParams = params

    /** The response that this page was parsed from. */
    fun response(): CardValidationListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [CardValidationListPageAsync].
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

    /** A builder for [CardValidationListPageAsync]. */
    class Builder internal constructor() {

        private var service: CardValidationServiceAsync? = null
        private var params: CardValidationListParams? = null
        private var response: CardValidationListPageResponse? = null

        internal fun from(cardValidationListPageAsync: CardValidationListPageAsync) = apply {
            service = cardValidationListPageAsync.service
            params = cardValidationListPageAsync.params
            response = cardValidationListPageAsync.response
        }

        fun service(service: CardValidationServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: CardValidationListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: CardValidationListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [CardValidationListPageAsync].
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
        fun build(): CardValidationListPageAsync =
            CardValidationListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is CardValidationListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "CardValidationListPageAsync{service=$service, params=$params, response=$response}"
}
