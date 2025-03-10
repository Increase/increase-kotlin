// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.SimulationAchTransferAcknowledgeParams
import com.increase.api.models.SimulationAchTransferCreateNotificationOfChangeParams
import com.increase.api.models.SimulationAchTransferReturnParams
import com.increase.api.models.SimulationAchTransferSettleParams
import com.increase.api.models.SimulationAchTransferSubmitParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceAsyncTest {

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
                SimulationAchTransferAcknowledgeParams.builder()
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
                SimulationAchTransferCreateNotificationOfChangeParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .changeCode(
                        SimulationAchTransferCreateNotificationOfChangeParams.ChangeCode
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
                SimulationAchTransferReturnParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .reason(SimulationAchTransferReturnParams.Reason.INSUFFICIENT_FUND)
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
                SimulationAchTransferSettleParams.builder()
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
                SimulationAchTransferSubmitParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }
}
