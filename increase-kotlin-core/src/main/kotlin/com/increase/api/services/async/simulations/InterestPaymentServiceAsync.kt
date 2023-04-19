@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InterestPaymentSimulationResult
import com.increase.api.models.SimulationsInterestPaymentCreateParams

interface InterestPaymentServiceAsync {

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    suspend fun create(
        params: SimulationsInterestPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InterestPaymentSimulationResult
}
