// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Card
import com.increase.api.models.CardCreateParams
import com.increase.api.models.CardDetails
import com.increase.api.models.CardListPageAsync
import com.increase.api.models.CardListParams
import com.increase.api.models.CardRetrieveParams
import com.increase.api.models.CardRetrieveSensitiveDetailsParams
import com.increase.api.models.CardUpdateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class CardServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card */
    override suspend fun create(params: CardCreateParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("cards")
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

    private val retrieveHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card */
    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions
    ): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards", params.getPathParam(0))
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

    private val updateHandler: Handler<Card> =
        jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Card */
    override suspend fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("cards", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { updateHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<CardListPageAsync.Response> =
        jsonHandler<CardListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Cards */
    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions
    ): CardListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards")
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
                .let { CardListPageAsync.of(this, params, it) }
        }
    }

    private val retrieveSensitiveDetailsHandler: Handler<CardDetails> =
        jsonHandler<CardDetails>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve sensitive details for a Card */
    override suspend fun retrieveSensitiveDetails(
        params: CardRetrieveSensitiveDetailsParams,
        requestOptions: RequestOptions
    ): CardDetails {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("cards", params.getPathParam(0), "details")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveSensitiveDetailsHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
