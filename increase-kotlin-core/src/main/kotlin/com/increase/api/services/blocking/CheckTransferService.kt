// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.checktransfers.CheckTransferApproveParams
import com.increase.api.models.checktransfers.CheckTransferCancelParams
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferListPage
import com.increase.api.models.checktransfers.CheckTransferListParams
import com.increase.api.models.checktransfers.CheckTransferRetrieveParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams

interface CheckTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Transfer */
    fun create(params: CheckTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CheckTransfer

    /** Retrieve a Check Transfer */
    fun retrieve(params: CheckTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): CheckTransfer

    /** List Check Transfers */
    fun list(params: CheckTransferListParams = CheckTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): CheckTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CheckTransferListPage = list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    fun approve(params: CheckTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): CheckTransfer

    /** Cancel a pending Check Transfer */
    fun cancel(params: CheckTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): CheckTransfer

    /** Request a stop payment on a Check Transfer */
    fun stopPayment(params: CheckTransferStopPaymentParams, requestOptions: RequestOptions = RequestOptions.none()): CheckTransfer

    /**
     * A view of [CheckTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the
         * same as [CheckTransferService.create].
         */
        @MustBeClosed
        fun create(params: CheckTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but
         * is otherwise the same as [CheckTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: CheckTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the
         * same as [CheckTransferService.list].
         */
        @MustBeClosed
        fun list(params: CheckTransferListParams = CheckTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckTransferListPage> = list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/approve`, but is otherwise the same
         * as [CheckTransferService.approve].
         */
        @MustBeClosed
        fun approve(params: CheckTransferApproveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/cancel`, but is otherwise the same as
         * [CheckTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(params: CheckTransferCancelParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for
         * `post /check_transfers/{check_transfer_id}/stop_payment`, but is otherwise the
         * same as [CheckTransferService.stopPayment].
         */
        @MustBeClosed
        fun stopPayment(params: CheckTransferStopPaymentParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CheckTransfer>
    }
}
