@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer

    /** Retrieve an Account Transfer */
    suspend fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer

    /** List Account Transfers */
    suspend fun list(
        params: AccountTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransferListPageAsync

    /** Approve an Account Transfer */
    suspend fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer

    /** Cancel an Account Transfer */
    suspend fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountTransfer
}
