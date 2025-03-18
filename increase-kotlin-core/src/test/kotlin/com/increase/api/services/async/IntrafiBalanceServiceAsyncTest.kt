// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.intrafibalances.IntrafiBalanceIntrafiBalanceParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class IntrafiBalanceServiceAsyncTest {

    @Test
    suspend fun intrafiBalance() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val intrafiBalanceServiceAsync = client.intrafiBalances()

        val intrafiBalance =
            intrafiBalanceServiceAsync.intrafiBalance(
                IntrafiBalanceIntrafiBalanceParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .build()
            )

        intrafiBalance.validate()
    }
}
