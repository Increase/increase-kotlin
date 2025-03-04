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
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import com.increase.api.models.SimulationInboundFundsHoldReleaseResponse

class InboundFundsHoldServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundFundsHoldServiceAsync {

    private val withRawResponse: InboundFundsHoldServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundFundsHoldServiceAsync.WithRawResponse = withRawResponse

    override suspend fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions,
    ): SimulationInboundFundsHoldReleaseResponse =
        // post /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release
        withRawResponse().release(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundFundsHoldServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val releaseHandler: Handler<SimulationInboundFundsHoldReleaseResponse> =
            jsonHandler<SimulationInboundFundsHoldReleaseResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun release(
            params: SimulationInboundFundsHoldReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SimulationInboundFundsHoldReleaseResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments(
                        "simulations",
                        "inbound_funds_holds",
                        params.getPathParam(0),
                        "release",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { releaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
