// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounts.Account
import com.increase.api.models.accounts.AccountBalanceParams
import com.increase.api.models.accounts.AccountCloseParams
import com.increase.api.models.accounts.AccountCreateParams
import com.increase.api.models.accounts.AccountListPageAsync
import com.increase.api.models.accounts.AccountListParams
import com.increase.api.models.accounts.AccountRetrieveParams
import com.increase.api.models.accounts.AccountUpdateParams
import com.increase.api.models.accounts.BalanceLookup

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account */
    suspend fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** Retrieve an Account */
    suspend fun retrieve(
        accountId: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = retrieve(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see [retrieve] */
    suspend fun retrieve(accountId: String, requestOptions: RequestOptions): Account =
        retrieve(accountId, AccountRetrieveParams.none(), requestOptions)

    /** Update an Account */
    suspend fun update(
        accountId: String,
        params: AccountUpdateParams = AccountUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = update(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see [update] */
    suspend fun update(accountId: String, requestOptions: RequestOptions): Account =
        update(accountId, AccountUpdateParams.none(), requestOptions)

    /** List Accounts */
    suspend fun list(
        params: AccountListParams = AccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AccountListPageAsync =
        list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the account's
     * currency. Learn more about [account balances](/documentation/balance).
     */
    suspend fun balance(
        accountId: String,
        params: AccountBalanceParams = AccountBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceLookup = balance(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [balance] */
    suspend fun balance(
        params: AccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BalanceLookup

    /** @see [balance] */
    suspend fun balance(accountId: String, requestOptions: RequestOptions): BalanceLookup =
        balance(accountId, AccountBalanceParams.none(), requestOptions)

    /** Close an Account */
    suspend fun close(
        accountId: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account = close(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [close] */
    suspend fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Account

    /** @see [close] */
    suspend fun close(accountId: String, requestOptions: RequestOptions): Account =
        close(accountId, AccountCloseParams.none(), requestOptions)

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            accountId: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            retrieve(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> =
            retrieve(accountId, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise the same
         * as [AccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            accountId: String,
            params: AccountUpdateParams = AccountUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            update(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: AccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> = update(accountId, AccountUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountListParams = AccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPageAsync> =
            list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is otherwise
         * the same as [AccountServiceAsync.balance].
         */
        @MustBeClosed
        suspend fun balance(
            accountId: String,
            params: AccountBalanceParams = AccountBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceLookup> =
            balance(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [balance] */
        @MustBeClosed
        suspend fun balance(
            params: AccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BalanceLookup>

        /** @see [balance] */
        @MustBeClosed
        suspend fun balance(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BalanceLookup> =
            balance(accountId, AccountBalanceParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is otherwise the
         * same as [AccountServiceAsync.close].
         */
        @MustBeClosed
        suspend fun close(
            accountId: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account> =
            close(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [close] */
        @MustBeClosed
        suspend fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Account>

        /** @see [close] */
        @MustBeClosed
        suspend fun close(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Account> = close(accountId, AccountCloseParams.none(), requestOptions)
    }
}
