// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.RequestOptions
import com.increase.api.core.checkRequired
import com.increase.api.core.handlers.errorBodyHandler
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySet
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetCreateParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListParams
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetListResponse
import com.increase.api.models.bookkeepingentrysets.BookkeepingEntrySetRetrieveParams

class BookkeepingEntrySetServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntrySetServiceAsync {

    private val withRawResponse: BookkeepingEntrySetServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingEntrySetServiceAsync.WithRawResponse =
        withRawResponse

    override fun withOptions(
        modifier: (ClientOptions.Builder) -> Unit
    ): BookkeepingEntrySetServiceAsync =
        BookkeepingEntrySetServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: BookkeepingEntrySetCreateParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        // post /bookkeeping_entry_sets
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: BookkeepingEntrySetRetrieveParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySet =
        // get /bookkeeping_entry_sets/{bookkeeping_entry_set_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: BookkeepingEntrySetListParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntrySetListResponse =
        // get /bookkeeping_entry_sets
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingEntrySetServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): BookkeepingEntrySetServiceAsync.WithRawResponse =
            BookkeepingEntrySetServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<BookkeepingEntrySet> =
            jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper)

        override suspend fun create(
            params: BookkeepingEntrySetCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<BookkeepingEntrySet> =
            jsonHandler<BookkeepingEntrySet>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: BookkeepingEntrySetRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySet> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("bookkeepingEntrySetId", params.bookkeepingEntrySetId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BookkeepingEntrySetListResponse> =
            jsonHandler<BookkeepingEntrySetListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: BookkeepingEntrySetListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntrySetListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("bookkeeping_entry_sets")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
