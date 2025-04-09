// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.accountstatements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.increase.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountStatementListPageResponseTest {

    @Test
    fun create() {
        val accountStatementListPageResponse =
            AccountStatementListPageResponse.builder()
                .addData(
                    AccountStatement.builder()
                        .id("account_statement_lkc03a4skm2k7f38vj15")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .endingBalance(100L)
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .startingBalance(0L)
                        .statementPeriodEnd(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .statementPeriodStart(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        assertThat(accountStatementListPageResponse.data())
            .containsExactly(
                AccountStatement.builder()
                    .id("account_statement_lkc03a4skm2k7f38vj15")
                    .accountId("account_in71c4amph0vgo2qllky")
                    .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .endingBalance(100L)
                    .fileId("file_makxrc67oh9l6sg7w9yc")
                    .startingBalance(0L)
                    .statementPeriodEnd(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .statementPeriodStart(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                    .build()
            )
        assertThat(accountStatementListPageResponse.nextCursor()).isEqualTo("v57w5d")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accountStatementListPageResponse =
            AccountStatementListPageResponse.builder()
                .addData(
                    AccountStatement.builder()
                        .id("account_statement_lkc03a4skm2k7f38vj15")
                        .accountId("account_in71c4amph0vgo2qllky")
                        .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .endingBalance(100L)
                        .fileId("file_makxrc67oh9l6sg7w9yc")
                        .startingBalance(0L)
                        .statementPeriodEnd(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .statementPeriodStart(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .type(AccountStatement.Type.ACCOUNT_STATEMENT)
                        .build()
                )
                .nextCursor("v57w5d")
                .build()

        val roundtrippedAccountStatementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accountStatementListPageResponse),
                jacksonTypeRef<AccountStatementListPageResponse>(),
            )

        assertThat(roundtrippedAccountStatementListPageResponse)
            .isEqualTo(accountStatementListPageResponse)
    }
}
