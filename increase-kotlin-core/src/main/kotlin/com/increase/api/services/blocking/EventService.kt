// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.Event
import com.increase.api.models.EventListPage
import com.increase.api.models.EventListParams
import com.increase.api.models.EventRetrieveParams

interface EventService {

    /** Retrieve an Event */
    fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** List Events */
    fun list(
        params: EventListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPage
}
