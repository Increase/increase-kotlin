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
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmission
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionCreateParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListPageAsync
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListPageResponse
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionListParams
import com.increase.api.models.proofofauthorizationrequestsubmissions.ProofOfAuthorizationRequestSubmissionRetrieveParams

class ProofOfAuthorizationRequestSubmissionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    ProofOfAuthorizationRequestSubmissionServiceAsync {

    private val withRawResponse:
        ProofOfAuthorizationRequestSubmissionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse():
        ProofOfAuthorizationRequestSubmissionServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: ProofOfAuthorizationRequestSubmissionCreateParams,
        requestOptions: RequestOptions,
    ): ProofOfAuthorizationRequestSubmission =
        // post /proof_of_authorization_request_submissions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
        requestOptions: RequestOptions,
    ): ProofOfAuthorizationRequestSubmission =
        // get
        // /proof_of_authorization_request_submissions/{proof_of_authorization_request_submission_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: ProofOfAuthorizationRequestSubmissionListParams,
        requestOptions: RequestOptions,
    ): ProofOfAuthorizationRequestSubmissionListPageAsync =
        // get /proof_of_authorization_request_submissions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        ProofOfAuthorizationRequestSubmissionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<ProofOfAuthorizationRequestSubmission> =
            jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: ProofOfAuthorizationRequestSubmissionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("proof_of_authorization_request_submissions")
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

        private val retrieveHandler: Handler<ProofOfAuthorizationRequestSubmission> =
            jsonHandler<ProofOfAuthorizationRequestSubmission>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: ProofOfAuthorizationRequestSubmissionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmission> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments(
                        "proof_of_authorization_request_submissions",
                        params._pathParam(0),
                    )
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

        private val listHandler: Handler<ProofOfAuthorizationRequestSubmissionListPageResponse> =
            jsonHandler<ProofOfAuthorizationRequestSubmissionListPageResponse>(
                    clientOptions.jsonMapper
                )
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: ProofOfAuthorizationRequestSubmissionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<ProofOfAuthorizationRequestSubmissionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("proof_of_authorization_request_submissions")
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
                        ProofOfAuthorizationRequestSubmissionListPageAsync.builder()
                            .service(
                                ProofOfAuthorizationRequestSubmissionServiceAsyncImpl(clientOptions)
                            )
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
