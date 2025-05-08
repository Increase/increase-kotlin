// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPageAsync
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams

interface DigitalWalletTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Digital Wallet Token */
    suspend fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken =
        retrieve(
            params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** @see [retrieve] */
    suspend fun retrieve(
        digitalWalletTokenId: String,
        requestOptions: RequestOptions,
    ): DigitalWalletToken =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

    /** List Digital Wallet Tokens */
    suspend fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): DigitalWalletTokenListPageAsync =
        list(DigitalWalletTokenListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            digitalWalletTokenId: String,
            params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(
                params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            digitalWalletTokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DigitalWalletTokenListPageAsync> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
