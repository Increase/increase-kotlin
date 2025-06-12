// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checktransfers.CheckTransfer
import com.increase.api.models.checktransfers.CheckTransferApproveParams
import com.increase.api.models.checktransfers.CheckTransferCancelParams
import com.increase.api.models.checktransfers.CheckTransferCreateParams
import com.increase.api.models.checktransfers.CheckTransferListPageAsync
import com.increase.api.models.checktransfers.CheckTransferListParams
import com.increase.api.models.checktransfers.CheckTransferRetrieveParams
import com.increase.api.models.checktransfers.CheckTransferStopPaymentParams

interface CheckTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckTransferServiceAsync

    /** Create a Check Transfer */
    suspend fun create(
        params: CheckTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** Retrieve a Check Transfer */
    suspend fun retrieve(
        checkTransferId: String,
        params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: CheckTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see [retrieve] */
    suspend fun retrieve(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

    /** List Check Transfers */
    suspend fun list(
        params: CheckTransferListParams = CheckTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransferListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CheckTransferListPageAsync =
        list(CheckTransferListParams.none(), requestOptions)

    /** Approve a Check Transfer */
    suspend fun approve(
        checkTransferId: String,
        params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [approve] */
    suspend fun approve(
        params: CheckTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see [approve] */
    suspend fun approve(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Check Transfer */
    suspend fun cancel(
        checkTransferId: String,
        params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [cancel] */
    suspend fun cancel(
        params: CheckTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see [cancel] */
    suspend fun cancel(checkTransferId: String, requestOptions: RequestOptions): CheckTransfer =
        cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

    /** Request a stop payment on a Check Transfer */
    suspend fun stopPayment(
        checkTransferId: String,
        params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer =
        stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

    /** @see [stopPayment] */
    suspend fun stopPayment(
        params: CheckTransferStopPaymentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckTransfer

    /** @see [stopPayment] */
    suspend fun stopPayment(
        checkTransferId: String,
        requestOptions: RequestOptions,
    ): CheckTransfer =
        stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)

    /**
     * A view of [CheckTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): CheckTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /check_transfers`, but is otherwise the same as
         * [CheckTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CheckTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /**
         * Returns a raw HTTP response for `get /check_transfers/{check_transfer_id}`, but is
         * otherwise the same as [CheckTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            checkTransferId: String,
            params: CheckTransferRetrieveParams = CheckTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            retrieve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: CheckTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            retrieve(checkTransferId, CheckTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /check_transfers`, but is otherwise the same as
         * [CheckTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CheckTransferListParams = CheckTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransferListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CheckTransferListPageAsync> =
            list(CheckTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/approve`, but
         * is otherwise the same as [CheckTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            checkTransferId: String,
            params: CheckTransferApproveParams = CheckTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            approve(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [approve] */
        @MustBeClosed
        suspend fun approve(
            params: CheckTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see [approve] */
        @MustBeClosed
        suspend fun approve(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            approve(checkTransferId, CheckTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/cancel`, but
         * is otherwise the same as [CheckTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            checkTransferId: String,
            params: CheckTransferCancelParams = CheckTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            cancel(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [cancel] */
        @MustBeClosed
        suspend fun cancel(
            params: CheckTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see [cancel] */
        @MustBeClosed
        suspend fun cancel(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            cancel(checkTransferId, CheckTransferCancelParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /check_transfers/{check_transfer_id}/stop_payment`,
         * but is otherwise the same as [CheckTransferServiceAsync.stopPayment].
         */
        @MustBeClosed
        suspend fun stopPayment(
            checkTransferId: String,
            params: CheckTransferStopPaymentParams = CheckTransferStopPaymentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer> =
            stopPayment(params.toBuilder().checkTransferId(checkTransferId).build(), requestOptions)

        /** @see [stopPayment] */
        @MustBeClosed
        suspend fun stopPayment(
            params: CheckTransferStopPaymentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckTransfer>

        /** @see [stopPayment] */
        @MustBeClosed
        suspend fun stopPayment(
            checkTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckTransfer> =
            stopPayment(checkTransferId, CheckTransferStopPaymentParams.none(), requestOptions)
    }
}
