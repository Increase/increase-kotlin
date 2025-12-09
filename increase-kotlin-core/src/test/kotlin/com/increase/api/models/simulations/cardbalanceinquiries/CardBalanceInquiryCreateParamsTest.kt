// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardbalanceinquiries

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardBalanceInquiryCreateParamsTest {

    @Test
    fun create() {
        CardBalanceInquiryCreateParams.builder()
            .balance(1000000L)
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .declineReason(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
            .digitalWalletTokenId("digital_wallet_token_id")
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCity("New York")
            .merchantCountry("US")
            .merchantDescriptor("CITIBANK")
            .merchantState("NY")
            .networkDetails(
                CardBalanceInquiryCreateParams.NetworkDetails.builder()
                    .visa(
                        CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardBalanceInquiryCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
            .networkRiskScore(0L)
            .physicalCardId("physical_card_id")
            .terminalId("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardBalanceInquiryCreateParams.builder()
                .balance(1000000L)
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .declineReason(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
                .digitalWalletTokenId("digital_wallet_token_id")
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCity("New York")
                .merchantCountry("US")
                .merchantDescriptor("CITIBANK")
                .merchantState("NY")
                .networkDetails(
                    CardBalanceInquiryCreateParams.NetworkDetails.builder()
                        .visa(
                            CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                                .standInProcessingReason(
                                    CardBalanceInquiryCreateParams.NetworkDetails.Visa
                                        .StandInProcessingReason
                                        .ISSUER_ERROR
                                )
                                .build()
                        )
                        .build()
                )
                .networkRiskScore(0L)
                .physicalCardId("physical_card_id")
                .terminalId("x")
                .build()

        val body = params._body()

        assertThat(body.balance()).isEqualTo(1000000L)
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.declineReason())
            .isEqualTo(CardBalanceInquiryCreateParams.DeclineReason.ACCOUNT_CLOSED)
        assertThat(body.digitalWalletTokenId()).isEqualTo("digital_wallet_token_id")
        assertThat(body.eventSubscriptionId())
            .isEqualTo("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
        assertThat(body.merchantAcceptorId()).isEqualTo("5665270011000168")
        assertThat(body.merchantCategoryCode()).isEqualTo("5734")
        assertThat(body.merchantCity()).isEqualTo("New York")
        assertThat(body.merchantCountry()).isEqualTo("US")
        assertThat(body.merchantDescriptor()).isEqualTo("CITIBANK")
        assertThat(body.merchantState()).isEqualTo("NY")
        assertThat(body.networkDetails())
            .isEqualTo(
                CardBalanceInquiryCreateParams.NetworkDetails.builder()
                    .visa(
                        CardBalanceInquiryCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardBalanceInquiryCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.networkRiskScore()).isEqualTo(0L)
        assertThat(body.physicalCardId()).isEqualTo("physical_card_id")
        assertThat(body.terminalId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardBalanceInquiryCreateParams.builder().build()

        val body = params._body()
    }
}
