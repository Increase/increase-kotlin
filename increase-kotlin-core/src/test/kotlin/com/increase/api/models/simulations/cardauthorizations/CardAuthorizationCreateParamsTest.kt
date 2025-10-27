// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.cardauthorizations

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CardAuthorizationCreateParamsTest {

    @Test
    fun create() {
        CardAuthorizationCreateParams.builder()
            .amount(1000L)
            .authenticatedCardPaymentId("authenticated_card_payment_id")
            .cardId("card_oubs0hwk5rn6knuecxg2")
            .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
            .digitalWalletTokenId("digital_wallet_token_id")
            .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
            .merchantAcceptorId("5665270011000168")
            .merchantCategoryCode("5734")
            .merchantCity("New York")
            .merchantCountry("US")
            .merchantDescriptor("AMAZON.COM")
            .merchantState("NY")
            .networkDetails(
                CardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
            .networkRiskScore(0L)
            .physicalCardId("physical_card_id")
            .processingCategory(
                CardAuthorizationCreateParams.ProcessingCategory.builder()
                    .category(
                        CardAuthorizationCreateParams.ProcessingCategory.Category.ACCOUNT_FUNDING
                    )
                    .refund(
                        CardAuthorizationCreateParams.ProcessingCategory.Refund.builder()
                            .originalCardPaymentId("original_card_payment_id")
                            .build()
                    )
                    .build()
            )
            .terminalId("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            CardAuthorizationCreateParams.builder()
                .amount(1000L)
                .authenticatedCardPaymentId("authenticated_card_payment_id")
                .cardId("card_oubs0hwk5rn6knuecxg2")
                .declineReason(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
                .digitalWalletTokenId("digital_wallet_token_id")
                .eventSubscriptionId("event_subscription_001dzz0r20rcdxgb013zqb8m04g")
                .merchantAcceptorId("5665270011000168")
                .merchantCategoryCode("5734")
                .merchantCity("New York")
                .merchantCountry("US")
                .merchantDescriptor("AMAZON.COM")
                .merchantState("NY")
                .networkDetails(
                    CardAuthorizationCreateParams.NetworkDetails.builder()
                        .visa(
                            CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                                .standInProcessingReason(
                                    CardAuthorizationCreateParams.NetworkDetails.Visa
                                        .StandInProcessingReason
                                        .ISSUER_ERROR
                                )
                                .build()
                        )
                        .build()
                )
                .networkRiskScore(0L)
                .physicalCardId("physical_card_id")
                .processingCategory(
                    CardAuthorizationCreateParams.ProcessingCategory.builder()
                        .category(
                            CardAuthorizationCreateParams.ProcessingCategory.Category
                                .ACCOUNT_FUNDING
                        )
                        .refund(
                            CardAuthorizationCreateParams.ProcessingCategory.Refund.builder()
                                .originalCardPaymentId("original_card_payment_id")
                                .build()
                        )
                        .build()
                )
                .terminalId("x")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.authenticatedCardPaymentId()).isEqualTo("authenticated_card_payment_id")
        assertThat(body.cardId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(body.declineReason())
            .isEqualTo(CardAuthorizationCreateParams.DeclineReason.ACCOUNT_CLOSED)
        assertThat(body.digitalWalletTokenId()).isEqualTo("digital_wallet_token_id")
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
                CardAuthorizationCreateParams.NetworkDetails.builder()
                    .visa(
                        CardAuthorizationCreateParams.NetworkDetails.Visa.builder()
                            .standInProcessingReason(
                                CardAuthorizationCreateParams.NetworkDetails.Visa
                                    .StandInProcessingReason
                                    .ISSUER_ERROR
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(body.networkRiskScore()).isEqualTo(0L)
        assertThat(body.physicalCardId()).isEqualTo("physical_card_id")
        assertThat(body.processingCategory())
            .isEqualTo(
                CardAuthorizationCreateParams.ProcessingCategory.builder()
                    .category(
                        CardAuthorizationCreateParams.ProcessingCategory.Category.ACCOUNT_FUNDING
                    )
                    .refund(
                        CardAuthorizationCreateParams.ProcessingCategory.Refund.builder()
                            .originalCardPaymentId("original_card_payment_id")
                            .build()
                    )
                    .build()
            )
        assertThat(body.terminalId()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CardAuthorizationCreateParams.builder().amount(1000L).build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(1000L)
    }
}
