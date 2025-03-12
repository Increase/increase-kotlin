// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountstatements.AccountStatement
import com.increase.api.models.simulations.accountstatements.AccountStatementCreateParams

interface AccountStatementServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Simulates an [Account Statement](#account-statements) being created for an
     * account. In production, Account Statements are generated once per month.
     */
    suspend fun create(params: AccountStatementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): AccountStatement

    /**
     * A view of [AccountStatementServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/account_statements`, but is
         * otherwise the same as [AccountStatementServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: AccountStatementCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountStatement>
    }
}
