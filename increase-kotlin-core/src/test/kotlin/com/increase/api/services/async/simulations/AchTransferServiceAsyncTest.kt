// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.simulations.achtransfers.AchTransferAcknowledgeParams
import com.increase.api.models.simulations.achtransfers.AchTransferCreateNotificationOfChangeParams
import com.increase.api.models.simulations.achtransfers.AchTransferReturnParams
import com.increase.api.models.simulations.achtransfers.AchTransferSettleParams
import com.increase.api.models.simulations.achtransfers.AchTransferSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class AchTransferServiceAsyncTest {

    @Test
    suspend fun acknowledge() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.simulations().achTransfers()

        val achTransfer =
            achTransferServiceAsync.acknowledge(
                AchTransferAcknowledgeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun createNotificationOfChange() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.simulations().achTransfers()

        val achTransfer =
            achTransferServiceAsync.createNotificationOfChange(
                AchTransferCreateNotificationOfChangeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .changeCode(
                        AchTransferCreateNotificationOfChangeParams.ChangeCode
                            .INCORRECT_ACCOUNT_NUMBER
                    )
                    .correctedData("123456789")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun return_() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.simulations().achTransfers()

        val achTransfer =
            achTransferServiceAsync.return_(
                AchTransferReturnParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .reason(AchTransferReturnParams.Reason.INSUFFICIENT_FUND)
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun settle() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.simulations().achTransfers()

        val achTransfer =
            achTransferServiceAsync.settle(
                AchTransferSettleParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun submit() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.simulations().achTransfers()

        val achTransfer =
            achTransferServiceAsync.submit(
                AchTransferSubmitParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }
}
