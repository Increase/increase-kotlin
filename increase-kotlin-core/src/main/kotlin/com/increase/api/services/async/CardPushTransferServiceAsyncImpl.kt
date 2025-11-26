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
import com.increase.api.models.cardpushtransfers.CardPushTransfer
import com.increase.api.models.cardpushtransfers.CardPushTransferApproveParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCancelParams
import com.increase.api.models.cardpushtransfers.CardPushTransferCreateParams
import com.increase.api.models.cardpushtransfers.CardPushTransferListPageAsync
import com.increase.api.models.cardpushtransfers.CardPushTransferListPageResponse
import com.increase.api.models.cardpushtransfers.CardPushTransferListParams
import com.increase.api.models.cardpushtransfers.CardPushTransferRetrieveParams

class CardPushTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CardPushTransferServiceAsync {

    private val withRawResponse: CardPushTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPushTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CardPushTransferServiceAsync =
        CardPushTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CardPushTransferCreateParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: CardPushTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // get /card_push_transfers/{card_push_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CardPushTransferListParams,
        requestOptions: RequestOptions,
    ): CardPushTransferListPageAsync =
        // get /card_push_transfers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun approve(
        params: CardPushTransferApproveParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers/{card_push_transfer_id}/approve
        withRawResponse().approve(params, requestOptions).parse()

    override suspend fun cancel(
        params: CardPushTransferCancelParams,
        requestOptions: RequestOptions,
    ): CardPushTransfer =
        // post /card_push_transfers/{card_push_transfer_id}/cancel
        withRawResponse().cancel(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPushTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardPushTransferServiceAsync.WithRawResponse =
            CardPushTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CardPushTransferCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers")
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

        private val retrieveHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardPushTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0))
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

        private val listHandler: Handler<CardPushTransferListPageResponse> =
            jsonHandler<CardPushTransferListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardPushTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers")
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
                        CardPushTransferListPageAsync.builder()
                            .service(CardPushTransferServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val approveHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override suspend fun approve(
            params: CardPushTransferApproveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0), "approve")
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

        private val cancelHandler: Handler<CardPushTransfer> =
            jsonHandler<CardPushTransfer>(clientOptions.jsonMapper)

        override suspend fun cancel(
            params: CardPushTransferCancelParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPushTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPushTransferId", params.cardPushTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_push_transfers", params._pathParam(0), "cancel")
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
