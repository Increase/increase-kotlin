// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.models.*
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundCheckDepositRetrieveParamsTest {

    @Test
    fun createInboundCheckDepositRetrieveParams() {
        InboundCheckDepositRetrieveParams.builder().inboundCheckDepositId("string").build()
    }

    @Test
    fun getPathParam() {
        val params =
            InboundCheckDepositRetrieveParams.builder().inboundCheckDepositId("string").build()
        assertThat(params).isNotNull
        // path param "inboundCheckDepositId"
        assertThat(params.getPathParam(0)).isEqualTo("string")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
