// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DeclinedTransactionListParamsTest {

    @Test
    fun create() {
        DeclinedTransactionListParams.builder()
            .accountId("account_id")
            .category(
                DeclinedTransactionListParams.Category.builder()
                    .addIn(DeclinedTransactionListParams.Category.In.ACH_DECLINE)
                    .build()
            )
            .createdAt(
                DeclinedTransactionListParams.CreatedAt.builder()
                    .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
            .cursor("cursor")
            .limit(1L)
            .routeId("route_id")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DeclinedTransactionListParams.builder()
                .accountId("account_id")
                .category(
                    DeclinedTransactionListParams.Category.builder()
                        .addIn(DeclinedTransactionListParams.Category.In.ACH_DECLINE)
                        .build()
                )
                .createdAt(
                    DeclinedTransactionListParams.CreatedAt.builder()
                        .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .cursor("cursor")
                .limit(1L)
                .routeId("route_id")
                .build()
        val expected = QueryParams.builder()
        expected.put("account_id", "account_id")
        DeclinedTransactionListParams.Category.builder()
            .addIn(DeclinedTransactionListParams.Category.In.ACH_DECLINE)
            .build()
            .forEachQueryParam { key, values -> expected.put("category.$key", values) }
        DeclinedTransactionListParams.CreatedAt.builder()
            .after(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .before(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrAfter(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .onOrBefore(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .build()
            .forEachQueryParam { key, values -> expected.put("created_at.$key", values) }
        expected.put("cursor", "cursor")
        expected.put("limit", "1")
        expected.put("route_id", "route_id")
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DeclinedTransactionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params._queryParams()).isEqualTo(expected.build())
    }
}
