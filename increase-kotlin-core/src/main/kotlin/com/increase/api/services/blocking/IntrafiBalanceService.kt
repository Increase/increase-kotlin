// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceRetrieveParams

interface IntrafiBalanceService {

    /** Get IntraFi balances by bank */
    fun retrieve(
        params: IntrafiBalanceRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiBalance
}
