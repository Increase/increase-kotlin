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
import com.increase.api.models.transactions.Transaction
import com.increase.api.models.transactions.TransactionListPage
import com.increase.api.models.transactions.TransactionListPageAsync
import com.increase.api.models.transactions.TransactionListParams
import com.increase.api.models.transactions.TransactionRetrieveParams

class TransactionServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(params: TransactionRetrieveParams, requestOptions: RequestOptions): Transaction =
        // get /transactions/{transaction_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(params: TransactionListParams, requestOptions: RequestOptions): TransactionListPageAsync =
        // get /transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<Transaction> = jsonHandler<Transaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(params: TransactionRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<Transaction> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("transactions", params.getPathParam(0))
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

        private val listHandler: Handler<TransactionListPageAsync.Response> = jsonHandler<TransactionListPageAsync.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun list(params: TransactionListParams, requestOptions: RequestOptions): HttpResponseFor<TransactionListPageAsync> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("transactions")
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
                  TransactionListPageAsync.of(TransactionServiceAsyncImpl(clientOptions), params, it)
              }
          }
        }
    }
}
