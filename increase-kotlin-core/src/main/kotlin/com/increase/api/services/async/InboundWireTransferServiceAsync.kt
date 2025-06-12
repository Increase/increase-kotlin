// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams

interface InboundWireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundWireTransferServiceAsync

    /** Retrieve an Inbound Wire Transfer */
    suspend fun retrieve(
        inboundWireTransferId: String,
        params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer =
        retrieve(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /** @see [retrieve] */
    suspend fun retrieve(
        inboundWireTransferId: String,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        retrieve(inboundWireTransferId, InboundWireTransferRetrieveParams.none(), requestOptions)

    /** List Inbound Wire Transfers */
    suspend fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransferListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InboundWireTransferListPageAsync =
        list(InboundWireTransferListParams.none(), requestOptions)

    /** Reverse an Inbound Wire Transfer */
    suspend fun reverse(
        inboundWireTransferId: String,
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer =
        reverse(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see [reverse] */
    suspend fun reverse(
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /**
     * A view of [InboundWireTransferServiceAsync] that provides access to raw HTTP responses for
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
        ): InboundWireTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundWireTransferId: String,
            params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer> =
            retrieve(
                params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            inboundWireTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> =
            retrieve(
                inboundWireTransferId,
                InboundWireTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise the same
         * as [InboundWireTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransferListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundWireTransferListPageAsync> =
            list(InboundWireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse`, but is otherwise the same as
         * [InboundWireTransferServiceAsync.reverse].
         */
        @MustBeClosed
        suspend fun reverse(
            inboundWireTransferId: String,
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer> =
            reverse(
                params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
                requestOptions,
            )

        /** @see [reverse] */
        @MustBeClosed
        suspend fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer>
    }
}
