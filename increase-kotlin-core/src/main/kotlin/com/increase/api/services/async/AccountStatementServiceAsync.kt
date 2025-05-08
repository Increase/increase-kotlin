// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.accountstatements.AccountStatementListPageAsync
import com.increase.api.models.accountstatements.AccountStatementListParams
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams

interface AccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Account Statement */
    suspend fun retrieve(
        accountStatementId: String,
        params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement =
        retrieve(params.toBuilder().accountStatementId(accountStatementId).build(), requestOptions)

    /** @see [retrieve] */
    suspend fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement

    /** @see [retrieve] */
    suspend fun retrieve(
        accountStatementId: String,
        requestOptions: RequestOptions,
    ): AccountStatement =
        retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

    /** List Account Statements */
    suspend fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatementListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AccountStatementListPageAsync =
        list(AccountStatementListParams.none(), requestOptions)

    /**
     * A view of [AccountStatementServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /account_statements/{account_statement_id}`, but is
         * otherwise the same as [AccountStatementServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            accountStatementId: String,
            params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatement> =
            retrieve(
                params.toBuilder().accountStatementId(accountStatementId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatement>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            accountStatementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountStatement> =
            retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatementListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountStatementListPageAsync> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
