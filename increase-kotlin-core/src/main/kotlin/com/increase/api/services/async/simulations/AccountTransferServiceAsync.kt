@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountTransfer
import com.increase.api.models.SimulationsAccountTransferCompleteParams

interface AccountTransferServiceAsync {

    /**
     * If your account is configured to require approval for each transfer, this endpoint simulates
     * the approval of an [Account Transfer](#account-transfers). You can also approve sandbox
     * Account Transfers in the dashboard. This transfer must first have a `status` of
     * `pending_approval`.
     */
    suspend fun complete(
        params: SimulationsAccountTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer
}
