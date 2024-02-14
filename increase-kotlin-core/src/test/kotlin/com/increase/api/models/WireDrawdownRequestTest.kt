// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("string")
                .accountNumberId("string")
                .amount(123L)
                .currency("string")
                .fulfillmentTransactionId("string")
                .idempotencyKey("string")
                .messageToRecipient("string")
                .originatorAddressLine1("string")
                .originatorAddressLine2("string")
                .originatorAddressLine3("string")
                .originatorName("string")
                .recipientAccountNumber("string")
                .recipientAddressLine1("string")
                .recipientAddressLine2("string")
                .recipientAddressLine3("string")
                .recipientName("string")
                .recipientRoutingNumber("string")
                .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("string")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .build()
        assertThat(wireDrawdownRequest).isNotNull
        assertThat(wireDrawdownRequest.id()).isEqualTo("string")
        assertThat(wireDrawdownRequest.accountNumberId()).isEqualTo("string")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(123L)
        assertThat(wireDrawdownRequest.currency()).isEqualTo("string")
        assertThat(wireDrawdownRequest.fulfillmentTransactionId()).isEqualTo("string")
        assertThat(wireDrawdownRequest.idempotencyKey()).isEqualTo("string")
        assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("string")
        assertThat(wireDrawdownRequest.originatorAddressLine1()).isEqualTo("string")
        assertThat(wireDrawdownRequest.originatorAddressLine2()).isEqualTo("string")
        assertThat(wireDrawdownRequest.originatorAddressLine3()).isEqualTo("string")
        assertThat(wireDrawdownRequest.originatorName()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAccountNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine1()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine2()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine3()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientName()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientRoutingNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.status())
            .isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
        assertThat(wireDrawdownRequest.submission())
            .isEqualTo(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("string")
                    .build()
            )
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
    }
}
