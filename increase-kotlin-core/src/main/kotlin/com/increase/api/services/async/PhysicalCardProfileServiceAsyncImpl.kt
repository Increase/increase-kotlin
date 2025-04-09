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
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfile
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileArchiveParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPageAsync
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPageResponse
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileRetrieveParams

class PhysicalCardProfileServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PhysicalCardProfileServiceAsync {

    private val withRawResponse: PhysicalCardProfileServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardProfileServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // get /physical_card_profiles/{physical_card_profile_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfileListPageAsync =
        // get /physical_card_profiles
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles/{physical_card_profile_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override suspend fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles/{physical_card_profile_id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardProfileServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("physical_card_profiles")
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

        private val retrieveHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_card_profiles", params._pathParam(0))
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

        private val listHandler: Handler<PhysicalCardProfileListPageResponse> =
            jsonHandler<PhysicalCardProfileListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: PhysicalCardProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfileListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("physical_card_profiles")
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
                        PhysicalCardProfileListPageAsync.builder()
                            .service(PhysicalCardProfileServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("physical_card_profiles", params._pathParam(0), "archive")
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

        private val cloneHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("physical_card_profiles", params._pathParam(0), "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
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
