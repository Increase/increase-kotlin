// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.DeclinedTransaction
import com.increase.api.models.DeclinedTransactionListPage
import com.increase.api.models.DeclinedTransactionListParams
import com.increase.api.models.DeclinedTransactionRetrieveParams

class DeclinedTransactionServiceImpl
internal constructor(private val clientOptions: ClientOptions) : DeclinedTransactionService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<DeclinedTransaction> =
        jsonHandler<DeclinedTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Declined Transaction */
    override fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): DeclinedTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<DeclinedTransactionListPage.Response> =
        jsonHandler<DeclinedTransactionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Declined Transactions */
    override fun list(
        params: DeclinedTransactionListParams,
        requestOptions: RequestOptions,
    ): DeclinedTransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("declined_transactions")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { DeclinedTransactionListPage.of(this, params, it) }
    }
}
