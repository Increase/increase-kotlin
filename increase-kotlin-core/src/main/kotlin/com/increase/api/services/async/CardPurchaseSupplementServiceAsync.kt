// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListPageAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams

interface CardPurchaseSupplementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Purchase Supplement */
    suspend fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement

    /** List Card Purchase Supplements */
    suspend fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplementListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CardPurchaseSupplementListPageAsync =
        list(CardPurchaseSupplementListParams.none(), requestOptions)

    /**
     * A view of [CardPurchaseSupplementServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /card_purchase_supplements/{card_purchase_supplement_id}`, but is otherwise the same as
         * [CardPurchaseSupplementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplement>

        /**
         * Returns a raw HTTP response for `get /card_purchase_supplements`, but is otherwise the
         * same as [CardPurchaseSupplementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplementListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CardPurchaseSupplementListPageAsync> =
            list(CardPurchaseSupplementListParams.none(), requestOptions)
    }
}
