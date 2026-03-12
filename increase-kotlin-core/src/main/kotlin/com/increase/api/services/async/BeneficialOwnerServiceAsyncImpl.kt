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
import com.increase.api.models.beneficialowners.BeneficialOwnerArchiveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerCreateParams
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageAsync
import com.increase.api.models.beneficialowners.BeneficialOwnerListPageResponse
import com.increase.api.models.beneficialowners.BeneficialOwnerListParams
import com.increase.api.models.beneficialowners.BeneficialOwnerRetrieveParams
import com.increase.api.models.beneficialowners.BeneficialOwnerUpdateParams
import com.increase.api.models.beneficialowners.EntityBeneficialOwner

class BeneficialOwnerServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BeneficialOwnerServiceAsync {

    private val withRawResponse: BeneficialOwnerServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BeneficialOwnerServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): BeneficialOwnerServiceAsync =
        BeneficialOwnerServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: BeneficialOwnerCreateParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // post /entity_beneficial_owners
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BeneficialOwnerRetrieveParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // get /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: BeneficialOwnerUpdateParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // patch /entity_beneficial_owners/{entity_beneficial_owner_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: BeneficialOwnerListParams,
        requestOptions: RequestOptions,
    ): BeneficialOwnerListPageAsync =
        // get /entity_beneficial_owners
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun archive(
        params: BeneficialOwnerArchiveParams,
        requestOptions: RequestOptions,
    ): EntityBeneficialOwner =
        // post /entity_beneficial_owners/{entity_beneficial_owner_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BeneficialOwnerServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BeneficialOwnerServiceAsync.WithRawResponse =
            BeneficialOwnerServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override suspend fun create(
            params: BeneficialOwnerCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners")
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

        private val retrieveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: BeneficialOwnerRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0))
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

        private val updateHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override suspend fun update(
            params: BeneficialOwnerUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BeneficialOwnerListPageResponse> =
            jsonHandler<BeneficialOwnerListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: BeneficialOwnerListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BeneficialOwnerListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners")
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
                    .let {
                        BeneficialOwnerListPageAsync.builder()
                            .service(BeneficialOwnerServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val archiveHandler: Handler<EntityBeneficialOwner> =
            jsonHandler<EntityBeneficialOwner>(clientOptions.jsonMapper)

        override suspend fun archive(
            params: BeneficialOwnerArchiveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EntityBeneficialOwner> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("entityBeneficialOwnerId", params.entityBeneficialOwnerId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("entity_beneficial_owners", params._pathParam(0), "archive")
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
    }
}
