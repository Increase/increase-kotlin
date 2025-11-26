// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionListResponse
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams

interface DeclinedTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeclinedTransactionServiceAsync

    /** Retrieve a Declined Transaction */
    suspend fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction =
        retrieve(
            params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
            requestOptions,
        )

    /** @see retrieve */
    suspend fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** @see retrieve */
    suspend fun retrieve(
        declinedTransactionId: String,
        requestOptions: RequestOptions,
    ): DeclinedTransaction =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none(), requestOptions)

    /** List Declined Transactions */
    suspend fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransactionListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): DeclinedTransactionListResponse =
        list(DeclinedTransactionListParams.none(), requestOptions)

    /**
     * A view of [DeclinedTransactionServiceAsync] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): DeclinedTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /declined_transactions/{declined_transaction_id}`,
         * but is otherwise the same as [DeclinedTransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(
                params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
                requestOptions,
            )

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            declinedTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(
                declinedTransactionId,
                DeclinedTransactionRetrieveParams.none(),
                requestOptions,
            )

        /**
         * Returns a raw HTTP response for `get /declined_transactions`, but is otherwise the same
         * as [DeclinedTransactionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransactionListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<DeclinedTransactionListResponse> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
