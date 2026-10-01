// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestForPayment
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCancelParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCreateParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListPageAsync
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentRetrieveParams

interface RealTimePaymentsRequestsForPaymentServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): RealTimePaymentsRequestsForPaymentServiceAsync

    /** Create a Real-Time Payments Request for Payment */
    suspend fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** Retrieve a Real-Time Payments Request for Payment */
    suspend fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentRetrieveParams =
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment =
        retrieve(
            params
                .toBuilder()
                .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** @see retrieve */
    suspend fun retrieve(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        retrieve(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Real-Time Payments Requests for Payment */
    suspend fun list(
        params: RealTimePaymentsRequestsForPaymentListParams =
            RealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestsForPaymentListPageAsync

    /** @see list */
    suspend fun list(
        requestOptions: RequestOptions
    ): RealTimePaymentsRequestsForPaymentListPageAsync =
        list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /** Cancels a Real-Time Payments Request for Payment that is still awaiting payment. */
    suspend fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        params: RealTimePaymentsRequestsForPaymentCancelParams =
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment =
        cancel(
            params
                .toBuilder()
                .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                .build(),
            requestOptions,
        )

    /** @see cancel */
    suspend fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): RealTimePaymentsRequestForPayment

    /** @see cancel */
    suspend fun cancel(
        realTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        cancel(
            realTimePaymentsRequestForPaymentId,
            RealTimePaymentsRequestsForPaymentCancelParams.none(),
            requestOptions,
        )

    /**
     * A view of [RealTimePaymentsRequestsForPaymentServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /**
         * Returns a raw HTTP response for `get
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentRetrieveParams =
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(
                params
                    .toBuilder()
                    .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            retrieve(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /real_time_payments_requests_for_payment`, but is
         * otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: RealTimePaymentsRequestsForPaymentListParams =
                RealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync> =
            list(RealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}/cancel`,
         * but is otherwise the same as [RealTimePaymentsRequestsForPaymentServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            params: RealTimePaymentsRequestsForPaymentCancelParams =
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(
                params
                    .toBuilder()
                    .realTimePaymentsRequestForPaymentId(realTimePaymentsRequestForPaymentId)
                    .build(),
                requestOptions,
            )

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<RealTimePaymentsRequestForPayment>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            realTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> =
            cancel(
                realTimePaymentsRequestForPaymentId,
                RealTimePaymentsRequestsForPaymentCancelParams.none(),
                requestOptions,
            )
    }
}
