// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.accounttransfers.AccountTransferCompleteParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AccountTransferServiceTest {

    @Test
    fun complete() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountTransferService = client.simulations().accountTransfers()

        val accountTransfer =
            accountTransferService.complete(
                AccountTransferCompleteParams.builder()
                    .accountTransferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                    .build()
            )

        accountTransfer.validate()
    }
}
