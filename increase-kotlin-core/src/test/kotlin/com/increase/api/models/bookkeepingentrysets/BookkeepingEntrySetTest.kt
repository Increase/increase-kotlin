// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.bookkeepingentrysets

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BookkeepingEntrySetTest {

    @Test
    fun create() {
        val bookkeepingEntrySet =
            BookkeepingEntrySet.builder()
                .id("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                .createdAt(OffsetDateTime.parse("2023-02-11T02:11:59Z"))
                .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .addEntry(
                    BookkeepingEntrySet.Entry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(1750L)
                        .build()
                )
                .addEntry(
                    BookkeepingEntrySet.Entry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(-1750L)
                        .build()
                )
                .idempotencyKey(null)
                .transactionId(null)
                .type(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
                .build()

        assertThat(bookkeepingEntrySet.id()).isEqualTo("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
        assertThat(bookkeepingEntrySet.createdAt())
            .isEqualTo(OffsetDateTime.parse("2023-02-11T02:11:59Z"))
        assertThat(bookkeepingEntrySet.date())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(bookkeepingEntrySet.entries())
            .containsExactly(
                BookkeepingEntrySet.Entry.builder()
                    .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                    .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .amount(1750L)
                    .build(),
                BookkeepingEntrySet.Entry.builder()
                    .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                    .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                    .amount(-1750L)
                    .build(),
            )
        assertThat(bookkeepingEntrySet.idempotencyKey()).isNull()
        assertThat(bookkeepingEntrySet.transactionId()).isNull()
        assertThat(bookkeepingEntrySet.type())
            .isEqualTo(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val bookkeepingEntrySet =
            BookkeepingEntrySet.builder()
                .id("bookkeeping_entry_set_n80c6wr2p8gtc6p4ingf")
                .createdAt(OffsetDateTime.parse("2023-02-11T02:11:59Z"))
                .date(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .addEntry(
                    BookkeepingEntrySet.Entry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(1750L)
                        .build()
                )
                .addEntry(
                    BookkeepingEntrySet.Entry.builder()
                        .id("bookkeeping_entry_ctjpajsj3ks2blx10375")
                        .accountId("bookkeeping_account_e37p1f1iuocw5intf35v")
                        .amount(-1750L)
                        .build()
                )
                .idempotencyKey(null)
                .transactionId(null)
                .type(BookkeepingEntrySet.Type.BOOKKEEPING_ENTRY_SET)
                .build()

        val roundtrippedBookkeepingEntrySet =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(bookkeepingEntrySet),
                jacksonTypeRef<BookkeepingEntrySet>(),
            )

        assertThat(roundtrippedBookkeepingEntrySet).isEqualTo(bookkeepingEntrySet)
    }
}
