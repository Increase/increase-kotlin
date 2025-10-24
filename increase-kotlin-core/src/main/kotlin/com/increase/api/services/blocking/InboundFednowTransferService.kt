// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListPage
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferRetrieveParams

interface InboundFednowTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundFednowTransferService

    /** Retrieve an Inbound FedNow Transfer */
    fun retrieve(
        inboundFednowTransferId: String,
        params: InboundFednowTransferRetrieveParams = InboundFednowTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransfer =
        retrieve(
            params.toBuilder().inboundFednowTransferId(inboundFednowTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    fun retrieve(
        params: InboundFednowTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransfer

    /** @see retrieve */
    fun retrieve(
        inboundFednowTransferId: String,
        requestOptions: RequestOptions,
    ): InboundFednowTransfer =
        retrieve(
            inboundFednowTransferId,
            InboundFednowTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound FedNow Transfers */
    fun list(
        params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFednowTransferListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundFednowTransferListPage =
        list(InboundFednowTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundFednowTransferService] that provides access to raw HTTP responses for each
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
        ): InboundFednowTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_fednow_transfers/{inbound_fednow_transfer_id}`, but is otherwise the same as
         * [InboundFednowTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: InboundFednowTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
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
         * same as [InboundFednowTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: InboundFednowTransferListParams = InboundFednowTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFednowTransferListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundFednowTransferListPage> =
            list(InboundFednowTransferListParams.none(), requestOptions)
    }
}
