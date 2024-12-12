// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SimulationCardSettlementCreateParamsTest {

    @Test
    fun createSimulationCardSettlementCreateParams() {
        SimulationCardSettlementCreateParams.builder()
            .cardId("card_id")
            .pendingTransactionId("pending_transaction_id")
            .amount(1L)
            .build()
    }

    @Test
    fun getBody() {
        val params =
            SimulationCardSettlementCreateParams.builder()
                .cardId("card_id")
                .pendingTransactionId("pending_transaction_id")
                .amount(1L)
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
        assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
        assertThat(body.amount()).isEqualTo(1L)
    }

    @Test
    fun getBodyWithoutOptionalFields() {
        val params =
            SimulationCardSettlementCreateParams.builder()
                .cardId("card_id")
                .pendingTransactionId("pending_transaction_id")
                .build()
        val body = params.getBody()
        assertThat(body).isNotNull
        assertThat(body.cardId()).isEqualTo("card_id")
        assertThat(body.pendingTransactionId()).isEqualTo("pending_transaction_id")
    }
}
