@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundAchTransferReturn
import com.increase.api.models.InboundAchTransferReturnListPageAsync
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.InboundAchTransferReturnRetrieveParams

interface InboundAchTransferReturnServiceAsync {

    /** Retrieve an Inbound ACH Transfer Return */
    suspend fun retrieve(
        params: InboundAchTransferReturnRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferReturn

    /** List Inbound ACH Transfer Returns */
    suspend fun list(
        params: InboundAchTransferReturnListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundAchTransferReturnListPageAsync
}
