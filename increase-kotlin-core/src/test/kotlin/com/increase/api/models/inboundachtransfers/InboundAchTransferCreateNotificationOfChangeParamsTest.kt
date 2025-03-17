// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import kotlin.test.assertNotNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferCreateNotificationOfChangeParamsTest {

    @Test
    fun create() {
        InboundAchTransferCreateNotificationOfChangeParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
            .updatedAccountNumber("987654321")
            .updatedRoutingNumber("101050001")
            .build()
    }

    @Test
    fun body() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .updatedAccountNumber("987654321")
                .updatedRoutingNumber("101050001")
                .build()

        val body = params._body()

        assertNotNull(body)
        assertThat(body.updatedAccountNumber()).isEqualTo("987654321")
        assertThat(body.updatedRoutingNumber()).isEqualTo("101050001")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()

        val body = params._body()

        assertNotNull(body)
    }

    @Test
    fun getPathParam() {
        val params =
            InboundAchTransferCreateNotificationOfChangeParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .build()
        assertThat(params).isNotNull
        // path param "inboundAchTransferId"
        assertThat(params.getPathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        // out-of-bound path param
        assertThat(params.getPathParam(1)).isEqualTo("")
    }
}
