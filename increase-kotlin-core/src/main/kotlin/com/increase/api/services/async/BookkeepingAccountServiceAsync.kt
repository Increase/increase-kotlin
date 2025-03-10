// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccount
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountBalanceParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountCreateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListPageAsync
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountListParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingAccountUpdateParams
import com.increase.api.models.bookkeepingaccounts.BookkeepingBalanceLookup

interface BookkeepingAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Bookkeeping Account */
    suspend fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccount

    /** Update a Bookkeeping Account */
    suspend fun update(
        params: BookkeepingAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccount

    /** List Bookkeeping Accounts */
    suspend fun list(
        params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): BookkeepingAccountListPageAsync =
        list(BookkeepingAccountListParams.none(), requestOptions)

    /** Retrieve a Bookkeeping Account Balance */
    suspend fun balance(
        params: BookkeepingAccountBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingBalanceLookup

    /**
     * A view of [BookkeepingAccountServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /bookkeeping_accounts`, but is otherwise the same
         * as [BookkeepingAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: BookkeepingAccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccount>

        /**
         * Returns a raw HTTP response for `patch /bookkeeping_accounts/{bookkeeping_account_id}`,
         * but is otherwise the same as [BookkeepingAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            params: BookkeepingAccountUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccount>

        /**
         * Returns a raw HTTP response for `get /bookkeeping_accounts`, but is otherwise the same as
         * [BookkeepingAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: BookkeepingAccountListParams = BookkeepingAccountListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<BookkeepingAccountListPageAsync> =
            list(BookkeepingAccountListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get
         * /bookkeeping_accounts/{bookkeeping_account_id}/balance`, but is otherwise the same as
         * [BookkeepingAccountServiceAsync.balance].
         */
        @MustBeClosed
        suspend fun balance(
            params: BookkeepingAccountBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<BookkeepingBalanceLookup>
    }
}
