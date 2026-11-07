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
import com.increase.api.models.checkbookchecks.CheckbookCheck
import com.increase.api.models.checkbookchecks.CheckbookCheckListPageAsync
import com.increase.api.models.checkbookchecks.CheckbookCheckListPageResponse
import com.increase.api.models.checkbookchecks.CheckbookCheckListParams
import com.increase.api.models.checkbookchecks.CheckbookCheckRetrieveParams
import com.increase.api.models.checkbookchecks.CheckbookCheckStopParams

class CheckbookCheckServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CheckbookCheckServiceAsync {

    private val withRawResponse: CheckbookCheckServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckbookCheckServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CheckbookCheckServiceAsync =
        CheckbookCheckServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: CheckbookCheckRetrieveParams,
        requestOptions: RequestOptions,
    ): CheckbookCheck =
        // get /checkbook_checks/{checkbook_check_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CheckbookCheckListParams,
        requestOptions: RequestOptions,
    ): CheckbookCheckListPageAsync =
        // get /checkbook_checks
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun stop(
        params: CheckbookCheckStopParams,
        requestOptions: RequestOptions,
    ): CheckbookCheck =
        // post /checkbook_checks/{checkbook_check_id}/stop
        withRawResponse().stop(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckbookCheckServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckbookCheckServiceAsync.WithRawResponse =
            CheckbookCheckServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CheckbookCheck> =
            jsonHandler<CheckbookCheck>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CheckbookCheckRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookCheckId", params.checkbookCheckId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks", params._pathParam(0))
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

        private val listHandler: Handler<CheckbookCheckListPageResponse> =
            jsonHandler<CheckbookCheckListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CheckbookCheckListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheckListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks")
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
                    .let {
                        CheckbookCheckListPageAsync.builder()
                            .service(CheckbookCheckServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val stopHandler: Handler<CheckbookCheck> =
            jsonHandler<CheckbookCheck>(clientOptions.jsonMapper)

        override suspend fun stop(
            params: CheckbookCheckStopParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckbookCheck> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookCheckId", params.checkbookCheckId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("checkbook_checks", params._pathParam(0), "stop")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { stopHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
