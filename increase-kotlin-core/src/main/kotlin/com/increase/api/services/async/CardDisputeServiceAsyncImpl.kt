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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardDispute
import com.increase.api.models.CardDisputeCreateParams
import com.increase.api.models.CardDisputeListPageAsync
import com.increase.api.models.CardDisputeListParams
import com.increase.api.models.CardDisputeRetrieveParams

class CardDisputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardDisputeServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Card Dispute */
    override suspend fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions,
    ): CardDispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("card_disputes")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<CardDispute> =
        jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Dispute */
    override suspend fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions,
    ): CardDispute {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<CardDisputeListPageAsync.Response> =
        jsonHandler<CardDisputeListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Disputes */
    override suspend fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions,
    ): CardDisputeListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_disputes")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { CardDisputeListPageAsync.of(this, params, it) }
    }
}
