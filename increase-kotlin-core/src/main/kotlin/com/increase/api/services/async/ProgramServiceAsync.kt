// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Program
import com.increase.api.models.ProgramListPageAsync
import com.increase.api.models.ProgramListParams
import com.increase.api.models.ProgramRetrieveParams

interface ProgramServiceAsync {

    /** Retrieve a Program */
    suspend fun retrieve(
        params: ProgramRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Program

    /** List Programs */
    suspend fun list(
        params: ProgramListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): ProgramListPageAsync
}
