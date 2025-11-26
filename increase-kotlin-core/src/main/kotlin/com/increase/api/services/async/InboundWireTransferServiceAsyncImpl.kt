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
import com.increase.api.models.inboundwiretransfers.InboundWireTransfer
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageAsync
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListPageResponse
import com.increase.api.models.inboundwiretransfers.InboundWireTransferListParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferRetrieveParams
import com.increase.api.models.inboundwiretransfers.InboundWireTransferReverseParams

class InboundWireTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundWireTransferServiceAsync {

    private val withRawResponse: InboundWireTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireTransferServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundWireTransferServiceAsync =
        InboundWireTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: InboundWireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        // get /inbound_wire_transfers/{inbound_wire_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundWireTransferListParams,
        requestOptions: RequestOptions,
    ): InboundWireTransferListPageAsync =
        // get /inbound_wire_transfers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun reverse(
        params: InboundWireTransferReverseParams,
        requestOptions: RequestOptions,
    ): InboundWireTransfer =
        // post /inbound_wire_transfers/{inbound_wire_transfer_id}/reverse
        withRawResponse().reverse(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundWireTransferServiceAsync.WithRawResponse =
            InboundWireTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InboundWireTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundWireTransferId", params.inboundWireTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_transfers", params._pathParam(0))
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

        private val listHandler: Handler<InboundWireTransferListPageResponse> =
            jsonHandler<InboundWireTransferListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InboundWireTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_transfers")
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
                        InboundWireTransferListPageAsync.builder()
                            .service(InboundWireTransferServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val reverseHandler: Handler<InboundWireTransfer> =
            jsonHandler<InboundWireTransfer>(clientOptions.jsonMapper)

        override suspend fun reverse(
            params: InboundWireTransferReverseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundWireTransferId", params.inboundWireTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_transfers", params._pathParam(0), "reverse")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { reverseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
