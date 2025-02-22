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
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPage
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams

class ExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Export */
    override fun create(params: ExportCreateParams, requestOptions: RequestOptions): Export {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("exports")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Export> =
        jsonHandler<Export>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Export */
    override fun retrieve(params: ExportRetrieveParams, requestOptions: RequestOptions): Export {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<ExportListPage.Response> =
        jsonHandler<ExportListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Exports */
    override fun list(params: ExportListParams, requestOptions: RequestOptions): ExportListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("exports")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { ExportListPage.of(this, params, it) }
    }
}
