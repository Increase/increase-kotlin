// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.interestpayments.InterestPaymentCreateParams
import java.time.OffsetDateTime
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InterestPaymentServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val interestPaymentServiceAsync = client.simulations().interestPayments()

        val transaction =
            interestPaymentServiceAsync.create(
                InterestPaymentCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .accruedOnAccountId("accrued_on_account_id")
                    .periodEnd(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .periodStart(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )

        transaction.validate()
    }
}
