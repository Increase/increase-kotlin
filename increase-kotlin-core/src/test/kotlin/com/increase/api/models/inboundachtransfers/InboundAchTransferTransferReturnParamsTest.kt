// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.inboundachtransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class InboundAchTransferTransferReturnParamsTest {

    @Test
    fun create() {
        InboundAchTransferTransferReturnParams.builder()
            .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
            .reason(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .reason(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            InboundAchTransferTransferReturnParams.builder()
                .inboundAchTransferId("inbound_ach_transfer_tdrwqr3fq9gnnq49odev")
                .reason(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
                .build()

        val body = params._body()

        assertThat(body.reason())
            .isEqualTo(InboundAchTransferTransferReturnParams.Reason.PAYMENT_STOPPED)
    }
}
