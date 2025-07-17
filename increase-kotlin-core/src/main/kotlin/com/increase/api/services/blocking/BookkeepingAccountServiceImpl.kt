// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

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
import com.increase.api.core.prepare
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccount
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPage
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPageResponse
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingBalanceLookup

class BookkeepingAccountServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    BookkeepingAccountService {

    private val withRawResponse: BookkeepingAccountService.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingAccountService.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): BookkeepingAccountService =
        BookkeepingAccountServiceImpl(clientOptions.toBuilder().apply(modifier).build())

    override fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions,
    ): BookkeepingAccount =
        // post /bookkeeping_accounts
        withRawResponse().create(params, requestOptions).parse()

    override fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions,
    ): BookkeepingAccount =
        // patch /bookkeeping_accounts/{bookkeeping_account_id}
        withRawResponse().update(params, requestOptions).parse()

    override fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions,
    ): BookkeepingAccountListPage =
        // get /bookkeeping_accounts
        withRawResponse().list(params, requestOptions).parse()

    override fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions,
    ): BookkeepingBalanceLookup =
        // get /bookkeeping_accounts/{bookkeeping_account_id}/balance
        withRawResponse().balance(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingAccountService.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookkeepingAccountService.WithRawResponse =
            BookkeepingAccountServiceImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BookkeepingAccount> =
            jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper)

        override fun create(
            params: BookkeepingAccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingAccount> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val updateHandler: Handler<BookkeepingAccount> =
            jsonHandler<BookkeepingAccount>(clientOptions.jsonMapper)

        override fun update(
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingAccount> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingAccountId", params.bookkeepingAccountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
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

        private val listHandler: Handler<BookkeepingAccountListPageResponse> =
            jsonHandler<BookkeepingAccountListPageResponse>(clientOptions.jsonMapper)

        override fun list(
            params: BookkeepingAccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingAccountListPage> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BookkeepingAccountListPage.builder()
                            .service(BookkeepingAccountServiceImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val balanceHandler: Handler<BookkeepingBalanceLookup> =
            jsonHandler<BookkeepingBalanceLookup>(clientOptions.jsonMapper)

        override fun balance(
            params: BookkeepingAccountBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingBalanceLookup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingAccountId", params.bookkeepingAccountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_accounts", params._pathParam(0), "balance")
                    .build()
                    .prepare(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.execute(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { balanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
