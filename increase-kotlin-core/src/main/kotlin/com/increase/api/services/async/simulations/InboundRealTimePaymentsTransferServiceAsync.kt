// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.SimulationInboundRealTimePaymentsTransferCreateParams

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Simulates an [Inbound Real-Time Payments Transfer](#inbound-real-time-payments-transfers) to
     * your account. Real-Time Payments are a beta feature.
     */
    suspend fun create(
        params: SimulationInboundRealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer
}
