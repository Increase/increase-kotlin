// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
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
import com.increase.api.errors.IncreaseError
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams

class CheckDepositServiceAsyncImpl internal constructor(
    private val clientOptions: ClientOptions,

) : CheckDepositServiceAsync {

    private val withRawResponse: CheckDepositServiceAsync.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): CheckDepositServiceAsync.WithRawResponse = withRawResponse

    override suspend fun reject(params: CheckDepositRejectParams, requestOptions: RequestOptions): CheckDeposit =
        // post /simulations/check_deposits/{check_deposit_id}/reject
        withRawResponse().reject(params, requestOptions).parse()

    override suspend fun return_(params: CheckDepositReturnParams, requestOptions: RequestOptions): CheckDeposit =
        // post /simulations/check_deposits/{check_deposit_id}/return
        withRawResponse().return_(params, requestOptions).parse()

    override suspend fun submit(params: CheckDepositSubmitParams, requestOptions: RequestOptions): CheckDeposit =
        // post /simulations/check_deposits/{check_deposit_id}/submit
        withRawResponse().submit(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : CheckDepositServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val rejectHandler: Handler<CheckDeposit> = jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun reject(params: CheckDepositRejectParams, requestOptions: RequestOptions): HttpResponseFor<CheckDeposit> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "reject")
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  rejectHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val returnHandler: Handler<CheckDeposit> = jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun return_(params: CheckDepositReturnParams, requestOptions: RequestOptions): HttpResponseFor<CheckDeposit> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "return")
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  returnHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val submitHandler: Handler<CheckDeposit> = jsonHandler<CheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun submit(params: CheckDepositSubmitParams, requestOptions: RequestOptions): HttpResponseFor<CheckDeposit> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("simulations", "check_deposits", params.getPathParam(0), "submit")
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepareAsync(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.executeAsync(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  submitHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
