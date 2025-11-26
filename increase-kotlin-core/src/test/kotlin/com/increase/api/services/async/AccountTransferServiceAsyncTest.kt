// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.accounttransfers.AccountTransferCreateParams
import com.increase.api.models.accounttransfers.AccountTransferListParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountTransferServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.accountTransfers()

        val accountTransfer =
            accountTransferServiceAsync.create(
                AccountTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .description("Creating liquidity")
                    .destinationAccountId("account_uf16sut2ct5bevmq3eh")
                    .requireApproval(true)
                    .build()
            )

        accountTransfer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.accountTransfers()

        val accountTransfer =
            accountTransferServiceAsync.retrieve("account_transfer_7k9qe1ysdgqztnt63l7n")

        accountTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.accountTransfers()

        val accountTransfers =
            accountTransferServiceAsync.list(
                AccountTransferListParams.builder()
                    .accountId("account_id")
                    .createdAt(
                        AccountTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .idempotencyKey("x")
                    .limit(1L)
                    .build()
            )

        accountTransfers.validate()
    }

    @Test
    suspend fun approve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.accountTransfers()

        val accountTransfer =
            accountTransferServiceAsync.approve("account_transfer_7k9qe1ysdgqztnt63l7n")

        accountTransfer.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.accountTransfers()

        val accountTransfer =
            accountTransferServiceAsync.cancel("account_transfer_7k9qe1ysdgqztnt63l7n")

        accountTransfer.validate()
    }
}
