package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPageAsync
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams
import com.increase.api.services.errorHandler
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class DeclinedTransactionServiceAsyncImpl
constructor(
    private val clientOptions: ClientOptions,
) : DeclinedTransactionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DeclinedTransaction> =
        jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Declined Transaction */
    override suspend fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions
    ): DeclinedTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions", params.getPathParam(0))
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response
                .let { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<DeclinedTransactionListPageAsync.Response> =
        jsonHandler<DeclinedTransactionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Declined Transactions */
    override suspend fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions
    ): DeclinedTransactionListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions")
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.executeAsync(request).let { response ->
            response
                .let { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { DeclinedTransactionListPageAsync.of(this, params, it) }
        }
    }
}
