// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountTransfer
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferListPageAsync
import com.increase.api.models.AccountTransferListParams
import com.increase.api.models.AccountTransferRetrieveParams

interface AccountTransferServiceAsync {

    /** Create an Account Transfer */
    suspend fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** Retrieve an Account Transfer */
    suspend fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** List Account Transfers */
    suspend fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferListPageAsync

    /** List Account Transfers */
    suspend fun list(requestOptions: RequestOptions): AccountTransferListPageAsync =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    suspend fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** Cancel an Account Transfer */
    suspend fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer
}
