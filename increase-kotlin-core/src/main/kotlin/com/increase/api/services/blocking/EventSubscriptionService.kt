// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.RequestOptions
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPage
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams

interface EventSubscriptionService {

    /** Create an Event Subscription */
    fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** Retrieve an Event Subscription */
    fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** Update an Event Subscription */
    fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** List Event Subscriptions */
    fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscriptionListPage
}
