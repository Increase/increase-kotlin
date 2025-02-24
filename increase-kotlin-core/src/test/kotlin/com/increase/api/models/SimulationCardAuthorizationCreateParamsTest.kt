// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardAuthorizationCreateParamsTest {

    @Test
    fun create() {
        SimulationCardAuthorizationCreateParams.builder()
            .amount(1000L)
            .authenticatedCardPaymentId("authenticated_card_payment_id")
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .declineReason(SimulationCardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
            .digitalWalletTokenId("digital_wallet_token_id")
            .direction(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCity("New York")
            .merchantCountry("US")
            .merchantDescriptor("AMAZON.COM")
            .merchantState("NY")
            .networkDetails(
                SimulationCardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        SimulationCardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                SimulationCardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
            .physicalCardId("physical_card_id")
            .terminalId("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            SimulationCardAuthorizationCreateParams.builder()
                .amount(1000L)
                .authenticatedCardPaymentId("authenticated_card_payment_id")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .declineReason(SimulationCardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
                .digitalWalletTokenId("digital_wallet_token_id")
                .direction(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCity("New York")
                .merchantCountry("US")
                .merchantDescriptor("AMAZON.COM")
                .merchantState("NY")
                .networkDetails(
                    SimulationCardAuthorizationCreateParams.NetworkDetails.builder()
                        .visa(
                            SimulationCardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                                .standInProcessingReason(
                                    SimulationCardAuthorizationCreateParams.NetworkDetails.Visa
                                        .StandInProcessingReason
                                        .ISSUER_ERROR
                                )
                                .build()
                        )
                        .build()
                )
                .physicalCardId("physical_card_id")
                .terminalId("x")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.authenticatedCardPaymentId()).isEqualTo("authenticated_card_payment_id")
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.declineReason())
            .isEqualTo(SimulationCardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
        assertThat(body.digitalWalletTokenId()).isEqualTo("digital_wallet_token_id")
        assertThat(body.direction())
            .isEqualTo(SimulationCardAuthorizationCreateParams.Direction.SETTLEMENT)
        assertThat(body.eventSubscriptionId())
            .isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(body.merchantAcceptorId()).isEqualTo("5665270011000168")
        assertThat(body.merchantCategoryCode()).isEqualTo("5734")
        assertThat(body.merchantCity()).isEqualTo("New York")
        assertThat(body.merchantCountry()).isEqualTo("US")
        assertThat(body.merchantDescriptor()).isEqualTo("AMAZON.COM")
        assertThat(body.merchantState()).isEqualTo("NY")
        assertThat(body.networkDetails())
            .isEqualTo(
                SimulationCardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        SimulationCardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                SimulationCardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.physicalCardId()).isEqualTo("physical_card_id")
        assertThat(body.terminalId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = SimulationCardAuthorizationCreateParams.builder().amount(1000L).build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
