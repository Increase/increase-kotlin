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
import com.increase.api.core.json
import com.increase.api.errors.IncreaseError
import com.increase.api.models.InboundCheckDeposit
import com.increase.api.models.InboundCheckDepositDeclineParams
import com.increase.api.models.InboundCheckDepositListPage
import com.increase.api.models.InboundCheckDepositListParams
import com.increase.api.models.InboundCheckDepositRetrieveParams
import com.increase.api.models.InboundCheckDepositReturnParams

class InboundCheckDepositServiceImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : InboundCheckDepositService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Inbound Check Deposit */
    override fun retrieve(
        params: InboundCheckDepositRetrieveParams,
        requestOptions: RequestOptions
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0))
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { retrieveHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val listHandler: Handler<InboundCheckDepositListPage.Response> =
        jsonHandler<InboundCheckDepositListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Inbound Check Deposits */
    override fun list(
        params: InboundCheckDepositListParams,
        requestOptions: RequestOptions
    ): InboundCheckDepositListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("inbound_check_deposits")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { listHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
                .let { InboundCheckDepositListPage.of(this, params, it) }
        }
    }

    private val declineHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Decline an Inbound Check Deposit */
    override fun decline(
        params: InboundCheckDepositDeclineParams,
        requestOptions: RequestOptions
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "decline")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .apply { params.getBody()?.also { body(json(clientOptions.jsonMapper, it)) } }
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { declineHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }

    private val returnHandler: Handler<InboundCheckDeposit> =
        jsonHandler<InboundCheckDeposit>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Return an Inbound Check Deposit */
    override fun return_(
        params: InboundCheckDepositReturnParams,
        requestOptions: RequestOptions
    ): InboundCheckDeposit {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("inbound_check_deposits", params.getPathParam(0), "return")
                .putAllQueryParams(clientOptions.queryParams)
                .replaceAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .replaceAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { returnHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
