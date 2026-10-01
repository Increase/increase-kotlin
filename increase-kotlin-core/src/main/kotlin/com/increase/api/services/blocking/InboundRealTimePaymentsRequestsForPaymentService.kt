// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestForPayment
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListPage
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.inboundrealtimepaymentsrequestsforpayment.InboundRealTimePaymentsRequestsForPaymentRetrieveParams

interface InboundRealTimePaymentsRequestsForPaymentService {

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
    ): InboundRealTimePaymentsRequestsForPaymentService

    /** Retrieve an Inbound Real-Time Payments Request for Payment */
    fun retrieve(
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
    fun retrieve(
        params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsRequestForPayment

    /** @see retrieve */
    fun retrieve(
        inboundRealTimePaymentsRequestForPaymentId: String,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsRequestForPayment =
        retrieve(
            inboundRealTimePaymentsRequestForPaymentId,
            InboundRealTimePaymentsRequestsForPaymentRetrieveParams.none(),
            requestOptions,
        )

    /** List Inbound Real-Time Payments Requests for Payment */
    fun list(
        params: InboundRealTimePaymentsRequestsForPaymentListParams =
            InboundRealTimePaymentsRequestsForPaymentListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundRealTimePaymentsRequestsForPaymentListPage

    /** @see list */
    fun list(requestOptions: RequestOptions): InboundRealTimePaymentsRequestsForPaymentListPage =
        list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)

    /**
     * A view of [InboundRealTimePaymentsRequestsForPaymentService] that provides access to raw HTTP
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
        ): InboundRealTimePaymentsRequestsForPaymentService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get
         * /inbound_real_time_payments_requests_for_payment/{inbound_real_time_payments_request_for_payment_id}`,
         * but is otherwise the same as [InboundRealTimePaymentsRequestsForPaymentService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
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
        fun retrieve(
            params: InboundRealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsRequestForPayment>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
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
         * but is otherwise the same as [InboundRealTimePaymentsRequestsForPaymentService.list].
         */
        @MustBeClosed
        fun list(
            params: InboundRealTimePaymentsRequestsForPaymentListParams =
                InboundRealTimePaymentsRequestsForPaymentListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPage>

        /** @see list */
        @MustBeClosed
        fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<InboundRealTimePaymentsRequestsForPaymentListPage> =
            list(InboundRealTimePaymentsRequestsForPaymentListParams.none(), requestOptions)
    }
}
