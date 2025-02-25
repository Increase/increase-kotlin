// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Export
import com.increase.api.models.ExportCreateParams
import com.increase.api.models.ExportListPage
import com.increase.api.models.ExportListParams
import com.increase.api.models.ExportRetrieveParams

interface ExportService {

    /** Create an Export */
    fun create(
        params: ExportCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** Retrieve an Export */
    fun retrieve(
        params: ExportRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Export

    /** List Exports */
    fun list(
        params: ExportListParams = ExportListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ExportListPage

    /** List Exports */
    fun list(requestOptions: RequestOptions): ExportListPage =
        list(ExportListParams.none(), requestOptions)
}
