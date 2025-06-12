// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.physicalcards.PhysicalCard
import com.increase.api.models.simulations.physicalcards.PhysicalCardAdvanceShipmentParams
import com.increase.api.models.simulations.physicalcards.PhysicalCardTrackingUpdatesParams

class PhysicalCardServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    PhysicalCardServiceAsync {

    private val withRawResponse: PhysicalCardServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): PhysicalCardServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): PhysicalCardServiceAsync =
        PhysicalCardServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun advanceShipment(
        params: PhysicalCardAdvanceShipmentParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // post /simulations/physical_cards/{physical_card_id}/advance_shipment
        withRawResponse().advanceShipment(params, requestOptions).parse()

    override suspend fun trackingUpdates(
        params: PhysicalCardTrackingUpdatesParams,
        requestOptions: RequestOptions,
    ): PhysicalCard =
        // post /simulations/physical_cards/{physical_card_id}/tracking_updates
        withRawResponse().trackingUpdates(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        PhysicalCardServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): PhysicalCardServiceAsync.WithRawResponse =
            PhysicalCardServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val advanceShipmentHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun advanceShipment(
            params: PhysicalCardAdvanceShipmentParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "physical_cards",
                        params._pathParam(0),
                        "advance_shipment",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { advanceShipmentHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val trackingUpdatesHandler: Handler<PhysicalCard> =
            jsonHandler<PhysicalCard>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun trackingUpdates(
            params: PhysicalCardTrackingUpdatesParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<PhysicalCard> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("physicalCardId", params.physicalCardId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments(
                        "simulations",
                        "physical_cards",
                        params._pathParam(0),
                        "tracking_updates",
                    )
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { trackingUpdatesHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
