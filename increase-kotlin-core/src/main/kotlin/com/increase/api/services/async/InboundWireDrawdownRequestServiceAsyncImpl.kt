// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.fasterxml.jackson.databind.json.JsonMapper
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import kotlin.LazyThreadSafetyMode.PUBLICATION
import java.time.LocalDate
import java.time.Duration
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.Base64
import java.util.Optional
import java.util.UUID
import java.util.concurrent.CompletableFuture
import java.util.stream.Stream
import com.increase.api.core.Enum
import com.increase.api.core.NoAutoDetect
import com.increase.api.errors.IncreaseInvalidDataException
import com.increase.api.models.InboundWireDrawdownRequest
import com.increase.api.models.InboundWireDrawdownRequestListPageAsync
import com.increase.api.models.InboundWireDrawdownRequestListParams
import com.increase.api.models.InboundWireDrawdownRequestRetrieveParams
import com.increase.api.core.ClientOptions
import com.increase.api.core.http.HttpMethod
import com.increase.api.core.http.HttpRequest
import com.increase.api.core.http.HttpResponse.Handler
import com.increase.api.core.http.BinaryResponseContent
import com.increase.api.core.JsonField
import com.increase.api.core.JsonValue
import com.increase.api.core.RequestOptions
import com.increase.api.errors.IncreaseError
import com.increase.api.services.emptyHandler
import com.increase.api.services.errorHandler
import com.increase.api.services.json
import com.increase.api.services.jsonHandler
import com.increase.api.services.multipartFormData
import com.increase.api.services.stringHandler
import com.increase.api.services.binaryHandler
import com.increase.api.services.withErrorHandler

class InboundWireDrawdownRequestServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : InboundWireDrawdownRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val retrieveHandler: Handler<InboundWireDrawdownRequest> =
    jsonHandler<InboundWireDrawdownRequest>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** Retrieve an Inbound Wire Drawdown Request */
    override suspend fun retrieve(params: InboundWireDrawdownRequestRetrieveParams, requestOptions: RequestOptions): InboundWireDrawdownRequest {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("inbound_wire_drawdown_requests", params.getPathParam(0))
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              retrieveHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }

    private val listHandler: Handler<InboundWireDrawdownRequestListPageAsync.Response> =
    jsonHandler<InboundWireDrawdownRequestListPageAsync.Response>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /** List Inbound Wire Drawdown Requests */
    override suspend fun list(params: InboundWireDrawdownRequestListParams, requestOptions: RequestOptions): InboundWireDrawdownRequestListPageAsync {
      val request = HttpRequest.builder()
        .method(HttpMethod.GET)
        .addPathSegments("inbound_wire_drawdown_requests")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              listHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
          .let {
              InboundWireDrawdownRequestListPageAsync.of(this, params, it)
          }
      }
    }
}
