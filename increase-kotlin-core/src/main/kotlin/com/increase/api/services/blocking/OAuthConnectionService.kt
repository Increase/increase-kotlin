// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionListResponse
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams

interface OAuthConnectionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OAuthConnectionService

    /** Retrieve an OAuth Connection */
    fun retrieve(
        oauthConnectionId: String,
        params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection =
        retrieve(params.toBuilder().oauthConnectionId(oauthConnectionId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection

    /** @see retrieve */
    fun retrieve(oauthConnectionId: String, requestOptions: RequestOptions): OAuthConnection =
        retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

    /** List OAuth Connections */
    fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnectionListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): OAuthConnectionListResponse =
        list(OAuthConnectionListParams.none(), requestOptions)

    /**
     * A view of [OAuthConnectionService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OAuthConnectionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_connections/{oauth_connection_id}`, but is
         * otherwise the same as [OAuthConnectionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            oauthConnectionId: String,
            params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnection> =
            retrieve(
                params.toBuilder().oauthConnectionId(oauthConnectionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnection>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            oauthConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnection> =
            retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionService.list].
         */
        @MustBeClosed
        fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnectionListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<OAuthConnectionListResponse> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
