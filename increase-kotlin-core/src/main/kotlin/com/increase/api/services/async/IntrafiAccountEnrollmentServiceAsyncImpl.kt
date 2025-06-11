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
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollment
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentCreateParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListPageAsync
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListPageResponse
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentListParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentRetrieveParams
import com.increase.api.models.intrafiaccountenrollments.IntrafiAccountEnrollmentUnenrollParams

class IntrafiAccountEnrollmentServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    IntrafiAccountEnrollmentServiceAsync {

    private val withRawResponse: IntrafiAccountEnrollmentServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): IntrafiAccountEnrollmentServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: IntrafiAccountEnrollmentCreateParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // post /intrafi_account_enrollments
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: IntrafiAccountEnrollmentRetrieveParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // get /intrafi_account_enrollments/{intrafi_account_enrollment_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: IntrafiAccountEnrollmentListParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollmentListPageAsync =
        // get /intrafi_account_enrollments
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun unenroll(
        params: IntrafiAccountEnrollmentUnenrollParams,
        requestOptions: RequestOptions,
    ): IntrafiAccountEnrollment =
        // post /intrafi_account_enrollments/{intrafi_account_enrollment_id}/unenroll
        withRawResponse().unenroll(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        IntrafiAccountEnrollmentServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: IntrafiAccountEnrollmentCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("intrafi_account_enrollments")
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

        private val retrieveHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: IntrafiAccountEnrollmentRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("intrafiAccountEnrollmentId", params.intrafiAccountEnrollmentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("intrafi_account_enrollments", params._pathParam(0))
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

        private val listHandler: Handler<IntrafiAccountEnrollmentListPageResponse> =
            jsonHandler<IntrafiAccountEnrollmentListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: IntrafiAccountEnrollmentListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollmentListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("intrafi_account_enrollments")
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
                        IntrafiAccountEnrollmentListPageAsync.builder()
                            .service(IntrafiAccountEnrollmentServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val unenrollHandler: Handler<IntrafiAccountEnrollment> =
            jsonHandler<IntrafiAccountEnrollment>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun unenroll(
            params: IntrafiAccountEnrollmentUnenrollParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiAccountEnrollment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("intrafiAccountEnrollmentId", params.intrafiAccountEnrollmentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "intrafi_account_enrollments",
                        params._pathParam(0),
                        "unenroll",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { unenrollHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
