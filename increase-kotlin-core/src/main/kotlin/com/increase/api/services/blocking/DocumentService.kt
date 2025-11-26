// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.documents.Document
import com.increase.api.models.documents.DocumentCreateParams
import com.increase.api.models.documents.DocumentListParams
import com.increase.api.models.documents.DocumentListResponse
import com.increase.api.models.documents.DocumentRetrieveParams

interface DocumentService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService

    /** Create a Document */
    fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** Retrieve a Document */
    fun retrieve(
        documentId: String,
        params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document = retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Document

    /** @see retrieve */
    fun retrieve(documentId: String, requestOptions: RequestOptions): Document =
        retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

    /** List Documents */
    fun list(
        params: DocumentListParams = DocumentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DocumentListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): DocumentListResponse =
        list(DocumentListParams.none(), requestOptions)

    /** A view of [DocumentService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /documents`, but is otherwise the same as
         * [DocumentService.create].
         */
        @MustBeClosed
        fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /**
         * Returns a raw HTTP response for `get /documents/{document_id}`, but is otherwise the same
         * as [DocumentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            params: DocumentRetrieveParams = DocumentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document> =
            retrieve(params.toBuilder().documentId(documentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: DocumentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Document>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            documentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> =
            retrieve(documentId, DocumentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /documents`, but is otherwise the same as
         * [DocumentService.list].
         */
        @MustBeClosed
        fun list(
            params: DocumentListParams = DocumentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DocumentListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DocumentListResponse> =
            list(DocumentListParams.none(), requestOptions)
    }
}
