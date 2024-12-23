// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class EventSubscriptionListParamsTest {

    @Test
    fun createEventSubscriptionListParams() {
        EventSubscriptionListParams.builder().cursor("cursor").idempotencyKey("x").limit(1L).build()
    }

    @Test
    fun getQueryParams() {
        val params =
            EventSubscriptionListParams.builder()
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
        val params = EventSubscriptionListParams.builder().build()
        val expected = QueryParams.builder()
        assertThat(params.getQueryParams()).isEqualTo(expected.build())
    }
}
