// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.transactions.Transaction
import com.increase.api.models.transactions.TransactionListPageAsync
import com.increase.api.models.transactions.TransactionListParams
import com.increase.api.models.transactions.TransactionRetrieveParams

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Transaction */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** List Transactions */
    suspend fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): TransactionListPageAsync =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /transactions/{transaction_id}`, but is otherwise
         * the same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<TransactionListPageAsync> =
            list(TransactionListParams.none(), requestOptions)
    }
}
