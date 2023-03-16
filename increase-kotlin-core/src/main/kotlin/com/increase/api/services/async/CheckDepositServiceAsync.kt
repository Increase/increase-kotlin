@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositListPageAsync
import com.increase.api.models.CheckDepositListParams
import com.increase.api.models.CheckDepositRetrieveParams

interface CheckDepositServiceAsync {

    /** Create a Check Deposit */
    suspend fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /** Retrieve a Check Deposit */
    suspend fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /** List Check Deposits */
    suspend fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDepositListPageAsync
}
