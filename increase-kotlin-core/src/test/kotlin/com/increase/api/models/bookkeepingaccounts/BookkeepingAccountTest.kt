// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingaccounts

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingAccountTest {

    @Test
    fun create() {
        val bookkeepingAccount =
            BookkeepingAccount.builder()
                .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                .accountId(null)
                .complianceCategory(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .name("John Doe Balance")
                .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                .build()

        assertThat(bookkeepingAccount.id()).isEqualTo("bookkeeping_account_e37p1f1iuocw5intf35v")
        assertThat(bookkeepingAccount.accountId()).isNull()
        assertThat(bookkeepingAccount.complianceCategory())
            .isEqualTo(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
        assertThat(bookkeepingAccount.entityId()).isEqualTo("entity_n8y8tnk2p9339ti393yi")
        assertThat(bookkeepingAccount.idempotencyKey()).isNull()
        assertThat(bookkeepingAccount.name()).isEqualTo("John Doe Balance")
        assertThat(bookkeepingAccount.type()).isEqualTo(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingAccount =
            BookkeepingAccount.builder()
                .id("bookkeeping_account_e37p1f1iuocw5intf35v")
                .accountId(null)
                .complianceCategory(BookkeepingAccount.ComplianceCategory.CUSTOMER_BALANCE)
                .entityId("entity_n8y8tnk2p9339ti393yi")
                .idempotencyKey(null)
                .name("John Doe Balance")
                .type(BookkeepingAccount.Type.BOOKKEEPING_ACCOUNT)
                .build()

        val roundtrippedBookkeepingAccount =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingAccount),
                jacksonTypeRef<BookkeepingAccount>(),
            )

        assertThat(roundtrippedBookkeepingAccount).isEqualTo(bookkeepingAccount)
    }
}
