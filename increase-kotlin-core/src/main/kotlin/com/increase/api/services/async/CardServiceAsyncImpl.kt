// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.cards.Card
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetails
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardListPageAsync
import com.increase.api.models.cards.CardListPageResponse
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams

class CardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardServiceAsync {

    private val withRawResponse: CardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardServiceAsync =
        CardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(params: CardCreateParams, requestOptions: RequestOptions): Card =
        // post /cards
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardRetrieveParams,
        requestOptions: RequestOptions,
    ): Card =
        // get /cards/{card_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(params: CardUpdateParams, requestOptions: RequestOptions): Card =
        // patch /cards/{card_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: CardListParams,
        requestOptions: RequestOptions,
    ): CardListPageAsync =
        // get /cards
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun details(
        params: CardDetailsParams,
        requestOptions: RequestOptions,
    ): CardDetails =
        // get /cards/{card_id}/details
        withRawResponse().details(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardServiceAsync.WithRawResponse =
            CardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CardCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CardRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateHandler: Handler<Card> =
            jsonHandler<Card>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: CardUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Card> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CardListPageResponse> =
            jsonHandler<CardListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CardListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CardListPageAsync.builder()
                            .service(CardServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val detailsHandler: Handler<CardDetails> =
            jsonHandler<CardDetails>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun details(
            params: CardDetailsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDetails> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardId", params.cardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("cards", params._pathParam(0), "details")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { detailsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
