// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundMailItem
import com.increase.api.models.InboundMailItemListPageAsync
import com.increase.api.models.InboundMailItemListParams
import com.increase.api.models.InboundMailItemRetrieveParams

interface InboundMailItemServiceAsync {

    /** Retrieve an Inbound Mail Item */
    suspend fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItem

    /** List Inbound Mail Items */
    suspend fun list(
        params: InboundMailItemListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundMailItemListPageAsync
}
