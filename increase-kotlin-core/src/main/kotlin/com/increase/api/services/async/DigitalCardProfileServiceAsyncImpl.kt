// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

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
import com.increase.api.core.prepareAsync
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListResponse
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams

class DigitalCardProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalCardProfileServiceAsync {

    private val withRawResponse: DigitalCardProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalCardProfileServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): DigitalCardProfileServiceAsync =
        DigitalCardProfileServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: DigitalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile =
        // post /digital_card_profiles
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: DigitalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile =
        // get /digital_card_profiles/{digital_card_profile_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: DigitalCardProfileListParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfileListResponse =
        // get /digital_card_profiles
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: DigitalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile =
        // post /digital_card_profiles/{digital_card_profile_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override suspend fun clone(
        params: DigitalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): DigitalCardProfile =
        // post /digital_card_profiles/{digital_card_profile_id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalCardProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DigitalCardProfileServiceAsync.WithRawResponse =
            DigitalCardProfileServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)

        override suspend fun create(
            params: DigitalCardProfileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val retrieveHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DigitalCardProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
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

        private val listHandler: Handler<DigitalCardProfileListResponse> =
            jsonHandler<DigitalCardProfileListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DigitalCardProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfileListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val archiveHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)

        override suspend fun archive(
            params: DigitalCardProfileArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { archiveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cloneHandler: Handler<DigitalCardProfile> =
            jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper)

        override suspend fun clone(
            params: DigitalCardProfileCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalCardProfileId", params.digitalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_card_profiles", params._pathParam(0), "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cloneHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
