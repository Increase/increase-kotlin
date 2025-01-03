// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationDigitalWalletTokenRequestCreateParamsTest {

    @Test
    fun createSimulationDigitalWalletTokenRequestCreateParams() {
        SimulationDigitalWalletTokenRequestCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationDigitalWalletTokenRequestCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
