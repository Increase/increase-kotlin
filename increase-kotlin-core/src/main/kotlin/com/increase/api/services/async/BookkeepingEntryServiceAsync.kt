// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams

interface BookkeepingEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookkeepingEntryServiceAsync

    /** Retrieve a Bookkeeping Entry */
    suspend fun retrieve(
        bookkeepingEntryId: String,
        params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry =
        retrieve(params.toBuilder().bookkeepingEntryId(bookkeepingEntryId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** @see retrieve */
    suspend fun retrieve(
        bookkeepingEntryId: String,
        requestOptions: RequestOptions,
    ): BookkeepingEntry =
        retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entries */
    suspend fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): BookkeepingEntryListPageAsync =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookkeepingEntryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            bookkeepingEntryId: String,
            params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry> =
            retrieve(
                params.toBuilder().bookkeepingEntryId(bookkeepingEntryId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            bookkeepingEntryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntry> =
            retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntryListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BookkeepingEntryListPageAsync> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
