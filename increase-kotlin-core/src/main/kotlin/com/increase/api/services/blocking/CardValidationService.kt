// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardvalidations.CardValidation
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListPage
import com.increase.api.models.cardvalidations.CardValidationListParams
import com.increase.api.models.cardvalidations.CardValidationRetrieveParams

interface CardValidationService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardValidationService

    /** Create a Card Validation */
    fun create(
        params: CardValidationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation

    /** Retrieve a Card Validation */
    fun retrieve(
        cardValidationId: String,
        params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation =
        retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: CardValidationRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidation

    /** @see retrieve */
    fun retrieve(cardValidationId: String, requestOptions: RequestOptions): CardValidation =
        retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

    /** List Card Validations */
    fun list(
        params: CardValidationListParams = CardValidationListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardValidationListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): CardValidationListPage =
        list(CardValidationListParams.none(), requestOptions)

    /**
     * A view of [CardValidationService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardValidationService.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /card_validations`, but is otherwise the same as
         * [CardValidationService.create].
         */
        @MustBeClosed
        fun create(
            params: CardValidationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation>

        /**
         * Returns a raw HTTP response for `get /card_validations/{card_validation_id}`, but is
         * otherwise the same as [CardValidationService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            cardValidationId: String,
            params: CardValidationRetrieveParams = CardValidationRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation> =
            retrieve(params.toBuilder().cardValidationId(cardValidationId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: CardValidationRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidation>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            cardValidationId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidation> =
            retrieve(cardValidationId, CardValidationRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /card_validations`, but is otherwise the same as
         * [CardValidationService.list].
         */
        @MustBeClosed
        fun list(
            params: CardValidationListParams = CardValidationListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardValidationListPage>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardValidationListPage> =
            list(CardValidationListParams.none(), requestOptions)
    }
}
