@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountStatement
import com.increase.api.models.SimulationsAccountStatementCreateParams

interface AccountStatementServiceAsync {

    /**
     * Simulates an [Account Statement](#account-statements) being created for an account. In
     * production, Account Statements are generated once per month.
     */
    suspend fun create(
        params: SimulationsAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountStatement
}
