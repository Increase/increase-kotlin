// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.SimulationInboundWireTransferCreateParams

interface InboundWireTransferServiceAsync {

    /** Simulates an [Inbound Wire Transfer](#inbound-wire-transfers) to your account. */
    suspend fun create(
        params: SimulationInboundWireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireTransfer
}
