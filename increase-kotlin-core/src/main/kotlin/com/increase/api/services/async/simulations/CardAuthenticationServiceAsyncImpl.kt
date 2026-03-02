// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.cardpayments.CardPayment
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengeAttemptsParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationChallengesParams
import com.increase.api.models.simulations.cardauthentications.CardAuthenticationCreateParams

class CardAuthenticationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : CardAuthenticationServiceAsync {

    private val withRawResponse: CardAuthenticationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): CardAuthenticationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): CardAuthenticationServiceAsync =
        CardAuthenticationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: CardAuthenticationCreateParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // post /simulations/card_authentications
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun challengeAttempts(
        params: CardAuthenticationChallengeAttemptsParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // post /simulations/card_authentications/{card_payment_id}/challenge_attempts
        withRawResponse().challengeAttempts(params, requestOptions).parse()

    override suspend fun challenges(
        params: CardAuthenticationChallengesParams,
        requestOptions: RequestOptions,
    ): CardPayment =
        // post /simulations/card_authentications/{card_payment_id}/challenges
        withRawResponse().challenges(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        CardAuthenticationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): CardAuthenticationServiceAsync.WithRawResponse =
            CardAuthenticationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper)

        override suspend fun create(
            params: CardAuthenticationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("simulations", "card_authentications")
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

        private val challengeAttemptsHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper)

        override suspend fun challengeAttempts(
            params: CardAuthenticationChallengeAttemptsParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPaymentId", params.cardPaymentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "card_authentications",
                        params._pathParam(0),
                        "challenge_attempts",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { challengeAttemptsHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val challengesHandler: Handler<CardPayment> =
            jsonHandler<CardPayment>(clientOptions.jsonMapper)

        override suspend fun challenges(
            params: CardAuthenticationChallengesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CardPayment> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("cardPaymentId", params.cardPaymentId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "card_authentications",
                        params._pathParam(0),
                        "challenges",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { challengesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
