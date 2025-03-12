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
import com.increase.api.core.http.HttpResponseFor
import com.increase.api.core.http.json
import com.increase.api.core.http.parseable
import com.increase.api.core.prepare
import com.increase.api.errors.IncreaseError
import com.increase.api.models.digitalcardprofiles.DigitalCardProfile
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileArchiveParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCloneParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileCreateParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListPage
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileListParams
import com.increase.api.models.digitalcardprofiles.DigitalCardProfileRetrieveParams

class DigitalCardProfileServiceImpl internal constructor(
    private val clientOptions: ClientOptions,

) : DigitalCardProfileService {

    private val withRawResponse: DigitalCardProfileService.WithRawResponse by lazy { WithRawResponseImpl(clientOptions) }

    override fun withRawResponse(): DigitalCardProfileService.WithRawResponse = withRawResponse

    override fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions): DigitalCardProfile =
        // post /digital_card_profiles
        withRawResponse().create(params, requestOptions).parse()

    override fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions): DigitalCardProfile =
        // get /digital_card_profiles/{digital_card_profile_id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override fun list(params: DigitalCardProfileListParams, requestOptions: RequestOptions): DigitalCardProfileListPage =
        // get /digital_card_profiles
        withRawResponse().list(params, requestOptions).parse()

    override fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions): DigitalCardProfile =
        // post /digital_card_profiles/{digital_card_profile_id}/archive
        withRawResponse().archive(params, requestOptions).parse()

    override fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions): DigitalCardProfile =
        // post /digital_card_profiles/{digital_card_profile_id}/clone
        withRawResponse().clone(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(
        private val clientOptions: ClientOptions,

    ) : DigitalCardProfileService.WithRawResponse {

        private val errorHandler: Handler<IncreaseError> = errorHandler(clientOptions.jsonMapper)

        private val createHandler: Handler<DigitalCardProfile> = jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun create(params: DigitalCardProfileCreateParams, requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfile> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("digital_card_profiles")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  createHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val retrieveHandler: Handler<DigitalCardProfile> = jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun retrieve(params: DigitalCardProfileRetrieveParams, requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfile> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("digital_card_profiles", params.getPathParam(0))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  retrieveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val listHandler: Handler<DigitalCardProfileListPage.Response> = jsonHandler<DigitalCardProfileListPage.Response>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun list(params: DigitalCardProfileListParams, requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfileListPage> {
          val request = HttpRequest.builder()
            .method(HttpMethod.GET)
            .addPathSegments("digital_card_profiles")
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  listHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
              .let {
                  DigitalCardProfileListPage.of(DigitalCardProfileServiceImpl(clientOptions), params, it)
              }
          }
        }

        private val archiveHandler: Handler<DigitalCardProfile> = jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun archive(params: DigitalCardProfileArchiveParams, requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfile> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("digital_card_profiles", params.getPathParam(0), "archive")
            .apply { params._body()?.let{ body(json(clientOptions.jsonMapper, it)) } }
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  archiveHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }

        private val cloneHandler: Handler<DigitalCardProfile> = jsonHandler<DigitalCardProfile>(clientOptions.jsonMapper).withErrorHandler(errorHandler)

        override fun clone(params: DigitalCardProfileCloneParams, requestOptions: RequestOptions): HttpResponseFor<DigitalCardProfile> {
          val request = HttpRequest.builder()
            .method(HttpMethod.POST)
            .addPathSegments("digital_card_profiles", params.getPathParam(0), "clone")
            .body(json(clientOptions.jsonMapper, params._body()))
            .build()
            .prepare(clientOptions, params)
          val requestOptions = requestOptions
              .applyDefaults(RequestOptions.from(clientOptions))
          val response = clientOptions.httpClient.execute(
            request, requestOptions
          )
          return response.parseable {
              response.use {
                  cloneHandler.handle(it)
              }
              .also {
                  if (requestOptions.responseValidation!!) {
                    it.validate()
                  }
              }
          }
        }
    }
}
