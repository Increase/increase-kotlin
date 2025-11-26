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
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequest
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestCreateParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListPageAsync
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListPageResponse
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestListParams
import com.increase.api.models.wiredrawdownrequests.WireDrawdownRequestRetrieveParams

class WireDrawdownRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : WireDrawdownRequestServiceAsync {

    private val withRawResponse: WireDrawdownRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): WireDrawdownRequestServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): WireDrawdownRequestServiceAsync =
        WireDrawdownRequestServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: WireDrawdownRequestCreateParams,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        // post /wire_drawdown_requests
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: WireDrawdownRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): WireDrawdownRequest =
        // get /wire_drawdown_requests/{wire_drawdown_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: WireDrawdownRequestListParams,
        requestOptions: RequestOptions,
    ): WireDrawdownRequestListPageAsync =
        // get /wire_drawdown_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        WireDrawdownRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): WireDrawdownRequestServiceAsync.WithRawResponse =
            WireDrawdownRequestServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)

        override suspend fun create(
            params: WireDrawdownRequestCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_drawdown_requests")
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

        private val retrieveHandler: Handler<WireDrawdownRequest> =
            jsonHandler<WireDrawdownRequest>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: WireDrawdownRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequest> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("wireDrawdownRequestId", params.wireDrawdownRequestId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_drawdown_requests", params._pathParam(0))
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

        private val listHandler: Handler<WireDrawdownRequestListPageResponse> =
            jsonHandler<WireDrawdownRequestListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: WireDrawdownRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<WireDrawdownRequestListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("wire_drawdown_requests")
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
                        WireDrawdownRequestListPageAsync.builder()
                            .service(WireDrawdownRequestServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
