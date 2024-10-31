// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

interface RealTimePaymentsRequestForPaymentServiceAsync {

    /** Create a Real-Time Payments Request for Payment */
    suspend fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    suspend fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPayment

    /** List Real-Time Payments Request for Payments */
    suspend fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPaymentListPageAsync
}
