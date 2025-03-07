// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.OAuthApplication
import com.increase.api.models.OAuthApplicationListPageAsync
import com.increase.api.models.OAuthApplicationListParams
import com.increase.api.models.OAuthApplicationRetrieveParams

interface OAuthApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Application */
    suspend fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication

    /** List OAuth Applications */
    suspend fun list(
        params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplicationListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): OAuthApplicationListPageAsync =
        list(OAuthApplicationListParams.none(), requestOptions)

    /**
     * A view of [OAuthApplicationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /oauth_applications/{oauth_application_id}`, but is
         * otherwise the same as [OAuthApplicationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplication>

        /**
         * Returns a raw HTTP response for `get /oauth_applications`, but is otherwise the same as
         * [OAuthApplicationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: OAuthApplicationListParams = OAuthApplicationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplicationListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<OAuthApplicationListPageAsync> =
            list(OAuthApplicationListParams.none(), requestOptions)
    }
}
