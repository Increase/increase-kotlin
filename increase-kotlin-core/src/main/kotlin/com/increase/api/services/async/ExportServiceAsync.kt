// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.exports.Export
import com.increase.api.models.exports.ExportCreateParams
import com.increase.api.models.exports.ExportListPageAsync
import com.increase.api.models.exports.ExportListParams
import com.increase.api.models.exports.ExportRetrieveParams

interface ExportServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportServiceAsync

    /** Create an Export */
    suspend fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** Retrieve an Export */
    suspend fun retrieve(
        exportId: String,
        params: ExportRetrieveParams = ExportRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export = retrieve(params.toBuilder().exportId(exportId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** @see [retrieve] */
    suspend fun retrieve(exportId: String, requestOptions: RequestOptions): Export =
        retrieve(exportId, ExportRetrieveParams.none(), requestOptions)

    /** List Exports */
    suspend fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExportListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ExportListPageAsync =
        list(ExportListParams.none(), requestOptions)

    /**
     * A view of [ExportServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExportServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /exports`, but is otherwise the same as
         * [ExportServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /**
         * Returns a raw HTTP response for `get /exports/{export_id}`, but is otherwise the same as
         * [ExportServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            exportId: String,
            params: ExportRetrieveParams = ExportRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export> =
            retrieve(params.toBuilder().exportId(exportId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: ExportRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            exportId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Export> = retrieve(exportId, ExportRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /exports`, but is otherwise the same as
         * [ExportServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: ExportListParams = ExportListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<ExportListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ExportListPageAsync> =
            list(ExportListParams.none(), requestOptions)
    }
}
