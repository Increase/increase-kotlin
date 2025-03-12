// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.events.Event
import com.increase.api.models.events.EventListPage
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams

interface EventService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Retrieve an Event */
    fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): Event

    /** List Events */
    fun list(params: EventListParams = EventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): EventListPage

    /** @see [list] */
    fun list(requestOptions: RequestOptions): EventListPage = list(EventListParams.none(), requestOptions)

    /**
     * A view of [EventService] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `get /events/{event_id}`, but is otherwise the
         * same as [EventService.retrieve].
         */
        @MustBeClosed
        fun retrieve(params: EventRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<Event>

        /**
         * Returns a raw HTTP response for `get /events`, but is otherwise the same as
         * [EventService.list].
         */
        @MustBeClosed
        fun list(params: EventListParams = EventListParams.none(), requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<EventListPage>

        /** @see [list] */
        @MustBeClosed
        fun list(requestOptions: RequestOptions): HttpResponseFor<EventListPage> = list(EventListParams.none(), requestOptions)
    }
}
