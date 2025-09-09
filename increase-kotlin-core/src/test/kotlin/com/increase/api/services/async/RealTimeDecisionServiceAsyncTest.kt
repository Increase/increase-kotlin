// File generated from our OpenAPI spec by Stainless.

package com.increase.api.services.async

import com.increase.api.TestServerExtension
import com.increase.api.client.okhttp.IncreaseOkHttpClientAsync
import com.increase.api.models.realtimedecisions.RealTimeDecisionActionParams
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RealTimeDecisionServiceAsyncTest {

    @Test
    suspend fun retrieve() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimeDecisionServiceAsync = client.realTimeDecisions()

        val realTimeDecision =
            realTimeDecisionServiceAsync.retrieve("real_time_decision_j76n2e810ezcg3zh5qtn")

        realTimeDecision.validate()
    }

    @Test
    suspend fun action() {
        val client =
            IncreaseOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val realTimeDecisionServiceAsync = client.realTimeDecisions()

        val realTimeDecision =
            realTimeDecisionServiceAsync.action(
                RealTimeDecisionActionParams.builder()
                    .realTimeDecisionId("real_time_decision_j76n2e810ezcg3zh5qtn")
                    .cardAuthentication(
                        RealTimeDecisionActionParams.CardAuthentication.builder()
                            .decision(
                                RealTimeDecisionActionParams.CardAuthentication.Decision.APPROVE
                            )
                            .build()
                    )
                    .cardAuthenticationChallenge(
                        RealTimeDecisionActionParams.CardAuthenticationChallenge.builder()
                            .result(
                                RealTimeDecisionActionParams.CardAuthenticationChallenge.Result
                                    .SUCCESS
                            )
                            .build()
                    )
                    .cardAuthorization(
                        RealTimeDecisionActionParams.CardAuthorization.builder()
                            .decision(
                                RealTimeDecisionActionParams.CardAuthorization.Decision.APPROVE
                            )
                            .approval(
                                RealTimeDecisionActionParams.CardAuthorization.Approval.builder()
                                    .cardholderAddressVerificationResult(
                                        RealTimeDecisionActionParams.CardAuthorization.Approval
                                            .CardholderAddressVerificationResult
                                            .builder()
                                            .line1(
                                                RealTimeDecisionActionParams.CardAuthorization
                                                    .Approval
                                                    .CardholderAddressVerificationResult
                                                    .Line1
                                                    .MATCH
                                            )
                                            .postalCode(
                                                RealTimeDecisionActionParams.CardAuthorization
                                                    .Approval
                                                    .CardholderAddressVerificationResult
                                                    .PostalCode
                                                    .NO_MATCH
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .decline(
                                RealTimeDecisionActionParams.CardAuthorization.Decline.builder()
                                    .reason(
                                        RealTimeDecisionActionParams.CardAuthorization.Decline
                                            .Reason
                                            .INSUFFICIENT_FUNDS
                                    )
                                    .build()
                            )
                            .declineReason(
                                RealTimeDecisionActionParams.CardAuthorization.DeclineReason
                                    .INSUFFICIENT_FUNDS
                            )
                            .build()
                    )
                    .digitalWalletAuthentication(
                        RealTimeDecisionActionParams.DigitalWalletAuthentication.builder()
                            .result(
                                RealTimeDecisionActionParams.DigitalWalletAuthentication.Result
                                    .SUCCESS
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
            )

        realTimeDecision.validate()
    }
}
