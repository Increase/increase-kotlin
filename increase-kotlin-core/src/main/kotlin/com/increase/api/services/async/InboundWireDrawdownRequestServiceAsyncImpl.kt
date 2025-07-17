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
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequest
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListPageResponse
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestListParams
import com.increase.api.models.inboundwiredrawdownrequests.InboundWireDrawdownRequestRetrieveParams

class InboundWireDrawdownRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    InboundWireDrawdownRequestServiceAsync {

    private val withRawResponse: InboundWireDrawdownRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundWireDrawdownRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundWireDrawdownRequestServiceAsync =
        InboundWireDrawdownRequestServiceAsyncImpl(
            clientOptions.toBuilder().apply(modifier).build()
        )

    override suspend fun retrieve(
        params: InboundWireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequest =
        // get /inbound_wire_drawdown_requests/{inbound_wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundWireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): InboundWireDrawdownRequestListPageAsync =
        // get /inbound_wire_drawdown_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundWireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundWireDrawdownRequestServiceAsync.WithRawResponse =
            InboundWireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
            jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InboundWireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundWireDrawdownRequestId", params.inboundWireDrawdownRequestId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests", params._pathParam(0))
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

        private val listHandler: Handler<InboundWireDrawdownRequestListPageResponse> =
            jsonHandler<InboundWireDrawdownRequestListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InboundWireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundWireDrawdownRequestListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_wire_drawdown_requests")
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
                        InboundWireDrawdownRequestListPageAsync.builder()
                            .service(InboundWireDrawdownRequestServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
