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
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfile
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileArchiveParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCloneParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileCreateParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPage
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListPageResponse
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileListParams
import com.increase.api.models.physicalcardprofiles.PhysicalCardProfileRetrieveParams

class PhysicalCardProfileServiceImpl
internal constructor(private val clientOptions: ClientOptions) : PhysicalCardProfileService {

    private val withRawResponse: PhysicalCardProfileService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardProfileService.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PhysicalCardProfileService =
        PhysicalCardProfileServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: PhysicalCardProfileCreateParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(
        params: PhysicalCardProfileRetrieveParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // get /physical_card_profiles/{physical_card_profile_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(
        params: PhysicalCardProfileListParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfileListPage =
        // get /physical_card_profiles
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(
        params: PhysicalCardProfileArchiveParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles/{physical_card_profile_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun clone(
        params: PhysicalCardProfileCloneParams,
        requestOptions: RequestOptions,
    ): PhysicalCardProfile =
        // post /physical_card_profiles/{physical_card_profile_id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardProfileService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PhysicalCardProfileService.WithRawResponse =
            PhysicalCardProfileServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)

        override fun create(
            params: PhysicalCardProfileCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_card_profiles")
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

        private val retrieveHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)

        override fun retrieve(
            params: PhysicalCardProfileRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardProfileId", params.physicalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_card_profiles", params._pathParam(0))
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

        private val listHandler: Handler<PhysicalCardProfileListPageResponse> =
            jsonHandler<PhysicalCardProfileListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: PhysicalCardProfileListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfileListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_card_profiles")
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
                        PhysicalCardProfileListPage.builder()
                            .service(PhysicalCardProfileServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)

        override fun archive(
            params: PhysicalCardProfileArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardProfileId", params.physicalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_card_profiles", params._pathParam(0), "archive")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val cloneHandler: Handler<PhysicalCardProfile> =
            jsonHandler<PhysicalCardProfile>(clientOptions.jsonMapper)

        override fun clone(
            params: PhysicalCardProfileCloneParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCardProfile> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardProfileId", params.physicalCardProfileId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("physical_card_profiles", params._pathParam(0), "clone")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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
