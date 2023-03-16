@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.WireDrawdownRequest
import com.increase.api.models.WireDrawdownRequestCreateParams
import com.increase.api.models.WireDrawdownRequestListPageAsync
import com.increase.api.models.WireDrawdownRequestListParams
import com.increase.api.models.WireDrawdownRequestRetrieveParams

interface WireDrawdownRequestServiceAsync {

    /** Create a Wire Drawdown Request */
    suspend fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireDrawdownRequest

    /** Retrieve a Wire Drawdown Request */
    suspend fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireDrawdownRequest

    /** List Wire Drawdown Requests */
    suspend fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): WireDrawdownRequestListPageAsync
}
