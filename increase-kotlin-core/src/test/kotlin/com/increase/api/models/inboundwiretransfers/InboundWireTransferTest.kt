// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundWireTransferTest {

    @Test
    fun createInboundWireTransfer() {
        val inboundWireTransfer =
            InboundWireTransfer.builder()
                .id("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(100L)
                .beneficiaryAddressLine1(null)
                .beneficiaryAddressLine2(null)
                .beneficiaryAddressLine3(null)
                .beneficiaryName(null)
                .beneficiaryReference(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .description("Inbound wire transfer")
                .inputMessageAccountabilityData(null)
                .originatorAddressLine1(null)
                .originatorAddressLine2(null)
                .originatorAddressLine3(null)
                .originatorName(null)
                .originatorRoutingNumber(null)
                .originatorToBeneficiaryInformation(null)
                .originatorToBeneficiaryInformationLine1(null)
                .originatorToBeneficiaryInformationLine2(null)
                .originatorToBeneficiaryInformationLine3(null)
                .originatorToBeneficiaryInformationLine4(null)
                .senderReference(null)
                .status(InboundWireTransfer.Status.PENDING)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()
        assertThat(inboundWireTransfer).isNotNull
        assertThat(inboundWireTransfer.id()).isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(inboundWireTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundWireTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundWireTransfer.amount()).isEqualTo(100L)
        assertThat(inboundWireTransfer.beneficiaryAddressLine1()).isNull()
        assertThat(inboundWireTransfer.beneficiaryAddressLine2()).isNull()
        assertThat(inboundWireTransfer.beneficiaryAddressLine3()).isNull()
        assertThat(inboundWireTransfer.beneficiaryName()).isNull()
        assertThat(inboundWireTransfer.beneficiaryReference()).isNull()
        assertThat(inboundWireTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundWireTransfer.description()).isEqualTo("Inbound wire transfer")
        assertThat(inboundWireTransfer.inputMessageAccountabilityData()).isNull()
        assertThat(inboundWireTransfer.originatorAddressLine1()).isNull()
        assertThat(inboundWireTransfer.originatorAddressLine2()).isNull()
        assertThat(inboundWireTransfer.originatorAddressLine3()).isNull()
        assertThat(inboundWireTransfer.originatorName()).isNull()
        assertThat(inboundWireTransfer.originatorRoutingNumber()).isNull()
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformation()).isNull()
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine1()).isNull()
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine2()).isNull()
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine3()).isNull()
        assertThat(inboundWireTransfer.originatorToBeneficiaryInformationLine4()).isNull()
        assertThat(inboundWireTransfer.senderReference()).isNull()
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.PENDING)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }
}
