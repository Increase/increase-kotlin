// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.intrafi

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiBalance
import com.increase.api.models.IntrafiBalanceRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class BalanceServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : BalanceServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<IntrafiBalance> =
        jsonHandler<IntrafiBalance>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get IntraFi balances by bank */
    override suspend fun retrieve(
        params: IntrafiBalanceRetrieveParams,
        requestOptions: RequestOptions
    ): IntrafiBalance {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("intrafi_balances", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
