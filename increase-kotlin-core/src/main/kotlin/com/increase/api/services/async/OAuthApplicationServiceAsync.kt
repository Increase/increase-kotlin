// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListPageAsync
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams

interface OAuthApplicationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an OAuth Application */
    suspend fun retrieve(
        oauthApplicationId: String,
        params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication =
        retrieve(params.toBuilder().oauthApplicationId(oauthApplicationId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthApplication

    /** @see [retrieve] */
    suspend fun retrieve(
        oauthApplicationId: String,
        requestOptions: RequestOptions,
    ): OAuthApplication =
        retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

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
            oauthApplicationId: String,
            params: OAuthApplicationRetrieveParams = OAuthApplicationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplication> =
            retrieve(
                params.toBuilder().oauthApplicationId(oauthApplicationId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthApplication>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            oauthApplicationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthApplication> =
            retrieve(oauthApplicationId, OAuthApplicationRetrieveParams.none(), requestOptions)

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
