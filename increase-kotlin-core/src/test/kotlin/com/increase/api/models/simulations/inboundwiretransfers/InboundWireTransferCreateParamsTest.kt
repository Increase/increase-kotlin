// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferCreateParamsTest {

    @Test
    fun create() {
        InboundWireTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .beneficiaryAddressLine1("x")
            .beneficiaryAddressLine2("x")
            .beneficiaryAddressLine3("x")
            .beneficiaryName("x")
            .beneficiaryReference("x")
            .originatorAddressLine1("x")
            .originatorAddressLine2("x")
            .originatorAddressLine3("x")
            .originatorName("x")
            .originatorRoutingNumber("x")
            .originatorToBeneficiaryInformationLine1("x")
            .originatorToBeneficiaryInformationLine2("x")
            .originatorToBeneficiaryInformationLine3("x")
            .originatorToBeneficiaryInformationLine4("x")
            .senderReference("x")
            .wireDrawdownRequestId("wire_drawdown_request_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .beneficiaryAddressLine1("x")
                .beneficiaryAddressLine2("x")
                .beneficiaryAddressLine3("x")
                .beneficiaryName("x")
                .beneficiaryReference("x")
                .originatorAddressLine1("x")
                .originatorAddressLine2("x")
                .originatorAddressLine3("x")
                .originatorName("x")
                .originatorRoutingNumber("x")
                .originatorToBeneficiaryInformationLine1("x")
                .originatorToBeneficiaryInformationLine2("x")
                .originatorToBeneficiaryInformationLine3("x")
                .originatorToBeneficiaryInformationLine4("x")
                .senderReference("x")
                .wireDrawdownRequestId("wire_drawdown_request_id")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.beneficiaryAddressLine1()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine2()).isEqualTo("x")
        assertThat(body.beneficiaryAddressLine3()).isEqualTo("x")
        assertThat(body.beneficiaryName()).isEqualTo("x")
        assertThat(body.beneficiaryReference()).isEqualTo("x")
        assertThat(body.originatorAddressLine1()).isEqualTo("x")
        assertThat(body.originatorAddressLine2()).isEqualTo("x")
        assertThat(body.originatorAddressLine3()).isEqualTo("x")
        assertThat(body.originatorName()).isEqualTo("x")
        assertThat(body.originatorRoutingNumber()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine1()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine2()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine3()).isEqualTo("x")
        assertThat(body.originatorToBeneficiaryInformationLine4()).isEqualTo("x")
        assertThat(body.senderReference()).isEqualTo("x")
        assertThat(body.wireDrawdownRequestId()).isEqualTo("wire_drawdown_request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
