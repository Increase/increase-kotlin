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
import com.increase.api.models.programs.Program
import com.increase.api.models.programs.ProgramListPage
import com.increase.api.models.programs.ProgramListPageResponse
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramRetrieveParams

class ProgramServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    ProgramService {

    private val withRawResponse: ProgramService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProgramService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): ProgramService =
        ProgramServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun retrieve(params: ProgramRetrieveParams, requestOptions: RequestOptions): Program =
        // get /programs/{program_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: ProgramListParams, requestOptions: RequestOptions): ProgramListPage =
        // get /programs
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProgramService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): ProgramService.WithRawResponse =
            ProgramServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Program> =
            jsonHandler<Program>(clientOptions.jsonMapper)

        override fun retrieve(
            params: ProgramRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Program> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("programId", params.programId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("programs", params._pathParam(0))
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

        private val listHandler: Handler<ProgramListPageResponse> =
            jsonHandler<ProgramListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: ProgramListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProgramListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("programs")
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
                        ProgramListPage.builder()
                            .service(ProgramServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
