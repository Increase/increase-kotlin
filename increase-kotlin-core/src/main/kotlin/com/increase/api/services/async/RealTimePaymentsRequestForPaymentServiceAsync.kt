// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.RealTimePaymentsRequestForPayment
import com.increase.api.models.RealTimePaymentsRequestForPaymentCreateParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentListPageAsync
import com.increase.api.models.RealTimePaymentsRequestForPaymentListParams
import com.increase.api.models.RealTimePaymentsRequestForPaymentRetrieveParams

interface RealTimePaymentsRequestForPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Real-Time Payments Request for Payment */
    suspend fun create(
        params: RealTimePaymentsRequestForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    suspend fun retrieve(
        params: RealTimePaymentsRequestForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** List Real-Time Payments Request for Payments */
    suspend fun list(
        params: RealTimePaymentsRequestForPaymentListParams =
            RealTimePaymentsRequestForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPaymentListPageAsync

    /** List Real-Time Payments Request for Payments */
    suspend fun list(
        requestOptions: RequestOptions
    ): RealTimePaymentsRequestForPaymentListPageAsync =
        list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)

    /**
     * A view of [RealTimePaymentsRequestForPaymentServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RealTimePaymentsRequestForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_request_for_payments/{request_for_payment_id}`, but is otherwise the
         * same as [RealTimePaymentsRequestForPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: RealTimePaymentsRequestForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RealTimePaymentsRequestForPaymentListParams =
                RealTimePaymentsRequestForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPaymentListPageAsync>

        /**
         * Returns a raw HTTP response for `get /real_time_payments_request_for_payments`, but is
         * otherwise the same as [RealTimePaymentsRequestForPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsRequestForPaymentListPageAsync> =
            list(RealTimePaymentsRequestForPaymentListParams.none(), requestOptions)
    }
}
