// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BookkeepingAccountListParamsTest {

    @Test
    fun createBookkeepingAccountListParams() {
        BookkeepingAccountListParams.builder()
            .cursor("cursor")
            .idempotencyKey("x")
            .limit(1L)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            BookkeepingAccountListParams.builder()
                .cursor("cursor")
                .idempotencyKey("x")
                .limit(1L)
                .build()
        val expected = QueryParams.builder()
        expected.put("cursor", "cursor")
        expected.put("idempotency_key", "x")
        expected.put("limit", "1")
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = BookkeepingAccountListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
