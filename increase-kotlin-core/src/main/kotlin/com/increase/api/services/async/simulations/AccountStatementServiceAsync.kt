// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountStatement
import com.increase.api.models.SimulationAccountStatementCreateParams

interface AccountStatementServiceAsync {

    /**
     * Simulates an [Account Statement](#account-statements) being created for an account. In
     * production, Account Statements are generated once per month.
     */
    suspend fun create(
        params: SimulationAccountStatementCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountStatement
}
