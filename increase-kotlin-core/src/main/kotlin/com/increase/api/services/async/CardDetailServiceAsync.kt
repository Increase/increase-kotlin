// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailDetailsParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import com.increase.api.models.carddetails.CardDetails
import com.increase.api.models.carddetails.CardIframeUrl

interface CardDetailServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardDetailServiceAsync

    /** Update a Card's Details */
    suspend fun update(
        cardId: String,
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = update(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see update */
    suspend fun update(
        params: CardDetailUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /**
     * Create an iframe URL for a Card to display the card details. More details about styling and
     * usage can be found in the [documentation](/documentation/embedded-card-component).
     */
    suspend fun createDetailsIframe(
        cardId: String,
        params: CardDetailCreateDetailsIframeParams = CardDetailCreateDetailsIframeParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl =
        createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see createDetailsIframe */
    suspend fun createDetailsIframe(
        params: CardDetailCreateDetailsIframeParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardIframeUrl

    /** @see createDetailsIframe */
    suspend fun createDetailsIframe(cardId: String, requestOptions: RequestOptions): CardIframeUrl =
        createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

    /**
     * Sensitive details for a Card include the primary account number, expiry, card verification
     * code, and PIN.
     */
    suspend fun details(
        cardId: String,
        params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails = details(params.toBuilder().cardId(cardId).build(), requestOptions)

    /** @see details */
    suspend fun details(
        params: CardDetailDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDetails

    /** @see details */
    suspend fun details(cardId: String, requestOptions: RequestOptions): CardDetails =
        details(cardId, CardDetailDetailsParams.none(), requestOptions)

    /**
     * A view of [CardDetailServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDetailServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `patch /cards/{card_id}/details`, but is otherwise the
         * same as [CardDetailServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            cardId: String,
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            update(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see update */
        @MustBeClosed
        suspend fun update(
            params: CardDetailUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /**
         * Returns a raw HTTP response for `post /cards/{card_id}/create_details_iframe`, but is
         * otherwise the same as [CardDetailServiceAsync.createDetailsIframe].
         */
        @MustBeClosed
        suspend fun createDetailsIframe(
            cardId: String,
            params: CardDetailCreateDetailsIframeParams =
                CardDetailCreateDetailsIframeParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see createDetailsIframe */
        @MustBeClosed
        suspend fun createDetailsIframe(
            params: CardDetailCreateDetailsIframeParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardIframeUrl>

        /** @see createDetailsIframe */
        @MustBeClosed
        suspend fun createDetailsIframe(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardIframeUrl> =
            createDetailsIframe(cardId, CardDetailCreateDetailsIframeParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /cards/{card_id}/details`, but is otherwise the same
         * as [CardDetailServiceAsync.details].
         */
        @MustBeClosed
        suspend fun details(
            cardId: String,
            params: CardDetailDetailsParams = CardDetailDetailsParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails> =
            details(params.toBuilder().cardId(cardId).build(), requestOptions)

        /** @see details */
        @MustBeClosed
        suspend fun details(
            params: CardDetailDetailsParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDetails>

        /** @see details */
        @MustBeClosed
        suspend fun details(
            cardId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> =
            details(cardId, CardDetailDetailsParams.none(), requestOptions)
    }
}
