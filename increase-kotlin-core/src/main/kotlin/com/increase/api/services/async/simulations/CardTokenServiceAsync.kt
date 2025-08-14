// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardtokens.CardToken
import com.increase.api.models.simulations.cardtokens.CardTokenCreateParams

interface CardTokenServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardTokenServiceAsync

    /** Simulates tokenizing a card in the sandbox environment. */
    suspend fun create(
        params: CardTokenCreateParams = CardTokenCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardToken

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): CardToken =
        create(CardTokenCreateParams.none(), requestOptions)

    /**
     * A view of [CardTokenServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardTokenServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_tokens`, but is otherwise the
         * same as [CardTokenServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardTokenCreateParams = CardTokenCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardToken>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<CardToken> =
            create(CardTokenCreateParams.none(), requestOptions)
    }
}
