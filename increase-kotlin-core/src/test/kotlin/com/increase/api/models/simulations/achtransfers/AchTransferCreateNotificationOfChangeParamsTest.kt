// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun create() {
        AchTransferCreateNotificationOfChangeParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .correctedAccountFunding(
                AchTransferCreateNotificationOfChangeParams.CorrectedAccountFunding.CHECKING
            )
            .correctedAccountNumber("x")
            .correctedIndividualId("x")
            .correctedRoutingNumber("123456789")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            AchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .correctedAccountFunding(
                    AchTransferCreateNotificationOfChangeParams.CorrectedAccountFunding.CHECKING
                )
                .correctedAccountNumber("x")
                .correctedIndividualId("x")
                .correctedRoutingNumber("123456789")
                .build()

        val body = params._body()

        assertThat(body.correctedAccountFunding())
            .isEqualTo(AchTransferCreateNotificationOfChangeParams.CorrectedAccountFunding.CHECKING)
        assertThat(body.correctedAccountNumber()).isEqualTo("x")
        assertThat(body.correctedIndividualId()).isEqualTo("x")
        assertThat(body.correctedRoutingNumber()).isEqualTo("123456789")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            AchTransferCreateNotificationOfChangeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        val body = params._body()
    }
}
