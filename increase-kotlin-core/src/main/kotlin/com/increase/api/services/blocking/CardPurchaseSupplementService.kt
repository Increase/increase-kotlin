// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPage
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams

interface CardPurchaseSupplementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Card Purchase Supplement */
    fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplement

    /** List Card Purchase Supplements */
    fun list(
        params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPurchaseSupplementListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): CardPurchaseSupplementListPage =
        list(CardPurchaseSupplementListParams.none(), requestOptions)

    /**
     * A view of [CardPurchaseSupplementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get
         * /card_purchase_supplements/{card_purchase_supplement_id}`, but is otherwise the same as
         * [CardPurchaseSupplementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplement>

        /**
         * Returns a raw HTTP response for `get /card_purchase_supplements`, but is otherwise the
         * same as [CardPurchaseSupplementService.list].
         */
        @MustBeClosed
        fun list(
            params: CardPurchaseSupplementListParams = CardPurchaseSupplementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPurchaseSupplementListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<CardPurchaseSupplementListPage> =
            list(CardPurchaseSupplementListParams.none(), requestOptions)
    }
}
