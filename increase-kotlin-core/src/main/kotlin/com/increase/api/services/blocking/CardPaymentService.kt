// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.CardPayment
import com.increase.api.models.CardPaymentListPage
import com.increase.api.models.CardPaymentListParams
import com.increase.api.models.CardPaymentRetrieveParams

interface CardPaymentService {

    /** Retrieve a Card Payment */
    fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPayment

    /** List Card Payments */
    fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): CardPaymentListPage
}
