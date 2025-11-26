// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
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
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositListParams
import com.increase.api.models.checkdeposits.CheckDepositListResponse
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams

class CheckDepositServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckDepositServiceAsync {

    private val withRawResponse: CheckDepositServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckDepositServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckDepositServiceAsync =
        CheckDepositServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions,
    ): CheckDeposit =
        // post /check_deposits
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckDeposit =
        // get /check_deposits/{check_deposit_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CheckDepositListParams,
        requestOptions: RequestOptions,
    ): CheckDepositListResponse =
        // get /check_deposits
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckDepositServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckDepositServiceAsync.WithRawResponse =
            CheckDepositServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CheckDeposit> =
            jsonHandler<CheckDeposit>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_deposits")
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

        private val retrieveHandler: Handler<CheckDeposit> =
            jsonHandler<CheckDeposit>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CheckDepositRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkDepositId", params.checkDepositId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_deposits", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<CheckDepositListResponse> =
            jsonHandler<CheckDepositListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CheckDepositListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDepositListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("check_deposits")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
