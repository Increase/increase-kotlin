// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.pendingtransactions.PendingTransactionCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PendingTransactionServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionServiceAsync.create(
                PendingTransactionCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(-1000L)
                    .description("Hold for pending transaction")
                    .build()
            )

        pendingTransaction.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionServiceAsync.retrieve("pending_transaction_k1sfetcau2qbvjbzgju4")

        pendingTransaction.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val page = pendingTransactionServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun release() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val pendingTransactionServiceAsync = client.pendingTransactions()

        val pendingTransaction =
            pendingTransactionServiceAsync.release("pending_transaction_k1sfetcau2qbvjbzgju4")

        pendingTransaction.validate()
    }
}
