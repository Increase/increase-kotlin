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
import com.increase.api.models.achprenotifications.AchPrenotification
import com.increase.api.models.achprenotifications.AchPrenotificationCreateParams
import com.increase.api.models.achprenotifications.AchPrenotificationListParams
import com.increase.api.models.achprenotifications.AchPrenotificationListResponse
import com.increase.api.models.achprenotifications.AchPrenotificationRetrieveParams

class AchPrenotificationServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : AchPrenotificationServiceAsync {

    private val withRawResponse: AchPrenotificationServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AchPrenotificationServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): AchPrenotificationServiceAsync =
        AchPrenotificationServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

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
    ): AchPrenotificationListResponse =
        // get /ach_prenotifications
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AchPrenotificationServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AchPrenotificationServiceAsync.WithRawResponse =
            AchPrenotificationServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AchPrenotificationCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_prenotifications")
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

        private val retrieveHandler: Handler<AchPrenotification> =
            jsonHandler<AchPrenotification>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AchPrenotificationRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotification> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("achPrenotificationId", params.achPrenotificationId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_prenotifications", params._pathParam(0))
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

        private val listHandler: Handler<AchPrenotificationListResponse> =
            jsonHandler<AchPrenotificationListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AchPrenotificationListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AchPrenotificationListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("ach_prenotifications")
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
