// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.events.EventListParams
import com.increase.api.models.events.EventRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class EventServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventServiceAsync = client.events()

      val event = eventServiceAsync.retrieve(EventRetrieveParams.builder()
          .eventId("event_001dzz0r20rzr4zrhrr1364hy80")
          .build())

      event.validate()
    }

    @Test
    suspend fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val eventServiceAsync = client.events()

      val page = eventServiceAsync.list()

      page.response().validate()
    }
}
