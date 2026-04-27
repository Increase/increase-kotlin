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
import com.increase.api.models.lockboxrecipients.LockboxRecipient
import com.increase.api.models.lockboxrecipients.LockboxRecipientCreateParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientListPageAsync
import com.increase.api.models.lockboxrecipients.LockboxRecipientListPageResponse
import com.increase.api.models.lockboxrecipients.LockboxRecipientListParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientRetrieveParams
import com.increase.api.models.lockboxrecipients.LockboxRecipientUpdateParams

class LockboxRecipientServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : LockboxRecipientServiceAsync {

    private val withRawResponse: LockboxRecipientServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): LockboxRecipientServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): LockboxRecipientServiceAsync =
        LockboxRecipientServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: LockboxRecipientCreateParams,
        requestOptions: RequestOptions,
    ): LockboxRecipient =
        // post /lockbox_recipients
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: LockboxRecipientRetrieveParams,
        requestOptions: RequestOptions,
    ): LockboxRecipient =
        // get /lockbox_recipients/{lockbox_recipient_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: LockboxRecipientUpdateParams,
        requestOptions: RequestOptions,
    ): LockboxRecipient =
        // patch /lockbox_recipients/{lockbox_recipient_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: LockboxRecipientListParams,
        requestOptions: RequestOptions,
    ): LockboxRecipientListPageAsync =
        // get /lockbox_recipients
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        LockboxRecipientServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): LockboxRecipientServiceAsync.WithRawResponse =
            LockboxRecipientServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<LockboxRecipient> =
            jsonHandler<LockboxRecipient>(clientOptions.jsonMapper)

        override suspend fun create(
            params: LockboxRecipientCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_recipients")
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

        private val retrieveHandler: Handler<LockboxRecipient> =
            jsonHandler<LockboxRecipient>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: LockboxRecipientRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxRecipientId", params.lockboxRecipientId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_recipients", params._pathParam(0))
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

        private val updateHandler: Handler<LockboxRecipient> =
            jsonHandler<LockboxRecipient>(clientOptions.jsonMapper)

        override suspend fun update(
            params: LockboxRecipientUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipient> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("lockboxRecipientId", params.lockboxRecipientId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_recipients", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<LockboxRecipientListPageResponse> =
            jsonHandler<LockboxRecipientListPageResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: LockboxRecipientListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<LockboxRecipientListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("lockbox_recipients")
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
                        LockboxRecipientListPageAsync.builder()
                            .service(LockboxRecipientServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }
    }
}
