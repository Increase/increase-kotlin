package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.DigitalWalletToken
import com.increase.api.models.DigitalWalletTokenListPageAsync
import com.increase.api.models.DigitalWalletTokenListParams
import com.increase.api.models.DigitalWalletTokenRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class DigitalWalletTokenServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DigitalWalletTokenServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DigitalWalletToken> =
        jsonHandler<DigitalWalletToken>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Digital Wallet Token */
    override suspend fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions
    ): DigitalWalletToken {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("digital_wallet_tokens", params.getPathParam(0))
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

    private val listHandler: Handler<DigitalWalletTokenListPageAsync.Response> =
        jsonHandler<DigitalWalletTokenListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Digital Wallet Tokens */
    override suspend fun list(
        params: DigitalWalletTokenListParams,
        requestOptions: RequestOptions
    ): DigitalWalletTokenListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("digital_wallet_tokens")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { DigitalWalletTokenListPageAsync.of(this, params, it) }
        }
    }
}
