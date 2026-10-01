// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequest
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListPageAsync
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestListParams
import com.increase.api.models.digitalwallettokenrequests.DigitalWalletTokenRequestRetrieveParams

interface DigitalWalletTokenRequestServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): DigitalWalletTokenRequestServiceAsync

    /** Retrieve a Digital Wallet Token Request */
    suspend fun retrieve(
        digitalWalletTokenRequestId: String,
        params: DigitalWalletTokenRequestRetrieveParams =
            DigitalWalletTokenRequestRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequest =
        retrieve(
            params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: DigitalWalletTokenRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequest

    /** @see retrieve */
    suspend fun retrieve(
        digitalWalletTokenRequestId: String,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenRequest =
        retrieve(
            digitalWalletTokenRequestId,
            DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions,
        )

    /** List Digital Wallet Token Requests */
    suspend fun list(
        params: DigitalWalletTokenRequestListParams = DigitalWalletTokenRequestListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenRequestListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DigitalWalletTokenRequestListPageAsync =
        list(DigitalWalletTokenRequestListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenRequestServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DigitalWalletTokenRequestServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /digital_wallet_token_requests/{digital_wallet_token_request_id}`, but is otherwise the
         * same as [DigitalWalletTokenRequestServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            digitalWalletTokenRequestId: String,
            params: DigitalWalletTokenRequestRetrieveParams =
                DigitalWalletTokenRequestRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(
                params.toBuilder().digitalWalletTokenRequestId(digitalWalletTokenRequestId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DigitalWalletTokenRequestRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequest>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            digitalWalletTokenRequestId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenRequest> =
            retrieve(
                digitalWalletTokenRequestId,
                DigitalWalletTokenRequestRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /digital_wallet_token_requests`, but is otherwise
         * the same as [DigitalWalletTokenRequestServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DigitalWalletTokenRequestListParams =
                DigitalWalletTokenRequestListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenRequestListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DigitalWalletTokenRequestListPageAsync> =
            list(DigitalWalletTokenRequestListParams.none(), requestOptions)
    }
}
