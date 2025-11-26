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
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransfer
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListParams
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferListResponse
import com.increase.api.models.inboundrealtimepaymentstransfers.InboundRealTimePaymentsTransferRetrieveParams

class InboundRealTimePaymentsTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundRealTimePaymentsTransferServiceAsync {

    private val withRawResponse:
        InboundRealTimePaymentsTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundRealTimePaymentsTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundRealTimePaymentsTransferServiceAsync =
        InboundRealTimePaymentsTransferServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier).build()
        )

    override suspend fun retrieve(
        params: InboundRealTimePaymentsTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransfer =
        // get /inbound_real_time_payments_transfers/{inbound_real_time_payments_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundRealTimePaymentsTransferListParams,
        requestOptions: RequestOptions,
    ): InboundRealTimePaymentsTransferListResponse =
        // get /inbound_real_time_payments_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundRealTimePaymentsTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundRealTimePaymentsTransferServiceAsync.WithRawResponse =
            InboundRealTimePaymentsTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<InboundRealTimePaymentsTransfer> =
            jsonHandler<InboundRealTimePaymentsTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InboundRealTimePaymentsTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired(
                "inboundRealTimePaymentsTransferId",
                params.inboundRealTimePaymentsTransferId(),
            )
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_real_time_payments_transfers", params._pathParam(0))
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

        private val listHandler: Handler<InboundRealTimePaymentsTransferListResponse> =
            jsonHandler<InboundRealTimePaymentsTransferListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InboundRealTimePaymentsTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundRealTimePaymentsTransferListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_real_time_payments_transfers")
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
