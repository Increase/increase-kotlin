// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListPageAsync
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams

interface RealTimePaymentsTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Transfer */
    suspend fun create(params: RealTimePaymentsTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): RealTimePaymentsTransfer

    /** Retrieve a Real-Time Payments Transfer */
    suspend fun retrieve(params: RealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): RealTimePaymentsTransfer

    /** List Real-Time Payments Transfers */
    suspend fun list(params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): RealTimePaymentsTransferListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): RealTimePaymentsTransferListPageAsync = list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsTransferServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is
         * otherwise the same as [RealTimePaymentsTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: RealTimePaymentsTransferCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for
         * `get /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is
         * otherwise the same as [RealTimePaymentsTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: RealTimePaymentsTransferRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is
         * otherwise the same as [RealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<RealTimePaymentsTransferListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<RealTimePaymentsTransferListPageAsync> = list(RealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
