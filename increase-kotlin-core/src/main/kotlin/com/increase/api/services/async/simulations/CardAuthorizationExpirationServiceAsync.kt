// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.CardPayment
import com.increase.api.models.SimulationCardAuthorizationExpirationCreateParams

interface CardAuthorizationExpirationServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /** Simulates expiring a Card Authorization immediately. */
    suspend fun create(
        params: SimulationCardAuthorizationExpirationCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): CardPayment

    /**
     * A view of [CardAuthorizationExpirationServiceAsync] that provides access to raw HTTP
     * responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for `post /simulations/card_authorization_expirations`, but
         * is otherwise the same as [CardAuthorizationExpirationServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: SimulationCardAuthorizationExpirationCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<CardPayment>
    }
}
