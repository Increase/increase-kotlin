// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseParams
import com.increase.api.models.simulations.inboundfundsholds.InboundFundsHoldReleaseResponse

interface InboundFundsHoldServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundFundsHoldServiceAsync

    /**
     * This endpoint simulates immediately releasing an Inbound Funds Hold, which might be created
     * as a result of e.g., an ACH debit.
     */
    suspend fun release(
        inboundFundsHoldId: String,
        params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFundsHoldReleaseResponse =
        release(params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(), requestOptions)

    /** @see release */
    suspend fun release(
        params: InboundFundsHoldReleaseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundFundsHoldReleaseResponse

    /** @see release */
    suspend fun release(
        inboundFundsHoldId: String,
        requestOptions: RequestOptions,
    ): InboundFundsHoldReleaseResponse =
        release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)

    /**
     * A view of [InboundFundsHoldServiceAsync] that provides access to raw HTTP responses for each
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
        ): InboundFundsHoldServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post
         * /simulations/inbound_funds_holds/{inbound_funds_hold_id}/release`, but is otherwise the
         * same as [InboundFundsHoldServiceAsync.release].
         */
        @MustBeClosed
        suspend fun release(
            inboundFundsHoldId: String,
            params: InboundFundsHoldReleaseParams = InboundFundsHoldReleaseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(
                params.toBuilder().inboundFundsHoldId(inboundFundsHoldId).build(),
                requestOptions,
            )

        /** @see release */
        @MustBeClosed
        suspend fun release(
            params: InboundFundsHoldReleaseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundFundsHoldReleaseResponse>

        /** @see release */
        @MustBeClosed
        suspend fun release(
            inboundFundsHoldId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundFundsHoldReleaseResponse> =
            release(inboundFundsHoldId, InboundFundsHoldReleaseParams.none(), requestOptions)
    }
}
