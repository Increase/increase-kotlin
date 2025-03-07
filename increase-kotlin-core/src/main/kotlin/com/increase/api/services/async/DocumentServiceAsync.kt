// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPageAsync
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams

interface DocumentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Document */
    suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** List Documents */
    suspend fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DocumentListPageAsync =
        list(DocumentListParams.none(), requestOptions)

    /**
     * A view of [DocumentServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /documents/{document_id}`, but is otherwise the same
         * as [DocumentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListPageAsync> =
            list(DocumentListParams.none(), requestOptions)
    }
}
