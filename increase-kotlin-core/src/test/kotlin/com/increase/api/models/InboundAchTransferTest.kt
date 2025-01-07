// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import java.time.LocalDate
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InboundAchTransferTest {

    @Test
    fun createInboundAchTransfer() {
        val inboundAchTransfer =
            InboundAchTransfer.builder()
                .id("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .acceptance(
                    InboundAchTransfer.Acceptance.builder()
                        .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                        .transactionId("transaction_uyrp7fld2ium70oa7oi")
                        .build()
                )
                .accountId("account_in71c4amph0vgo2qllky")
                .accountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .addenda(
                    InboundAchTransfer.Addenda.builder()
                        .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                        .freeform(
                            InboundAchTransfer.Addenda.Freeform.builder()
                                .entries(
                                    listOf(
                                        InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                            .paymentRelatedInformation(
                                                "payment_related_information"
                                            )
                                            .build()
                                    )
                                )
                                .build()
                        )
                        .build()
                )
                .amount(100L)
                .automaticallyResolvesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .decline(
                    InboundAchTransfer.Decline.builder()
                        .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .declinedTransactionId("declined_transaction_id")
                        .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                        .build()
                )
                .direction(InboundAchTransfer.Direction.CREDIT)
                .effectiveDate(LocalDate.parse("2023-04-02"))
                .expectedSettlementSchedule(InboundAchTransfer.ExpectedSettlementSchedule.SAME_DAY)
                .internationalAddenda(
                    InboundAchTransfer.InternationalAddenda.builder()
                        .destinationCountryCode("destination_country_code")
                        .destinationCurrencyCode("destination_currency_code")
                        .foreignExchangeIndicator(
                            InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                                .FIXED_TO_VARIABLE
                        )
                        .foreignExchangeReference("foreign_exchange_reference")
                        .foreignExchangeReferenceIndicator(
                            InboundAchTransfer.InternationalAddenda
                                .ForeignExchangeReferenceIndicator
                                .FOREIGN_EXCHANGE_RATE
                        )
                        .foreignPaymentAmount(0L)
                        .foreignTraceNumber("foreign_trace_number")
                        .internationalTransactionTypeCode(
                            InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                                .ANNUITY
                        )
                        .originatingCurrencyCode("originating_currency_code")
                        .originatingDepositoryFinancialInstitutionBranchCountry(
                            "originating_depository_financial_institution_branch_country"
                        )
                        .originatingDepositoryFinancialInstitutionId(
                            "originating_depository_financial_institution_id"
                        )
                        .originatingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .OriginatingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .originatingDepositoryFinancialInstitutionName(
                            "originating_depository_financial_institution_name"
                        )
                        .originatorCity("originator_city")
                        .originatorCountry("originator_country")
                        .originatorIdentification("originator_identification")
                        .originatorName("originator_name")
                        .originatorPostalCode("originator_postal_code")
                        .originatorStateOrProvince("originator_state_or_province")
                        .originatorStreetAddress("originator_street_address")
                        .paymentRelatedInformation("payment_related_information")
                        .paymentRelatedInformation2("payment_related_information2")
                        .receiverCity("receiver_city")
                        .receiverCountry("receiver_country")
                        .receiverIdentificationNumber("receiver_identification_number")
                        .receiverPostalCode("receiver_postal_code")
                        .receiverStateOrProvince("receiver_state_or_province")
                        .receiverStreetAddress("receiver_street_address")
                        .receivingCompanyOrIndividualName("receiving_company_or_individual_name")
                        .receivingDepositoryFinancialInstitutionCountry(
                            "receiving_depository_financial_institution_country"
                        )
                        .receivingDepositoryFinancialInstitutionId(
                            "receiving_depository_financial_institution_id"
                        )
                        .receivingDepositoryFinancialInstitutionIdQualifier(
                            InboundAchTransfer.InternationalAddenda
                                .ReceivingDepositoryFinancialInstitutionIdQualifier
                                .NATIONAL_CLEARING_SYSTEM_NUMBER
                        )
                        .receivingDepositoryFinancialInstitutionName(
                            "receiving_depository_financial_institution_name"
                        )
                        .build()
                )
                .notificationOfChange(
                    InboundAchTransfer.NotificationOfChange.builder()
                        .updatedAccountNumber("updated_account_number")
                        .updatedRoutingNumber("updated_routing_number")
                        .build()
                )
                .originatorCompanyDescriptiveDate("230401")
                .originatorCompanyDiscretionaryData("WEB AUTOPAY")
                .originatorCompanyEntryDescription("INVOICE 2468")
                .originatorCompanyId("0987654321")
                .originatorCompanyName("PAYROLL COMPANY")
                .originatorRoutingNumber("101050001")
                .receiverIdNumber(null)
                .receiverName("Ian Crease")
                .standardEntryClassCode(
                    InboundAchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT
                )
                .status(InboundAchTransfer.Status.PENDING)
                .traceNumber("021000038461022")
                .transferReturn(
                    InboundAchTransfer.TransferReturn.builder()
                        .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                        .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .transactionId("transaction_id")
                        .build()
                )
                .type(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
                .build()
        assertThat(inboundAchTransfer).isNotNull
        assertThat(inboundAchTransfer.id()).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        assertThat(inboundAchTransfer.acceptance())
            .isEqualTo(
                InboundAchTransfer.Acceptance.builder()
                    .acceptedAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                    .transactionId("transaction_uyrp7fld2ium70oa7oi")
                    .build()
            )
        assertThat(inboundAchTransfer.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(inboundAchTransfer.accountNumberId())
            .isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(inboundAchTransfer.addenda())
            .isEqualTo(
                InboundAchTransfer.Addenda.builder()
                    .category(InboundAchTransfer.Addenda.Category.FREEFORM)
                    .freeform(
                        InboundAchTransfer.Addenda.Freeform.builder()
                            .entries(
                                listOf(
                                    InboundAchTransfer.Addenda.Freeform.Entry.builder()
                                        .paymentRelatedInformation("payment_related_information")
                                        .build()
                                )
                            )
                            .build()
                    )
                    .build()
            )
        assertThat(inboundAchTransfer.amount()).isEqualTo(100L)
        assertThat(inboundAchTransfer.automaticallyResolvesAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(inboundAchTransfer.decline())
            .isEqualTo(
                InboundAchTransfer.Decline.builder()
                    .declinedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .declinedTransactionId("declined_transaction_id")
                    .reason(InboundAchTransfer.Decline.Reason.ACH_ROUTE_CANCELED)
                    .build()
            )
        assertThat(inboundAchTransfer.direction()).isEqualTo(InboundAchTransfer.Direction.CREDIT)
        assertThat(inboundAchTransfer.effectiveDate()).isEqualTo(LocalDate.parse("2023-04-02"))
        assertThat(inboundAchTransfer.expectedSettlementSchedule())
            .isEqualTo(InboundAchTransfer.ExpectedSettlementSchedule.SAME_DAY)
        assertThat(inboundAchTransfer.internationalAddenda())
            .isEqualTo(
                InboundAchTransfer.InternationalAddenda.builder()
                    .destinationCountryCode("destination_country_code")
                    .destinationCurrencyCode("destination_currency_code")
                    .foreignExchangeIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeIndicator
                            .FIXED_TO_VARIABLE
                    )
                    .foreignExchangeReference("foreign_exchange_reference")
                    .foreignExchangeReferenceIndicator(
                        InboundAchTransfer.InternationalAddenda.ForeignExchangeReferenceIndicator
                            .FOREIGN_EXCHANGE_RATE
                    )
                    .foreignPaymentAmount(0L)
                    .foreignTraceNumber("foreign_trace_number")
                    .internationalTransactionTypeCode(
                        InboundAchTransfer.InternationalAddenda.InternationalTransactionTypeCode
                            .ANNUITY
                    )
                    .originatingCurrencyCode("originating_currency_code")
                    .originatingDepositoryFinancialInstitutionBranchCountry(
                        "originating_depository_financial_institution_branch_country"
                    )
                    .originatingDepositoryFinancialInstitutionId(
                        "originating_depository_financial_institution_id"
                    )
                    .originatingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .OriginatingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .originatingDepositoryFinancialInstitutionName(
                        "originating_depository_financial_institution_name"
                    )
                    .originatorCity("originator_city")
                    .originatorCountry("originator_country")
                    .originatorIdentification("originator_identification")
                    .originatorName("originator_name")
                    .originatorPostalCode("originator_postal_code")
                    .originatorStateOrProvince("originator_state_or_province")
                    .originatorStreetAddress("originator_street_address")
                    .paymentRelatedInformation("payment_related_information")
                    .paymentRelatedInformation2("payment_related_information2")
                    .receiverCity("receiver_city")
                    .receiverCountry("receiver_country")
                    .receiverIdentificationNumber("receiver_identification_number")
                    .receiverPostalCode("receiver_postal_code")
                    .receiverStateOrProvince("receiver_state_or_province")
                    .receiverStreetAddress("receiver_street_address")
                    .receivingCompanyOrIndividualName("receiving_company_or_individual_name")
                    .receivingDepositoryFinancialInstitutionCountry(
                        "receiving_depository_financial_institution_country"
                    )
                    .receivingDepositoryFinancialInstitutionId(
                        "receiving_depository_financial_institution_id"
                    )
                    .receivingDepositoryFinancialInstitutionIdQualifier(
                        InboundAchTransfer.InternationalAddenda
                            .ReceivingDepositoryFinancialInstitutionIdQualifier
                            .NATIONAL_CLEARING_SYSTEM_NUMBER
                    )
                    .receivingDepositoryFinancialInstitutionName(
                        "receiving_depository_financial_institution_name"
                    )
                    .build()
            )
        assertThat(inboundAchTransfer.notificationOfChange())
            .isEqualTo(
                InboundAchTransfer.NotificationOfChange.builder()
                    .updatedAccountNumber("updated_account_number")
                    .updatedRoutingNumber("updated_routing_number")
                    .build()
            )
        assertThat(inboundAchTransfer.originatorCompanyDescriptiveDate()).isEqualTo("230401")
        assertThat(inboundAchTransfer.originatorCompanyDiscretionaryData()).isEqualTo("WEB AUTOPAY")
        assertThat(inboundAchTransfer.originatorCompanyEntryDescription()).isEqualTo("INVOICE 2468")
        assertThat(inboundAchTransfer.originatorCompanyId()).isEqualTo("0987654321")
        assertThat(inboundAchTransfer.originatorCompanyName()).isEqualTo("PAYROLL COMPANY")
        assertThat(inboundAchTransfer.originatorRoutingNumber()).isEqualTo("101050001")
        assertThat(inboundAchTransfer.receiverIdNumber()).isNull()
        assertThat(inboundAchTransfer.receiverName()).isEqualTo("Ian Crease")
        assertThat(inboundAchTransfer.standardEntryClassCode())
            .isEqualTo(InboundAchTransfer.StandardEntryClassCode.CORPORATE_CREDIT_OR_DEBIT)
        assertThat(inboundAchTransfer.status()).isEqualTo(InboundAchTransfer.Status.PENDING)
        assertThat(inboundAchTransfer.traceNumber()).isEqualTo("021000038461022")
        assertThat(inboundAchTransfer.transferReturn())
            .isEqualTo(
                InboundAchTransfer.TransferReturn.builder()
                    .reason(InboundAchTransfer.TransferReturn.Reason.INSUFFICIENT_FUNDS)
                    .returnedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .transactionId("transaction_id")
                    .build()
            )
        assertThat(inboundAchTransfer.type())
            .isEqualTo(InboundAchTransfer.Type.INBOUND_ACH_TRANSFER)
    }
}
