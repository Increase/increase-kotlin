// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.simulations.achtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AchTransferAcknowledgeParamsTest {

    @Test
    fun create() {
        AchTransferAcknowledgeParams.builder()
            .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            AchTransferAcknowledgeParams.builder()
                .achTransferId("ach_transfer_uoxatyh3lt5evrsdvo7q")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("ach_transfer_uoxatyh3lt5evrsdvo7q")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
