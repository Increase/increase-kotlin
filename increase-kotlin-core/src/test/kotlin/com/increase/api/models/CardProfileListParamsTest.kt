package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardProfileListParamsTest {

    @Test
    fun createCardProfileListParams() {
        CardProfileListParams.builder()
            .cursor("string")
            .limit(123L)
            .status(
                CardProfileListParams.Status.builder()
                    .in_(listOf(CardProfileListParams.Status.In.PENDING))
                    .build()
            )
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            CardProfileListParams.builder()
                .cursor("string")
                .limit(123L)
                .status(
                    CardProfileListParams.Status.builder()
                        .in_(listOf(CardProfileListParams.Status.In.PENDING))
                        .build()
                )
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        CardProfileListParams.Status.builder()
            .in_(listOf(CardProfileListParams.Status.In.PENDING))
            .build()
            .forEachQueryParam { key, values -> expected.put("status.$key", values) }
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = CardProfileListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
