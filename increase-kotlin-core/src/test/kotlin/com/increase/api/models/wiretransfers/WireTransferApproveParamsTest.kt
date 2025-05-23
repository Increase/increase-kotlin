// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiretransfers

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireTransferApproveParamsTest {

    @Test
    fun create() {
        WireTransferApproveParams.builder()
            .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WireTransferApproveParams.builder()
                .wireTransferId("wire_transfer_5akynk7dqsq25qwk9q2u")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("wire_transfer_5akynk7dqsq25qwk9q2u")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
