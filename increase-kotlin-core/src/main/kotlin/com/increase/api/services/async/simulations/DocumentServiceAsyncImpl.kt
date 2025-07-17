// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.documents.Document
import com.increase.api.models.simulations.documents.DocumentCreateParams

class DocumentServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DocumentServiceAsync =
        DocumentServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: DocumentCreateParams,
        requestOptions: RequestOptions,
    ): Document =
        // post /simulations/documents
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DocumentServiceAsync.WithRawResponse =
            DocumentServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Document> =
            jsonHandler<Document>(clientOptions.jsonMapper)

        override suspend fun create(
            params: DocumentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Document> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "documents")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
