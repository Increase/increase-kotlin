// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.carddetails.CardDetailCreateDetailsIframeParams
import com.increase.api.models.carddetails.CardDetailUpdateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDetailServiceAsyncTest {

    @Test
    suspend fun update() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardDetails =
            cardDetailServiceAsync.update(
                CardDetailUpdateParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .pin("1234")
                    .build()
            )

        cardDetails.validate()
    }

    @Test
    suspend fun createDetailsIframe() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardIframeUrl =
            cardDetailServiceAsync.createDetailsIframe(
                CardDetailCreateDetailsIframeParams.builder()
                    .cardId("card_oubs0hwk5rn6knuecxg2")
                    .physicalCardId("physical_card_id")
                    .build()
            )

        cardIframeUrl.validate()
    }

    @Test
    suspend fun details() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDetailServiceAsync = client.cardDetails()

        val cardDetails = cardDetailServiceAsync.details("card_oubs0hwk5rn6knuecxg2")

        cardDetails.validate()
    }
}
