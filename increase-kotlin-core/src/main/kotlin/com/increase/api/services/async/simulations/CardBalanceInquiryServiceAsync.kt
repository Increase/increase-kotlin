// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardbalanceinquiries.CardBalanceInquiryCreateParams

interface CardBalanceInquiryServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardBalanceInquiryServiceAsync

    /** Simulates a balance inquiry on a [Card](#cards). */
    suspend fun create(
        params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): CardPayment =
        create(CardBalanceInquiryCreateParams.none(), requestOptions)

    /**
     * A view of [CardBalanceInquiryServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardBalanceInquiryServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_balance_inquiries`, but is
         * otherwise the same as [CardBalanceInquiryServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardBalanceInquiryCreateParams = CardBalanceInquiryCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<CardPayment> =
            create(CardBalanceInquiryCreateParams.none(), requestOptions)
    }
}
