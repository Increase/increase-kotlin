// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepareAsync
import com.increase.api.errors.IncreaseError
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPageAsync
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams

class EventSubscriptionServiceAsyncImpl
internal constructor(
    private val clientOptions: ClientOptions,
) : EventSubscriptionServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Event Subscription */
    override suspend fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { createHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val retrieveHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Retrieve an Event Subscription */
    override suspend fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { retrieveHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val updateHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Update an Event Subscription */
    override suspend fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<EventSubscriptionListPageAsync.Response> =
        jsonHandler<EventSubscriptionListPageAsync.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Event Subscriptions */
    override suspend fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions
    ): EventSubscriptionListPageAsync {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions")
                .build()
                .prepareAsync(clientOptions, params)
        val response = clientOptions.httpClient.executeAsync(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { EventSubscriptionListPageAsync.of(this, params, it) }
    }
}
