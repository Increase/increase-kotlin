// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.swifttransfers.SwiftTransfer
import com.increase.api.models.swifttransfers.SwiftTransferApproveParams
import com.increase.api.models.swifttransfers.SwiftTransferCancelParams
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import com.increase.api.models.swifttransfers.SwiftTransferListPageAsync
import com.increase.api.models.swifttransfers.SwiftTransferListParams
import com.increase.api.models.swifttransfers.SwiftTransferRetrieveParams

interface SwiftTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SwiftTransferServiceAsync

    /** Create a Swift Transfer */
    suspend fun create(
        params: SwiftTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** Retrieve a Swift Transfer */
    suspend fun retrieve(
        swiftTransferId: String,
        params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: SwiftTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see retrieve */
    suspend fun retrieve(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

    /** List Swift Transfers */
    suspend fun list(
        params: SwiftTransferListParams = SwiftTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransferListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): SwiftTransferListPageAsync =
        list(SwiftTransferListParams.none(), requestOptions)

    /** Approve a Swift Transfer */
    suspend fun approve(
        swiftTransferId: String,
        params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: SwiftTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see approve */
    suspend fun approve(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Swift Transfer */
    suspend fun cancel(
        swiftTransferId: String,
        params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: SwiftTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see cancel */
    suspend fun cancel(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)

    /**
     * A view of [SwiftTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): SwiftTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /swift_transfers`, but is otherwise the same as
         * [SwiftTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SwiftTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /**
         * Returns a raw HTTP response for `get /swift_transfers/{swift_transfer_id}`, but is
         * otherwise the same as [SwiftTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            swiftTransferId: String,
            params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: SwiftTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /swift_transfers`, but is otherwise the same as
         * [SwiftTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: SwiftTransferListParams = SwiftTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransferListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<SwiftTransferListPageAsync> =
            list(SwiftTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/approve`, but
         * is otherwise the same as [SwiftTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            swiftTransferId: String,
            params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: SwiftTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/cancel`, but
         * is otherwise the same as [SwiftTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            swiftTransferId: String,
            params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: SwiftTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)
    }
}
