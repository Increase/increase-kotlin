// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCheckDepositSubmitParamsTest {

    @Test
    fun create() {
        SimulationCheckDepositSubmitParams.builder()
            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            SimulationCheckDepositSubmitParams.builder()
                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                .build()
        assertThat(params).isNotNull
        // path param "checkDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("check_deposit_f06n9gpg7sxn8t19lfc1")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
