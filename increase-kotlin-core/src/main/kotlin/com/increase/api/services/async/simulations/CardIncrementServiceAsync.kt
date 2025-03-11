// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardincrements.CardIncrementCreateParams

interface CardIncrementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the increment of an authorization by a card acquirer. An authorization
     * can be incremented multiple times.
     */
    suspend fun create(params: CardIncrementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): CardPayment

    /**
     * A view of [CardIncrementServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_increments`, but is
         * otherwise the same as [CardIncrementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: CardIncrementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<CardPayment>
    }
}
