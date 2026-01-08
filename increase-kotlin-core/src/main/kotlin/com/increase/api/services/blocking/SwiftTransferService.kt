// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.swifttransfers.SwiftTransfer
import com.increase.api.models.swifttransfers.SwiftTransferApproveParams
import com.increase.api.models.swifttransfers.SwiftTransferCancelParams
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import com.increase.api.models.swifttransfers.SwiftTransferListPage
import com.increase.api.models.swifttransfers.SwiftTransferListParams
import com.increase.api.models.swifttransfers.SwiftTransferRetrieveParams

interface SwiftTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SwiftTransferService

    /** Create a Swift Transfer */
    fun create(
        params: SwiftTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** Retrieve a Swift Transfer */
    fun retrieve(
        swiftTransferId: String,
        params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: SwiftTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see retrieve */
    fun retrieve(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

    /** List Swift Transfers */
    fun list(
        params: SwiftTransferListParams = SwiftTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransferListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): SwiftTransferListPage =
        list(SwiftTransferListParams.none(), requestOptions)

    /** Approve a Swift Transfer */
    fun approve(
        swiftTransferId: String,
        params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        params: SwiftTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see approve */
    fun approve(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

    /** Cancel a pending Swift Transfer */
    fun cancel(
        swiftTransferId: String,
        params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer =
        cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        params: SwiftTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): SwiftTransfer

    /** @see cancel */
    fun cancel(swiftTransferId: String, requestOptions: RequestOptions): SwiftTransfer =
        cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)

    /**
     * A view of [SwiftTransferService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SwiftTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /swift_transfers`, but is otherwise the same as
         * [SwiftTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: SwiftTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /**
         * Returns a raw HTTP response for `get /swift_transfers/{swift_transfer_id}`, but is
         * otherwise the same as [SwiftTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            swiftTransferId: String,
            params: SwiftTransferRetrieveParams = SwiftTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            retrieve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: SwiftTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            retrieve(swiftTransferId, SwiftTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /swift_transfers`, but is otherwise the same as
         * [SwiftTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: SwiftTransferListParams = SwiftTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransferListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<SwiftTransferListPage> =
            list(SwiftTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/approve`, but
         * is otherwise the same as [SwiftTransferService.approve].
         */
        @MustBeClosed
        fun approve(
            swiftTransferId: String,
            params: SwiftTransferApproveParams = SwiftTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            approve(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: SwiftTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            approve(swiftTransferId, SwiftTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /swift_transfers/{swift_transfer_id}/cancel`, but
         * is otherwise the same as [SwiftTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(
            swiftTransferId: String,
            params: SwiftTransferCancelParams = SwiftTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer> =
            cancel(params.toBuilder().swiftTransferId(swiftTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: SwiftTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<SwiftTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            swiftTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> =
            cancel(swiftTransferId, SwiftTransferCancelParams.none(), requestOptions)
    }
}
