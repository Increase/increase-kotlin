// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardreversals.CardReversalCreateParams

interface CardReversalServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardReversalServiceAsync

    /**
     * Simulates the reversal of an authorization by a card acquirer. An authorization can be
     * partially reversed multiple times, up until the total authorized amount. Marks the pending
     * transaction as complete if the authorization is fully reversed.
     */
    suspend fun create(
        params: CardReversalCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardReversalServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardReversalServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_reversals`, but is otherwise the
         * same as [CardReversalServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardReversalCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
