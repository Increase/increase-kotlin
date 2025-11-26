// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.exports.Export
import com.increase.api.models.exports.ExportCreateParams
import com.increase.api.models.exports.ExportListParams
import com.increase.api.models.exports.ExportListResponse
import com.increase.api.models.exports.ExportRetrieveParams

interface ExportService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportService

    /** Create an Export */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** Retrieve an Export */
    fun retrieve(
        exportId: String,
        params: ExportRetrieveParams = ExportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export = retrieve(params.toBuilder().exportId(exportId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** @see retrieve */
    fun retrieve(exportId: String, requestOptions: RequestOptions): Export =
        retrieve(exportId, ExportRetrieveParams.none(), requestOptions)

    /** List Exports */
    fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExportListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): ExportListResponse =
        list(ExportListParams.none(), requestOptions)

    /** A view of [ExportService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /exports`, but is otherwise the same as
         * [ExportService.create].
         */
        @MustBeClosed
        fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /**
         * Returns a raw HTTP response for `get /exports/{export_id}`, but is otherwise the same as
         * [ExportService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            exportId: String,
            params: ExportRetrieveParams = ExportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export> =
            retrieve(params.toBuilder().exportId(exportId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: ExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(exportId: String, requestOptions: RequestOptions): HttpResponseFor<Export> =
            retrieve(exportId, ExportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportService.list].
         */
        @MustBeClosed
        fun list(
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExportListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<ExportListResponse> =
            list(ExportListParams.none(), requestOptions)
    }
}
