// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.AccountTransferApproveParams
import com.increase.api.models.AccountTransferCancelParams
import com.increase.api.models.AccountTransferCreateParams
import com.increase.api.models.AccountTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceAsyncTest {

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
            accountTransferServiceAsync.retrieve(
                AccountTransferRetrieveParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

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

        val page = accountTransferServiceAsync.list()

        page.response().validate()
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
            accountTransferServiceAsync.approve(
                AccountTransferApproveParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

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
            accountTransferServiceAsync.cancel(
                AccountTransferCancelParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }
}
