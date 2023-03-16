@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.SimulationsInboundWireDrawdownRequestCreateParams

interface InboundWireDrawdownRequestService {

    /**
     * Simulates the receival of an [Inbound Wire Drawdown Request](#inbound-wire-drawdown-requests)
     * .
     */
    fun create(
        params: SimulationsInboundWireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequest
}
