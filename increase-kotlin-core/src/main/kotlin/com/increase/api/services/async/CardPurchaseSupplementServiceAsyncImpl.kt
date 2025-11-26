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
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplement
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListParams
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementListResponse
import com.increase.api.models.cardpurchasesupplements.CardPurchaseSupplementRetrieveParams

class CardPurchaseSupplementServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) :
    CardPurchaseSupplementServiceAsync {

    private val withRawResponse: CardPurchaseSupplementServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardPurchaseSupplementServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CardPurchaseSupplementServiceAsync =
        CardPurchaseSupplementServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: CardPurchaseSupplementRetrieveParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplement =
        // get /card_purchase_supplements/{card_purchase_supplement_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: CardPurchaseSupplementListParams,
        requestOptions: RequestOptions,
    ): CardPurchaseSupplementListResponse =
        // get /card_purchase_supplements
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardPurchaseSupplementServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardPurchaseSupplementServiceAsync.WithRawResponse =
            CardPurchaseSupplementServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<CardPurchaseSupplement> =
            jsonHandler<CardPurchaseSupplement>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: CardPurchaseSupplementRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPurchaseSupplement> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPurchaseSupplementId", params.cardPurchaseSupplementId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements", params._pathParam(0))
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

        private val listHandler: Handler<CardPurchaseSupplementListResponse> =
            jsonHandler<CardPurchaseSupplementListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: CardPurchaseSupplementListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPurchaseSupplementListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("card_purchase_supplements")
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
    }
}
