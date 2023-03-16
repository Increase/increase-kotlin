package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPageAsync
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class CardDisputeServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardDisputeServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card Dispute */
    override suspend fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions
    ): CardDispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card_disputes")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val retrieveHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Dispute */
    override suspend fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions
    ): CardDispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardDisputeListPageAsync.Response> =
        jsonHandler<CardDisputeListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Disputes */
    override suspend fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions
    ): CardDisputeListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { CardDisputeListPageAsync.of(this, params, it) }
        }
    }
}
