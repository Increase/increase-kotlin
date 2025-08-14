// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.models.cardvalidations.CardValidation
import com.increase.api.models.cardvalidations.CardValidationCreateParams
import com.increase.api.models.cardvalidations.CardValidationListPage
import com.increase.api.models.cardvalidations.CardValidationListPageResponse
import com.increase.api.models.cardvalidations.CardValidationListParams
import com.increase.api.models.cardvalidations.CardValidationRetrieveParams

class CardValidationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    CardValidationService {

    private val withRawResponse: CardValidationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardValidationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CardValidationService =
        CardValidationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: CardValidationCreateParams,
        requestOptions: RequestOptions,
    ): CardValidation =
        // post /card_validations
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: CardValidationRetrieveParams,
        requestOptions: RequestOptions,
    ): CardValidation =
        // get /card_validations/{card_validation_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: CardValidationListParams,
        requestOptions: RequestOptions,
    ): CardValidationListPage =
        // get /card_validations
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardValidationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardValidationService.WithRawResponse =
            CardValidationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CardValidation> =
            jsonHandler<CardValidation>(clientOptions.jsonMapper)

        override fun create(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
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
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<CardValidationListPageResponse> =
            jsonHandler<CardValidationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: CardValidationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardValidationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_validations")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        CardValidationListPage.builder()
                            .service(CardValidationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
