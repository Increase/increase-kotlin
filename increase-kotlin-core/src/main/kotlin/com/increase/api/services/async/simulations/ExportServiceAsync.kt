// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.exports.Export
import com.increase.api.models.simulations.exports.ExportCreateParams

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

    /**
     * Many exports are created by you via POST /exports or in the Dashboard. Some exports are
     * created automatically by Increase. For example, tax documents are published once a year. In
     * sandbox, you can trigger the arrival of an export that would normally only be created
     * automatically via this simulation.
     */
    suspend fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

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
         * Returns a raw HTTP response for `post /simulations/exports`, but is otherwise the same as
         * [ExportServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Export>
    }
}
