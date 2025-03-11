// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accounts

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountCreateParamsTest {

    @Test
    fun create() {
      AccountCreateParams.builder()
          .name("New Account!")
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .informationalEntityId("informational_entity_id")
          .programId("program_i2v2os4mwza1oetokh9i")
          .build()
    }

    @Test
    fun body() {
      val params = AccountCreateParams.builder()
          .name("New Account!")
          .entityId("entity_n8y8tnk2p9339ti393yi")
          .informationalEntityId("informational_entity_id")
          .programId("program_i2v2os4mwza1oetokh9i")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("New Account!")
      assertThat(body.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
      assertThat(body.informationalEntityId()).isEqualTo("informational_entity_id")
      assertThat(body.programId()).isEqualTo("program_i2v2os4mwza1oetokh9i")
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = AccountCreateParams.builder()
          .name("New Account!")
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.name()).isEqualTo("New Account!")
    }
}
