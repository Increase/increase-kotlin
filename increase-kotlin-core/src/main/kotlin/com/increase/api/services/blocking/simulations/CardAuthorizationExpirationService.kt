// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams

interface CardAuthorizationExpirationService {

    /** Simulates expiring a Card Authorization immediately. */
    fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment
}
