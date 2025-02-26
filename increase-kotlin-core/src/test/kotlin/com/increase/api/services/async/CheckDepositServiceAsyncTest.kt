// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.CheckDepositCreateParams
import com.increase.api.models.CheckDepositRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class CheckDepositServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.checkDeposits()

        val checkDeposit =
            checkDepositServiceAsync.create(
                CheckDepositCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(1000L)
                    .backImageFileId("file_26khfk98mzfz90a11oqx")
                    .frontImageFileId("file_hkv175ovmc2tb2v2zbrm")
                    .description("Vendor payment")
                    .build()
            )

        checkDeposit.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.checkDeposits()

        val checkDeposit =
            checkDepositServiceAsync.retrieve(
                CheckDepositRetrieveParams.builder()
                    .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                    .build()
            )

        checkDeposit.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val checkDepositServiceAsync = client.checkDeposits()

        val page = checkDepositServiceAsync.list()

        page.response().validate()
    }
}
