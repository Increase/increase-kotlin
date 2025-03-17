// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferRetrieveParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class InboundAchTransferServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransfer =
            inboundAchTransferServiceAsync.retrieve(
                InboundAchTransferRetrieveParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .build()
            )

        inboundAchTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val page = inboundAchTransferServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun createNotificationOfChange() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransfer =
            inboundAchTransferServiceAsync.createNotificationOfChange(
                InboundAchTransferCreateNotificationOfChangeParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .updatedAccountNumber("987654321")
                    .updatedRoutingNumber("101050001")
                    .build()
            )

        inboundAchTransfer.validate()
    }

    @Test
    suspend fun decline() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransfer =
            inboundAchTransferServiceAsync.decline(
                InboundAchTransferDeclineParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .reason(InboundAchTransferDeclineParams.Reason.INSUFFICIENT_FUNDS)
                    .build()
            )

        inboundAchTransfer.validate()
    }

    @Test
    suspend fun transferReturn() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val inboundAchTransferServiceAsync = client.inboundAchTransfers()

        val inboundAchTransfer =
            inboundAchTransferServiceAsync.transferReturn(
                InboundAchTransferTransferReturnParams.builder()
                    .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                    .reason(InboundAchTransferTransferReturnParams.Reason.INSUFFICIENT_FUNDS)
                    .build()
            )

        inboundAchTransfer.validate()
    }
}
