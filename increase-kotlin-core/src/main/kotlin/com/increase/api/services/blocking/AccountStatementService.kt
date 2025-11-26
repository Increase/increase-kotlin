// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.accountstatements.AccountStatementListParams
import com.increase.api.models.accountstatements.AccountStatementListResponse
import com.increase.api.models.accountstatements.AccountStatementRetrieveParams

interface AccountStatementService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountStatementService

    /** Retrieve an Account Statement */
    fun retrieve(
        accountStatementId: String,
        params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement =
        retrieve(params.toBuilder().accountStatementId(accountStatementId).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: AccountStatementRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatement

    /** @see retrieve */
    fun retrieve(accountStatementId: String, requestOptions: RequestOptions): AccountStatement =
        retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

    /** List Account Statements */
    fun list(
        params: AccountStatementListParams = AccountStatementListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountStatementListResponse

    /** @see list */
    fun list(requestOptions: RequestOptions): AccountStatementListResponse =
        list(AccountStatementListParams.none(), requestOptions)

    /**
     * A view of [AccountStatementService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountStatementService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /account_statements/{account_statement_id}`, but is
         * otherwise the same as [AccountStatementService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            accountStatementId: String,
            params: AccountStatementRetrieveParams = AccountStatementRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatement> =
            retrieve(
                params.toBuilder().accountStatementId(accountStatementId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: AccountStatementRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatement>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            accountStatementId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountStatement> =
            retrieve(accountStatementId, AccountStatementRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_statements`, but is otherwise the same as
         * [AccountStatementService.list].
         */
        @MustBeClosed
        fun list(
            params: AccountStatementListParams = AccountStatementListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountStatementListResponse>

        /** @see list */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountStatementListResponse> =
            list(AccountStatementListParams.none(), requestOptions)
    }
}
