@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.SimulationInboundWireDrawdownRequestCreateParams

interface InboundWireDrawdownRequestServiceAsync {

    /**
     * Simulates the receival of an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests)
     * .
     */
    suspend fun create(
        params: SimulationInboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequest
}
