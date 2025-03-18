// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checkdeposits

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckDepositRetrieveParamsTest {

    @Test
    fun create() {
        CheckDepositRetrieveParams.builder()
            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            CheckDepositRetrieveParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("check_deposit_f06n9gpg7sxn8t19lfc1")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
