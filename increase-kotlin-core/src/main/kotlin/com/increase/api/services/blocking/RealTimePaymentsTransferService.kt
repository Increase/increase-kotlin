// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListPage
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams

interface RealTimePaymentsTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Transfer */
    fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** Retrieve a Real-Time Payments Transfer */
    fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** List Real-Time Payments Transfers */
    fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransferListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): RealTimePaymentsTransferListPage =
        list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsTransferService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is otherwise
         * the same as [RealTimePaymentsTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is otherwise the
         * same as [RealTimePaymentsTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransferListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsTransferListPage> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)
    }
}
