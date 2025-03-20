// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.realtimedecisions

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RealTimeDecisionActionParamsTest {

    @Test
    fun create() {
        RealTimeDecisionActionParams.builder()
            .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
            .cardAuthentication(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
            .cardAuthenticationChallenge(
                RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                    .result(RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS)
                    .build()
            )
            .cardAuthorization(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .declineReason(
                        RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                            .INSUFFICIENT_FUNDS
                    )
                    .build()
            )
            .digitalWalletAuthentication(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .success(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.Success.builder()
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .build()
            )
            .digitalWalletToken(
                RealTimeDecisionActionParams.DigitalWalletToken.builder()
                    .approval(
                        RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .decline(
                        RealTimeDecisionActionParams.DigitalWalletToken.Decline.builder()
                            .reason("x")
                            .build()
                    )
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("real_time_decision_j76n2e810ezcg3zh5qtn")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .cardAuthentication(
                    RealTimeDecisionActionParams.CardAuthentication.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                        .build()
                )
                .cardAuthenticationChallenge(
                    RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                        .result(
                            RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS
                        )
                        .build()
                )
                .cardAuthorization(
                    RealTimeDecisionActionParams.CardAuthorization.builder()
                        .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                        .declineReason(
                            RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                                .INSUFFICIENT_FUNDS
                        )
                        .build()
                )
                .digitalWalletAuthentication(
                    RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                        .result(
                            RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS
                        )
                        .success(
                            RealTimeDecisionActionParams.DigitalWalletAuthentication.Success
                                .builder()
                                .email("x")
                                .phone("x")
                                .build()
                        )
                        .build()
                )
                .digitalWalletToken(
                    RealTimeDecisionActionParams.DigitalWalletToken.builder()
                        .approval(
                            RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                                .email("x")
                                .phone("x")
                                .build()
                        )
                        .decline(
                            RealTimeDecisionActionParams.DigitalWalletToken.Decline.builder()
                                .reason("x")
                                .build()
                        )
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.cardAuthentication())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthentication.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE)
                    .build()
            )
        assertThat(body.cardAuthenticationChallenge())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                    .result(RealTimeDecisionActionParams.CardAuthenticationChallenge.Result.SUCCESS)
                    .build()
            )
        assertThat(body.cardAuthorization())
            .isEqualTo(
                RealTimeDecisionActionParams.CardAuthorization.builder()
                    .decision(RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE)
                    .declineReason(
                        RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                            .INSUFFICIENT_FUNDS
                    )
                    .build()
            )
        assertThat(body.digitalWalletAuthentication())
            .isEqualTo(
                RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                    .result(RealTimeDecisionActionParams.DigitalWalletAuthentication.Result.SUCCESS)
                    .success(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.Success.builder()
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .build()
            )
        assertThat(body.digitalWalletToken())
            .isEqualTo(
                RealTimeDecisionActionParams.DigitalWalletToken.builder()
                    .approval(
                        RealTimeDecisionActionParams.DigitalWalletToken.Approval.builder()
                            .email("x")
                            .phone("x")
                            .build()
                    )
                    .decline(
                        RealTimeDecisionActionParams.DigitalWalletToken.Decline.builder()
                            .reason("x")
                            .build()
                    )
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            RealTimeDecisionActionParams.builder()
                .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                .build()

        val body = params._body()
    }
}
