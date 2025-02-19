// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardIncrementCreateParamsTest {

    @Test
    fun create() {
        SimulationCardIncrementCreateParams.builder()
            .amount(500L)
            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
            .eventSubscriptionId("event_subscription_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationCardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .eventSubscriptionId("event_subscription_id")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
        assertThat(body.eventSubscriptionId()).isEqualTo("event_subscription_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            SimulationCardIncrementCreateParams.builder()
                .amount(500L)
                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                .build()

        val body = params._body()

        assertThat(body).isNotNull
        assertThat(body.amount()).isEqualTo(500L)
        assertThat(body.cardPaymentId()).isEqualTo("card_payment_nd3k2kacrqjli8482ave")
    }
}
