// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.models.oauthapplications.OAuthApplication
import com.increase.api.models.oauthapplications.OAuthApplicationListPage
import com.increase.api.models.oauthapplications.OAuthApplicationListPageResponse
import com.increase.api.models.oauthapplications.OAuthApplicationListParams
import com.increase.api.models.oauthapplications.OAuthApplicationRetrieveParams

class OAuthApplicationServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    OAuthApplicationService {

    private val withRawResponse: OAuthApplicationService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): OAuthApplicationService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): OAuthApplicationService =
        OAuthApplicationServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(
        params: OAuthApplicationRetrieveParams,
        requestOptions: RequestOptions,
    ): OAuthApplication =
        // get /oauth_applications/{oauth_application_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: OAuthApplicationListParams,
        requestOptions: RequestOptions,
    ): OAuthApplicationListPage =
        // get /oauth_applications
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        OAuthApplicationService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): OAuthApplicationService.WithRawResponse =
            OAuthApplicationServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<OAuthApplication> =
            jsonHandler<OAuthApplication>(clientOptions.jsonMapper)

        override fun retrieve(
            params: OAuthApplicationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthApplication> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("oauthApplicationId", params.oauthApplicationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_applications", params._pathParam(0))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<OAuthApplicationListPageResponse> =
            jsonHandler<OAuthApplicationListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: OAuthApplicationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<OAuthApplicationListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("oauth_applications")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        OAuthApplicationListPage.builder()
                            .service(OAuthApplicationServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
