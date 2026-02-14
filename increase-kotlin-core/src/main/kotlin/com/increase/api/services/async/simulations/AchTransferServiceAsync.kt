// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
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
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AchTransferServiceAsync

    /**
     * Simulates the acknowledgement of an [ACH Transfer](#ach-transfers) by the Federal Reserve.
     * This transfer must first have a `status` of `submitted`. In production, the Federal Reserve
     * generally acknowledges submitted ACH files within 30 minutes. Since sandbox ACH Transfers are
     * not submitted to the Federal Reserve, this endpoint allows you to skip that delay and add the
     * acknowledgement subresource to the ACH Transfer.
     */
    suspend fun acknowledge(
        achTransferId: String,
        params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer =
        acknowledge(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see acknowledge */
    suspend fun acknowledge(
        params: AchTransferAcknowledgeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see acknowledge */
    suspend fun acknowledge(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        acknowledge(achTransferId, AchTransferAcknowledgeParams.none(), requestOptions)

    /** Simulates receiving a Notification of Change for an [ACH Transfer](#ach-transfers). */
    suspend fun createNotificationOfChange(
        achTransferId: String,
        params: AchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer =
        createNotificationOfChange(
            params.toBuilder().achTransferId(achTransferId).build(),
            requestOptions,
        )

    /** @see createNotificationOfChange */
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
        achTransferId: String,
        params: AchTransferReturnParams = AchTransferReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer =
        return_(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see return_ */
    suspend fun return_(
        params: AchTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see return_ */
    suspend fun return_(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        return_(achTransferId, AchTransferReturnParams.none(), requestOptions)

    /**
     * Simulates the settlement of an [ACH Transfer](#ach-transfers) by the Federal Reserve. This
     * transfer must first have a `status` of `pending_submission` or `submitted`. For convenience,
     * if the transfer is in `status`: `pending_submission`, the simulation will also submit the
     * transfer. Without this simulation the transfer will eventually settle on its own following
     * the same Federal Reserve timeline as in production. Additionally, you can specify the
     * behavior of the inbound funds hold that is created when the ACH Transfer is settled. If no
     * behavior is specified, the inbound funds hold will be released immediately in order for the
     * funds to be available for use.
     */
    suspend fun settle(
        achTransferId: String,
        params: AchTransferSettleParams = AchTransferSettleParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer = settle(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see settle */
    suspend fun settle(
        params: AchTransferSettleParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see settle */
    suspend fun settle(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        settle(achTransferId, AchTransferSettleParams.none(), requestOptions)

    /**
     * Simulates the submission of an [ACH Transfer](#ach-transfers) to the Federal Reserve. This
     * transfer must first have a `status` of `pending_approval` or `pending_submission`. In
     * production, Increase submits ACH Transfers to the Federal Reserve three times per day on
     * weekdays. Since sandbox ACH Transfers are not submitted to the Federal Reserve, this endpoint
     * allows you to skip that delay and transition the ACH Transfer to a status of `submitted`.
     */
    suspend fun submit(
        achTransferId: String,
        params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer = submit(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

    /** @see submit */
    suspend fun submit(
        params: AchTransferSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AchTransfer

    /** @see submit */
    suspend fun submit(achTransferId: String, requestOptions: RequestOptions): AchTransfer =
        submit(achTransferId, AchTransferSubmitParams.none(), requestOptions)

    /**
     * A view of [AchTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AchTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/acknowledge`, but is otherwise the same as
         * [AchTransferServiceAsync.acknowledge].
         */
        @MustBeClosed
        suspend fun acknowledge(
            achTransferId: String,
            params: AchTransferAcknowledgeParams = AchTransferAcknowledgeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            acknowledge(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see acknowledge */
        @MustBeClosed
        suspend fun acknowledge(
            params: AchTransferAcknowledgeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see acknowledge */
        @MustBeClosed
        suspend fun acknowledge(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            acknowledge(achTransferId, AchTransferAcknowledgeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [AchTransferServiceAsync.createNotificationOfChange].
         */
        @MustBeClosed
        suspend fun createNotificationOfChange(
            achTransferId: String,
            params: AchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            createNotificationOfChange(
                params.toBuilder().achTransferId(achTransferId).build(),
                requestOptions,
            )

        /** @see createNotificationOfChange */
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
            achTransferId: String,
            params: AchTransferReturnParams = AchTransferReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            return_(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see return_ */
        @MustBeClosed
        suspend fun return_(
            params: AchTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see return_ */
        @MustBeClosed
        suspend fun return_(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            return_(achTransferId, AchTransferReturnParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/settle`, but is otherwise the same as
         * [AchTransferServiceAsync.settle].
         */
        @MustBeClosed
        suspend fun settle(
            achTransferId: String,
            params: AchTransferSettleParams = AchTransferSettleParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            settle(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see settle */
        @MustBeClosed
        suspend fun settle(
            params: AchTransferSettleParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see settle */
        @MustBeClosed
        suspend fun settle(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            settle(achTransferId, AchTransferSettleParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/ach_transfers/{ach_transfer_id}/submit`, but is otherwise the same as
         * [AchTransferServiceAsync.submit].
         */
        @MustBeClosed
        suspend fun submit(
            achTransferId: String,
            params: AchTransferSubmitParams = AchTransferSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer> =
            submit(params.toBuilder().achTransferId(achTransferId).build(), requestOptions)

        /** @see submit */
        @MustBeClosed
        suspend fun submit(
            params: AchTransferSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AchTransfer>

        /** @see submit */
        @MustBeClosed
        suspend fun submit(
            achTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchTransfer> =
            submit(achTransferId, AchTransferSubmitParams.none(), requestOptions)
    }
}
