// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardFuelConfirmationCreateParams

interface CardFuelConfirmationServiceAsync {

    /**
     * Simulates the fuel confirmation of an authorization by a card acquirer. This happens
     * asynchronously right after a fuel pump transaction is completed. A fuel confirmation can only
     * happen once per authorization.
     */
    suspend fun create(
        params: SimulationCardFuelConfirmationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment
}
