package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundAchTransferReturn
import com.increase.api.models.InboundAchTransferReturnCreateParams
import com.increase.api.models.InboundAchTransferReturnListPageAsync
import com.increase.api.models.InboundAchTransferReturnListParams
import com.increase.api.models.InboundAchTransferReturnRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InboundAchTransferReturnServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InboundAchTransferReturnServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InboundAchTransferReturn> =
        jsonHandler<InboundAchTransferReturn>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create an ACH Return */
    override suspend fun create(
        params: InboundAchTransferReturnCreateParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_ach_transfer_returns")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<InboundAchTransferReturn> =
        jsonHandler<InboundAchTransferReturn>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Retrieve an Inbound ACH Transfer Return */
    override suspend fun retrieve(
        params: InboundAchTransferReturnRetrieveParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturn {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfer_returns", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundAchTransferReturnListPageAsync.Response> =
        jsonHandler<InboundAchTransferReturnListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound ACH Transfer Returns */
    override suspend fun list(
        params: InboundAchTransferReturnListParams,
        requestOptions: RequestOptions
    ): InboundAchTransferReturnListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_ach_transfer_returns")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundAchTransferReturnListPageAsync.of(this, params, it) }
        }
    }
}
