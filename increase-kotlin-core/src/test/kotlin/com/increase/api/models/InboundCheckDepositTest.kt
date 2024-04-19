// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositTest {

    @Test
    fun createInboundCheckDeposit() {
        val inboundCheckDeposit =
            InboundCheckDeposit.builder()
                .id("string")
                .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .accountId("string")
                .accountNumberId("string")
                .amount(123L)
                .backImageFileId("string")
                .bankOfFirstDepositRoutingNumber("string")
                .checkNumber("string")
                .checkTransferId("string")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(InboundCheckDeposit.Currency.CAD)
                .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .declinedTransactionId("string")
                .frontImageFileId("string")
                .status(InboundCheckDeposit.Status.PENDING)
                .transactionId("string")
                .type(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
                .build()
        assertThat(inboundCheckDeposit).isNotNull
        assertThat(inboundCheckDeposit.id()).isEqualTo("string")
        assertThat(inboundCheckDeposit.acceptedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.accountId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.accountNumberId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.amount()).isEqualTo(123L)
        assertThat(inboundCheckDeposit.backImageFileId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.bankOfFirstDepositRoutingNumber()).isEqualTo("string")
        assertThat(inboundCheckDeposit.checkNumber()).isEqualTo("string")
        assertThat(inboundCheckDeposit.checkTransferId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.currency()).isEqualTo(InboundCheckDeposit.Currency.CAD)
        assertThat(inboundCheckDeposit.declinedAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(inboundCheckDeposit.declinedTransactionId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.frontImageFileId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.status()).isEqualTo(InboundCheckDeposit.Status.PENDING)
        assertThat(inboundCheckDeposit.transactionId()).isEqualTo("string")
        assertThat(inboundCheckDeposit.type())
            .isEqualTo(InboundCheckDeposit.Type.INBOUND_CHECK_DEPOSIT)
    }
}
