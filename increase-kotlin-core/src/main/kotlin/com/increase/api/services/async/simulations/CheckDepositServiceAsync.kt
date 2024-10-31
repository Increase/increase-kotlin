// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams

interface CheckDepositServiceAsync {

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    suspend fun reject(
        params: SimulationCheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    suspend fun return_(
        params: SimulationCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    suspend fun submit(
        params: SimulationCheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit
}
