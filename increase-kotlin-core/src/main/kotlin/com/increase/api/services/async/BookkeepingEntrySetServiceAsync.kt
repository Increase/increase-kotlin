// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySet
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListPageAsync
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookkeepingEntrySetServiceAsync

    /** Create a Bookkeeping Entry Set */
    suspend fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    suspend fun retrieve(
        bookkeepingEntrySetId: String,
        params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet =
        retrieve(
            params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** @see [retrieve] */
    suspend fun retrieve(
        bookkeepingEntrySetId: String,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        retrieve(bookkeepingEntrySetId, BookkeepingEntrySetRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entry Sets */
    suspend fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BookkeepingEntrySetListPageAsync =
        list(BookkeepingEntrySetListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntrySetServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookkeepingEntrySetServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}`,
         * but is otherwise the same as [BookkeepingEntrySetServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            bookkeepingEntrySetId: String,
            params: BookkeepingEntrySetRetrieveParams = BookkeepingEntrySetRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(
                params.toBuilder().bookkeepingEntrySetId(bookkeepingEntrySetId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            bookkeepingEntrySetId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> =
            retrieve(
                bookkeepingEntrySetId,
                BookkeepingEntrySetRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySetListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BookkeepingEntrySetListPageAsync> =
            list(BookkeepingEntrySetListParams.none(), requestOptions)
    }
}
