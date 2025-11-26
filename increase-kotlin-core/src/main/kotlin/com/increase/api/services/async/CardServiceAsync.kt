// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateDetailsIframeParams
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardIframeUrl
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardListResponse
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams
import com.increase.api.models.cards.CardUpdatePinParams

interface CardServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync

    /** Create a Card */
    suspend fun create(
        params: CardCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** Retrieve a Card */
    suspend fun retrieve(
        cardId: String,
        params: CardRetrieveParams = CardRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see retrieve */
    suspend fun retrieve(cardId: String, requestOptions: RequestOptions): Card =
        retrieve(cardId, CardRetrieveParams.none(), requestOptions)

    /** Update a Card */
    suspend fun update(
        cardId: String,
        params: CardUpdateParams = CardUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CardUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Card

    /** @see update */
    suspend fun update(cardId: String, requestOptions: RequestOptions): Card =
        update(cardId, CardUpdateParams.none(), requestOptions)

    /** List Cards */
    suspend fun list(
        params: CardListParams = CardListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardListResponse =
        list(CardListParams.none(), requestOptions)

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    suspend fun createDetailsIframe(
        cardId: String,
        params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    suspend fun createDetailsIframe(
        params: CardCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl

    /** @see createDetailsIframe */
    suspend fun createDetailsIframe(cardId: String, requestOptions: RequestOptions): CardIframeUrl =
        createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    suspend fun details(
        cardId: String,
        params: CardDetailsParams = CardDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    suspend fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** @see details */
    suspend fun details(cardId: String, requestOptions: RequestOptions): CardDetails =
        details(cardId, CardDetailsParams.none(), requestOptions)

    /** Update a Card's PIN */
    suspend fun updatePin(
        cardId: String,
        params: CardUpdatePinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = updatePin(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see updatePin */
    suspend fun updatePin(
        params: CardUpdatePinParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** A view of [CardServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /cards`, but is otherwise the same as
         * [CardServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardId: String,
            params: CardRetrieveParams = CardRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> =
            retrieve(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> = retrieve(cardId, CardRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}`, but is otherwise the same as
         * [CardServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            cardId: String,
            params: CardUpdateParams = CardUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card> = update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Card>

        /** @see update */
        @MustBeClosed
        suspend fun update(cardId: String, requestOptions: RequestOptions): HttpResponseFor<Card> =
            update(cardId, CardUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards`, but is otherwise the same as
         * [CardServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardListParams = CardListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CardListResponse> =
            list(CardListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardServiceAsync.createDetailsIframe].
         */
        @MustBeClosed
        suspend fun createDetailsIframe(
            cardId: String,
            params: CardCreateDetailsIframeParams = CardCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        @MustBeClosed
        suspend fun createDetailsIframe(
            params: CardCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl>

        /** @see createDetailsIframe */
        @MustBeClosed
        suspend fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardServiceAsync.details].
         */
        @MustBeClosed
        suspend fun details(
            cardId: String,
            params: CardDetailsParams = CardDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        @MustBeClosed
        suspend fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /** @see details */
        @MustBeClosed
        suspend fun details(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> = details(cardId, CardDetailsParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/update_pin`, but is otherwise the
         * same as [CardServiceAsync.updatePin].
         */
        @MustBeClosed
        suspend fun updatePin(
            cardId: String,
            params: CardUpdatePinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            updatePin(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see updatePin */
        @MustBeClosed
        suspend fun updatePin(
            params: CardUpdatePinParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>
    }
}
