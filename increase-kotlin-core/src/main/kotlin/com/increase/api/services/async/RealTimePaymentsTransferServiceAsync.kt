// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransfer
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferApproveParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCancelParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferCreateParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListPageAsync
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferListParams
import com.increase.api.models.realtimepaymentstransfers.RealTimePaymentsTransferRetrieveParams

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

    /** Create a Real-Time Payments Transfer */
    suspend fun create(
        params: RealTimePaymentsTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** Retrieve a Real-Time Payments Transfer */
    suspend fun retrieve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferRetrieveParams =
            RealTimePaymentsTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        retrieve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: RealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see retrieve */
    suspend fun retrieve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        retrieve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Transfers */
    suspend fun list(
        params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransferListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): RealTimePaymentsTransferListPageAsync =
        list(RealTimePaymentsTransferListParams.none(), requestOptions)

    /** Approves an Real-Time Payments Transfer in a pending_approval state. */
    suspend fun approve(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferApproveParams =
            RealTimePaymentsTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        approve(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see approve */
    suspend fun approve(
        params: RealTimePaymentsTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see approve */
    suspend fun approve(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        approve(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferApproveParams.none(),
            requestOptions,
        )

    /** Cancels an Real-Time Payments Transfer in a pending_approval state. */
    suspend fun cancel(
        realTimePaymentsTransferId: String,
        params: RealTimePaymentsTransferCancelParams = RealTimePaymentsTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer =
        cancel(
            params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
            requestOptions,
        )

    /** @see cancel */
    suspend fun cancel(
        params: RealTimePaymentsTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsTransfer

    /** @see cancel */
    suspend fun cancel(
        realTimePaymentsTransferId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsTransfer =
        cancel(
            realTimePaymentsTransferId,
            RealTimePaymentsTransferCancelParams.none(),
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
         * Returns a raw HTTP response for `post /real_time_payments_transfers`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RealTimePaymentsTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_transfers/{real_time_payments_transfer_id}`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferRetrieveParams =
                RealTimePaymentsTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: RealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            retrieve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_transfers`, but is otherwise the
         * same as [RealTimePaymentsTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RealTimePaymentsTransferListParams = RealTimePaymentsTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransferListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsTransferListPageAsync> =
            list(RealTimePaymentsTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/approve`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferApproveParams =
                RealTimePaymentsTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: RealTimePaymentsTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            approve(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferApproveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_transfers/{real_time_payments_transfer_id}/cancel`, but is otherwise
         * the same as [RealTimePaymentsTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            realTimePaymentsTransferId: String,
            params: RealTimePaymentsTransferCancelParams =
                RealTimePaymentsTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(
                params.toBuilder().realTimePaymentsTransferId(realTimePaymentsTransferId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: RealTimePaymentsTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            realTimePaymentsTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsTransfer> =
            cancel(
                realTimePaymentsTransferId,
                RealTimePaymentsTransferCancelParams.none(),
                requestOptions,
            )
    }
}
