// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.checkdeposits.CheckDeposit
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams

interface CheckDepositServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates the rejection of a [Check Deposit](#check-deposits) by Increase due to factors like
     * poor image quality. This Check Deposit must first have a `status` of `pending`.
     */
    suspend fun reject(
        checkDepositId: String,
        params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [reject] */
    suspend fun reject(
        params: CheckDepositRejectParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see [reject] */
    suspend fun reject(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

    /**
     * Simulates the return of a [Check Deposit](#check-deposits). This Check Deposit must first
     * have a `status` of `submitted`.
     */
    suspend fun return_(
        checkDepositId: String,
        params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [return_] */
    suspend fun return_(
        params: CheckDepositReturnParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see [return_] */
    suspend fun return_(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

    /**
     * Simulates the submission of a [Check Deposit](#check-deposits) to the Federal Reserve. This
     * Check Deposit must first have a `status` of `pending`.
     */
    suspend fun submit(
        checkDepositId: String,
        params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit =
        submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

    /** @see [submit] */
    suspend fun submit(
        params: CheckDepositSubmitParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CheckDeposit

    /** @see [submit] */
    suspend fun submit(checkDepositId: String, requestOptions: RequestOptions): CheckDeposit =
        submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)

    /**
     * A view of [CheckDepositServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/reject`, but is otherwise the same as
         * [CheckDepositServiceAsync.reject].
         */
        @MustBeClosed
        suspend fun reject(
            checkDepositId: String,
            params: CheckDepositRejectParams = CheckDepositRejectParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            reject(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [reject] */
        @MustBeClosed
        suspend fun reject(
            params: CheckDepositRejectParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see [reject] */
        @MustBeClosed
        suspend fun reject(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            reject(checkDepositId, CheckDepositRejectParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/return`, but is otherwise the same as
         * [CheckDepositServiceAsync.return_].
         */
        @MustBeClosed
        suspend fun return_(
            checkDepositId: String,
            params: CheckDepositReturnParams = CheckDepositReturnParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            return_(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [return_] */
        @MustBeClosed
        suspend fun return_(
            params: CheckDepositReturnParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see [return_] */
        @MustBeClosed
        suspend fun return_(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            return_(checkDepositId, CheckDepositReturnParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post
         * /simulations/check_deposits/{check_deposit_id}/submit`, but is otherwise the same as
         * [CheckDepositServiceAsync.submit].
         */
        @MustBeClosed
        suspend fun submit(
            checkDepositId: String,
            params: CheckDepositSubmitParams = CheckDepositSubmitParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit> =
            submit(params.toBuilder().checkDepositId(checkDepositId).build(), requestOptions)

        /** @see [submit] */
        @MustBeClosed
        suspend fun submit(
            params: CheckDepositSubmitParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CheckDeposit>

        /** @see [submit] */
        @MustBeClosed
        suspend fun submit(
            checkDepositId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<CheckDeposit> =
            submit(checkDepositId, CheckDepositSubmitParams.none(), requestOptions)
    }
}
