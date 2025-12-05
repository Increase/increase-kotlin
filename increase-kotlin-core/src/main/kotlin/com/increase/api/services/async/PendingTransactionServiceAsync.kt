// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import com.increase.api.models.pendingtransactions.PendingTransactionListPageAsync
import com.increase.api.models.pendingtransactions.PendingTransactionListParams
import com.increase.api.models.pendingtransactions.PendingTransactionReleaseParams
import com.increase.api.models.pendingtransactions.PendingTransactionRetrieveParams

interface PendingTransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PendingTransactionServiceAsync

    /**
     * Creates a pending transaction on an account. This can be useful to hold funds for an external
     * payment or known future transaction outside of Increase (only negative amounts are
     * supported). The resulting Pending Transaction will have a `category` of `user_initiated_hold`
     * and can be released via the API to unlock the held funds.
     */
    suspend fun create(
        params: PendingTransactionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

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

    /** @see retrieve */
    suspend fun retrieve(
        params: PendingTransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see retrieve */
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

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): PendingTransactionListPageAsync =
        list(PendingTransactionListParams.none(), requestOptions)

    /**
     * Release a Pending Transaction you had previously created. The Pending Transaction must have a
     * `category` of `user_initiated_hold` and a `status` of `pending`. This will unlock the held
     * funds and mark the Pending Transaction as complete.
     */
    suspend fun release(
        pendingTransactionId: String,
        params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        release(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see release */
    suspend fun release(
        params: PendingTransactionReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see release */
    suspend fun release(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)

    /**
     * A view of [PendingTransactionServiceAsync] that provides access to raw HTTP responses for
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
        ): PendingTransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /pending_transactions`, but is otherwise the same
         * as [PendingTransactionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: PendingTransactionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

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

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: PendingTransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see retrieve */
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

        /** @see list */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<PendingTransactionListPageAsync> =
            list(PendingTransactionListParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /pending_transactions/{pending_transaction_id}/release`, but is otherwise the same as
         * [PendingTransactionServiceAsync.release].
         */
        @MustBeClosed
        suspend fun release(
            pendingTransactionId: String,
            params: PendingTransactionReleaseParams = PendingTransactionReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            release(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see release */
        @MustBeClosed
        suspend fun release(
            params: PendingTransactionReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see release */
        @MustBeClosed
        suspend fun release(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            release(pendingTransactionId, PendingTransactionReleaseParams.none(), requestOptions)
    }
}
