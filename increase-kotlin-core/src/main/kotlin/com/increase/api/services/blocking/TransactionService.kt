// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.transactions.Transaction
import com.increase.api.models.transactions.TransactionListPage
import com.increase.api.models.transactions.TransactionListParams
import com.increase.api.models.transactions.TransactionRetrieveParams

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionService

    /** Retrieve a Transaction */
    fun retrieve(
        transactionId: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction =
        retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see [retrieve] */
    fun retrieve(transactionId: String, requestOptions: RequestOptions): Transaction =
        retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

    /** List Transactions */
    fun list(
        params: TransactionListParams = TransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): TransactionListPage =
        list(TransactionListParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /transactions/{transaction_id}`, but is otherwise
         * the same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            retrieve(params.toBuilder().transactionId(transactionId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            transactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> =
            retrieve(transactionId, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionListParams = TransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<TransactionListPage> =
            list(TransactionListParams.none(), requestOptions)
    }
}
