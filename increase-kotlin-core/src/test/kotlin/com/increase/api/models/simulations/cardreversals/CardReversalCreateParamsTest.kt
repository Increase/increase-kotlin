// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardreversals

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardReversalCreateParamsTest {

    @Test
    fun create() {
        CardReversalCreateParams.builder()
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .amount(1L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardReversalCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .amount(1L)
                .build()

        val body = params._body()

        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(body.amount()).isEqualTo(1L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CardReversalCreateParams.builder()
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
