// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListPageAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams

interface OAuthConnectionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OAuthConnectionServiceAsync

    /** Retrieve an OAuth Connection */
    suspend fun retrieve(
        oauthConnectionId: String,
        params: OAuthConnectionRetrieveParams = OAuthConnectionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection =
        retrieve(params.toBuilder().oauthConnectionId(oauthConnectionId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnection

    /** @see retrieve */
    suspend fun retrieve(
        oauthConnectionId: String,
        requestOptions: RequestOptions,
    ): OAuthConnection =
        retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

    /** List OAuth Connections */
    suspend fun list(
        params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthConnectionListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): OAuthConnectionListPageAsync =
        list(OAuthConnectionListParams.none(), requestOptions)

    /**
     * A view of [OAuthConnectionServiceAsync] that provides access to raw HTTP responses for each
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
        ): OAuthConnectionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /oauth_connections/{oauth_connection_id}`, but is
         * otherwise the same as [OAuthConnectionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
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
        suspend fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnection>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            oauthConnectionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnection> =
            retrieve(oauthConnectionId, OAuthConnectionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /oauth_connections`, but is otherwise the same as
         * [OAuthConnectionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: OAuthConnectionListParams = OAuthConnectionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthConnectionListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<OAuthConnectionListPageAsync> =
            list(OAuthConnectionListParams.none(), requestOptions)
    }
}
