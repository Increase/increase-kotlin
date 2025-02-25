// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntrySet
import com.increase.api.models.BookkeepingEntrySetCreateParams
import com.increase.api.models.BookkeepingEntrySetListPageAsync
import com.increase.api.models.BookkeepingEntrySetListParams
import com.increase.api.models.BookkeepingEntrySetRetrieveParams

interface BookkeepingEntrySetServiceAsync {

    /** Create a Bookkeeping Entry Set */
    suspend fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** Retrieve a Bookkeeping Entry Set */
    suspend fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySet

    /** List Bookkeeping Entry Sets */
    suspend fun list(
        params: BookkeepingEntrySetListParams = BookkeepingEntrySetListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): BookkeepingEntrySetListPageAsync

    /** List Bookkeeping Entry Sets */
    suspend fun list(requestOptions: RequestOptions): BookkeepingEntrySetListPageAsync =
        list(BookkeepingEntrySetListParams.none(), requestOptions)
}
