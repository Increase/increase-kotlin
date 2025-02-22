// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationCardAuthorizationCreateParams
import com.increase.api.models.SimulationCardAuthorizationCreateResponse

interface CardAuthorizationServiceAsync {

    /**
     * Simulates a purchase authorization on a [Card](#cards). Depending on the balance available to
     * the card and the `amount` submitted, the authorization activity will result in a
     * [Pending Transaction](#pending-transactions) of type `card_authorization` or a
     * [Declined Transaction](#declined-transactions) of type `card_decline`. You can pass either a
     * Card id or a [Digital Wallet Token](#digital-wallet-tokens) id to simulate the two different
     * ways purchases can be made.
     */
    suspend fun create(
        params: SimulationCardAuthorizationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimulationCardAuthorizationCreateResponse
}
