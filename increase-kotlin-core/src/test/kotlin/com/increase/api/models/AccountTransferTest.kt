package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTransferTest {

    @Test
    fun createAccountTransfer() {
        val accountTransfer =
            AccountTransfer.builder()
                .id("string")
                .accountId("string")
                .amount(123L)
                .approval(
                    AccountTransfer.Approval.builder()
                        .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .approvedBy("string")
                        .build()
                )
                .cancellation(
                    AccountTransfer.Cancellation.builder()
                        .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .canceledBy("string")
                        .build()
                )
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(AccountTransfer.Currency.CAD)
                .description("string")
                .destinationAccountId("string")
                .destinationTransactionId("string")
                .network(AccountTransfer.Network.ACCOUNT)
                .status(AccountTransfer.Status.PENDING_APPROVAL)
                .transactionId("string")
                .type(AccountTransfer.Type.ACCOUNT_TRANSFER)
                .uniqueIdentifier("string")
                .build()
        assertThat(accountTransfer).isNotNull
        assertThat(accountTransfer.id()).isEqualTo("string")
        assertThat(accountTransfer.amount()).isEqualTo(123L)
        assertThat(accountTransfer.accountId()).isEqualTo("string")
        assertThat(accountTransfer.currency()).isEqualTo(AccountTransfer.Currency.CAD)
        assertThat(accountTransfer.destinationAccountId()).isEqualTo("string")
        assertThat(accountTransfer.destinationTransactionId()).isEqualTo("string")
        assertThat(accountTransfer.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accountTransfer.description()).isEqualTo("string")
        assertThat(accountTransfer.network()).isEqualTo(AccountTransfer.Network.ACCOUNT)
        assertThat(accountTransfer.status()).isEqualTo(AccountTransfer.Status.PENDING_APPROVAL)
        assertThat(accountTransfer.transactionId()).isEqualTo("string")
        assertThat(accountTransfer.approval())
            .isEqualTo(
                AccountTransfer.Approval.builder()
                    .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .approvedBy("string")
                    .build()
            )
        assertThat(accountTransfer.cancellation())
            .isEqualTo(
                AccountTransfer.Cancellation.builder()
                    .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .canceledBy("string")
                    .build()
            )
        assertThat(accountTransfer.uniqueIdentifier()).isEqualTo("string")
        assertThat(accountTransfer.type()).isEqualTo(AccountTransfer.Type.ACCOUNT_TRANSFER)
    }
}
