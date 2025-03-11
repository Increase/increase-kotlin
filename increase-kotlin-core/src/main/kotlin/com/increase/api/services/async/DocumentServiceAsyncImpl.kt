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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.documents.Document
import com.increase.api.models.documents.DocumentListPage
import com.increase.api.models.documents.DocumentListPageAsync
import com.increase.api.models.documents.DocumentListParams
import com.increase.api.models.documents.DocumentRetrieveParams

class DocumentServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DocumentServiceAsync {

    private val withRawResponse: DocumentServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DocumentServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: DocumentRetrieveParams, requestOptions: RequestOptions): Document =
        // get /documents/{document_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(params: DocumentListParams, requestOptions: RequestOptions): DocumentListPageAsync =
        // get /documents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DocumentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Document> = jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: DocumentRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Document> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("documents", params.getPathParam(0))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<DocumentListPageAsync.Response> = jsonHandler<DocumentListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(params: DocumentListParams, requestOptions: RequestOptions): HttpResponseFor<DocumentListPageAsync> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("documents")
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  DocumentListPageAsync.of(DocumentServiceAsyncImpl(clientOptions), params, it)
              }
          }
        }
    }
}
