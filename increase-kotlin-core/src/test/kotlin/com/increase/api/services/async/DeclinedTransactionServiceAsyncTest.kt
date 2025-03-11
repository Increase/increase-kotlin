// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.declinedtransactions.DeclinedTransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class DeclinedTransactionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionServiceAsync = client.declinedTransactions()

        val declinedTransaction =
            declinedTransactionServiceAsync.retrieve(
                DeclinedTransactionRetrieveParams.builder()
                    .declinedTransactionId("declined_transaction_17jbn0yyhvkt4v4ooym8")
                    .build()
            )

        declinedTransaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionServiceAsync = client.declinedTransactions()

        val page = declinedTransactionServiceAsync.list()

        page.response().validate()
    }
}
