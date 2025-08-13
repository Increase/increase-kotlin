// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.documents

import com.increase.api.core.AutoPagerAsync
import com.increase.api.core.PageAsync
import com.increase.api.core.checkRequired
import com.increase.api.services.async.DocumentServiceAsync
import java.util.Objects

/** @see DocumentServiceAsync.list */
class DocumentListPageAsync
private constructor(
    private val service: DocumentServiceAsync,
    private val params: DocumentListParams,
    private val response: DocumentListPageResponse,
) : PageAsync<Document> {

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentListPageResponse.data
     */
    fun data(): List<Document> = response._data().getNullable("data") ?: emptyList()

    /**
     * Delegates to [DocumentListPageResponse], but gracefully handles missing data.
     *
     * @see DocumentListPageResponse.nextCursor
     */
    fun nextCursor(): String? = response._nextCursor().getNullable("next_cursor")

    override fun items(): List<Document> = data()

    override fun hasNextPage(): Boolean = items().isNotEmpty() && nextCursor() != null

    fun nextPageParams(): DocumentListParams {
        val nextCursor =
            nextCursor() ?: throw IllegalStateException("Cannot construct next page params")
        return params.toBuilder().cursor(nextCursor).build()
    }

    override suspend fun nextPage(): DocumentListPageAsync = service.list(nextPageParams())

    fun autoPager(): AutoPagerAsync<Document> = AutoPagerAsync.from(this)

    /** The parameters that were used to request this page. */
    fun params(): DocumentListParams = params

    /** The response that this page was parsed from. */
    fun response(): DocumentListPageResponse = response

    fun toBuilder() = Builder().from(this)

    companion object {

        /**
         * Returns a mutable builder for constructing an instance of [DocumentListPageAsync].
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

    /** A builder for [DocumentListPageAsync]. */
    class Builder internal constructor() {

        private var service: DocumentServiceAsync? = null
        private var params: DocumentListParams? = null
        private var response: DocumentListPageResponse? = null

        internal fun from(documentListPageAsync: DocumentListPageAsync) = apply {
            service = documentListPageAsync.service
            params = documentListPageAsync.params
            response = documentListPageAsync.response
        }

        fun service(service: DocumentServiceAsync) = apply { this.service = service }

        /** The parameters that were used to request this page. */
        fun params(params: DocumentListParams) = apply { this.params = params }

        /** The response that this page was parsed from. */
        fun response(response: DocumentListPageResponse) = apply { this.response = response }

        /**
         * Returns an immutable instance of [DocumentListPageAsync].
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
        fun build(): DocumentListPageAsync =
            DocumentListPageAsync(
                checkRequired("service", service),
                checkRequired("params", params),
                checkRequired("response", response),
            )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }

        return other is DocumentListPageAsync &&
            service == other.service &&
            params == other.params &&
            response == other.response
    }

    override fun hashCode(): Int = Objects.hash(service, params, response)

    override fun toString() =
        "DocumentListPageAsync{service=$service, params=$params, response=$response}"
}
