// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionListPageAsync
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams

interface PendingTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve a Pending Transaction */
    suspend fun retrieve(
        pendingTransactionId: String,
        params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        retrieve(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see [retrieve] */
    suspend fun retrieve(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

    /** List Pending Transactions */
    suspend fun list(
        params: PendingTransactionListParams = PendingTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransactionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): PendingTransactionListPageAsync =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /pending_transactions/{pending_transaction_id}`, but
         * is otherwise the same as [PendingTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            pendingTransactionId: String,
            params: PendingTransactionRetrieveParams = PendingTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            retrieve(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            retrieve(pendingTransactionId, PendingTransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /pending_transactions`, but is otherwise the same as
         * [PendingTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: PendingTransactionListParams = PendingTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransactionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PendingTransactionListPageAsync> =
            list(PendingTransactionListParams.none(), requestOptions)
    }
}
