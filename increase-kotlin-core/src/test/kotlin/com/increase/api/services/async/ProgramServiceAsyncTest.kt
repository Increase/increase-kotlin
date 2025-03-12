// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.programs.ProgramListParams
import com.increase.api.models.programs.ProgramRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class ProgramServiceAsyncTest {

    @Test
    suspend fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val programServiceAsync = client.programs()

      val program = programServiceAsync.retrieve(ProgramRetrieveParams.builder()
          .programId("program_i2v2os4mwza1oetokh9i")
          .build())

      program.validate()
    }

    @Test
    suspend fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val programServiceAsync = client.programs()

      val page = programServiceAsync.list()

      page.response().validate()
    }
}
