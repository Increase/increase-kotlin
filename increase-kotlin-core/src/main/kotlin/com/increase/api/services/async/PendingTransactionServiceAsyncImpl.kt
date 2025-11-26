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
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionListResponse
import com.increase.api.models.pendingtransactions.PendingTransactionReleaseParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams

class PendingTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : PendingTransactionServiceAsync {

    private val withRawResponse: PendingTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PendingTransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): PendingTransactionServiceAsync =
        PendingTransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: PendingTransactionCreateParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // post /pending_transactions
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // get /pending_transactions/{pending_transaction_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions,
    ): PendingTransactionListResponse =
        // get /pending_transactions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun release(
        params: PendingTransactionReleaseParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // post /pending_transactions/{pending_transaction_id}/release
        withRawResponse().release(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PendingTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PendingTransactionServiceAsync.WithRawResponse =
            PendingTransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper)

        override suspend fun create(
            params: PendingTransactionCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions")
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

        private val retrieveHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pendingTransactionId", params.pendingTransactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions", params._pathParam(0))
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

        private val listHandler: Handler<PendingTransactionListResponse> =
            jsonHandler<PendingTransactionListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: PendingTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransactionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions")
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

        private val releaseHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper)

        override suspend fun release(
            params: PendingTransactionReleaseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pendingTransactionId", params.pendingTransactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("pending_transactions", params._pathParam(0), "release")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { releaseHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
