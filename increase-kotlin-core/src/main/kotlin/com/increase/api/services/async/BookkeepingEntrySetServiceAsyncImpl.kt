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
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPageAsync
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams

class BookkeepingEntrySetServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : BookkeepingEntrySetServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<BookkeepingEntrySet> =
        jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Bookkeeping Entry Set */
    override suspend fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions
    ): BookkeepingEntrySet {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("bookkeeping_entry_sets")
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

    private val retrieveHandler: Handler<BookkeepingEntrySet> =
        jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Bookkeeping Entry Set */
    override suspend fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions
    ): BookkeepingEntrySet {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_entry_sets", params.getPathParam(0))
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

    private val listHandler: Handler<BookkeepingEntrySetListPageAsync.Response> =
        jsonHandler<BookkeepingEntrySetListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Bookkeeping Entry Sets */
    override suspend fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions
    ): BookkeepingEntrySetListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("bookkeeping_entry_sets")
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
            .let { BookkeepingEntrySetListPageAsync.of(this, params, it) }
    }
}
