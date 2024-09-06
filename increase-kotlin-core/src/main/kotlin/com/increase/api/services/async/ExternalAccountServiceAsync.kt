// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.ExternalAccount
import com.increase.api.models.ExternalAccountCreateParams
import com.increase.api.models.ExternalAccountListPageAsync
import com.increase.api.models.ExternalAccountListParams
import com.increase.api.models.ExternalAccountRetrieveParams
import com.increase.api.models.ExternalAccountUpdateParams

interface ExternalAccountServiceAsync {

    /** Create an External Account */
    suspend fun create(
        params: ExternalAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** Retrieve an External Account */
    suspend fun retrieve(
        params: ExternalAccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** Update an External Account */
    suspend fun update(
        params: ExternalAccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccount

    /** List External Accounts */
    suspend fun list(
        params: ExternalAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExternalAccountListPageAsync
}
