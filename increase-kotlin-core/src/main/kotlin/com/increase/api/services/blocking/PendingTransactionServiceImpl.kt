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
import com.increase.api.models.PendingTransaction
import com.increase.api.models.PendingTransactionListPage
import com.increase.api.models.PendingTransactionListParams
import com.increase.api.models.PendingTransactionRetrieveParams

class PendingTransactionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    PendingTransactionService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<PendingTransaction> =
        jsonHandler<PendingTransaction>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve a Pending Transaction */
    override fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): PendingTransaction {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("pending_transactions", params.getPathParam(0))
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

    private val listHandler: Handler<PendingTransactionListPage.Response> =
        jsonHandler<PendingTransactionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Pending Transactions */
    override fun list(
        params: PendingTransactionListParams,
        requestOptions: RequestOptions,
    ): PendingTransactionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("pending_transactions")
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
            .let { PendingTransactionListPage.of(this, params, it) }
    }
}
