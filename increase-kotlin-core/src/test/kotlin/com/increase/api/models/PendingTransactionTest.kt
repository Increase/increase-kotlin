// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models

import com.increase.api.core.JsonValue
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PendingTransactionTest {

    @Test
    fun createPendingTransaction() {
        val pendingTransaction =
            PendingTransaction.builder()
                .id("pending_transaction_k1sfetcau2qbvjbzgju4")
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(100L)
                .completedAt(null)
                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                .currency(PendingTransaction.Currency.CAD)
                .description("INVOICE 2468")
                .routeId("card_oubs0hwk5rn6knuecxg2")
                .routeType(PendingTransaction.RouteType.ACCOUNT_NUMBER)
                .source(
                    PendingTransaction.Source.builder()
                        .accountTransferInstruction(
                            PendingTransaction.Source.AccountTransferInstruction.builder()
                                .amount(100L)
                                .currency(
                                    PendingTransaction.Source.AccountTransferInstruction.Currency
                                        .CAD
                                )
                                .transferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                                .build()
                        )
                        .achTransferInstruction(
                            PendingTransaction.Source.AchTransferInstruction.builder()
                                .amount(100L)
                                .transferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                                .build()
                        )
                        .cardAuthorization(
                            PendingTransaction.Source.CardAuthorization.builder()
                                .id("card_authorization_6iqxap6ivd0fo5eu3i8x")
                                .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                                .amount(100L)
                                .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                                .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                                .digitalWalletTokenId(null)
                                .direction(
                                    PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                                )
                                .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .merchantAcceptorId("5665270011000168")
                                .merchantCategoryCode("5734")
                                .merchantCity("New York")
                                .merchantCountry("US")
                                .merchantDescriptor("AMAZON.COM")
                                .merchantPostalCode("10045")
                                .merchantState("NY")
                                .networkDetails(
                                    PendingTransaction.Source.CardAuthorization.NetworkDetails
                                        .builder()
                                        .category(
                                            PendingTransaction.Source.CardAuthorization
                                                .NetworkDetails
                                                .Category
                                                .VISA
                                        )
                                        .visa(
                                            PendingTransaction.Source.CardAuthorization
                                                .NetworkDetails
                                                .Visa
                                                .builder()
                                                .electronicCommerceIndicator(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .ElectronicCommerceIndicator
                                                        .MAIL_PHONE_ORDER
                                                )
                                                .pointOfServiceEntryMode(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .PointOfServiceEntryMode
                                                        .UNKNOWN
                                                )
                                                .standInProcessingReason(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .NetworkDetails
                                                        .Visa
                                                        .StandInProcessingReason
                                                        .ISSUER_ERROR
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .networkIdentifiers(
                                    PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                        .builder()
                                        .retrievalReferenceNumber("785867080153")
                                        .traceNumber("487941")
                                        .transactionId("627199945183184")
                                        .build()
                                )
                                .networkRiskScore(10L)
                                .pendingTransactionId(null)
                                .physicalCardId(null)
                                .presentmentAmount(100L)
                                .presentmentCurrency("USD")
                                .processingCategory(
                                    PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                        .ACCOUNT_FUNDING
                                )
                                .realTimeDecisionId(null)
                                .terminalId("RCN5VNXS")
                                .type(
                                    PendingTransaction.Source.CardAuthorization.Type
                                        .CARD_AUTHORIZATION
                                )
                                .verification(
                                    PendingTransaction.Source.CardAuthorization.Verification
                                        .builder()
                                        .cardVerificationCode(
                                            PendingTransaction.Source.CardAuthorization.Verification
                                                .CardVerificationCode
                                                .builder()
                                                .result(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .Verification
                                                        .CardVerificationCode
                                                        .Result
                                                        .NOT_CHECKED
                                                )
                                                .build()
                                        )
                                        .cardholderAddress(
                                            PendingTransaction.Source.CardAuthorization.Verification
                                                .CardholderAddress
                                                .builder()
                                                .actualLine1("33 Liberty Street")
                                                .actualPostalCode("94131")
                                                .providedLine1("33 Liberty Street")
                                                .providedPostalCode("94132")
                                                .result(
                                                    PendingTransaction.Source.CardAuthorization
                                                        .Verification
                                                        .CardholderAddress
                                                        .Result
                                                        .NOT_CHECKED
                                                )
                                                .build()
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
                        .checkDepositInstruction(
                            PendingTransaction.Source.CheckDepositInstruction.builder()
                                .amount(100L)
                                .backImageFileId("file_26khfk98mzfz90a11oqx")
                                .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                                .currency(
                                    PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                                )
                                .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                                .build()
                        )
                        .checkTransferInstruction(
                            PendingTransaction.Source.CheckTransferInstruction.builder()
                                .amount(100L)
                                .currency(
                                    PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                                )
                                .transferId("check_transfer_30b43acfu9vw8fyc4f5")
                                .build()
                        )
                        .inboundFundsHold(
                            PendingTransaction.Source.InboundFundsHold.builder()
                                .id("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                                .amount(100L)
                                .automaticallyReleasesAt(
                                    OffsetDateTime.parse("2020-01-31T23:59:59Z")
                                )
                                .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                                .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                                .heldTransactionId("transaction_uyrp7fld2ium70oa7oi")
                                .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                                .releasedAt(null)
                                .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                                .type(
                                    PendingTransaction.Source.InboundFundsHold.Type
                                        .INBOUND_FUNDS_HOLD
                                )
                                .build()
                        )
                        .other(JsonValue.from(mapOf<String, Any>()))
                        .realTimePaymentsTransferInstruction(
                            PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                                .amount(100L)
                                .transferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                                .build()
                        )
                        .wireTransferInstruction(
                            PendingTransaction.Source.WireTransferInstruction.builder()
                                .accountNumber("987654321")
                                .amount(100L)
                                .messageToRecipient("HELLO")
                                .routingNumber("101050001")
                                .transferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                                .build()
                        )
                        .build()
                )
                .status(PendingTransaction.Status.PENDING)
                .type(PendingTransaction.Type.PENDING_TRANSACTION)
                .build()
        assertThat(pendingTransaction).isNotNull
        assertThat(pendingTransaction.id()).isEqualTo("pending_transaction_k1sfetcau2qbvjbzgju4")
        assertThat(pendingTransaction.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(pendingTransaction.amount()).isEqualTo(100L)
        assertThat(pendingTransaction.completedAt()).isNull()
        assertThat(pendingTransaction.createdAt())
            .isEqualTo(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
        assertThat(pendingTransaction.currency()).isEqualTo(PendingTransaction.Currency.CAD)
        assertThat(pendingTransaction.description()).isEqualTo("INVOICE 2468")
        assertThat(pendingTransaction.routeId()).isEqualTo("card_oubs0hwk5rn6knuecxg2")
        assertThat(pendingTransaction.routeType())
            .isEqualTo(PendingTransaction.RouteType.ACCOUNT_NUMBER)
        assertThat(pendingTransaction.source())
            .isEqualTo(
                PendingTransaction.Source.builder()
                    .accountTransferInstruction(
                        PendingTransaction.Source.AccountTransferInstruction.builder()
                            .amount(100L)
                            .currency(
                                PendingTransaction.Source.AccountTransferInstruction.Currency.CAD
                            )
                            .transferId("account_transfer_7k9qe1ysdgqztnt63l7n")
                            .build()
                    )
                    .achTransferInstruction(
                        PendingTransaction.Source.AchTransferInstruction.builder()
                            .amount(100L)
                            .transferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                            .build()
                    )
                    .cardAuthorization(
                        PendingTransaction.Source.CardAuthorization.builder()
                            .id("card_authorization_6iqxap6ivd0fo5eu3i8x")
                            .actioner(PendingTransaction.Source.CardAuthorization.Actioner.USER)
                            .amount(100L)
                            .cardPaymentId("card_payment_nd3k2kacrqjli8482ave")
                            .currency(PendingTransaction.Source.CardAuthorization.Currency.CAD)
                            .digitalWalletTokenId(null)
                            .direction(
                                PendingTransaction.Source.CardAuthorization.Direction.SETTLEMENT
                            )
                            .expiresAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .merchantAcceptorId("5665270011000168")
                            .merchantCategoryCode("5734")
                            .merchantCity("New York")
                            .merchantCountry("US")
                            .merchantDescriptor("AMAZON.COM")
                            .merchantPostalCode("10045")
                            .merchantState("NY")
                            .networkDetails(
                                PendingTransaction.Source.CardAuthorization.NetworkDetails.builder()
                                    .category(
                                        PendingTransaction.Source.CardAuthorization.NetworkDetails
                                            .Category
                                            .VISA
                                    )
                                    .visa(
                                        PendingTransaction.Source.CardAuthorization.NetworkDetails
                                            .Visa
                                            .builder()
                                            .electronicCommerceIndicator(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .ElectronicCommerceIndicator
                                                    .MAIL_PHONE_ORDER
                                            )
                                            .pointOfServiceEntryMode(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .PointOfServiceEntryMode
                                                    .UNKNOWN
                                            )
                                            .standInProcessingReason(
                                                PendingTransaction.Source.CardAuthorization
                                                    .NetworkDetails
                                                    .Visa
                                                    .StandInProcessingReason
                                                    .ISSUER_ERROR
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .networkIdentifiers(
                                PendingTransaction.Source.CardAuthorization.NetworkIdentifiers
                                    .builder()
                                    .retrievalReferenceNumber("785867080153")
                                    .traceNumber("487941")
                                    .transactionId("627199945183184")
                                    .build()
                            )
                            .networkRiskScore(10L)
                            .pendingTransactionId(null)
                            .physicalCardId(null)
                            .presentmentAmount(100L)
                            .presentmentCurrency("USD")
                            .processingCategory(
                                PendingTransaction.Source.CardAuthorization.ProcessingCategory
                                    .ACCOUNT_FUNDING
                            )
                            .realTimeDecisionId(null)
                            .terminalId("RCN5VNXS")
                            .type(
                                PendingTransaction.Source.CardAuthorization.Type.CARD_AUTHORIZATION
                            )
                            .verification(
                                PendingTransaction.Source.CardAuthorization.Verification.builder()
                                    .cardVerificationCode(
                                        PendingTransaction.Source.CardAuthorization.Verification
                                            .CardVerificationCode
                                            .builder()
                                            .result(
                                                PendingTransaction.Source.CardAuthorization
                                                    .Verification
                                                    .CardVerificationCode
                                                    .Result
                                                    .NOT_CHECKED
                                            )
                                            .build()
                                    )
                                    .cardholderAddress(
                                        PendingTransaction.Source.CardAuthorization.Verification
                                            .CardholderAddress
                                            .builder()
                                            .actualLine1("33 Liberty Street")
                                            .actualPostalCode("94131")
                                            .providedLine1("33 Liberty Street")
                                            .providedPostalCode("94132")
                                            .result(
                                                PendingTransaction.Source.CardAuthorization
                                                    .Verification
                                                    .CardholderAddress
                                                    .Result
                                                    .NOT_CHECKED
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .category(PendingTransaction.Source.Category.ACCOUNT_TRANSFER_INSTRUCTION)
                    .checkDepositInstruction(
                        PendingTransaction.Source.CheckDepositInstruction.builder()
                            .amount(100L)
                            .backImageFileId("file_26khfk98mzfz90a11oqx")
                            .checkDepositId("check_deposit_f06n9gpg7sxn8t19lfc1")
                            .currency(
                                PendingTransaction.Source.CheckDepositInstruction.Currency.CAD
                            )
                            .frontImageFileId("file_makxrc67oh9l6sg7w9yc")
                            .build()
                    )
                    .checkTransferInstruction(
                        PendingTransaction.Source.CheckTransferInstruction.builder()
                            .amount(100L)
                            .currency(
                                PendingTransaction.Source.CheckTransferInstruction.Currency.CAD
                            )
                            .transferId("check_transfer_30b43acfu9vw8fyc4f5")
                            .build()
                    )
                    .inboundFundsHold(
                        PendingTransaction.Source.InboundFundsHold.builder()
                            .id("inbound_funds_hold_9vuasmywdo7xb3zt4071")
                            .amount(100L)
                            .automaticallyReleasesAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .createdAt(OffsetDateTime.parse("2020-01-31T23:59:59Z"))
                            .currency(PendingTransaction.Source.InboundFundsHold.Currency.CAD)
                            .heldTransactionId("transaction_uyrp7fld2ium70oa7oi")
                            .pendingTransactionId("pending_transaction_k1sfetcau2qbvjbzgju4")
                            .releasedAt(null)
                            .status(PendingTransaction.Source.InboundFundsHold.Status.HELD)
                            .type(
                                PendingTransaction.Source.InboundFundsHold.Type.INBOUND_FUNDS_HOLD
                            )
                            .build()
                    )
                    .other(JsonValue.from(mapOf<String, Any>()))
                    .realTimePaymentsTransferInstruction(
                        PendingTransaction.Source.RealTimePaymentsTransferInstruction.builder()
                            .amount(100L)
                            .transferId("real_time_payments_transfer_iyuhl5kdn7ssmup83mvq")
                            .build()
                    )
                    .wireTransferInstruction(
                        PendingTransaction.Source.WireTransferInstruction.builder()
                            .accountNumber("987654321")
                            .amount(100L)
                            .messageToRecipient("HELLO")
                            .routingNumber("101050001")
                            .transferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                            .build()
                    )
                    .build()
            )
        assertThat(pendingTransaction.status()).isEqualTo(PendingTransaction.Status.PENDING)
        assertThat(pendingTransaction.type()).isEqualTo(PendingTransaction.Type.PENDING_TRANSACTION)
    }
}
