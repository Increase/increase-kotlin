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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequest
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListPageAsync
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListPageResponse
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestListParams
import com.increase.api.models.proofofauthorizationrequests.ProofOfAuthorizationRequestRetrieveParams

class ProofOfAuthorizationRequestServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ProofOfAuthorizationRequestServiceAsync {

    private val withRawResponse: ProofOfAuthorizationRequestServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): ProofOfAuthorizationRequestServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieve(
        params: ProofOfAuthorizationRequestRetrieveParams,
        requestOptions: RequestOptions,
    ): ProofOfAuthorizationRequest =
        // get /proof_of_authorization_requests/{proof_of_authorization_request_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ProofOfAuthorizationRequestListParams,
        requestOptions: RequestOptions,
    ): ProofOfAuthorizationRequestListPageAsync =
        // get /proof_of_authorization_requests
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProofOfAuthorizationRequestServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<ProofOfAuthorizationRequest> =
            jsonHandler<ProofOfAuthorizationRequest>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ProofOfAuthorizationRequestRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProofOfAuthorizationRequest> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("proof_of_authorization_requests", params._pathParam(0))
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

        private val listHandler: Handler<ProofOfAuthorizationRequestListPageResponse> =
            jsonHandler<ProofOfAuthorizationRequestListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ProofOfAuthorizationRequestListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProofOfAuthorizationRequestListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("proof_of_authorization_requests")
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
                        ProofOfAuthorizationRequestListPageAsync.builder()
                            .service(ProofOfAuthorizationRequestServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
