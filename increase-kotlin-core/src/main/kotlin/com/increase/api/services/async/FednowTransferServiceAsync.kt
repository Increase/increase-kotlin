// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.fednowtransfers.FednowTransferApproveParams
import com.increase.api.models.fednowtransfers.FednowTransferCancelParams
import com.increase.api.models.fednowtransfers.FednowTransferCreateParams
import com.increase.api.models.fednowtransfers.FednowTransferListPageAsync
import com.increase.api.models.fednowtransfers.FednowTransferListParams
import com.increase.api.models.fednowtransfers.FednowTransferRetrieveParams

interface FednowTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): FednowTransferServiceAsync

    /** Create a FedNow Transfer */
    suspend fun create(
        params: FednowTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** Retrieve a FedNow Transfer */
    suspend fun retrieve(
        fednowTransferId: String,
        params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: FednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see retrieve */
    suspend fun retrieve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

    /** List FedNow Transfers */
    suspend fun list(
        params: FednowTransferListParams = FednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransferListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): FednowTransferListPageAsync =
        list(FednowTransferListParams.none(), requestOptions)

    /** Approve a FedNow Transfer */
    suspend fun approve(
        fednowTransferId: String,
        params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: FednowTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see approve */
    suspend fun approve(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

    /** Cancel a pending FedNow Transfer */
    suspend fun cancel(
        fednowTransferId: String,
        params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: FednowTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see cancel */
    suspend fun cancel(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)

    /**
     * A view of [FednowTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): FednowTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /fednow_transfers`, but is otherwise the same as
         * [FednowTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: FednowTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /**
         * Returns a raw HTTP response for `get /fednow_transfers/{fednow_transfer_id}`, but is
         * otherwise the same as [FednowTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            fednowTransferId: String,
            params: FednowTransferRetrieveParams = FednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            retrieve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: FednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            retrieve(fednowTransferId, FednowTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /fednow_transfers`, but is otherwise the same as
         * [FednowTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: FednowTransferListParams = FednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransferListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<FednowTransferListPageAsync> =
            list(FednowTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/approve`,
         * but is otherwise the same as [FednowTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            fednowTransferId: String,
            params: FednowTransferApproveParams = FednowTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            approve(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: FednowTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            approve(fednowTransferId, FednowTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /fednow_transfers/{fednow_transfer_id}/cancel`, but
         * is otherwise the same as [FednowTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            fednowTransferId: String,
            params: FednowTransferCancelParams = FednowTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            cancel(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: FednowTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            cancel(fednowTransferId, FednowTransferCancelParams.none(), requestOptions)
    }
}
