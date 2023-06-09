@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingAccount
import com.increase.api.models.BookkeepingAccountCreateParams
import com.increase.api.models.BookkeepingAccountListPageAsync
import com.increase.api.models.BookkeepingAccountListParams

interface BookkeepingAccountServiceAsync {

    /** Create a Bookkeeping Account */
    suspend fun create(
        params: BookkeepingAccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingAccount

    /** List Bookkeeping Accounts */
    suspend fun list(
        params: BookkeepingAccountListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingAccountListPageAsync
}
