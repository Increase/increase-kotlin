// File generated from our OpenAPI spec by Stainless.

@file:Suppress("OVERLOADS_INTERFACE") // See https://youtrack.jetbrains.com/issue/KT-36102

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
import com.increase.api.models.DigitalCardProfile
import com.increase.api.models.DigitalCardProfileArchiveParams
import com.increase.api.models.DigitalCardProfileCloneParams
import com.increase.api.models.DigitalCardProfileCreateParams
import com.increase.api.models.DigitalCardProfileListPageAsync
import com.increase.api.models.DigitalCardProfileListParams
import com.increase.api.models.DigitalCardProfileRetrieveParams
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

interface DigitalCardProfileServiceAsync {

    /** Create a Digital Card Profile */
    suspend fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Retrieve a Digital Card Profile */
    suspend fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** List Card Profiles */
    suspend fun list(params: DigitalCardProfileListParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfileListPageAsync

    /** Archive a Digital Card Profile */
    suspend fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile

    /** Clones a Digital Card Profile */
    suspend fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions = RequestOptions.none()): DigitalCardProfile
}
