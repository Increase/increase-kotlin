// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateResponse

interface DigitalWalletTokenRequestServiceAsync {

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    suspend fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SimulationDigitalWalletTokenRequestCreateResponse
}
