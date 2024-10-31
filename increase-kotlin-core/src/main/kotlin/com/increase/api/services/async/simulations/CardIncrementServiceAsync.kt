// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardIncrementCreateParams

interface CardIncrementServiceAsync {

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    suspend fun create(
        params: SimulationCardIncrementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment
}
