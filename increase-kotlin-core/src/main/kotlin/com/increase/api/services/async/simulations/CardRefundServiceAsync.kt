// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.cardrefunds.CardRefundCreateParams
import com.increase.api.models.transactions.Transaction

interface CardRefundServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardRefundServiceAsync

    /**
     * Simulates refunding a card transaction. The full value of the original sandbox transaction is
     * refunded.
     */
    suspend fun create(
        params: CardRefundCreateParams = CardRefundCreateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see create */
    suspend fun create(requestOptions: RequestOptions): Transaction =
        create(CardRefundCreateParams.none(), requestOptions)

    /**
     * A view of [CardRefundServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardRefundServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/card_refunds`, but is otherwise the
         * same as [CardRefundServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardRefundCreateParams = CardRefundCreateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see create */
        @MustBeClosed
        suspend fun create(requestOptions: RequestOptions): HttpResponseFor<Transaction> =
            create(CardRefundCreateParams.none(), requestOptions)
    }
}
