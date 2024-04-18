// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPageAsync
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams

interface InboundCheckDepositServiceAsync {

    /** Retrieve an Inbound Check Deposit */
    suspend fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundCheckDeposit

    /** List Inbound Check Deposits */
    suspend fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundCheckDepositListPageAsync

    /** Decline an Inbound Check Deposit */
    suspend fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): InboundCheckDeposit
}
