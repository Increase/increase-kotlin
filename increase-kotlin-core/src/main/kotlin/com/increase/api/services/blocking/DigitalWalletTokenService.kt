// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListPage
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams

interface DigitalWalletTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DigitalWalletTokenService

    /** Retrieve a Digital Wallet Token */
    fun retrieve(
        digitalWalletTokenId: String,
        params: DigitalWalletTokenRetrieveParams = DigitalWalletTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken =
        retrieve(
            params.toBuilder().digitalWalletTokenId(digitalWalletTokenId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletToken

    /** @see [retrieve] */
    fun retrieve(digitalWalletTokenId: String, requestOptions: RequestOptions): DigitalWalletToken =
        retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

    /** List Digital Wallet Tokens */
    fun list(
        params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DigitalWalletTokenListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DigitalWalletTokenListPage =
        list(DigitalWalletTokenListParams.none(), requestOptions)

    /**
     * A view of [DigitalWalletTokenService] that provides access to raw HTTP responses for each
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
        ): DigitalWalletTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens/{digital_wallet_token_id}`,
         * but is otherwise the same as [DigitalWalletTokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletToken>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            digitalWalletTokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletToken> =
            retrieve(digitalWalletTokenId, DigitalWalletTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /digital_wallet_tokens`, but is otherwise the same
         * as [DigitalWalletTokenService.list].
         */
        @MustBeClosed
        fun list(
            params: DigitalWalletTokenListParams = DigitalWalletTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DigitalWalletTokenListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DigitalWalletTokenListPage> =
            list(DigitalWalletTokenListParams.none(), requestOptions)
    }
}
