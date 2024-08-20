// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

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
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateParams
import com.increase.api.models.SimulationDigitalWalletTokenRequestCreateResponse
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

class DigitalWalletTokenRequestServiceAsyncImpl constructor(private val clientOptions: ClientOptions, ) : DigitalWalletTokenRequestServiceAsync {

    private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

    private val createHandler: Handler<SimulationDigitalWalletTokenRequestCreateResponse> =
    jsonHandler<SimulationDigitalWalletTokenRequestCreateResponse>(clientOptions.jsonMapper)
    .withErrorHandler(errorHandler)

    /**
     * Simulates a user attempting add a [Card](#cards) to a digital wallet such as
     * Apple Pay.
     */
    override suspend fun create(params: SimulationDigitalWalletTokenRequestCreateParams, requestOptions: RequestOptions): SimulationDigitalWalletTokenRequestCreateResponse {
      val request = HttpRequest.builder()
        .method(HttpMethod.POST)
        .addPathSegments("simulations", "digital_wallet_token_requests")
        .putAllQueryParams(clientOptions.queryParams)
        .putAllQueryParams(params.getQueryParams())
        .putAllHeaders(clientOptions.headers)
        .putAllHeaders(params.getHeaders())
        .body(json(clientOptions.jsonMapper, params.getBody()))
        .build()
      return clientOptions.httpClient.executeAsync(request, requestOptions)
      .let { response -> 
          response.use {
              createHandler.handle(it)
          }
          .apply  {
              if (requestOptions.responseValidation ?: clientOptions.responseValidation) {
                validate()
              }
          }
      }
    }
}
