// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntry
import com.increase.api.models.BookkeepingEntryListPage
import com.increase.api.models.BookkeepingEntryListParams
import com.increase.api.models.BookkeepingEntryRetrieveParams

interface BookkeepingEntryService {

    /** Retrieve a Bookkeeping Entry */
    fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingEntry

    /** List Bookkeeping Entries */
    fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingEntryListPage
}
