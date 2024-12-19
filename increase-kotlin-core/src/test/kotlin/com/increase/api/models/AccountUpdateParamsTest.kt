// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AccountUpdateParamsTest {

    @Test
    fun createAccountUpdateParams() {
        AccountUpdateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .name("My renamed account")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            AccountUpdateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .name("My renamed account")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.name()).isEqualTo("My renamed account")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        val body = params.getBody()
        assertThat(body).isNotNull
    }

    @Test
    fun getPathParam() {
        val params = AccountUpdateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
        assertThat(params).isNotNull
        // path param "accountId"
        assertThat(params.getPathParam(0)).isEqualTo("account_in71c4amph0vgo2qllky")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
