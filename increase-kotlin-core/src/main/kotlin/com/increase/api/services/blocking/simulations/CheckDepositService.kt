@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationsCheckDepositRejectParams
import com.increase.api.models.SimulationsCheckDepositReturnParams
import com.increase.api.models.SimulationsCheckDepositSubmitParams

interface CheckDepositService {

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    fun reject(
        params: SimulationsCheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    fun return_(
        params: SimulationsCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    fun submit(
        params: SimulationsCheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckDeposit
}
