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
import com.increase.api.models.inboundachtransfers.InboundAchTransfer
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListPageAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferListPageResponse
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferRetrieveParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams

class InboundAchTransferServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundAchTransferServiceAsync {

    private val withRawResponse: InboundAchTransferServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundAchTransferServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): InboundAchTransferServiceAsync =
        InboundAchTransferServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: InboundAchTransferRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundAchTransfer =
        // get /inbound_ach_transfers/{inbound_ach_transfer_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundAchTransferListParams,
        requestOptions: RequestOptions,
    ): InboundAchTransferListPageAsync =
        // get /inbound_ach_transfers
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun createNotificationOfChange(
        params: InboundAchTransferCreateNotificationOfChangeParams,
        requestOptions: RequestOptions,
    ): InboundAchTransfer =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/create_notification_of_change
        withRawResponse().createNotificationOfChange(params, requestOptions).parse()

    override suspend fun decline(
        params: InboundAchTransferDeclineParams,
        requestOptions: RequestOptions,
    ): InboundAchTransfer =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/decline
        withRawResponse().decline(params, requestOptions).parse()

    override suspend fun transferReturn(
        params: InboundAchTransferTransferReturnParams,
        requestOptions: RequestOptions,
    ): InboundAchTransfer =
        // post /inbound_ach_transfers/{inbound_ach_transfer_id}/transfer_return
        withRawResponse().transferReturn(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundAchTransferServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): InboundAchTransferServiceAsync.WithRawResponse =
            InboundAchTransferServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: InboundAchTransferRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers", params._pathParam(0))
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

        private val listHandler: Handler<InboundAchTransferListPageResponse> =
            jsonHandler<InboundAchTransferListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: InboundAchTransferListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransferListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers")
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
                        InboundAchTransferListPageAsync.builder()
                            .service(InboundAchTransferServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val createNotificationOfChangeHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper)

        override suspend fun createNotificationOfChange(
            params: InboundAchTransferCreateNotificationOfChangeParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params._pathParam(0),
                        "create_notification_of_change",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createNotificationOfChangeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val declineHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper)

        override suspend fun decline(
            params: InboundAchTransferDeclineParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("inbound_ach_transfers", params._pathParam(0), "decline")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { declineHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferReturnHandler: Handler<InboundAchTransfer> =
            jsonHandler<InboundAchTransfer>(clientOptions.jsonMapper)

        override suspend fun transferReturn(
            params: InboundAchTransferTransferReturnParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundAchTransfer> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("inboundAchTransferId", params.inboundAchTransferId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "inbound_ach_transfers",
                        params._pathParam(0),
                        "transfer_return",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferReturnHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
