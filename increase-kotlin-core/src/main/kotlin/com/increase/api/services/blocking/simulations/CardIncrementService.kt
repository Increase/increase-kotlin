// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardIncrementCreateParams

interface CardIncrementService {

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization can be
     * incremented multiple times.
     */
    fun create(
        params: SimulationCardIncrementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment
}
