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
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account */
    suspend fun create(params: AccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Retrieve an Account */
    suspend fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** Update an Account */
    suspend fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /** List Accounts */
    suspend fun list(params: AccountListParams = AccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AccountListPageAsync = list(AccountListParams.none(), requestOptions)

    /**
     * Retrieve the current and available balances for an account in minor units of the
     * account's currency. Learn more about [account balances](/documentation/balance).
     */
    suspend fun balance(params: AccountBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): BalanceLookup

    /** Close an Account */
    suspend fun close(params: AccountCloseParams, requestOptions: RequestOptions = RequestOptions.none()): Account

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: AccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}`, but is otherwise
         * the same as [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: AccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `patch /accounts/{account_id}`, but is otherwise
         * the same as [AccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(params: AccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>

        /**
         * Returns a raw HTTP response for `get /accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: AccountListParams = AccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AccountListPageAsync> = list(AccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/balance`, but is
         * otherwise the same as [AccountServiceAsync.balance].
         */
        @MustBeClosed
        suspend fun balance(params: AccountBalanceParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<BalanceLookup>

        /**
         * Returns a raw HTTP response for `post /accounts/{account_id}/close`, but is
         * otherwise the same as [AccountServiceAsync.close].
         */
        @MustBeClosed
        suspend fun close(params: AccountCloseParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Account>
    }
}
