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
import com.increase.api.models.WireTransfer
import com.increase.api.models.WireTransferApproveParams
import com.increase.api.models.WireTransferCancelParams
import com.increase.api.models.WireTransferCreateParams
import com.increase.api.models.WireTransferListPageAsync
import com.increase.api.models.WireTransferListParams
import com.increase.api.models.WireTransferRetrieveParams

class WireTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    WireTransferServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<WireTransfer> =
        jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create a Wire Transfer */
    override suspend fun create(
        params: WireTransferCreateParams,
        requestOptions: RequestOptions,
    ): WireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers")
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

    private val retrieveHandler: Handler<WireTransfer> =
        jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Wire Transfer */
    override suspend fun retrieve(
        params: WireTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): WireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_transfers", params.getPathParam(0))
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

    private val listHandler: Handler<WireTransferListPageAsync.Response> =
        jsonHandler<WireTransferListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Wire Transfers */
    override suspend fun list(
        params: WireTransferListParams,
        requestOptions: RequestOptions,
    ): WireTransferListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("wire_transfers")
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
            .let { WireTransferListPageAsync.of(this, params, it) }
    }

    private val approveHandler: Handler<WireTransfer> =
        jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Approve a Wire Transfer */
    override suspend fun approve(
        params: WireTransferApproveParams,
        requestOptions: RequestOptions,
    ): WireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers", params.getPathParam(0), "approve")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { approveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val cancelHandler: Handler<WireTransfer> =
        jsonHandler<WireTransfer>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Cancel a pending Wire Transfer */
    override suspend fun cancel(
        params: WireTransferCancelParams,
        requestOptions: RequestOptions,
    ): WireTransfer {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("wire_transfers", params.getPathParam(0), "cancel")
                .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { cancelHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }
}
