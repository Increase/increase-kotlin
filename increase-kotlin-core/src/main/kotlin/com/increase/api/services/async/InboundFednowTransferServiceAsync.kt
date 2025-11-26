// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListResponse
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferRetrieveParams

interface InboundFednowTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundFednowTransferServiceAsync

    /** Retrieve an Inbound FedNow Transfer */
    suspend fun retrieve(
        inboundFednowTransferId: String,
        params: InboundFednowTransferRetrieveParams = InboundFednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransfer =
        retrieve(
            params.toBuilder().inboundFednowTransferId(inboundFednowTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: InboundFednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransfer

    /** @see retrieve */
    suspend fun retrieve(
        inboundFednowTransferId: String,
        requestOptions: RequestOptions,
    ): InboundFednowTransfer =
        retrieve(
            inboundFednowTransferId,
            InboundFednowTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound FedNow Transfers */
    suspend fun list(
        params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransferListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): InboundFednowTransferListResponse =
        list(InboundFednowTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundFednowTransferServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundFednowTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_fednow_transfers/{inbound_fednow_transfer_id}`, but is otherwise the same as
         * [InboundFednowTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundFednowTransferId: String,
            params: InboundFednowTransferRetrieveParams =
                InboundFednowTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransfer> =
            retrieve(
                params.toBuilder().inboundFednowTransferId(inboundFednowTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundFednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            inboundFednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFednowTransfer> =
            retrieve(
                inboundFednowTransferId,
                InboundFednowTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_fednow_transfers`, but is otherwise the
         * same as [InboundFednowTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransferListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundFednowTransferListResponse> =
            list(InboundFednowTransferListParams.none(), requestOptions)
    }
}
