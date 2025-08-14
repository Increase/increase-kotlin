// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardTokenServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val cardToken = cardTokenServiceAsync.retrieve("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        cardToken.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val page = cardTokenServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun capabilities() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardTokenServiceAsync = client.cardTokens()

        val cardTokenCapabilities =
            cardTokenServiceAsync.capabilities("outbound_card_token_zlt0ml6youq3q7vcdlg0")

        cardTokenCapabilities.validate()
    }
}
