// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationInterestPaymentCreateParams
import com.increase.api.models.Transaction

interface InterestPaymentServiceAsync {

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    suspend fun create(
        params: SimulationInterestPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Transaction
}
