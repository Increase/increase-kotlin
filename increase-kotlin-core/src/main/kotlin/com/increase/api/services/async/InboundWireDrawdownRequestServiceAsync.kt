// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams

interface InboundWireDrawdownRequestServiceAsync {

    /** Retrieve an Inbound Wire Drawdown Request */
    suspend fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequest

    /** List Inbound Wire Drawdown Requests */
    suspend fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireDrawdownRequestListPageAsync
}
