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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.SimulationInboundFundsHoldReleaseParams
import com.increase.api.models.SimulationInboundFundsHoldReleaseResponse

class InboundFundsHoldServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InboundFundsHoldServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val releaseHandler: Handler<SimulationInboundFundsHoldReleaseResponse> =
        jsonHandler<SimulationInboundFundsHoldReleaseResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    override suspend fun release(
        params: SimulationInboundFundsHoldReleaseParams,
        requestOptions: RequestOptions
    ): SimulationInboundFundsHoldReleaseResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "simulations",
                    "inbound_funds_holds",
                    params.getPathParam(0),
                    "release"
                )
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { releaseHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
