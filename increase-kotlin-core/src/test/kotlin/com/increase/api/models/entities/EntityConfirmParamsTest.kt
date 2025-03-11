// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.entities

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EntityConfirmParamsTest {

    @Test
    fun create() {
      EntityConfirmParams.builder()
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()
    }

    @Test
    fun body() {
      val params = EntityConfirmParams.builder()
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .confirmedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.confirmedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = EntityConfirmParams.builder()
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .build()

      val body = params._body()

      assertNotNull(body)
    }

    @Test
    fun getPathParam() {
      val params = EntityConfirmParams.builder()
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .build()
      assertThat(params).isNotNull
      // path param "entityId"
      assertThat(params.getPathParam(0)).isEqualTo("entity_n8y8tnk2p9339ti393yi")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
