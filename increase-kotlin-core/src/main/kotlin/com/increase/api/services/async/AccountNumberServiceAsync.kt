// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountnumbers.AccountNumber
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListPageAsync
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams

interface AccountNumberServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Number */
    suspend fun create(params: AccountNumberCreateParams, requestOptions: RequestOptions = RequestOptions.none()): AccountNumber

    /** Retrieve an Account Number */
    suspend fun retrieve(params: AccountNumberRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): AccountNumber

    /** Update an Account Number */
    suspend fun update(params: AccountNumberUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): AccountNumber

    /** List Account Numbers */
    suspend fun list(params: AccountNumberListParams = AccountNumberListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): AccountNumberListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): AccountNumberListPageAsync = list(AccountNumberListParams.none(), requestOptions)

    /**
     * A view of [AccountNumberServiceAsync] that provides access to raw HTTP responses
     * for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_numbers`, but is otherwise the
         * same as [AccountNumberServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: AccountNumberCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `get /account_numbers/{account_number_id}`, but
         * is otherwise the same as [AccountNumberServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: AccountNumberRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `patch /account_numbers/{account_number_id}`,
         * but is otherwise the same as [AccountNumberServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(params: AccountNumberUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the
         * same as [AccountNumberServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: AccountNumberListParams = AccountNumberListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<AccountNumberListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AccountNumberListPageAsync> = list(AccountNumberListParams.none(), requestOptions)
    }
}
