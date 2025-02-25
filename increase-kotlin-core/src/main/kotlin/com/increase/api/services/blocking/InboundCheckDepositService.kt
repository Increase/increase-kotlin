// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams

interface InboundCheckDepositService {

    /** Retrieve an Inbound Check Deposit */
    fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** List Inbound Check Deposits */
    fun list(
        params: InboundCheckDepositListParams = InboundCheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDepositListPage

    /** List Inbound Check Deposits */
    fun list(requestOptions: RequestOptions): InboundCheckDepositListPage =
        list(InboundCheckDepositListParams.none(), requestOptions)

    /** Decline an Inbound Check Deposit */
    fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** Return an Inbound Check Deposit */
    fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit
}
