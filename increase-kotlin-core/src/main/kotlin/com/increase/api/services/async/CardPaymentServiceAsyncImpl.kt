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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.cardpayments.CardPaymentListParams
import com.increase.api.models.cardpayments.CardPaymentListResponse
import com.increase.api.models.cardpayments.CardPaymentRetrieveParams

class CardPaymentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardPaymentServiceAsync {

    private val withRawResponse: CardPaymentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPaymentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardPaymentServiceAsync =
        CardPaymentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: CardPaymentRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // get /card_payments/{card_payment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CardPaymentListParams,
        requestOptions: RequestOptions,
    ): CardPaymentListResponse =
        // get /card_payments
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPaymentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardPaymentServiceAsync.WithRawResponse =
            CardPaymentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardPaymentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPaymentId", params.cardPaymentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments", params._pathParam(0))
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

        private val listHandler: Handler<CardPaymentListResponse> =
            jsonHandler<CardPaymentListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardPaymentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPaymentListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_payments")
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
            }
        }
    }
}
