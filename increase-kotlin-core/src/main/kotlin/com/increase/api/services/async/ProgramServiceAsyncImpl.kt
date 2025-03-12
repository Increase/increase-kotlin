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
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListPage
import com.increase.api.models.programs.ProgramListPageAsync
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramRetrieveParams

class ProgramServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : ProgramServiceAsync {

    private val withRawResponse: ProgramServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): ProgramServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions): Program =
        // get /programs/{program_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(params: ProgramListParams, requestOptions: RequestOptions): ProgramListPageAsync =
        // get /programs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : ProgramServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Program> = jsonHandler<Program>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Program> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("programs", params.getPathParam(0))
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

        private val listHandler: Handler<ProgramListPageAsync.Response> = jsonHandler<ProgramListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(params: ProgramListParams, requestOptions: RequestOptions): HttpResponseFor<ProgramListPageAsync> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("programs")
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
                  ProgramListPageAsync.of(ProgramServiceAsyncImpl(clientOptions), params, it)
              }
          }
        }
    }
}
