// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundInternationalAchTransferTest {

    @Test
    fun createInboundInternationalAchTransfer() {
        val inboundInternationalAchTransfer =
            InboundInternationalAchTransfer.builder()
                .amount(123L)
                .destinationCountryCode("string")
                .destinationCurrencyCode("string")
                .foreignExchangeIndicator(
                    InboundInternationalAchTransfer.ForeignExchangeIndicator.FIXED_TO_VARIABLE
                )
                .foreignExchangeReference("string")
                .foreignExchangeReferenceIndicator(
                    InboundInternationalAchTransfer.ForeignExchangeReferenceIndicator
                        .FOREIGN_EXCHANGE_RATE
                )
                .foreignPaymentAmount(123L)
                .foreignTraceNumber("string")
                .internationalTransactionTypeCode(
                    InboundInternationalAchTransfer.InternationalTransactionTypeCode.ANNUITY
                )
                .originatingCurrencyCode("string")
                .originatingDepositoryFinancialInstitutionBranchCountry("string")
                .originatingDepositoryFinancialInstitutionId("string")
                .originatingDepositoryFinancialInstitutionIdQualifier(
                    InboundInternationalAchTransfer
                        .OriginatingDepositoryFinancialInstitutionIdQualifier
                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                )
                .originatingDepositoryFinancialInstitutionName("string")
                .originatorCity("string")
                .originatorCompanyEntryDescription("string")
                .originatorCountry("string")
                .originatorIdentification("string")
                .originatorName("string")
                .originatorPostalCode("string")
                .originatorStateOrProvince("string")
                .originatorStreetAddress("string")
                .paymentRelatedInformation("string")
                .paymentRelatedInformation2("string")
                .receiverCity("string")
                .receiverCountry("string")
                .receiverIdentificationNumber("string")
                .receiverPostalCode("string")
                .receiverStateOrProvince("string")
                .receiverStreetAddress("string")
                .receivingCompanyOrIndividualName("string")
                .receivingDepositoryFinancialInstitutionCountry("string")
                .receivingDepositoryFinancialInstitutionId("string")
                .receivingDepositoryFinancialInstitutionIdQualifier(
                    InboundInternationalAchTransfer
                        .ReceivingDepositoryFinancialInstitutionIdQualifier
                        .NATIONAL_CLEARING_SYSTEM_NUMBER
                )
                .receivingDepositoryFinancialInstitutionName("string")
                .traceNumber("string")
                .type(InboundInternationalAchTransfer.Type.INBOUND_INTERNATIONAL_ACH_TRANSFER)
                .build()
        assertThat(inboundInternationalAchTransfer).isNotNull
        assertThat(inboundInternationalAchTransfer.amount()).isEqualTo(123L)
        assertThat(inboundInternationalAchTransfer.destinationCountryCode()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.destinationCurrencyCode()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.foreignExchangeIndicator())
            .isEqualTo(InboundInternationalAchTransfer.ForeignExchangeIndicator.FIXED_TO_VARIABLE)
        assertThat(inboundInternationalAchTransfer.foreignExchangeReference()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.foreignExchangeReferenceIndicator())
            .isEqualTo(
                InboundInternationalAchTransfer.ForeignExchangeReferenceIndicator
                    .FOREIGN_EXCHANGE_RATE
            )
        assertThat(inboundInternationalAchTransfer.foreignPaymentAmount()).isEqualTo(123L)
        assertThat(inboundInternationalAchTransfer.foreignTraceNumber()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.internationalTransactionTypeCode())
            .isEqualTo(InboundInternationalAchTransfer.InternationalTransactionTypeCode.ANNUITY)
        assertThat(inboundInternationalAchTransfer.originatingCurrencyCode()).isEqualTo("string")
        assertThat(
                inboundInternationalAchTransfer
                    .originatingDepositoryFinancialInstitutionBranchCountry()
            )
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatingDepositoryFinancialInstitutionId())
            .isEqualTo("string")
        assertThat(
                inboundInternationalAchTransfer
                    .originatingDepositoryFinancialInstitutionIdQualifier()
            )
            .isEqualTo(
                InboundInternationalAchTransfer.OriginatingDepositoryFinancialInstitutionIdQualifier
                    .NATIONAL_CLEARING_SYSTEM_NUMBER
            )
        assertThat(inboundInternationalAchTransfer.originatingDepositoryFinancialInstitutionName())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorCity()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorCompanyEntryDescription())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorCountry()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorIdentification()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorName()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorPostalCode()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorStateOrProvince()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.originatorStreetAddress()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.paymentRelatedInformation()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.paymentRelatedInformation2()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverCity()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverCountry()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverIdentificationNumber())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverPostalCode()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverStateOrProvince()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receiverStreetAddress()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receivingCompanyOrIndividualName())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionCountry())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionId())
            .isEqualTo("string")
        assertThat(
                inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionIdQualifier()
            )
            .isEqualTo(
                InboundInternationalAchTransfer.ReceivingDepositoryFinancialInstitutionIdQualifier
                    .NATIONAL_CLEARING_SYSTEM_NUMBER
            )
        assertThat(inboundInternationalAchTransfer.receivingDepositoryFinancialInstitutionName())
            .isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.traceNumber()).isEqualTo("string")
        assertThat(inboundInternationalAchTransfer.type())
            .isEqualTo(InboundInternationalAchTransfer.Type.INBOUND_INTERNATIONAL_ACH_TRANSFER)
    }
}