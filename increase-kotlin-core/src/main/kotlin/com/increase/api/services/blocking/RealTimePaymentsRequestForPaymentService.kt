// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPage
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

interface RealTimePaymentsRequestForPaymentService {

    /** Create a Real-Time Payments Request for Payment */
    fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPayment

    /** List Real-Time Payments Request for Payments */
    fun list(
        params: RealTimePaymentsRequestForPaymentListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): RealTimePaymentsRequestForPaymentListPage
}
