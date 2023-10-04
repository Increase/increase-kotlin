// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

package com.increase.api.services.async.simulations

import com.increase.api.core.RequestOptions
import com.increase.api.models.PhysicalCard
import com.increase.api.models.SimulationPhysicalCardShipmentAdvanceParams

interface PhysicalCardServiceAsync {

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
     * simulate e.g., that a physical card was attempted shipped but then failed delivery.
     */
    suspend fun shipmentAdvance(
        params: SimulationPhysicalCardShipmentAdvanceParams,
        requestOptions: RequestOptions = RequestOptions.none()
    ): PhysicalCard
}
