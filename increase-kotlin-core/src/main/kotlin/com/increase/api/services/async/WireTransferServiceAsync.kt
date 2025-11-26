// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.wiretransfers.WireTransfer
import com.increase.api.models.wiretransfers.WireTransferApproveParams
import com.increase.api.models.wiretransfers.WireTransferCancelParams
import com.increase.api.models.wiretransfers.WireTransferCreateParams
import com.increase.api.models.wiretransfers.WireTransferListParams
import com.increase.api.models.wiretransfers.WireTransferListResponse
import com.increase.api.models.wiretransfers.WireTransferRetrieveParams

interface WireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): WireTransferServiceAsync

    /** Create a Wire Transfer */
    suspend fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    suspend fun retrieve(
        wireTransferId: String,
        params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see retrieve */
    suspend fun retrieve(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

    /** List Wire Transfers */
    suspend fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransferListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): WireTransferListResponse =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    suspend fun approve(
        wireTransferId: String,
        params: WireTransferApproveParams = WireTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see approve */
    suspend fun approve(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Wire Transfer */
    suspend fun cancel(
        wireTransferId: String,
        params: WireTransferCancelParams = WireTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer =
        cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** @see cancel */
    suspend fun cancel(wireTransferId: String, requestOptions: RequestOptions): WireTransfer =
        cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): WireTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            wireTransferId: String,
            params: WireTransferRetrieveParams = WireTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            retrieve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            retrieve(wireTransferId, WireTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransferListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WireTransferListResponse> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            wireTransferId: String,
            params: WireTransferApproveParams = WireTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            approve(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            approve(wireTransferId, WireTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            wireTransferId: String,
            params: WireTransferCancelParams = WireTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer> =
            cancel(params.toBuilder().wireTransferId(wireTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            wireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireTransfer> =
            cancel(wireTransferId, WireTransferCancelParams.none(), requestOptions)
    }
}
