// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
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
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckTransferService

    /** Create a Check Transfer */
    fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Retrieve a Check Transfer */
    fun retrieve(
        checkTransferId: String,
        params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see retrieve */
    fun retrieve(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

    /** List Check Transfers */
    fun list(
        params: CheckTransferListParams = CheckTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransferListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CheckTransferListPage =
        list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    fun approve(
        checkTransferId: String,
        params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see approve */
    fun approve(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Check Transfer */
    fun cancel(
        checkTransferId: String,
        params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see cancel */
    fun cancel(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

    /** Stop payment on a Check Transfer */
    fun stopPayment(
        checkTransferId: String,
        params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see stopPayment */
    fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see stopPayment */
    fun stopPayment(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)

    /**
     * A view of [CheckTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the same as
         * [CheckTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: CheckTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but is
         * otherwise the same as [CheckTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            checkTransferId: String,
            params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CheckTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the same as
         * [CheckTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: CheckTransferListParams = CheckTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransferListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CheckTransferListPage> =
            list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/approve`, but
         * is otherwise the same as [CheckTransferService.approve].
         */
        @MustBeClosed
        fun approve(
            checkTransferId: String,
            params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: CheckTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/cancel`, but
         * is otherwise the same as [CheckTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(
            checkTransferId: String,
            params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: CheckTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/stop_payment`,
         * but is otherwise the same as [CheckTransferService.stopPayment].
         */
        @MustBeClosed
        fun stopPayment(
            checkTransferId: String,
            params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see stopPayment */
        @MustBeClosed
        fun stopPayment(
            params: CheckTransferStopPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see stopPayment */
        @MustBeClosed
        fun stopPayment(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)
    }
}
