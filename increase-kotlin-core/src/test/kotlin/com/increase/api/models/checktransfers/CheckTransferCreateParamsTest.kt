// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.checktransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CheckTransferCreateParamsTest {

    @Test
    fun create() {
        CheckTransferCreateParams.builder()
            .accountId("account_in71c4amph0vgo2qllky")
            .amount(1000L)
            .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
            .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
            .physicalCheck(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .postalCode("10045")
                            .state("NY")
                            .line2("x")
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
                    .checkNumber("x")
                    .note("x")
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .signatureText("Ian Crease")
                    .build()
            )
            .requireApproval(true)
            .thirdParty(
                CheckTransferCreateParams.ThirdParty.builder()
                    .checkNumber("x")
                    .recipientName("x")
                    .build()
            )
            .build()
    }

    @Test
    fun body() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .physicalCheck(
                    CheckTransferCreateParams.PhysicalCheck.builder()
                        .mailingAddress(
                            CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                                .city("New York")
                                .line1("33 Liberty Street")
                                .postalCode("10045")
                                .state("NY")
                                .line2("x")
                                .build()
                        )
                        .memo("Check payment")
                        .recipientName("Ian Crease")
                        .checkNumber("x")
                        .note("x")
                        .returnAddress(
                            CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                                .city("x")
                                .line1("x")
                                .name("x")
                                .postalCode("x")
                                .state("x")
                                .line2("x")
                                .build()
                        )
                        .signatureText("Ian Crease")
                        .build()
                )
                .requireApproval(true)
                .thirdParty(
                    CheckTransferCreateParams.ThirdParty.builder()
                        .checkNumber("x")
                        .recipientName("x")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.fulfillmentMethod())
            .isEqualTo(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
        assertThat(body.physicalCheck())
            .isEqualTo(
                CheckTransferCreateParams.PhysicalCheck.builder()
                    .mailingAddress(
                        CheckTransferCreateParams.PhysicalCheck.MailingAddress.builder()
                            .city("New York")
                            .line1("33 Liberty Street")
                            .postalCode("10045")
                            .state("NY")
                            .line2("x")
                            .build()
                    )
                    .memo("Check payment")
                    .recipientName("Ian Crease")
                    .checkNumber("x")
                    .note("x")
                    .returnAddress(
                        CheckTransferCreateParams.PhysicalCheck.ReturnAddress.builder()
                            .city("x")
                            .line1("x")
                            .name("x")
                            .postalCode("x")
                            .state("x")
                            .line2("x")
                            .build()
                    )
                    .signatureText("Ian Crease")
                    .build()
            )
        assertThat(body.requireApproval()).isEqualTo(true)
        assertThat(body.thirdParty())
            .isEqualTo(
                CheckTransferCreateParams.ThirdParty.builder()
                    .checkNumber("x")
                    .recipientName("x")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            CheckTransferCreateParams.builder()
                .accountId("account_in71c4amph0vgo2qllky")
                .amount(1000L)
                .fulfillmentMethod(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
                .sourceAccountNumberId("account_number_v18nkfqm6afpsrvy82b2")
                .build()

        val body = params._body()

        assertThat(body.accountId()).isEqualTo("account_in71c4amph0vgo2qllky")
        assertThat(body.amount()).isEqualTo(1000L)
        assertThat(body.fulfillmentMethod())
            .isEqualTo(CheckTransferCreateParams.FulfillmentMethod.PHYSICAL_CHECK)
        assertThat(body.sourceAccountNumberId()).isEqualTo("account_number_v18nkfqm6afpsrvy82b2")
    }
}
