// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.achtransfers.AchTransferApproveParams
import com.increase.api.models.achtransfers.AchTransferCancelParams
import com.increase.api.models.achtransfers.AchTransferCreateParams
import com.increase.api.models.achtransfers.AchTransferRetrieveParams
import java.time.LocalDate
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
class AchTransferServiceAsyncTest {

    @Test
    suspend fun create() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.achTransfers()

        val achTransfer =
            achTransferServiceAsync.create(
                AchTransferCreateParams.builder()
                    .accountId("account_in71c4amph0vgo2qllky")
                    .amount(100L)
                    .statementDescriptor("New ACH transfer")
                    .accountNumber("987654321")
                    .addenda(
                        AchTransferCreateParams.Addenda.builder()
                            .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                            .freeform(
                                AchTransferCreateParams.Addenda.Freeform.builder()
                                    .addEntry(
                                        AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation("x")
                                            .build()
                                    )
                                    .build()
                            )
                            .paymentOrderRemittanceAdvice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                    .builder()
                                    .addInvoice(
                                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                            .Invoice
                                            .builder()
                                            .invoiceNumber("x")
                                            .paidAmount(0L)
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .companyDescriptiveDate("x")
                    .companyDiscretionaryData("x")
                    .companyEntryDescription("x")
                    .companyName("x")
                    .destinationAccountHolder(
                        AchTransferCreateParams.DestinationAccountHolder.BUSINESS
                    )
                    .externalAccountId("external_account_id")
                    .funding(AchTransferCreateParams.Funding.CHECKING)
                    .individualId("x")
                    .individualName("x")
                    .preferredEffectiveDate(
                        AchTransferCreateParams.PreferredEffectiveDate.builder()
                            .date(LocalDate.parse("2019-12-27"))
                            .settlementSchedule(
                                AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule
                                    .SAME_DAY
                            )
                            .build()
                    )
                    .requireApproval(true)
                    .routingNumber("101050001")
                    .standardEntryClassCode(
                        AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                    )
                    .transactionTiming(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.achTransfers()

        val achTransfer =
            achTransferServiceAsync.retrieve(
                AchTransferRetrieveParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun list() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.achTransfers()

        val page = achTransferServiceAsync.list()

        page.response().validate()
    }

    @Test
    suspend fun approve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.achTransfers()

        val achTransfer =
            achTransferServiceAsync.approve(
                AchTransferApproveParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }

    @Test
    suspend fun cancel() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val achTransferServiceAsync = client.achTransfers()

        val achTransfer =
            achTransferServiceAsync.cancel(
                AchTransferCancelParams.builder()
                    .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                    .build()
            )

        achTransfer.validate()
    }
}
