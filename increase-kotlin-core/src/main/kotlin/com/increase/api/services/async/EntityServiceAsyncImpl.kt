// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.Entity
import com.increase.api.models.EntityArchiveBeneficialOwnerParams
import com.increase.api.models.EntityArchiveParams
import com.increase.api.models.EntityConfirmParams
import com.increase.api.models.EntityCreateBeneficialOwnerParams
import com.increase.api.models.EntityCreateParams
import com.increase.api.models.EntityListPageAsync
import com.increase.api.models.EntityListParams
import com.increase.api.models.EntityRetrieveParams
import com.increase.api.models.EntityUpdateAddressParams
import com.increase.api.models.EntityUpdateBeneficialOwnerAddressParams
import com.increase.api.models.EntityUpdateIndustryCodeParams

class EntityServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    EntityServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Entity */
    override suspend fun create(
        params: EntityCreateParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Entity */
    override suspend fun retrieve(
        params: EntityRetrieveParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<EntityListPageAsync.Response> =
        jsonHandler<EntityListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Entities */
    override suspend fun list(
        params: EntityListParams,
        requestOptions: RequestOptions,
    ): EntityListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("entities")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { EntityListPageAsync.of(this, params, it) }
    }

    private val archiveHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive an Entity */
    override suspend fun archive(
        params: EntityArchiveParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "archive")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { archiveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val archiveBeneficialOwnerHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Archive a beneficial owner for a corporate Entity */
    override suspend fun archiveBeneficialOwner(
        params: EntityArchiveBeneficialOwnerParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "archive_beneficial_owner")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { archiveBeneficialOwnerHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val confirmHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * Depending on your program, you may be required to re-confirm an Entity's details on a
     * recurring basis. After making any required updates, call this endpoint to record that your
     * user confirmed their details.
     */
    override suspend fun confirm(
        params: EntityConfirmParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "confirm")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { confirmHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val createBeneficialOwnerHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a beneficial owner for a corporate Entity */
    override suspend fun createBeneficialOwner(
        params: EntityCreateBeneficialOwnerParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "create_beneficial_owner")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createBeneficialOwnerHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateAddressHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update a Natural Person or Corporation's address */
    override suspend fun updateAddress(
        params: EntityUpdateAddressParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "update_address")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateAddressHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateBeneficialOwnerAddressHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the address for a beneficial owner belonging to a corporate Entity */
    override suspend fun updateBeneficialOwnerAddress(
        params: EntityUpdateBeneficialOwnerAddressParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "entities",
                    params.getPathParam(0),
                    "update_beneficial_owner_address",
                )
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateBeneficialOwnerAddressHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateIndustryCodeHandler: Handler<Entity> =
        jsonHandler<Entity>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update the industry code for a corporate Entity */
    override suspend fun updateIndustryCode(
        params: EntityUpdateIndustryCodeParams,
        requestOptions: RequestOptions,
    ): Entity {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("entities", params.getPathParam(0), "update_industry_code")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateIndustryCodeHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
