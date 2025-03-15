// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams
import com.increase.api.models.filelinks.FileLinkListPageAsync
import com.increase.api.models.filelinks.FileLinkListParams
import com.increase.api.models.filelinks.FileLinkRetrieveParams

interface FileLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a File Link */
    suspend fun create(
        params: FileLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileLink

    /** Retrieve a File Link */
    suspend fun retrieve(
        params: FileLinkRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileLink

    /** List File Links */
    suspend fun list(
        params: FileLinkListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileLinkListPageAsync

    /**
     * A view of [FileLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /file_links`, but is otherwise the same as
         * [FileLinkServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FileLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileLink>

        /**
         * Returns a raw HTTP response for `get /file_links/{file_link_id}`, but is otherwise the
         * same as [FileLinkServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: FileLinkRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileLink>

        /**
         * Returns a raw HTTP response for `get /file_links`, but is otherwise the same as
         * [FileLinkServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FileLinkListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileLinkListPageAsync>
    }
}
