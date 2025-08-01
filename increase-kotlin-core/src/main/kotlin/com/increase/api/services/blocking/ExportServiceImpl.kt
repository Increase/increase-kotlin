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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.models.exports.Export
import com.increase.api.models.exports.ExportCreateParams
import com.increase.api.models.exports.ExportListPage
import com.increase.api.models.exports.ExportListPageResponse
import com.increase.api.models.exports.ExportListParams
import com.increase.api.models.exports.ExportRetrieveParams

class ExportServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ExportService {

    private val withRawResponse: ExportService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ExportService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ExportService =
        ExportServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(params: ExportCreateParams, requestOptions: RequestOptions): Export =
        // post /exports
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: ExportRetrieveParams, requestOptions: RequestOptions): Export =
        // get /exports/{export_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ExportListParams, requestOptions: RequestOptions): ExportListPage =
        // get /exports
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ExportService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ExportService.WithRawResponse =
            ExportServiceImpl.WithRawResponseImpl(clientOptions.toBuilder().apply(modifier).build())

        private val createHandler: Handler<Export> = jsonHandler<Export>(clientOptions.jsonMapper)

        override fun create(
            params: ExportCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Export> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("exports")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val retrieveHandler: Handler<Export> = jsonHandler<Export>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ExportRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Export> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("exportId", params.exportId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("exports", params._pathParam(0))
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

        private val listHandler: Handler<ExportListPageResponse> =
            jsonHandler<ExportListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ExportListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ExportListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("exports")
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
                        ExportListPage.builder()
                            .service(ExportServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
