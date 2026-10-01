// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestForPayment
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListPageAsync
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentRetrieveParams

interface InboundRealTimePaymentsRequestsForPaymentServiceAsync {

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
    ): InboundRealTimePaymentsRequestsForPaymentServiceAsync

    /** Retrieve an Inbound Real-Time Payments Request for Payment */
    suspend fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsRequestForPayment =
        retrieve(
            params
                .toBuilder()
                .inboundRealTimePaymentsRequestForPaymentId(
                    inboundRealTimePaymentsRequestForPaymentId
                )
                .build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsRequestForPayment

    /** @see retrieve */
    suspend fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsRequestForPayment =
        retrieve(
            inboundRealTimePaymentsRequestForPaymentId,
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Requests for Payment */
    suspend fun list(
        params: InboundRealTimePaymentsRequestsForPaymentListParams =
            InboundRealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsRequestsForPaymentListPageAsync

    /** @see list */
    suspend fun list(
        requestOptions: RequestOptions
    ): InboundRealTimePaymentsRequestsForPaymentListPageAsync =
        list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsRequestsForPaymentServiceAsync] that provides access to raw
     * HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundRealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_requests_for_payment/{inbound_real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as
         * [InboundRealTimePaymentsRequestsForPaymentServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String,
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams =
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsRequestForPayment> =
            retrieve(
                params
                    .toBuilder()
                    .inboundRealTimePaymentsRequestForPaymentId(
                        inboundRealTimePaymentsRequestForPaymentId
                    )
                    .build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsRequestForPayment>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            inboundRealTimePaymentsRequestForPaymentId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsRequestForPayment> =
            retrieve(
                inboundRealTimePaymentsRequestForPaymentId,
                InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /inbound_real_time_payments_requests_for_payment`,
         * but is otherwise the same as
         * [InboundRealTimePaymentsRequestsForPaymentServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: InboundRealTimePaymentsRequestsForPaymentListParams =
                InboundRealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPageAsync> =
            list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)
    }
}
