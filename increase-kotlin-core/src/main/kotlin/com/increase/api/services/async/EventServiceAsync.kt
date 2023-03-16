@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.Event
import com.increase.api.models.EventListPageAsync
import com.increase.api.models.EventListParams
import com.increase.api.models.EventRetrieveParams

interface EventServiceAsync {

    /** Retrieve an Event */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): Event

    /** List Events */
    suspend fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventListPageAsync
}
