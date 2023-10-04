// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.BookkeepingEntryListPageAsync
import com.increase.api.models.BookkeepingEntryListParams

interface BookkeepingEntryServiceAsync {

    /** List Bookkeeping Entries */
    suspend fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): BookkeepingEntryListPageAsync
}
