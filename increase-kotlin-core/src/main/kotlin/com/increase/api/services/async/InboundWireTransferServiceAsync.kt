// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundWireTransfer
import com.increase.api.models.InboundWireTransferListPageAsync
import com.increase.api.models.InboundWireTransferListParams
import com.increase.api.models.InboundWireTransferRetrieveParams

interface InboundWireTransferServiceAsync {

    /** Retrieve an Inbound Wire Transfer */
    suspend fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireTransfer

    /** List Inbound Wire Transfers */
    suspend fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundWireTransferListPageAsync
}
