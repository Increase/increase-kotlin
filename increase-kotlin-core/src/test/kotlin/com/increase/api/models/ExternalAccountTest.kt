// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.ExternalAccount

class ExternalAccountTest {

    @Test
    fun createExternalAccount() {
      val externalAccount = ExternalAccount.builder()
          .id("id")
          .accountHolder(ExternalAccount.AccountHolder.BUSINESS)
          .accountNumber("account_number")
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .description("description")
          .funding(ExternalAccount.Funding.CHECKING)
          .idempotencyKey("idempotency_key")
          .routingNumber("routing_number")
          .status(ExternalAccount.Status.ACTIVE)
          .type(ExternalAccount.Type.EXTERNAL_ACCOUNT)
          .verificationStatus(ExternalAccount.VerificationStatus.UNVERIFIED)
          .build()
      assertThat(externalAccount).isNotNull
      assertThat(externalAccount.id()).isEqualTo("id")
      assertThat(externalAccount.accountHolder()).isEqualTo(ExternalAccount.AccountHolder.BUSINESS)
      assertThat(externalAccount.accountNumber()).isEqualTo("account_number")
      assertThat(externalAccount.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(externalAccount.description()).isEqualTo("description")
      assertThat(externalAccount.funding()).isEqualTo(ExternalAccount.Funding.CHECKING)
      assertThat(externalAccount.idempotencyKey()).isEqualTo("idempotency_key")
      assertThat(externalAccount.routingNumber()).isEqualTo("routing_number")
      assertThat(externalAccount.status()).isEqualTo(ExternalAccount.Status.ACTIVE)
      assertThat(externalAccount.type()).isEqualTo(ExternalAccount.Type.EXTERNAL_ACCOUNT)
      assertThat(externalAccount.verificationStatus()).isEqualTo(ExternalAccount.VerificationStatus.UNVERIFIED)
    }
}
