package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountListParamsTest {

    @Test
    fun createAccountListParams() {
        AccountListParams.builder()
            .cursor("string")
            .limit(123L)
            .entityId("string")
            .status(AccountListParams.Status.OPEN)
            .build()
    }

    @Test
    fun getQueryParams() {
        val params =
            AccountListParams.builder()
                .cursor("string")
                .limit(123L)
                .entityId("string")
                .status(AccountListParams.Status.OPEN)
                .build()
        val expected = mutableMapOf<String, List<String>>()
        expected.put("cursor", listOf("string"))
        expected.put("limit", listOf("123"))
        expected.put("entity_id", listOf("string"))
        expected.put("status", listOf(AccountListParams.Status.OPEN.toString()))
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }

    @Test
    fun getQueryParamsWithoutOptionalFields() {
        val params = AccountListParams.builder().build()
        val expected = mutableMapOf<String, List<String>>()
        assertThat(params.getQueryParams()).isEqualTo(expected)
    }
}
