// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardReversalCreateParamsTest {

    @Test
    fun createSimulationCardReversalCreateParams() {
        SimulationCardReversalCreateParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .amount(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardReversalCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .amount(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(body.amount()).isEqualTo(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardReversalCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
