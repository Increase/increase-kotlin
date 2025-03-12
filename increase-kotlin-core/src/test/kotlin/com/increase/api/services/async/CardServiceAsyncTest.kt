// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.cards.CardCreateParams
import com.increase.api.models.cards.CardDetailsParams
import com.increase.api.models.cards.CardListParams
import com.increase.api.models.cards.CardRetrieveParams
import com.increase.api.models.cards.CardUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CardServiceAsyncTest {

    @Test
    suspend fun create() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardServiceAsync = client.cards()

      val card = cardServiceAsync.create(CardCreateParams.builder()
          .accountId("account_in71c4amph0vgo2qllky")
          .billingAddress(CardCreateParams.BillingAddress.builder()
              .city("x")
              .line1("x")
              .postalCode("x")
              .state("x")
              .line2("x")
              .build())
          .description("Card for Ian Crease")
          .digitalWallet(CardCreateParams.DigitalWallet.builder()
              .digitalCardProfileId("digital_card_profile_id")
              .email("x")
              .phone("x")
              .build())
          .entityId("entity_id")
          .build())

      card.validate()
    }

    @Test
    suspend fun retrieve() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardServiceAsync = client.cards()

      val card = cardServiceAsync.retrieve(CardRetrieveParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .build())

      card.validate()
    }

    @Test
    suspend fun update() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardServiceAsync = client.cards()

      val card = cardServiceAsync.update(CardUpdateParams.builder()
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
          .build())

      card.validate()
    }

    @Test
    suspend fun list() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardServiceAsync = client.cards()

      val page = cardServiceAsync.list()

      page.response().validate()
    }

    @Test
    suspend fun details() {
      val client = IncreaseOkHttpClientAsync.builder()
          .baseUrl(TestServerExtension.BASE_URL)
          .apiKey("My API Key")
          .build()
      val cardServiceAsync = client.cards()

      val cardDetails = cardServiceAsync.details(CardDetailsParams.builder()
          .cardId("card_oubs0hwk5rn6knuecxg2")
          .build())

      cardDetails.validate()
    }
}
