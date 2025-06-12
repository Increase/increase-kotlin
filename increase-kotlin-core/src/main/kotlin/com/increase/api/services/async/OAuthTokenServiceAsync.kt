// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.oauthtokens.OAuthToken
import com.increase.api.models.oauthtokens.OAuthTokenCreateParams

interface OAuthTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OAuthTokenServiceAsync

    /** Create an OAuth Token */
    suspend fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): OAuthToken

    /**
     * A view of [OAuthTokenServiceAsync] that provides access to raw HTTP responses for each
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
        ): OAuthTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /oauth/tokens`, but is otherwise the same as
         * [OAuthTokenServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: OAuthTokenCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<OAuthToken>
    }
}
