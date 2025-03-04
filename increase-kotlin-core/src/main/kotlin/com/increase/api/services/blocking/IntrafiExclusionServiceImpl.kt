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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPage
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams

class IntrafiExclusionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    IntrafiExclusionService {

    private val withRawResponse: IntrafiExclusionService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiExclusionService.WithRawResponse = withRawResponse

    override fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // post /intrafi_exclusions
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // get /intrafi_exclusions/{intrafi_exclusion_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusionListPage =
        // get /intrafi_exclusions
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions,
    ): IntrafiExclusion =
        // post /intrafi_exclusions/{intrafi_exclusion_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiExclusionService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(
            params: IntrafiExclusionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_exclusions")
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

        private val retrieveHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(
            params: IntrafiExclusionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_exclusions", params.getPathParam(0))
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

        private val listHandler: Handler<IntrafiExclusionListPage.Response> =
            jsonHandler<IntrafiExclusionListPage.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override fun list(
            params: IntrafiExclusionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusionListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("intrafi_exclusions")
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
                        IntrafiExclusionListPage.of(
                            IntrafiExclusionServiceImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }

        private val archiveHandler: Handler<IntrafiExclusion> =
            jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(
            params: IntrafiExclusionArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiExclusion> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("intrafi_exclusions", params.getPathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
