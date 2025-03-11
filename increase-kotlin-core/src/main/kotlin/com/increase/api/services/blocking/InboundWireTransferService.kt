// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPage
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams

interface InboundWireTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Wire Transfer */
    fun retrieve(params: InboundWireTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): InboundWireTransfer

    /** List Inbound Wire Transfers */
    fun list(params: InboundWireTransferListParams = InboundWireTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): InboundWireTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): InboundWireTransferListPage = list(InboundWireTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundWireTransferService] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `get /inbound_wire_transfers/{inbound_wire_transfer_id}`, but is otherwise the
         * same as [InboundWireTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: InboundWireTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundWireTransfer>

        /**
         * Returns a raw HTTP response for `get /inbound_wire_transfers`, but is otherwise
         * the same as [InboundWireTransferService.list].
         */
        @MustBeClosed
        fun list(params: InboundWireTransferListParams = InboundWireTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<InboundWireTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<InboundWireTransferListPage> = list(InboundWireTransferListParams.none(), requestOptions)
    }
}
