// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Document
import com.increase.api.models.DocumentListPageAsync
import com.increase.api.models.DocumentListParams
import com.increase.api.models.DocumentRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class DocumentServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DocumentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<Document> =
        jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Document */
    override suspend fun retrieve(
        params: DocumentRetrieveParams,
        requestOptions: RequestOptions
    ): Document {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("documents", params.getPathParam(0))
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

    private val listHandler: Handler<DocumentListPageAsync.Response> =
        jsonHandler<DocumentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Documents */
    override suspend fun list(
        params: DocumentListParams,
        requestOptions: RequestOptions
    ): DocumentListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("documents")
                .putAllQueryParams(clientOptions.queryParams)
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
                .let { DocumentListPageAsync.of(this, params, it) }
        }
    }
}
