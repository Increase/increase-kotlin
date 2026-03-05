// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.inboundcheckdeposits.InboundCheckDeposit
import com.increase.api.models.simulations.inboundcheckdeposits.InboundCheckDepositAdjustmentParams
import com.increase.api.models.simulations.inboundcheckdeposits.InboundCheckDepositCreateParams

interface InboundCheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): InboundCheckDepositServiceAsync

    /**
     * Simulates an Inbound Check Deposit against your account. This imitates someone depositing a
     * check at their bank that was issued from your account. It may or may not be associated with a
     * Check Transfer. Increase will evaluate the Inbound Check Deposit as we would in production
     * and either create a Transaction or a Declined Transaction as a result. You can inspect the
     * resulting Inbound Check Deposit object to see the result.
     */
    suspend fun create(
        params: InboundCheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /**
     * Simulates an adjustment on an Inbound Check Deposit. The Inbound Check Deposit must have a
     * `status` of `accepted`.
     */
    suspend fun adjustment(
        inboundCheckDepositId: String,
        params: InboundCheckDepositAdjustmentParams = InboundCheckDepositAdjustmentParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit =
        adjustment(
            params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
            requestOptions,
        )

    /** @see adjustment */
    suspend fun adjustment(
        params: InboundCheckDepositAdjustmentParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): InboundCheckDeposit

    /** @see adjustment */
    suspend fun adjustment(
        inboundCheckDepositId: String,
        requestOptions: RequestOptions,
    ): InboundCheckDeposit =
        adjustment(
            inboundCheckDepositId,
            InboundCheckDepositAdjustmentParams.none(),
            requestOptions,
        )

    /**
     * A view of [InboundCheckDepositServiceAsync] that provides access to raw HTTP responses for
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
        ): InboundCheckDepositServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /simulations/inbound_check_deposits`, but is
         * otherwise the same as [InboundCheckDepositServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: InboundCheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /**
         * Returns a raw HTTP response for `post
         * /simulations/inbound_check_deposits/{inbound_check_deposit_id}/adjustment`, but is
         * otherwise the same as [InboundCheckDepositServiceAsync.adjustment].
         */
        @MustBeClosed
        suspend fun adjustment(
            inboundCheckDepositId: String,
            params: InboundCheckDepositAdjustmentParams =
                InboundCheckDepositAdjustmentParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit> =
            adjustment(
                params.toBuilder().inboundCheckDepositId(inboundCheckDepositId).build(),
                requestOptions,
            )

        /** @see adjustment */
        @MustBeClosed
        suspend fun adjustment(
            params: InboundCheckDepositAdjustmentParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<InboundCheckDeposit>

        /** @see adjustment */
        @MustBeClosed
        suspend fun adjustment(
            inboundCheckDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<InboundCheckDeposit> =
            adjustment(
                inboundCheckDepositId,
                InboundCheckDepositAdjustmentParams.none(),
                requestOptions,
            )
    }
}
