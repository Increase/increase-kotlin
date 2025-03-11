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
import com.increase.api.core.http.multipartFormData
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.files.File
import com.increase.api.models.files.FileCreateParams
import com.increase.api.models.files.FileListPage
import com.increase.api.models.files.FileListPageAsync
import com.increase.api.models.files.FileListParams
import com.increase.api.models.files.FileRetrieveParams

class FileServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : FileServiceAsync {

    private val withRawResponse: FileServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): FileServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(params: FileCreateParams, requestOptions: RequestOptions): File =
        // post /files
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): File =
        // get /files/{file_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(params: FileListParams, requestOptions: RequestOptions): FileListPageAsync =
        // get /files
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : FileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(params: FileCreateParams, requestOptions: RequestOptions): HttpResponseFor<File> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("files")
            .body(multipartFormData(clientOptions.jsonMapper, params._body()))
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveHandler: Handler<File> = jsonHandler<File>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: FileRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<File> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("files", params.getPathParam(0))
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

        private val listHandler: Handler<FileListPageAsync.Response> = jsonHandler<FileListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(params: FileListParams, requestOptions: RequestOptions): HttpResponseFor<FileListPageAsync> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("files")
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
                  FileListPageAsync.of(FileServiceAsyncImpl(clientOptions), params, it)
              }
          }
        }
    }
}
