// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.events.Event
import com.increase.api.models.events.EventListPageAsync
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams
import com.increase.api.models.events.UnwrapWebhookEvent

interface EventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): EventServiceAsync

    /** Retrieve an Event */
    suspend fun retrieve(
        eventId: String,
        params: EventRetrieveParams = EventRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event = retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: EventRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Event

    /** @see retrieve */
    suspend fun retrieve(eventId: String, requestOptions: RequestOptions): Event =
        retrieve(eventId, EventRetrieveParams.none(), requestOptions)

    /** List Events */
    suspend fun list(
        params: EventListParams = EventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): EventListPageAsync

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): EventListPageAsync =
        list(EventListParams.none(), requestOptions)

    /**
     * Unwraps a webhook event from its JSON representation.
     *
     * @throws IncreaseInvalidDataException if the body could not be parsed.
     */
    fun unwrap(body: String): UnwrapWebhookEvent

    /** A view of [EventServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): EventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /events/{event_id}`, but is otherwise the same as
         * [EventServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            eventId: String,
            params: EventRetrieveParams = EventRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event> =
            retrieve(params.toBuilder().eventId(eventId).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: EventRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Event>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            eventId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Event> = retrieve(eventId, EventRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /events`, but is otherwise the same as
         * [EventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: EventListParams = EventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<EventListPageAsync>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPageAsync> =
            list(EventListParams.none(), requestOptions)
    }
}
