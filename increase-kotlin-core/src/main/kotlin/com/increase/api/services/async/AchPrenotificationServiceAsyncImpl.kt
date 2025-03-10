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
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListPageAsync
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams

class AchPrenotificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AchPrenotificationServiceAsync {

    private val withRawResponse: AchPrenotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchPrenotificationServiceAsync.WithRawResponse = withRawResponse

    override suspend fun create(
        params: AchPrenotificationCreateParams,
        requestOptions: RequestOptions,
    ): AchPrenotification =
        // post /ach_prenotifications
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AchPrenotificationRetrieveParams,
        requestOptions: RequestOptions,
    ): AchPrenotification =
        // get /ach_prenotifications/{ach_prenotification_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: AchPrenotificationListParams,
        requestOptions: RequestOptions,
    ): AchPrenotificationListPageAsync =
        // get /ach_prenotifications
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchPrenotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .addPathSegments("ach_prenotifications")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications", params.getPathParam(0))
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

        private val listHandler: Handler<AchPrenotificationListPageAsync.Response> =
            jsonHandler<AchPrenotificationListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AchPrenotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotificationListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("ach_prenotifications")
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
                        AchPrenotificationListPageAsync.of(
                            AchPrenotificationServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
