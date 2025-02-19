// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPageAsync
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams

interface CardPaymentServiceAsync {

    /** Retrieve a Card Payment */
    suspend fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /** List Card Payments */
    suspend fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPaymentListPageAsync
}
