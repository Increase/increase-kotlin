// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.json
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.EventSubscription
import com.increase.api.models.EventSubscriptionCreateParams
import com.increase.api.models.EventSubscriptionListPage
import com.increase.api.models.EventSubscriptionListParams
import com.increase.api.models.EventSubscriptionRetrieveParams
import com.increase.api.models.EventSubscriptionUpdateParams

class EventSubscriptionServiceImpl internal constructor(private val clientOptions: ClientOptions) :
    EventSubscriptionService {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<EventSubscription> =
        jsonHandler<EventSubscription>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

    /** Create an Event Subscription */
    override fun create(
        params: EventSubscriptionCreateParams,
        requestOptions: RequestOptions,
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.POST)
                .addPathSegments("event_subscriptions")
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
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
    override fun retrieve(
        params: EventSubscriptionRetrieveParams,
        requestOptions: RequestOptions,
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
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
    override fun update(
        params: EventSubscriptionUpdateParams,
        requestOptions: RequestOptions,
    ): EventSubscription {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.PATCH)
                .addPathSegments("event_subscriptions", params.getPathParam(0))
                .body(json(clientOptions.jsonMapper, params._body()))
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { updateHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
    }

    private val listHandler: Handler<EventSubscriptionListPage.Response> =
        jsonHandler<EventSubscriptionListPage.Response>(clientOptions.jsonMapper)
            .withErrorHandler(errorHandler)

    /** List Event Subscriptions */
    override fun list(
        params: EventSubscriptionListParams,
        requestOptions: RequestOptions,
    ): EventSubscriptionListPage {
        val request =
            HttpRequest.builder()
                .method(HttpMethod.GET)
                .addPathSegments("event_subscriptions")
                .build()
                .prepare(clientOptions, params)
        val response = clientOptions.httpClient.execute(request, requestOptions)
        return response
            .use { listHandler.handle(it) }
            .also {
                if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                    it.validate()
                }
            }
            .let { EventSubscriptionListPage.of(this, params, it) }
    }
}
