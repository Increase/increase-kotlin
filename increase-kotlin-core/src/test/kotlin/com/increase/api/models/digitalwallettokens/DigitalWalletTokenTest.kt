// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.digitalwallettokens

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DigitalWalletTokenTest {

    @Test
    fun create() {
        val digitalWalletToken =
            DigitalWalletToken.builder()
                .id("digital_wallet_token_izi62go3h51p369jrie0")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .status(DigitalWalletToken.Status.ACTIVE)
                .tokenRequestor(DigitalWalletToken.TokenRequestor.APPLE_PAY)
                .type(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
                .addUpdate(
                    DigitalWalletToken.Update.builder()
                        .status(DigitalWalletToken.Update.Status.ACTIVE)
                        .timestamp(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .build()
                )
                .build()

        assertThat(digitalWalletToken.id()).isEqualTo("digital_wallet_token_izi62go3h51p369jrie0")
        assertThat(digitalWalletToken.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(digitalWalletToken.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(digitalWalletToken.status()).isEqualTo(DigitalWalletToken.Status.ACTIVE)
        assertThat(digitalWalletToken.tokenRequestor())
            .isEqualTo(DigitalWalletToken.TokenRequestor.APPLE_PAY)
        assertThat(digitalWalletToken.type())
            .isEqualTo(DigitalWalletToken.Type.DIGITAL_WALLET_TOKEN)
        assertThat(digitalWalletToken.updates())
            .containsExactly(
                DigitalWalletToken.Update.builder()
                    .status(DigitalWalletToken.Update.Status.ACTIVE)
                    .timestamp(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .build()
            )
    }
}
