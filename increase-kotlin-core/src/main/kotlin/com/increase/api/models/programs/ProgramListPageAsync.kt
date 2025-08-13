// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.programs

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.ProgramServiceAsync
import java.util.Objects

/** @see ProgramServiceAsync.list */
class ProgramListPageAsync
private constructor(
    private val service: ProgramServiceAsync,
    private val params: ProgramListParams,
    private val response: ProgramListPageResponse,
) : PageAsync<Program> {

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see ProgramListPageResponse.data
     */
    fun data(): List<Program> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [ProgramListPageResponse], but gracefully handles missing data.
     *
     * @see ProgramListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Program> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): ProgramListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): ProgramListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Program> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): ProgramListParams = params

    /** The response that this page was parsed from. */
    fun response(): ProgramListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [ProgramListPageAsync].
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

    /** A builder for [ProgramListPageAsync]. */
    class Builder internal constructor() {

        private var service: ProgramServiceAsync? = null
        private var params: ProgramListParams? = null
        private var response: ProgramListPageResponse? = null

        internal fun from(programListPageAsync: ProgramListPageAsync) = apply {
            service = programListPageAsync.service
            params = programListPageAsync.params
            response = programListPageAsync.response
        }

        fun service(service: ProgramServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: ProgramListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: ProgramListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [ProgramListPageAsync].
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
        fun build(): ProgramListPageAsync =
            ProgramListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is ProgramListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "ProgramListPageAsync{service=$service, params=$params, response=$response}"
}
