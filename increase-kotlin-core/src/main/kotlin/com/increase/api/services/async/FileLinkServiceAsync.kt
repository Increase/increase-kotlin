// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.filelinks.FileLink
import com.increase.api.models.filelinks.FileLinkCreateParams

interface FileLinkServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FileLinkServiceAsync

    /** Create a File Link */
    suspend fun create(
        params: FileLinkCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FileLink

    /**
     * A view of [FileLinkServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FileLinkServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /file_links`, but is otherwise the same as
         * [FileLinkServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FileLinkCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FileLink>
    }
}
