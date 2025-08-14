// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardtokens

import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardTokenCreateParamsTest {

    @Test
    fun create() {
        CardTokenCreateParams.builder()
            .addCapability(
                CardTokenCreateParams.Capability.builder()
                    .crossBorderPushTransfers(
                        CardTokenCreateParams.Capability.CrossBorderPushTransfers.SUPPORTED
                    )
                    .domesticPushTransfers(
                        CardTokenCreateParams.Capability.DomesticPushTransfers.SUPPORTED
                    )
                    .route(CardTokenCreateParams.Capability.Route.VISA)
                    .build()
            )
            .expiration(LocalDate.parse("2019-12-27"))
            .last4("1234")
            .prefix("41234567")
            .primaryAccountNumberLength(16L)
            .build()
    }

    @Test
    fun body() {
        val params =
            CardTokenCreateParams.builder()
                .addCapability(
                    CardTokenCreateParams.Capability.builder()
                        .crossBorderPushTransfers(
                            CardTokenCreateParams.Capability.CrossBorderPushTransfers.SUPPORTED
                        )
                        .domesticPushTransfers(
                            CardTokenCreateParams.Capability.DomesticPushTransfers.SUPPORTED
                        )
                        .route(CardTokenCreateParams.Capability.Route.VISA)
                        .build()
                )
                .expiration(LocalDate.parse("2019-12-27"))
                .last4("1234")
                .prefix("41234567")
                .primaryAccountNumberLength(16L)
                .build()

        val body = params._body()

        assertThat(body.capabilities())
            .containsExactly(
                CardTokenCreateParams.Capability.builder()
                    .crossBorderPushTransfers(
                        CardTokenCreateParams.Capability.CrossBorderPushTransfers.SUPPORTED
                    )
                    .domesticPushTransfers(
                        CardTokenCreateParams.Capability.DomesticPushTransfers.SUPPORTED
                    )
                    .route(CardTokenCreateParams.Capability.Route.VISA)
                    .build()
            )
        assertThat(body.expiration()).isEqualTo(LocalDate.parse("2019-12-27"))
        assertThat(body.last4()).isEqualTo("1234")
        assertThat(body.prefix()).isEqualTo("41234567")
        assertThat(body.primaryAccountNumberLength()).isEqualTo(16L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardTokenCreateParams.builder().build()

        val body = params._body()
    }
}
