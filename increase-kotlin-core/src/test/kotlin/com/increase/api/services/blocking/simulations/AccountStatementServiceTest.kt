// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.simulations.accountstatements.AccountStatementCreateParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AccountStatementServiceTest {

    @Test
    fun create() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val accountStatementService = client.simulations().accountStatements()

        val accountStatement =
            accountStatementService.create(
                AccountStatementCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .build()
            )

        accountStatement.validate()
    }
}
