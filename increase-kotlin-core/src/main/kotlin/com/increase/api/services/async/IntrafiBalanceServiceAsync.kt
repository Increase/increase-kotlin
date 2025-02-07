// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceIntrafiBalanceParams

interface IntrafiBalanceServiceAsync {

    /** Get IntraFi balances by bank */
    suspend fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): IntrafiBalance
}
