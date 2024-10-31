// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams

interface CardAuthorizationExpirationServiceAsync {

    /** Simulates expiring a Card Authorization immediately. */
    suspend fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment
}
