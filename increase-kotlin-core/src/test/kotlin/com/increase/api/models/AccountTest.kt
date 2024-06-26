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
                .id("string")
                .bank(Account.Bank.BLUE_RIDGE_BANK)
                .closedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .currency(Account.Currency.CAD)
                .entityId("string")
                .idempotencyKey("string")
                .informationalEntityId("string")
                .interestAccrued("string")
                .interestAccruedAt(LocalDate.parse("2019-12-27"))
                .interestRate("string")
                .name("string")
                .programId("string")
                .status(Account.Status.OPEN)
                .type(Account.Type.ACCOUNT)
                .build()
        assertThat(account).isNotNull
        assertThat(account.id()).isEqualTo("string")
        assertThat(account.bank()).isEqualTo(Account.Bank.BLUE_RIDGE_BANK)
        assertThat(account.closedAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.createdAt()).isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(account.currency()).isEqualTo(Account.Currency.CAD)
        assertThat(account.entityId()).isEqualTo("string")
        assertThat(account.idempotencyKey()).isEqualTo("string")
        assertThat(account.informationalEntityId()).isEqualTo("string")
        assertThat(account.interestAccrued()).isEqualTo("string")
        assertThat(account.interestAccruedAt()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(account.interestRate()).isEqualTo("string")
        assertThat(account.name()).isEqualTo("string")
        assertThat(account.programId()).isEqualTo("string")
        assertThat(account.status()).isEqualTo(Account.Status.OPEN)
        assertThat(account.type()).isEqualTo(Account.Type.ACCOUNT)
    }
}
