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
import com.increase.api.models.carddisputes.CardDispute
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import com.increase.api.models.carddisputes.CardDisputeListPageAsync
import com.increase.api.models.carddisputes.CardDisputeListPageResponse
import com.increase.api.models.carddisputes.CardDisputeListParams
import com.increase.api.models.carddisputes.CardDisputeRetrieveParams

class CardDisputeServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardDisputeServiceAsync {

    private val withRawResponse: CardDisputeServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardDisputeServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: CardDisputeCreateParams,
        requestOptions: RequestOptions,
    ): CardDispute =
        // post /card_disputes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardDisputeRetrieveParams,
        requestOptions: RequestOptions,
    ): CardDispute =
        // get /card_disputes/{card_dispute_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CardDisputeListParams,
        requestOptions: RequestOptions,
    ): CardDisputeListPageAsync =
        // get /card_disputes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardDisputeServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CardDispute> =
            jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: CardDisputeCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("card_disputes")
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

        private val retrieveHandler: Handler<CardDispute> =
            jsonHandler<CardDispute>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: CardDisputeRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDispute> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardDisputeId", params.cardDisputeId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card_disputes", params._pathParam(0))
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

        private val listHandler: Handler<CardDisputeListPageResponse> =
            jsonHandler<CardDisputeListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: CardDisputeListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardDisputeListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("card_disputes")
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
                        CardDisputeListPageAsync.builder()
                            .service(CardDisputeServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
