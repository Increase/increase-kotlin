// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPage
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams

interface InboundWireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Transfer */
    fun retrieve(
        inboundWireTransferId: String,
        params: InboundWireTransferRetrieveParams = InboundWireTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer =
        retrieve(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /** @see [retrieve] */
    fun retrieve(
        inboundWireTransferId: String,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        retrieve(inboundWireTransferId, InboundWireTransferRetrieveParams.none(), requestOptions)

    /** List Inbound Wire Transfers */
    fun list(
        params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundWireTransferListPage =
        list(InboundWireTransferListParams.none(), requestOptions)

    /** Reverse an Inbound Wire Transfer */
    fun reverse(
        inboundWireTransferId: String,
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer =
        reverse(
            params.toBuilder().inboundWireTransferId(inboundWireTransferId).build(),
            requestOptions,
        )

    /** @see [reverse] */
    fun reverse(
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundWireTransfer

    /**
     * A view of [InboundWireTransferService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers/{inbound_wire_transfer_id}`,
         * but is otherwise the same as [InboundWireTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
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
         * as [InboundWireTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: InboundWireTransferListParams = InboundWireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundWireTransferListPage> =
            list(InboundWireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse`, but is otherwise the same as
         * [InboundWireTransferService.reverse].
         */
        @MustBeClosed
        fun reverse(
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
        fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundWireTransfer>
    }
}
