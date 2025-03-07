// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPageAsync
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams

interface WireTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Wire Transfer */
    suspend fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Retrieve a Wire Transfer */
    suspend fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** List Wire Transfers */
    suspend fun list(
        params: WireTransferListParams = WireTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransferListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): WireTransferListPageAsync =
        list(WireTransferListParams.none(), requestOptions)

    /** Approve a Wire Transfer */
    suspend fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /** Cancel a pending Wire Transfer */
    suspend fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): WireTransfer

    /**
     * A view of [WireTransferServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: WireTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers/{wire_transfer_id}`, but is
         * otherwise the same as [WireTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: WireTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `get /wire_transfers`, but is otherwise the same as
         * [WireTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: WireTransferListParams = WireTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransferListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<WireTransferListPageAsync> =
            list(WireTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/approve`, but is
         * otherwise the same as [WireTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            params: WireTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>

        /**
         * Returns a raw HTTP response for `post /wire_transfers/{wire_transfer_id}/cancel`, but is
         * otherwise the same as [WireTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            params: WireTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<WireTransfer>
    }
}
