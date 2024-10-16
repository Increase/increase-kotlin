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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardPurchaseSupplement
import com.increase.api.models.CardPurchaseSupplementListPageAsync
import com.increase.api.models.CardPurchaseSupplementListParams
import com.increase.api.models.CardPurchaseSupplementRetrieveParams

class CardPurchaseSupplementServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : CardPurchaseSupplementServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<CardPurchaseSupplement> =
        jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Card Purchase Supplement */
    override suspend fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions
    ): CardPurchaseSupplement {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_purchase_supplements", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
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

    private val listHandler: Handler<CardPurchaseSupplementListPageAsync.Response> =
        jsonHandler<CardPurchaseSupplementListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Card Purchase Supplements */
    override suspend fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions
    ): CardPurchaseSupplementListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("card_purchase_supplements")
                .putAllQueryParams(clientOptions.queryParams)
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
                .let { CardPurchaseSupplementListPageAsync.of(this, params, it) }
        }
    }
}
