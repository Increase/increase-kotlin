// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.JsonValue
import com.increase.api.models.*
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class ExportCreateParamsTest {

    @Test
    fun createExportCreateParams() {
        ExportCreateParams.builder()
            .category(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
            .accountStatementOfx(
                ExportCreateParams.AccountStatementOfx.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.AccountStatementOfx.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .balanceCsv(
                ExportCreateParams.BalanceCsv.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.BalanceCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .bookkeepingAccountBalanceCsv(
                ExportCreateParams.BookkeepingAccountBalanceCsv.builder()
                    .bookkeepingAccountId("bookkeeping_account_id")
                    .createdAt(
                        ExportCreateParams.BookkeepingAccountBalanceCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .entityCsv(
                ExportCreateParams.EntityCsv.builder()
                    .status(
                        ExportCreateParams.EntityCsv.Status.builder()
                            .in_(listOf(ExportCreateParams.EntityCsv.Status.In.ACTIVE))
                            .build()
                    )
                    .build()
            )
            .transactionCsv(
                ExportCreateParams.TransactionCsv.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.TransactionCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
            .vendorCsv(JsonValue.from(mapOf<String, Any>()))
            .build()
    }

    @Test
    fun getBody() {
        val params =
            ExportCreateParams.builder()
                .category(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
                .accountStatementOfx(
                    ExportCreateParams.AccountStatementOfx.builder()
                        .accountId("account_id")
                        .createdAt(
                            ExportCreateParams.AccountStatementOfx.CreatedAt.builder()
                                .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .balanceCsv(
                    ExportCreateParams.BalanceCsv.builder()
                        .accountId("account_id")
                        .createdAt(
                            ExportCreateParams.BalanceCsv.CreatedAt.builder()
                                .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .bookkeepingAccountBalanceCsv(
                    ExportCreateParams.BookkeepingAccountBalanceCsv.builder()
                        .bookkeepingAccountId("bookkeeping_account_id")
                        .createdAt(
                            ExportCreateParams.BookkeepingAccountBalanceCsv.CreatedAt.builder()
                                .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .entityCsv(
                    ExportCreateParams.EntityCsv.builder()
                        .status(
                            ExportCreateParams.EntityCsv.Status.builder()
                                .in_(listOf(ExportCreateParams.EntityCsv.Status.In.ACTIVE))
                                .build()
                        )
                        .build()
                )
                .transactionCsv(
                    ExportCreateParams.TransactionCsv.builder()
                        .accountId("account_id")
                        .createdAt(
                            ExportCreateParams.TransactionCsv.CreatedAt.builder()
                                .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                                .build()
                        )
                        .build()
                )
                .vendorCsv(JsonValue.from(mapOf<String, Any>()))
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
        assertThat(body.accountStatementOfx())
            .isEqualTo(
                ExportCreateParams.AccountStatementOfx.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.AccountStatementOfx.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.balanceCsv())
            .isEqualTo(
                ExportCreateParams.BalanceCsv.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.BalanceCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.bookkeepingAccountBalanceCsv())
            .isEqualTo(
                ExportCreateParams.BookkeepingAccountBalanceCsv.builder()
                    .bookkeepingAccountId("bookkeeping_account_id")
                    .createdAt(
                        ExportCreateParams.BookkeepingAccountBalanceCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.entityCsv())
            .isEqualTo(
                ExportCreateParams.EntityCsv.builder()
                    .status(
                        ExportCreateParams.EntityCsv.Status.builder()
                            .in_(listOf(ExportCreateParams.EntityCsv.Status.In.ACTIVE))
                            .build()
                    )
                    .build()
            )
        assertThat(body.transactionCsv())
            .isEqualTo(
                ExportCreateParams.TransactionCsv.builder()
                    .accountId("account_id")
                    .createdAt(
                        ExportCreateParams.TransactionCsv.CreatedAt.builder()
                            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                            .build()
                    )
                    .build()
            )
        assertThat(body.vendorCsv()).isEqualTo(JsonValue.from(mapOf<String, Any>()))
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            ExportCreateParams.builder()
                .category(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.category()).isEqualTo(ExportCreateParams.Category.ACCOUNT_STATEMENT_OFX)
    }
}
