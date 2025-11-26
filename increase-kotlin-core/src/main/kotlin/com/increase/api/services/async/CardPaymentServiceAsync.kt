// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListPageAsync
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams

interface CardPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardPaymentServiceAsync

    /** Retrieve a Card Payment */
    suspend fun retrieve(
        cardPaymentId: String,
        params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment =
        retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** @see retrieve */
    suspend fun retrieve(cardPaymentId: String, requestOptions: RequestOptions): CardPayment =
        retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

    /** List Card Payments */
    suspend fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardPaymentListPageAsync =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardPaymentId: String,
            params: CardPaymentRetrieveParams = CardPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment> =
            retrieve(params.toBuilder().cardPaymentId(cardPaymentId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> =
            retrieve(cardPaymentId, CardPaymentRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPaymentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardPaymentListPageAsync> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
