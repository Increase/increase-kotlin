// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.achtransfers

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferCreateParamsTest {

    @Test
    fun create() {
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
                                    .paymentRelatedInformation("payment_related_information")
                                    .build()
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .addInvoice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                    .builder()
                                    .invoiceNumber("sq")
                                    .paidAmount(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .companyDescriptiveDate("J!")
            .companyDiscretionaryData("J!")
            .companyEntryDescription("J!")
            .companyName("company_name")
            .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
            .externalAccountId("external_account_id")
            .funding(AchTransferCreateParams.Funding.CHECKING)
            .individualId("individual_id")
            .individualName("individual_name")
            .preferredEffectiveDate(
                AchTransferCreateParams.PreferredEffectiveDate.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .settlementSchedule(
                        AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
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
    }

    @Test
    fun body() {
        val params =
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
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                                .build()
                        )
                        .paymentOrderRemittanceAdvice(
                            AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                                .addInvoice(
                                    AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                        .Invoice
                                        .builder()
                                        .invoiceNumber("sq")
                                        .paidAmount(0L)
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .companyDescriptiveDate("J!")
                .companyDiscretionaryData("J!")
                .companyEntryDescription("J!")
                .companyName("company_name")
                .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
                .externalAccountId("external_account_id")
                .funding(AchTransferCreateParams.Funding.CHECKING)
                .individualId("individual_id")
                .individualName("individual_name")
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

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.statementDescriptor()).isEqualTo("New ACH transfer")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.addenda())
            .isEqualTo(
                AchTransferCreateParams.Addenda.builder()
                    .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("payment_related_information")
                                    .build()
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .addInvoice(
                                AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.Invoice
                                    .builder()
                                    .invoiceNumber("sq")
                                    .paidAmount(0L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.companyDescriptiveDate()).isEqualTo("J!")
        assertThat(body.companyDiscretionaryData()).isEqualTo("J!")
        assertThat(body.companyEntryDescription()).isEqualTo("J!")
        assertThat(body.companyName()).isEqualTo("company_name")
        assertThat(body.destinationAccountHolder())
            .isEqualTo(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
        assertThat(body.externalAccountId()).isEqualTo("external_account_id")
        assertThat(body.funding()).isEqualTo(AchTransferCreateParams.Funding.CHECKING)
        assertThat(body.individualId()).isEqualTo("individual_id")
        assertThat(body.individualName()).isEqualTo("individual_name")
        assertThat(body.preferredEffectiveDate())
            .isEqualTo(
                AchTransferCreateParams.PreferredEffectiveDate.builder()
                    .date(LocalDate.parse("2019-12-27"))
                    .settlementSchedule(
                        AchTransferCreateParams.PreferredEffectiveDate.SettlementSchedule.SAME_DAY
                    )
                    .build()
            )
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("101050001")
        assertThat(body.standardEntryClassCode())
            .isEqualTo(AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(body.transactionTiming())
            .isEqualTo(AchTransferCreateParams.TransactionTiming.SYNCHRONOUS)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .statementDescriptor("New ACH transfer")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.statementDescriptor()).isEqualTo("New ACH transfer")
    }
}
