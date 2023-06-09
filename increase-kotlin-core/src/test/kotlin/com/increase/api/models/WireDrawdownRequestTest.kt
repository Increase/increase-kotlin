package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .id("string")
                .accountNumberId("string")
                .recipientAccountNumber("string")
                .recipientRoutingNumber("string")
                .amount(123L)
                .currency("string")
                .messageToRecipient("string")
                .recipientName("string")
                .recipientAddressLine1("string")
                .recipientAddressLine2("string")
                .recipientAddressLine3("string")
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("string")
                        .build()
                )
                .fulfillmentTransactionId("string")
                .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
                .build()
        assertThat(wireDrawdownRequest).isNotNull
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
        assertThat(wireDrawdownRequest.id()).isEqualTo("string")
        assertThat(wireDrawdownRequest.accountNumberId()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAccountNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientRoutingNumber()).isEqualTo("string")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(123L)
        assertThat(wireDrawdownRequest.currency()).isEqualTo("string")
        assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientName()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine1()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine2()).isEqualTo("string")
        assertThat(wireDrawdownRequest.recipientAddressLine3()).isEqualTo("string")
        assertThat(wireDrawdownRequest.submission())
            .isEqualTo(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("string")
                    .build()
            )
        assertThat(wireDrawdownRequest.fulfillmentTransactionId()).isEqualTo("string")
        assertThat(wireDrawdownRequest.status())
            .isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
    }
}
