// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DigitalWalletTokenRequestCreateResponseTest {

    @Test
    fun createDigitalWalletTokenRequestCreateResponse() {
        val digitalWalletTokenRequestCreateResponse =
            DigitalWalletTokenRequestCreateResponse.builder()
                .declineReason(
                    DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE
                )
                .digitalWalletTokenId("string")
                .type(
                    DigitalWalletTokenRequestCreateResponse.Type
                        .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
                )
                .build()
        assertThat(digitalWalletTokenRequestCreateResponse).isNotNull
        assertThat(digitalWalletTokenRequestCreateResponse.declineReason())
            .isEqualTo(DigitalWalletTokenRequestCreateResponse.DeclineReason.CARD_NOT_ACTIVE)
        assertThat(digitalWalletTokenRequestCreateResponse.digitalWalletTokenId())
            .isEqualTo("string")
        assertThat(digitalWalletTokenRequestCreateResponse.type())
            .isEqualTo(
                DigitalWalletTokenRequestCreateResponse.Type
                    .INBOUND_DIGITAL_WALLET_TOKEN_REQUEST_SIMULATION_RESULT
            )
    }
}
