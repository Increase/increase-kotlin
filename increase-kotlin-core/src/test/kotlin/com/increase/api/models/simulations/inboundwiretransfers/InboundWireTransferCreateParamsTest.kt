// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireTransferCreateParamsTest {

    @Test
    fun create() {
        InboundWireTransferCreateParams.builder()
            .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .amount(1000L)
            .creditorAddressLine1("x")
            .creditorAddressLine2("x")
            .creditorAddressLine3("x")
            .creditorName("x")
            .debtorAddressLine1("x")
            .debtorAddressLine2("x")
            .debtorAddressLine3("x")
            .debtorName("x")
            .endToEndIdentification("x")
            .instructingAgentRoutingNumber("x")
            .instructionIdentification("x")
            .uniqueEndToEndTransactionReference("x")
            .unstructuredRemittanceInformation("x")
            .wireDrawdownRequestId("wire_drawdown_request_id")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .creditorAddressLine1("x")
                .creditorAddressLine2("x")
                .creditorAddressLine3("x")
                .creditorName("x")
                .debtorAddressLine1("x")
                .debtorAddressLine2("x")
                .debtorAddressLine3("x")
                .debtorName("x")
                .endToEndIdentification("x")
                .instructingAgentRoutingNumber("x")
                .instructionIdentification("x")
                .uniqueEndToEndTransactionReference("x")
                .unstructuredRemittanceInformation("x")
                .wireDrawdownRequestId("wire_drawdown_request_id")
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.creditorAddressLine1()).isEqualTo("x")
        assertThat(body.creditorAddressLine2()).isEqualTo("x")
        assertThat(body.creditorAddressLine3()).isEqualTo("x")
        assertThat(body.creditorName()).isEqualTo("x")
        assertThat(body.debtorAddressLine1()).isEqualTo("x")
        assertThat(body.debtorAddressLine2()).isEqualTo("x")
        assertThat(body.debtorAddressLine3()).isEqualTo("x")
        assertThat(body.debtorName()).isEqualTo("x")
        assertThat(body.endToEndIdentification()).isEqualTo("x")
        assertThat(body.instructingAgentRoutingNumber()).isEqualTo("x")
        assertThat(body.instructionIdentification()).isEqualTo("x")
        assertThat(body.uniqueEndToEndTransactionReference()).isEqualTo("x")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("x")
        assertThat(body.wireDrawdownRequestId()).isEqualTo("wire_drawdown_request_id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundWireTransferCreateParams.builder()
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .amount(1000L)
                .build()

        val body = params._body()

        assertThat(body.accountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.amount()).isEqualTo(1000L)
    }
}
