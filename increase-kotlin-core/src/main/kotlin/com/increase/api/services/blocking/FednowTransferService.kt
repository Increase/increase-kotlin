// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.fednowtransfers.FednowTransferApproveParams
import com.increase.api.models.fednowtransfers.FednowTransferCancelParams
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import com.increase.api.models.fednowtransfers.FednowTransferListParams
import com.increase.api.models.fednowtransfers.FednowTransferListResponse
import com.increase.api.models.fednowtransfers.FednowTransferRetrieveParams

interface FednowTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FednowTransferService

    /** Create a FedNow Transfer */
    fun create(
        params: FednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** Retrieve a FedNow Transfer */
    fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: FednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see retrieve */
    fun retrieve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

    /** List FedNow Transfers */
    fun list(
        params: FednowTransferListParams = FednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransferListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): FednowTransferListResponse =
        list(FednowTransferListParams.none(), requestOptions)

    /** Approve a FedNow Transfer */
    fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        params: FednowTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see approve */
    fun approve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

    /** Cancel a pending FedNow Transfer */
    fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        params: FednowTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see cancel */
    fun cancel(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)

    /**
     * A view of [FednowTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): FednowTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fednow_transfers`, but is otherwise the same as
         * [FednowTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: FednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /**
         * Returns a raw HTTP response for `get /fednow_transfers/{fednow_transfer_id}`, but is
         * otherwise the same as [FednowTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: FednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fednow_transfers`, but is otherwise the same as
         * [FednowTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: FednowTransferListParams = FednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransferListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<FednowTransferListResponse> =
            list(FednowTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/approve`,
         * but is otherwise the same as [FednowTransferService.approve].
         */
        @MustBeClosed
        fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: FednowTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/cancel`, but
         * is otherwise the same as [FednowTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: FednowTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)
    }
}
