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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundMailItem
import com.increase.api.models.InboundMailItemListPageAsync
import com.increase.api.models.InboundMailItemListParams
import com.increase.api.models.InboundMailItemRetrieveParams

class InboundMailItemServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : InboundMailItemServiceAsync {

    private val withRawResponse: InboundMailItemServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): InboundMailItemServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: InboundMailItemRetrieveParams,
        requestOptions: RequestOptions,
    ): InboundMailItem =
        // get /inbound_mail_items/{inbound_mail_item_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: InboundMailItemListParams,
        requestOptions: RequestOptions,
    ): InboundMailItemListPageAsync =
        // get /inbound_mail_items
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        InboundMailItemServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<InboundMailItem> =
            jsonHandler<InboundMailItem>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: InboundMailItemRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundMailItem> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_mail_items", params.getPathParam(0))
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

        private val listHandler: Handler<InboundMailItemListPageAsync.Response> =
            jsonHandler<InboundMailItemListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: InboundMailItemListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundMailItemListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("inbound_mail_items")
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
                        InboundMailItemListPageAsync.of(
                            InboundMailItemServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
