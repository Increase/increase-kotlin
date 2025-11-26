// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardvalidations.CardValidation
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListParams
import com.increase.api.models.cardvalidations.CardValidationListResponse
import com.increase.api.models.cardvalidations.CardValidationRetrieveParams

interface CardValidationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardValidationServiceAsync

    /** Create a Card Validation */
    suspend fun create(
        params: CardValidationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation

    /** Retrieve a Card Validation */
    suspend fun retrieve(
        cardValidationId: String,
        params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation =
        retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: CardValidationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation

    /** @see retrieve */
    suspend fun retrieve(cardValidationId: String, requestOptions: RequestOptions): CardValidation =
        retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

    /** List Card Validations */
    suspend fun list(
        params: CardValidationListParams = CardValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidationListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): CardValidationListResponse =
        list(CardValidationListParams.none(), requestOptions)

    /**
     * A view of [CardValidationServiceAsync] that provides access to raw HTTP responses for each
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
        ): CardValidationServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_validations`, but is otherwise the same as
         * [CardValidationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CardValidationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation>

        /**
         * Returns a raw HTTP response for `get /card_validations/{card_validation_id}`, but is
         * otherwise the same as [CardValidationServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            cardValidationId: String,
            params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation> =
            retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: CardValidationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            cardValidationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidation> =
            retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_validations`, but is otherwise the same as
         * [CardValidationServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardValidationListParams = CardValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidationListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardValidationListResponse> =
            list(CardValidationListParams.none(), requestOptions)
    }
}
