// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardPurchaseSupplementServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementServiceAsync = client.cardPurchaseSupplements()

        val cardPurchaseSupplement =
            cardPurchaseSupplementServiceAsync.retrieve(
                "card_purchase_supplement_ijuc45iym4jchnh2sfk3"
            )

        cardPurchaseSupplement.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardPurchaseSupplementServiceAsync = client.cardPurchaseSupplements()

        val page = cardPurchaseSupplementServiceAsync.list()

        page.response().validate()
    }
}
