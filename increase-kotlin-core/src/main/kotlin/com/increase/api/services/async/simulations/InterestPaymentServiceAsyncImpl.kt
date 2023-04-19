package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InterestPaymentSimulationResult
import com.increase.api.models.SimulationsInterestPaymentCreateParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class InterestPaymentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : InterestPaymentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<InterestPaymentSimulationResult> =
        jsonHandler<InterestPaymentSimulationResult>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /**
     * Simulates an interest payment to your account. In production, this happens automatically on
     * the first of each month.
     */
    override suspend fun create(
        params: SimulationsInterestPaymentCreateParams,
        requestOptions: RequestOptions
    ): InterestPaymentSimulationResult {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "interest_payment")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .let { createHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
