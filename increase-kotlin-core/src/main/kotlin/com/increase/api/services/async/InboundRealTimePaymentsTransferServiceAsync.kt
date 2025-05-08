// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListPageAsync
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams

interface InboundRealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Inbound Real-Time Payments Transfer */
    suspend fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        params: InboundRealTimePaymentsTransferRetrieveParams =
            InboundRealTimePaymentsTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer =
        retrieve(
            params
                .toBuilder()
                .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                .build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransfer

    /** @see [retrieve] */
    suspend fun retrieve(
        inboundRealTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransfer =
        retrieve(
            inboundRealTimePaymentsTransferId,
            InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Transfers */
    suspend fun list(
        params: InboundRealTimePaymentsTransferListParams =
            InboundRealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsTransferListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): InboundRealTimePaymentsTransferListPageAsync =
        list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsTransferServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            params: InboundRealTimePaymentsTransferRetrieveParams =
                InboundRealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsTransferId(inboundRealTimePaymentsTransferId)
                    .build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransfer>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            inboundRealTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> =
            retrieve(
                inboundRealTimePaymentsTransferId,
                InboundRealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_transfers`, but is
         * otherwise the same as [InboundRealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundRealTimePaymentsTransferListParams =
                InboundRealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync> =
            list(InboundRealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
