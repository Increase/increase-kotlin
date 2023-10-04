// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async

import com.increase.api.core.RequestOptions
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPageAsync
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams

interface EventSubscriptionServiceAsync {

    /** Create an Event Subscription */
    suspend fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** Retrieve an Event Subscription */
    suspend fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** Update an Event Subscription */
    suspend fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscription

    /** List Event Subscriptions */
    suspend fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): EventSubscriptionListPageAsync
}
