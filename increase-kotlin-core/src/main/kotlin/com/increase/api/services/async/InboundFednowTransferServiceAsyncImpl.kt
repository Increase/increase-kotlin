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
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransfer
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListParams
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferListResponse
import com.increase.api.models.inboundfednowtransfers.InboundFednowTransferRetrieveParams

class InboundFednowTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundFednowTransferServiceAsync {

    private val withRawResponse: InboundFednowTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFednowTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundFednowTransferServiceAsync =
        InboundFednowTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: InboundFednowTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundFednowTransfer =
        // get /inbound_fednow_transfers/{inbound_fednow_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundFednowTransferListParams,
        requestOptions: RequestOptions,
    ): InboundFednowTransferListResponse =
        // get /inbound_fednow_transfers
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFednowTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundFednowTransferServiceAsync.WithRawResponse =
            InboundFednowTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<InboundFednowTransfer> =
            jsonHandler<InboundFednowTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InboundFednowTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFednowTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundFednowTransferId", params.inboundFednowTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_fednow_transfers", params._pathParam(0))
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

        private val listHandler: Handler<InboundFednowTransferListResponse> =
            jsonHandler<InboundFednowTransferListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InboundFednowTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFednowTransferListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_fednow_transfers")
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
