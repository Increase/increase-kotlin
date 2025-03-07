// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPage
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Entry Set */
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** List Bookkeeping Entry Sets */
    fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): BookkeepingEntrySetListPage =
        list(BookkeepingEntrySetListParams.none(), requestOptions)

    /**
     * A view of [BookkeepingEntrySetService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetService.create].
         */
        @MustBeClosed
        fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}`,
         * but is otherwise the same as [BookkeepingEntrySetService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySet>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_entry_sets`, but is otherwise the same
         * as [BookkeepingEntrySetService.list].
         */
        @MustBeClosed
        fun list(
            params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingEntrySetListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<BookkeepingEntrySetListPage> =
            list(BookkeepingEntrySetListParams.none(), requestOptions)
    }
}
