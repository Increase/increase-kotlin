// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.checkdeposits.CheckDepositRejectParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositReturnParams
import com.increase.api.models.simulations.checkdeposits.CheckDepositSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceAsyncTest {

    @Test
    suspend fun reject() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDeposit =
            checkDepositServiceAsync.reject(
                CheckDepositRejectParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        checkDeposit.validate()
    }

    @Test
    suspend fun return_() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDeposit =
            checkDepositServiceAsync.return_(
                CheckDepositReturnParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        checkDeposit.validate()
    }

    @Test
    suspend fun submit() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.simulations().checkDeposits()

        val checkDeposit =
            checkDepositServiceAsync.submit(
                CheckDepositSubmitParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        checkDeposit.validate()
    }
}
