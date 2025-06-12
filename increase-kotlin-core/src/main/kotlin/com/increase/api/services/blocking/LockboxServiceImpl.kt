// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.lockboxes.Lockbox
import com.increase.api.models.lockboxes.LockboxCreateParams
import com.increase.api.models.lockboxes.LockboxListPage
import com.increase.api.models.lockboxes.LockboxListPageResponse
import com.increase.api.models.lockboxes.LockboxListParams
import com.increase.api.models.lockboxes.LockboxRetrieveParams
import com.increase.api.models.lockboxes.LockboxUpdateParams

class LockboxServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    LockboxService {

    private val withRawResponse: LockboxService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LockboxService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): LockboxService =
        LockboxServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: LockboxCreateParams, requestOptions: RequestOptions): Lockbox =
        // post /lockboxes
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: LockboxRetrieveParams, requestOptions: RequestOptions): Lockbox =
        // get /lockboxes/{lockbox_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun update(params: LockboxUpdateParams, requestOptions: RequestOptions): Lockbox =
        // patch /lockboxes/{lockbox_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(params: LockboxListParams, requestOptions: RequestOptions): LockboxListPage =
        // get /lockboxes
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LockboxService.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LockboxService.WithRawResponse =
            LockboxServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: LockboxCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun retrieve(
            params: LockboxRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxId", params.lockboxId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes", params._pathParam(0))
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

        private val updateHandler: Handler<Lockbox> =
            jsonHandler<Lockbox>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun update(
            params: LockboxUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Lockbox> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxId", params.lockboxId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        override fun list(
            params: LockboxListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockboxes")
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
                        LockboxListPage.builder()
                            .service(LockboxServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
