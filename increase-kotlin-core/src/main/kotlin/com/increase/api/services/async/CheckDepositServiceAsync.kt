// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.checkdeposits.CheckDepositCreateParams
import com.increase.api.models.checkdeposits.CheckDepositListPageAsync
import com.increase.api.models.checkdeposits.CheckDepositListParams
import com.increase.api.models.checkdeposits.CheckDepositRetrieveParams

interface CheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create a Check Deposit */
    suspend fun create(
        params: CheckDepositCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** Retrieve a Check Deposit */
    suspend fun retrieve(
        params: CheckDepositRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** List Check Deposits */
    suspend fun list(
        params: CheckDepositListParams = CheckDepositListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDepositListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): CheckDepositListPageAsync =
        list(CheckDepositListParams.none(), requestOptions)

    /**
     * A view of [CheckDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: CheckDepositCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `get /check_deposits/{check_deposit_id}`, but is
         * otherwise the same as [CheckDepositServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            params: CheckDepositRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /**
         * Returns a raw HTTP response for `get /check_deposits`, but is otherwise the same as
         * [CheckDepositServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: CheckDepositListParams = CheckDepositListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDepositListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<CheckDepositListPageAsync> =
            list(CheckDepositListParams.none(), requestOptions)
    }
}
