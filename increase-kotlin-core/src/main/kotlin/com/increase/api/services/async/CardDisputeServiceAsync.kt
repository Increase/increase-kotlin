// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeListResponse
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams
import com.increase.api.models.carddisputes.CardDisputeSubmitUserSubmissionParams
import com.increase.api.models.carddisputes.CardDisputeWithdrawParams

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

    /** Create a Card Dispute */
    suspend fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** Retrieve a Card Dispute */
    suspend fun retrieve(
        cardDisputeId: String,
        params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** @see retrieve */
    suspend fun retrieve(cardDisputeId: String, requestOptions: RequestOptions): CardDispute =
        retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

    /** List Card Disputes */
    suspend fun list(
        params: CardDisputeListParams = CardDisputeListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDisputeListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardDisputeListResponse =
        list(CardDisputeListParams.none(), requestOptions)

    /** Submit a User Submission for a Card Dispute */
    suspend fun submitUserSubmission(
        cardDisputeId: String,
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        submitUserSubmission(
            params.toBuilder().cardDisputeId(cardDisputeId).build(),
            requestOptions,
        )

    /** @see submitUserSubmission */
    suspend fun submitUserSubmission(
        params: CardDisputeSubmitUserSubmissionParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** Withdraw a Card Dispute */
    suspend fun withdraw(
        cardDisputeId: String,
        params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute =
        withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

    /** @see withdraw */
    suspend fun withdraw(
        params: CardDisputeWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardDispute

    /** @see withdraw */
    suspend fun withdraw(cardDisputeId: String, requestOptions: RequestOptions): CardDispute =
        withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)

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
         * Returns a raw HTTP response for `post /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /**
         * Returns a raw HTTP response for `get /card_disputes/{card_dispute_id}`, but is otherwise
         * the same as [CardDisputeServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardDisputeId: String,
            params: CardDisputeRetrieveParams = CardDisputeRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            retrieve(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> =
            retrieve(cardDisputeId, CardDisputeRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_disputes`, but is otherwise the same as
         * [CardDisputeServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardDisputeListParams = CardDisputeListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDisputeListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<CardDisputeListResponse> =
            list(CardDisputeListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /card_disputes/{card_dispute_id}/submit_user_submission`, but is otherwise the same as
         * [CardDisputeServiceAsync.submitUserSubmission].
         */
        @MustBeClosed
        suspend fun submitUserSubmission(
            cardDisputeId: String,
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            submitUserSubmission(
                params.toBuilder().cardDisputeId(cardDisputeId).build(),
                requestOptions,
            )

        /** @see submitUserSubmission */
        @MustBeClosed
        suspend fun submitUserSubmission(
            params: CardDisputeSubmitUserSubmissionParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /**
         * Returns a raw HTTP response for `post /card_disputes/{card_dispute_id}/withdraw`, but is
         * otherwise the same as [CardDisputeServiceAsync.withdraw].
         */
        @MustBeClosed
        suspend fun withdraw(
            cardDisputeId: String,
            params: CardDisputeWithdrawParams = CardDisputeWithdrawParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute> =
            withdraw(params.toBuilder().cardDisputeId(cardDisputeId).build(), requestOptions)

        /** @see withdraw */
        @MustBeClosed
        suspend fun withdraw(
            params: CardDisputeWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardDispute>

        /** @see withdraw */
        @MustBeClosed
        suspend fun withdraw(
            cardDisputeId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> =
            withdraw(cardDisputeId, CardDisputeWithdrawParams.none(), requestOptions)
    }
}
