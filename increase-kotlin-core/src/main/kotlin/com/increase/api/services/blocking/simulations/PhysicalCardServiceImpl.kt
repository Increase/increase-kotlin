// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.errors.IncreaseError
import com.increase.api.models.PhysicalCard
import com.increase.api.models.SimulationPhysicalCardShipmentAdvanceParams
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.withErrorHandler

class PhysicalCardServiceImpl
constructor(
    private val clientOptions: ClientOptions,
) : PhysicalCardService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val shipmentAdvanceHandler: Handler<PhysicalCard> =
        jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /**
     * This endpoint allows you to simulate advancing the shipment status of a Physical Card, to
     * simulate e.g., that a physical card was attempted shipped but then failed delivery.
     */
    override fun shipmentAdvance(
        params: SimulationPhysicalCardShipmentAdvanceParams,
        requestOptions: RequestOptions
    ): PhysicalCard {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments(
                    "simulations",
                    "physical_cards",
                    params.getPathParam(0),
                    "shipment_advance"
                )
                .putAllQueryParams(clientOptions.queryParams)
                .putAllQueryParams(params.getQueryParams())
                .putAllHeaders(clientOptions.headers)
                .putAllHeaders(params.getHeaders())
                .body(json(clientOptions.jsonMapper, params.getBody()))
                .build()
        return clientOptions.httpClient.execute(request, requestOptions).let { response ->
            response
                .use { shipmentAdvanceHandler.handle(it) }
                .apply {
                    if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                        validate()
                    }
                }
        }
    }
}
