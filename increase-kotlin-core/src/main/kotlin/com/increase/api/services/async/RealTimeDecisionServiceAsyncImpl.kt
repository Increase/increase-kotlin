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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.realtimedecisions.RealTimeDecision
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import com.increase.api.models.realtimedecisions.RealTimeDecisionRetrieveParams

class RealTimeDecisionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : RealTimeDecisionServiceAsync {

    private val withRawResponse: RealTimeDecisionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): RealTimeDecisionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: RealTimeDecisionRetrieveParams,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        // get /real_time_decisions/{real_time_decision_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun action(
        params: RealTimeDecisionActionParams,
        requestOptions: RequestOptions,
    ): RealTimeDecision =
        // post /real_time_decisions/{real_time_decision_id}/action
        withRawResponse().action(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        RealTimeDecisionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: RealTimeDecisionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("real_time_decisions", params.getPathParam(0))
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

        private val actionHandler: Handler<RealTimeDecision> =
            jsonHandler<RealTimeDecision>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun action(
            params: RealTimeDecisionActionParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<RealTimeDecision> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("real_time_decisions", params.getPathParam(0), "action")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { actionHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
