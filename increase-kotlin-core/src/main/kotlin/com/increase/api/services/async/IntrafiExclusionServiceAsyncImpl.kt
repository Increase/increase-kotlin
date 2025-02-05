// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.IntrafiExclusion
import com.increase.api.models.IntrafiExclusionArchiveParams
import com.increase.api.models.IntrafiExclusionCreateParams
import com.increase.api.models.IntrafiExclusionListPageAsync
import com.increase.api.models.IntrafiExclusionListParams
import com.increase.api.models.IntrafiExclusionRetrieveParams

class IntrafiExclusionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : IntrafiExclusionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<IntrafiExclusion> =
        jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an IntraFi Exclusion */
    override suspend fun create(
        params: IntrafiExclusionCreateParams,
        requestOptions: RequestOptions
    ): IntrafiExclusion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("intrafi_exclusions")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<IntrafiExclusion> =
        jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Get an IntraFi Exclusion */
    override suspend fun retrieve(
        params: IntrafiExclusionRetrieveParams,
        requestOptions: RequestOptions
    ): IntrafiExclusion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("intrafi_exclusions", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<IntrafiExclusionListPageAsync.Response> =
        jsonHandler<IntrafiExclusionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List IntraFi Exclusions */
    override suspend fun list(
        params: IntrafiExclusionListParams,
        requestOptions: RequestOptions
    ): IntrafiExclusionListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("intrafi_exclusions")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { IntrafiExclusionListPageAsync.of(this, params, it) }
    }

    private val archiveHandler: Handler<IntrafiExclusion> =
        jsonHandler<IntrafiExclusion>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive an IntraFi Exclusion */
    override suspend fun archive(
        params: IntrafiExclusionArchiveParams,
        requestOptions: RequestOptions
    ): IntrafiExclusion {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("intrafi_exclusions", params.getPathParam(0), "archive")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
