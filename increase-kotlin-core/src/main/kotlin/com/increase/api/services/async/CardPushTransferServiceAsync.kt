// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListPageAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams

interface CardPushTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardPushTransferServiceAsync

    /** Create a Card Push Transfer */
    suspend fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** Retrieve a Card Push Transfer */
    suspend fun retrieve(
        cardPushTransferId: String,
        params: CardPushTransferRetrieveParams = CardPushTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        retrieve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see retrieve */
    suspend fun retrieve(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

    /** List Card Push Transfers */
    suspend fun list(
        params: CardPushTransferListParams = CardPushTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransferListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardPushTransferListPageAsync =
        list(CardPushTransferListParams.none(), requestOptions)

    /** Approves a Card Push Transfer in a pending_approval state. */
    suspend fun approve(
        cardPushTransferId: String,
        params: CardPushTransferApproveParams = CardPushTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        approve(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see approve */
    suspend fun approve(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

    /** Cancels a Card Push Transfer in a pending_approval state. */
    suspend fun cancel(
        cardPushTransferId: String,
        params: CardPushTransferCancelParams = CardPushTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer =
        cancel(params.toBuilder().cardPushTransferId(cardPushTransferId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPushTransfer

    /** @see cancel */
    suspend fun cancel(
        cardPushTransferId: String,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)

    /**
     * A view of [CardPushTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardPushTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /**
         * Returns a raw HTTP response for `get /card_push_transfers/{card_push_transfer_id}`, but
         * is otherwise the same as [CardPushTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
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
        suspend fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            retrieve(cardPushTransferId, CardPushTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_push_transfers`, but is otherwise the same as
         * [CardPushTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardPushTransferListParams = CardPushTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransferListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardPushTransferListPageAsync> =
            list(CardPushTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/approve`, but is otherwise the same as
         * [CardPushTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
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
        suspend fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            approve(cardPushTransferId, CardPushTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_push_transfers/{card_push_transfer_id}/cancel`, but is otherwise the same as
         * [CardPushTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
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
        suspend fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPushTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            cardPushTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> =
            cancel(cardPushTransferId, CardPushTransferCancelParams.none(), requestOptions)
    }
}
