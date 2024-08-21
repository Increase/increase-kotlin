// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.SimulationInboundWireTransferCreateParams

interface InboundWireTransferServiceAsync {

    /** Simulates an inbound Wire Transfer to your account. */
    suspend fun create(
        params: SimulationInboundWireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireTransfer
}
