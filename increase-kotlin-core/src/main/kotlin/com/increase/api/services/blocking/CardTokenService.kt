// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.cardtokens.CardTokenCapabilities
import com.increase.api.models.cardtokens.CardTokenCapabilitiesParams
import com.increase.api.models.cardtokens.CardTokenListParams
import com.increase.api.models.cardtokens.CardTokenListResponse
import com.increase.api.models.cardtokens.CardTokenRetrieveParams

interface CardTokenService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardTokenService

    /** Retrieve a Card Token */
    fun retrieve(
        cardTokenId: String,
        params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardToken = retrieve(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CardTokenRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardToken

    /** @see retrieve */
    fun retrieve(cardTokenId: String, requestOptions: RequestOptions): CardToken =
        retrieve(cardTokenId, CardTokenRetrieveParams.none(), requestOptions)

    /** List Card Tokens */
    fun list(
        params: CardTokenListParams = CardTokenListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTokenListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): CardTokenListResponse =
        list(CardTokenListParams.none(), requestOptions)

    /**
     * The capabilities of a Card Token describe whether the card can be used for specific
     * operations, such as Card Push Transfers. The capabilities can change over time based on the
     * issuing bank's configuration of the card range.
     */
    fun capabilities(
        cardTokenId: String,
        params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTokenCapabilities =
        capabilities(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

    /** @see capabilities */
    fun capabilities(
        params: CardTokenCapabilitiesParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardTokenCapabilities

    /** @see capabilities */
    fun capabilities(cardTokenId: String, requestOptions: RequestOptions): CardTokenCapabilities =
        capabilities(cardTokenId, CardTokenCapabilitiesParams.none(), requestOptions)

    /** A view of [CardTokenService] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardTokenService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /card_tokens/{card_token_id}`, but is otherwise the
         * same as [CardTokenService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardTokenId: String,
            params: CardTokenRetrieveParams = CardTokenRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardToken> =
            retrieve(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardTokenRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardToken>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardTokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardToken> =
            retrieve(cardTokenId, CardTokenRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_tokens`, but is otherwise the same as
         * [CardTokenService.list].
         */
        @MustBeClosed
        fun list(
            params: CardTokenListParams = CardTokenListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTokenListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardTokenListResponse> =
            list(CardTokenListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_tokens/{card_token_id}/capabilities`, but is
         * otherwise the same as [CardTokenService.capabilities].
         */
        @MustBeClosed
        fun capabilities(
            cardTokenId: String,
            params: CardTokenCapabilitiesParams = CardTokenCapabilitiesParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTokenCapabilities> =
            capabilities(params.toBuilder().cardTokenId(cardTokenId).build(), requestOptions)

        /** @see capabilities */
        @MustBeClosed
        fun capabilities(
            params: CardTokenCapabilitiesParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardTokenCapabilities>

        /** @see capabilities */
        @MustBeClosed
        fun capabilities(
            cardTokenId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardTokenCapabilities> =
            capabilities(cardTokenId, CardTokenCapabilitiesParams.none(), requestOptions)
    }
}
