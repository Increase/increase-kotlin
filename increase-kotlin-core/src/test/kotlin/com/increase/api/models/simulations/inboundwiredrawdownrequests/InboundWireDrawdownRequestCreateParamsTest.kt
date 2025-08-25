// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.inboundwiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundWireDrawdownRequestCreateParamsTest {

    @Test
    fun create() {
        InboundWireDrawdownRequestCreateParams.builder()
            .amount(10000L)
            .creditorAccountNumber("987654321")
            .creditorRoutingNumber("101050001")
            .currency("USD")
            .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .creditorAddressLine1("33 Liberty Street")
            .creditorAddressLine2("New York, NY, 10045")
            .creditorAddressLine3("x")
            .creditorName("Ian Crease")
            .debtorAccountNumber("987654321")
            .debtorAddressLine1("33 Liberty Street")
            .debtorAddressLine2("New York, NY, 10045")
            .debtorAddressLine3("x")
            .debtorName("Ian Crease")
            .debtorRoutingNumber("101050001")
            .endToEndIdentification("x")
            .instructionIdentification("x")
            .uniqueEndToEndTransactionReference("x")
            .unstructuredRemittanceInformation("x")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundWireDrawdownRequestCreateParams.builder()
                .amount(10000L)
                .creditorAccountNumber("987654321")
                .creditorRoutingNumber("101050001")
                .currency("USD")
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .creditorAddressLine1("33 Liberty Street")
                .creditorAddressLine2("New York, NY, 10045")
                .creditorAddressLine3("x")
                .creditorName("Ian Crease")
                .debtorAccountNumber("987654321")
                .debtorAddressLine1("33 Liberty Street")
                .debtorAddressLine2("New York, NY, 10045")
                .debtorAddressLine3("x")
                .debtorName("Ian Crease")
                .debtorRoutingNumber("101050001")
                .endToEndIdentification("x")
                .instructionIdentification("x")
                .uniqueEndToEndTransactionReference("x")
                .unstructuredRemittanceInformation("x")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.creditorAccountNumber()).isEqualTo("987654321")
        assertThat(body.creditorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.recipientAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.creditorAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.creditorAddressLine2()).isEqualTo("New York, NY, 10045")
        assertThat(body.creditorAddressLine3()).isEqualTo("x")
        assertThat(body.creditorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorAccountNumber()).isEqualTo("987654321")
        assertThat(body.debtorAddressLine1()).isEqualTo("33 Liberty Street")
        assertThat(body.debtorAddressLine2()).isEqualTo("New York, NY, 10045")
        assertThat(body.debtorAddressLine3()).isEqualTo("x")
        assertThat(body.debtorName()).isEqualTo("Ian Crease")
        assertThat(body.debtorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.endToEndIdentification()).isEqualTo("x")
        assertThat(body.instructionIdentification()).isEqualTo("x")
        assertThat(body.uniqueEndToEndTransactionReference()).isEqualTo("x")
        assertThat(body.unstructuredRemittanceInformation()).isEqualTo("x")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundWireDrawdownRequestCreateParams.builder()
                .amount(10000L)
                .creditorAccountNumber("987654321")
                .creditorRoutingNumber("101050001")
                .currency("USD")
                .recipientAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        val body = params._body()

        assertThat(body.amount()).isEqualTo(10000L)
        assertThat(body.creditorAccountNumber()).isEqualTo("987654321")
        assertThat(body.creditorRoutingNumber()).isEqualTo("101050001")
        assertThat(body.currency()).isEqualTo("USD")
        assertThat(body.recipientAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
