// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPage
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetService {

    /** Create a Bookkeeping Entry Set */
    fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** List Bookkeeping Entry Sets */
    fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPage
}
