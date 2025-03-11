// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.externalaccounts.ExternalAccount
import com.increase.api.models.externalaccounts.ExternalAccountCreateParams
import com.increase.api.models.externalaccounts.ExternalAccountListPageAsync
import com.increase.api.models.externalaccounts.ExternalAccountListParams
import com.increase.api.models.externalaccounts.ExternalAccountRetrieveParams
import com.increase.api.models.externalaccounts.ExternalAccountUpdateParams

interface ExternalAccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Create an External Account */
    suspend fun create(params: ExternalAccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): ExternalAccount

    /** Retrieve an External Account */
    suspend fun retrieve(params: ExternalAccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): ExternalAccount

    /** Update an External Account */
    suspend fun update(params: ExternalAccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): ExternalAccount

    /** List External Accounts */
    suspend fun list(params: ExternalAccountListParams = ExternalAccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): ExternalAccountListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): ExternalAccountListPageAsync = list(ExternalAccountListParams.none(), requestOptions)

    /**
     * A view of [ExternalAccountServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /external_accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(params: ExternalAccountCreateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts/{external_account_id}`,
         * but is otherwise the same as [ExternalAccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(params: ExternalAccountRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for
         * `patch /external_accounts/{external_account_id}`, but is otherwise the same as
         * [ExternalAccountServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(params: ExternalAccountUpdateParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ExternalAccount>

        /**
         * Returns a raw HTTP response for `get /external_accounts`, but is otherwise the
         * same as [ExternalAccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(params: ExternalAccountListParams = ExternalAccountListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<ExternalAccountListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<ExternalAccountListPageAsync> = list(ExternalAccountListParams.none(), requestOptions)
    }
}
