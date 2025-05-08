// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.files.File
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListPageAsync
import com.increase.api.models.files.FileListParams
import com.increase.api.models.files.FileRetrieveParams

interface FileServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * To upload a file to Increase, you'll need to send a request of Content-Type
     * `multipart/form-data`. The request should contain the file you would like to upload, as well
     * as the parameters for creating a file.
     */
    suspend fun create(
        params: FileCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** Retrieve a File */
    suspend fun retrieve(
        fileId: String,
        params: FileRetrieveParams = FileRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File = retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: FileRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): File

    /** @see [retrieve] */
    suspend fun retrieve(fileId: String, requestOptions: RequestOptions): File =
        retrieve(fileId, FileRetrieveParams.none(), requestOptions)

    /** List Files */
    suspend fun list(
        params: FileListParams = FileListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): FileListPageAsync =
        list(FileListParams.none(), requestOptions)

    /** A view of [FileServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /files`, but is otherwise the same as
         * [FileServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FileCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /**
         * Returns a raw HTTP response for `get /files/{file_id}`, but is otherwise the same as
         * [FileServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            fileId: String,
            params: FileRetrieveParams = FileRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File> =
            retrieve(params.toBuilder().fileId(fileId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: FileRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<File>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            fileId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<File> = retrieve(fileId, FileRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /files`, but is otherwise the same as
         * [FileServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FileListParams = FileListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<FileListPageAsync> =
            list(FileListParams.none(), requestOptions)
    }
}
