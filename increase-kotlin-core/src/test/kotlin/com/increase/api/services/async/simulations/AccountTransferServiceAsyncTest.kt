// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationAccountTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceAsyncTest {

    @Test
    suspend fun complete() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferServiceAsync = client.simulations().accountTransfers()

        val accountTransfer =
            accountTransferServiceAsync.complete(
                SimulationAccountTransferCompleteParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }
}
