// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CardDisputeTest {

    @Test
    fun createCardDispute() {
        val cardDispute =
            CardDispute.builder()
                .id("card_dispute_h9sc95nbl1cgltpp7men")
                .acceptance(
                    CardDispute.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .cardDisputeId("card_dispute_id")
                        .transactionId("transaction_id")
                        .build()
                )
                .amount(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .disputedTransactionId("transaction_uyrp7fld2ium70oa7oi")
                .explanation("Unauthorized recurring purchase")
                .idempotencyKey(null)
                .loss(
                    CardDispute.Loss.builder()
                        .cardDisputeId("card_dispute_id")
                        .explanation("explanation")
                        .lostAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .rejection(
                    CardDispute.Rejection.builder()
                        .cardDisputeId("card_dispute_id")
                        .explanation("explanation")
                        .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .status(CardDispute.Status.PENDING_REVIEWING)
                .type(CardDispute.Type.CARD_DISPUTE)
                .win(
                    CardDispute.Win.builder()
                        .cardDisputeId("card_dispute_id")
                        .wonAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()
        assertThat(cardDispute).isNotNull
        assertThat(cardDispute.id()).isEqualTo("card_dispute_h9sc95nbl1cgltpp7men")
        assertThat(cardDispute.acceptance())
            .isEqualTo(
                CardDispute.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .cardDisputeId("card_dispute_id")
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(cardDispute.amount()).isNull()
        assertThat(cardDispute.createdAt()).isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(cardDispute.disputedTransactionId()).isEqualTo("transaction_uyrp7fld2ium70oa7oi")
        assertThat(cardDispute.explanation()).isEqualTo("Unauthorized recurring purchase")
        assertThat(cardDispute.idempotencyKey()).isNull()
        assertThat(cardDispute.loss())
            .isEqualTo(
                CardDispute.Loss.builder()
                    .cardDisputeId("card_dispute_id")
                    .explanation("explanation")
                    .lostAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(cardDispute.rejection())
            .isEqualTo(
                CardDispute.Rejection.builder()
                    .cardDisputeId("card_dispute_id")
                    .explanation("explanation")
                    .rejectedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(cardDispute.status()).isEqualTo(CardDispute.Status.PENDING_REVIEWING)
        assertThat(cardDispute.type()).isEqualTo(CardDispute.Type.CARD_DISPUTE)
        assertThat(cardDispute.win())
            .isEqualTo(
                CardDispute.Win.builder()
                    .cardDisputeId("card_dispute_id")
                    .wonAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }
}
