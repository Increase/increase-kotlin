// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthentications

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthenticationCreateParamsTest {

    @Test
    fun create() {
        CardAuthenticationCreateParams.builder()
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .category(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
            .deviceChannel(CardAuthenticationCreateParams.DeviceChannel.APP)
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCountry("US")
            .merchantName("x")
            .purchaseAmount(1000L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardAuthenticationCreateParams.builder()
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .category(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
                .deviceChannel(CardAuthenticationCreateParams.DeviceChannel.APP)
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCountry("US")
                .merchantName("x")
                .purchaseAmount(1000L)
                .build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.category())
            .isEqualTo(CardAuthenticationCreateParams.Category.PAYMENT_AUTHENTICATION)
        assertThat(body.deviceChannel()).isEqualTo(CardAuthenticationCreateParams.DeviceChannel.APP)
        assertThat(body.merchantAcceptorId()).isEqualTo("5665270011000168")
        assertThat(body.merchantCategoryCode()).isEqualTo("5734")
        assertThat(body.merchantCountry()).isEqualTo("US")
        assertThat(body.merchantName()).isEqualTo("x")
        assertThat(body.purchaseAmount()).isEqualTo(1000L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardAuthenticationCreateParams.builder().cardId("card_oubs0hwk5rn6knuecxg2").build()

        val body = params._body()

        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
    }
}
