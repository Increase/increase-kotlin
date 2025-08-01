// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPage
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams

interface CardDisputeService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardDisputeService

    /** Create a Card Dispute */
    fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** Retrieve a Card Dispute */
    fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** @see retrieve */
    fun retrieve(cardDisputeId: String, requestOptions: RequestOptions): CardDispute =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

    /** List Card Disputes */
    fun list(
        params: CardDisputeListParams = CardDisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDisputeListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CardDisputeListPage =
        list(CardDisputeListParams.none(), requestOptions)

    /**
     * A view of [CardDisputeService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardDisputeService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_disputes`, but is otherwise the same as
         * [CardDisputeService.create].
         */
        @MustBeClosed
        fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /**
         * Returns a raw HTTP response for `get /card_disputes/{card_dispute_id}`, but is otherwise
         * the same as [CardDisputeService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_disputes`, but is otherwise the same as
         * [CardDisputeService.list].
         */
        @MustBeClosed
        fun list(
            params: CardDisputeListParams = CardDisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDisputeListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardDisputeListPage> =
            list(CardDisputeListParams.none(), requestOptions)
    }
}
