// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Account
import com.increase.api.models.AccountCloseParams
import com.increase.api.models.AccountCreateParams
import com.increase.api.models.AccountListPage
import com.increase.api.models.AccountListParams
import com.increase.api.models.AccountRetrieveParams
import com.increase.api.models.AccountUpdateParams

interface AccountService {

    /** Create an Account */
    fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Retrieve an Account */
    fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** Update an Account */
    fun update(
        params: AccountUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account

    /** List Accounts */
    fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountListPage

    /** Close an Account */
    fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Account
}
