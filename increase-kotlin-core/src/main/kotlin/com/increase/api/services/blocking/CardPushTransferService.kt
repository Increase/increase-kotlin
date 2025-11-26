// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListResponse
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams

interface CardPushTransferService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardPushTransferService

    /** Create a Card Push Transfer */
    fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** Retrieve a Card Push Transfer */
    fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        retrieve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see retrieve */
    fun retrieve(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

    /** List Card Push Transfers */
    fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransferListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): CardPushTransferListResponse =
        list(CardPushTransferListParams.none(), requestOptions)

    /** Approves a Card Push Transfer in a pending_approval state. */
    fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        approve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see approve */
    fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see approve */
    fun approve(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

    /** Cancels a Card Push Transfer in a pending_approval state. */
    fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        cancel(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see cancel */
    fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see cancel */
    fun cancel(cardPushTransferId: String, requestOptions: RequestOptions): CardPushTransfer =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)

    /**
     * A view of [CardPushTransferService] that provides access to raw HTTP responses for each
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
        ): CardPushTransferService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferService.create].
         */
        @MustBeClosed
        fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /**
         * Returns a raw HTTP response for `get /card_push_transfers/{card_push_transfer_id}`, but
         * is otherwise the same as [CardPushTransferService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardPushTransferId: String,
            params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferService.list].
         */
        @MustBeClosed
        fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransferListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPushTransferListResponse> =
            list(CardPushTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/approve`, but is otherwise the same as
         * [CardPushTransferService.approve].
         */
        @MustBeClosed
        fun approve(
            cardPushTransferId: String,
            params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            approve(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see approve */
        @MustBeClosed
        fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see approve */
        @MustBeClosed
        fun approve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/cancel`, but is otherwise the same as
         * [CardPushTransferService.cancel].
         */
        @MustBeClosed
        fun cancel(
            cardPushTransferId: String,
            params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer> =
            cancel(
                params.toBuilder().cardPushTransferId(cardPushTransferId).build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see cancel */
        @MustBeClosed
        fun cancel(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)
    }
}
