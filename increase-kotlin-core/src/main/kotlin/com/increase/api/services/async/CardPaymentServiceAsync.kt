// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPageAsync
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams

interface CardPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Payment */
    suspend fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** List Card Payments */
    suspend fun list(
        params: CardPaymentListParams = CardPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardPaymentListPageAsync =
        list(CardPaymentListParams.none(), requestOptions)

    /**
     * A view of [CardPaymentServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /card_payments/{card_payment_id}`, but is otherwise
         * the same as [CardPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /**
         * Returns a raw HTTP response for `get /card_payments`, but is otherwise the same as
         * [CardPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardPaymentListParams = CardPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPaymentListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardPaymentListPageAsync> =
            list(CardPaymentListParams.none(), requestOptions)
    }
}
