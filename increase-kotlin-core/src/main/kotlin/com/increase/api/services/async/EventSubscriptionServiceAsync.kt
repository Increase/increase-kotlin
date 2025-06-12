// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.eventsubscriptions.EventSubscription
import com.increase.api.models.eventsubscriptions.EventSubscriptionCreateParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionListPageAsync
import com.increase.api.models.eventsubscriptions.EventSubscriptionListParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionRetrieveParams
import com.increase.api.models.eventsubscriptions.EventSubscriptionUpdateParams

interface EventSubscriptionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EventSubscriptionServiceAsync

    /** Create an Event Subscription */
    suspend fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** Retrieve an Event Subscription */
    suspend fun retrieve(
        eventSubscriptionId: String,
        params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        retrieve(
            params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
            requestOptions,
        )

    /** @see [retrieve] */
    suspend fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** @see [retrieve] */
    suspend fun retrieve(
        eventSubscriptionId: String,
        requestOptions: RequestOptions,
    ): EventSubscription =
        retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none(), requestOptions)

    /** Update an Event Subscription */
    suspend fun update(
        eventSubscriptionId: String,
        params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription =
        update(params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(), requestOptions)

    /** @see [update] */
    suspend fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscription

    /** @see [update] */
    suspend fun update(
        eventSubscriptionId: String,
        requestOptions: RequestOptions,
    ): EventSubscription =
        update(eventSubscriptionId, EventSubscriptionUpdateParams.none(), requestOptions)

    /** List Event Subscriptions */
    suspend fun list(
        params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventSubscriptionListPageAsync

    /** @see [list] */
    suspend fun list(requestOptions: RequestOptions): EventSubscriptionListPageAsync =
        list(EventSubscriptionListParams.none(), requestOptions)

    /**
     * A view of [EventSubscriptionServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EventSubscriptionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: EventSubscriptionCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /**
         * Returns a raw HTTP response for `get /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            eventSubscriptionId: String,
            params: EventSubscriptionRetrieveParams = EventSubscriptionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            retrieve(
                params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
                requestOptions,
            )

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            params: EventSubscriptionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /** @see [retrieve] */
        @MustBeClosed
        suspend fun retrieve(
            eventSubscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> =
            retrieve(eventSubscriptionId, EventSubscriptionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `patch /event_subscriptions/{event_subscription_id}`, but
         * is otherwise the same as [EventSubscriptionServiceAsync.update].
         */
        @MustBeClosed
        suspend fun update(
            eventSubscriptionId: String,
            params: EventSubscriptionUpdateParams = EventSubscriptionUpdateParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription> =
            update(
                params.toBuilder().eventSubscriptionId(eventSubscriptionId).build(),
                requestOptions,
            )

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            params: EventSubscriptionUpdateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscription>

        /** @see [update] */
        @MustBeClosed
        suspend fun update(
            eventSubscriptionId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<EventSubscription> =
            update(eventSubscriptionId, EventSubscriptionUpdateParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /event_subscriptions`, but is otherwise the same as
         * [EventSubscriptionServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EventSubscriptionListParams = EventSubscriptionListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventSubscriptionListPageAsync>

        /** @see [list] */
        @MustBeClosed
        suspend fun list(
            requestOptions: RequestOptions
        ): HttpResponseFor<EventSubscriptionListPageAsync> =
            list(EventSubscriptionListParams.none(), requestOptions)
    }
}
