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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateResponse

class DigitalWalletTokenRequestServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DigitalWalletTokenRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SimulationDigitalWalletTokenRequestCreateResponse> =
        jsonHandler<SimulationDigitalWalletTokenRequestCreateResponse>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Simulates a user attempting add a [Card](#cards) to a digital wallet such as Apple Pay. */
    override suspend fun create(
        params: SimulationDigitalWalletTokenRequestCreateParams,
        requestOptions: RequestOptions
    ): SimulationDigitalWalletTokenRequestCreateResponse {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "digital_wallet_token_requests")
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
