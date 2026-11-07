// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.checkbooks.Checkbook
import com.increase.api.models.simulations.checkbooks.CheckbookMailParams

class CheckbookServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    CheckbookServiceAsync {

    private val withRawResponse: CheckbookServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CheckbookServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): CheckbookServiceAsync =
        CheckbookServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun mail(
        params: CheckbookMailParams,
        requestOptions: RequestOptions,
    ): Checkbook =
        // post /simulations/checkbooks/{checkbook_id}/mail
        withRawResponse().mail(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CheckbookServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CheckbookServiceAsync.WithRawResponse =
            CheckbookServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val mailHandler: Handler<Checkbook> =
            jsonHandler<Checkbook>(clientOptions.jsonMapper)

        override suspend fun mail(
            params: CheckbookMailParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Checkbook> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("checkbookId", params.checkbookId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "checkbooks", params._pathParam(0), "mail")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { mailHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
