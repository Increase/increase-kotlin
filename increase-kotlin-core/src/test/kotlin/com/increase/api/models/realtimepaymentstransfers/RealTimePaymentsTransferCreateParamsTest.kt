// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimepaymentstransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimePaymentsTransferCreateParamsTest {

    @Test
    fun create() {
        RealTimePaymentsTransferCreateParams.builder()
            .amount(100L)
            .creditorName("Ian Crease")
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .unstructuredRemittanceInformation("Invoice 29582")
            .accountNumber("987654321")
            .debtorName("x")
            .destinationAccountNumber("x")
            .destinationRoutingNumber("xxxxxxxxx")
            .externalAccountId("external_account_id")
            .requireApproval(true)
            .routingNumber("101050001")
            .ultimateCreditorName("x")
            .ultimateDebtorName("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .accountNumber("987654321")
                .debtorName("x")
                .destinationAccountNumber("x")
                .destinationRoutingNumber("xxxxxxxxx")
                .externalAccountId("external_account_id")
                .requireApproval(true)
                .routingNumber("101050001")
                .ultimateCreditorName("x")
                .ultimateDebtorName("x")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
        assertThat(body.accountNumber()).isEqualTo("987654321")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.destinationAccountNumber()).isEqualTo("x")
        assertThat(body.destinationRoutingNumber()).isEqualTo("xxxxxxxxx")
        assertThat(body.externalAccountId()).isEqualTo("external_account_id")
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.routingNumber()).isEqualTo("101050001")
        assertThat(body.ultimateCreditorName()).isEqualTo("x")
        assertThat(body.ultimateDebtorName()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimePaymentsTransferCreateParams.builder()
                .amount(100L)
                .creditorName("Ian Crease")
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .unstructuredRemittanceInformation("Invoice 29582")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(100L)
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("Invoice 29582")
    }
}
