package com.increase.api.services.blocking.simulations

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClient
import com.increase.api.models.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceTest {

    @Test
    fun callComplete() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()
        val realTimePaymentsTransfer =
            realTimePaymentsTransferService.complete(
                SimulationRealTimePaymentsTransferCompleteParams.builder()
                    .realTimePaymentsTransferId("string")
                    .rejection(
                        SimulationRealTimePaymentsTransferCompleteParams.Rejection.builder()
                            .rejectReasonCode(
                                SimulationRealTimePaymentsTransferCompleteParams.Rejection
                                    .RejectReasonCode
                                    .ACCOUNT_CLOSED
                            )
                            .build()
                    )
                    .build()
            )
        println(realTimePaymentsTransfer)
        realTimePaymentsTransfer.validate()
    }

    @Test
    fun callCreateInbound() {
        val client =
            IncreaseOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("test-api-key")
                .build()
        val realTimePaymentsTransferService = client.simulations().realTimePaymentsTransfers()
        val inboundRealTimePaymentsTransferSimulationResult =
            realTimePaymentsTransferService.createInbound(
                SimulationRealTimePaymentsTransferCreateInboundParams.builder()
                    .accountNumberId("string")
                    .amount(123L)
                    .requestForPaymentId("string")
                    .debtorName("x")
                    .debtorAccountNumber("x")
                    .debtorRoutingNumber("xxxxxxxxx")
                    .remittanceInformation("x")
                    .build()
            )
        println(inboundRealTimePaymentsTransferSimulationResult)
        inboundRealTimePaymentsTransferSimulationResult.validate()
    }
}
