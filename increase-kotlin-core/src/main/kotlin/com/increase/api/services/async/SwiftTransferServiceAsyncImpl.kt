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
import com.increase.api.models.swifttransfers.SwiftTransfer
import com.increase.api.models.swifttransfers.SwiftTransferApproveParams
import com.increase.api.models.swifttransfers.SwiftTransferCancelParams
import com.increase.api.models.swifttransfers.SwiftTransferCreateParams
import com.increase.api.models.swifttransfers.SwiftTransferListPageAsync
import com.increase.api.models.swifttransfers.SwiftTransferListPageResponse
import com.increase.api.models.swifttransfers.SwiftTransferListParams
import com.increase.api.models.swifttransfers.SwiftTransferRetrieveParams

class SwiftTransferServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    SwiftTransferServiceAsync {

    private val withRawResponse: SwiftTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): SwiftTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): SwiftTransferServiceAsync =
        SwiftTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: SwiftTransferCreateParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: SwiftTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // get /swift_transfers/{swift_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: SwiftTransferListParams,
        requestOptions: RequestOptions,
    ): SwiftTransferListPageAsync =
        // get /swift_transfers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun approve(
        params: SwiftTransferApproveParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers/{swift_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override suspend fun cancel(
        params: SwiftTransferCancelParams,
        requestOptions: RequestOptions,
    ): SwiftTransfer =
        // post /swift_transfers/{swift_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        SwiftTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): SwiftTransferServiceAsync.WithRawResponse =
            SwiftTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override suspend fun create(
            params: SwiftTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers")
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

        private val retrieveHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: SwiftTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0))
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

        private val listHandler: Handler<SwiftTransferListPageResponse> =
            jsonHandler<SwiftTransferListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: SwiftTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers")
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
                        SwiftTransferListPageAsync.builder()
                            .service(SwiftTransferServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val approveHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override suspend fun approve(
            params: SwiftTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0), "approve")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { approveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val cancelHandler: Handler<SwiftTransfer> =
            jsonHandler<SwiftTransfer>(clientOptions.jsonMapper)

        override suspend fun cancel(
            params: SwiftTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<SwiftTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("swiftTransferId", params.swiftTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("swift_transfers", params._pathParam(0), "cancel")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { cancelHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
