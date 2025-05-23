// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundachtransfers

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferCreateParamsTest {

    @Test
    fun create() {
        InboundAchTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .addenda(
                InboundAchTransferCreateParams.Addenda.builder()
                    .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("x")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyId("x")
            .companyName("x")
            .receiverIdNumber("x")
            .receiverName("x")
            .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .standardEntryClassCode(
                InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .addenda(
                    InboundAchTransferCreateParams.Addenda.builder()
                        .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransferCreateParams.Addenda.Freeform.builder()
                                .addEntry(
                                    InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("x")
                                        .build()
                                )
                                .build()
                        )
                        .build()
                )
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyId("x")
                .companyName("x")
                .receiverIdNumber("x")
                .receiverName("x")
                .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .standardEntryClassCode(
                    InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.addenda())
            .isEqualTo(
                InboundAchTransferCreateParams.Addenda.builder()
                    .category(InboundAchTransferCreateParams.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransferCreateParams.Addenda.Freeform.builder()
                            .addEntry(
                                InboundAchTransferCreateParams.Addenda.Freeform.Entry.builder()
                                    .paymentRelatedInformation("x")
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.companyDescriptiveDate()).isEqualTo("x")
        assertThat(body.companyDiscretionaryData()).isEqualTo("x")
        assertThat(body.companyEntryDescription()).isEqualTo("x")
        assertThat(body.companyId()).isEqualTo("x")
        assertThat(body.companyName()).isEqualTo("x")
        assertThat(body.receiverIdNumber()).isEqualTo("x")
        assertThat(body.receiverName()).isEqualTo("x")
        assertThat(body.resolveAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(body.standardEntryClassCode())
            .isEqualTo(
                InboundAchTransferCreateParams.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
