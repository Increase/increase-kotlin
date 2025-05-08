// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListPage
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferRetrieveParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams

interface InboundAchTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound ACH Transfer */
    fun retrieve(
        inboundAchTransferId: String,
        params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer =
        retrieve(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** @see [retrieve] */
    fun retrieve(inboundAchTransferId: String, requestOptions: RequestOptions): InboundAchTransfer =
        retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none(), requestOptions)

    /** List Inbound ACH Transfers */
    fun list(
        params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundAchTransferListPage =
        list(InboundAchTransferListParams.none(), requestOptions)

    /** Create a notification of change for an Inbound ACH Transfer */
    fun createNotificationOfChange(
        inboundAchTransferId: String,
        params: InboundAchTransferCreateNotificationOfChangeParams =
            InboundAchTransferCreateNotificationOfChangeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer =
        createNotificationOfChange(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see [createNotificationOfChange] */
    fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** @see [createNotificationOfChange] */
    fun createNotificationOfChange(
        inboundAchTransferId: String,
        requestOptions: RequestOptions,
    ): InboundAchTransfer =
        createNotificationOfChange(
            inboundAchTransferId,
            InboundAchTransferCreateNotificationOfChangeParams.none(),
            requestOptions,
        )

    /** Decline an Inbound ACH Transfer */
    fun decline(
        inboundAchTransferId: String,
        params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer =
        decline(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see [decline] */
    fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /** @see [decline] */
    fun decline(inboundAchTransferId: String, requestOptions: RequestOptions): InboundAchTransfer =
        decline(inboundAchTransferId, InboundAchTransferDeclineParams.none(), requestOptions)

    /** Return an Inbound ACH Transfer */
    fun transferReturn(
        inboundAchTransferId: String,
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer =
        transferReturn(
            params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
            requestOptions,
        )

    /** @see [transferReturn] */
    fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundAchTransfer

    /**
     * A view of [InboundAchTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers/{inbound_ach_transfer_id}`,
         * but is otherwise the same as [InboundAchTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            inboundAchTransferId: String,
            params: InboundAchTransferRetrieveParams = InboundAchTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer> =
            retrieve(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> =
            retrieve(inboundAchTransferId, InboundAchTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise the same
         * as [InboundAchTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: InboundAchTransferListParams = InboundAchTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundAchTransferListPage> =
            list(InboundAchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change`, but is
         * otherwise the same as [InboundAchTransferService.createNotificationOfChange].
         */
        @MustBeClosed
        fun createNotificationOfChange(
            inboundAchTransferId: String,
            params: InboundAchTransferCreateNotificationOfChangeParams =
                InboundAchTransferCreateNotificationOfChangeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer> =
            createNotificationOfChange(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see [createNotificationOfChange] */
        @MustBeClosed
        fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /** @see [createNotificationOfChange] */
        @MustBeClosed
        fun createNotificationOfChange(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> =
            createNotificationOfChange(
                inboundAchTransferId,
                InboundAchTransferCreateNotificationOfChangeParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/decline`, but is otherwise the same as
         * [InboundAchTransferService.decline].
         */
        @MustBeClosed
        fun decline(
            inboundAchTransferId: String,
            params: InboundAchTransferDeclineParams = InboundAchTransferDeclineParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer> =
            decline(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see [decline] */
        @MustBeClosed
        fun decline(
            params: InboundAchTransferDeclineParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>

        /** @see [decline] */
        @MustBeClosed
        fun decline(
            inboundAchTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> =
            decline(inboundAchTransferId, InboundAchTransferDeclineParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return`, but is otherwise the
         * same as [InboundAchTransferService.transferReturn].
         */
        @MustBeClosed
        fun transferReturn(
            inboundAchTransferId: String,
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer> =
            transferReturn(
                params.toBuilder().inboundAchTransferId(inboundAchTransferId).build(),
                requestOptions,
            )

        /** @see [transferReturn] */
        @MustBeClosed
        fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundAchTransfer>
    }
}
