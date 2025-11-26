// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.declinedtransactions.DeclinedTransactionListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class DeclinedTransactionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val declinedTransactionServiceAsync = client.declinedTransactions()

        val declinedTransaction =
            declinedTransactionServiceAsync.retrieve("declined_transaction_17jbn0yyhvkt4v4ooym8")

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

        val declinedTransactions =
            declinedTransactionServiceAsync.list(
                DeclinedTransactionListParams.builder()
                    .accountId("account_id")
                    .category(
                        DeclinedTransactionListParams.Category.builder()
                            .addIn(DeclinedTransactionListParams.Category.In.ACH_DECLINE)
                            .build()
                    )
                    .createdAt(
                        DeclinedTransactionListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .routeId("route_id")
                    .build()
            )

        declinedTransactions.validate()
    }
}
