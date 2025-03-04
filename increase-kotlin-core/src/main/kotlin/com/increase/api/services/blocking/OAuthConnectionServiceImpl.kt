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
import com.increase.api.models.OAuthConnection
import com.increase.api.models.OAuthConnectionListPage
import com.increase.api.models.OAuthConnectionListParams
import com.increase.api.models.OAuthConnectionRetrieveParams

class OAuthConnectionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthConnectionService {

    private val withRawResponse: OAuthConnectionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthConnectionService.WithRawResponse = withRawResponse

    override fun retrieve(
        params: OAuthConnectionRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthConnection =
        // get /oauth_connections/{oauth_connection_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: OAuthConnectionListParams,
        requestOptions: RequestOptions,
    ): OAuthConnectionListPage =
        // get /oauth_connections
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthConnectionService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<OAuthConnection> =
            jsonHandler<OAuthConnection>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: OAuthConnectionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnection> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("oauth_connections", params.getPathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<OAuthConnectionListPage.Response> =
            jsonHandler<OAuthConnectionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: OAuthConnectionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthConnectionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("oauth_connections")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        OAuthConnectionListPage.of(
                            OAuthConnectionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
