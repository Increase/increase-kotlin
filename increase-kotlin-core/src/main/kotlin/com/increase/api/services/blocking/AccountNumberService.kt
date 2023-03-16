@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.AccountNumber
import com.increase.api.models.AccountNumberCreateParams
import com.increase.api.models.AccountNumberListPage
import com.increase.api.models.AccountNumberListParams
import com.increase.api.models.AccountNumberRetrieveParams
import com.increase.api.models.AccountNumberUpdateParams

interface AccountNumberService {

    /** Create an Account Number */
    fun create(
        params: AccountNumberCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountNumber

    /** Retrieve an Account Number */
    fun retrieve(
        params: AccountNumberRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountNumber

    /** Update an Account Number */
    fun update(
        params: AccountNumberUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountNumber

    /** List Account Numbers */
    fun list(
        params: AccountNumberListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): AccountNumberListPage
}
