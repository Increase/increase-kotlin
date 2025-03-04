// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Bookkeeping Entry */
    suspend fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    suspend fun list(
        params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntryListPageAsync

    /** List Bookkeeping Entries */
    suspend fun list(requestOptions: RequestOptions): BookkeepingEntryListPageAsync =
        list(BookkeepingEntryListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntryServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries/{bookkeeping_entry_id}`, but is
         * otherwise the same as [BookkeepingEntryServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntry>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BookkeepingEntryListParams = BookkeepingEntryListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntryListPageAsync>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entries`, but is otherwise the same as
         * [BookkeepingEntryServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BookkeepingEntryListPageAsync> =
            list(BookkeepingEntryListParams.none(), requestOptions)
    }
}
