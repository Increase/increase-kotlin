// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateParams
import com.increase.api.models.simulations.cardauthorizations.CardAuthorizationCreateResponse

interface CardAuthorizationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates a purchase authorization on a [Card](#cards). Depending on the balance available to
     * the card and the `amount` submitted, the authorization activity will result in a
     * [Pending Transaction](#pending-transactions) of type `card_authorization` or a
     * [Declined Transaction](#declined-transactions) of type `card_decline`. You can pass either a
     * Card id or a [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different
     * ways purchases can be made.
     */
    suspend fun create(
        params: CardAuthorizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardAuthorizationCreateResponse

    /**
     * A view of [CardAuthorizationServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_authorizations`, but is otherwise
         * the same as [CardAuthorizationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardAuthorizationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardAuthorizationCreateResponse>
    }
}
