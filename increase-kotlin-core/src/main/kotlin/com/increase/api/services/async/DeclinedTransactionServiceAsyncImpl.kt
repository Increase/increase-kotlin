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
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListPageAsync
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams

class DeclinedTransactionServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : DeclinedTransactionServiceAsync {

    private val withRawResponse: DeclinedTransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): DeclinedTransactionServiceAsync.WithRawResponse =
        withRawResponse

    override suspend fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): DeclinedTransaction =
        // get /declined_transactions/{declined_transaction_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions,
    ): DeclinedTransactionListPageAsync =
        // get /declined_transactions
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        DeclinedTransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<DeclinedTransaction> =
            jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeclinedTransaction> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("declined_transactions", params._pathParam(0))
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

        private val listHandler: Handler<DeclinedTransactionListPageAsync.Response> =
            jsonHandler<DeclinedTransactionListPageAsync.Response>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: DeclinedTransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeclinedTransactionListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("declined_transactions")
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
                        DeclinedTransactionListPageAsync.of(
                            DeclinedTransactionServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
