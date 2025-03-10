// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardRefundCreateParamsTest {

    @Test
    fun create() {
        SimulationCardRefundCreateParams.builder()
            .transactionId("transaction_uyrp7fld2ium70oa7oi")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationCardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationCardRefundCreateParams.builder()
                .transactionId("transaction_uyrp7fld2ium70oa7oi")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.transactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
    }
}
