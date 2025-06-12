// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.simulations.realtimepaymentstransfers.RealTimePaymentsTransferCompleteParams

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): RealTimePaymentsTransferServiceAsync

    /**
     * Simulates submission of a [Real-Time Payments Transfer](#real-time-payments-transfers) and
     * handling the response from the destination financial institution. This transfer must first
     * have a `status` of `pending_submission`.
     */
    suspend fun complete(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCompleteParams =
            RealTimePaymentsTransferCompleteParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        complete(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see [complete] */
    suspend fun complete(
        params: RealTimePaymentsTransferCompleteParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see [complete] */
    suspend fun complete(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        complete(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCompleteParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsTransferServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RealTimePaymentsTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/real_time_payments_transfers/{real_time_payments_transfer_id}/complete`, but
         * is otherwise the same as [RealTimePaymentsTransferServiceAsync.complete].
         */
        @MustBeClosed
        suspend fun complete(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCompleteParams =
                RealTimePaymentsTransferCompleteParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            params: RealTimePaymentsTransferCompleteParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see [complete] */
        @MustBeClosed
        suspend fun complete(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            complete(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCompleteParams.none(),
                requestOptions,
            )
    }
}
