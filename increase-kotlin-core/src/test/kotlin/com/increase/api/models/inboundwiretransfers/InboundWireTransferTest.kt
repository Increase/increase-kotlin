// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundwiretransfers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferTest {

    @Test
    fun create() {
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
                .reversal(
                    InboundWireTransfer.Reversal.builder()
                        .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                        .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .senderReference(null)
                .status(InboundWireTransfer.Status.ACCEPTED)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()

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
        assertThat(inboundWireTransfer.reversal())
            .isEqualTo(
                InboundWireTransfer.Reversal.builder()
                    .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                    .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(inboundWireTransfer.senderReference()).isNull()
        assertThat(inboundWireTransfer.status()).isEqualTo(InboundWireTransfer.Status.ACCEPTED)
        assertThat(inboundWireTransfer.type())
            .isEqualTo(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
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
                .reversal(
                    InboundWireTransfer.Reversal.builder()
                        .reason(InboundWireTransfer.Reversal.Reason.DUPLICATE)
                        .reversedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .senderReference(null)
                .status(InboundWireTransfer.Status.ACCEPTED)
                .type(InboundWireTransfer.Type.INBOUND_WIRE_TRANSFER)
                .build()

        val roundtrippedInboundWireTransfer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(inboundWireTransfer),
                jacksonTypeRef<InboundWireTransfer>(),
            )

        assertThat(roundtrippedInboundWireTransfer).isEqualTo(inboundWireTransfer)
    }
}
