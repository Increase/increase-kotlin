// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.accounts.Account
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCloseParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountListPageAsync
import com.increase.api.models.accounts.AccountListPageResponse
import com.increase.api.models.accounts.AccountListParams
import com.increase.api.models.accounts.AccountRetrieveParams
import com.increase.api.models.accounts.AccountUpdateParams
import com.increase.api.models.accounts.BalanceLookup

class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): Account =
        // post /accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): Account =
        // get /accounts/{account_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions,
    ): Account =
        // patch /accounts/{account_id}
        withRawResponse().update(params, requestOptions).parse()

    override suspend fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): AccountListPageAsync =
        // get /accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions,
    ): BalanceLookup =
        // get /accounts/{account_id}/balance
        withRawResponse().balance(params, requestOptions).parse()

    override suspend fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions,
    ): Account =
        // post /accounts/{account_id}/close
        withRawResponse().close(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts", params._pathParam(0))
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

        private val updateHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { updateHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<AccountListPageResponse> =
            jsonHandler<AccountListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts")
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
                        AccountListPageAsync.builder()
                            .service(AccountServiceAsyncImpl(clientOptions))
                            .params(params)
                            .response(it)
                            .build()
                    }
            }
        }

        private val balanceHandler: Handler<BalanceLookup> =
            jsonHandler<BalanceLookup>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceLookup> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts", params._pathParam(0), "balance")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { balanceHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val closeHandler: Handler<Account> =
            jsonHandler<Account>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("accounts", params._pathParam(0), "close")
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { closeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
