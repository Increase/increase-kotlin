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
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.simulations.pendingtransactions.PendingTransactionReleaseInboundFundsHoldParams

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

    override suspend fun releaseInboundFundsHold(
        params: PendingTransactionReleaseInboundFundsHoldParams,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        // post
        // /simulations/pending_transactions/{pending_transaction_id}/release_inbound_funds_hold
        withRawResponse().releaseInboundFundsHold(params, requestOptions).parse()

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

        private val releaseInboundFundsHoldHandler: Handler<PendingTransaction> =
            jsonHandler<PendingTransaction>(clientOptions.jsonMapper)

        override suspend fun releaseInboundFundsHold(
            params: PendingTransactionReleaseInboundFundsHoldParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("pendingTransactionId", params.pendingTransactionId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "pending_transactions",
                        params._pathParam(0),
                        "release_inbound_funds_hold",
                    )
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { releaseInboundFundsHoldHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
