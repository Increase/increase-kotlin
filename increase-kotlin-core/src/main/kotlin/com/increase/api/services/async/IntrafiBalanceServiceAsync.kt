// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.intrafibalances.IntrafiBalance
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams

interface IntrafiBalanceServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): IntrafiBalanceServiceAsync

    /**
     * Returns the IntraFi balance for the given account. IntraFi may sweep funds to multiple banks.
     * This endpoint will include both the total balance and the amount swept to each institution.
     */
    suspend fun intrafiBalance(
        accountId: String,
        params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiBalance =
        intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see [intrafiBalance] */
    suspend fun intrafiBalance(
        params: IntrafiBalanceIntrafiBalanceParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): IntrafiBalance

    /** @see [intrafiBalance] */
    suspend fun intrafiBalance(accountId: String, requestOptions: RequestOptions): IntrafiBalance =
        intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)

    /**
     * A view of [IntrafiBalanceServiceAsync] that provides access to raw HTTP responses for each
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
        ): IntrafiBalanceServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /accounts/{account_id}/intrafi_balance`, but is
         * otherwise the same as [IntrafiBalanceServiceAsync.intrafiBalance].
         */
        @MustBeClosed
        suspend fun intrafiBalance(
            accountId: String,
            params: IntrafiBalanceIntrafiBalanceParams = IntrafiBalanceIntrafiBalanceParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see [intrafiBalance] */
        @MustBeClosed
        suspend fun intrafiBalance(
            params: IntrafiBalanceIntrafiBalanceParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<IntrafiBalance>

        /** @see [intrafiBalance] */
        @MustBeClosed
        suspend fun intrafiBalance(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<IntrafiBalance> =
            intrafiBalance(accountId, IntrafiBalanceIntrafiBalanceParams.none(), requestOptions)
    }
}
