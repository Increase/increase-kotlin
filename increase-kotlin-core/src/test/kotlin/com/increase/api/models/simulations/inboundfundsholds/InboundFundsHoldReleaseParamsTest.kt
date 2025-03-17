// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundfundsholds

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundFundsHoldReleaseParamsTest {

    @Test
    fun create() {
        InboundFundsHoldReleaseParams.builder()
            .inboundFundsHoldId("inbound_funds_hold_9vuasmywdo7xb3zt4071")
            .build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundFundsHoldReleaseParams.builder()
                .inboundFundsHoldId("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                .build()
        assertThat(params).isNotNull
        // path param "inboundFundsHoldId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_funds_hold_9vuasmywdo7xb3zt4071")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
