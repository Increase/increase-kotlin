// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.inboundachtransfers.InboundAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferDeclineParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferListParams
import com.increase.api.models.inboundachtransfers.InboundAchTransferTransferReturnParams
import java.time.OffsetDateTime
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
            inboundAchTransferServiceAsync.retrieve("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")

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

        val inboundAchTransfers =
            inboundAchTransferServiceAsync.list(
                InboundAchTransferListParams.builder()
                    .accountId("account_id")
                    .accountNumberId("account_number_id")
                    .createdAt(
                        InboundAchTransferListParams.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .cursor("cursor")
                    .limit(1L)
                    .status(
                        InboundAchTransferListParams.Status.builder()
                            .addIn(InboundAchTransferListParams.Status.In.PENDING)
                            .build()
                    )
                    .build()
            )

        inboundAchTransfers.validate()
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
                    .reason(InboundAchTransferDeclineParams.Reason.PAYMENT_STOPPED)
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
                    .reason(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
                    .build()
            )

        inboundAchTransfer.validate()
    }
}
