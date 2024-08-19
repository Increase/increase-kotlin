// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPageAsync
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams

interface ExportServiceAsync {

    /** Create an Export */
    suspend fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Export

    /** Retrieve an Export */
    suspend fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Export

    /** List Exports */
    suspend fun list(
        params: ExportListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): ExportListPageAsync
}
