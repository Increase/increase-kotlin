// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import com.increase.api.models.SimulationInboundFundsHoldReleaseResponse

interface InboundFundsHoldServiceAsync {

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    suspend fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): SimulationInboundFundsHoldReleaseResponse
}
