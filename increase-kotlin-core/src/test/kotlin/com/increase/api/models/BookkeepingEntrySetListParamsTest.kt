// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import org.apache.hc.core5.http.ContentType
import com.increase.api.core.ContentTypes
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.core.MultipartFormValue
import com.increase.api.models.*
import com.increase.api.models.BookkeepingEntrySetListParams

class BookkeepingEntrySetListParamsTest {

    @Test
    fun createBookkeepingEntrySetListParams() {
      BookkeepingEntrySetListParams.builder()
          .cursor("cursor")
          .idempotencyKey("x")
          .limit(123L)
          .transactionId("transaction_id")
          .build()
    }

    @Test
    fun getQueryParams() {
      val params = BookkeepingEntrySetListParams.builder()
          .cursor("cursor")
          .idempotencyKey("x")
          .limit(123L)
          .transactionId("transaction_id")
          .build()
      val expected = mutableMapOf<String, List<String>>()
      expected.put("cursor", listOf("cursor"))
      expected.put("idempotency_key", listOf("x"))
      expected.put("limit", listOf("123"))
      expected.put("transaction_id", listOf("transaction_id"))
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
      val params = BookkeepingEntrySetListParams.builder().build()
      val expected = mutableMapOf<String, List<String>>()
      assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
