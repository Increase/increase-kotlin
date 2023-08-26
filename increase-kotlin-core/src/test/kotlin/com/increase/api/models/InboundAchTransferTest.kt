package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferTest {

    @Test
    fun createInboundAchTransfer() {
        val inboundAchTransfer =
            InboundAchTransfer.builder()
                .id("string")
                .acceptance(
                    InboundAchTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("string")
                        .build()
                )
                .amount(123L)
                .automaticallyResolvesAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .decline(
                    InboundAchTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("string")
                        .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                        .build()
                )
                .direction(InboundAchTransfer.Direction.CREDIT)
                .originatorCompanyDescriptiveDate("string")
                .originatorCompanyDiscretionaryData("string")
                .originatorCompanyEntryDescription("string")
                .originatorCompanyId("string")
                .originatorCompanyName("string")
                .receiverIdNumber("string")
                .receiverName("string")
                .status(InboundAchTransfer.Status.PENDING)
                .traceNumber("string")
                .transferReturn(
                    InboundAchTransfer.TransferReturn.builder()
                        .reason(
                            InboundAchTransfer.TransferReturn.Reason
                                .AUTHORIZATION_REVOKED_BY_CUSTOMER
                        )
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("string")
                        .build()
                )
                .type(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
                .build()
        assertThat(inboundAchTransfer).isNotNull
        assertThat(inboundAchTransfer.id()).isEqualTo("string")
        assertThat(inboundAchTransfer.acceptance())
            .isEqualTo(
                InboundAchTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("string")
                    .build()
            )
        assertThat(inboundAchTransfer.amount()).isEqualTo(123L)
        assertThat(inboundAchTransfer.automaticallyResolvesAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundAchTransfer.decline())
            .isEqualTo(
                InboundAchTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("string")
                    .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                    .build()
            )
        assertThat(inboundAchTransfer.direction()).isEqualTo(InboundAchTransfer.Direction.CREDIT)
        assertThat(inboundAchTransfer.originatorCompanyDescriptiveDate()).isEqualTo("string")
        assertThat(inboundAchTransfer.originatorCompanyDiscretionaryData()).isEqualTo("string")
        assertThat(inboundAchTransfer.originatorCompanyEntryDescription()).isEqualTo("string")
        assertThat(inboundAchTransfer.originatorCompanyId()).isEqualTo("string")
        assertThat(inboundAchTransfer.originatorCompanyName()).isEqualTo("string")
        assertThat(inboundAchTransfer.receiverIdNumber()).isEqualTo("string")
        assertThat(inboundAchTransfer.receiverName()).isEqualTo("string")
        assertThat(inboundAchTransfer.status()).isEqualTo(InboundAchTransfer.Status.PENDING)
        assertThat(inboundAchTransfer.traceNumber()).isEqualTo("string")
        assertThat(inboundAchTransfer.transferReturn())
            .isEqualTo(
                InboundAchTransfer.TransferReturn.builder()
                    .reason(
                        InboundAchTransfer.TransferReturn.Reason.AUTHORIZATION_REVOKED_BY_CUSTOMER
                    )
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("string")
                    .build()
            )
        assertThat(inboundAchTransfer.type())
            .isEqualTo(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
    }
}