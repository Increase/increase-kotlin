// File generated from our OpenAPI spec by Stainless.

package com.increase.api.models.wiredrawdownrequests

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WireDrawdownRequestRetrieveParamsTest {

    @Test
    fun create() {
        WireDrawdownRequestRetrieveParams.builder()
            .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            WireDrawdownRequestRetrieveParams.builder()
                .wireDrawdownRequestId("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("wire_drawdown_request_q6lmocus3glo0lr2bfv3")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }
}
