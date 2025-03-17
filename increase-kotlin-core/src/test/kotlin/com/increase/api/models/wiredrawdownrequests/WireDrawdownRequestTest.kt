// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
        val wireDrawdownRequest =
            WireDrawdownRequest.builder()
                .id("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(10000L)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency("USD")
                .fulfillmentInboundWireTransferId("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
                .idempotencyKey(null)
                .messageToRecipient("Invoice 29582")
                .originatorAddressLine1(null)
                .originatorAddressLine2(null)
                .originatorAddressLine3(null)
                .originatorName(null)
                .recipientAccountNumber("987654321")
                .recipientAddressLine1("33 Liberty Street")
                .recipientAddressLine2("New York, NY, 10045")
                .recipientAddressLine3(null)
                .recipientName("Ian Crease")
                .recipientRoutingNumber("101050001")
                .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
                .submission(
                    WireDrawdownRequest.Submission.builder()
                        .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                        .build()
                )
                .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
                .build()
        assertThat(wireDrawdownRequest).isNotNull
        assertThat(wireDrawdownRequest.id()).isEqualTo("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
        assertThat(wireDrawdownRequest.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(wireDrawdownRequest.amount()).isEqualTo(10000L)
        assertThat(wireDrawdownRequest.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(wireDrawdownRequest.currency()).isEqualTo("USD")
        assertThat(wireDrawdownRequest.fulfillmentInboundWireTransferId())
            .isEqualTo("inbound_wire_transfer_f228m6bmhtcxjco9pwp0")
        assertThat(wireDrawdownRequest.idempotencyKey()).isNull()
        assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("Invoice 29582")
        assertThat(wireDrawdownRequest.originatorAddressLine1()).isNull()
        assertThat(wireDrawdownRequest.originatorAddressLine2()).isNull()
        assertThat(wireDrawdownRequest.originatorAddressLine3()).isNull()
        assertThat(wireDrawdownRequest.originatorName()).isNull()
        assertThat(wireDrawdownRequest.recipientAccountNumber()).isEqualTo("987654321")
        assertThat(wireDrawdownRequest.recipientAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(wireDrawdownRequest.recipientAddressLine2()).isEqualTo("New York, NY, 10045")
        assertThat(wireDrawdownRequest.recipientAddressLine3()).isNull()
        assertThat(wireDrawdownRequest.recipientName()).isEqualTo("Ian Crease")
        assertThat(wireDrawdownRequest.recipientRoutingNumber()).isEqualTo("101050001")
        assertThat(wireDrawdownRequest.status())
            .isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
        assertThat(wireDrawdownRequest.submission())
            .isEqualTo(
                WireDrawdownRequest.Submission.builder()
                    .inputMessageAccountabilityData("20220118MMQFMP0P000003")
                    .build()
            )
        assertThat(wireDrawdownRequest.type())
            .isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
    }
}
