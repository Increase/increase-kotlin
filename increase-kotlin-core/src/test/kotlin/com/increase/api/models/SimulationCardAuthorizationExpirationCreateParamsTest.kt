// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardAuthorizationExpirationCreateParamsTest {

    @Test
    fun createSimulationCardAuthorizationExpirationCreateParams() {
        SimulationCardAuthorizationExpirationCreateParams.builder()
            .cardPaymentId("card_payment_id")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardAuthorizationExpirationCreateParams.builder()
                .cardPaymentId("card_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardAuthorizationExpirationCreateParams.builder()
                .cardPaymentId("card_payment_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_id")
    }
}
