// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.achtransfers.AchTransfer
import com.increase.api.models.simulations.achtransfers.AchTransferAcknowledgeParams
import com.increase.api.models.simulations.achtransfers.AchTransferCreateNotificationOfChangeParams
import com.increase.api.models.simulations.achtransfers.AchTransferReturnParams
import com.increase.api.models.simulations.achtransfers.AchTransferSettleParams
import com.increase.api.models.simulations.achtransfers.AchTransferSubmitParams

interface AchTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the acknowledgement of an [ACH Transfer](#ach-transfers) by the Federal Reserve.
     * This transfer must first have a `status` of `submitted` . In production, the Federal Reserve
     * generally acknowledges submitted ACH files within 30 minutes. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that delay and add the
     * acknowledgment subresource to the ACH Transfer.
     */
    suspend fun acknowledge(
        params: AchTransferAcknowledgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
    suspend fun createNotificationOfChange(
        params: AchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /**
     * Simulates the return of an [ACH Transfer](#ach-transfers) by the Federal Reserve due to an
     * error condition. This will also create a Transaction to account for the returned funds. This
     * transfer must first have a `status` of `submitted`.
     */
    suspend fun return_(
        params: AchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /**
     * Simulates the settlement of an [ACH Transfer](#ach-transfers) by the Federal Reserve. This
     * transfer must first have a `status` of `submitted`. Without this simulation the transfer will
     * eventually settle on its own following the same Federal Reserve timeline as in production.
     */
    suspend fun settle(
        params: AchTransferSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_submission`. In
     * production, Increase submits ACH Transfers to the Federal Reserve three times per day on
     * weekdays. Since sandbox ACH Transfers are not submitted to the Federal Reserve, this endpoint
     * allows you to skip that delay and transition the ACH Transfer to a status of `submitted`.
     */
    suspend fun submit(
        params: AchTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/acknowledge`, but is otherwise the same as
         * [AchTransferServiceAsync.acknowledge].
         */
        @MustBeClosed
        suspend fun acknowledge(
            params: AchTransferAcknowledgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [AchTransferServiceAsync.createNotificationOfChange].
         */
        @MustBeClosed
        suspend fun createNotificationOfChange(
            params: AchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/return`, but is otherwise the same as
         * [AchTransferServiceAsync.return_].
         */
        @MustBeClosed
        suspend fun return_(
            params: AchTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/settle`, but is otherwise the same as
         * [AchTransferServiceAsync.settle].
         */
        @MustBeClosed
        suspend fun settle(
            params: AchTransferSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/submit`, but is otherwise the same as
         * [AchTransferServiceAsync.submit].
         */
        @MustBeClosed
        suspend fun submit(
            params: AchTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>
    }
}
