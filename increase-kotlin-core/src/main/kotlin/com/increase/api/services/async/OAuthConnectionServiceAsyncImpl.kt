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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.oauthconnections.OAuthConnection
import com.increase.api.models.oauthconnections.OAuthConnectionListPageAsync
import com.increase.api.models.oauthconnections.OAuthConnectionListPageResponse
import com.increase.api.models.oauthconnections.OAuthConnectionListParams
import com.increase.api.models.oauthconnections.OAuthConnectionRetrieveParams

class OAuthConnectionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : OAuthConnectionServiceAsync {

    private val withRawResponse: OAuthConnectionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthConnectionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): OAuthConnectionServiceAsync =
        OAuthConnectionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthConnection =
        // get /oauth_connections/{oauth_connection_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions,
    ): OAuthConnectionListPageAsync =
        // get /oauth_connections
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthConnectionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OAuthConnectionServiceAsync.WithRawResponse =
            OAuthConnectionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<OAuthConnection> =
            jsonHandler<OAuthConnection>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnection> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oauthConnectionId", params.oauthConnectionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_connections", params._pathParam(0))
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

        private val listHandler: Handler<OAuthConnectionListPageResponse> =
            jsonHandler<OAuthConnectionListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: OAuthConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnectionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_connections")
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
                        OAuthConnectionListPageAsync.builder()
                            .service(OAuthConnectionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
