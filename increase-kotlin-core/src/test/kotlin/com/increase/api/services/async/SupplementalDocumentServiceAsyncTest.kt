// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.supplementaldocuments.SupplementalDocumentCreateParams
import com.increase.api.models.supplementaldocuments.SupplementalDocumentListParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class SupplementalDocumentServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val supplementalDocumentServiceAsync = client.supplementalDocuments()

      val entitySupplementalDocument = supplementalDocumentServiceAsync.create(SupplementalDocumentCreateParams.builder()
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .fileId("file_makxrc67oh9l6sg7w9yc")
          .build())

      entitySupplementalDocument.validate()
    }

    @Test
    suspend fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val supplementalDocumentServiceAsync = client.supplementalDocuments()

      val page = supplementalDocumentServiceAsync.list(SupplementalDocumentListParams.builder()
          .entityId("entity_id")
          .build())

      page.response().validate()
    }
}
