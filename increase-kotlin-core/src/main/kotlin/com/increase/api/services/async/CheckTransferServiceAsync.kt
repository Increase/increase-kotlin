@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CheckTransfer
import com.increase.api.models.CheckTransferApproveParams
import com.increase.api.models.CheckTransferCancelParams
import com.increase.api.models.CheckTransferCreateParams
import com.increase.api.models.CheckTransferListPageAsync
import com.increase.api.models.CheckTransferListParams
import com.increase.api.models.CheckTransferRetrieveParams
import com.increase.api.models.CheckTransferStopPaymentParams

interface CheckTransferServiceAsync {

    /** Create a Check Transfer */
    suspend fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /** Retrieve a Check Transfer */
    suspend fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /** List Check Transfers */
    suspend fun list(
        params: CheckTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransferListPageAsync

    /** Approve a Check Transfer */
    suspend fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /** Cancel a pending Check Transfer */
    suspend fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer

    /** Request a stop payment on a Check Transfer */
    suspend fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CheckTransfer
}
