// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.models.oauthtokens.OAuthToken
import com.increase.api.models.oauthtokens.OAuthTokenCreateParams

class OAuthTokenServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthTokenServiceAsync {

    private val withRawResponse: OAuthTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthTokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OAuthTokenServiceAsync =
        OAuthTokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: OAuthTokenCreateParams,
        requestOptions: RequestOptions,
    ): OAuthToken =
        // post /oauth/tokens
        withRawResponse().create(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OAuthTokenServiceAsync.WithRawResponse =
            OAuthTokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<OAuthToken> =
            jsonHandler<OAuthToken>(clientOptions.jsonMapper)

        override suspend fun create(
            params: OAuthTokenCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthToken> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth", "tokens")
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
