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
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPageAsync
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams

class ExternalAccountServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : ExternalAccountServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an External Account */
    override suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("external_accounts")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an External Account */
    override suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions,
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<ExternalAccount> =
        jsonHandler<ExternalAccount>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an External Account */
    override suspend fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions,
    ): ExternalAccount {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("external_accounts", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ExternalAccountListPageAsync.Response> =
        jsonHandler<ExternalAccountListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List External Accounts */
    override suspend fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions,
    ): ExternalAccountListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("external_accounts")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ExternalAccountListPageAsync.of(this, params, it) }
    }
}
