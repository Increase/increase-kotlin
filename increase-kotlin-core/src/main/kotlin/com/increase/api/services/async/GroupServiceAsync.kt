// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Group
import com.increase.api.models.GroupRetrieveDetailsParams

interface GroupServiceAsync {

    /** Returns details for the currently authenticated Group. */
    suspend fun retrieveDetails(
        params: GroupRetrieveDetailsParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Group
}
