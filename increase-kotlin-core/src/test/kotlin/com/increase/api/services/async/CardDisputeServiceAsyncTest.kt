// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.carddisputes.CardDisputeCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class CardDisputeServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeServiceAsync = client.cardDisputes()

        val cardDispute =
            cardDisputeServiceAsync.create(
                CardDisputeCreateParams.builder()
                    .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                    .explanation("Unauthorized recurring transaction.")
                    .amount(1L)
                    .build()
            )

        cardDispute.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeServiceAsync = client.cardDisputes()

        val cardDispute = cardDisputeServiceAsync.retrieve("card_dispute_h9sc95nbl1cgltpp7men")

        cardDispute.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val cardDisputeServiceAsync = client.cardDisputes()

        val page = cardDisputeServiceAsync.list()

        page.response().validate()
    }
}
