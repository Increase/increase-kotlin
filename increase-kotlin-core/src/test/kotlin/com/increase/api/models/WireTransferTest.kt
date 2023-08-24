package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireTransferTest {

    @Test
    fun createWireTransfer() {
        val wireTransfer =
            WireTransfer.builder()
                .id("string")
                .accountId("string")
                .accountNumber("string")
                .amount(123L)
                .approval(
                    WireTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("string")
                        .build()
                )
                .beneficiaryAddressLine1("string")
                .beneficiaryAddressLine2("string")
                .beneficiaryAddressLine3("string")
                .beneficiaryName("string")
                .cancellation(
                    WireTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(WireTransfer.Currency.CAD)
                .externalAccountId("string")
                .messageToRecipient("string")
                .network(WireTransfer.Network.WIRE)
                .pendingTransactionId("string")
                .reversal(
                    WireTransfer.Reversal.builder()
                        .amount(123L)
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .description("string")
                        .financialInstitutionToFinancialInstitutionInformation("string")
                        .inputCycleDate(LocalDate.parse("2019-12-27"))
                        .inputMessageAccountabilityData("string")
                        .inputSequenceNumber("string")
                        .inputSource("string")
                        .previousMessageInputCycleDate(LocalDate.parse("2019-12-27"))
                        .previousMessageInputMessageAccountabilityData("string")
                        .previousMessageInputSequenceNumber("string")
                        .previousMessageInputSource("string")
                        .receiverFinancialInstitutionInformation("string")
                        .transactionId("string")
                        .wireTransferId("string")
                        .build()
                )
                .routingNumber("string")
                .status(WireTransfer.Status.CANCELED)
                .submission(
                    WireTransfer.Submission.builder()
                        .inputMessageAccountabilityData("string")
                        .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .transactionId("string")
                .type(WireTransfer.Type.WIRE_TRANSFER)
                .uniqueIdentifier("string")
                .build()
        assertThat(wireTransfer).isNotNull
        assertThat(wireTransfer.id()).isEqualTo("string")
        assertThat(wireTransfer.accountId()).isEqualTo("string")
        assertThat(wireTransfer.accountNumber()).isEqualTo("string")
        assertThat(wireTransfer.amount()).isEqualTo(123L)
        assertThat(wireTransfer.approval())
            .isEqualTo(
                WireTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("string")
                    .build()
            )
        assertThat(wireTransfer.beneficiaryAddressLine1()).isEqualTo("string")
        assertThat(wireTransfer.beneficiaryAddressLine2()).isEqualTo("string")
        assertThat(wireTransfer.beneficiaryAddressLine3()).isEqualTo("string")
        assertThat(wireTransfer.beneficiaryName()).isEqualTo("string")
        assertThat(wireTransfer.cancellation())
            .isEqualTo(
                WireTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("string")
                    .build()
            )
        assertThat(wireTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(wireTransfer.currency()).isEqualTo(WireTransfer.Currency.CAD)
        assertThat(wireTransfer.externalAccountId()).isEqualTo("string")
        assertThat(wireTransfer.messageToRecipient()).isEqualTo("string")
        assertThat(wireTransfer.network()).isEqualTo(WireTransfer.Network.WIRE)
        assertThat(wireTransfer.pendingTransactionId()).isEqualTo("string")
        assertThat(wireTransfer.reversal())
            .isEqualTo(
                WireTransfer.Reversal.builder()
                    .amount(123L)
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .description("string")
                    .financialInstitutionToFinancialInstitutionInformation("string")
                    .inputCycleDate(LocalDate.parse("2019-12-27"))
                    .inputMessageAccountabilityData("string")
                    .inputSequenceNumber("string")
                    .inputSource("string")
                    .previousMessageInputCycleDate(LocalDate.parse("2019-12-27"))
                    .previousMessageInputMessageAccountabilityData("string")
                    .previousMessageInputSequenceNumber("string")
                    .previousMessageInputSource("string")
                    .receiverFinancialInstitutionInformation("string")
                    .transactionId("string")
                    .wireTransferId("string")
                    .build()
            )
        assertThat(wireTransfer.routingNumber()).isEqualTo("string")
        assertThat(wireTransfer.status()).isEqualTo(WireTransfer.Status.CANCELED)
        assertThat(wireTransfer.submission())
            .isEqualTo(
                WireTransfer.Submission.builder()
                    .inputMessageAccountabilityData("string")
                    .submittedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(wireTransfer.transactionId()).isEqualTo("string")
        assertThat(wireTransfer.type()).isEqualTo(WireTransfer.Type.WIRE_TRANSFER)
        assertThat(wireTransfer.uniqueIdentifier()).isEqualTo("string")
    }
}
