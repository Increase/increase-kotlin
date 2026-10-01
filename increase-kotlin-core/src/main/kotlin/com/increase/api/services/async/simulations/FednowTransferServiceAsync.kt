// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.fednowtransfers.FednowTransfer
import com.increase.api.models.simulations.fednowtransfers.FednowTransferCompleteParams

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

    /**
     * Simulates submission of a [FedNow Transfer](#fednow-transfers) and handling the response from
     * the destination financial institution. This transfer must first have a `status` of
     * `pending_submitting`.
     */
    suspend fun complete(
        fednowTransferId: String,
        params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer =
        complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

    /** @see complete */
    suspend fun complete(
        params: FednowTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): FednowTransfer

    /** @see complete */
    suspend fun complete(fednowTransferId: String, requestOptions: RequestOptions): FednowTransfer =
        complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post
         * /simulations/fednow_transfers/{fednow_transfer_id}/complete`, but is otherwise the same
         * as [FednowTransferServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            fednowTransferId: String,
            params: FednowTransferCompleteParams = FednowTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer> =
            complete(params.toBuilder().fednowTransferId(fednowTransferId).build(), requestOptions)

        /** @see complete */
        @MustBeClosed
        suspend fun complete(
            params: FednowTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<FednowTransfer>

        /** @see complete */
        @MustBeClosed
        suspend fun complete(
            fednowTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<FednowTransfer> =
            complete(fednowTransferId, FednowTransferCompleteParams.none(), requestOptions)
    }
}
