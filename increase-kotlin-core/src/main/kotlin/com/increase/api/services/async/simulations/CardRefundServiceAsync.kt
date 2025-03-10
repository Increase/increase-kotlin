// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
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
     * Simulates refunding a card transaction. The full value of the original sandbox transaction is
     * refunded.
     */
    suspend fun create(
        params: CardRefundCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /**
     * A view of [CardRefundServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_refunds`, but is otherwise the
         * same as [CardRefundServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardRefundCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>
    }
}
