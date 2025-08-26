// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.pendingtransactions.PendingTransaction
import com.increase.api.models.simulations.pendingtransactions.PendingTransactionReleaseInboundFundsHoldParams

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
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of, for example, an ACH debit.
     */
    suspend fun releaseInboundFundsHold(
        pendingTransactionId: String,
        params: PendingTransactionReleaseInboundFundsHoldParams =
            PendingTransactionReleaseInboundFundsHoldParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction =
        releaseInboundFundsHold(
            params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
            requestOptions,
        )

    /** @see releaseInboundFundsHold */
    suspend fun releaseInboundFundsHold(
        params: PendingTransactionReleaseInboundFundsHoldParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): PendingTransaction

    /** @see releaseInboundFundsHold */
    suspend fun releaseInboundFundsHold(
        pendingTransactionId: String,
        requestOptions: RequestOptions,
    ): PendingTransaction =
        releaseInboundFundsHold(
            pendingTransactionId,
            PendingTransactionReleaseInboundFundsHoldParams.none(),
            requestOptions,
        )

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
         * Returns a raw HTTP response for `post
         * /simulations/pending_transactions/{pending_transaction_id}/release_inbound_funds_hold`,
         * but is otherwise the same as [PendingTransactionServiceAsync.releaseInboundFundsHold].
         */
        @MustBeClosed
        suspend fun releaseInboundFundsHold(
            pendingTransactionId: String,
            params: PendingTransactionReleaseInboundFundsHoldParams =
                PendingTransactionReleaseInboundFundsHoldParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(
                params.toBuilder().pendingTransactionId(pendingTransactionId).build(),
                requestOptions,
            )

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        suspend fun releaseInboundFundsHold(
            params: PendingTransactionReleaseInboundFundsHoldParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<PendingTransaction>

        /** @see releaseInboundFundsHold */
        @MustBeClosed
        suspend fun releaseInboundFundsHold(
            pendingTransactionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PendingTransaction> =
            releaseInboundFundsHold(
                pendingTransactionId,
                PendingTransactionReleaseInboundFundsHoldParams.none(),
                requestOptions,
            )
    }
}
