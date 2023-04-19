@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BalanceLookupLookupParams
import com.increase.api.models.BalanceLookupLookupResponse

interface BalanceLookupServiceAsync {

    /** Look up the balance for an Account */
    suspend fun lookup(
        params: BalanceLookupLookupParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BalanceLookupLookupResponse
}
