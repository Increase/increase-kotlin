package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeTest {

    @Test
    fun createCardDispute() {
        val cardDispute =
            CardDispute.builder()
                .id("string")
                .explanation("string")
                .status(CardDispute.Status.PENDING_REVIEWING)
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .disputedTransactionId("string")
                .acceptance(
                    CardDispute.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("string")
                        .transactionId("string")
                        .build()
                )
                .rejection(
                    CardDispute.Rejection.builder()
                        .explanation("string")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("string")
                        .build()
                )
                .type(CardDispute.Type.CARD_DISPUTE)
                .build()
        assertThat(cardDispute).isNotNull
        assertThat(cardDispute.id()).isEqualTo("string")
        assertThat(cardDispute.explanation()).isEqualTo("string")
        assertThat(cardDispute.status()).isEqualTo(CardDispute.Status.PENDING_REVIEWING)
        assertThat(cardDispute.createdAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(cardDispute.disputedTransactionId()).isEqualTo("string")
        assertThat(cardDispute.acceptance())
            .isEqualTo(
                CardDispute.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("string")
                    .transactionId("string")
                    .build()
            )
        assertThat(cardDispute.rejection())
            .isEqualTo(
                CardDispute.Rejection.builder()
                    .explanation("string")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("string")
                    .build()
            )
        assertThat(cardDispute.type()).isEqualTo(CardDispute.Type.CARD_DISPUTE)
    }
}
