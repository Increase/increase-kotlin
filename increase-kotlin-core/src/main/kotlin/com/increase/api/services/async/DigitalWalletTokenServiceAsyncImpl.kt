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
import com.increase.api.models.digitalwallettokens.DigitalWalletToken
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListParams
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenListResponse
import com.increase.api.models.digitalwallettokens.DigitalWalletTokenRetrieveParams

class DigitalWalletTokenServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DigitalWalletTokenServiceAsync {

    private val withRawResponse: DigitalWalletTokenServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DigitalWalletTokenServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): DigitalWalletTokenServiceAsync =
        DigitalWalletTokenServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: DigitalWalletTokenRetrieveParams,
        requestOptions: RequestOptions,
    ): DigitalWalletToken =
        // get /digital_wallet_tokens/{digital_wallet_token_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: DigitalWalletTokenListParams,
        requestOptions: RequestOptions,
    ): DigitalWalletTokenListResponse =
        // get /digital_wallet_tokens
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DigitalWalletTokenServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DigitalWalletTokenServiceAsync.WithRawResponse =
            DigitalWalletTokenServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<DigitalWalletToken> =
            jsonHandler<DigitalWalletToken>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: DigitalWalletTokenRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletToken> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("digitalWalletTokenId", params.digitalWalletTokenId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_tokens", params._pathParam(0))
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

        private val listHandler: Handler<DigitalWalletTokenListResponse> =
            jsonHandler<DigitalWalletTokenListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: DigitalWalletTokenListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DigitalWalletTokenListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("digital_wallet_tokens")
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
