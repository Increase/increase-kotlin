// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.documents.Document
import com.increase.api.models.documents.DocumentListPage
import com.increase.api.models.documents.DocumentListParams
import com.increase.api.models.documents.DocumentRetrieveParams

class DocumentServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DocumentService {

    private val withRawResponse: DocumentService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DocumentService.WithRawResponse = withRawResponse

    override fun retrieve(params: DocumentRetrieveParams, requestOptions: RequestOptions): Document =
        // get /documents/{document_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: DocumentListParams, requestOptions: RequestOptions): DocumentListPage =
        // get /documents
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DocumentService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Document> = jsonHandler<Document>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: DocumentRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Document> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("documents", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
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

        private val listHandler: Handler<DocumentListPage.Response> = jsonHandler<DocumentListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: DocumentListParams, requestOptions: RequestOptions): HttpResponseFor<DocumentListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("documents")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
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
                  DocumentListPage.of(DocumentServiceImpl(clientOptions), params, it)
              }
          }
        }
    }
}
