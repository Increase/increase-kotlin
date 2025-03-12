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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound ACH Transfer */
    fun retrieve(params: InboundAchTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** List Inbound ACH Transfers */
    fun list(params: InboundAchTransferListParams = InboundAchTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundAchTransferListPage = list(InboundAchTransferListParams.none(), requestOptions)

    /** Create a notification of change for an Inbound ACH Transfer */
    fun createNotificationOfChange(params: InboundAchTransferCreateNotificationOfChangeParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** Decline an Inbound ACH Transfer */
    fun decline(params: InboundAchTransferDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /** Return an Inbound ACH Transfer */
    fun transferReturn(params: InboundAchTransferTransferReturnParams, requestOptions: RequestOptions = RequestOptions.none()): InboundAchTransfer

    /**
     * A view of [InboundAchTransferService] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_ach_transfers/{inbound_ach_transfer_id}`, but is otherwise the
         * same as [InboundAchTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundAchTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_ach_transfers`, but is otherwise
         * the same as [InboundAchTransferService.list].
         */
        @MustBeClosed
        fun list(params: InboundAchTransferListParams = InboundAchTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundAchTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundAchTransferListPage> = list(InboundAchTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change`,
         * but is otherwise the same as
         * [InboundAchTransferService.createNotificationOfChange].
         */
        @MustBeClosed
        fun createNotificationOfChange(params: InboundAchTransferCreateNotificationOfChangeParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for
         * `post /inbound_ach_transfers/{inbound_ach_transfer_id}/decline`, but is
         * otherwise the same as [InboundAchTransferService.decline].
         */
        @MustBeClosed
        fun decline(params: InboundAchTransferDeclineParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundAchTransfer>

        /**
         * Returns a raw HTTP response for
         * `post /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return`, but is
         * otherwise the same as [InboundAchTransferService.transferReturn].
         */
        @MustBeClosed
        fun transferReturn(params: InboundAchTransferTransferReturnParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundAchTransfer>
    }
}
