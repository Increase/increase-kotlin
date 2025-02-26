// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.RealTimePaymentsTransferCreateParams
import com.increase.api.models.RealTimePaymentsTransferRetrieveParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class RealTimePaymentsTransferServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferServiceAsync.create(
                RealTimePaymentsTransferCreateParams.builder()
                    .amount(100L)
                    .creditorName("Ian Crease")
                    .remittanceInformation("Invoice 29582")
                    .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                    .debtorName("x")
                    .destinationAccountNumber("987654321")
                    .destinationRoutingNumber("101050001")
                    .externalAccountId("external_account_id")
                    .requireApproval(true)
                    .ultimateCreditorName("x")
                    .ultimateDebtorName("x")
                    .build()
            )

        realTimePaymentsTransfer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val realTimePaymentsTransfer =
            realTimePaymentsTransferServiceAsync.retrieve(
                RealTimePaymentsTransferRetrieveParams.builder()
                    .realTimePaymentsTransferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                    .build()
            )

        realTimePaymentsTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimePaymentsTransferServiceAsync = client.realTimePaymentsTransfers()

        val page = realTimePaymentsTransferServiceAsync.list()

        page.response().validate()
    }
}
