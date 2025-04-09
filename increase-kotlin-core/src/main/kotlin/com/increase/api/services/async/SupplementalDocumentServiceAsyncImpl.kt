// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.supplementaldocuments.EntitySupplementalDocument
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListPageAsync
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListPageResponse
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams

class SupplementalDocumentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : SupplementalDocumentServiceAsync {

    private val withRawResponse: SupplementalDocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SupplementalDocumentServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: SupplementalDocumentCreateParams,
        requestOptions: RequestOptions,
    ): EntitySupplementalDocument =
        // post /entity_supplemental_documents
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun list(
        params: SupplementalDocumentListParams,
        requestOptions: RequestOptions,
    ): SupplementalDocumentListPageAsync =
        // get /entity_supplemental_documents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SupplementalDocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<EntitySupplementalDocument> =
            jsonHandler<EntitySupplementalDocument>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: SupplementalDocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntitySupplementalDocument> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("entity_supplemental_documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<SupplementalDocumentListPageResponse> =
            jsonHandler<SupplementalDocumentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: SupplementalDocumentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SupplementalDocumentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("entity_supplemental_documents")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        SupplementalDocumentListPageAsync.of(
                            SupplementalDocumentServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
