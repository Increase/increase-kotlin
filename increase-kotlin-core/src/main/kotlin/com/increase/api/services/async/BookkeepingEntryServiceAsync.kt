// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryServiceAsync {

    /** Retrieve a Bookkeeping Entry */
    suspend fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    suspend fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingEntryListPageAsync
}
