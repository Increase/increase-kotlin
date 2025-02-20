// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationInboundAchTransferCreateParamsTest {

    @Test
    fun create() {
        SimulationInboundAchTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .companyDescriptiveDate("x")
            .companyDiscretionaryData("x")
            .companyEntryDescription("x")
            .companyId("x")
            .companyName("x")
            .receiverIdNumber("x")
            .receiverName("x")
            .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .standardEntryClassCode(
                SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                    .CORPORATE_CREDIT_OR_DEBIT
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationInboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .companyDescriptiveDate("x")
                .companyDiscretionaryData("x")
                .companyEntryDescription("x")
                .companyId("x")
                .companyName("x")
                .receiverIdNumber("x")
                .receiverName("x")
                .resolveAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .standardEntryClassCode(
                    SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                        .CORPORATE_CREDIT_OR_DEBIT
                )
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
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
                SimulationInboundAchTransferCreateParams.StandardEntryClassCode
                    .CORPORATE_CREDIT_OR_DEBIT
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationInboundAchTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
