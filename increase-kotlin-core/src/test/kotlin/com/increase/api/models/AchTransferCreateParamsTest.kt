// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AchTransferCreateParamsTest {

    @Test
    fun createAchTransferCreateParams() {
        AchTransferCreateParams.builder()
            .accountId("string")
            .amount(123L)
            .statementDescriptor("x")
            .accountNumber("x")
            .addenda(
                AchTransferCreateParams.Addenda.builder()
                    .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransferCreateParams.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("x")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .invoices(
                                listOf(
                                    AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                        .Invoice
                                        .builder()
                                        .invoiceNumber("x")
                                        .paidAmount(123L)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyName("x")
            .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
            .effectiveDate(LocalDate.parse("2019-12-27"))
            .externalAccountId("string")
            .funding(AchTransferCreateParams.Funding.CHECKING)
            .individualId("x")
            .individualName("x")
            .requireApproval(true)
            .routingNumber("xxxxxxxxx")
            .standardEntryClassCode(
                AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .statementDescriptor("x")
                .accountNumber("x")
                .addenda(
                    AchTransferCreateParams.Addenda.builder()
                        .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                        .freeform(
                            AchTransferCreateParams.Addenda.Freeform.builder()
                                .entries(
                                    listOf(
                                        AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation("x")
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .paymentOrderRemittanceAdvice(
                            AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                                .invoices(
                                    listOf(
                                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                            .Invoice
                                            .builder()
                                            .invoiceNumber("x")
                                            .paidAmount(123L)
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyName("x")
                .destinationAccountHolder(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
                .effectiveDate(LocalDate.parse("2019-12-27"))
                .externalAccountId("string")
                .funding(AchTransferCreateParams.Funding.CHECKING)
                .individualId("x")
                .individualName("x")
                .requireApproval(true)
                .routingNumber("xxxxxxxxx")
                .standardEntryClassCode(
                    AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.statementDescriptor()).isEqualTo("x")
        assertThat(body.accountNumber()).isEqualTo("x")
        assertThat(body.addenda())
            .isEqualTo(
                AchTransferCreateParams.Addenda.builder()
                    .category(AchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        AchTransferCreateParams.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    AchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("x")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .paymentOrderRemittanceAdvice(
                        AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice.builder()
                            .invoices(
                                listOf(
                                    AchTransferCreateParams.Addenda.PaymentOrderRemittanceAdvice
                                        .Invoice
                                        .builder()
                                        .invoiceNumber("x")
                                        .paidAmount(123L)
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.destinationAccountHolder())
            .isEqualTo(AchTransferCreateParams.DestinationAccountHolder.BUSINESS)
        assertThat(body.effectiveDate()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.externalAccountId()).isEqualTo("string")
        assertThat(body.funding()).isEqualTo(AchTransferCreateParams.Funding.CHECKING)
        assertThat(body.individualId()).isEqualTo("x")
        assertThat(body.individualName()).isEqualTo("x")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.standardEntryClassCode())
            .isEqualTo(AchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            AchTransferCreateParams.builder()
                .accountId("string")
                .amount(123L)
                .statementDescriptor("x")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.accountId()).isEqualTo("string")
        assertThat(body.amount()).isEqualTo(123L)
        assertThat(body.statementDescriptor()).isEqualTo("x")
    }
}
