// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.core.ClientOptions
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.core.handlers.errorHandler
import com.increase.api.core.handlers.jsonHandler
import com.increase.api.core.handlers.withErrorHandler
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.parseable
import com.increase.api.core.prepareAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntry
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageAsync
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListPageResponse
import com.increase.api.models.bookkeepingentries.BookkeepingEntryListParams
import com.increase.api.models.bookkeepingentries.BookkeepingEntryRetrieveParams

class BookkeepingEntryServiceAsyncImpl
internal constructor(private val clientOptions: ClientOptions) : BookkeepingEntryServiceAsync {

    private val withRawResponse: BookkeepingEntryServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): BookkeepingEntryServiceAsync.WithRawResponse = withRawResponse

    override suspend fun retrieve(
        params: BookkeepingEntryRetrieveParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntry =
        // get /bookkeeping_entries/{bookkeeping_entry_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: BookkeepingEntryListParams,
        requestOptions: RequestOptions,
    ): BookkeepingEntryListPageAsync =
        // get /bookkeeping_entries
        withRawResponse().list(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        BookkeepingEntryServiceAsync.WithRawResponse {

        private val errorHandler: Handler<JsonValue> = errorHandler(clientOptions.jsonMapper)

        private val retrieveHandler: Handler<BookkeepingEntry> =
            jsonHandler<BookkeepingEntry>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override suspend fun retrieve(
            params: BookkeepingEntryRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntry> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bookkeeping_entries", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<BookkeepingEntryListPageResponse> =
            jsonHandler<BookkeepingEntryListPageResponse>(clientOptions.jsonMapper)
                .withErrorHandler(errorHandler)

        override suspend fun list(
            params: BookkeepingEntryListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<BookkeepingEntryListPageAsync> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .addPathSegments("bookkeeping_entries")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return response.parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
                    .let {
                        BookkeepingEntryListPageAsync.of(
                            BookkeepingEntryServiceAsyncImpl(clientOptions),
                            params,
                            it,
                        )
                    }
            }
        }
    }
}
