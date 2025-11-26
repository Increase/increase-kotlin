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
import com.increase.api.models.cardvalidations.CardValidation
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListParams
import com.increase.api.models.cardvalidations.CardValidationListResponse
import com.increase.api.models.cardvalidations.CardValidationRetrieveParams

class CardValidationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CardValidationServiceAsync {

    private val withRawResponse: CardValidationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardValidationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CardValidationServiceAsync =
        CardValidationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CardValidationCreateParams,
        requestOptions: RequestOptions,
    ): CardValidation =
        // post /card_validations
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardValidationRetrieveParams,
        requestOptions: RequestOptions,
    ): CardValidation =
        // get /card_validations/{card_validation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CardValidationListParams,
        requestOptions: RequestOptions,
    ): CardValidationListResponse =
        // get /card_validations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardValidationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardValidationServiceAsync.WithRawResponse =
            CardValidationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CardValidation> =
            jsonHandler<CardValidation>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CardValidationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidation> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_validations")
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

        private val retrieveHandler: Handler<CardValidation> =
            jsonHandler<CardValidation>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardValidationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidation> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardValidationId", params.cardValidationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_validations", params._pathParam(0))
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

        private val listHandler: Handler<CardValidationListResponse> =
            jsonHandler<CardValidationListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardValidationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_validations")
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
            }
        }
    }
}
