// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositDeclineParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositRetrieveParams
import com.increase.api.models.inboundcheckdeposits.InboundCheckDepositReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class InboundCheckDepositServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositServiceAsync.retrieve(
                InboundCheckDepositRetrieveParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .build()
            )

        inboundCheckDeposit.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val page = inboundCheckDepositServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun decline() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositServiceAsync.decline(
                InboundCheckDepositDeclineParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .build()
            )

        inboundCheckDeposit.validate()
    }

    @Test
    suspend fun return_() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundCheckDepositServiceAsync = client.inboundCheckDeposits()

        val inboundCheckDeposit =
            inboundCheckDepositServiceAsync.return_(
                InboundCheckDepositReturnParams.builder()
                    .inboundCheckDepositId("inbound_check_deposit_zoshvqybq0cjjm31mra")
                    .reason(InboundCheckDepositReturnParams.Reason.ALTERED_OR_FICTITIOUS)
                    .build()
            )

        inboundCheckDeposit.validate()
    }
}
