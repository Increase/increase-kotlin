// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.AchTransfer
import com.increase.api.models.AchTransferApproveParams
import com.increase.api.models.AchTransferCancelParams
import com.increase.api.models.AchTransferCreateParams
import com.increase.api.models.AchTransferListPage
import com.increase.api.models.AchTransferListParams
import com.increase.api.models.AchTransferRetrieveParams

interface AchTransferService {

    /** Create an ACH Transfer */
    fun create(
        params: AchTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Retrieve an ACH Transfer */
    fun retrieve(
        params: AchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** List ACH Transfers */
    fun list(
        params: AchTransferListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransferListPage

    /** Approves an ACH Transfer in a pending_approval state. */
    fun approve(
        params: AchTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Cancels an ACH Transfer in a pending_approval state. */
    fun cancel(
        params: AchTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer
}
