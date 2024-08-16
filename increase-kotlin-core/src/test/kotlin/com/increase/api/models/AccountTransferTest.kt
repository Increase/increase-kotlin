// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.AccountTransfer

class AccountTransferTest {

    @Test
    fun createAccountTransfer() {
      val accountTransfer = AccountTransfer.builder()
          .id("id")
          .accountId("account_id")
          .amount(123L)
          .approval(AccountTransfer.Approval.builder()
              .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .approvedBy("approved_by")
              .build())
          .cancellation(AccountTransfer.Cancellation.builder()
              .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
              .canceledBy("canceled_by")
              .build())
          .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .createdBy(AccountTransfer.CreatedBy.builder()
              .apiKey(AccountTransfer.CreatedBy.ApiKey.builder()
                  .description("description")
                  .build())
              .category(AccountTransfer.CreatedBy.Category.API_KEY)
              .oauthApplication(AccountTransfer.CreatedBy.OAuthApplication.builder()
                  .name("name")
                  .build())
              .user(AccountTransfer.CreatedBy.User.builder()
                  .email("email")
                  .build())
              .build())
          .currency(AccountTransfer.Currency.CAD)
          .description("description")
          .destinationAccountId("destination_account_id")
          .destinationTransactionId("destination_transaction_id")
          .idempotencyKey("idempotency_key")
          .network(AccountTransfer.Network.ACCOUNT)
          .pendingTransactionId("pending_transaction_id")
          .status(AccountTransfer.Status.PENDING_APPROVAL)
          .transactionId("transaction_id")
          .type(AccountTransfer.Type.ACCOUNT_TRANSFER)
          .build()
      assertThat(accountTransfer).isNotNull
      assertThat(accountTransfer.id()).isEqualTo("id")
      assertThat(accountTransfer.accountId()).isEqualTo("account_id")
      assertThat(accountTransfer.amount()).isEqualTo(123L)
      assertThat(accountTransfer.approval()).isEqualTo(AccountTransfer.Approval.builder()
          .approvedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .approvedBy("approved_by")
          .build())
      assertThat(accountTransfer.cancellation()).isEqualTo(AccountTransfer.Cancellation.builder()
          .canceledAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
          .canceledBy("canceled_by")
          .build())
      assertThat(accountTransfer.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
      assertThat(accountTransfer.createdBy()).isEqualTo(AccountTransfer.CreatedBy.builder()
          .apiKey(AccountTransfer.CreatedBy.ApiKey.builder()
              .description("description")
              .build())
          .category(AccountTransfer.CreatedBy.Category.API_KEY)
          .oauthApplication(AccountTransfer.CreatedBy.OAuthApplication.builder()
              .name("name")
              .build())
          .user(AccountTransfer.CreatedBy.User.builder()
              .email("email")
              .build())
          .build())
      assertThat(accountTransfer.currency()).isEqualTo(AccountTransfer.Currency.CAD)
      assertThat(accountTransfer.description()).isEqualTo("description")
      assertThat(accountTransfer.destinationAccountId()).isEqualTo("destination_account_id")
      assertThat(accountTransfer.destinationTransactionId()).isEqualTo("destination_transaction_id")
      assertThat(accountTransfer.idempotencyKey()).isEqualTo("idempotency_key")
      assertThat(accountTransfer.network()).isEqualTo(AccountTransfer.Network.ACCOUNT)
      assertThat(accountTransfer.pendingTransactionId()).isEqualTo("pending_transaction_id")
      assertThat(accountTransfer.status()).isEqualTo(AccountTransfer.Status.PENDING_APPROVAL)
      assertThat(accountTransfer.transactionId()).isEqualTo("transaction_id")
      assertThat(accountTransfer.type()).isEqualTo(AccountTransfer.Type.ACCOUNT_TRANSFER)
    }
}
