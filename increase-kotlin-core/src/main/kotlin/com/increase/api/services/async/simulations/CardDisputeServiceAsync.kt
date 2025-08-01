// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.simulations.carddisputes.CardDisputeActionParams

interface CardDisputeServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardDisputeServiceAsync

    /**
     * After a [Card Dispute](#card-disputes) is created in production, the dispute will be
     * reviewed. Since no review happens in sandbox, this endpoint simulates moving a Card Dispute
     * into a rejected or accepted state. A Card Dispute can only be actioned one time and must have
     * a status of `pending_reviewing`.
     */
    suspend fun action(
        cardDisputeId: String,
        params: CardDisputeActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute = action(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see action */
    suspend fun action(
        params: CardDisputeActionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /**
     * A view of [CardDisputeServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardDisputeServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/card_disputes/{card_dispute_id}/action`, but is otherwise the same as
         * [CardDisputeServiceAsync.action].
         */
        @MustBeClosed
        suspend fun action(
            cardDisputeId: String,
            params: CardDisputeActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            action(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see action */
        @MustBeClosed
        suspend fun action(
            params: CardDisputeActionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>
    }
}
