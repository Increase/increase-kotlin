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
import com.increase.api.models.EntitySupplementalDocument
import com.increase.api.models.SupplementalDocumentCreateParams
import com.increase.api.models.SupplementalDocumentListPageAsync
import com.increase.api.models.SupplementalDocumentListParams

class SupplementalDocumentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SupplementalDocumentServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EntitySupplementalDocument> =
        jsonHandler<EntitySupplementalDocument>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** Create a supplemental document for an Entity */
    override suspend fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions,
    ): EntitySupplementalDocument {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entity_supplemental_documents")
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

    private val listHandler: Handler<SupplementalDocumentListPageAsync.Response> =
        jsonHandler<SupplementalDocumentListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Entity Supplemental Document Submissions */
    override suspend fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions,
    ): SupplementalDocumentListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entity_supplemental_documents")
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
            .let { SupplementalDocumentListPageAsync.of(this, params, it) }
    }
}
