// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.accountnumbers.AccountNumber
import com.increase.api.models.accountnumbers.AccountNumberCreateParams
import com.increase.api.models.accountnumbers.AccountNumberListPage
import com.increase.api.models.accountnumbers.AccountNumberListParams
import com.increase.api.models.accountnumbers.AccountNumberRetrieveParams
import com.increase.api.models.accountnumbers.AccountNumberUpdateParams

interface AccountNumberService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an Account Number */
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** Retrieve an Account Number */
    fun retrieve(
        accountNumberId: String,
        params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber =
        retrieve(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

    /** @see [retrieve] */
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** @see [retrieve] */
    fun retrieve(accountNumberId: String, requestOptions: RequestOptions): AccountNumber =
        retrieve(accountNumberId, AccountNumberRetrieveParams.none(), requestOptions)

    /** Update an Account Number */
    fun update(
        accountNumberId: String,
        params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber =
        update(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

    /** @see [update] */
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumber

    /** @see [update] */
    fun update(accountNumberId: String, requestOptions: RequestOptions): AccountNumber =
        update(accountNumberId, AccountNumberUpdateParams.none(), requestOptions)

    /** List Account Numbers */
    fun list(
        params: AccountNumberListParams = AccountNumberListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountNumberListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): AccountNumberListPage =
        list(AccountNumberListParams.none(), requestOptions)

    /**
     * A view of [AccountNumberService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /account_numbers`, but is otherwise the same as
         * [AccountNumberService.create].
         */
        @MustBeClosed
        fun create(
            params: AccountNumberCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /**
         * Returns a raw HTTP response for `get /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            accountNumberId: String,
            params: AccountNumberRetrieveParams = AccountNumberRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber> =
            retrieve(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            params: AccountNumberRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /** @see [retrieve] */
        @MustBeClosed
        fun retrieve(
            accountNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumber> =
            retrieve(accountNumberId, AccountNumberRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /account_numbers/{account_number_id}`, but is
         * otherwise the same as [AccountNumberService.update].
         */
        @MustBeClosed
        fun update(
            accountNumberId: String,
            params: AccountNumberUpdateParams = AccountNumberUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber> =
            update(params.toBuilder().accountNumberId(accountNumberId).build(), requestOptions)

        /** @see [update] */
        @MustBeClosed
        fun update(
            params: AccountNumberUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumber>

        /** @see [update] */
        @MustBeClosed
        fun update(
            accountNumberId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountNumber> =
            update(accountNumberId, AccountNumberUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /account_numbers`, but is otherwise the same as
         * [AccountNumberService.list].
         */
        @MustBeClosed
        fun list(
            params: AccountNumberListParams = AccountNumberListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountNumberListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<AccountNumberListPage> =
            list(AccountNumberListParams.none(), requestOptions)
    }
}
