// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundInternationalAchTransfer
import com.increase.api.models.SimulationInboundInternationalAchTransferCreateParams

interface InboundInternationalAchTransferServiceAsync {

    /**
     * Simulates an inbound international ACH transfer to your account. This imitates initiating a
     * transfer to an Increase account from a different financial institution. The transfer may be
     * either a credit or a debit depending on if the `amount` is positive or negative. The result
     * of calling this API will contain the created transfer. .
     */
    suspend fun create(
        params: SimulationInboundInternationalAchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundInternationalAchTransfer
}
