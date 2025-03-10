// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.transactions.TransactionRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class TransactionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val transaction =
            transactionServiceAsync.retrieve(
                TransactionRetrieveParams.builder()
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )

        transaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val transactionServiceAsync = client.transactions()

        val page = transactionServiceAsync.list()

        page.response().validate()
    }
}
