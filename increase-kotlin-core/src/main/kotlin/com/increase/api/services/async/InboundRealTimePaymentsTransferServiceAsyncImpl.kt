// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundRealTimePaymentsTransfer
import com.increase.api.models.InboundRealTimePaymentsTransferListPageAsync
import com.increase.api.models.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.InboundRealTimePaymentsTransferRetrieveParams

class InboundRealTimePaymentsTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundRealTimePaymentsTransferServiceAsync {

    private val withRawResponse:
        InboundRealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundRealTimePaymentsTransferServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransfer =
        // get /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundRealTimePaymentsTransferListParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransferListPageAsync =
        // get /inbound_real_time_payments_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundRealTimePaymentsTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundRealTimePaymentsTransfer> =
            jsonHandler<InboundRealTimePaymentsTransfer>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_real_time_payments_transfers", params.getPathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<InboundRealTimePaymentsTransferListPageAsync.Response> =
            jsonHandler<InboundRealTimePaymentsTransferListPageAsync.Response>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: InboundRealTimePaymentsTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_real_time_payments_transfers")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        InboundRealTimePaymentsTransferListPageAsync.of(
                            InboundRealTimePaymentsTransferServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
