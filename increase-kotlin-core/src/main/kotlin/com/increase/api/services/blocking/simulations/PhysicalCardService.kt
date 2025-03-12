// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.google.errorprone.annotations.MustBeClosed
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams

interface PhysicalCardService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for
     * each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical
     * Card, to simulate e.g., that a physical card was attempted shipped but then
     * failed delivery.
     */
    fun advanceShipment(params: PhysicalCardAdvanceShipmentParams, requestOptions: RequestOptions = RequestOptions.none()): PhysicalCard

    /**
     * A view of [PhysicalCardService] that provides access to raw HTTP responses for
     * each method.
     */
    interface WithRawResponse {

        /**
         * Returns a raw HTTP response for
         * `post /simulations/physical_cards/{physical_card_id}/advance_shipment`, but is
         * otherwise the same as [PhysicalCardService.advanceShipment].
         */
        @MustBeClosed
        fun advanceShipment(params: PhysicalCardAdvanceShipmentParams, requestOptions: RequestOptions = RequestOptions.none()): HttpResponseFor<PhysicalCard>
    }
}
