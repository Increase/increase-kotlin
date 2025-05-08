// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.intrafiexclusions.IntrafiExclusion
import com.increase.api.models.intrafiexclusions.IntrafiExclusionArchiveParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionCreateParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListPageAsync
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListPageResponse
import com.increase.api.models.intrafiexclusions.IntrafiExclusionListParams
import com.increase.api.models.intrafiexclusions.IntrafiExclusionRetrieveParams

class IntrafiExclusionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : IntrafiExclusionServiceAsync {

    private val withRawResponse: IntrafiExclusionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiExclusionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // post /intrafi_exclusions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // get /intrafi_exclusions/{intrafi_exclusion_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusionListPageAsync =
        // get /intrafi_exclusions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // post /intrafi_exclusions/{intrafi_exclusion_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiExclusionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: IntrafiExclusionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_exclusions")
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

        private val retrieveHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("intrafiExclusionId", params.intrafiExclusionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_exclusions", params._pathParam(0))
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

        private val listHandler: Handler<IntrafiExclusionListPageResponse> =
            jsonHandler<IntrafiExclusionListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: IntrafiExclusionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_exclusions")
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
                        IntrafiExclusionListPageAsync.builder()
                            .service(IntrafiExclusionServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun archive(
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("intrafiExclusionId", params.intrafiExclusionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_exclusions", params._pathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
