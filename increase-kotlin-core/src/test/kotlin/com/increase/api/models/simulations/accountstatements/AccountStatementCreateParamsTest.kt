// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.accountstatements

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccountStatementCreateParamsTest {

    @Test
    fun create() {
        AccountStatementCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()
    }

    @Test
    fun body() {
        val params =
            AccountStatementCreateParams.builder().accountId("account_in71c4amph0vgo2qllky").build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
    }
}
