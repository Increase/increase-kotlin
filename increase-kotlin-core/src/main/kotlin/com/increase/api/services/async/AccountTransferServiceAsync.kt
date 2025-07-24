// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accounttransfers.AccountTransfer
import com.increase.api.models.accounttransfers.AccountTransferApproveParams
import com.increase.api.models.accounttransfers.AccountTransferCancelParams
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListPageAsync
import com.increase.api.models.accounttransfers.AccountTransferListParams
import com.increase.api.models.accounttransfers.AccountTransferRetrieveParams

interface AccountTransferServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountTransferServiceAsync

    /** Create an Account Transfer */
    suspend fun create(
        params: AccountTransferCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** Retrieve an Account Transfer */
    suspend fun retrieve(
        accountTransferId: String,
        params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        retrieve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AccountTransferRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see retrieve */
    suspend fun retrieve(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

    /** List Account Transfers */
    suspend fun list(
        params: AccountTransferListParams = AccountTransferListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AccountTransferListPageAsync =
        list(AccountTransferListParams.none(), requestOptions)

    /** Approve an Account Transfer */
    suspend fun approve(
        accountTransferId: String,
        params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see approve */
    suspend fun approve(
        params: AccountTransferApproveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see approve */
    suspend fun approve(
        accountTransferId: String,
        requestOptions: RequestOptions,
    ): AccountTransfer =
        approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

    /** Cancel an Account Transfer */
    suspend fun cancel(
        accountTransferId: String,
        params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer =
        cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

    /** @see cancel */
    suspend fun cancel(
        params: AccountTransferCancelParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransfer

    /** @see cancel */
    suspend fun cancel(accountTransferId: String, requestOptions: RequestOptions): AccountTransfer =
        cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)

    /**
     * A view of [AccountTransferServiceAsync] that provides access to raw HTTP responses for each
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
        ): AccountTransferServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountTransferCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /**
         * Returns a raw HTTP response for `get /account_transfers/{account_transfer_id}`, but is
         * otherwise the same as [AccountTransferServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            accountTransferId: String,
            params: AccountTransferRetrieveParams = AccountTransferRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            retrieve(
                params.toBuilder().accountTransferId(accountTransferId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountTransferRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            retrieve(accountTransferId, AccountTransferRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_transfers`, but is otherwise the same as
         * [AccountTransferServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountTransferListParams = AccountTransferListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<AccountTransferListPageAsync> =
            list(AccountTransferListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/approve`,
         * but is otherwise the same as [AccountTransferServiceAsync.approve].
         */
        @MustBeClosed
        suspend fun approve(
            accountTransferId: String,
            params: AccountTransferApproveParams = AccountTransferApproveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            approve(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            params: AccountTransferApproveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see approve */
        @MustBeClosed
        suspend fun approve(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            approve(accountTransferId, AccountTransferApproveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /account_transfers/{account_transfer_id}/cancel`,
         * but is otherwise the same as [AccountTransferServiceAsync.cancel].
         */
        @MustBeClosed
        suspend fun cancel(
            accountTransferId: String,
            params: AccountTransferCancelParams = AccountTransferCancelParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer> =
            cancel(params.toBuilder().accountTransferId(accountTransferId).build(), requestOptions)

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            params: AccountTransferCancelParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransfer>

        /** @see cancel */
        @MustBeClosed
        suspend fun cancel(
            accountTransferId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransfer> =
            cancel(accountTransferId, AccountTransferCancelParams.none(), requestOptions)
    }
}
