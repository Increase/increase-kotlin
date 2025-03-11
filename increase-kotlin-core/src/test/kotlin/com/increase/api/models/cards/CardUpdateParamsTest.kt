// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.cards

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardUpdateParamsTest {

    @Test
    fun create() {
      CardUpdateParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .billingAddress(CardUpdateParams.BillingAddress.builder()
              .city("x")
              .line1("x")
              .postalCode("x")
              .state("x")
              .line2("x")
              .build())
          .description("New description")
          .digitalWallet(CardUpdateParams.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("x")
              .phone("x")
              .build())
          .entityId("entity_id")
          .status(CardUpdateParams.Status.ACTIVE)
          .build()
    }

    @Test
    fun body() {
      val params = CardUpdateParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .billingAddress(CardUpdateParams.BillingAddress.builder()
              .city("x")
              .line1("x")
              .postalCode("x")
              .state("x")
              .line2("x")
              .build())
          .description("New description")
          .digitalWallet(CardUpdateParams.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("x")
              .phone("x")
              .build())
          .entityId("entity_id")
          .status(CardUpdateParams.Status.ACTIVE)
          .build()

      val body = params._body()

      assertNotNull(body)
      assertThat(body.billingAddress()).isEqualTo(CardUpdateParams.BillingAddress.builder()
          .city("x")
          .line1("x")
          .postalCode("x")
          .state("x")
          .line2("x")
          .build())
      assertThat(body.description()).isEqualTo("New description")
      assertThat(body.digitalWallet()).isEqualTo(CardUpdateParams.DigitalWallet.builder()
          .digitalCardProfileId("digital_card_profile_id")
          .email("x")
          .phone("x")
          .build())
      assertThat(body.entityId()).isEqualTo("entity_id")
      assertThat(body.status()).isEqualTo(CardUpdateParams.Status.ACTIVE)
    }

    @Test
    fun bodyWithoutOptionalFields() {
      val params = CardUpdateParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .build()

      val body = params._body()

      assertNotNull(body)
    }

    @Test
    fun getPathParam() {
      val params = CardUpdateParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .build()
      assertThat(params).isNotNull
      // path param "cardId"
      assertThat(params.getPathParam(0)).isEqualTo("card_oubs0hwk5rn6knuecxg2")
      // out-of-bound path param
      assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
