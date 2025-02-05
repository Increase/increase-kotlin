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
import com.increase.api.models.CheckDeposit
import com.increase.api.models.SimulationCheckDepositRejectParams
import com.increase.api.models.SimulationCheckDepositReturnParams
import com.increase.api.models.SimulationCheckDepositSubmitParams

class CheckDepositServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : CheckDepositServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val rejectHandler: Handler<CheckDeposit> =
        jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    override suspend fun reject(
        params: SimulationCheckDepositRejectParams,
        requestOptions: RequestOptions
    ): CheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "reject")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { rejectHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val returnHandler: Handler<CheckDeposit> =
        jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    override suspend fun return_(
        params: SimulationCheckDepositReturnParams,
        requestOptions: RequestOptions
    ): CheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "return")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { returnHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val submitHandler: Handler<CheckDeposit> =
        jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    override suspend fun submit(
        params: SimulationCheckDepositSubmitParams,
        requestOptions: RequestOptions
    ): CheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "submit")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { submitHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
