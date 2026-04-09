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
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSession
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionCreateParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionExpireParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPageAsync
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListPageResponse
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionListParams
import com.increase.api.models.entityonboardingsessions.EntityOnboardingSessionRetrieveParams

class EntityOnboardingSessionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    EntityOnboardingSessionServiceAsync {

    private val withRawResponse: EntityOnboardingSessionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): EntityOnboardingSessionServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): EntityOnboardingSessionServiceAsync =
        EntityOnboardingSessionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: EntityOnboardingSessionCreateParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // post /entity_onboarding_sessions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: EntityOnboardingSessionRetrieveParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // get /entity_onboarding_sessions/{entity_onboarding_session_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: EntityOnboardingSessionListParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSessionListPageAsync =
        // get /entity_onboarding_sessions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun expire(
        params: EntityOnboardingSessionExpireParams,
        requestOptions: RequestOptions,
    ): EntityOnboardingSession =
        // post /entity_onboarding_sessions/{entity_onboarding_session_id}/expire
        withRawResponse().expire(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        EntityOnboardingSessionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EntityOnboardingSessionServiceAsync.WithRawResponse =
            EntityOnboardingSessionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override suspend fun create(
            params: EntityOnboardingSessionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions")
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

        private val retrieveHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: EntityOnboardingSessionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityOnboardingSessionId", params.entityOnboardingSessionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions", params._pathParam(0))
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

        private val listHandler: Handler<EntityOnboardingSessionListPageResponse> =
            jsonHandler<EntityOnboardingSessionListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: EntityOnboardingSessionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSessionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions")
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
                        EntityOnboardingSessionListPageAsync.builder()
                            .service(EntityOnboardingSessionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val expireHandler: Handler<EntityOnboardingSession> =
            jsonHandler<EntityOnboardingSession>(clientOptions.jsonMapper)

        override suspend fun expire(
            params: EntityOnboardingSessionExpireParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityOnboardingSession> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityOnboardingSessionId", params.entityOnboardingSessionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_onboarding_sessions", params._pathParam(0), "expire")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { expireHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
