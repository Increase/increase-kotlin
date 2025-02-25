// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveParams

interface GroupServiceAsync {

    /** Returns details for the currently authenticated Group. */
    suspend fun retrieve(
        params: GroupRetrieveParams = GroupRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Group

    /** Returns details for the currently authenticated Group. */
    suspend fun retrieve(requestOptions: RequestOptions): Group =
        retrieve(GroupRetrieveParams.none(), requestOptions)
}
