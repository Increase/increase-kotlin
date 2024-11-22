// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountTest {

    @Test
    fun createAccount() {
        val account =
            Account.builder()
                .id("id")
                .bank(Account.Bank.BLUE_RIDGE_BANK)
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("entity_id")
                .idempotencyKey("idempotency_key")
                .informationalEntityId("informational_entity_id")
                .interestAccrued("interest_accrued")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .interestRate("interest_rate")
                .name("name")
                .programId("program_id")
                .status(Account.Status.CLOSED)
                .type(Account.Type.ACCOUNT)
                .build()
        assertThat(account).isNotNull
        assertThat(account.id()).isEqualTo("id")
        assertThat(account.bank()).isEqualTo(Account.Bank.BLUE_RIDGE_BANK)
        assertThat(account.closedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.currency()).isEqualTo(Account.Currency.CAD)
        assertThat(account.entityId()).isEqualTo("entity_id")
        assertThat(account.idempotencyKey()).isEqualTo("idempotency_key")
        assertThat(account.informationalEntityId()).isEqualTo("informational_entity_id")
        assertThat(account.interestAccrued()).isEqualTo("interest_accrued")
        assertThat(account.interestAccruedAt()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(account.interestRate()).isEqualTo("interest_rate")
        assertThat(account.name()).isEqualTo("name")
        assertThat(account.programId()).isEqualTo("program_id")
        assertThat(account.status()).isEqualTo(Account.Status.CLOSED)
        assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }
}
