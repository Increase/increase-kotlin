@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPageAsync
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams

interface AchTransferServiceAsync {

    /** Create an ACH Transfer */
    suspend fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchTransfer

    /** Retrieve an ACH Transfer */
    suspend fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchTransfer

    /** List ACH Transfers */
    suspend fun list(
        params: AchTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchTransferListPageAsync

    /** Approves an ACH Transfer in a pending_approval state. */
    suspend fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchTransfer

    /** Cancels an ACH Transfer in a pending_approval state. */
    suspend fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AchTransfer
}
