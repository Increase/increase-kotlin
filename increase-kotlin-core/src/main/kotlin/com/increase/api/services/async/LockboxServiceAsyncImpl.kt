// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
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
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPageAsync
import com.increase.api.models.lockboxes.LockboxListPageResponse
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

class LockboxServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    LockboxServiceAsync {

    private val withRawResponse: LockboxServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LockboxServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: LockboxCreateParams,
        requestOptions: RequestOptions,
    ): Lockbox =
        // post /lockboxes
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LockboxRetrieveParams,
        requestOptions: RequestOptions,
    ): Lockbox =
        // get /lockboxes/{lockbox_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LockboxUpdateParams,
        requestOptions: RequestOptions,
    ): Lockbox =
        // patch /lockboxes/{lockbox_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LockboxListParams,
        requestOptions: RequestOptions,
    ): LockboxListPageAsync =
        // get /lockboxes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LockboxServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("lockboxes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("lockboxes", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val updateHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .addPathSegments("lockboxes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<LockboxListPageResponse> =
            jsonHandler<LockboxListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: LockboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("lockboxes")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        LockboxListPageAsync.of(LockboxServiceAsyncImpl(clientOptions), params, it)
                    }
            }
        }
    }
}
