// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPage
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams

interface BookkeepingEntryService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookkeepingEntryService

    /** Retrieve a Bookkeeping Entry */
    fun retrieve(
        bookkeepingEntryId: String,
        params: BookkeepingEntryRetrieveParams = BookkeepingEntryRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry =
        retrieve(params.toBuilder().bookkeepingEntryId(bookkeepingEntryId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** @see retrieve */
    fun retrieve(bookkeepingEntryId: String, requestOptions: RequestOptions): BookkeepingEntry =
        retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

    /** List Bookkeeping Entries */
    fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): BookkeepingEntryListPage =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryService] that provides access to raw HTTP responses for each
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
        ): BookkeepingEntryService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            bookkeepingEntryId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntry> =
            retrieve(bookkeepingEntryId, BookkeepingEntryRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryService.list].
         */
        @MustBeClosed
        fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntryListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingEntryListPage> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
