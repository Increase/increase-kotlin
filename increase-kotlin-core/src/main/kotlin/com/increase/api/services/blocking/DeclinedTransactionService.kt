// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.declinedtransactions.DeclinedTransaction
import com.increase.api.models.declinedtransactions.DeclinedTransactionListPage
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams

interface DeclinedTransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): DeclinedTransactionService

    /** Retrieve a Declined Transaction */
    fun retrieve(
        declinedTransactionId: String,
        params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction =
        retrieve(
            params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    fun retrieve(
        params: DeclinedTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransaction

    /** @see [retrieve] */
    fun retrieve(
        declinedTransactionId: String,
        requestOptions: RequestOptions,
    ): DeclinedTransaction =
        retrieve(declinedTransactionId, DeclinedTransactionRetrieveParams.none(), requestOptions)

    /** List Declined Transactions */
    fun list(
        params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): DeclinedTransactionListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): DeclinedTransactionListPage =
        list(DeclinedTransactionListParams.none(), requestOptions)

    /**
     * A view of [DeclinedTransactionService] that provides access to raw HTTP responses for each
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
        ): DeclinedTransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /declined_transactions/{declined_transaction_id}`,
         * but is otherwise the same as [DeclinedTransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            declinedTransactionId: String,
            params: DeclinedTransactionRetrieveParams = DeclinedTransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction> =
            retrieve(
                params.toBuilder().declinedTransactionId(declinedTransactionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: DeclinedTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransaction>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
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
         * as [DeclinedTransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: DeclinedTransactionListParams = DeclinedTransactionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<DeclinedTransactionListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<DeclinedTransactionListPage> =
            list(DeclinedTransactionListParams.none(), requestOptions)
    }
}
