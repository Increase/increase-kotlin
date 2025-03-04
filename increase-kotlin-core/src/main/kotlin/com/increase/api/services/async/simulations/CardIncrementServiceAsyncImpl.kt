// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardIncrementCreateParams

class CardIncrementServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CardIncrementServiceAsync {

    private val withRawResponse: CardIncrementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardIncrementServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: SimulationCardIncrementCreateParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // post /simulations/card_increments
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardIncrementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: SimulationCardIncrementCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("simulations", "card_increments")
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
    }
}
