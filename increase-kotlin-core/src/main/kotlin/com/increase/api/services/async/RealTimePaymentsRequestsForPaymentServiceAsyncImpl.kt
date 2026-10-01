// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestForPayment
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCancelParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentCreateParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListPageAsync
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListPageResponse
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentListParams
import com.increase.api.models.realtimepaymentsrequestsforpayment.RealTimePaymentsRequestsForPaymentRetrieveParams

class RealTimePaymentsRequestsForPaymentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    RealTimePaymentsRequestsForPaymentServiceAsync {

    private val withRawResponse:
        RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): RealTimePaymentsRequestsForPaymentServiceAsync =
        RealTimePaymentsRequestsForPaymentServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier).build()
        )

    override suspend fun create(
        params: RealTimePaymentsRequestsForPaymentCreateParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        // post /real_time_payments_requests_for_payment
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: RealTimePaymentsRequestsForPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        // get /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: RealTimePaymentsRequestsForPaymentListParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestsForPaymentListPageAsync =
        // get /real_time_payments_requests_for_payment
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun cancel(
        params: RealTimePaymentsRequestsForPaymentCancelParams,
        requestOptions: RequestOptions,
    ): RealTimePaymentsRequestForPayment =
        // post
        // /real_time_payments_requests_for_payment/{real_time_payments_request_for_payment_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): RealTimePaymentsRequestsForPaymentServiceAsync.WithRawResponse =
            RealTimePaymentsRequestsForPaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<RealTimePaymentsRequestForPayment> =
            jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)

        override suspend fun create(
            params: RealTimePaymentsRequestsForPaymentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("real_time_payments_requests_for_payment")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<RealTimePaymentsRequestForPayment> =
            jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: RealTimePaymentsRequestsForPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "realTimePaymentsRequestForPaymentId",
                params.realTimePaymentsRequestForPaymentId(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "real_time_payments_requests_for_payment",
                        params._pathParam(0),
                    )
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<RealTimePaymentsRequestsForPaymentListPageResponse> =
            jsonHandler<RealTimePaymentsRequestsForPaymentListPageResponse>(
                clientOptions.jsonMapper
            )

        override suspend fun list(
            params: RealTimePaymentsRequestsForPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestsForPaymentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("real_time_payments_requests_for_payment")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        RealTimePaymentsRequestsForPaymentListPageAsync.builder()
                            .service(
                                RealTimePaymentsRequestsForPaymentServiceAsyncImpl(clientOptions)
                            )
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val cancelHandler: Handler<RealTimePaymentsRequestForPayment> =
            jsonHandler<RealTimePaymentsRequestForPayment>(clientOptions.jsonMapper)

        override suspend fun cancel(
            params: RealTimePaymentsRequestsForPaymentCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimePaymentsRequestForPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "realTimePaymentsRequestForPaymentId",
                params.realTimePaymentsRequestForPaymentId(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "real_time_payments_requests_for_payment",
                        params._pathParam(0),
                        "cancel",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
