// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import java.util.UUID
import org.junit.jupiter.api.Test
import org.assertj.core.api.Assertions.assertThat
import com.increase.api.core.JsonNull
import com.increase.api.core.JsonString
import com.increase.api.core.JsonValue
import com.increase.api.models.WireDrawdownRequest

class WireDrawdownRequestTest {

    @Test
    fun createWireDrawdownRequest() {
      val wireDrawdownRequest = WireDrawdownRequest.builder()
          .id("id")
          .accountNumberId("account_number_id")
          .amount(123L)
          .currency("currency")
          .fulfillmentTransactionId("fulfillment_transaction_id")
          .idempotencyKey("idempotency_key")
          .messageToRecipient("message_to_recipient")
          .originatorAddressLine1("originator_address_line1")
          .originatorAddressLine2("originator_address_line2")
          .originatorAddressLine3("originator_address_line3")
          .originatorName("originator_name")
          .recipientAccountNumber("recipient_account_number")
          .recipientAddressLine1("recipient_address_line1")
          .recipientAddressLine2("recipient_address_line2")
          .recipientAddressLine3("recipient_address_line3")
          .recipientName("recipient_name")
          .recipientRoutingNumber("recipient_routing_number")
          .status(WireDrawdownRequest.Status.PENDING_SUBMISSION)
          .submission(WireDrawdownRequest.Submission.builder()
              .inputMessageAccountabilityData("input_message_accountability_data")
              .build())
          .type(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
          .build()
      assertThat(wireDrawdownRequest).isNotNull
      assertThat(wireDrawdownRequest.id()).isEqualTo("id")
      assertThat(wireDrawdownRequest.accountNumberId()).isEqualTo("account_number_id")
      assertThat(wireDrawdownRequest.amount()).isEqualTo(123L)
      assertThat(wireDrawdownRequest.currency()).isEqualTo("currency")
      assertThat(wireDrawdownRequest.fulfillmentTransactionId()).isEqualTo("fulfillment_transaction_id")
      assertThat(wireDrawdownRequest.idempotencyKey()).isEqualTo("idempotency_key")
      assertThat(wireDrawdownRequest.messageToRecipient()).isEqualTo("message_to_recipient")
      assertThat(wireDrawdownRequest.originatorAddressLine1()).isEqualTo("originator_address_line1")
      assertThat(wireDrawdownRequest.originatorAddressLine2()).isEqualTo("originator_address_line2")
      assertThat(wireDrawdownRequest.originatorAddressLine3()).isEqualTo("originator_address_line3")
      assertThat(wireDrawdownRequest.originatorName()).isEqualTo("originator_name")
      assertThat(wireDrawdownRequest.recipientAccountNumber()).isEqualTo("recipient_account_number")
      assertThat(wireDrawdownRequest.recipientAddressLine1()).isEqualTo("recipient_address_line1")
      assertThat(wireDrawdownRequest.recipientAddressLine2()).isEqualTo("recipient_address_line2")
      assertThat(wireDrawdownRequest.recipientAddressLine3()).isEqualTo("recipient_address_line3")
      assertThat(wireDrawdownRequest.recipientName()).isEqualTo("recipient_name")
      assertThat(wireDrawdownRequest.recipientRoutingNumber()).isEqualTo("recipient_routing_number")
      assertThat(wireDrawdownRequest.status()).isEqualTo(WireDrawdownRequest.Status.PENDING_SUBMISSION)
      assertThat(wireDrawdownRequest.submission()).isEqualTo(WireDrawdownRequest.Submission.builder()
          .inputMessageAccountabilityData("input_message_accountability_data")
          .build())
      assertThat(wireDrawdownRequest.type()).isEqualTo(WireDrawdownRequest.Type.WIRE_DRAWDOWN_REQUEST)
    }
}
