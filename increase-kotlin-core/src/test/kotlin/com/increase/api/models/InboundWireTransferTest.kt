// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferTest {

    @Test
    fun createInboundWireTransfer() {
        val inboundWireTransfer =
            InboundWireTransfer.builder()
                .id("string")
                .accountId("string")
                .accountNumberId("string")
                .amount(123L)
                .beneficiaryAddressLine1("string")
                .beneficiaryAddressLine2("string")
                .beneficiaryAddressLine3("string")
                .beneficiaryName("string")
                .beneficiaryReference("string")
                .description("string")
                .inputMessageAccountabilityData("string")
                .originatorAddressLine1("string")
                .originatorAddressLine2("string")
                .originatorAddressLine3("string")
                .originatorName("string")
                .originatorRoutingNumber("string")
                .originatorToBeneficiaryInformation("string")
                .originatorToBeneficiaryInformationLine1("string")
                .originatorToBeneficiaryInformationLine2("string")
                .originatorToBeneficiaryInformationLine3("string")
                .originatorToBeneficiaryInformationLine4("string")
                .status(InboundWireTransfer.Status.PENDING)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()
        assertThat(inboundWireTransfer).isNotNull
        assertThat(inboundWireTransfer.id()).isEqualTo("string")
        assertThat(inboundWireTransfer.accountId()).isEqualTo("string")
        assertThat(inboundWireTransfer.accountNumberId()).isEqualTo("string")
        assertThat(inboundWireTransfer.amount()).isEqualTo(123L)
        assertThat(inboundWireTransfer.beneficiaryAddressLine1()).isEqualTo("string")
        assertThat(inboundWireTransfer.beneficiaryAddressLine2()).isEqualTo("string")
        assertThat(inboundWireTransfer.beneficiaryAddressLine3()).isEqualTo("string")
        assertThat(inboundWireTransfer.beneficiaryName()).isEqualTo("string")
        assertThat(inboundWireTransfer.beneficiaryReference()).isEqualTo("string")
        assertThat(inboundWireTransfer.description()).isEqualTo("string")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorAddressLine1()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorAddressLine2()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorAddressLine3()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorName()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorRoutingNumber()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformation()).isEqualTo("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine1())
            .isEqualTo("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine2())
            .isEqualTo("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine3())
            .isEqualTo("string")
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine4())
            .isEqualTo("string")
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.PENDING)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }
}
