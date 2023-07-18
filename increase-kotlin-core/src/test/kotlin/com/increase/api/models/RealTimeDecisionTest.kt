package com.increase.api.models

import com.increase.api.core.JsonNull
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RealTimeDecisionTest {

    @Test
    fun createRealTimeDecision() {
        val realTimeDecision =
            RealTimeDecision.builder()
                .id("string")
                .cardAuthorization(
                    RealTimeDecision.CardAuthorization.builder()
                        .accountId("string")
                        .cardId("string")
                        .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                        .merchantAcceptorId("string")
                        .merchantCategoryCode("string")
                        .merchantCity("string")
                        .merchantCountry("string")
                        .merchantDescriptor("string")
                        .networkDetails(
                            RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                                .category(
                                    RealTimeDecision.CardAuthorization.NetworkDetails.Category.VISA
                                )
                                .visa(
                                    RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                        .electronicCommerceIndicator(
                                            RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                                .ElectronicCommerceIndicator
                                                .MAIL_PHONE_ORDER
                                        )
                                        .pointOfServiceEntryMode(PointOfServiceEntryMode.UNKNOWN)
                                        .build()
                                )
                                .build()
                        )
                        .physicalCardId("string")
                        .presentmentAmount(123L)
                        .presentmentCurrency("string")
                        .requestDetails(
                            RealTimeDecision.CardAuthorization.RequestDetails.builder()
                                .category(
                                    RealTimeDecision.CardAuthorization.RequestDetails.Category
                                        .INITIAL_AUTHORIZATION
                                )
                                .incrementalAuthorization(
                                    RealTimeDecision.CardAuthorization.RequestDetails
                                        .IncrementalAuthorization
                                        .builder()
                                        .cardPaymentId("string")
                                        .originalCardAuthorizationId("string")
                                        .build()
                                )
                                .initialAuthorization(JsonNull.of())
                                .build()
                        )
                        .settlementAmount(123L)
                        .settlementCurrency("string")
                        .build()
                )
                .category(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .digitalWalletAuthentication(
                    RealTimeDecision.DigitalWalletAuthentication.builder()
                        .cardId("string")
                        .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                        .digitalWallet(
                            RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                        )
                        .email("string")
                        .oneTimePasscode("string")
                        .phone("string")
                        .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                        .build()
                )
                .digitalWalletToken(
                    RealTimeDecision.DigitalWalletToken.builder()
                        .cardId("string")
                        .cardProfileId("string")
                        .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                        .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                        .build()
                )
                .status(RealTimeDecision.Status.PENDING)
                .timeoutAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(RealTimeDecision.Type.REAL_TIME_DECISION)
                .build()
        assertThat(realTimeDecision).isNotNull
        assertThat(realTimeDecision.id()).isEqualTo("string")
        assertThat(realTimeDecision.cardAuthorization())
            .isEqualTo(
                RealTimeDecision.CardAuthorization.builder()
                    .accountId("string")
                    .cardId("string")
                    .decision(RealTimeDecision.CardAuthorization.Decision.APPROVE)
                    .merchantAcceptorId("string")
                    .merchantCategoryCode("string")
                    .merchantCity("string")
                    .merchantCountry("string")
                    .merchantDescriptor("string")
                    .networkDetails(
                        RealTimeDecision.CardAuthorization.NetworkDetails.builder()
                            .category(
                                RealTimeDecision.CardAuthorization.NetworkDetails.Category.VISA
                            )
                            .visa(
                                RealTimeDecision.CardAuthorization.NetworkDetails.Visa.builder()
                                    .electronicCommerceIndicator(
                                        RealTimeDecision.CardAuthorization.NetworkDetails.Visa
                                            .ElectronicCommerceIndicator
                                            .MAIL_PHONE_ORDER
                                    )
                                    .pointOfServiceEntryMode(PointOfServiceEntryMode.UNKNOWN)
                                    .build()
                            )
                            .build()
                    )
                    .physicalCardId("string")
                    .presentmentAmount(123L)
                    .presentmentCurrency("string")
                    .requestDetails(
                        RealTimeDecision.CardAuthorization.RequestDetails.builder()
                            .category(
                                RealTimeDecision.CardAuthorization.RequestDetails.Category
                                    .INITIAL_AUTHORIZATION
                            )
                            .incrementalAuthorization(
                                RealTimeDecision.CardAuthorization.RequestDetails
                                    .IncrementalAuthorization
                                    .builder()
                                    .cardPaymentId("string")
                                    .originalCardAuthorizationId("string")
                                    .build()
                            )
                            .initialAuthorization(JsonNull.of())
                            .build()
                    )
                    .settlementAmount(123L)
                    .settlementCurrency("string")
                    .build()
            )
        assertThat(realTimeDecision.category())
            .isEqualTo(RealTimeDecision.Category.CARD_AUTHORIZATION_REQUESTED)
        assertThat(realTimeDecision.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.digitalWalletAuthentication())
            .isEqualTo(
                RealTimeDecision.DigitalWalletAuthentication.builder()
                    .cardId("string")
                    .channel(RealTimeDecision.DigitalWalletAuthentication.Channel.SMS)
                    .digitalWallet(
                        RealTimeDecision.DigitalWalletAuthentication.DigitalWallet.APPLE_PAY
                    )
                    .email("string")
                    .oneTimePasscode("string")
                    .phone("string")
                    .result(RealTimeDecision.DigitalWalletAuthentication.Result.SUCCESS)
                    .build()
            )
        assertThat(realTimeDecision.digitalWalletToken())
            .isEqualTo(
                RealTimeDecision.DigitalWalletToken.builder()
                    .cardId("string")
                    .cardProfileId("string")
                    .decision(RealTimeDecision.DigitalWalletToken.Decision.APPROVE)
                    .digitalWallet(RealTimeDecision.DigitalWalletToken.DigitalWallet.APPLE_PAY)
                    .build()
            )
        assertThat(realTimeDecision.status()).isEqualTo(RealTimeDecision.Status.PENDING)
        assertThat(realTimeDecision.timeoutAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(realTimeDecision.type()).isEqualTo(RealTimeDecision.Type.REAL_TIME_DECISION)
    }
}
